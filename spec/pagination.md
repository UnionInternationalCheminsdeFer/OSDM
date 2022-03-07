---
layout: page
title: Pagination
hide_hero: true
permalink: /spec/pagination/
---

## Pagination

OSDM uses cursor based pagination and the `_links` concept of HATEOAS for pagination. Thus in a response URL to *next* and *previous* pages are provided if pagination shall be supported.

```json
{
  id: "trip-1",
  trips: [],
  _links: [
    {
      relation: "self",
      href: "https://api.odsm.com/bookings/123124"
    }
    {
      relation: "next",
      href: "https://api.odsm.com/bookings/123124?query=next"
    },
    {
      relation: "previous",
      href: "https://api.odsm.com/bookings/123124?query=previous"
    }
  ]
}
```

This links can the be used as parameters to the `cursor` query parameter. For further details, see [Pagination Guidelines](https://opensource.zalando.com/restful-api-guidelines/#160) of the [Zalando RESTful API and Event Guidelines](https://opensource.zalando.com/restful-api-guidelines/).

## Resources supporting pagination

With this version of the specification, the following resources support pagination:

- **GET** `/trip-collections`
- **GET** `/trip-offers-collections`
- **GET** `/non-trip/offers-collections`
- **GET** `/exchange-offers-collections`
