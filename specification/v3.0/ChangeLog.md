# Version 3.0.2

- `FareConnectionPointRef`:
  - remove relation to FareConnectionPoint
- `ServiceTime`
  - make `estimatedTime` and `actualTime` optional
- `FulfillmentDocumentType`:
  - add optional issuer
  - make BookingPartReference optional
- add `AppliedPassenger` and `ActualPassengerType` (I-76)
- `Product` and `FulfillmentPart`: add `TextElement` (I-76)
- add `symbology` to `SecurityFeatureType` (I-76)
- add `name` to `CardTypeReference` optionally (I-76)
- add overrule code to `ReleaseOfferRequest` (I-77)
- add DISRUPTION, JOURNEY*OBSOLETE, CERTIFIED_MEDICAL_CONDITION and DELAY*
  COMPENSATION (I-77)
- added `transactionId` to `PaymentMethod` (I-77)
- added `numberOfPrivateCompartments` to `ReservationOfferPart`
- added `issuedVouchers` to `Booking`, `FulfillmentConnectionResponse`,
  `RefundOffer` and `ExchangeOperation`
- added EXCHANGED to `FulfillmentStatus`
- added `confirmationTimeLimit` and deprecated `ticketTimeLimit` on `Booking`
- made `ReleaseOffer.confirmedOn` optional
- fixed `LOYALTY` misspelling

## OpenAPI Generator tweaks

Because of a bug in the OpenAPI generator in case of inheritance and optional attributes `nullable: false` had to be tweaked on the following classes and attributes:

- AbstractBookingPart
  - summary
  - validUntil
  - confirmedOn
  - distributorBookingRef
  - retailerBookingRef

- AbstractOfferPart
  - summary
  - validUntil
  - priceGuaranteedUntil
  - numericAvailability
  - tripTags
  - returnTags
  - isReusable
  - requestedInformation

- Place
  - alternativeIds
