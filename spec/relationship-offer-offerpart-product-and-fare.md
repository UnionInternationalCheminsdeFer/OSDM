---
title: Relationship Offer, OfferPart, Product and Fare
hide_hero: true
layout: page
permalink: /spec/relationship-offer-offerpart-product-and-fare/
---

## Table of contents

1. [Ways to Access Fares](#WaystoAccessFares)
   1. [First Scenario: Complete Offline Import of Fares](#FirstScenarioCompleteOfflineImportofFares)
   2. [Second Scenario: Import of Relevant Fares at Offer Step](#SecondScenarioImportofRelevantFaresatOfferStep)
   3. [Third Scenario: No Explicit Import of Fares](#ThirdScenarioNoExplicitImportofFares)
2. [Attributes of an Online Fare](#AttributesofanOnlineFare)
3. [Roles of Fare Attributes in the Booking and After Sales Processes](#RolesofFareAttributesintheBookingandAfterSalesProcesses)
   1. [Offer Creation Step](#OfferCreationStep)
   2. [Booking Step](#BookingStep)
   3. [Fulfillment Step](#FulfillmentStep)
4. [After Sale](#AfterSale)
   1. [Refund Offer Creation Step](#RefundOfferCreationStep)
   2. [Exchange Offer Creation Step](#ExchangeOfferCreationStep)


# Relationships between Offers, OfferParts, Products and Fares

The entities `offer`, `offerpart`, `product` and `fare` represent different
concepts.

An `offer` spans the trip consisting of segments. An `offerpart` spans a segment
or - in the case of through fares - multiple segments. An `offerpart` references
zero or two products. Mostly, the relationship is one-to-one (zero in case of
included seat reservation, whereas two products are only referenced in some rare
TGV-TER scenarios).

A `fare` is not necessarily bound to segments but reflects the tariff worlds. A
`fare` often starts or ends at country borders where no train station exist.
This border points are thus called `virtual border points` which can be modelled
by `ConnectionPoints`. Fares are combined following a `fare combination model`
to an offer.

![Relationships between Offers, OfferParts, Products and Fares](../images/models/relationship-offer-offerpart-product-fare.png)

_Note_: This example assumes that the complete trip can be priced.

## Ways to Access Fares <a name="WaystoAccessFares">

There are three ways for a retailer to access fares.

### First Scenario: Complete Offline Import of Fares <a name="FirstScenarioCompleteOfflineImportofFares">

A retailer imports all fares of a given railway using a batch import from the
OSDM-Offline platform.

The fares contain all relevant information to create offers, bookings and
fulfillments (aka. tickets). If a booking occurs the RU informs the RU of the
fare sold using UIC 301.

### Second Scenario: Import of Relevant Fares at Offer Step <a name="SecondScenarioImportofRelevantFaresatOfferStep">

At offer time, a retailer looks up the fares for a given origin/destination in
its database. If it doesn't find it the retailer imports the relevant fares
online. If a booking occurs the RU informs the RU of the fare sold using
UIC 301.

### Third Scenario: No Explicit Import of Fares <a name="ThirdScenarioNoExplicitImportofFares">

For a given origin/destination and date of travel the relevant fares are
returned as part of the `Offer`.

If the fare is sold as part of an offer then the fare is booked online at the
offering retailer.

## Attributes of an Online Fare <a name="AttributesofanOnlineFare">

![Attributes of An Online Fare](../images/models/attributes-online-fare.png)

## Roles of Fare Attributes in the Booking and After Sales Processes <a name="RolesofFareAttributesintheBookingandAfterSalesProcesses">

The fare contains all information so that a retailer can calculate correct
prizes, render a valid fulfillment and account correctly.

The following sections describe which fare attributes are used at which step:

### Offer Creation Step <a name="OfferCreationStep">

Relevant fare attributes for the offer creation step are:

- `price`

- `regionalConstraint`

  Examples: a list of stations, a list of zones or a list of train link,...

  A retailer needs to guarantee that the whole trip is covered by fares.

- `serviceConstraint`

  Examples: `IC`, `TGV`, `BEX`, ...

  A retailer can create offers only if the trip/segment is run by the service.

- `carrierConstraint`

  Examples: Thalys, Eurostar, ...

  A retailer can create offers only if the trip/segment is run by the carrier.

- `regulatoryConditions`

  Examples: `CIV`, `MD` or `EU-PER`

  The regulatory conditions need to be indicated in the offer to inform the
  customer.

- `serviceClass`

  Examples: `HIGH`, `BEST`, `STANDARD` or `BASIC`

  A retailer needs to consider `serviceClass` depending on the
  `FareCombinationModel` applied.

  The service class needs to be indicated in the offer to inform the customer.

- `travelClass`

  Examples: `FIRST` or `SECOND`

  The comfort class needs to be indicated in the offer to inform the customer.

- `accommodationDetails`

  Example: `SEAT`, `COUCHETTE`, `BERTH` or `VEHICLE`

  If the train is a night train or car carriage the accommodation details need
  to be reflected in the offer.

- `afterSalesCondition`

  Example: Non-refundable after departure.

  A retailer needs to consider `afterSalesCondition` depending on the
  `FareCombinationModel`applied.

  The refund/exchange conditions need to be indicated in the offer to inform the
  customer.

- `combinationConstraint`

  Examples: `SEPARATE_CONTRACTS` model, `SEPARATE_TICKETS` model, `CLUSTERING`
  model or `COMBINATION` model

  A retailer can only combine fares respecting the combination models.

- `fulfillmentConstraint`

  Examples: `SIP`, `SID` or `SIS`

  A retailer can only create offers which respect the constraints concerning the
  ticket control. If `fulfillmentConstraint` are mixed, then all constraints
  need to be served.

- `reductionConstraint`

  Example: `1085_GA` where 1085 denotes SBB, `1080_Bahncard50`, where 1080
  denotes DB, ...

  A retailer can create offers only if the passenger(s) own(s) the reduction(s).

- `travelValidityConstraint`

  Example: Valid 24h after departure

  The travel validity constraint needs to be communicated in the offer to inform
  the customer.

- `placeSelection`

  Example: Selected places in a graphical seat map, reference place for adjacent
  reservation or place preferences

  A retailer most respect the selected places. The other types are optional to
  be respected by the retailer.

- `coveredSection`

  Example: Start and end location

  A retailer has to create an offer that covers the whole trip from start
  location to end location.

### Booking Step <a name="BookingStep">

Relevant fare attributes for the booking process step are:

- `price`

- `reservationDetails`

  Example: Wagon 19, Seat 44

  The reservation details need to be communicated at the pre-booking step to the
  customer.

- `legacyAccountingIdentifier`

  The legacy accounting identifier information is used to write a correct 301
  record.

### Fulfillment Step <a name="FulfillmentStep">

Relevant fare attributes for the fulfillment step are:

- `price`

  The price needs to be communicated to the passenger(s), e.g. printed on the
  ticket.

  Additionally, it needs to be encoded in the security element(s).

- `regionalConstraint`

  The regional constraint need to be communicated to the passenger(s), e.g.
  printed on the ticket.

  Additionally, it needs to be encoded in the security element(s).

- `regulatoryConditions`

  The regulatory conditions need to be communicated to the passengers(s), e.g.
  printed on the ticket.

- `reservationsDetails`

  The reservation details need to be communicated to the passengers(s), e.g.
  printed on the ticket.

  Additionally, it needs to be encoded in the security element(s) in case of
  mandatory reservations.

- `serviceClass`

  The service class need to be communicated to the passengers(s), e.g. printed
  on the ticket.

  Additionally, it needs to be encoded in the security element(s).

- `travelValidityConstraint`

  The date are needed to create valid barcode and control data.

  Additionally, it needs to be encoded in the security element(s).

- `passengerConstraint`

  Example: Age between 6 and 16 years

  The passenger constraint need to be communicated to the passengers(s), e.g.
  printed on the ticket.

## After Sale <a name="AfterSale">

### Refund Offer Creation Step <a name="RefundOfferCreationStep">

Relevant fare attributes for the creation of a refund offer are:

- `price`

- `afterSaleConditions`

  A retailer can create offers only if the after sale condition support its
  creation.

### Exchange Offer Creation Step <a name="ExchangeOfferCreationStep">

Relevant fare attributes for the creation of a refund offer are the
`afterSaleConditions` as well as all the attributes for offer creation.
