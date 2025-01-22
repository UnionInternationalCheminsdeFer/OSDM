---
layout: page
title: Account Based Ticketing
hide_hero: true
permalink: /spec/account-based-ticketing/
---

## Table of contents

1. [Introduction](#introduction)
2. [Use Cases](#usecases)
2. [Process](#process)

## Introduction <a name="introduction">

The processes and the OSDM features to implement account based ticketing are described.

OSDM supports the booking process where all or part of the offer and booking is made on an existing account of a provider. OSDM does not implement the creation of an account.

Travel accounts in OSDM can be: 

- TravelPassAccount

   A travel account valid in a region. The travel account includes the region and the consumption.


- MultiRideAccount

  A travel account valid in a region but with a limited number of rides. The travel account includes the region, the balance on used rides and the consumption.

- ReductionCardAccount

  A reduction card used as travel account, e.g. cards providing free travel. The travel account contains the reduction card type.


All travel Accounts include:

- the issuer of the account
- the person owning the account
- the number identifying the account


The consumption on an account can be in money or any self-defined unit.


## Use Cases <a name="usecases">


### View the current consumption on a travel account

```
    GET /travel-accounts/{id}
 ```
returns the TravelAccountConsumption.

### Getting offers on a travel account

As a travel account is personal data it is not possible to request offers directly with a travel account.

### Booking offers on a travel account

The travel account is provided with the passenger data as a card reference. This will lead to an update of the booking with a reduced price if applicable and 
an indicated consumtion in the booking parts with the amount to be payed on the account.

### Refund of booking made on a travel account

The refund offer provides the refund amount for the pice exchanged via the API consumer only. The refund on the account needs to be seen from the description of the refund summary.
