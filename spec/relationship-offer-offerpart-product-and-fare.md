---
title: Relationship Offer, OfferPart, Product and Fare 
hide_hero: true
layout: page
permalink: /spec/relationship-offer-offerpart-product-and-fare/
---

## Draft

The entities represent different concepts.

An `offer` spans the whole trip consisting of segments. An `offerpart` spans a
segment or - in the case of thru fares - multiple segments. An `offerpart`
reference one or two products, whereas two products are only referenced
in some rare TGV-TER scenarios.

A `fare` is not necessarily bound to segments but reflects the tariff
worlds. A `fare` often starts or ends at country borders where no train station exist.
This border points are thus called virtual border points. Fares are
combined following the fare combination models to offers.

![Relationship Offer, OfferPart, Product and Fare](../images/models/relationship-offer-offerpart-product-fare.png)

## Ways to Access Fare

There are three ways for an allocator to access fares.

### First Scenario: Complete Offline Import of Fares

An allocator imports all fares of a given railway using a batch import from
the OSDM-Offline platform.

The fares contain all relevant information to create offers, bookings
and fulfillments (aka. tickets). If a booking occurs the RU informs
the RU of the fare sold using UIC 301.

### Second Scenario: Import of Relevant fares at Offer Step

At offer time, an allocator looks up the fares for a given origin/destination
in its database. If it doesn't find it the allocator imports the relevant
fares online. If a booking occurs the RU informs the RU of the fare sold using UIC 301.

### Third Scenario: No explicit Import of Fares

For a given origin/destination and date of travel the relevant fares are
returned as part of the `Offer`.

If the fare is sold as part of an offer then the fare is booked online at the offering
allocator.

## Attributes of An Online Fare

![Attributes of An Online Fare](../images/models/attributes-online-fare.png)

## Roles of Fare Attributes in the Booking and After Sales Processes

The fare contains all information so that an allocator can calculate correct prizes,
render a valid fulfillment and account correctly.

The following sections describe which fare attributes are used at which step:

### Offer Creation Step

Relevant fare attributes are:

- `regionalConstraint`
  
  Examples: a list of stations, a list of zones or a list of train link,...

  An allocator needs to guarantee that the whole trip is covered by fares.

- `serviceConstraint`

  Examples: IC, TGV, BEX,...

  An allocator can only create offer if the trip/segment is run by the service.

- `carrierConstraint`

  Examples: Thalys, Eurostar,...

  An allocator can create offers if the trip/segement is run by the carrier.

- `regulatoryConditions`

  Examples: CIV, MD, EU-PER

  Needs to be indicated in the offer to inform the customer.

- `serviceClass`

  Examples: HIGH, BEST, STANDARD, BASIC

  Needs to be indicated in the offer to inform the customer.

- `comfortClass`

  Examples: FIRST, SECOND

  Needs to be indicated in the offer to inform the customer.

- `serviceLevel`
  
  Missing in fare, add!

- `combinationConstraint`

  Examples: `SEPARATE_CONTRACTS` model, `SEPARATE_TICKETS` model, `CLUSTERING` model or `COMBINATION` model

  An allocator can only combine fare according respecting the combination models

- `fulfillmentConstraint`

  Examples: SIP, SID, SIS

  An allocator can only create offers which respect the fulfillment constraint

- `coveredSection`

  Examples: Start and end location

  An allocator has to cover the whole trip from start to end location.

- `passengerConstraints`

  Examples: Age between 6 and 16 years

  An allocator can only create offers respecting the age of the passenger(s).

- `afterSalesCondition`

  Examples: Non-refundable after departure.

  The refund/exchange conditions need to be indicated in the offer to inform the customer.

### Pre-Booking Step

Fare attributes are not relevant for this process step.

### Booking Step

Fare attributes are not relevant for this process step.

### Fulfillment Step

Relevant fare attributes for this process step  are:

- `regionalConstraint`

- `regulatoryConditions`

  Needs to be printed on the ticket.

- `serviceClass`

  Needs to be printed on the ticket.

### After Sale Step

### Accounting Step

Relevant fare attribute is:

- `legacyAccountingIdentifier`

### After Sale Offer Creation Step

Relevant fare attributes are:

- `afterSaleConditions`
