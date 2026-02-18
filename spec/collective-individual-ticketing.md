---
layout: page
title: Collective and Individual Ticketing
hide_hero: true
permalink: /spec/collective-individual-ticketing/
---

## Table of contents

1. [General](#General)
2. [Collective and Individual Ticketing in OSDM](#CIinOSDM)
3. [Collective and Individual Pricing in OSDM](#CPinOSDM)

# Collective and Individual Ticketing

## General <a name="General">


| Term                        | description                                                                                                                                  |
| --------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| Collective Ticketing        | The ticket fulfillments generated will include more than one passenger. This cound be all passengers or groups of passengers.                | 
| Individual Ticketing        | The ticket fulfillments generated will include only one passenger per ticket. Additional documents (e.g. receipts) will still be collective. | 
| Collective Pricing          | The booking part includes more than one passenger.                                                                                           | 
| Individual Pricing          | The booking part includes only one passenger.                                                                                                | 

Collective ticketing is applied for various reasons, e.g. limit the number of documents a passenger needs to carry and to simplify the control of tickets on board of a train. In some cases it is usefull to split the tickets into groups, e.g. having one ticket per compartment in night trains. Individual ticketing might be prefered to simplify partial refund as some of the tickets can stay valid or in case of validation by gates.

Collective pricing is independent from collective ticketing. It applies in case the price model does not allow a split of the price among passengers. Even in case of 
collective pricing it is possible to create individual tickets. 

A retailer can request to have Individual or Collective ticketing and pricing via the OfferMode in the 'OfferSearchCriteria', however it is up to the provider to decide whether he provides individual or collective tickets or pricing. 

## Collective and Individual Ticketing in OSDM <a name="CIinOSDM">

With individual ticketing the OSDM provider will provide fulfillments per passenger to provide the tickets. A partial refund of some passengers is possible by providing the fulfillments to be refunded. The remaining fulfillments will stay valid.

With collective ticketing multiple passengers are included in one fulfillment. A partial refund of passengers needs to provide the passengers to be refunded. The fulfillment containing the original passengers becomes invaliud and a new fulfillment is created that containsthe remaining passengers.

## Collective and Individual Pricing in OSDM <a name="CPinOSDM">

With individual pricing the booking parts of the refunded passengers will set to status refunded, whereas the remaining booking parts are unchanged.

With collective pricing the booking part(s) would include more than one passenger. A partial refund of passengers would create a new booking part including the remaining apssengers and the original booking part would be set to status refunded.
