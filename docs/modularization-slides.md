# OSDM v3.9 Specification Modularization

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

```mermaid
graph LR


    subgraph "v3.9 — Modular"
        HUB["OSDM-online-api.yml<br/>~1,300 lines · hub/entrypoint"]
        P["paths/<br/>24 files"]
        S["schemas/<br/>14 + 5 OJP files"]
        C["components/<br/>3 files"]
        HUB --> P
        HUB --> S
        HUB --> C
    end

    HUB -.->|"redocly bundle"| BUNDLED["OSDM-online-api-v3.9.0.bundled.yml<br/>(single file for consumers)"]
```

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

## Booking Lifecycle — API Flow

```mermaid
sequenceDiagram
    actor R as Retailer
    participant D as Distributor
    participant F as Fare Provider

    rect rgb(232, 244, 253)
    note over R,D: Search & Discovery
    R->>D: POST /trips (origin, destination, date)
    D-->>R: TripCollectionResponse (Trip[])
    R->>D: GET /places?name=...
    D-->>R: PlaceRef[]
    end

    rect rgb(232, 245, 233)
    note over R,F: Offer
    R->>D: POST /offers (tripId, passengers)
    D->>F: POST /offers (delegated)
    F-->>D: OfferCollectionResponse (with Fares)
    D-->>R: OfferCollectionResponse (no Fares in retailer mode)
    end

    rect rgb(255, 243, 224)
    note over R,D: Booking
    R->>D: POST /bookings (selectedOffers)
    D-->>R: BookingResponse (bookingId)
    R->>D: PATCH /bookings/{id}/passengers
    D-->>R: PassengerResponse
    R->>D: PUT /bookings/{id}/purchaser
    D-->>R: PurchaserResponse
    end

    rect rgb(237, 231, 246)
    note over R,F: Fulfillment
    R->>D: POST /bookings/{id}/fulfillments
    D->>F: POST /fulfillments (delegated)
    F-->>D: FulfillmentResponse
    D-->>R: FulfillmentResponse (fulfillmentId)
    R->>D: GET /bookings/{id}/fulfillments/{fId}/documents
    D-->>R: Document[] (PDF, PKPass, ...)
    end

    rect rgb(252, 228, 236)
    note over R,F: After-Sales (optional for retailer)
    R->>D: POST /bookings/{id}/refund-offers
    D->>F: POST /refund-offers (delegated)
    F-->>D: RefundOfferCollectionResponse
    D-->>R: RefundOfferCollectionResponse
    R->>D: PATCH /bookings/{id}/refund-offers/{rId} (confirm)
    D->>F: PATCH /refund-offers/{rId} (confirm)
    F-->>D: RefundOfferResponse
    D-->>R: RefundOfferResponse
    end
```

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

---

## Build Pipeline

```mermaid
graph TD
    subgraph "Source (maintainers work here)"
        SRC["specification/v3.9/<br/>~45 modular YAML files"]
    end

    subgraph "CI Pipeline"
        LINT["redocly lint<br/>validate each file"]
        BUNDLE["redocly bundle<br/>resolve all $ref"]
        LINT2["redocly lint<br/>validate bundled output"]
        DIFF["diff check<br/>semantic equivalence"]
    end

    subgraph "Output (consumers use this)"
        BUNDLED["OSDM-online-api-v3.9.0.bundled.yml<br/>single monolithic file"]
        SWAGGER["Swagger UI on osdm.io"]
        REDOC["Redoc on osdm.io"]
    end

    SRC --> LINT --> BUNDLE --> LINT2 --> DIFF
    BUNDLE --> BUNDLED
    BUNDLED --> SWAGGER
    BUNDLED --> REDOC
```

Prior versions (`v1.4` through `v3.8`) are **untouched** — no risk to existing
specs.

---

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
