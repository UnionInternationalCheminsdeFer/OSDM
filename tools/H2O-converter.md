---
layout: page
title: Hermes/Hosa to OSDM (H2O) converter
permalink: /tools/H2O-converter/
---

## Aim

The aim of this online converter is to build a migration path from the Hermes/Hosa
protocol to OSDM. Thus if a railway does not support OSDM yet the **Hermes Hosa to
OSDM (H2O) Converter** ensures that it can connect to railways supporting OSDM.
Conversely, if a railway only supports OSDM it guarantees that it can connect to
railways supporting Hermes Hosa only.

## Initial Analysis

The initial analysis has focused on proving the feasibility of the approach.

### Conversion Hermes Hosa to OSDM

This conversion is simple as can be seen in the following table for an MVP

| Use Case | Hermes Hosa | OSDM     |
|----------|-------------|----------|
| get reservations offers / fare list | `AvailabilityRequest` | `POST /offers(searchCriteria)` or `POST /offers(tripSpecification)` depending on the Hermes version used |
| get reservation offer   | `BookingRequest` with `informationOnly=true` | `POST /offers(searchCriteria)` or `POST /offers(tripSpecification)` depending on the Hermes version used  |
| book offer              | `BookingRequest` | `POST /bookings` followed by `POST /booking/{bookingId}/fulfillments` |
| cancel booking          | `CancelRequest` with `reason code` | `POST /bookings/{bookingId}/refundOffers` followed by `PATCH /bookings/{bookingId}/refund-offers/{refundOfferId}` to confirm the offer and  `DELETE /bookings/{bookingId}/refund-offers/{refundOfferId}` in case of technocal problems.|
| refund booking          | `CancelRequest`  |  `POST /bookings/{booking}/refundOffers` followed by `PATCH /bookings/{bookingId}/refund-offers/{refundOfferId}` to confirm the offer and  `DELETE /bookings/{bookingId}/refund-offers/{refundOfferId}` in case of technocal problems |
| technical rollback | `synchro request` | `DELETE /bookings/{bookingId}`|

SBB has the business need to support this conversion process and is working with
[Hitrail](https://www.hitrail.com/) to build such a converter.


Additional use cases implemented in Hermes require more OSDM messages:

| Use Case | Hermes Hosa | OSDM     |
|----------|-------------|----------|
| booking with personal data | `BookingRequest` including personal data | `PATCH /bookings/{bookingId}/passengers/{passengerId}`  |
| partial cancellation / reducing the number of passengers | `ParcialCancellationRequest` | `POST /bookings/{booking}/refundOffers` followed by `PATCH /bookings/{bookingId}/refund-offers/{refundOfferId}` to confirm the offer and  `DELETE /bookings/{bookingId}/refund-offers/{refundOfferId}` in case of technocal problems.  |
| exchange booking      | `BookingRequest` including an exchange reference to the original booking  | `POST /bookings/{bookingId}/exchange-offers` followed by `POST /bookings/{bookingId}/exchange-operations` to select the exchange offer and `PATCH /bookings/{bookingId}/exchange-operations/{exchangeOperationId}` to confirm it. `DELETE /bookings/{bookingId}/exchange-operations/{exchangeOperationId}` is needed for cleanup in case of technical problems. |
| ticket download | `BookingReply` including a download link (depending on the Hermes version in use)  | `PATCH /bookings/{bookingId}/fulfillments` and `GET /fulfillments/{fulfillmentId}` |


### Technical Uses Case

*Use Case*: Replacement Proposal for trains in exterior inventories.

Solution sketch: If OSDM is asked for a `TripOffer` where the train it returns an error
message containing the inventory. The H2O converter then transform this to a 
`ReplacementProposal`.

### Conversion OSDM to Hermes Hosa

This conversion is more complex, especially mapping the `/trips-offers/` calls to
`BookingRequest` efficiently. If some restrictions on possible reservations are
taken however the converter can be realized.

A detailed specification will conceptual work for the conversion is ongoing.

In parallel, the business need for this form of conversion is being evaluated.

![Hitrail](../../images/logo/Hitrail-logo.png)
