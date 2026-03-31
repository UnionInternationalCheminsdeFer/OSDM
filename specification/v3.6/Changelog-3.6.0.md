# Changelog for OSDM 3.6.0

## New Endpoints

* `GET /versions`
* `POST /offer-overview-route`
* `POST /offer-overview-trip`
* `GET /passenger-categories`

## New Objects

* `DirectionChange`
* `OfferOverviewRoute`
* `OfferOverviewTrip`
* `OfferOverviewTripRequest`
* `OfferOverviewTripResponse`
* `OfferOverviewRouteRequest`
* `OfferOverviewRouteResponse`
* `PassengerCategory`
* `RouteSpecification`
* `TimeFrameSegmentation`
* `TripResponseParameters`

## Deprecated Objects

* `Warning`
* `WarningCollection`

## Modified Objects

* `BookingSearchResult`: bookingCode, externalRef added
* `CountryCode`: must always contain alpha 2 country code from ISO 3166-1
* `DocumentResponse`: warnings deprecated
* `Fare`: required constraint removed for `requiredCards` property
* `OfferCollectionRequest`: tripResponseParameters property added
* `ProductResponse`: warnings property deprecated
* `Trip`: properties `originName`, `destinationName` added
* `TripSummary`: properties `originName`, `destinationName` added
* `VehicleAvailability`: property `directionChanges` added

## Modified Enum

* `AccommodationSubType`: items added and removed, see catalog of code lists
* `ActualPassengerType`: items added and removed, see catalog of code lists
* `AncillaryType`: items added
* `PassengerType`: items added and removed, see code lists
* `ProductTag`: items added
* `SiSType`: item `PEER_TO_PEER` deprecated, `PEER2PEER` added
* `StopBehavior`: default defined
* `TransportableType`: items added

## Modified Endpoints

* `POST /trips-collection`: query param `stopBehavior` added
* `GET /trips-collections/{tripsCollectionId}`: query param `stopBehavior` added
* `POST /trips`: query param `stopBehavior` added
* `GET /trips/{tripId}`: required constraint removed from query param `stopBehavior`
* `GET /coach-deck-layouts`:
  * header `If-None-Match` added to request
  * headers `Cache-Control`, `ETag` added to response
  * __303__, __304__ response statuses added
* `POST /availabilities/on-demand-services`: header `Accept-Language` added to request





















