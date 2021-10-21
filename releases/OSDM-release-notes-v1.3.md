---
layout: page
title: OSDM Release Version 1.3
hide_hero: false
permalink: /releases/OSDM-release-notes-v1.3/
---

## What's New In OSDM Version 1.3

The following features have been added with version 1.3 of OSDM.

### Align to /places and /trips to Open Joruney Planer (OJP) of Transmodel

The main focus of this PI was to align the modelling of places and trips of OSDM to the model of OJP. The benefits of this change are to profit from the domain knowledge of trip planning as well as to comply with European initiative such as the National Access Point initiative. Additionally, OJP allows to search trips for new modes of transport such as scooters or bikes using the concept of `continuous leg`.

See the `/places` and the `/trips` resource for details.

### Add real time support

Another advantage of the alignment with OJP was to get real time support as part of the OSDM standard. Thus in a trip it is now possible to indicate the actual quay a train is arriving as well as the delay time of a train.

### Add support for promotions

The OSDM APIs now allows to pass in promo codes in the offer search criteria. If valid and applicable, they will be taken into account while calculating offers.

See the `PromotionCode` attribute for details.
  
### Add the possibility for direct booking

If an offer is flag as reusable it can be reused, thus they can be cached on clients side. Thus it isn't necessary to get an offer each and every-time.

This feature allows to implement an expert mode where the cached offers can directly be booked.
  
Special tariffs can be sent in via the promocode attribute.

### Indicate test data in offline data exchange

*OSDM offline feature*: This feature allows to indicate whether data in the OSDM offline delivery is for testing purposes only.

Other work addressed includes:

- Improving the API's description
- Fixing minor inconsistencies
- Incorporating feedback from the first implementors
- Setting up a mock infrastructure as well as writing actual mocks
- Best Practices concerning non-functional requirements
