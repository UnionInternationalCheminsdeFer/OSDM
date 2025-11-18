# Changelog for OSDM 3.5.5

## Modified Objects

- Deprecate `appliedReductions` in `AbstractBookingPart`
- Add a `DistributionMode` object, to indicate whether a reservation is in PRODUCT_MODE or FARE_MODE
- In `Fare`, deprecate `availablePlaces`, `placeSelection`, and `placeAllocation` and `availablePreferences`
- Add a `distributionMode` in `Reservation` to indicate whether a reservation is used a fare or as a product