---
layout: page
title: Compliance
hide_hero: true
permalink: /spec/constructing-products-from-fares/
---

## Table of contents

- [Table of contents](#table-of-contents)
- [Introduction](#introduction)
- [Relationships between Offers, OfferParts, Products and Fares](#relationships-between-offers-offerparts-products-and-fares)
- [Fare as Building Block for Products](#fare-as-building-block-for-products)
- [Attributes of an Online Fare](#attributes-of-an-online-fare)
- [Passengers](#passengers)
- [Fare Combination Rules](#fare-combination-rules)
- [Combining Regional Validity](#combining-regional-validity)
  - [Regional Validity in Online Fares](#regional-validity-in-online-fares)
  - [Regional Validity in Offline Fares](#regional-validity-in-offline-fares)
- [Reservation Fares](#reservation-fares)
- [Creating Fulfillments](#creating-fulfillments)
- [Combining After Sales Rules](#combining-after-sales-rules)
  - [Clustering Model](#clustering-model)
  - [Combination Model](#combination-model)
- [Handling After Sales](#handling-after-sales)
  - [Clustering Model](#clustering-model-1)
  - [Clustering Model with Provider Fee Flow](#clustering-model-with-provider-fee-flow)
  - [Combination Model](#combination-model-1)
- [Detailed view at the Attributes of an Online Fare](#detailed-view-at-the-attributes-of-an-online-fare)
  - [Offer Creation Step](#offer-creation-step)
  - [Booking Step](#booking-step)
  - [Fulfillment Step](#fulfillment-step)
  - [Refund Offer Creation Step](#refund-offer-creation-step)
  - [Exchange Offer Creation Step](#exchange-offer-creation-step)

## Introduction

Fares from different carriers/fare providers are the building blocks for a
distributor to form products, product based offers and transport contracts. The
fares can be provided by a carrier/fare provider using the OSDM online API or
via the offline fare data. The distributor has the task to combine the fares
from different providers into products according the the rules set in the fares.

By nature the fares are foreseen to be used in combination with other fares,
However a fare from one provider could be used to create a product. This is
mainly done with offline fares as for OSDM online the original products of the
provider can be accessed. Converting a single online fare from only one provider
without combining it is not recommended and might be prohibited by the provider.

Offline and Online Fares share some data objects, but the data context is
different. Online Fares are always part of an offer for a specified trip and a
specified list of passengers. In Offline Fares this context is missing and the
Offline Fares must provide all data required to link them into such a context.

## Relationships between Offers, OfferParts, Products and Fares

An `offer` spans the trip consisting of legs. An `offerpart` spans a leg or - in
the case of through fares - multiple legs. An `offerpart` references zero or two
products. Mostly, the relationship is one-to-one (zero in case of included seat
reservation, whereas two products are only referenced in some rare TGV-TER
scenarios).

A `fare` is not necessarily bound to legs but reflects the tariff worlds. A
`fare` often starts or ends at country borders where no train station exist.
This border points are thus called `virtual border points` which can be modelled
by `ConnectionPoints`. Fares are combined following a `fare combination model`
to an offer.

![Relationships between Offers, OfferParts, Products and Fares](../../images/models/relationship-offer-offerpart-product-fare.png)

_Note_: This example assumes that the complete trip can be priced.

## Fare as Building Block for Products

As fares are only building blocks to construct a product they do not include all
data a product based admission includes.

Fares include data to support the construction process. These are not included
in products like admissions.

## Attributes of an Online Fare

The following figure shows the attributes of an online fare:

![Attributes of An Online Fare](../../images/models/attributes-online-fare.png)

Crucial attributes of an Online Fare are:

- Combination Models defining the allowed combinations with other fares
- AfterSales Models defining the way after sales can be handled by the
  distributor
- Rules on through ticketing to allow of deny through ticketing with fares of
  other providers
- Connection Points for connecting routes at borders between tariff regimes.
  (Tariff regime borders are usually not part of a trip specification)

Offline Fares need to provide additional data to link them to the sales context
(trips, passengers, language, ...):

- Availability for Sale (Sales Window)
- Travel validity
- Passenger Constraints to link fares to passengers
- Multiple Languages

and do not include:

- A product definition
- A `FulfillmentDocument` as the fulfillment is constructed by the Distributor.
  However a fare might include fulfillment parts that need to be integrated in
  the fulfillment (e.g. additional bar code,..).
- In some Business Models the Fare specifies a type of after sales rule only,
  not the exact after sales fee.

The RegionalValidity is included in Offline and Online Fares, but the usage of
the data is different. The data included in the Offline Fares are used to link
the fare to possible trips by the distributor. With online fares this is already
done by the fare provider. The regional validity in the online fare is used to
provide this information to the passenger and to the control staff via ticket
bar codes.

Fares can be requested via the `POST \offers` indicating
`FARE_ADMISSION`,`FARE_RESERVATION` or, `FARE_ANCILLARY` in
`offerSearchCriteria.requestedOfferParts`.

The offer request might ask for product based admissions at the same time. Use
cases for a mixed request might be that some part of the requested trip part is
covered by products only. E.g. Fare Salzburg-Vienna + Product Based admission
for Vienna city traffic.

In case of free transport a fare with zero price needs to be provided to allow
the construction of products.

## Passengers

An offer must always include fares for all passengers. In case the pricing can
be split between passengers a fare per passenger should be created. Otherwise
Fares for multiple passengers are used.

## Fare Combination Rules

Fare Combination Rules are included in Offline and Online Fares. They govern the
combination of fares from different providers.

[Fare Combination Rules - Data Structures](https://osdm.io/spec/common-data-structures/#FareCombinationConstraint)

The combination rules include:

- business model ('model') that governs the combination. This mainly defines the
  was after sales conditions must be applied:
  - `CLUSTERING_MODEL`: The Distributor is allowed to apply his standard after
    sales rules for the flexibility cluster of the final product.
  - `COMBINING_MODEL`: The distributor must obey the after sales fees provided
    for the fare. In case of an Online Fare these are provided in the offer for
    customer information and during the online after sales in the message
    exchange.
- providers where a fare combination is allowed
- indication whether the fare is allowed to be converter into a product without
  combining it with fares from another fare provider
- list of flexibility clusters of the final product that can contain this fare
  (`allowedClusters`)
- allowed distributors (Offline Fares only)
- list of fare providers with whom a through ticket is allowed
  (`allowedCommonContracts`). Note: Separate contracts can be contained on one
  fulfillment Document (Ticket) but the separation of contracts has to be
  indicated clearly on the ticket.

A Fare can have multiple combination constraints. One of them must match to
construct a combination.

CLUSTERING and COMBINING rules are based on a classification of Products and
Fares according to their flexibility:

| CLUSTER_MODEL | description                                                                                           |
| ------------- | ----------------------------------------------------------------------------------------------------- |
| `BUSINESS`    | Refundable/Exchangeable after the departure or last day of validity                                   |
| `FULL_FLEX`   | Refundable/Exchangeable before the departure or last day of validity                                  |
| `SEMI_FLEX`   | Refundable/Exchangeable with fee depending on conditions of the distributor. Minimum validity applies |
| `NON_FLEX`    | Non refundable. Non exchangeable. Minimum validity applies                                            |
| `PROMO`       | Used on a bilateral basis only. Non refundable. Non exchangeable. Minimum validity applies            |

A Product build from Fares must follow one of the cluster models. The Fare
provides rules on the cluster models that are allowed to contain the fare. The
rules usually ensure that a Fare can only be included in a product of the same
cluster model or a cluster model that allows less flexibility in terms of after
sales rules.

E.g. A `FULL_FLEX` fare might be allowed to be included in a `SEMI_FLEX`
product, but not in a `BUSINESS` product.

## Combining Regional Validity

The usage of the regional validity is different in Offline and in Online Fares.
In Offline Fares they must provide the data to match the route with a trip from
the distributors time table engine. In Online fares the matching is done by the
fare provider, the distributor implementation is therefore much simpler.

The data model of the Route is identical in online and offline fares but the
representation differs as the online representation avoids recursive data
structures for security reasons.

[Regional Constraint - Data Structures](https://osdm.io/spec/common-data-structures/#RegionalConstraint)

Route example:

![Fare Structure](../../images/fare-data-structure/viaExample.PNG)


**Note:** In OSDM Online the recursive Route data model is included as a flat list and the route items are referenced by their index in the list. 

For the example abouve that representation would look like:

- RouteItem 0: the entire route including routeItemIndices 1,2,9 = [A-ship-B], [X or Y*Z], [(G,F,H)]
- RouteItem 1: routeItemIndices 3,4 with the serviceConstraint: ship
- RouteItem 2: alternativeRouteIndices5,6 = [X],[Y *Z]
- RouteItem 3: station A
- RouteItem 4: station B
- RouteItem 5: station X
- RouteItem 6: routeItemIndices 7,8 = [Y],[Z]
- RouteItem 7: station Y
- RouteItem 8: station Z
- RouteItem 9: the farestationSet containing station G,H,F

The routeIndice simply allows to flatten the recursive route data structure as used in OSDM offline to a list for the message and to reconstruct the data again from the message. This avoids security issues with potential infinite sized structures in the messaging.

The indices do not carry information on the sequence along the route. The sequence along the route is provided by the order in the list routeItemIndices.

You could skip the Route item 0 nd add the that content list to the starting routeItem in the message.

### Regional Validity in Online Fares

The route description of a product combined from fares is a concatenation of the
route descriptions of the individual Fares with the addition of an indication of
the tariff border usually using an abbreviation '(GR)' od '(fr)' and '\*' as
separation signs. A Station name from the connection point of the two regional
constraint might be added:

'<route description fare 1>_connectionPointStation name (fr)_<route description
of fare 2>'

The online fare does not necessarily need the structured route description from
routeItem/routeItemList, the description can be build from the route summary.
However the structured route enables more use cases e.g. automated control of
bar codes, graphical displays of the route).

If structured route data are provided it is recommended to build the description
based on the structured data.

The (fare) connection point(s) where the route can be connected to other fare
routes is provided by the fare provider. It is recommended to check the matching
of the connection points on distributor side to ensure that the routes from
different providers are selected properly and match without gap.

### Regional Validity in Offline Fares

For offline fares the connection point(s) and the structured route data are
essential for aligning the route to trips, therefore the structured route
information is mandatory. Combinations with other fares are only allowed when
the connectionPoint(s) are matching.

![Trip Alignment](../../images/common-data-structures/connection-points-timetable-routes.png))

Data model:

![Fare Structure](../../images/fare-data-structure/OSDMmodelregionalconstraint.png)

Object model:

![Fare Structure](../../images/fare-data-structure/OSDMmodelviaStationobjectmodel.png)

## Reservation Fares

Reservations can follow the fare model. These are then requested as
`FARE_RESERVATION` and indicated with distributionMode `FARE_MODE`. The
differences to Product based reservations are marginal (with OSDM v.4.0 the
reservation object will be used in both cases), the fulfillment of a reservation
fare does not include a fulfillment document as the reservation will be
integrated in the documents constructed by the distributor. The fare reservation
will not include or link to a reservation fee as the fee is added by the
distributor according to his general reservation fee rules.

As the difference to normal reservations is almost neglectable and with version
4 there will be only one reservation object. With OSDM v.3 the fare object with
reservation data is available but deprecated. The general reservation should
already with OSDM v.3 be used as fare reservation indicating the
distributionMode `FARE_MODE` in the reservation.

Reservations obtained by the H2O converter of Hitrail are by definition fare
reservations as the Hermes Protokoll only implements the fare model.

## Creating Fulfillments

The distributor constructs the fulfillment for the product offer. The booking of
the fare returns a fulfillmentId for the fares, but usually the content of the
fulfillment will be empty. The restrictions on fulfillments provided in
`fulfillmentConstraint` must be obeyed.

In special cases additional fulfillment parts can be provided by the fare
provider (e.g. proprietary bar codes) based on bilateral agreements.

The fare provides a list of TCOs involved in the ticket control (`involvedTCOs`)
that should be informed by the distributor in case a ticket control exchange is
in place.

The fare provides additional information on age restrictions
(`passengerConstraints`) to be included in the barcode.

## Combining After Sales Rules

### Clustering Model

In the clustering model the distributor applies its own after sales conditions
depending of the cluster of the product.

### Combination Model

The fare provides the exact after sales fees. The product adds the after sales
fees of all included fares. This results in an after sales fee that increases
whenever one of its fares after sales fees changes.

E.g.

- Distributor product including fare 1 and fare 2
- Fare 1 refund fee 10€ 10 days before traveling
- Fare 2 refund fee 8€ 15 days before traveling
- Product: 8€ refund fee 15 days before traveling, 18€ refund fee 10 days before
  traveling.

## Handling After Sales

### Clustering Model

In the clustering model the distributor applies its own after sales conditions
depending of the cluster of the product. Although the distributor calculates the
refund fee the refund has to be made via the OSDM API online.

The refund fees or exchange fees can follow two accounting models. In one model
the fee belongs to the client (distributor), in the other model the fee belongs
to the provider (fare provider / carrier). This is indicated in the
AfterSalesConditionsLink of the Fare (`isProviderFee: true`). If the fee belongs
to the provider the client will indicate the fee amount in the refund / exchange
request in `RefundSpecification.refundFee`. The provider will then use this
amount as refund fee and add the VAT split. The accounting flow follows the
usual accounting of provider fees, the provider debits the fee to the consumer.

The accounting model will also be indicated in the resulting fee object created
by the provider.

### Clustering Model with Provider Fee Flow

![Provider Fee Flow](../../images/fare-data-structure/provider-fee-flow.png)

### Combination Model

The fare provides the after sales fees. The product adds the after sales fees of
all included fares. This results in an after sales fee that increases whenever
one of the fare after sales fees changes.

The Fee is subject to VAT according to the fare provider.

## Detailed view at the Attributes of an Online Fare

The fare contains all information so that a retailer can calculate correct
prizes, render a valid fulfillment and account correctly.

The following sections describe which fare attributes are used at which step:

### Offer Creation Step

Relevant fare attributes for the offer creation step are:

- `price`

- `regionalConstraint`

  Examples: a list of stations, a list of zones or a list of train link,...

  A retailer needs to guarantee that the whole trip is covered by fares.

- `serviceConstraint`

  Examples: `IC`, `TGV`, `BEX`, ...

  A retailer can create offers only if the trip/leg is run by the service.

- `carrierConstraint`

  Examples: Thalys, Eurostar, ...

  A retailer can create offers only if the trip/leg is run by the carrier.

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

### Booking Step

Relevant fare attributes for the booking process step are:

- `price`

- `reservationDetails`

  Example: Wagon 19, Seat 44

  The reservation details need to be communicated at the pre-booking step to the
  customer.

- `legacyAccountingIdentifier`

  The legacy accounting identifier information is used to write a correct 301
  record.

### Fulfillment Step

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

### Refund Offer Creation Step

Relevant fare attributes for the creation of a refund offer are:

- `price`

- `afterSaleConditions`

  A retailer can create offers only if the after sale condition support its
  creation.

### Exchange Offer Creation Step

Relevant fare attributes for the creation of a refund offer are the
`afterSaleConditions` as well as all the attributes for offer creation.
