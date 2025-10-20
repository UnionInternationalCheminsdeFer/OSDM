---
layout: page
title: Non-Trip-Based Sales
hide_hero: true
permalink: /spec/non-trip-based-sales/
---

## Table of contents

1. [Introduction](#introduction)
2. [Offer Search](#offerSearch)
3. [Using Product Tags](#productTags)
4. [Search for Products](#productSearch)


## Introduction <a name="introduction">

Many products can not be sold (efficiently) in a trip based approach like:

  - multi ride products valid for multiple trips. Either the customer does not know the trips beforehand or the prices would be too high for a singel requested trip.
  - reduction cards 
  - merchandising articles


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

Product tags can be used as search parameters in the search for offers and they are included in the product definition. Product tags are grouped to allow a selection of tags within a tag category by the customer. 

The definition of product tags and their grouping is up to the provider of OSDM. The product tags including their grouping can be retrieved via GET /product-tags

The retailer can provide a selection to the customer on the product tag groups to find the parmeter for the offer (POST /offers) directly or in the product search to first search all relevant products (POST /products-search).

### Examples:

#### Sale of passes:
 
        ProductTag:   
                  tag:  RP_DE
                  text: Germany

        ProductTag:   
                  tag: VAL_14
                  text: 2 weeks validity  

        ProductTag:   
                  tag: VAL_30
                  text: 1 month validity                      
                  
        ProductTagGroup: 
                  tagGroup: COUNTRY
                  text: Valid countries
                  productTags:  RP_DE,RP_DE,  RP_DE2

        ProductTagGroup: 
                  tagGroup: VAL
                  text: Validity
                  productTags: VAL_14, VAL_30                 
        
        Product: 
                  name: German Rail Pass 2 weeks
                  tags: RP_DE, VAL_14  

       A retailer can provide a selection on country and on validity to the customer to select the product tags used in the offer search.


#### Sale of merch:
 
        ProductTag:   
                  tag:  SHIRT_1
                  text: T-shirt with railway logo

        ProductTag:   
                  tag: SIZE_L
                  text: size L     

        ProductTag:   
                  tag: SIZE_XL
                  text: size XL    
                  
        ProductTagGroup: 
                  tagGroup: G_SIZE
                  text: size
                  productTags:  SIZE_L,SIZE_XL        
        Product: 
                  name: T-shirt with railway logo
                  tags: SIZE_L

       A retailer can provide a selection on the size of a mechandising article to select the product tags used in the offer search.
   


## Using Product Search <a name="productSearch">

The 'POST \products-search' end-point can be used to search for products. The product provides a description of the product and its conditions without giving an offer with prices that can be booked.

The search can be retricted by product tags ans other parameters like flexibility or class.



