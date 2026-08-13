---
layout: page
title: Handling Return Trips
hide_hero: true
permalink: /spec/handling-return-trips/
---

## Table of contents

- [Table of contents](#table-of-contents)
- [Introduction](#introduction)
- [Searching for return offers](#searching-for-return-offers)
- [Indicating return offers](#indicating-return-offers)
 

## Introduction

We define a return trip as a mirrored couple of trips _(A-B B-A)_, each made of
one or more segments. The outbound trip (or outward) is the A-B trip, the
inbound trip (or inward or return trip) is the B-A trip.

The routes between A and B might differ for the outbound and inbound trip.

Requests for a return trip might result in offers independent per trip and / or genuine return
offers that depend on inbound a outbound trip.

The handling of return offers was changed with version 3.6: Up to version 3.6 offers on return trips are provided as 
separate offers with a dependency described via the return offer tags. 
With version 3.7 it is possible 
to define real return offers as a single return offer referencing inward and outward trip via trip coverage objects. The 
old way of providing separate offers with return tags is still allowed but not recommended.

## Searching for return offers

To search for return offers the client needs to provide information on inbound and outbound trip. This 
might be done via trip search parameters, via trip ids or via trip specification.

The outbound trip search parameters, outbound tripIs and outbound
tripSpecifications are provided in the usual trip search parameter, ids and
specifications. The return search parameters, ids and specifications are
provided in dedicated return parameters.

There are two possible implementations supported:

### Separate search for outbound and inbound trips

The search is made with search parameters for the outbound trip. A second search is made for the 
inbound trips indicating offers selected from the outbound search.

This was the main approach until version 3.7.

### combined search for outbound and inbound trips

Inbound and outbound trip are provided in the search for offers. 

This is the main approach for version 3.7 onwards.


### Using trip search parameters

The return trip search parameters are used to provide the search parameters for
the inbound trip additionally to the outbound trip search parameters in the
offer request. The return trip search parameters are part of the trip search
parameters. 

The return trip search parameters with the full set of parameters
were added in version 3.7.0, in previous versions the return parameters were more limited..

A warning `RETURN_OFFER_LIST_TRUNCATED` is provided in case the number of
combinations was limited for technical reasons.

#### Using trip ids

The trips have been requested via independent trip searches beforehand.

The inbound trip ids are used to provide the inbound trips additionally to the
outbound trips provided in the usual the trip ids.

The inbound trip ids were added in version 3.7.0.

A warning is provided in case the number of combinations was limited for
technical reasons.

#### Using trip specifications

The inbound trip specifications are used to provide the inbound trips
additionally to the outbound trips provided in the usual the trip
specifications.

The inbound trip specifications were added in version 3.7.0.

Dedicated return offers that can not be separated must include the inbound and
outbound trip. The inbound trip coverage must be provided.

A warning `RETURN_OFFER_LIST_TRUNCATED` is provided in case the number of
combinations was limited for technical reasons.

#### Using trip ids and trip search parameter

The return trip search parameters are used to provide the search parameters for
the inbound trips additionally to the outbound trips provided by its id.

The inbound trip provides the additional travel dates and times and might
include different parameters and via stations.

The return trip search parameters with the full set of parameters were added in
version 3.7.0.

A warning `RETURN_OFFER_LIST_TRUNCATED` is provided in case the number of
combinations was limited for technical reasons.

#### Using outbound offer id in the trip search parameter

The return trip search parameters are used to provide the search parameters for
the inbound trips additionally to an outbound offer referenced by its id. 

The return trip search parameters provides the additional travel dates and times
and might include different parameters and via stations. The return trip search
parameters with the full set of parameters were added in version 3.7.0.

A warning `RETURN_OFFER_LIST_TRUNCATED` is provided in case the number of
combinations was limited for technical reasons.


## Indicating return offers

Offers provided for a request including an inbound offer might or might not
depend on inbound and outbound trips. This dependency can be expressed in the
following ways:

- **Independent offers** related to inbound or outbound trip only. The tripCoverage
  links to either the inbound or the outbound trip.
  
- **Dependent offers using return tags (up to version 3.6)**: The
  offers must be provided as separate offers, each linking to one of the trips.
  The offer parts offers include return offer tags. Offers must be combined with
  other offers including the same offer tag only. If an offer does not provide
  return tags it is combinable with all other offers without return tag.

  The price of the combined offer can either be placed in foll on one offer part
  or split between both parts.

- **Single Return Offer  (version OSDM v.3.7 onwards)**: The offers is provided
  as one offer linking to the inbound and the outbound trip using `tripCoverage` and `inboundTripCoverage` objects. With
  version OSDM v.4 the inboundTripCoverage is part of the tripCoverage array.
  This is the preferred way to provide real return offers, although the option
  to use separate offers with return offer tags is still allowed.

### Example Using returnTags

- Outbound Offers

  - Offer1: -
  - Offer2: #123
  - Offer3: #234, #123
  - Offer4: -

- Inbound Offers

  - Offer5: -
  - Offer6: #123
  - Offer7: #345
  - Offer8: #123, #234

- Valid Combinations

  - Offer1 + Offer5 (no constraint on Tags)
  - Offer4 + Offer5 (no constraint on Tags)
  - Offer2 + Offer6
  - Offer2 + Offer8
  - Offer3 + Offer6
  - Offer3 + Offer8

  Offer7 cannot be combined with any offer on the outbound set.
