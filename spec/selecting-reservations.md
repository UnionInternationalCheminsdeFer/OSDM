---
layout: page
title: Handling Reservations
hide_hero: true
permalink: /spec/handling-reservations/
---

## Table of contents

- [Table of contents](#table-of-contents)
- [Introduction](#introduction)
- [Mandatory and Optional Reservations](#mandatory-and-optional-reservations)
  - [Example 1: A reservation is mandatory on both legs, A-B and B-C.](#example-1-a-reservation-is-mandatory-on-both-legs-a-b-and-b-c)
  - [Example 2: A reservation is mandatory on leg B-C, the reservation leg on A-B is optional.](#example-2-a-reservation-is-mandatory-on-leg-b-c-the-reservation-leg-on-a-b-is-optional)
- [Reservation Fees](#reservation-fees)
- [Selecting Places](#selecting-places)
- [Place Reallocation](#place-reallocation)

## Introduction

Reservations are used to allocate seats or berths to passengers, but also hooks
to bicycles and at some carriers to allocate space for items of a passenger
(e.g. prams, cars, motorcycles,..).

Reservations might be sold alongside of admissions or ancillaries but can also
be sold stand-alone if the passenger already has a ticket.

Reservations might come with an additional fee or an additional price or both.
The reservation fee might cover multiple reservations.

## Mandatory and Optional Reservations

For some trains a reservation is mandatory. This might be the case due to
commercial condition or due to legislation.

The possible reservations are provided as offer parts with each offer. The
retailer must provide the correct selection of reservations for booking in order
to have reservations for all trains with mandatory reservations. These rules are
provided with the offer parts in the ReservationRelation Object linked to either
an admission offer part or an ancillary offer part. An ancillary or an admission
can have multiple reservation relations. Each of these needs to be satisfied to
make the booking.

![ReservationRelation Class Diagram](../../images/reservations/reservation-relation.png)

### Example 1: A reservation is mandatory on both legs, A-B and B-C.

Either a simple seat or a luxury seat can be selected.

![Mandatory Reservation A to B to C](../../images/reservations/mandatory-reservation-A-B-C.png)

### Example 2: A reservation is mandatory on leg B-C, the reservation leg on A-B is optional.

Either a simple seat or a luxury seat can be selected.

![Optional Reservation A to B, Mandatory Reservation B to C](../../images/reservations/optional-reservation-A-B-mandatory-reservation-B-C.png)

## Reservation Fees

Reservation fees might be taken per leg or per trip. The reservation fees is
included in the offer as a separate object. All reservations that are subject to
the fee link to the fee via feeRef in the `reservationOfferPart`. The fee is
applied if one of the linked reservations is included in the booking.

If the fee is included in the admission price this can be indicated by the
`isIncluded` flag in the `reservationRelation`.

If reservation is optional the reservation fee will not be included in the
minimal price shown in the offer summary.

![Reservation Fees](../../images/reservations/reservation-fees.png)`

## Selecting Places

The selection of places is a separate optional API calls. There are separate
calls to retrieve:

- a graphical representation of seat availability to provide a graphical UI for
  seat selection (see the process description on graphical reservation)
- the availability of a seat with a specific set of properties
- the availability of seats nearby a referenced seat

The selected seats need to be added to the reservation using a patch.

Selecting seats is optional. If no seat is selected the provider will allocate
them on booking confirmation.

The selection of seats might be subject to fees. This is independent from the
reservation fee to getting a reservation and is applied in case the graphical
selection is used. This fee might depend on the seat and the fee is shown in the
seat availability for the selection. This fee is added to the booking in case of
a selection, so it is not part of the original price and changes the total price
of the offer.

## Place Reallocation

Due to change of material a carrier might have to change the reserved seats.
This is indicated via an Event of type `BOOKING_REACCOMMODATED`. In case the
passengers e-mail address has been provided the carrier will usually inform the
passenger directly.
