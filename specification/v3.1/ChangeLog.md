# Version 3.1.0

## Changes to Resources

- added a resource to remove a passenger and her admissions from a preBooked
  offer:

  `DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/passengers/{passengerId}`

- added a resource to split bookings:

  `POST /bookings-split`

- added a resource to get a partial refund offer:

  `POST /bookings/{bookingId}/partial-refund-offers`

## Changes to Classes and Attributes

- Added `Booking.relatedBookings` (split booking)
- Added `BookingSplit`, `BookingSplitGroup`, `BookingSplitRequest`,
  `BookingSplitResponse`

- Added `CoachLayout.gridSize` (fix bug)
- Added `CoachLayoutPlace.icon` (fix bug)

- Added `ContactDetail` to `PassengerDetail`

- Added `PartialRefundOffer`, `PartialRefundOfferRequest` and
  `PartialRefundOfferResponse` (partial refund)

- Added optional `code` to `Problem`

## Deprecations

- `PersonDetail.preferredLanguages` - moved to `ContactDetail`
- `PersonDetail.email` - moved to `ContactDetail`
- `PersonDetail.phoneNumber`- moved to `ContactDetail`

## Removed Deprecations

- `PersonDetail.eMail` - use `PersonDetail.email` instead
- `Fulfillment.status` - only `FulfillmentPart` has status
- `Booking.ticketTimeLimit` - use `confirmationTimeLimit` instead
