---
layout: page
title: OSDM Release Version 2.0
hide_hero: false
permalink: /releases/OSDM-release-notes-v2.0/
---

## What's New in OSDM Version 2.0

The following features have been added with version 2.0 of OSDM.

- Unified resource for trip based offers and non-trip based offers
- Separate resource to retrieve availabilities for seats, couchettes,... 
- Change of seat, couchette,..  in the booked offer
- Option to extend the booking time limit (OnHold)
- Option to release tickets as an intermediate step for a refund
- Option to cancel a fulfillemnt
- Reimbourcement of unused tickets
- Booking Search


### Unified Trip-Offer and Non-Trip-Offer Search

The resource to request offers is now the same fr trip-based offers and non-trip-based offers.

### New resource to retrieve availabilities for reservations

The resource to retrieve availilities for reservations (free seats, available seat type,..) is now separate from the booking. 
The bookingId is a parameter that limits the available seats to thiose compliant with the booking.

### Change of seats

Changing the seat in a reservation has been made possible within a reservation in a booking. 

### Extending the booking time limit

It is now possible to offer an extension of the bookiung time limit for an unconfirmed booking. This offer might come with a fee.

### Release bookings

It is now possible to release bookings as a preliminary step to a refund. This step invaliadtes the tickets and frees resources such as seats. 
It fixes the time stamp used to calculate refund fees. The refund of money to the customer is not part of the release step.

### Cancel fulfillment

It is now possible to cancel and redo a fulfillment.

### Reimbourcement

The reimbourcement of unused tickets has been added implementing a similar work flow as for claims.

### Booking Search

A seach for bookings was added.


Other work addressed includes:

- Improving the API's description
- Fixing minor inconsistencies
- Incorporating feedback from the first implementors
