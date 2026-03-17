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
        S["schemas/<br/>13 files"]
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
    SCHEMAS --> S7["...6 more"]

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

    PRODUCT["product.yml<br/>Product, Fare, Zone,<br/>RegionalValidity, ..."]

    COMPLAINT["complaint.yml<br/>Complaint,<br/>Reimbursement, ..."]

    TRAVEL["travel-account.yml<br/>TravelAccount,<br/>MultiRide, ..."]

    CONT["continuous-service.yml<br/>ContinuousService,<br/>OnDemand, ..."]

    TRANSPORT["transport.yml<br/>Vehicle, Car,<br/>Luggage, ..."]

    COMMON --> TRIP
    COMMON --> OFFER
    COMMON --> BOOKING
    COMMON --> PASSENGER
    COMMON --> FULFILLMENT
    COMMON --> AFTERSALES
    COMMON --> PLACE
    COMMON --> PRODUCT
    COMMON --> COMPLAINT
    COMMON --> TRAVEL
    COMMON --> CONT
    COMMON --> TRANSPORT

    TRIP --> OFFER
    OFFER --> BOOKING
    PASSENGER --> BOOKING
    FULFILLMENT --> BOOKING
    PLACE --> OFFER
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

## 6. Schema Size Distribution

```mermaid
---
config:
  xyChart:
    xAxis:
      labelFontSize: 10
---
xychart-beta
    title "Schemas per domain file (494 total)"
    x-axis ["_common", "place", "trip", "offer", "aftersales", "product", "booking", "fulfillment", "passenger", "transport", "complaint", "travel-acct", "cont-svc"]
    y-axis "Number of schemas" 0 --> 120
    bar [105, 66, 56, 42, 38, 38, 34, 32, 23, 17, 18, 13, 12]
```