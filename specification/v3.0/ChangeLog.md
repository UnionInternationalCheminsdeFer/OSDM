# Version 3.0.2
  - `FareConnectionPointRef`:
    - remove relation to FareConnectionPoint
  - `ServiceTime`
    - make `estimatedTime`  and `actualTime` optional
  - `FulfillmentDocumentType`:
    - add TRAVEL_ACCOUNT_REDUCTION, TRAVEL_ACCOUNT_PASS, TRAVEL_ACCOUNT_MULTI_RIDE 
    - add optional issuer
    - make BookingPartReference optional
  - add `AppliedPassenger` and `ActualPassengerType` (I-76)
  - `Product` and `FulfilmmentPart`: add `TextElement` (I-76)
  - add `symbiology` to `SecurityFeatureType` (I-76)
  - add `name` to `CardTypeReference` optionally (I-76)
  - add overrule code to `ReleaseOfferRequest` (I-77)
  - add DISRUPTION, JOURNEY_OBOSOLETE, CERTIFIED_MECIDAL_CONDITION and 
    DELAY_ COMPENSATION (I-77)
  - added `transcationId` to `PaymentMethod` (I-77)
  - added `numericAvailabilityPrivateCompartments` to `ReservationOfferPart`
  - added `issuedVouchers` to `Booking`, `FulfillmentConnectionResponse`, `RefundOffer` and `ExchangeOperation` 