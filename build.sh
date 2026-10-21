#!/usr/bin/env bash
# Compiles one version of the modular OSDM online API into a single bundled file.
#
#   ./build.sh VERSION [OUT_DIR]
#
#   VERSION   minor (3.9) or full (3.9.0) version to build; 3.9 and later only
#   OUT_DIR   where results are written (default: build)
#
# The sources for VERSION are looked up in this order, taking the first that
# holds an OSDM-online-api.yml hub whose info.version matches:
#   1. branch patches-osdm-vX.Y   (local, then origin/)
#   2. the current working tree
# Set REF to a git ref to look only there instead (REF=WORKTREE for the working tree).
# Branches are read with `git archive`; nothing is checked out.
#
# Within a source tree, specification/vX.Y/ is tried before specification/.
# The hub is bundled with `redocly bundle` into OSDM-online-api-vX.Y.Z.bundled.yml.
# The webhook spec, offline model and changelog are copied alongside, and the
# bundle and webhook files are linted with `redocly lint`.
# Set SKIP_LINT=1 to skip linting, LINT_FORMAT=github-actions for CI annotations.
set -euo pipefail

if [[ $# -lt 1 || "$1" == -h || "$1" == --help ]]; then
  sed -n '2,/^set -/p' "$0" | sed '$d; s/^# \{0,1\}//'
  exit 1
fi

VERSION="$1"
OUT_DIR="${2:-build}"
if [[ ! "$VERSION" =~ ^[0-9]+\.[0-9]+(\.[0-9]+)?$ ]]; then
  echo "error: VERSION must look like 3.9 or 3.9.0, got '$VERSION'" >&2
  exit 1
fi
MINOR="$(cut -d. -f1,2 <<<"$VERSION")"
if (( ${MINOR%%.*} < 3 || (${MINOR%%.*} == 3 && ${MINOR##*.} < 9) )); then
  echo "error: only the modular OSDM 3.9 and later can be built, got '$VERSION'" >&2
  exit 1
fi
FULL=0
[[ "$VERSION" == "$MINOR" ]] || FULL=1

if command -v redocly >/dev/null 2>&1; then
  REDOCLY=(redocly)
else
  REDOCLY=(npx --yes @redocly/cli@latest)
fi

# Prints info.version of an OpenAPI file.
spec_version() {
  awk '/^info:/ {in_info=1; next} in_info && /^  version:/ {print $2; exit}' "$1" | tr -d "'\""
}

version_matches() {
  if [[ $FULL == 1 ]]; then [[ "$1" == "$VERSION" ]]; else [[ "$1" == "$MINOR".* ]]; fi
}

# Succeeds and sets SRC if $1 holds a hub whose version matches.
resolve_dir() {
  [[ -f "$1/OSDM-online-api.yml" ]] || return 1
  version_matches "$(spec_version "$1/OSDM-online-api.yml")" || return 1
  SRC="$1"
}

TMP="$(mktemp -d)"
trap 'rm -rf "$TMP"' EXIT

SRC=""; FOUND_IN=""
if [[ -n "${REF:-}" ]]; then candidates=("$REF"); else
  candidates=("patches-osdm-v$MINOR" "origin/patches-osdm-v$MINOR" WORKTREE)
fi
for ref in "${candidates[@]}"; do
  if [[ "$ref" == WORKTREE ]]; then
    tree="."
  else
    git rev-parse --verify --quiet "$ref^{commit}" >/dev/null || continue
    tree="$TMP/${ref//\//_}"
    mkdir -p "$tree"
    git archive "$ref" specification | tar -x -C "$tree"
  fi
  if resolve_dir "$tree/specification/v$MINOR" || resolve_dir "$tree/specification"; then
    FOUND_IN="$ref"; break
  fi
done

if [[ -z "$SRC" ]]; then
  echo "error: no OSDM-online-api.yml for $VERSION found in: ${candidates[*]}" >&2
  exit 1
fi
echo "==> OSDM $VERSION: sources in $FOUND_IN ($SRC)"

mkdir -p "$OUT_DIR"
api_version="$(spec_version "$SRC/OSDM-online-api.yml")"
built=("$OUT_DIR/OSDM-online-api-v$api_version.bundled.yml")
"${REDOCLY[@]}" bundle "$SRC/OSDM-online-api.yml" --output "${built[0]}"

for f in "$SRC"/OSDM-online-webhook*.yml; do
  [[ -e "$f" ]] || continue
  dest="$OUT_DIR/OSDM-online-webhook-v$(spec_version "$f").yml"
  cp "$f" "$dest"; built+=("$dest")
done
for f in "$SRC"/OSDM-offline-model*.json; do
  [[ -e "$f" ]] && cp "$f" "$OUT_DIR/OSDM-offline-model-v$api_version.json"
done
for f in "$SRC"/Changelog-*.md; do
  [[ -e "$f" ]] && cp "$f" "$OUT_DIR/"
done

if [[ "${SKIP_LINT:-0}" != 1 ]]; then
  for f in "${built[@]}"; do
    echo "==> lint $f"
    "${REDOCLY[@]}" lint --format "${LINT_FORMAT:-codeframe}" "$f"
  done
fi

echo "==> done; output in $OUT_DIR:"
ls -1 "$OUT_DIR"
