---
layout: page
title: Modularization
hide_hero: true
permalink: /spec/modularization/
---

## Table of Contents

- [Table of Contents](#table-of-contents)
- [The Challenge](#the-challenge)
- [The Goal](#the-goal)
- [The Hub File](#the-hub-file)
- [Schema Domains (14 core + 5 OJP files)](#schema-domains-14-core--5-ojp-files)
- [OJP Schemas (5 files, 54 schemas)](#ojp-schemas-5-files-54-schemas)
- [Path Domains (24 files)](#path-domains-24-files)
- [How `$ref` Linking Works](#how-ref-linking-works)
- [Fare / Product Separation](#fare--product-separation)
- [Packages per Role — Summary Table](#packages-per-role--summary-table)
- [CI Pipeline Update](#ci-pipeline-update)
- [What Changes for Consumers?](#what-changes-for-consumers)
- [What Changes for Maintainers?](#what-changes-for-maintainers)

## The Challenge

The Online API spec is **one single 18,112-line YAML file** with 69 endpoints
and 546 schemas. Contributors must navigate the entire file to find what they
need.

Several pain points arise from this monolithic structure:

- **Merge conflicts** — parallel work on different domains collides in one file
- **Cognitive overload** — a fulfillment developer must scroll past 12,000 lines
  of unrelated schemas
- **Review friction** — every PR diff spans the entire monolith, obscuring the
  actual change
- **Onboarding** — new contributors can't find a starting point in 18K lines

## The Goal

Split the monolith into **domain-aligned modules** while:

- Keeping the spec **valid OpenAPI 3.0.3**
- Producing an **identical bundled output** for consumers
- Requiring **no changes** from API implementers
- Aligning with **existing tag structure** already in the spec

The structure breaks the monolith into **hub, paths, schemas, and components**,
making it easier to navigate and maintain.

![Domain Modularization](../../images/modularization/domain-aligned-modules.png)

## The Hub File

`OSDM-online-api.yml` is the **single entrypoint** — ~1,300 lines

Contains:

- `openapi`, `info`, `servers`, `tags`, `security`
- All `paths` as `$ref` pointers to `paths/*.yml`
- All `components/schemas` as `$ref` pointers to `schemas/*.yml`
- All `components/parameters`, `responses`, `securitySchemes` as `$ref` pointers

Consumers and tools always start here.

## Schema Domains (14 core + 5 OJP files)

| File              | Schemas | Domain                                       |
| ----------------- | ------- | -------------------------------------------- |
| `_common.yml`     | 92      | Problem, Price, Links, Currency, ...         |
| `place.yml`       | 55      | CoachLayout, PlaceAvailability, Compartment  |
| `offer.yml`       | 42      | Offer, Admission, Reservation, Ancillary     |
| `aftersales.yml`  | 38      | Refund, Exchange, Release, Cancel            |
| `booking.yml`     | 34      | Booking, BookedOffer, Split                  |
| `fulfillment.yml` | 32      | Fulfillment, Document, Security              |
| `trip.yml`        | 30      | Route, Section, TrainLink, TripAllocation    |
| `fare.yml`        | 24      | Fare, Zone, RegionalValidity, TravelValidity |
| `passenger.yml`   | 23      | Passenger, Purchaser, ReductionCard          |
| _+ 5 more_        | 70      | Complaint, Transport, Travel Account, ...    |

## OJP Schemas (5 files, 54 schemas)

Schemas originating from the **Open Journey Planner** standard:

| File                         | Schemas | Domain                                      |
| ---------------------------- | ------- | ------------------------------------------- |
| `ojp/trip.yml`               | 26      | Trip, TimedLeg, Board, Alight, DatedJourney |
| `ojp/_common.yml`            | 13      | Address, GeoPosition, Mode, ModeFilter      |
| `ojp/place.yml`              | 11      | Place, PlaceRef, PointOfInterest            |
| `ojp/product.yml`            | 2       | ProductCategory, ProductCategoryRef         |
| `ojp/continuous-service.yml` | 2       | ContinuousMode, ContinuousService           |

Separating OJP schemas clarifies the **boundary between OSDM and OJP** — these
types are consumed, not owned.

## Path Domains (24 files)

| File                 | Endpoints | Lifecycle Stage    |
| -------------------- | --------- | ------------------ |
| `trips.yml`          | 4         | Search & Discovery |
| `offers.yml`         | 4         | Offer & Selection  |
| `bookings.yml`       | 4         | Booking Management |
| `booked-offers.yml`  | 3         | Booking Management |
| `booking-parts.yml`  | 6         | Booking Management |
| `fulfillments.yml`   | 4         | Fulfillment        |
| `refund.yml`         | 3         | After-Sales        |
| `exchange.yml`       | 3         | After-Sales        |
| `availabilities.yml` | 5         | Search & Discovery |
| _+ 15 more_          | 33        | Various            |

---

## How `$ref` Linking Works

```yaml
# Hub (OSDM-online-api.yml)
paths:
  /trips:
    $ref: ./paths/trips.yml#/~1trips # ← path file

components:
  schemas:
    Trip:
      $ref: ./schemas/trip.yml#/Trip # ← schema file


# Schema files cross-reference each other:
# schemas/booking.yml → ./passenger.yml#/Passenger    (cross-domain)
# schemas/trip.yml    → ./_common.yml#/Price           (common types)
```

## Fare / Product Separation

The original `product.yml` (38 schemas) mixed two concerns — split into:

| `fare.yml` (24 schemas)              | `product.yml` (12 schemas)           |
| ------------------------------------ | ------------------------------------ |
| Fare, FareType, FareCombinationModel | Product, ProductType, ProductSummary |
| RegionalConstraint, RegionalValidity | ProductSearch/Response/Collection    |
| Zone, ZoneDefinition, ZoneCollection | ProductTag, ProductTagGroup          |
| TravelValidity, TrainValidity        | PromotionCodeCollection              |
| CarrierConstraint, LuggageConstraint |                                      |

**Why?** Fare schemas are referenced by offer, booking, aftersales, fulfillment,
and travel-account — a distinct dependency cluster. Product schemas serve the
catalog API.

## Packages per Role — Summary Table

| Package                         | Fare Provider |  Distributor  |   Retailer    |
| ------------------------------- | :-----------: | :-----------: | :-----------: |
| `_common`, `ojp/*`              | **mandatory** | **mandatory** | **mandatory** |
| `offer`, `booking`, `passenger` | **mandatory** | **mandatory** | **mandatory** |
| `fulfillment`                   | **mandatory** | **mandatory** | **mandatory** |
| `product`                       | **mandatory** | **mandatory** | **mandatory** |
| `trip`                          |   optional    | **mandatory** | **mandatory** |
| `fare`                          | **mandatory** | **mandatory** |     _n/a_     |
| `aftersales`                    | **mandatory** | **mandatory** |   optional    |
| `place`, `transportable`        |   optional    |   optional    |   optional    |
| `complaint`, `travel-account`   |     _n/a_     |   optional    |   optional    |

## CI Pipeline Update

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

## What Changes for Consumers?

**Nothing.**

- The bundled `.yml` file is the same format as before
- Swagger UI and Redoc render identically
- No API changes, no breaking changes
- Consumers never see the modular source files

The modularization is **purely an internal maintainability improvement**.

## What Changes for Maintainers?

| Before                      | After                                      |
| --------------------------- | ------------------------------------------ |
| Edit 1 file (18K lines)     | Edit the relevant domain file              |
| Merge conflicts on every PR | Conflicts only when same domain is touched |
| Full-file diffs in reviews  | Focused diffs on the changed domain        |
| Grep through 18K lines      | Open the domain file directly              |

New workflow:

1. Edit `schemas/booking.yml` or `paths/refund.yml`
2. Run `redocly bundle` to produce the bundled file
3. Run `redocly lint` to validate
4. CI does this automatically on push/PR
