# Changelog for OSDM 3.7.0

## New Endpoints

* `GET /bookings/{bookingId}/passengers`
* `PATCH /bookings/{bookingId}/passengers`
* `POST /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts`
* `DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts`
* `GET /bookings/{bookingId}/fulfillment-check`
* `GET /bookings/{bookingId}/refund-offers/{refundOfferId}/confirmation-check`

## Deprecated Endpoints

* `POST /bookings/{bookingId}/booked-offers/{bookedOfferId}/reservations`
* `DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/reservations/{reservationId}`
* `POST /bookings/{bookingId}/booked-offers/{bookedOfferId}/ancillaries`
* `DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/ancillaries/{ancillaryId}`


## Modified Endpoints

* `PATCH /bookings/{bookingId}/passengers/{passengerId}`: non-success statuses added
* `DELETE /bookings/{bookingId}`: documentation removes possibility to run the request on confirmed booking
* `GET /bookings/{bookingId}/release-offers/{releaseOfferId}`: __202__ response status added

## New Objects

* `AbstractTransportableVehicleSpecification`
* `BookedOfferPartRequest`
* `BookedOfferPartResponse`
* `BookedOfferPartDeleteRequest`
* `MotorcycleSpecification`
* `CarSpecification`
* `CarRack`
* `ProductRequestOfferSelection`
* `PassengersBatchUpdateRequest`
* `PassengersCollectionResponse`
* `ReleaseOfferRequestAsyncResponse`
* `TransportableSpecification`

## Modified Objects

* `AbstractBookingPart`: property `inboundTripCoverage` added
* `AbstractOfferPart`: property `inboundTripCoverage` added
* `Admission`: property `regionalValidity` deprecated, `regionalValidities` added
* `AdmissionOfferPart`: properties `regionalValidity`, `includedReservations` deprecated (superseded by `reservations[].isIncluded`), `regionalValidities` added
* `AlightSpecification`: property `replacedPlaceRef` added
* `AncillaryGroup`: property `id` deprecated
* `AncillaryOfferPart`: property `reservations` added
* `AnonymousPassengerSpecification`: property `transportable` added
* `AppliedPassengerType`: property `inboundTripCoverage` added
* `BoardSpecification`: property `replacedPlaceRef` added
* `BookedOffer`: property `inboundTripCoverage` added
* `BookedOfferAncillaryRequest`: property `inboundTripCoverage` added
* `BookedOfferReservationRequest`: property `inboundTripCoverage` added
* `Booking`: property `fulfillmentStatus` added
* `Car`: required constraint added for `licencePlate` property; properties `specialType`, `roofWidth`, `rack`, `contactName`, `contactDetail` added
* `CompanyDetail`: required constraint for properties `registrationNumber`, `taxId` removed
* `ComplaintDecision`: property `decisionType` added
* `ContactDetail`: property `postalAddress` deprecated
* `ExchangeOffer`: property `inboundTripCoverage` added
* `Fulfillment`: property `inboundTripCoverage` added
* `FulfillmentActivationPatchRequest`: property `startOfUsage` made nullable
* `FulfillmentUsage`: required constraint removed for `maxAvailableZones` property and prperty made nullable
* `GrantedReductionAmount`: property `inboundTripCoverage` added
* `MotorCycle`: property `isSideCarIncluded` deprecated; property `licensePlate` made required; properties `weight`, `length`, `width`, `height`, `brand`, `model`, `contactName`, `contactDetail` added
* `Offer`: property `inboundTripCoverage` added
* `OfferCollectionRequest`: properties `inboundTripIds`, `inboundTripSpecifications` added
* `OfferSearchCriteria`: properties `productSelections`, `inboundDate` added
* `PassengerSpecification`: property `transportableDetails` added
* `Reservation`: property `ancillaryRefs` deprecated
* `ReservationGroup`: properties `id`, `name` deprecated
* `ReservationOfferPart`: property `ancillaryRefs` deprecated
* `ReservationRelation`: property `isIncluded` added
* `ReservedPlace`: property `compartmentNumber` added
* `ReturnSearchParameters`: properties `inwardReturnDate`, `outwardOfferTag` deprecated; properties `outboundTripIds`, `departureTime`, `arrivalTime`, `vias`, `parameters` added
* `Route`: property `routeSummary` added
* `Transportable`: property trailer changed type to `Car`
* `Trip`: property `direction` made optional
* `TripParameters`: property `numberOfResults` deprecated
* `Zone`: required constraint removed for `carrier` property; properties `validFrom` and `validTo` added

## Deprecated Objects

None

## Removed Objects

* `Trailer`: new described by `Car`

## New Enum

* `DecisionType`

## Modified Enum

* `TransportableType`: item `SPECIAL_VEHICLE` added
