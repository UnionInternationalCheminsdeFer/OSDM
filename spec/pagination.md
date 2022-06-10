---
layout: page
title: Pagination
hide_hero: true
permalink: /spec/pagination/
---

## Pagination

OSDM uses cursor based pagination and the `_links` concept of **HATEOAS** for pagination. Thus, for responses where pagination is relevant, pagination links will be added, following 
URL to `next` and `previous` pages are provided if pagination shall be supported.

```json
{
  "id": "trip-1",
  "trips": [],
  "_links": [
    {
      "rel": "self",
      "href": "https://api.osdm.com/bookings/123124"
    },
    {
      "rel": "next",
      "href": "https://api.osdm.com/bookings/123124?query=next"
    },
    {
      "rel": "previous",
      "href": "https://api.osdm.com/bookings/123124?query=previous"
    }
    ...
  ]
}
```

Where semantically valid, additional links to the `first`and `last` pages can be provided, i.e., the
`/bookings` resource.

## Resources Supporting Pagination

With this version of the specification, the following resources should support pagination:

- **GET** `/trip-collections/{tripCollectionId}`
- **GET** `/trip-offers-collections/{tripOfferCollectionId}`
- **GET** `/offers-collections/{offerCollectionId}`
- **GET** `/exchange-offers-collections/{exchangeOfferCollectionId}`
- **GET** `/bookings/`
- **GET** `/products/`
- **GET** `/coachLayouts/`
- **GET** `/places/`
- **GET** `/zones/`
