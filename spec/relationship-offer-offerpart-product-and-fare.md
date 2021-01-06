---
title: Relationship Offer, OfferPart, Product and Fare 
permalink: /spec/relationship-offer-offerpart-product-and-fare/
layout: page
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

### First Scenario: Offline import of complete fare data

An allocator imports all fares of a given RU using a batch import from
the OSDM-Offline platform.

The fares contain all relevant information to create offers, bookings
and fulfillments (aka. tickets). If booking has occurred the RU informs
it the fare owner, i.e., the RU of the fare sold.

Accounting is done using the existing downstream UIC 301 flows.

### Second Scenario: Import of relevant fares at offer step

At offer time, an allocator looks up the fares for a given origin/destination
in its database. If it doesn't find it the allocator imports the relevant
fares.

Accounting is done using the existing downstream UIC 301 flows.

### Third Scenario: No import of fares

For a given origin/destination and date of travel the relevant fares are
returned as part of the Offer. The

## Attributes of An Online Fare

![Attributes of An Online Fare](../images/models/attributes-online-fare.png)

## Roles of Fare Attributes in the Booking and After Sales Processes

The fare contains information so that the allocator can calculate correct prizes, render a valid fulfillment and account correctly.

The following sections describe which fare attributes are used at which step:

### Offer Creation Step

Relevant fare attributes are:

- `regionalConstraint`
  
  Examples: a list of stations, a list of zones or a list of train link

  An allocator needs to guarantee that the whole trip is covered by fares.

- `serviceConstraint`

  Examples: 

- `carrierConstraint`

  Examples: Thalys, Eurostar,...

  Only create offers for the allowed carriers

- `regulatoryConditions`

  Examples: CIV, MD, EU-PER

  Needs to be indicated in the offer to inform the customer.

- `serviceClass`

  Examples: HIGH, BEST, STANDARD, BASIC

  Needs to be indicated in the offer to inform the customer.

- `comfortClass`

  Examples: FIRST, SECOND

- `serviceLevel`
  
  Missing in fare, add!

- `combinationConstraint`

  Examples: `SEPARATE_CONTRACTS` model, `SEPARATE_TICKETS` model, `CLUSTERING` model or `COMBINATION` model

  Only combine fare according respecting the combination models

- `fulfillmentConstraint`

  Examples:

  Only create offers which respect the fulfillment constraint

- `coveredSection`

  Examples:

- `passengerConstraints`

  Examples: Age between 6 and 16

  Only create offers respecting the age of the passenger(s)

- `afterSalesCondition`

  Examples: Non-refundable after departure.

  Need to be indicated in the offer to inform the customer.

### Pre-Booking Step

Fare attributes are not relevant for this step.

### Booking Step

Fare attributes are not relevant for this step.

### Fulfillment Step

Relevant fare attributes are:

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
