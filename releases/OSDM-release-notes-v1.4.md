---
layout: page
title: OSDM Release Version 1.4
hide_hero: false
permalink: /releases/OSDM-release-notes-v1.4/
---

## What's New In OSDM Version 1.4

The following features have been added with version 1.4 of OSDM.

### Booking Synchronization Management

If there is change in a trip or a booking, we have added an API that a carrier/allocator system can inform a distributor about that fact, that a trip or a booking has changed. The distributor can then itself inform a passenger or the buyer e.g. a travel agency about changes to its booking.

The API consists of a set of **webhooks** that allow to send **events** about changes which involve e.g. *trip cancelled*, *booking cancelled* or *seat changed*. See [Booking Synchronization Management](../spec/booking-synchronization-management) for details.

### Added Support for Paperless Complaint Management

For a customer it must be possible to submit a claim for a booking or parts of it (e.g. in case of a return trip) where the service has not been provided as promised. This includes delays of trains as well as service derogation (e.g. first class not available, ...).

OSDM now provides an online API to submit a complaint for a booking which can be implemented by any distributor to digitize this process. See the `/complaints` resources for details.

### Reduction cards  made available to ticket vendors

Reduction cards are now available to ticket vendors to be used for selecting the cards for requests and in customer profiles.

### Add the responsible TCOs in the booking data

New we can support cases where the ticket control organization (TCO) to control tickets is different from the fare provider.

### Option to indicate CarrierConstraints at the level of RegionalValidity and ViaStation

This feature on the OSDM offline part of the specification allow to indicate CarrierConstraints at the level of RegionalValidity and ViaStation in the fare.

### Travel validity depending on boarding time only

Some special tickets define a travel validity based on the boarding time only. These tickets are the valid on that train until the traveler leaves the train.

E.g. Eurail tickets on specific night trains where the Eurail ticket must be valid at boarding time only and the passenger can stay on the train until his destination on the next day.


Other work addressed includes:

- Improving the API's description
- Fixing minor inconsistencies
- Incorporating feedback from the first implementors
- Setting up a mock infrastructure as well as writing actual mocks
- Best Practices concerning non-functional requirements