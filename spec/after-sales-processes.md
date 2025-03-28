---
layout: page
title: After Sale Processes
hide_hero: true
permalink: /spec/after-sales-processes/
---

## Table of contents

1. [Introduction](#introduction)
2. [Overview of Services](#overviewOfServices)
3. [Overview of After Sale Processes](#overviewOfProcesses)
4. [After Sales Processes](#afterSalesProcesses)
   1. [Refund](#refund)
   2. [Release a Booking](#releaseBooking)
   3. [Partial Refund](#partialRefund)
   4. [Cancel Fulfillment](#cancelFulfillment)
   5. [Exchange](#exchange)
   6. [Complaint](#complaint)
   7. [Reimbursement](#reimbursement)
   8. [Card Replacement](#cardReplacement)

## Introduction <a name="introduction">

This page explains the available after sales processes and their implementation
in OSDM.

The main purpose is to get a quicker understanding of the API and its underlying
concepts. As such, some of the details of how the information is structured in
the API are not represented in full detail.

Please be advised that after the confirmation of the refund and exchange
operation or addition of an offerPart to the booking, the retailer or
distributor must update the fulfillments and documents (e.g. receipts) and the
API consumer is required to take an action to retrieve the full booking to
retrieve it.

## Overview of Services for After Sales <a name="overviewOfServices">

| Resources                                          | Description                                                   |
| -------------------------------------------------- | ------------------------------------------------------------- |
| `/bookings/{bookingId}/reimbursements`             | resources to reimburse unused tickets                         |
| `/bookings/{bookingId}/release-offers`             | resources to release tickets                                  |
| `/bookings/{bookingId}/cancel-fulfillments-offers` | resources to cancel fulfillments                              |
| `/bookings/{bookingId}/refund-offers`              | resources to get and accept a refund offer                    |
| `/bookings/{bookingId}/exchange-operations`        | resources to get and accept a exchange offer                  |
| `/bookings/{bookingId}/exchange-offers`            | _dito_                                                        |
| `/bookings/{bookingId}/release-offers`             | resources to get, accept or delete a release offer            |
| `/bookings/{bookingId}/cancel-fulfillment-offers`  | resources to get, accept or delete a cancel fulfillment offer |
| `/complaints`                                      | resources to create and manipulate complaints                 |

## Overview of After Sales Processes <a name="overviewOfProcesses">

After sales processes operate on and potentially change already confirmed
booking parts.

| Resources          | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| ------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Refund             | The refund flow cancels one or more confirmed booking parts. The after sales rules on refund initiated by the purchaser apply unless the request is made with an overrule code. The refund with overrule code can be used to handle compensation payments in cases where the claim can be accepted automatically and the passenger is the purchaser (compensation needs to be paid to the traveler).                                                                   |
| Release            | The release flow removes the permission to travel and releases technical resources blocked by the booking (e.g. seats on a train). The release does not provide the refund amounts to the purchaser. A release needs to be completed later on by a refund to provide the refund amount to the purchaser. A release can be initiated by a company different from the original retailer. The time of the release defines the time for the calculation of refund amounts. |
| Partial Refund     | A partial refund is triggered by the passenger. The refund might include some of the travelers, a section of the trip or one half of a return trip. Depending on the commercial conditions this might require an exchange of some or all fulfillments.                                                                                                                                                                                                                 |
| Cancel Fulfillment | The cancel fulfillment flow cancels a fulfillment to recreate it. This might be necessary in case of secure paper and printer errors where the printed ticket has to be regenerated with a specific paper stock control number.                                                                                                                                                                                                                                        |
| Exchange           | The exchange flow replaces the old booking parts with new booking parts usually for a different trip. This is usually triggered by a request of the purchaser but might also be triggered by a retailer in case of cancelled services. In this case the overrule code is used.                                                                                                                                                                                         |
| Complaint          | A complaint is filed by the traveler due to a service that was not provided as promised. The handling of complaints is subject to deadlines defined by the EU PRR. The payments for complaints must be made to the passenger, not to the purchaser.                                                                                                                                                                                                                    |
| Reimbursement      | A reimbursement flow handles refunds where the purchaser needs to provide additional proof or investigation. This concerns usually refunds due to unused or partially unused tickets. The refunded amount is provided to the original purchaser.                                                                                                                                                                                                                       |
| Card Replacement   | A replacement of a physical ticket or card. This does not apply to electronic tickets.                                                                                                                                                                                                                                                                                                                                                                                 |

## After Sales Processes <a name="afterSalesProcesses">

### Refund <a name="refund">

#### Request a Refund Offer

![Request a Refund Offer](../images/processes/seq-request-a-refund-offer.png)

On a confirmed booking, and if it is allowed, after sales operations are also
possible via the OSDM API. In OSDM, the refunds are taking place based on
fulfillment resources. There is no partial refund of one fulfillment possible.
This also means that in case of collective ticketing, all passengers will be
refunded in one go.

In order to perform a refund, the API consumer first has to create a refundOffer
in the booking where the fulfillments to refund are located with a
`POST refundOffer`. If the set of fulfillments provided is a valid set for
refund, the operation creates a refundOffer that contains the information that
is relevant to the refund operation at the moment the refund offer was created.
This includes information such as the amount that will be refunded, any
potential refund fee, etc (see the model for more details).

A provider may return multiple refundOffers for the same request, which may
differ e.g. in the validity time (validFrom/validUntil attribute pair) or in the
reimbursement method (e.g. lower refund fee when a voucher is accepted).

However, a provider **may not** return multiple refundOffers for a request to
refund multiple fulfillments where each of the returned refundOffers only covers
a subset of the requested fulfillments. In other words, the refundOffers returned
must always cover **all** of the still refundable fulfillments from the refundOffer
request.

#### Cancel a Refund Offer

![Cancel a Refund Offer](../images/processes/seq-cancel-a-refund-offer.png)

#### Confirm a Refund Offer

![Confirm a Refund Offer](../images/processes/seq-confirm-a-refund-offer.png)

In case of multiple refundOffers for the same set of fulfillments, confirming
one of them will delete the other refundOffers for the same set of fulfillments.

Once a `refundOffer` has been confirmed, it still can be retrieved via a
`GET /bookings/{bookingId}` request.

The attribute refundableAmount of confirmed refundOffers will contain the
refunded amount of this particular refund.

#### Multiple Refund Offers

Once a `refundOffer` has been successfully requested, no more refundOffers can
be requested until the original refundOffer(s) have either been (a) cancelled
(b) confirmed or have (c) expired (i.e. the "validUntil" time has passed).

### Release a Booking <a name="releaseBooking">

#### Request a release Offer

![Request a Release Offer](../images/processes/seq-request-a-release-offer.png)

The release of a ticket is an intermediate step towards a refund. The release
invalidates the admission and frees resources such as reserved seats. It does
not refund the money to the customer as this is done later on at the retailer.
This intermediate step allows other parties to initiate the refund process (e.g.
one of the involved carriers) and to reuse the resources. The customer benefits
as the time for calculating the refund amount wll be the time of the release.

The process of releasing a ticket is similar to the refund process. A release
offer is requested and needs to be confirmed to be applied.

#### Cancel a Release Offer

![Cancel a Release Offer](../images/processes/seq-cancel-a-release-offer.png)

#### Confirm a Release Offer

![Confirm a Release Offer](../images/processes/seq-confirm-a-release-offer.png)

### Partial Refund <a name="partialRefund">

Partial refunds of passengers and booking parts included in one fulfillment
(collective ticketing) are possible with version 3.2 onwards. The parts to be
refunded need to be specified in the RefundSpecification.

A partial refund results in new fulfillments after the confirmation of the
refund offer and booking.

### Cancel Fulfillment <a name="cancelFulfillment">

#### Cancel Fulfillment request

![Request a cancelFulfillment Offer](../images/processes/seq-request-a-cancelFulfillment-offer.png)

A fulfillment can be cancelled and regenerated. This might be necessary in case
of fulfillments linked to physical items (secure paper, phones or cards). The
cancelled fulfillment can be recreated later on.

To cancel a fulfillment a cancel fulfillment offer needs to be requested. This
offer can be confirmed to delete the fulfillment.

#### Cancel a CancelFulfillment Offer

![Cancel a Cancel a cancelFulfillment Offer](../images/processes/seq-cancel-a-cancelFulfilment-offer.png)

#### Confirm a CancelFulfillment Offer

![Confirm a CancelFulfillment Offer](../images/processes/seq-confirm-a-cancelFulfillment-offer.png)

### On Hold Bookings <a name="onHoldBookings">

An unconfirmed booking will expire after the time limit of the booking. An
extension of the time limit can be requested as a `OnHoldOffer`. The offer can
be requested and needs to be confirmed to extend the time limit. The
`OnHoldOffer` might be subject to a fee.

### Example End-to-end Interaction <a name="exampleEnd-To-End">

![Example End to End Interaction](../images/processes/seq-end-to-end-interaction.png)

### Exchange <a name="exchange">

#### Requesting an exchange offer

Requesting an exchange offer is almost identical to requesting a standard offer.
The only difference in the request is that the fulfillment that the API consumer
wants to exchange, and an overrule code if relevant, are also provided.

The exchange flow is following:

- `POST /exchange-offers` to get alternative exchange offers (exchange
  operations) for the given fulfillments
- `POST /bookings/{bookingId}/exchangeOperations` with selected exchange offer
  with a. information what to change on current booked offers, or b. to put a
  new offer (exchange operation) to the booking
- `PATCH /bookings/{bookingId}/exchangeOperations/{exchangeOperationId}` to
  confirm the exchange. This will release the original booking parts and confirm
  parts offered in the exchange operation.
- `POST /bookings/{bookingId}/fulfillments` to issue the new fulfillments for
  exchanged booking parts.
- Optionally `PATCH /bookings/{bookingId}/fulfillments` if the asynchronous
  fulfillment requires that.

It is a good practice to execute
`DELETE /booking/{bookingId}/exchangeOperations/{exchangeOperationId}` to
terminate the exchange operation without confirmation and release booked offers
from the operation.

### Complaint <a name="complaint">

A complaint can be provided on behalf of a passenger. A complaint might concern
a delay of a train or a service degradation on the journey. The handling of a
complaint is subject to the EU PRR and COTIV where minimal compensation amounts
and time lines for the decision of a claim are defined. According to PRR the
customer can decide whether he or she wants to be compensated by money or would
accept vouchers.

The handling of a claim is an asynchronous process, where the claim is placed
and decided by the carriers/fare provides involved later-on.

![Complaint](../images/processes/seq-complaintManagement1.png)

As the distributor is usually also involved as a carrier and then responsible to
keep the legal time lines he can decide to compensate and inform the fare
provides/carriers on his decision if the time line would otherwise can not be
held.

![Complaint](../images/processes/seq-complaintManagement2.png)

### Reimbursement <a name="reimbursement">

Customers who have bought a ticket which allows reimbursement and which have not
traveled or traveled partially only can claim to be reimbursed. The customer
must prove that he has not or only partially used the ticket. A partial use
might be a only a part of the trip was traveled or only some of the travelers
were traveling or a combination of both.

The non use of a ticket might be proven by documents that were provided to the
passenger on a train or at a station. This prove can also be provided in
electronic form by a carrier or TCO (UIC IRS 909181-4 / TAP-TSI B.14).

The customer must be able to make the reimbursement claim via a retailer to the
distributor which needs to request the reimbursement from the involved fare
providers / carriers.

The reimbursement process is very similar to the complaint process where instead
of a complaint a reimbursement request is created. If the reimbursement request
is valid the special overrule code `TICKET_UNUSED` can be used in the refund
process to refund otherwise non-refundable bookings.

### Replacement of lost tickets and cards <a name="cardReplacement">

The replacement flow is used to replace physical cards and tickets. There is no
replacement for electronic tickets or anonymous tickets.

#### Requesting a replacement for a lost ticket

The replacement flow is requested similar to the request for a non-trip based
offer. The search tags must include the tag `CARD_LOST` or `TICKET_LOST`. The
provider will ask for the required data of the lost card or ticket to be
provided with the passengers card data (card number).

The offer for a replacement returned might include a fee. The replacement offer
needs to be accepted and booked the same way as a usual offer.
