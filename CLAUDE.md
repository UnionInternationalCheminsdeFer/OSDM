# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What This Repository Is

The **Open Sales and Distribution Model (OSDM)** is an open-source rail distribution API specification maintained by UIC (Union Internationale des Chemins de fer). It is also formally published as **IRS-90918-10 UIC Leaflet** — meaning it carries the weight of an official UIC standard, not just a community spec. Breaking changes require formal process considerations.

The repository contains OpenAPI specifications, an offline data model (JSON Schema), WireMock-based mock infrastructure, and versioned changelogs.

The published documentation lives at https://osdm.io/ (served from the `gh-pages` branch, which is **separate from `master`** — spec changes on `master` do not auto-publish to the site).

## Validation / Linting

The only automated tooling is Redocly CLI for OpenAPI validation:

```bash
# Install once
npm i -g @redocly/cli@latest

# Lint all specs (mirrors CI)
redocly lint --format=github-actions specification/**/*.yml

# Lint a single spec
redocly lint specification/v3.8/OSDM-online-api-v3.8.0.yml

# Bundle v3.9 modular spec into single file
redocly bundle specification/v3.9/OSDM-online-api.yml --output specification/v3.9/OSDM-online-api-v3.9.0.bundled.yml
```

CI runs on push/PR to `master` via [.github/workflows/validate-openapi.yml](.github/workflows/validate-openapi.yml).

Known intentional lint suppressions (unused components, webhook server URLs, etc.) are tracked in [.redocly.lint-ignore.yaml](.redocly.lint-ignore.yaml). When adding a new spec version, replicate the relevant ignore entries for that version.

## Mock Server

```bash
cd mock
./startMock.sh      # starts WireMock on https://localhost:8080
./runQueries.sh     # runs sample queries against the mock
```

WireMock request/response mappings are in `mock/mappings/`, static response bodies in `mock/__files/`. Postman collections and environments are also in `mock/` for interactive testing.

## Specification Architecture

Each version lives in its own directory under `specification/`:

| File pattern | Purpose |
|---|---|
| `OSDM-online-api-vX.Y.Z.yml` | Main OpenAPI 3.0.3 REST API spec |
| `OSDM-online-webhook-vX.Y.Z.yml` | Webhook/event spec for async notifications |
| `OSDM-offline-model-vX.Y.Z.json` | JSON Schema for the offline (batch/tariff) data model |
| `Changelog-vX.Y.Z.md` | Human-readable changelog for that version |

**Versioning convention:** Minor/patch versions share a directory (e.g. `v3.8/` holds `v3.8.0`). Major series prior to v3 use `v1.4.0/` and `v2.0.0/` directories.

**Current active versions:**
- `v3.8/` — latest stable (monolithic single-file spec)
- `v3.9/` — modularized multi-file structure (see below)
- `v4.0/` — draft/future

### v3.9 Modular Structure

Starting with v3.9, the Online API spec is split into modular files:

```
specification/v3.9/
  OSDM-online-api.yml          # Root hub (entrypoint, ~150 lines)
  paths/                        # 24 files, one per API domain
  schemas/                      # 15 files, one per schema domain
    _common.yml                 # Shared types (Problem, Price, Links, etc.)
    fare.yml                    # Fare, Zone, RegionalValidity, TravelValidity, ...
    product.yml                 # Product, ProductType, ProductTag, ...
    transportable.yml           # Vehicle, Car, Motorcycle, ...
    trip.yml, offer.yml, booking.yml, ...
    ojp/                        # 5 files — schemas provided by OJP
      _common.yml, trip.yml, place.yml, product.yml, continuous-service.yml
  components/                   # parameters, responses, security schemes
```

- The hub file assembles everything via `$ref` pointers
- `redocly bundle` produces a single-file output for consumers
- Schema files use relative cross-file `$ref` (e.g. `./_common.yml#/Price`)
- Path files reference schemas via `../OSDM-online-api.yml#/components/schemas/X`
- See `specification/v3.9/modularization.md` for full rationale and diagrams

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

1. Create `specification/vX.Y/` directory.
2. Copy the prior version's `.yml` files as a starting point.
3. Add a `Changelog-vX.Y.Z.md`.
4. Add lint-ignore entries for the new files in `.redocly.lint-ignore.yaml` if needed (mirror the pattern from previous versions).
5. Add WireMock mappings to `mock/mappings/` and update Postman collections if the mock needs updating.
