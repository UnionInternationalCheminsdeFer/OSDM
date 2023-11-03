# Version 3.1.0

## Changes to Resources

- added a resource to remove a passenger and her admissions from a preBooked
  offer:

  `DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/passengers/{passengerId}`

- added a resource to split bookings:

  `POST /bookings-split`

- added a service to delete an admission:
  
  `DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/admissions/{admissionId}`


  
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

- Added optional `taxId` to `PersonDetail`

- Added optional `ProductType` to `Product`

- Added optional `externalTripRef` to `Section`

- Added optional `bookingPartRef` to `BookingPart`

- Added optional `productRef` in `Fee`

- Added optional `refundAmount" in `BookingParts`

- Added `icon` in `CoachLayoutPlace`

- Added optional `number` in `Compartment` 

- Added optional breakdown of fees on refund offers and exchange offers - refund/exhangeFee, refundAmout/exchangePrice, bookingParts

- Added optional `bookedOfferIds` in `BookedOfferRespose` for additioonal booked offers

## Deprecations

- `PersonDetail.preferredLanguages` - moved to `ContactDetail`
- `PersonDetail.email` - moved to `ContactDetail`
- `PersonDetail.phoneNumber`- moved to `ContactDetail`
- `productCode`

## Removed Deprecations

- `PersonDetail.eMail` - use `PersonDetail.email` instead
- `Fulfillment.status` - only `FulfillmentPart` has status
- `Booking.ticketTimeLimit` - use `Booking.confirmationTimeLimit` instead

# Version 3.0.3

## Changes to Resources

TODO
