---
layout: page
title: Account Based Ticketing
hide_hero: true
permalink: /spec/account-based-ticketing/
---

## Table of contents

1. [Introduction](#introduction)
2. [Use Cases](#usecases)
3. [Processes](#processes)
4. [Activation of a Pass](#pass-activation)

## Introduction <a name="introduction">

The processes and the OSDM features to implement account based ticketing are
described.

OSDM supports the booking process where all or part of the offer and booking is
made on an existing account of a provider. OSDM does not implement the creation
of an account.

Travel accounts in OSDM can be:

- **TravelPassAccount**

  A travel account valid in a region. The travel account includes the region and
  the usage.

- **MultiRideAccount**

  A travel account valid in a region but with a limited number of rides. The
  travel account includes the region, the balance on used rides and the usage.

- **ReductionCardAccount**

  A reduction card used as travel account, e.g. cards providing free travel. The
  travel account contains the reduction card type.

All travel accounts include:

- the issuer of the account
- the person owning the account
- the number identifying the account

The usage on an account can be in money or any self-defined unit.

## Use Cases <a name="usecases">

### View the current usage on a travel account

API endpoint `GET /travel-accounts/{id}` returns the detail of the account
including history of usage as an array of `TravelAccountConsumption`s
(`TravelAccountUsage`s since OSDM 4.0).

`Fulfillment.availableUsage` on the opposite, details remaining usage to be
spend on travel or further bookings using given travel account.

### Getting offers related to a travel account

The travel account can be provided as part of the anonymous passenger
information. As a travel account is personal data the travel account must be
provided only in case it is needed.

`TravelAccount.number` relates to `Fulfillment.controlNumber` in case of passes.
This number is to be provided as part of `AnonymousPassengerSpecification.cards`
collection in `CardReference.number property` and `CardReference.type` must
correctly indicate whether it is `TRAVEL_PASS`, `MULTI_RIDE` product or
undisclosed `LINKED_TICKET`.

### Booking offers related to a travel account

The travel account is provided with the passenger data as a card reference. This
will lead to an update of the booking with a reduced price if applicable and an
indicated usage in the booking parts with the amount to be paid on the account.

### Refund of booking made on a travel account

The refund offer provides the refund amount for the price exchanged via the API
consumer only. The refund on the account needs to be seen from the description
of the refund summary.

## Processes <a name="processes">

### Activation of a Pass <a name="pass-activation">

When an admission pass product is purchased, the final status is `AVAILABLE` not
`FULFILLED`. Such fulfillment will not be accepted during the ticket control
unless it is activated. Respective information needed for activation vary and
validation is done by the provider.

For example, pass with quota of 5 travel days within 30-day travel window, may
request to provide start of usage date, and days to be spent from the quota.

`PATCH /fulfillments/{{THE PASS FULFILLMENT ID}}`

```json
{
  "startOfUsage" : "2025-08-31",
  "travelDates" : [ "2025-09-01" ]
}
```

Given example sets beginning of the travel windows to 31.08.2025 and spends one
day from the quota on 01.09.2025. When successful, Fulfillment.status changes
from `AVAILABLE` to `FULFILLED` and the passenger can travel on given date. The
status may also change to `CHECKEDID` following one or more ticket control
events.

Fulfillment updates its available usage based on the activation, or updates of
the activation.

`GET /fulfillments/{{THE PASS FULFILLMENT ID}}`

```json
{
  "id" : "{{THE PASS FULFILLMENT ID}}",
  "controlNumber" : "EXAMPLE-01",
  "availableUsage" : {
    "travelDates" : [
      "2025-09-02",
      ...,
      "2025-09-29"
    ]
  }
}
```

Travel accounts indicates the first usage of the pass.

`GET /travel-accounts?travelAccount=EXAMPLE-01`

```json
{
  "objectType" : "TravelPassAccount",
  "number" : "EXAMPLE-01",
  "consumptions" : {
    "consumedOn" : "2025-09-01",
    "unit" : "DayTravelAccountUnit",
    "consumedAmount" : 1
  }
}
```

Purchaser can patch the fulfillment to set remaining travel dates, regardless of
status `FULFILLED` or `CHECKEDIN`. Status doesn't change.
