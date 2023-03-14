# Breaking changes since 2.0

## Changes with High Semantic Impact

1. In order to avoid having to add a products list to all of the different
   response objects which could contain an offer, we decided to add the list of
   products to the Offer object, i.e. `Offer` now contains a products attribute
   which is an array of `Product` objects. Also, any response objects (e.g.
   `OfferCollectionResponse`) which now have the product list beside the offer
   list should have the product list removed as it is redundant. To be
   consistent, within the `Booking` object, the products list should also be
   moved from the Booking object level into the `BookedOffer` object.
   (2022-12-09)

## Smaller Changes 

1. Consistent use of kebab-case for path segments
2. Consistent use of HTTP `Cache-Control` instead of `Expires` HTTP header
3. Removed `nutsCodes` and `places` from `OfferSearchCriteria` and moved to
   `NonTripOfferSearchCriteria`(2023-01-13)
3. Removed `Purchaser.Id` (2023-01-20)
4. Changed `Exchange.fulfillments` to `Exchange.exchangedFulfillmentIds`
   (2023-01-13)
5. **PATCH** is replaced with **POST** in the exchange resource.
6. **PATCH** is replaced with **POST** both for ancillaries and reservations in
   the BookingParts resource.
7. Rename `bookedOffer` to `bookedOffers` in resource paths
8. Remove `ServiceAttribute` (2023-02-17)
9. Refactor `Place`
10. Remove `name` from `PlaceRefs`
11. Remove inheritance from `ExchangeOfferRequest` and `ExchangeOfferResponse`
12. Remove inheritance from `PersonSearchReuest` and `CompanySearchRequest`
13. `ReductionCard` object was renamed to `ReductionCardType`, response of the master data endpoint was simplified and there is no longer a delivery date.
14. `AnonymousPassengerSpecification.cards` has reworked structure of `CardReference` that can now refer both master CardTypeReference and any TravelAccount.
15. Modified and cleared login on validFrom/validUntil on `Offer` and `OfferPart` level
16. `Offer.validTo` changed to `Offer.preBookableUntil`
17. `Booking.providerBookingRef` renamed to `Booking.externalRef`
18. Date time format on various places defined using regular expression (breaks compatibility on code-generation level)
