# Breaking changes since 2.0

1. In order to avoid having to add a products list to all of the different
   response objects which could contain an offer, we decided to add the list of
   products to the Offer object, i.e. `Offer` now contains a products attribute
   which is an array of `Product` objects. Also, any response objects (e.g.
   `OfferCollectionResponse`) which now have the product list beside the offer
   list should have the product list removed as it is redundant. To be
   consistent, within the `Booking` object, the products list should also be
   moved from the Booking object level into the `BookedOffer` object.
   (2022-12-09)
2. Removed `nutsCodes` and `places` from `OfferSearchCriteria` and moved to
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
10. Remove `name` from `PlaceRefs
11. Remove inheritance from `ExchangeOfferRequest` and `ExchangeOfferResponse`
12. Remove inheritance from `PersonSearchReuest` and `CompanySearchRequest`
