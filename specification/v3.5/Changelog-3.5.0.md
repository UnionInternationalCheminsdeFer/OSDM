# Changelog for OSDM 3.5.0

## New Endpoints

* `POST /availabilities/on-demand-services`
* `POST /availabilities/vehicle-place-map`
* `GET /coach-deck-layouts`
* `GET /coach-deck-layouts/{layoutId}`
* `GET /fulfillments/{fulfillmentId}/continuous-service-usage/{continuousServiceUsageId}`
* `PATCH /fulfillments/{fulfillmentId}/continuous-service-usage/{continuousServiceUsageId}`
* `GET /product-tags`
* `POST /products-search`

## Deprecated Endpoints

* `GET /availabilities/place-map`: replaced by `POST /availabilities/vehicle-place-map`
* `POST /availabilities/place-map`: replaced by `POST /availabilities/vehicle-place-map`
* `GET /coach-layouts`: replaced by `GET /coach-deck-layouts`
* `GET /coach-layouts/{layoutId}`: replaced by `GET /coach-deck-layouts/{layoutId}`

## Modified Endpoints

* `POST /bookings-search`: deprecated query param `page`
* `POST /bookings/{bookingId}/fulfillments`: response object in case of **202** status code changed to `FulfillmentCollectionResponse`
* `GET /coach-layouts`:
  * added request header `x-accept-namespace`
  * deprecated query param `page`
* `GET /coach-deck-layouts/{layoutId}`: added request header `x-accept-namespace`
* `GET /places`: deprecated query param `page`
* `GET /products`: deprecated query param `page`
* `GET /reduction-cards`: deprecated query param `page`
* `GET /trips-collections/{tripsCollectionId}`: deprecated query param `page`
* `GET /zones`: deprecated query param `page`
* 

## New Objects

* `BorderRadius`
* `CoachAvailability`
* `CoachDeckLayout`
* `CoachDeckLayoutCollectionResponse`
* `CoachDeckLayoutResponse`
* `CoachDeckLevel`
* `CompartmentAvailability`
* `CompartmentPreSelection`
* `ContinuousServiceAvailabilityScope`
* `ContinuousServiceBookingPart`
* `ContinuousServiceOfferPart`
* `ContinuousServicePickUpPlace`
* `ContinuousServiceProcessIndication`
* `ContinuousServiceUsage`
* `ContinuousServiceUsagePatchRequest`
* `ContinuousServiceUsageStatus`
* `ContinuousServiceVehicleAvailability`
* `ContinuousServiceVehicleSelection`
* `ContinuousServiceVehicleType`
* `ContinuousServicesAvailabilityResponse`
* `CurrencyConversion`
* `DeckAvailability`
* `GraphicElement`
* `GraphicElementCode`
* `GridPosition`
* `Orientation`
* `PlaceAvailabilityMapRequest`
* `PlaceAvailabilityMapResponse`
* `PlaceGroup`
* `PlaceLayout`
* `PlaceRestriction`
* `PlaceSelectionFlow`
* `ProductSearchRequest`
* `ProductSearchResponse`
* `ProductTagGroup`
* `ProductTagName`
* `ProductTagsResponse`
* `RectangleGeometry`
* `ReductionGranted`
* `ReservationReference`
* `ServiceIcon`
* `ServiceIconCode`
* `SpecificPlaceAvailability`
* `Tip`
* `VehicleAvailability`

## Modified Objects

* `AbstractBookingPart`: added property `pricingStatus`
* `AdditionalOfferCollectionResponse`: added property `_links`
* `Admission`:
  * deprecated property `isReservationRequired`
  * added property `regionalValidity`
* `AdmissionOfferPart`:
  * deprecated property `isReservationRequired`
  * added property `regionalValidity`
* `AfterSalesOverrideDetails`: renaming a property to fix typo
  * added property `initialAfterSalesConditions`
  * deprectaded property `initialAftersalesConditions` 
* `AvailablePlacePreferences`: deprecated property `graphicalReservation`
* `BookedOffer`: added property `continuousServices`
* `BookingCleanupRequest`: deprecated properties `overruleCode` and `refundDate`
* `CoachLayoutCollectionResponse`: added property `_links`
* `DocumentCollectionResponse`: added property `_links`
* `ExchangeBreakdownItem`:
  * added property `amountToBePaid`
  * specified behaviour for `exchangePrice` and `refundableAmount`
* `ExchangeOffer`:
  * added properties `amountToBePaid` and `appliedOverruleCode`
  * specified behaviour for `exchangePrice` and `refundableAmount`
* `Fare`: added property `accountingRef`
* `Fulfillment` added property `continuousServiceUsage`
* `FulfillmentActivationPatchRequest`: added property `continuousServiceVehicleSelection`
* `FulfillmentCollectionResponse`: added property `_links`
* `Offer`: added prperty `continuousServiceOfferParts`
* `PlaceAvailabilityCollectionResponse`: added property `_links`
* `PlaceSelection`: deprecated property `tripLegCoverage`
* `Price`: added property `appliedCurrencyConversion`
* `ProductCollectionResponse`: added property `_links`
* `Purchaser`: added description constraint about `companyDetails` and `detail`
* `PurchaserSpecification`:
  * added description constraint about `companyDetails` and `detail`
  * required constraint removed from property `detail`
  * nullable option added for properties `companyDetails` and `detail`
* `ReductionCardCollectionResponse`: added property `_links`
* `ReductionCardType`: added property `reductionsGranted`
* `Reservation`:
  * deprecated property `graphicalReservationSupported`
  * added property `supportedPlaceSelectionFlows`
* `ReservationOfferPart`: added property `supportedPlaceSelectionFlows`
* `StopCallStatus`: added property `isBorderPoint`
* `ZoneCollectionResponse`: added property `_links`

## Modified Enum

* `BookingPartType`: added `CONTINUOUS_SERVICE`
* `IndividualMode`: items added (OJP)
* `OfferPartType`: added `CONTINUOUS_SERVICE`
* `PTMode`: items added (see code lists)
* `ReimbursementReason`: items added (see code lists)
* `TravelAccountType`: items added (see code lists)
* `TravelDirectionType`: 
  * items added (see code lists)
  * added behaviour details
