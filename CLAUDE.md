# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What This Repository Is

The **Open Sales and Distribution Model (OSDM)** is an open-source rail distribution API specification maintained by UIC (Union Internationale des Chemins de fer). It is also formally published as **IRS-90918-10 UIC Leaflet** — meaning it carries the weight of an official UIC standard, not just a community spec. Breaking changes require formal process considerations.

The repository contains OpenAPI specifications, an offline data model (JSON Schema), WireMock-based mock infrastructure, and versioned changelogs.

The published documentation lives at https://osdm.io/ (served from the `gh-pages` branch, which is **separate from `master`** — spec changes on `master` do not auto-publish to the site).

## Building / Validation

Tooling is Redocly CLI (OpenAPI bundling and linting) driven by [build.sh](build.sh):

```bash
# Install once (build.sh falls back to npx if redocly is not installed globally)
npm i -g @redocly/cli@latest

# Compile one version: bundle the modular spec, copy webhook/offline model/changelog, lint
./build.sh 3.9            # minor (any 3.9.x) or full (3.9.0) version; output goes to build/ (git-ignored)
./build.sh 3.9.0 out/     # custom output directory
SKIP_LINT=1 ./build.sh 3.9

# Lint the sources only
redocly lint specification/OSDM-online-api.yml
```

`build.sh` supports only the modular versions, **3.9 and later**. It looks for the sources in the branch `patches-osdm-vX.Y` first (via `git archive`, nothing is checked out), then in the working tree, and matches on `info.version` of `OSDM-online-api.yml`. `REF=<git-ref>` or `REF=WORKTREE` restricts the lookup, and `LINT_FORMAT=github-actions` switches the lint output for CI. Note that `patches-osdm-v3.9` has no hub file, so `./build.sh 3.9` currently builds from `master`.

### GitHub workflows

- [create-openapi.yml](.github/workflows/create-openapi.yml) — push/PR to `master` and manual: runs `build.sh` on the hub's version and uploads `build/` as an artifact.
- [release-openapi.yml](.github/workflows/release-openapi.yml) — push of a `v3.*`/`v4.*`+ tag: builds `build.sh <tag without v>` and creates a GitHub Release with `build/` attached. The tag must match `info.version` in the hub. To release, bump `info.version`, merge, then tag and push.
- [typos.yml](.github/workflows/typos.yml) — spell check (allowed words in `typos.toml`).

Nothing publishes to `gh-pages`; that is manual. See the README for details.

Known intentional lint suppressions are tracked in [.redocly.lint-ignore.yaml](.redocly.lint-ignore.yaml) (currently empty apart from its header).

## Mock Server

```bash
cd mock
./startMock.sh      # starts WireMock on https://localhost:8080
./runQueries.sh     # runs sample queries against the mock
```

WireMock request/response mappings are in `mock/mappings/`, static response bodies in `mock/__files/`. Postman collections and environments are also in `mock/` for interactive testing.

## Specification Architecture

`master` holds the unversioned development line in `specification/`; each released minor version also has a `patches-osdm-vX.Y` branch (older ones keep `specification/vX.Y/`). The version is in `info.version`, not in the directory name.

| File | Purpose |
|---|---|
| `OSDM-online-api.yml` | Hub of the OpenAPI 3.0.3 REST API spec (assembled from the modular files) |
| `OSDM-online-webhook.yml` | Webhook/event spec for async notifications (standalone, OpenAPI 3.1.0) |
| `OSDM-offline-model.json` | JSON Schema for the offline (batch/tariff) data model (standalone) |
| `Changelog-X.Y.Z.md` | Human-readable changelog (on the patches branches) |

**Versions:** 3.8 and earlier are monolithic single-file specs (`specification/v3.8/OSDM-online-api-v3.8.0.yml` on `patches-osdm-v3.8` and `gh-pages`). **3.9 is the first modular version.** `dev-osdm-v4` holds the v4 draft. `build.sh` only builds 3.9 and later.

### Modular structure

```
specification/
  OSDM-online-api.yml           # Hub: info, servers, and $refs for every path and component (~1300 lines)
  OSDM-online-webhook.yml
  OSDM-offline-model.json
  paths/                        # 24 files, one per API domain
  schemas/                      # 14 files, one per schema domain
    _common.yml                 # Shared types (Problem, Price, Links, etc.)
    fare.yml                    # Fare, Zone, RegionalValidity, TravelValidity, ...
    product.yml                 # Product, ProductType, ProductTag, ...
    transportable.yml           # Vehicle, Car, Motorcycle, ...
    trip.yml, offer.yml, booking.yml, ...
    ojp/                        # 5 files — schemas provided by OJP (trip, place, product, ...)
  components/                   # parameters, responses, security schemes
```

- The hub file assembles everything via `$ref` pointers, e.g. `/places: $ref: ./paths/places.yml#/~1places` and `Price: $ref: ./schemas/_common.yml#/Price`
- `redocly bundle` (run by `build.sh`) produces a single-file output for consumers
- Schema files use relative cross-file `$ref` (e.g. `./_common.yml#/Price`)
- Path files reference schemas via `../OSDM-online-api.yml#/components/schemas/X`
- `paths/trips.yml` holds the endpoints; the OJP data types they use are in `schemas/ojp/trip.yml`, with OSDM-specific trip types in `schemas/trip.yml`
- See `docs/modularization.md` for full rationale and diagrams

## Domain Model Overview

The spec defines three roles:

| Role | Responsibility |
|---|---|
| **Fare Provider** | Publishes fare rules to distributors via the Offline Model |
| **Distributor** | Combines fares, manages bookings, stock control, and security |
| **Retailer** | Sells tickets from one or more distributors to end customers |

The API has two operational modes:

- **Retailer Mode** — offers and books Admissions (tickets), Reservations, and Ancillaries.
- **Distributor Mode** — extends Retailer Mode with Priced Segments (fares).

Key booking lifecycle: **Trip Search → Offer Search → Offer Selection → Booking → Fulfillment → After-sales (refund/exchange)**

Core resource types in the Online API: `trips`, `offers`, `bookedOffers`, `fulfillments`, `locations`, `places`. The Offline Model carries tariff zone data, fare networks, and product definitions exchanged in batch (via bilateral file transfer or AMQP 1.0 queues).

### Deep-dive topics (documented on osdm.io)
Product construction from fares, reservations, accessibility (PRM), on-demand services, account-based ticketing, wallet fulfillment, and sync protocols.

## Adding a New Spec Version

1. Set `info.version` in `specification/OSDM-online-api.yml` (and the webhook spec) to the new version.
2. Add a `Changelog-X.Y.Z.md`.
3. Run `./build.sh X.Y` and fix any errors; add lint-ignore entries to `.redocly.lint-ignore.yaml` only for intentional findings.
4. Add WireMock mappings to `mock/mappings/` and update Postman collections if the mock needs updating.
5. After release, create the `patches-osdm-vX.Y` branch for fixes to that version and tag `vX.Y.Z` to trigger the release workflow.
6. Publishing to osdm.io is a separate, manual step on `gh-pages`.
