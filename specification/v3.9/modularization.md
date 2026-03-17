# OSDM v3.9 Specification Modularization

## 1. Current State vs Target

```mermaid
graph LR
    subgraph "Current (v3.8)"
        MONO["OSDM-online-api-v3.8.0.yml<br/>18,112 lines<br/>69 endpoints | 509 schemas"]
    end

    subgraph "Target (v3.9)"
        HUB["OSDM-online-api.yml<br/>~150 lines<br/>hub/entrypoint"]
        P["paths/<br/>22 files"]
        S["schemas/<br/>14 files"]
        C["components/<br/>3 files"]
        HUB --> P
        HUB --> S
        HUB --> C
    end

    MONO -.->|"redocly bundle"| BUNDLED["OSDM-online-api-v3.9.0.bundled.yml<br/>(single file for consumers)"]
    HUB -.->|"redocly bundle"| BUNDLED
```

## 2. Proposed Directory Structure

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
    PATHS --> P12["...8 more"]

    SCHEMAS --> S0["_common.yml<br/>~80 schemas"]
    SCHEMAS --> S1["trip.yml<br/>~45 schemas"]
    SCHEMAS --> S2["offer.yml<br/>~35 schemas"]
    SCHEMAS --> S3["booking.yml<br/>~30 schemas"]
    SCHEMAS --> S4["fulfillment.yml<br/>~25 schemas"]
    SCHEMAS --> S5["aftersales.yml<br/>~40 schemas"]
    SCHEMAS --> S6["place.yml<br/>~40 schemas"]
    SCHEMAS --> S7["fare.yml<br/>~24 schemas"]
    SCHEMAS --> S8["...5 more"]

    COMP --> C1["parameters.yml"]
    COMP --> C2["responses.yml"]
    COMP --> C3["security-schemes.yml"]
```

## 3. Schema Dependency Graph

```mermaid
graph TD
    COMMON["_common.yml<br/>Problem, Price, Links,<br/>Currency, CompanyRef,<br/>Translation, GeoPosition,<br/>ServiceClass, ..."]

    TRIP["trip.yml<br/>Trip, TripLeg, TimedLeg,<br/>StopPlace, DatedJourney,<br/>Route, Board/Alight, ..."]

    OFFER["offer.yml<br/>Offer, OfferPart,<br/>Admission, Reservation,<br/>Ancillary, OnHoldOffer, ..."]

    BOOKING["booking.yml<br/>Booking, BookedOffer,<br/>BookingSplit,<br/>BookingSearch, ..."]

    PASSENGER["passenger.yml<br/>Passenger, Purchaser,<br/>PassengerCategory,<br/>ReductionCard, ..."]

    FULFILLMENT["fulfillment.yml<br/>Fulfillment, Document,<br/>SecurityFeature, ..."]

    AFTERSALES["aftersales.yml<br/>RefundOffer, ExchangeOffer,<br/>ReleaseOffer,<br/>CancelFulfillments, ..."]

    PLACE["place.yml<br/>Place, CoachLayout,<br/>Availability,<br/>Compartment, ..."]

    PRODUCT["product.yml<br/>Product, ProductType,<br/>ProductTag, ..."]

    FARE["fare.yml<br/>Fare, FareType, Zone,<br/>RegionalValidity,<br/>TravelValidity, ..."]

    COMPLAINT["complaint.yml<br/>Complaint,<br/>Reimbursement, ..."]

    TRAVEL["travel-account.yml<br/>TravelAccount,<br/>MultiRide, ..."]

    CONT["continuous-service.yml<br/>ContinuousService,<br/>OnDemand, ..."]

    TRANSPORT["transportable.yml<br/>Vehicle, Car,<br/>Luggage, ..."]

    COMMON --> TRIP
    COMMON --> OFFER
    COMMON --> BOOKING
    COMMON --> PASSENGER
    COMMON --> FULFILLMENT
    COMMON --> AFTERSALES
    COMMON --> PLACE
    COMMON --> PRODUCT
    COMMON --> FARE
    COMMON --> COMPLAINT
    COMMON --> TRAVEL
    COMMON --> CONT
    COMMON --> TRANSPORT

    TRIP --> OFFER
    OFFER --> BOOKING
    PASSENGER --> BOOKING
    FULFILLMENT --> BOOKING
    PLACE --> OFFER
    FARE --> OFFER
    FARE --> BOOKING
    FARE --> AFTERSALES
    FARE --> FULFILLMENT
    PRODUCT --> OFFER
    BOOKING --> AFTERSALES
    FULFILLMENT --> AFTERSALES
    CONT --> OFFER
    TRANSPORT --> OFFER
```

## 4. Booking Lifecycle — Paths Mapping

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

## 5. Build Pipeline

```mermaid
graph TD
    subgraph "Source (maintainers work here)"
        SRC["specification/v3.9/<br/>~40 modular YAML files"]
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

## 6. Fare / Product Separation

The original `product.yml` (38 schemas) mixed two distinct concerns:

- **Fare domain** — pricing rules, regional validity, zones, luggage constraints, travel validity
- **Product domain** — product catalog, search, tags, promotion codes

These were split into `fare.yml` (24 schemas) and `product.yml` (12 schemas):

| `fare.yml` | `product.yml` |
|---|---|
| Fare, FareType, FareCombinationModel | Product, ProductType, ProductSummary |
| FareConnectionPoint, FareConnectionPointRef | ProductSearch/Response/Collection |
| FareReferenceStation, StationSet | ProductTag, ProductTagGroup, ProductTagName |
| RegionalConstraint, RegionalValidity, RegionalValiditySummary | ProductTagsResponse |
| CarrierConstraint, ExclusionScope | PromotionCodeCollectionResponse |
| TravelValidity, TravelValidityRange | |
| TrainValidity, TrainValidityScope | |
| Zone, ZoneDefinition, ZoneCollectionResponse | |
| LuggageConstraint, LuggageDimension, LuggageDimensionEnum | |
| LuggageRestriction, LuggageRestrictionRuleEnum | |

**Rationale:** Fare schemas are referenced by offer, booking, aftersales, fulfillment, and travel-account — they form a distinct dependency cluster. Product schemas primarily serve the product catalog API. Separating them reduces cognitive load and aligns file boundaries with domain boundaries.

## 7. Packages per Role

The three OSDM roles — Fare Provider, Distributor, and Retailer — require different subsets of the modular packages. **"—"** means the package is architecturally outside the role's scope.

### Schema packages

| Package | Fare Provider | Distributor | Retailer |
|---|:---:|:---:|:---:|
| **Foundation** | | | |
| `_common.yml` | **mandatory** | **mandatory** | **mandatory** |
| `ojp/_common.yml` | **mandatory** | **mandatory** | **mandatory** |
| **Trip & Place** | | | |
| `ojp/trip.yml` | **mandatory** | **mandatory** | **mandatory** |
| `ojp/place.yml` | **mandatory** | **mandatory** | **mandatory** |
| `trip.yml` | optional | **mandatory** | **mandatory** |
| **Fare & Product** | | | |
| `fare.yml` | **mandatory** | **mandatory** | — |
| `product.yml` | **mandatory** | **mandatory** | **mandatory** |
| `ojp/product.yml` | optional | optional | optional |
| **Offer & Booking** | | | |
| `offer.yml` | **mandatory** | **mandatory** | **mandatory** |
| `booking.yml` | **mandatory** | **mandatory** | **mandatory** |
| `passenger.yml` | **mandatory** | **mandatory** | **mandatory** |
| **Fulfillment** | | | |
| `fulfillment.yml` | **mandatory** | **mandatory** | **mandatory** |
| **After-Sales** | | | |
| `aftersales.yml` | **mandatory** | **mandatory** | optional |
| `complaint.yml` | — | optional | optional |
| **Seat/Place Selection** | | | |
| `place.yml` | optional | optional | optional |
| **Extensions** | | | |
| `transportable.yml` | — | optional | optional |
| `travel-account.yml` | — | optional | optional |
| `continuous-service.yml` | — | optional | optional |
| `ojp/continuous-service.yml` | — | optional | optional |

### Path packages

| Package | Fare Provider | Distributor | Retailer |
|---|:---:|:---:|:---:|
| **Discovery** | | | |
| `versions.yml` | **mandatory** | **mandatory** | **mandatory** |
| `places.yml` | — | **mandatory** | **mandatory** |
| `trips.yml` | — | **mandatory** | **mandatory** |
| `products.yml` | **mandatory** | **mandatory** | optional |
| **Offer** | | | |
| `offers.yml` | **mandatory** | **mandatory** | **mandatory** |
| `on-hold.yml` | — | optional | optional |
| `availabilities.yml` | — | optional | optional |
| **Booking** | | | |
| `bookings.yml` | **mandatory** | **mandatory** | **mandatory** |
| `bookings-search.yml` | **mandatory** | **mandatory** | optional |
| `bookings-split.yml` | — | optional | — |
| `booked-offers.yml` | **mandatory** | **mandatory** | **mandatory** |
| `booking-parts.yml` | **mandatory** | **mandatory** | **mandatory** |
| `passengers.yml` | **mandatory** | **mandatory** | **mandatory** |
| `purchaser.yml` | **mandatory** | **mandatory** | **mandatory** |
| **Fulfillment** | | | |
| `fulfillments.yml` | **mandatory** | **mandatory** | **mandatory** |
| `documents.yml` | **mandatory** | **mandatory** | **mandatory** |
| **After-Sales** | | | |
| `refund.yml` | **mandatory** | **mandatory** | optional |
| `exchange.yml` | **mandatory** | **mandatory** | optional |
| `release.yml` | **mandatory** | **mandatory** | optional |
| `cancel-fulfillments.yml` | **mandatory** | **mandatory** | optional |
| `complaints.yml` | — | optional | optional |
| `reimbursements.yml` | — | optional | optional |
| **Extensions** | | | |
| `master-data.yml` | — | optional | optional |
| `travel-accounts.yml` | — | optional | optional |

### Rationale

- **Fare Provider** must support the full booking lifecycle (offer → book → fulfill → after-sales) for its own fares when a distributor delegates operations. Complaint handling and transport details remain outside its scope.
- **Distributor** implements the full API as a server. All core lifecycle packages are mandatory. Place selection, transport, travel accounts, and complaints are value-adds.
- **Retailer** consumes the API as a client. The core flow (search → offer → book → fulfill) is mandatory. After-sales is optional — some retailers route refund/exchange back through the distributor's own UI. Fares are not applicable (distributor-mode concept).

## 8. Schema Size Distribution

```mermaid
---
config:
  xyChart:
    xAxis:
      labelFontSize: 10
---
xychart-beta
    title "Schemas per domain file (494 total)"
    x-axis ["_common", "place", "trip", "offer", "aftersales", "fare", "booking", "fulfillment", "passenger", "transport", "complaint", "product", "travel-acct", "cont-svc"]
    y-axis "Number of schemas" 0 --> 120
    bar [105, 66, 56, 42, 38, 24, 34, 32, 23, 17, 18, 12, 13, 12]
```