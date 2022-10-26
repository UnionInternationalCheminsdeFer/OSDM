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
- Change of seat, couchette,.. in the booked offer
- Option to extend the booking time limit (OnHold)
- Option to release tickets as an intermediate step for a refund
- Option to cancel a fulfillment
- Reimbursement of unused tickets
- Booking Search

### Terminology aligned with TAP-TSI

To align with the TAP-TSI, the terminology has been revised:

- **Ticket Vendor/Distributor** --> **Retailer**
- **Allocator** --> **Distributor**

### Unified Trip-Offer and Non-Trip-Offer Search

The resource to request offers is now the same for trip-based offers and
non-trip-based offers.

### New resource to retrieve availabilities for reservations

The resource to retrieve availabilities for reservations (free seats, available
seat type,..) is now separate from the booking. The bookingId is a parameter
that limits the available seats to those compliant with the booking.

### Change of seats

Changing the seat in a reservation has been made possible within a reservation
in a booking.

### Extending the booking time limit

It is now possible to offer an extension of the booking time limit for an
unconfirmed booking. This offer might come with a fee.

### Release bookings

It is now possible to release bookings as a preliminary step to a refund. This
step invalidates the tickets and frees resources such as seats. It fixes the
time stamp used to calculate refund fees. The refund of money to the customer is
not part of the release step.

### Cancel fulfillment

It is now possible to cancel and redo a fulfillment.

### Reimbursement

The reimbursement of unused tickets has been added implementing a similar work
flow as for complaints.

### Booking Search

A search for bookings was added.

### Support for Vouchers as Payment Method

As voucher can be issued as part of the complaint management process, they can
newely be used to pay for a booking.

### Various improvements to support the Swedish market

As the Swedish market has choosen OSDM to be the standard for retailers and
distributors, various improvements have been added to fully cover their needs.

Other work addressed includes:

- Improving the API's description
- Fixing minor inconsistencies
- Incorporating feedback from the first implementors
