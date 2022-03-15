---
layout: page
title: Pagination
hide_hero: true
permalink: /spec/pagination/
---

## Pagination

OSDM uses cursor based pagination and the `_links` concept of **HATEOAS** for pagination. Thus in a response
URL to `next` and `previous` pages are provided if pagination shall be supported.

```json
{
  "id": "trip-1",
  "trips": [],
  "_links": [
    {
      "self": {
        "href": "https://api.odsm.com/bookings/123124"
      }
    },
    {
      "next": {
        "href": "https://api.odsm.com/bookings/123124?query=next"
      }
    },
    {
      "previous": {
        "href": "https://api.odsm.com/bookings/123124?query=previous"
      }
    }
    ,..
  ]
}
```

Where semantically valid, additional links to the `first`and `last` pages can be provided, i.e., the
`/bookings` resource.

For further details, see [Pagination Guidelines](https://opensource.zalando.com/restful-api-guidelines/#160)
of the [Zalando RESTful API and Event Guidelines](https://opensource.zalando.com/restful-api-guidelines/).

## Resources Supporting Pagination

With this version of the specification, the following resources should support pagination:

- **GET** `/trip-collections/{tripCollectionId}`
- **GET** `/trip-offers-collections/{tripOfferCollectionId}`
- **GET** `/offers-collections/{offerCollectionId}`
- **GET** `/exchange-offers-collections/{exchangeOfferCollectionId}`
- **GET** `/bookings/`
