---
layout: page
title: Non-Trip-Based Sales
hide_hero: true
permalink: /spec/non-trip-based-sales/
---

## Table of contents

1. [Introduction](#introduction)
2. [Offer Search](#offerSearch)
3. [Search by Product Tags](#productTags)


## Introduction <a name="introduction">




## Offer Search <a name="offerSearch">

In a non trip based offer search the tripSearchCriteria are replaced by the nonTripSearchCriteria. These provide parameters, that would otherwise have been take from a trip:

     - Begin of validity
     - Regional where the offers should be valid, provided as NUTS codes or as places

The offers to be provided should be valid at least on the begin of validity and within the area specified. The region is provided as a hint for the offer search, the response might include offers 
that are valid in a relevant part of the region or where the requested region is part of the offers validity. 

Besides the nonTripSearchCriteria the generic offerSearchCriteria can be used. 

The offerSearchCriteria include:

    - additional parameter to narrow the list of results, e.g. flexibility of the offers or class 
    - a list of products for which offers are requested
    - a list of product tags to narrow the list of results
    


The offer request as usual provides:
    - the list of anonymous passengers
    - optionally codes to allow for corporate offers
    - optionally codes to allow for corporate promotions
    - available fulfillment methods


## Using Product Tags <a name="productTags">


