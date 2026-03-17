---
marp: true
theme: default
paginate: true
title: OSDM v3.9 Specification Modularization
---

# OSDM v3.9 Specification Modularization

**Splitting 18,000 lines into manageable modules**

OSDM Working Group
March 2026

---

# The Problem

The Online API spec is a **single 18,112-line YAML file**

| Metric | Count |
|--------|-------|
| Endpoints | 69 |
| Schemas | 494 |
| Internal `$ref` links | ~1,230 |
| Responses | 15 |
| Parameters | 8 |

Contributors must navigate the entire file to find what they need.

---

# Pain Points

- **Merge conflicts** — parallel work on different domains collides in one file
- **Cognitive overload** — a fulfillment developer must scroll past 12,000 lines of unrelated schemas
- **Review friction** — every PR diff spans the entire monolith, obscuring the actual change
- **Onboarding** — new contributors can't find a starting point in 18K lines

---

# The Goal

Split the monolith into **domain-aligned modules** while:

- Keeping the spec **valid OpenAPI 3.0.3**
- Producing an **identical bundled output** for consumers
- Requiring **no changes** from API implementers
- Aligning with **existing tag structure** already in the spec

---

# Proposed Structure

```
specification/v3.9/
  OSDM-online-api.yml        ← hub/entrypoint (~150 lines)

  paths/                      ← 24 files (one per domain)
    trips.yml, offers.yml, bookings.yml, fulfillments.yml,
    refund.yml, exchange.yml, ...

  schemas/                    ← 13 files (one per domain)
    _common.yml, trip.yml, offer.yml, booking.yml,
    fulfillment.yml, aftersales.yml, place.yml, ...

  components/                 ← 3 files
    parameters.yml, responses.yml, security-schemes.yml
```

---

# The Hub File

`OSDM-online-api.yml` is the **single entrypoint** — only ~150 lines

Contains:
- `openapi`, `info`, `servers`, `tags`, `security`
- All `paths` as `$ref` pointers to `paths/*.yml`
- All `components/schemas` as `$ref` pointers to `schemas/*.yml`
- All `components/parameters`, `responses`, `securitySchemes` as `$ref` pointers

Consumers and tools always start here.

---

# Schema Domains (13 files)

| File | Schemas | Domain |
|------|---------|--------|
| `_common.yml` | ~105 | Problem, Price, Links, Currency, ... |
| `place.yml` | ~66 | Place, Coach, Layout, Availability |
| `trip.yml` | ~56 | Trip, Leg, Stop, Route, Journey |
| `offer.yml` | ~42 | Offer, Admission, Reservation, Ancillary |
| `aftersales.yml` | ~38 | Refund, Exchange, Release, Cancel |
| `product.yml` | ~38 | Product, Fare, Zone, Validity |
| `booking.yml` | ~34 | Booking, BookedOffer, Split |
| `fulfillment.yml` | ~32 | Fulfillment, Document, Security |
| `passenger.yml` | ~23 | Passenger, Purchaser, Reduction |
| _+ 4 more_ | ~44 | Complaint, Travel Account, Transport, ... |

---

# Path Domains (24 files)

| File | Endpoints | Lifecycle Stage |
|------|-----------|-----------------|
| `trips.yml` | 4 | Search & Discovery |
| `offers.yml` | 4 | Offer & Selection |
| `bookings.yml` | 4 | Booking Management |
| `booked-offers.yml` | 3 | Booking Management |
| `booking-parts.yml` | 6 | Booking Management |
| `fulfillments.yml` | 4 | Fulfillment |
| `refund.yml` | 3 | After-Sales |
| `exchange.yml` | 3 | After-Sales |
| `availabilities.yml` | 5 | Search & Discovery |
| _+ 15 more_ | 33 | Various |

---

# How `$ref` Linking Works

```
Hub (OSDM-online-api.yml)
  paths:
    /trips:
      $ref: ./paths/trips.yml#/~1trips       ← path file

  components/schemas:
    Trip:
      $ref: ./schemas/trip.yml#/Trip          ← schema file

Schema files cross-reference each other:
  schemas/booking.yml:
    Booking.passengers:
      $ref: ./passenger.yml#/Passenger        ← cross-domain

  schemas/trip.yml:
    Trip.price:
      $ref: ./_common.yml#/Price              ← common types
```

---

# Schema Dependency Graph

```
                    ┌─────────────┐
                    │ _common.yml │  (Price, Problem, Links, ...)
                    └──────┬──────┘
          ┌────────────────┼────────────────┐
          ▼                ▼                ▼
    ┌──────────┐    ┌──────────┐    ┌──────────────┐
    │ trip.yml │    │place.yml │    │passenger.yml │
    └────┬─────┘    └────┬─────┘    └──────┬───────┘
         ▼               ▼                 ▼
    ┌──────────┐    ┌──────────────┐  ┌──────────┐
    │offer.yml │◄───│product.yml   │  │          │
    └────┬─────┘    └──────────────┘  │          │
         ▼                            ▼          │
    ┌───────────┐              ┌──────────────┐  │
    │booking.yml│◄─────────────│              │◄─┘
    └────┬──────┘              │fulfillment   │
         ▼                     │    .yml      │
    ┌───────────────┐          └──────┬───────┘
    │aftersales.yml │◄────────────────┘
    └───────────────┘
```

---

# Build Pipeline

```
  ┌──────────────────────────┐
  │  Modular source files    │   ← maintainers edit here
  │  (~40 YAML files)        │
  └────────────┬─────────────┘
               ▼
  ┌──────────────────────────┐
  │  redocly bundle          │   ← resolves all $ref
  └────────────┬─────────────┘
               ▼
  ┌──────────────────────────┐
  │  Bundled single file     │   ← consumers use this
  │  (v3.9.0.bundled.yml)    │
  └────────────┬─────────────┘
               ▼
  ┌──────────────────────────┐
  │  redocly lint            │   ← validates OpenAPI 3.0.3
  └──────────────────────────┘
```

---

# Verification Results

| Check | Result |
|-------|--------|
| `redocly bundle` | Succeeds |
| `redocly lint` | Valid, 11 warnings (same as v3.8) |
| Paths count | 69 = 69 |
| Schemas count | 494 = 494 |
| Responses count | 15 = 15 |
| Parameters count | 8 = 8 |

The bundled output is **structurally equivalent** to v3.8.

---

# What Changes for Consumers?

**Nothing.**

- The bundled `.yml` file is the same format as before
- Swagger UI and Redoc render identically
- No API changes, no breaking changes
- Consumers never see the modular source files

The modularization is **purely an internal maintainability improvement**.

---

# What Changes for Maintainers?

| Before | After |
|--------|-------|
| Edit 1 file (18K lines) | Edit the relevant domain file (~200-600 lines) |
| Merge conflicts on every PR | Conflicts only when same domain is touched |
| Full-file diffs in reviews | Focused diffs on the changed domain |
| Grep through 18K lines | Open the domain file directly |

New workflow:
1. Edit `schemas/booking.yml` or `paths/refund.yml`
2. Run `redocly bundle` to produce the bundled file
3. Run `redocly lint` to validate
4. CI does this automatically on push/PR

---

# CI Pipeline Update

```yaml
# .github/workflows/validate-openapi.yml
steps:
  - name: Bundle modular v3.9 spec
    run: >
      redocly bundle
        specification/v3.9/OSDM-online-api.yml
        --output specification/v3.9/OSDM-online-api-v3.9.0.bundled.yml

  - name: Validate OpenAPI documents
    run: >
      redocly lint --format=github-actions
        specification/**/*.yml
```

Prior versions (`v1.4` through `v3.8`) are **untouched** — no risk to existing specs.

---

# Summary

| | v3.8 (before) | v3.9 (after) |
|---|---|---|
| Files | 1 monolith | ~40 modular files |
| Largest file | 18,112 lines | ~600 lines |
| Domain isolation | None | Full |
| Consumer impact | — | None |
| Tooling | `redocly lint` | `redocly bundle` + `lint` |
| Merge conflict risk | High | Low |

**Modularization script** (`split-spec.py`) is included and reproducible.
All prior versions remain untouched.

The spec is ready for collaborative, domain-focused development.
