# Changes to OSDM v2.0

## Changes in Version 2.0.4

Changes are none breaking.

- Fix `GET /availabilities/nearby`:

  - add `coachNumber` and `placeNumber`

- Fix `PATCH /fulfillments/{fulfillmentId}`:

  - fix query parameter `fulfillmentId`

- Fix `Fulfillment`

  - Deprecate `OfferPartReference` and add `BookingPartReference`

- Correct documentation of `PATCH /bookings/{bookingId}`
  - Updates the booking but does _not_ confirm the booking.
