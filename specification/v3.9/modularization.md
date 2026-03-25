# OSDM v3.9 Specification Modularization

## 1. Current State vs Target

```mermaid
graph LR
    subgraph "Current (v3.8)"
        MONO["OSDM-online-api-v3.8.0.yml<br/>18,112 lines<br/>69 endpoints | 509 schemas"]
    end

    subgraph "Target (v3.9)"
        HUB["OSDM-online-api.yml<br/>~150 lines<br/>hub/entrypoint"]
        P["paths/<br/>24 files"]
        S["schemas/<br/>15 + 5 ojp files"]
        C["components/<br/>3 files"]
        HUB --> P
        HUB --> S
        HUB --> C
    end

    MONO -.->|"redocly bundle"| BUNDLED["OSDM-online-api-v3.9.0.bundled.yml<br/>(single file for consumers)"]
    HUB -.->|"redocly bundle"| BUNDLED
```

## 2. Directory Structure

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

    SCHEMAS --> S0["_common.yml<br/>92 schemas"]
    SCHEMAS --> S1["place.yml<br/>55 schemas"]
    SCHEMAS --> S2["offer.yml<br/>42 schemas"]
    SCHEMAS --> S3["booking.yml<br/>34 schemas"]
    SCHEMAS --> S4["fulfillment.yml<br/>32 schemas"]
    SCHEMAS --> S5["aftersales.yml<br/>38 schemas"]
    SCHEMAS --> S6["trip.yml<br/>30 schemas"]
    SCHEMAS --> S7["fare.yml<br/>24 schemas"]
    SCHEMAS --> S8["passenger.yml<br/>23 schemas"]
    SCHEMAS --> S9["complaint.yml<br/>18 schemas"]
    SCHEMAS --> S10["transportable.yml<br/>17 schemas"]
    SCHEMAS --> S11["product.yml<br/>12 schemas"]
    SCHEMAS --> S12["travel-account.yml<br/>13 schemas"]
    SCHEMAS --> S13["continuous-service.yml<br/>10 schemas"]
    SCHEMAS --> OJP["ojp/"]

    OJP --> O1["_common.yml<br/>13 schemas"]
    OJP --> O2["trip.yml<br/>26 schemas"]
    OJP --> O3["place.yml<br/>11 schemas"]
    OJP --> O4["product.yml<br/>2 schemas"]
    OJP --> O5["continuous-service.yml<br/>2 schemas"]

    COMP --> C1["parameters.yml"]
    COMP --> C2["responses.yml"]
    COMP --> C3["security-schemes.yml"]
```

## 3. Package Diagram — Schema Dependencies

All cross-file `$ref` dependencies between schema packages. Arrows point from the
referencing package to the referenced package (i.e. "A → B" means A uses types from B).

```mermaid
graph TD
    classDef foundation fill:#e8f4fd,stroke:#1e88e5
    classDef ojp fill:#fff3e0,stroke:#f57c00
    classDef core fill:#e8f5e9,stroke:#43a047
    classDef ext fill:#fce4ec,stroke:#e53935

    %% Foundation
    COMMON["_common.yml<br/><i>92 schemas</i><br/>Problem, Price, Links,<br/>Currency, CompanyRef,<br/>ServiceClass, Translation, ..."]:::foundation

    %% OJP layer
    OC["ojp/_common.yml<br/><i>13 schemas</i><br/>Address, GeoPosition,<br/>Mode, ModeFilter,<br/>CarrierFilter, ..."]:::ojp
    OT["ojp/trip.yml<br/><i>26 schemas</i><br/>Trip, TimedLeg, Board,<br/>Alight, DatedJourney,<br/>StopPlace, ..."]:::ojp
    OP["ojp/place.yml<br/><i>11 schemas</i><br/>Place, PlaceRef,<br/>PointOfInterest, ..."]:::ojp
    OPR["ojp/product.yml<br/><i>2 schemas</i><br/>ProductCategory,<br/>ProductCategoryRef"]:::ojp
    OCS["ojp/continuous-service.yml<br/><i>2 schemas</i><br/>ContinuousMode,<br/>ContinuousService"]:::ojp

    %% Core OSDM
    TRIP["trip.yml<br/><i>30 schemas</i><br/>Route, Section, TrainLink,<br/>TripAllocation, ..."]:::core
    FARE["fare.yml<br/><i>24 schemas</i><br/>Fare, FareType, Zone,<br/>RegionalValidity,<br/>TravelValidity, ..."]:::core
    PRODUCT["product.yml<br/><i>12 schemas</i><br/>Product, ProductType,<br/>ProductTag, ..."]:::core
    OFFER["offer.yml<br/><i>42 schemas</i><br/>Offer, OfferPart,<br/>Admission, Reservation,<br/>Ancillary, ..."]:::core
    BOOKING["booking.yml<br/><i>34 schemas</i><br/>Booking, BookedOffer,<br/>BookingSplit, ..."]:::core
    PASSENGER["passenger.yml<br/><i>23 schemas</i><br/>Passenger, Purchaser,<br/>ReductionCard, ..."]:::core
    FULFILLMENT["fulfillment.yml<br/><i>32 schemas</i><br/>Fulfillment, Document,<br/>SecurityFeature, ..."]:::core
    AFTERSALES["aftersales.yml<br/><i>38 schemas</i><br/>RefundOffer, ExchangeOffer,<br/>ReleaseOffer, ..."]:::core
    PLACE["place.yml<br/><i>55 schemas</i><br/>CoachLayout, Availability,<br/>Compartment, ..."]:::core

    %% Extensions
    TRANSPORT["transportable.yml<br/><i>17 schemas</i><br/>Vehicle, Car, Motorcycle,<br/>Transportable, ..."]:::ext
    COMPLAINT["complaint.yml<br/><i>18 schemas</i><br/>Complaint,<br/>Reimbursement, ..."]:::ext
    TRAVEL["travel-account.yml<br/><i>13 schemas</i><br/>TravelAccount,<br/>MultiRide, ..."]:::ext
    CONT["continuous-service.yml<br/><i>10 schemas</i><br/>ContinuousServiceUsage,<br/>VehicleAvailability, ..."]:::ext

    %% OJP internal dependencies
    OC --> COMMON
    OT --> COMMON
    OT --> TRIP
    OT --> TRANSPORT
    OP --> COMMON

    %% Foundation dependencies
    COMMON --> FARE
    COMMON --> OFFER
    COMMON --> BOOKING
    COMMON --> FULFILLMENT
    COMMON --> AFTERSALES
    COMMON --> PLACE
    COMMON --> TRAVEL
    COMMON --> TRIP

    %% Core lifecycle dependencies
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

    %% OJP usage by core
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

    %% Extension dependencies
    TRANSPORT --> PASSENGER
    TRANSPORT --> PLACE
    TRAVEL --> OFFER
    TRAVEL --> BOOKING
    CONT --> OFFER
    CONT --> BOOKING
    FULFILLMENT --> CONT
```

## 4. Class Diagram — Booking Lifecycle Entities

The core entities that flow through the booking lifecycle, showing key attributes
and relationships across packages.

```mermaid
classDiagram
    direction LR

    namespace ojp_trip {
        class Trip {
            +String id
            +TripSummary summary
            +TripLeg[] legs
        }
        class TimedLeg {
            +Board board
            +Alight alight
            +DatedJourney datedJourney
        }
        class StopPlace {
            +StopPlaceRef stopPlaceRef
            +String name
        }
        class Board {
            +StopPlace stopPlace
            +ServiceTime serviceDeparture
        }
        class Alight {
            +StopPlace stopPlace
            +ServiceTime serviceArrival
        }
    }

    namespace offer {
        class Offer {
            +String id
            +OfferSummary summary
            +OfferPart[] offerParts
            +Price[] prices
        }
        class AdmissionOfferPart {
            +RegionalValidity[] regionalValidities
            +Product product
        }
        class ReservationOfferPart {
            +ReservedPlace[] reservedPlaces
            +Product product
        }
        class AncillaryOfferPart {
            +AncillaryType type
            +Product product
        }
    }

    namespace fare {
        class Fare {
            +String id
            +FareType type
            +Price[] prices
            +RegionalConstraint regionalConstraint
            +TravelValidity travelValidityConstraint
            +CarrierConstraint carrierConstraint
        }
        class RegionalConstraint {
            +FareConnectionPoint entryConnectionPoint
            +FareConnectionPoint exitConnectionPoint
            +RegionalValidity[] regionalValidities
        }
        class TravelValidity {
            +ValidityRange validityRange
            +TrainValidity trainValidity
            +Calendar validTravelDates
        }
        class Zone {
            +CompanyRef carrier
            +StopPlace entryStation
            +StopPlace terminalStation
            +int[] zoneIds
        }
    }

    namespace booking {
        class Booking {
            +String id
            +BookedOffer[] bookedOffers
            +Passenger[] passengers
            +Purchaser purchaser
        }
        class BookedOffer {
            +String offerId
            +Admission[] admissions
            +Reservation[] reservations
            +Ancillary[] ancillaries
            +Fare[] fares
        }
    }

    namespace fulfillment {
        class Fulfillment {
            +String id
            +FulfillmentStatus status
            +FulfillmentPart[] parts
            +Document[] documents
        }
        class Document {
            +String id
            +DocumentType type
            +DocumentFormat format
        }
    }

    namespace aftersales {
        class RefundOffer {
            +String id
            +RefundStatus status
            +Price refundAmount
        }
        class ExchangeOffer {
            +String id
            +ExchangeStatus status
            +Offer newOffer
        }
    }

    namespace passenger {
        class Passenger {
            +String id
            +PassengerType type
            +PersonDetail detail
            +ReductionCardAccount[] cards
        }
        class Purchaser {
            +PersonDetail detail
            +ContactDetail contact
        }
    }

    namespace product {
        class Product {
            +String id
            +String code
            +ProductType type
            +CompanyRef owner
            +Flexibility flexibility
        }
    }

    %% Lifecycle flow
    Trip "1" --> "*" TimedLeg
    TimedLeg --> Board
    TimedLeg --> Alight
    Board --> StopPlace
    Alight --> StopPlace

    Offer "1" --> "*" AdmissionOfferPart
    Offer "1" --> "*" ReservationOfferPart
    Offer "1" --> "*" AncillaryOfferPart
    AdmissionOfferPart --> Product
    ReservationOfferPart --> Product
    AncillaryOfferPart --> Product

    Booking "1" --> "*" BookedOffer
    Booking "1" --> "*" Passenger
    Booking "1" --> "1" Purchaser
    BookedOffer --> Offer : references
    BookedOffer "*" --> "*" Fare

    Fare --> RegionalConstraint
    Fare --> TravelValidity
    RegionalConstraint --> Zone

    Booking --> Fulfillment : triggers
    Fulfillment "1" --> "*" Document

    Fulfillment --> RefundOffer : after-sales
    Fulfillment --> ExchangeOffer : after-sales
```

## 5. Class Diagram — OJP Schemas (Provided by Open Journey Planner)

Schemas under `schemas/ojp/` originate from the OJP standard and are used by OSDM
for trip planning, place resolution, and transport mode classification.

```mermaid
classDiagram
    direction TB

    namespace ojp_common {
        class GeoPosition {
            +Longitude longitude
            +Latitude latitude
        }
        class Address {
            +String street
            +String houseNumber
            +String postCode
            +String city
            +CountryCode country
        }
        class Mode {
            +PTMode ptMode
            +String submode
        }
        class ModeFilter {
            +Mode[] include
            +Mode[] exclude
        }
        class CarrierFilter {
            +CompanyRef[] include
            +CompanyRef[] exclude
        }
        class ServiceBrandFilter {
            +ServiceBrandCode[] include
            +ServiceBrandCode[] exclude
        }
        class IndividualMode {
            <<enumeration>>
            WALK
            CYCLE
            TAXI
            SELF_DRIVE_CAR
            OTHERS_DRIVE_CAR
        }
        class TransferMode {
            <<enumeration>>
            WALK
            PARK_AND_RIDE
            BIKE_AND_RIDE
            CAR_SHUTTLE_TRAIN
            PROTECTED_CONNECTION
            GUARANTEED_CONNECTION
            REMAIN_IN_VEHICLE
        }
    }

    namespace ojp_trip {
        class Trip {
            +String id
            +TripSummary summary
            +int transfers
            +TripLeg[] legs
        }
        class TripLeg {
            +int legId
            +TimedLeg timedLeg
            +TransferLeg transferLeg
            +ContinuousLeg continuousLeg
        }
        class TimedLeg {
            +Board board
            +Alight alight
            +DatedJourney datedJourney
            +Intermediate[] intermediates
        }
        class TransferLeg {
            +TransferMode transferMode
            +StopPlace start
            +StopPlace end
            +String duration
        }
        class DatedJourney {
            +JourneyRef journeyRef
            +OperatingDays operatingDays
            +Mode mode
            +String[] vehicleNumbers
        }
        class Board {
            +StopPlace stopPlace
            +ServiceTime serviceDeparture
        }
        class Alight {
            +StopPlace stopPlace
            +ServiceTime serviceArrival
        }
        class Intermediate {
            +StopPlace stopPlace
            +ServiceTime serviceArrival
            +ServiceTime serviceDeparture
        }
        class StopPlace {
            +StopPlaceRef stopPlaceRef
            +String name
            +GeoPosition geoPosition
        }
        class StopPlaceRef {
            +String stopPlaceRef
            +String providerCode
        }
        class TripSearchCriteria {
            +PlaceRef origin
            +PlaceRef destination
            +TripVia[] vias
            +ModeFilter modeFilter
        }
    }

    namespace ojp_place {
        class Place {
            +PlaceRef placeRef
            +String name
            +GeoPosition geoPosition
        }
        class PlaceRef {
            +StopPlaceRef stopPlaceRef
            +GeoPositionRef geoPositionRef
            +PointOfInterestRef pointOfInterestRef
            +AddressRef addressRef
        }
        class PointOfInterest {
            +String id
            +String name
            +GeoPosition geoPosition
            +PointOfInterestCategory category
        }
    }

    %% Relationships
    Trip "1" --> "*" TripLeg
    TripLeg --> TimedLeg
    TripLeg --> TransferLeg
    TimedLeg --> Board
    TimedLeg --> Alight
    TimedLeg --> DatedJourney
    TimedLeg "1" --> "*" Intermediate
    Board --> StopPlace
    Alight --> StopPlace
    Intermediate --> StopPlace
    StopPlace --> StopPlaceRef
    StopPlace --> GeoPosition
    DatedJourney --> Mode
    TransferLeg --> StopPlace
    TripSearchCriteria --> PlaceRef
    TripSearchCriteria --> ModeFilter
    ModeFilter --> Mode
    Place --> PlaceRef
    Place --> GeoPosition
    PlaceRef --> StopPlaceRef
    PlaceRef --> PointOfInterest
    PlaceRef --> Address
```

## 6. Class Diagram — Fare & Regional Validity

The fare domain models pricing rules, regional constraints, zones, and travel validity.

```mermaid
classDiagram
    direction TB

    class Fare {
        +String id
        +FareType type
        +Price[] prices
        +RegionalConstraint regionalConstraint
        +CarrierConstraint carrierConstraint
        +TravelValidity travelValidityConstraint
        +FareCombinationModel[] combinationConstraint
        +LuggageConstraint luggageConstraint
    }

    class FareType {
        <<enumeration>>
        ADMISSION
        RESERVATION
        ANCILLARY
    }

    class FareCombinationModel {
        +String model
        +CompanyRef[] combinableCarriers
        +boolean isValidOnlyWhenCombined
        +String referenceCluster
    }

    class RegionalConstraint {
        +FareConnectionPoint entryConnectionPoint
        +FareConnectionPoint exitConnectionPoint
        +RegionalValidity[] regionalValidities
        +int distance
    }

    class RegionalValidity {
        +int seqNb
        +Zone zone
        +Route route
        +TrainLink trainLink
        +Line line
        +Polygon polygon
    }

    class FareConnectionPoint {
        +String name
        +StationSet[] stationSets
    }

    class StationSet {
        +StopPlaceRef[] stations
    }

    class FareReferenceStation {
        +String name
        +String code
        +CompanyRef carrier
        +StopPlaceRef[] stations
    }

    class Zone {
        +CompanyRef carrier
        +String name
        +StopPlace entryStation
        +StopPlace terminalStation
        +int[] zoneIds
        +String nutsCode
    }

    class ZoneDefinition {
        +String id
        +CompanyRef carrier
        +Polygon polygon
        +String[] nutsCodes
        +PlaceRef[] places
    }

    class TravelValidity {
        +Calendar validTravelDates
        +ValidityRange validityRange
        +ExcludedTimeRange[] excludedTimeRanges
        +int numberOfTravelDays
        +TrainValidity trainValidity
    }

    class TrainValidity {
        +datetime from
        +datetime until
        +CompanyRef[] carriers
        +TrainValidityScope scope
    }

    class TrainValidityScope {
        <<enumeration>>
        BOARDING
        ARRIVAL
    }

    class CarrierConstraint {
        +String[] includedCarriers
        +String[] excludedCarriers
    }

    class LuggageConstraint {
        +int maxHandLuggage
        +int maxLargeLuggage
        +LuggageRestriction[] restrictions
    }

    class LuggageRestriction {
        +LuggageDimension[] dimensionRestrictions
        +int numberOfItems
    }

    Fare --> FareType
    Fare --> RegionalConstraint
    Fare --> CarrierConstraint
    Fare --> TravelValidity
    Fare --> FareCombinationModel
    Fare --> LuggageConstraint
    RegionalConstraint --> FareConnectionPoint
    RegionalConstraint "1" --> "*" RegionalValidity
    RegionalValidity --> Zone
    FareConnectionPoint "1" --> "*" StationSet
    StationSet --> StopPlaceRef : references
    Zone --> StopPlace : entry/terminal
    ZoneDefinition --> PlaceRef : contains
    TravelValidity --> TrainValidity
    TrainValidity --> TrainValidityScope
    LuggageConstraint "1" --> "*" LuggageRestriction
    LuggageRestriction "1" --> "*" LuggageDimension
```

## 7. Class Diagram — Place & Seat Selection

The place domain handles coach layouts, seat availability, and graphical reservation.

```mermaid
classDiagram
    direction TB

    class Vehicle {
        +Coach[] coaches
        +String[] reservationRefs
    }

    class VehicleAvailability {
        +CoachAvailability[] coaches
        +DirectionChange[] directionChanges
        +PlacePreSelection[] preSelectedPlaces
    }

    class Coach {
        +String coachNumber
        +CoachDeckLevel[] decks
    }

    class CoachAvailability {
        +String coachNumber
        +DeckAvailability[] decks
        +SpecialCoachType specialCoachType
    }

    class CoachDeckLayout {
        +String coachNumber
        +CoachLayout layout
    }

    class CoachLayout {
        +CoachLayoutGridSize gridSize
        +CoachLayoutPlace[] places
        +GraphicElement[] graphicElements
    }

    class CoachLayoutPlace {
        +GridPosition position
        +GridDimension dimension
        +String placeNumber
        +AccommodationType accommodation
    }

    class DeckAvailability {
        +CompartmentAvailability[] compartments
    }

    class CompartmentAvailability {
        +String compartmentNumber
        +PlaceAvailability[] places
    }

    class PlaceAvailability {
        +String placeNumber
        +AvailabilityStatus status
        +PlaceProperty[] properties
    }

    class AvailabilityStatus {
        <<enumeration>>
        AVAILABLE
        CONDITIONALLY_AVAILABLE
        NOT_AVAILABLE
        UNKNOWN
    }

    class AccommodationType {
        <<enumeration>>
        SEAT
        COUCHETTE
        BERTH
        WHEELCHAIR
        BICYCLE
    }

    class PlaceSelection {
        +SelectedPlace[] places
        +SelectedCompartment[] compartments
        +SelectedAccommodation[] accommodations
    }

    class PlacePreferenceGroup {
        +PlaceProperty[] preferences
    }

    Vehicle "1" --> "*" Coach
    VehicleAvailability "1" --> "*" CoachAvailability
    Coach "1" --> "*" CoachDeckLevel
    CoachAvailability "1" --> "*" DeckAvailability
    DeckAvailability "1" --> "*" CompartmentAvailability
    CompartmentAvailability "1" --> "*" PlaceAvailability
    PlaceAvailability --> AvailabilityStatus
    CoachDeckLayout --> CoachLayout
    CoachLayout "1" --> "*" CoachLayoutPlace
    CoachLayoutPlace --> AccommodationType
    PlaceSelection --> PlacePreferenceGroup
```

## 8. Class Diagram — After-Sales Operations

After-sales covers refunds, exchanges, releases, and fulfillment cancellations.

```mermaid
classDiagram
    direction LR

    class RefundOffer {
        +String id
        +RefundStatus status
        +RefundOfferBreakdownItem[] breakdown
        +Fare[] fares
    }

    class RefundStatus {
        <<enumeration>>
        OFFERED
        CONFIRMED
        REJECTED
        EXPIRED
    }

    class ExchangeOffer {
        +String id
        +ExchangeStatus status
        +ExchangeBreakdownItem[] breakdown
        +Fare[] fares
    }

    class ExchangeOperation {
        +String id
        +Offer newOffer
        +BookedOffer newBookedOffer
    }

    class ExchangeStatus {
        <<enumeration>>
        OFFERED
        CONFIRMED
        REJECTED
        EXPIRED
    }

    class ReleaseOffer {
        +String id
        +ReleaseStatus status
    }

    class ReleaseStatus {
        <<enumeration>>
        OFFERED
        CONFIRMED
        REJECTED
        EXPIRED
    }

    class CancelFulfillmentsOffer {
        +String id
        +CancelFulfillmentsStatus status
    }

    class AfterSaleCondition {
        +AfterSaleConditionType type
        +Price fee
        +Price refundAmount
    }

    class AfterSaleConditionType {
        <<enumeration>>
        REFUND
        EXCHANGE
        RELEASE
        CANCELLATION
    }

    RefundOffer --> RefundStatus
    RefundOffer --> Fare : original fares
    ExchangeOffer --> ExchangeStatus
    ExchangeOffer --> ExchangeOperation
    ExchangeOperation --> Offer : new offer
    ReleaseOffer --> ReleaseStatus
    CancelFulfillmentsOffer --> CancelFulfillmentsStatus
    AfterSaleCondition --> AfterSaleConditionType
```

## 9. Sequence Diagram — Booking Lifecycle

The complete flow from trip search through fulfillment and after-sales.

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
    D-->>R: OfferCollectionResponse (Offer[], no Fares in retailer mode)
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

## 10. Component Diagram — Role-Based Packaging

Shows which packages each role (Fare Provider, Distributor, Retailer) requires.
Mandatory packages have solid borders, optional have dashed borders.

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

## 11. Fare / Product Separation

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

## 12. Packages per Role

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

## 13. Booking Lifecycle — Paths Mapping

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

## 14. Build Pipeline

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

## 15. Schema Size Distribution

```mermaid
---
config:
  xyChart:
    xAxis:
      labelFontSize: 10
---
xychart-beta
    title "Schemas per domain file (492 total, excl. 54 OJP)"
    x-axis ["_common", "place", "offer", "aftersales", "booking", "fulfillment", "trip", "fare", "passenger", "complaint", "transportable", "travel-acct", "product", "cont-svc"]
    y-axis "Number of schemas" 0 --> 100
    bar [92, 55, 42, 38, 34, 32, 30, 24, 23, 18, 17, 13, 12, 10]
```

```mermaid
---
config:
  xyChart:
    xAxis:
      labelFontSize: 10
---
xychart-beta
    title "OJP schemas (54 total)"
    x-axis ["ojp/trip", "ojp/_common", "ojp/place", "ojp/product", "ojp/cont-svc"]
    y-axis "Number of schemas" 0 --> 30
    bar [26, 13, 11, 2, 2]
```
