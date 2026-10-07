# OSDM

The aims of the **Open Sales and Distribution Model (OSDM)** are twofold:

1. to substantially **simplify the booking process for customers** of rail trips
   and,
2. to **lower complexity and distribution costs** for distributors and railway
   carriers.

OSDM strengthens rail as a convenient and ecological means of transportation by
simplifying distribution. Finally, it lays a solid fundament which can be
extended to the distribution of other means of transportation.

The OSDM Online API and specification essentially consists of two parts:
**Offline Model** and **Online API**. The Online API works in two modes:
**Retailer Mode** and **Distributor Mode**. The Distributor Mode differs from
the Retailer Mode only in that additionally to **Admissions (aka. Tickets)**,
**Reservations** or **Ancillaries** also **Priced segments (aka. Fares)** are
offered and can be booked.

The OSDM specification is Open Source and freely available to all parties
interested. The OSDM-Online API is modelled in `YAML`, fully supporting the
`REST paradigm`.

## Online Specification View

https://osdm.io/

The documentation is available in the `gh-pages` branch of this repository.

## Building the Specification

Since version 3.9 the Online API is maintained as a set of modular YAML files
that are compiled into a single self-contained OpenAPI document. Versions up to
3.8 are single-file specifications and need no build.

### Source layout

```
specification/
  OSDM-online-api.yml        # hub: info, servers, and $refs for every path and component
  OSDM-online-webhook.yml    # webhook spec (standalone, not bundled)
  OSDM-offline-model.json    # offline model (standalone, not bundled)
  paths/                     # one file per API domain (trips, offers, bookings, ...)
  schemas/                   # one file per schema domain; schemas/ojp/ holds schemas provided by OJP
  components/                # parameters, responses, security schemes
```

The hub assembles the API through `$ref` pointers, for example
`/places: $ref: ./paths/places.yml#/~1places` or
`Price: $ref: ./schemas/_common.yml#/Price`. Schema files reference each other
with relative refs (`./_common.yml#/Price`), and path files reference schemas
back through the hub (`../OSDM-online-api.yml#/components/schemas/X`).
`redocly bundle` follows all of these and inlines them, so the compiled file has
no external references. See [docs/modularization.md](docs/modularization.md) for
the rationale.

### Prerequisites

- Git and Bash
- Node.js with `npx`. The script uses a globally installed
  [Redocly CLI](https://redocly.com/docs/cli/) (`npm i -g @redocly/cli@latest`)
  if there is one, and otherwise runs it through `npx`.

### Building a version

```bash
./build.sh VERSION [OUT_DIR]
```

| Argument  | Meaning                                                                    |
| --------- | -------------------------------------------------------------------------- |
| `VERSION` | Minor (`3.9`) or full (`3.9.0`) version. Only 3.9 and later are supported. |
| `OUT_DIR` | Output directory, default `build/` (git-ignored).                          |

Examples:

```bash
./build.sh 3.9            # builds any 3.9.x
./build.sh 3.9.0          # builds exactly 3.9.0
./build.sh 3.10 out/      # writes to out/ instead of build/
SKIP_LINT=1 ./build.sh 3.9   # bundle without linting
```

### What the script does

1. **Finds the sources** for the requested version. It takes the first candidate
   that contains an `OSDM-online-api.yml` whose `info.version` matches (a minor
   version matches any patch release):
   1. the branch `patches-osdm-vX.Y`, local and then `origin/`, read with
      `git archive` (nothing is checked out)
   2. the current working tree

   Within a source tree it tries `specification/vX.Y/` before `specification/`.
   Set `REF=<git-ref>` to look only in one ref, or `REF=WORKTREE` for the
   working tree only.

2. **Bundles** the hub with `redocly bundle` into
   `OUT_DIR/OSDM-online-api-vX.Y.Z.bundled.yml`, named after the hub's
   `info.version`.
3. **Copies** the webhook spec (`OSDM-online-webhook-vX.Y.Z.yml`, named after
   its own `info.version`), the offline model (`OSDM-offline-model-vX.Y.Z.json`)
   and any `Changelog-*.md`.
4. **Lints** the bundle and the webhook spec with `redocly lint`, unless
   `SKIP_LINT=1` is set.

The script fails with a message if the version is below 3.9 or if no matching
source is found. For example, building `3.10` fails until `info.version` in the
hub has been bumped to `3.10.x`.

### Output

```
build/
  OSDM-online-api-v3.9.0.bundled.yml   # the compiled Online API, a single file for consumers
  OSDM-online-webhook-v3.8.0.yml
  OSDM-offline-model-v3.9.0.json
```

The webhook file carries the version from its own `info.version`, which can
differ from the API version.

### Validation only

To lint the sources without producing output files:

```bash
redocly lint specification/OSDM-online-api.yml
```

CI ([create-openapi.yml](.github/workflows/create-openapi.yml)) runs `build.sh` and
lints the result on every push and pull request to `master`. Known, intentional
lint suppressions are listed in
[.redocly.lint-ignore.yaml](.redocly.lint-ignore.yaml).

### Publishing

A build does not publish anything. The site at https://osdm.io/ is served from
the `gh-pages` branch, which is separate from `master`, so a change to the
specification on `master` does not appear there until the files are added to
`gh-pages`.

## GitHub Workflows

An illustrated description with diagrams is in [docs/github-workflows.md](docs/github-workflows.md).

The workflows live in [.github/workflows/](.github/workflows/). The first two checks run automatically on
changes to the specification.

| Workflow | File | Triggers | Purpose |
|---|---|---|---|
| Create OpenAPI Documents | [create-openapi.yml](.github/workflows/create-openapi.yml) | push and pull request to `master`, manual | Build the specification with `build.sh`, lint it and upload the result |
| Release OpenAPI Documents | [release-openapi.yml](.github/workflows/release-openapi.yml) | push of a tag `v3.*` or `v4.*` and later | Build the tagged version and publish it as a GitHub Release |
| Check for typos | [typos.yml](.github/workflows/typos.yml) | push to `master`, pull request opened or updated, manual, `repository_dispatch` | Spell-check the repository |

### Create OpenAPI Documents

Runs on Ubuntu with the latest Node.js and a global `@redocly/cli`. It also runs on demand from the Actions tab,
where an optional `version` can be entered. It then:

1. reads the version from `info.version` in `specification/OSDM-online-api.yml`, unless one was entered
2. runs `./build.sh <version>` with `REF=WORKTREE`, so it builds the checked-out sources, and `LINT_FORMAT=github-actions`,
   so lint findings appear as annotations on the PR
3. uploads the contents of `build/` as the workflow artifact `osdm-<version>`

The artifact holds the compiled bundle, the webhook spec, the offline model and the changelog, and can be downloaded
from the workflow run. It is kept for the repository's default artifact retention period and is not committed or published.
Lint errors fail the check. Intentional suppressions are kept in [.redocly.lint-ignore.yaml](.redocly.lint-ignore.yaml).

The CI build is the same as running `./build.sh 3.9` locally (see [Building the Specification](#building-the-specification)).

### Release OpenAPI Documents

Runs when a version tag such as `v3.9.1` is pushed. It builds the tagged commit with `./build.sh 3.9.1` (the tag
without the leading `v`), using the checked-out sources and the same lint step as above, and then creates a GitHub
Release named `OSDM 3.9.1` with the contents of `build/` attached and generated release notes. A tag containing a
hyphen, such as `v3.10.0-rc1`, is marked as a pre-release.

The build is strict about versions: the number in the tag must match `info.version` in `specification/OSDM-online-api.yml`
at the tagged commit, so bump the version before tagging. If it does not match, or the lint fails, no release is created.
Only 3.9 and later can be built, so older tags such as `v3.8.1` fail here. The workflow needs no extra secret; it uses the
built-in `GITHUB_TOKEN` with `contents: write`.

To cut a release:

```bash
# 1. set info.version in specification/OSDM-online-api.yml to 3.9.1 and merge it to master
git tag v3.9.1
git push origin v3.9.1
```

### Check for typos

Runs [crate-ci/typos](https://github.com/crate-ci/typos) over the repository. It can also be started manually from the
Actions tab. Words that are correct but flagged are allowed in [typos.toml](typos.toml). To check locally, install
`typos` and run it from the repository root.

### Workflows on other branches

Each branch has its own workflow files. `patches-osdm-vX.Y` branches carry their own copy of the validation workflow,
and `gh-pages` has a separate `jekyll.yml` that builds and deploys the osdm.io site when `gh-pages` is pushed.
