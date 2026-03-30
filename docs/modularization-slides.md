# OSDM v3.9 Specification Modularization

**Splitting 18,000 lines into manageable modules**

OSDM Working Group — March 2026

---

## The Problem

The Online API spec is a **single 18,112-line YAML file**

| Metric | Count |
|--------|-------|
| Endpoints | 69 |
| Schemas | 546 (492 OSDM + 54 OJP) |
| Internal `$ref` links | ~1,230 |
| Responses | 15 |
| Parameters | 8 |

Contributors must navigate the entire file to find what they need.

---

## Pain Points

- **Merge conflicts** — parallel work on different domains collides in one file
- **Cognitive overload** — a fulfillment developer must scroll past 12,000 lines of unrelated schemas
- **Review friction** — every PR diff spans the entire monolith, obscuring the actual change
- **Onboarding** — new contributors can't find a starting point in 18K lines

---

## The Goal

Split the monolith into **domain-aligned modules** while:

- Keeping the spec **valid OpenAPI 3.0.3**
- Producing an **identical bundled output** for consumers
- Requiring **no changes** from API implementers
- Aligning with **existing tag structure** already in the spec

---

## Before → After

```mermaid
graph LR
    subgraph "v3.8 — Monolith"
        MONO["OSDM-online-api-v3.8.0.yml<br/>18,112 lines<br/>69 endpoints · 546 schemas"]
    end

    subgraph "v3.9 — Modular"
        HUB["OSDM-online-api.yml<br/>~1,300 lines · hub/entrypoint"]
        P["paths/<br/>24 files"]
        S["schemas/<br/>14 + 5 OJP files"]
        C["components/<br/>3 files"]
        HUB --> P
        HUB --> S
        HUB --> C
    end

    MONO -.->|"redocly bundle"| BUNDLED["OSDM-online-api-v3.9.0.bundled.yml<br/>(single file for consumers)"]
    HUB -.->|"redocly bundle"| BUNDLED
```

---

## Directory Structure

```mermaid
graph TD
    ROOT["specification/v3.9/"]
    ROOT --> HUB["OSDM-online-api.yml<br/>(entrypoint)"]
    ROOT --> WH["OSDM-online-webhook-v3.9.0.yml"]
    ROOT --> CL["Changelog-3.9.0.md"]

    ROOT --> PATHS["paths/"]
    ROOT --> SCHEMAS["schemas/"]
    ROOT --> COMP["components/"]

    PATHS --> P1["versions.yml"]
    PATHS --> P2["places.yml"]
    PATHS --> P3["trips.yml"]
    PATHS --> P4["offers.yml"]
    PATHS --> P5["availabilities.yml"]
    PATHS --> P6["bookings.yml"]
    PATHS --> P7["booked-offers.yml"]
    PATHS --> P8["booking-parts.yml"]
    PATHS --> P9["fulfillments.yml"]
    PATHS --> P10["refund.yml"]
    PATHS --> P11["exchange.yml"]
    PATHS --> P12["release.yml"]
    PATHS --> P13["cancel-fulfillments.yml"]
    PATHS --> P14["complaints.yml"]
    PATHS --> P15["reimbursements.yml"]
    PATHS --> P16["documents.yml"]
    PATHS --> P17["passengers.yml"]
    PATHS --> P18["purchaser.yml"]
    PATHS --> P19["on-hold.yml"]
    PATHS --> P20["bookings-search.yml"]
    PATHS --> P21["bookings-split.yml"]
    PATHS --> P22["products.yml"]
    PATHS --> P23["master-data.yml"]
    PATHS --> P24["travel-accounts.yml"]

    SCHEMAS --> S0["_common.yml · 92 schemas"]
    SCHEMAS --> S1["place.yml · 55 schemas"]
    SCHEMAS --> S2["offer.yml · 42 schemas"]
    SCHEMAS --> S3["aftersales.yml · 38 schemas"]
    SCHEMAS --> S4["booking.yml · 34 schemas"]
    SCHEMAS --> S5["fulfillment.yml · 32 schemas"]
    SCHEMAS --> S6["trip.yml · 30 schemas"]
    SCHEMAS --> S7["fare.yml · 24 schemas"]
    SCHEMAS --> S8["passenger.yml · 23 schemas"]
    SCHEMAS --> S9["complaint.yml · 18 schemas"]
    SCHEMAS --> S10["transportable.yml · 17 schemas"]
    SCHEMAS --> S11["product.yml · 12 schemas"]
    SCHEMAS --> S12["travel-account.yml · 13 schemas"]
    SCHEMAS --> S13["continuous-service.yml · 10 schemas"]
    SCHEMAS --> OJP["ojp/"]

    OJP --> O1["_common.yml · 13 schemas"]
    OJP --> O2["trip.yml · 26 schemas"]
    OJP --> O3["place.yml · 11 schemas"]
    OJP --> O4["product.yml · 2 schemas"]
    OJP --> O5["continuous-service.yml · 2 schemas"]

    COMP --> C1["parameters.yml"]
    COMP --> C2["responses.yml"]
    COMP --> C3["security-schemes.yml"]
```

---

## The Hub File

`OSDM-online-api.yml` is the **single entrypoint** — ~1,300 lines

Contains:
- `openapi`, `info`, `servers`, `tags`, `security`
- All `paths` as `$ref` pointers to `paths/*.yml`
- All `components/schemas` as `$ref` pointers to `schemas/*.yml`
- All `components/parameters`, `responses`, `securitySchemes` as `$ref` pointers

Consumers and tools always start here.

---

## Schema Domains (14 core + 5 OJP files)

| File | Schemas | Domain |
|------|---------|--------|
| `_common.yml` | 92 | Problem, Price, Links, Currency, ... |
| `place.yml` | 55 | CoachLayout, PlaceAvailability, Compartment |
| `offer.yml` | 42 | Offer, Admission, Reservation, Ancillary |
| `aftersales.yml` | 38 | Refund, Exchange, Release, Cancel |
| `booking.yml` | 34 | Booking, BookedOffer, Split |
| `fulfillment.yml` | 32 | Fulfillment, Document, Security |
| `trip.yml` | 30 | Route, Section, TrainLink, TripAllocation |
| `fare.yml` | 24 | Fare, Zone, RegionalValidity, TravelValidity |
| `passenger.yml` | 23 | Passenger, Purchaser, ReductionCard |
| _+ 5 more_ | 70 | Complaint, Transport, Travel Account, ... |

---

## OJP Schemas (5 files, 54 schemas)

Schemas originating from the **Open Journey Planner** standard:

| File | Schemas | Domain |
|------|---------|--------|
| `ojp/trip.yml` | 26 | Trip, TimedLeg, Board, Alight, DatedJourney |
| `ojp/_common.yml` | 13 | Address, GeoPosition, Mode, ModeFilter |
| `ojp/place.yml` | 11 | Place, PlaceRef, PointOfInterest |
| `ojp/product.yml` | 2 | ProductCategory, ProductCategoryRef |
| `ojp/continuous-service.yml` | 2 | ContinuousMode, ContinuousService |

Separating OJP schemas clarifies the **boundary between OSDM and OJP** — these types are consumed, not owned.

---

## Path Domains (24 files)

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

## How `$ref` Linking Works

```yaml
# Hub (OSDM-online-api.yml)
paths:
  /trips:
    $ref: ./paths/trips.yml#/~1trips         # ← path file

components:
  schemas:
    Trip:
      $ref: ./schemas/trip.yml#/Trip          # ← schema file

# Schema files cross-reference each other:
# schemas/booking.yml → ./passenger.yml#/Passenger    (cross-domain)
# schemas/trip.yml    → ./_common.yml#/Price           (common types)
```

---

## Schema Dependency Graph

```mermaid
graph TD
    classDef foundation fill:#e8f4fd,stroke:#1e88e5
    classDef ojp fill:#fff3e0,stroke:#f57c00
    classDef core fill:#e8f5e9,stroke:#43a047
    classDef ext fill:#fce4ec,stroke:#e53935

    COMMON["_common.yml<br/><i>92 schemas</i><br/>Problem · Price · Links · Currency<br/>CompanyRef · ServiceClass · Translation"]:::foundation

    OC["ojp/_common.yml<br/><i>13 schemas</i><br/>Address · GeoPosition<br/>Mode · ModeFilter · CarrierFilter"]:::ojp
    OT["ojp/trip.yml<br/><i>26 schemas</i><br/>Trip · TimedLeg · Board<br/>Alight · DatedJourney · StopPlace"]:::ojp
    OP["ojp/place.yml<br/><i>11 schemas</i><br/>Place · PlaceRef<br/>PointOfInterest"]:::ojp
    OPR["ojp/product.yml<br/><i>2 schemas</i>"]:::ojp
    OCS["ojp/continuous-service.yml<br/><i>2 schemas</i>"]:::ojp

    TRIP["trip.yml<br/><i>30 schemas</i><br/>Route · Section<br/>TrainLink · TripAllocation"]:::core
    FARE["fare.yml<br/><i>24 schemas</i><br/>Fare · FareType · Zone<br/>RegionalValidity · TravelValidity"]:::core
    PRODUCT["product.yml<br/><i>12 schemas</i><br/>Product · ProductType · ProductTag"]:::core
    OFFER["offer.yml<br/><i>42 schemas</i><br/>Offer · OfferPart<br/>Admission · Reservation · Ancillary"]:::core
    BOOKING["booking.yml<br/><i>34 schemas</i><br/>Booking · BookedOffer<br/>BookingSplit"]:::core
    PASSENGER["passenger.yml<br/><i>23 schemas</i><br/>Passenger · Purchaser<br/>ReductionCard"]:::core
    FULFILLMENT["fulfillment.yml<br/><i>32 schemas</i><br/>Fulfillment · Document<br/>SecurityFeature"]:::core
    AFTERSALES["aftersales.yml<br/><i>38 schemas</i><br/>RefundOffer · ExchangeOffer<br/>ReleaseOffer"]:::core
    PLACE["place.yml<br/><i>55 schemas</i><br/>CoachLayout · Availability<br/>Compartment"]:::core

    TRANSPORT["transportable.yml<br/><i>17 schemas</i>"]:::ext
    COMPLAINT["complaint.yml<br/><i>18 schemas</i>"]:::ext
    TRAVEL["travel-account.yml<br/><i>13 schemas</i>"]:::ext
    CONT["continuous-service.yml<br/><i>10 schemas</i>"]:::ext

    OC --> COMMON
    OT --> COMMON
    OT --> TRIP
    OT --> TRANSPORT
    OP --> COMMON

    COMMON --> FARE
    COMMON --> OFFER
    COMMON --> BOOKING
    COMMON --> FULFILLMENT
    COMMON --> AFTERSALES
    COMMON --> PLACE
    COMMON --> TRAVEL
    COMMON --> TRIP

    TRIP --> OFFER
    TRIP --> BOOKING
    TRIP --> FARE
    FARE --> OFFER
    FARE --> BOOKING
    FARE --> AFTERSALES
    FARE --> FULFILLMENT
    PRODUCT --> OFFER
    PRODUCT --> AFTERSALES
    PRODUCT --> BOOKING
    OFFER --> BOOKING
    PASSENGER --> BOOKING
    PASSENGER --> AFTERSALES
    FULFILLMENT --> BOOKING
    FULFILLMENT --> AFTERSALES
    BOOKING --> AFTERSALES
    PLACE --> OFFER
    PLACE --> FARE
    PLACE --> BOOKING

    OT --> FARE
    OT --> BOOKING
    OT --> OFFER
    OT --> AFTERSALES
    OT --> COMPLAINT
    OT --> TRAVEL
    OP --> FARE
    OP --> BOOKING
    OP --> FULFILLMENT
    OP --> COMPLAINT
    OP --> PLACE
    OP --> TRIP
    OC --> PASSENGER
    OC --> CONT

    TRANSPORT --> PASSENGER
    TRANSPORT --> PLACE
    TRAVEL --> OFFER
    TRAVEL --> BOOKING
    CONT --> OFFER
    CONT --> BOOKING
    FULFILLMENT --> CONT
```

---

## Fare / Product Separation

The original `product.yml` (38 schemas) mixed two concerns — split into:

| `fare.yml` (24 schemas) | `product.yml` (12 schemas) |
|---|---|
| Fare, FareType, FareCombinationModel | Product, ProductType, ProductSummary |
| RegionalConstraint, RegionalValidity | ProductSearch/Response/Collection |
| Zone, ZoneDefinition, ZoneCollection | ProductTag, ProductTagGroup |
| TravelValidity, TrainValidity | PromotionCodeCollection |
| CarrierConstraint, LuggageConstraint | |

**Why?** Fare schemas are referenced by offer, booking, aftersales, fulfillment, and travel-account — a distinct dependency cluster. Product schemas serve the catalog API.

---

## Booking Lifecycle — Entity Relationships

```mermaid
classDiagram
    direction LR

    namespace ojp_trip {
        class Trip {
            +id: String
            +legs: TripLeg[]
        }
        class TimedLeg {
            +board: Board
            +alight: Alight
            +datedJourney: DatedJourney
        }
        class StopPlace {
            +stopPlaceRef: StopPlaceRef
            +name: String
        }
    }

    namespace offer {
        class Offer {
            +id: String
            +offerParts: OfferPart[]
            +prices: Price[]
        }
        class AdmissionOfferPart {
            +regionalValidities: RegionalValidity[]
            +product: Product
        }
        class ReservationOfferPart {
            +reservedPlaces: ReservedPlace[]
            +product: Product
        }
    }

    namespace fare {
        class Fare {
            +id: String
            +type: FareType
            +prices: Price[]
            +regionalConstraint
            +travelValidity
        }
        class RegionalConstraint {
            +entryConnectionPoint
            +exitConnectionPoint
            +regionalValidities: RegionalValidity[]
        }
        class Zone {
            +carrier: CompanyRef
            +entryStation: StopPlace
            +zoneIds: int[]
        }
    }

    namespace booking {
        class Booking {
            +id: String
            +bookedOffers: BookedOffer[]
            +passengers: Passenger[]
            +purchaser: Purchaser
        }
        class BookedOffer {
            +offerId: String
            +admissions: Admission[]
            +reservations: Reservation[]
            +fares: Fare[]
        }
    }

    namespace fulfillment {
        class Fulfillment {
            +id: String
            +status: FulfillmentStatus
            +documents: Document[]
        }
        class Document {
            +id: String
            +type: DocumentType
            +format: DocumentFormat
        }
    }

    namespace aftersales {
        class RefundOffer {
            +id: String
            +status: RefundStatus
            +refundAmount: Price
        }
        class ExchangeOffer {
            +id: String
            +status: ExchangeStatus
            +newOffer: Offer
        }
    }

    namespace passenger {
        class Passenger {
            +id: String
            +type: PassengerType
            +reductionCards: ReductionCardAccount[]
        }
    }

    namespace product {
        class Product {
            +id: String
            +code: String
            +type: ProductType
            +owner: CompanyRef
        }
    }

    Trip "1" --> "*" TimedLeg
    TimedLeg --> StopPlace

    Offer "1" --> "*" AdmissionOfferPart
    Offer "1" --> "*" ReservationOfferPart
    AdmissionOfferPart --> Product
    ReservationOfferPart --> Product

    Booking "1" --> "*" BookedOffer
    Booking "1" --> "*" Passenger
    BookedOffer --> Offer : references
    BookedOffer "*" --> "*" Fare

    Fare --> RegionalConstraint
    RegionalConstraint --> Zone

    Booking --> Fulfillment : triggers
    Fulfillment "1" --> "*" Document

    Fulfillment --> RefundOffer : after-sales
    Fulfillment --> ExchangeOffer : after-sales
```

---

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

---

## Booking Lifecycle — Paths Mapping

```mermaid
graph LR
    subgraph "Search & Discovery"
        A1["places.yml<br/>GET /places"]
        A2["trips.yml<br/>POST /trips"]
        A3["availabilities.yml<br/>POST /availabilities/*"]
        A4["products.yml<br/>GET /products"]
    end

    subgraph "Offer & Selection"
        B1["offers.yml<br/>POST /offers"]
        B2["on-hold.yml<br/>POST .../on-hold-offer"]
    end

    subgraph "Booking"
        C1["bookings.yml<br/>POST /bookings"]
        C2["booked-offers.yml<br/>PATCH .../booked-offers"]
        C3["booking-parts.yml<br/>POST .../offer-parts"]
        C4["passengers.yml<br/>PATCH .../passengers"]
        C5["purchaser.yml<br/>PUT .../purchaser"]
    end

    subgraph "Fulfillment"
        D1["fulfillments.yml<br/>POST .../fulfillments"]
        D2["documents.yml<br/>GET .../documents"]
    end

    subgraph "After-Sales"
        E1["refund.yml<br/>POST .../refund-offers"]
        E2["exchange.yml<br/>POST .../exchange-offers"]
        E3["release.yml<br/>POST .../release-offers"]
        E4["cancel-fulfillments.yml<br/>POST .../cancel-fulfillments"]
        E5["complaints.yml<br/>POST /complaints"]
        E6["reimbursements.yml<br/>POST .../reimbursements"]
    end

    A1 --> A2 --> B1 --> C1 --> D1
    B1 --> B2 --> C1
    D1 --> E1
    D1 --> E2
    D1 --> E3
    D1 --> E4
    D1 --> E5
    E5 --> E6
```

---

## Role-Based Packaging

```mermaid
graph TB
    classDef mandatory fill:#c8e6c9,stroke:#2e7d32,stroke-width:2px
    classDef optional fill:#fff9c4,stroke:#f9a825,stroke-dasharray:5 5
    classDef notapplicable fill:#f5f5f5,stroke:#bdbdbd,stroke-dasharray:2 2,color:#999

    subgraph "Fare Provider"
        direction TB
        FP_C["_common"]:::mandatory
        FP_OC["ojp/_common"]:::mandatory
        FP_OT["ojp/trip"]:::mandatory
        FP_OP["ojp/place"]:::mandatory
        FP_F["fare"]:::mandatory
        FP_P["product"]:::mandatory
        FP_O["offer"]:::mandatory
        FP_B["booking"]:::mandatory
        FP_PA["passenger"]:::mandatory
        FP_FU["fulfillment"]:::mandatory
        FP_AS["aftersales"]:::mandatory
        FP_T["trip"]:::optional
        FP_PL["place"]:::optional
    end

    subgraph "Distributor"
        direction TB
        D_C["_common"]:::mandatory
        D_OC["ojp/_common"]:::mandatory
        D_OT["ojp/trip"]:::mandatory
        D_OP["ojp/place"]:::mandatory
        D_T["trip"]:::mandatory
        D_F["fare"]:::mandatory
        D_P["product"]:::mandatory
        D_O["offer"]:::mandatory
        D_B["booking"]:::mandatory
        D_PA["passenger"]:::mandatory
        D_FU["fulfillment"]:::mandatory
        D_AS["aftersales"]:::mandatory
        D_PL["place"]:::optional
        D_TR["transportable"]:::optional
        D_TA["travel-account"]:::optional
        D_CO["complaint"]:::optional
        D_CS["continuous-svc"]:::optional
    end

    subgraph "Retailer"
        direction TB
        R_C["_common"]:::mandatory
        R_OC["ojp/_common"]:::mandatory
        R_OT["ojp/trip"]:::mandatory
        R_OP["ojp/place"]:::mandatory
        R_T["trip"]:::mandatory
        R_P["product"]:::mandatory
        R_O["offer"]:::mandatory
        R_B["booking"]:::mandatory
        R_PA["passenger"]:::mandatory
        R_FU["fulfillment"]:::mandatory
        R_AS["aftersales"]:::optional
        R_PL["place"]:::optional
        R_TR["transportable"]:::optional
        R_TA["travel-account"]:::optional
        R_CO["complaint"]:::optional
        R_CS["continuous-svc"]:::optional
        R_F["fare"]:::notapplicable
    end
```

**Legend:** Green = mandatory | Yellow/dashed = optional | Grey/dashed = not applicable

---

## Packages per Role — Summary Table

| Package | Fare Provider | Distributor | Retailer |
|---|:---:|:---:|:---:|
| `_common`, `ojp/*` | **mandatory** | **mandatory** | **mandatory** |
| `offer`, `booking`, `passenger` | **mandatory** | **mandatory** | **mandatory** |
| `fulfillment` | **mandatory** | **mandatory** | **mandatory** |
| `product` | **mandatory** | **mandatory** | **mandatory** |
| `trip` | optional | **mandatory** | **mandatory** |
| `fare` | **mandatory** | **mandatory** | *n/a* |
| `aftersales` | **mandatory** | **mandatory** | optional |
| `place`, `transportable` | optional | optional | optional |
| `complaint`, `travel-account` | *n/a* | optional | optional |

---

## Schema Size Distribution

```mermaid
---
config:
  xyChart:
    xAxis:
      labelFontSize: 10
---
xychart-beta
    title "Schemas per domain file (492 OSDM + 54 OJP)"
    x-axis ["_common", "place", "offer", "aftersales", "booking", "fulfillment", "trip", "ojp/trip", "fare", "passenger", "complaint", "transport", "ojp/_common", "travel-acct", "product", "ojp/place", "cont-svc"]
    y-axis "Number of schemas" 0 --> 100
    bar [92, 55, 42, 38, 34, 32, 30, 26, 24, 23, 18, 17, 13, 13, 12, 11, 10]
```

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

Prior versions (`v1.4` through `v3.8`) are **untouched** — no risk to existing specs.

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

---

## Verification Results

| Check | Result |
|-------|--------|
| `redocly bundle` | Succeeds |
| `redocly lint` | Valid (warnings match v3.8) |
| Paths count | 69 = 69 |
| Schemas count | 546 = 546 |
| Responses count | 15 = 15 |
| Parameters count | 8 = 8 |

The bundled output is **structurally equivalent** to v3.8.

---

## What Changes for Consumers?

**Nothing.**

- The bundled `.yml` file is the same format as before
- Swagger UI and Redoc render identically
- No API changes, no breaking changes
- Consumers never see the modular source files

The modularization is **purely an internal maintainability improvement**.

---

## What Changes for Maintainers?

| Before | After |
|--------|-------|
| Edit 1 file (18K lines) | Edit the relevant domain file |
| Merge conflicts on every PR | Conflicts only when same domain is touched |
| Full-file diffs in reviews | Focused diffs on the changed domain |
| Grep through 18K lines | Open the domain file directly |

New workflow:
1. Edit `schemas/booking.yml` or `paths/refund.yml`
2. Run `redocly bundle` to produce the bundled file
3. Run `redocly lint` to validate
4. CI does this automatically on push/PR

---

## Summary

| | v3.8 (before) | v3.9 (after) |
|---|---|---|
| Files | 1 monolith | ~45 modular files |
| Largest file | 18,112 lines | ~1,300 lines (hub) |
| Schema files | — | 14 core + 5 OJP |
| Path files | — | 24 domain-aligned |
| Domain isolation | None | Full |
| Consumer impact | — | None |
| Tooling | `redocly lint` | `redocly bundle` + `lint` |
| Merge conflict risk | High | Low |

**Modularization script** (`split-spec.py`) is included and reproducible.
All prior versions remain untouched.

The spec is ready for collaborative, domain-focused development.
