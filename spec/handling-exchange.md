---
layout: page
title: Handling Exchange
hide_hero: true
permalink: /spec/account-based-ticketing/
---

## Table of contents

1. [Introduction](#introduction)
3. [Process](#process)


## Introduction <a name="introduction">

An exchange manages the exchange of parts of a booked offer or a complete booked offer with new booking parts in a new booked offer. 
An exchange may apply exchange fees to the existing booked offer.

An exchange may remove, add or replace transportables, replace or remove trips or parts of trips or change the service. 

Note: The use case that only removes parts must not be implemented as exchange, but as refund.

## Process <a name="process">

The exchange start with a request for an exchange offer. The requests specifies the changed parts of an offer.

Note: As in an initial offer there is no possibility to retrieve the offer again, offers will alwas be recreated as entirely new offers. In case a client wants to 
refere to the offer later-on he has to store it himself.

'POST /bookings/{bookingId}/exchange-process' is used to select and prebook an exchange offer. This will creates an ExchangeProcess object and a new booked offer in prebooked state. The ExchangeProcess keeps the references to the exchanged booking parts, the invalidated old fulfillments, the new BookedOffer and the applied fees. It also provides the summary and detailed breakdown on the amounts of fees and new payments.

The ExchangeProcess is kept as part of the old booked offer after the exchange has been completed to document the booking history.

The ExchangeProcess will document the used payment methods during the exchange process. The payment method is set by the patch booking call.

As the status of the exchange is changed by call on the level of the booking by 'POST /bookings/{bookingId}/fulfillments' it is not allowed to have two ongoing ExchangProcesses at the same time.






