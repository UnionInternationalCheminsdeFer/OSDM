---
layout: page
title: OSDM Release Version 1.3
hide_hero: false
permalink: /releases/OSDM-release-notes-v1.3/
---

## What's New In OSDM Version 1.3

The following features have been added with version 1.3 of OSDM.

- **Align /locations and /trips to Transmodel (OJP)**

  The main focus of this PI was to with the modelling of locations and trips to the model of OJP. The benefit of this change is to comply with European initiative such the National Access Point.

  Additionally, OJP allows to search trip for new modes such as scooters or bikes.

  See the `/places` and the `/trips` resource for details.

- **Add real time support**

  An advantage of alignment with OJP was to get real time support as part
  of the OSDM standard. Thus in a trip it is now possible to indicate the actual quay a train is arriving as well as the delay time of a train.

- **Add support for promotions**

  The OSDM APIs now allows to pass in promo code in the offer search criteria.
  They which will be taken account while calculating the offers if valid and applicable.

  See the `PromotionCode` attribute for details.
  
- **Add the possibility for direct booking**

  If an offer is reusable it can be reused, thus an expert can directly
  doesn't need to get offer repeatedly but can use it to directly book.
  Special tariffs can be sent in via the promocode attribute.

- **Indicate test data in offline data exchange**

  *OSDM offline feature*: Allows to indicate whether data in the OSDM offline delivery is for testing purpose only.

Other work addressed includes:

- Improving the API's description
- Fixing minor inconsistencies
- Incorporating feedback from the first implementors
- Setting up a mock infrastructure as well as writing actual mocks
- Best Practices concerning non-functional requirements
