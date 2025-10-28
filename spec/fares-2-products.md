---
layout: page
title: Compliance
hide_hero: true
permalink: /spec/fares-2-products/
---

## Table of contents

1. [Introduction](#Intro)
2. [Combination Rules](#CombinationRules)
3. [Combining Rules](#RegionalValidity)
4. [Combining After Sales Rules](#AfterSalesRules)
5. [Creating Fulfillments](#Fulfillments)
6. [Handling Aftersales](#Aftersales)

## Introduction <a name="Intro">

Fares are bricks for a distributor to form products, product based offers and transport contracts including different carriers/fare providers. The fares can be provided by a carrier/fare provider using the OSDM online API as 
offers for fares or via the offline fare data. The distributor has the task to combine the fares from different providers into products according the the rules set in the fares. 

By nature the fares are forseen to be used in combination with other fares, However a fare from one provider could be used to create a product. This is mainly done with offline fares as for OSDM online the original products of the provider can be accessed. Converting a single online fare from only one provider without combining it is not recommended and might be prohibted by the provider.

Offline and Online Fares share some data objects, but the data context is different. Online Fares are always part of an offer for a specified trip and a specified list of travellers, whereas in Offline Fares this context is missing and the Offline Fares must provide all data required to link them into such a context. 

As fares are only bricks to construct a product they do not include all data a product incudes. A fare does not include:

 - A product object as this will be conbstructed by teh Distributor
 - A FulfillmentDocument as the fulfillment is constructed by the Distributor. However a fare might include fulfillment parts that need to be integrated in the fulfillment (e.g. additional bar code,..)
 - In some Business Models the Fare specifies a type of after sales rule only, not the exact after sales fees 

Additionally Fares include data to support the construction process. These are not included in products likke admissions.

 - Combination Models defining the allowed combinations with other fares
 - AfterSales Models defining the way after sales can be handled by the distributor
 - Rules on through ticketing to allow of deny through ticketing with fares of other providers
 - Coonection Points for connecting routes at borders between tariff regimes. (Tariff regime borders are usually not part of a trip specification)

Offline Fares need to provide additional data to link them to the sales context (trips, passengers, language, ...):

 - Availability for Sale (Sales Window)
 - Travel validity
 - Passenger Constraints to link fares to passengers
 - Multiple Languages

The RegionalValidity is included in Offline and Online Fares, but the usage of the data is different. The data included in the Offline Fares are used to link the fare to possible trips by the distributor. With online fares this is already done by 
the fare provider. The regional validity in the online fare is used to provide this information to the traveller and to the controll staff via ticket bar codes. 

Fares are via the 'POST \offfers' indicating 'FARE_ADMISSION','FARE_RESERVATION' in 'offerSearchCriteria.requestedOfferParts'. 

The offer request might ask for product based admissions at the same time. Use cases for a mixed request might be that some part of the requested trip part is covered by products only. E.g. Fare Salzburg-Vienna + Prduct Based admission for Vienna city traffic.


## Fare Combination Rules <a name="CombinationRules">

Fare Combination Rules are included in Offline and Online Fares. They govern the combination of fares from different providers. 

[Fare Combination Rules - Data Structures](https://osdm.io/spec/common-data-structures/#FareCombinationConstraint)

The combination rules include:
  - business model ('model') that governs the combination. This mainly defines the was after sales conditions must be applied:
     - CLUSTERING_MODEL:   The Distributor is allowed to apply his standard after sales rules for the flexibility cluster of the final product.
     - COMBINING_MODEL:  The distributor must obey the after sales fees provided for the fare. In case of an Online Fare these are provided in the offer for customer information and during the online after sales in the message exchange.
  - providers where a fare combination is allowed
  - indication whether the fare is allowed to be converter into a product without combining with another fare provider
  - list of flexibility clusters of the final product that can contain this fare ('allowedClusters')
  - allowed distributors (Offline Fares only)
  - list of fare providers with whoom a throught ticket is allowed ('allowedCommonContracts'). Note: Separate contracts can be contained on one fulfillment Document (Ticket) but the separation of contracts has to be indicated clearly on the ticket.

## Combining Regional Validity <a name="RegionalValidity">




## Combining After Sales Rules <a name="AfterSalesRules">




## Creating Fulfillments <a name="Fulfillments">


## Handling Aftersales <a name="Aftersales">
