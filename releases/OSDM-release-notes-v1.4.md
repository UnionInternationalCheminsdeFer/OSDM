---
layout: page
title: OSDM Release Version 1.4
hide_hero: false
permalink: /releases/OSDM-release-notes-v1.4/
---

## What's New In OSDM Version 1.4

The following features have been added with version 1.4 of OSDM.

### Booking Synchronization

If there is change in a trip or a booking, we have added an API that a carrier/allocator system can inform a distributor about that fact, that a trip or a booking has changed. The distributor can then itself inform a passenger or the buyer e.g. a travel agency about changes to its booking.

The API consists of a set of **webhooks** that allow to send **events** about changes which involve e.g. *trip cancelled*, *booking cancelled* or *seat changed*. See [Booking Synchronization](../spec/synchronization) for details.

### Added A Getting Started Tutorial

The OSDM API is feature rich. The reason for it's richness is that OSDM aims to cover all possible public transportation products and distribution processes within Europe and beyond.

Nevertheless the complete booking flow consist of **three simple REST calls** only, same for refund. To help you getting started we have added a [Getting Starded Tutorial](../spec/getting-started) that gets you up to speed in no time.

### Added Support for Paperless Complaint Management

For a customer it must be possible to submit a claim for a booking or parts of it (e.g. in case of a return trip) where the service has not been provided as promised. This includes delays of trains as well as service derogation (e.g. first class not available, ...).

OSDM now provides an online API to submit a complaint for a booking which can be implemented by any distributor to digitize this process. See the `/complaints` resources for details.

### Differentiate Between Passenger and Buyer

Especially for travel agencies or the B2B business center it's important to distinguish between *buyer* and *passenger*. I.e., a buyer is not always a passenger. Thus we have added the `buyer` the API.

### Add Constraints on Allowed Journey Interruptions

If an open ticket has constrains on how often a journey can be interrupted this fact can now be expressed in the Offline as well as Online Fare data.

### Add Constraints on Multi-Journey Products

With this version, multi-journey products can be expressed.

### Improved OJP Support

The `LegBoard`, `LegIntermediates` and `LegBoard` entities have been added according to the [Open Journey Planning (OJP)](https://www.transmodel-cen.eu/ojp-standard/) specification.

### Reduction Cards are Available to Ticket Vendors

Reduction cards are now available to ticket vendors to be used for selecting the cards for requests and in customer profiles. See `/masterdata/reductionCards` for details.

### Add the Responsible TCOs in the Booking Data

New we can support cases where the ticket control organization (TCO) to control tickets is different from the fare provider.

### Option to Indicate CarrierConstraints at the Level of `RegionalValidity` and `ViaStation`

This feature on the OSDM offline part of the specification allow to indicate CarrierConstraints at the level of RegionalValidity and ViaStation in the fare.

### Travel Validity Depending on Boarding Time O:nly

Some special tickets define a travel validity based on the boarding time only. These tickets are the valid on that train until the passenger leaves the train.

E.g. Eurail tickets on specific night trains where the Eurail ticket must be valid at boarding time only and the passenger can stay on the train until his destination on the next day.

Other work addressed includes:

- Improving the API's description
- Fixing minor inconsistencies
- Incorporating feedback from the first implementors
