# Changelog for OSDM 3.8.0

## New Endpoints

* `GET /promotion-codes`

## Modified Endpoints:

* `DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/passengers/{passengerId}`: path variable `offerId` renamed to `bookedOfferId`

## New Objects:

* `CurrencyAmount`
* `PromotionCodeCollectionResponse`
* `SelectedCompartment`


## Updated Objects

* `AbstractBookingPart`: property `appliedReductions` deprecated
 `AfterSalesConditionsLink`: new property `isProviderFee`, property `products` changed minItems constraint to 0
* `Address`: new property `nameTranslations`
* `Booking`: property `fulfillmentDocuments` added
* `CardReference`: new properties `chipCardContentFormat`, `chipCardContent`
* `CompanyDetail`: new property `contact`
* `Condition`: new property `descriptionTranslations`
* `ExchangeOfferCollectionRequest`: new property `exchangeFee`
* `Fare`: properties `availablePlaces`, `placeSelection`, `placeAllocation`, `availablePreferences` deprecated
* `FareConnectionPoint`: new property `nameTranslations`
* `Fee`: new property `isProviderFee`
* `Fulfillment`: property `fulfillmentDocuments` deprecated, property `fulfillmentDocumentRefs` added
* `FulfillmentCollectionResponse`: property `fulfillmentDocuments` added
* `FulfillmentDocument`: property `id` added
* `FulfillmentResponse`: property `fulfillmentDocuments` added
* `GeneralAttribute`: new property `textTranslations`
* `PaymentMethod`: new property `appliedVoucherAmount`
* `PersonDetail`: properties `firstName`, `lastName` changed to nullable
* `Place`: property `modes` added
* `PlaceSelection`: property `compartments` added
* `Product`: new properties `summaryTranslations`, `descriptionTranslations`, `serviceConstraintTextTranslations`, `carrierConstraintTextTranslations`
* `PromotionCode`: properties `shortDescription`, `description` added
* `RefundSpecification`: new property `refundFee`
* `ReductionGranted`: property `serviceBands` deprecated, property `serviceBrands`added
* `ReservationOfferPart`: new property `distributionMode`
* `Zone`: new property `nameTranslations`

## New Enums

* `DistributionMode`
* `FulfillmentSummaryStatus`

## Modified Enums:

* `RegulatoryCondition`: item `CIT_AJC` added
