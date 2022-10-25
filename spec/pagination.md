---
layout: page
title: Pagination
hide_hero: true
permalink: /spec/pagination/
---

## Pagination

OSDM uses cursor based pagination and the `_links` concept of **HATEOAS** for pagination. Thus, for responses where pagination is relevant, pagination links will be added, following URL to `next` and `previous` pages are provided if pagination shall be supported.

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
      "href": "https://api.osdm.com/bookings/123124?page=next"
    },
    {
      "rel": "previous",
      "href": "https://api.osdm.com/bookings/123124?page=previous"
    }
    ...
  ]
}
```

The nature of the link is indicated by the `rel` attribute.

Where semantically valid, additional links to the `first`and `last` pages can be provided, i.e., the`/bookings` resource.

## Resources Supporting Pagination

With this version of the specification, the following resources should support pagination:

- **GET** `/trip-collections/`
- **GET** `/offers-collections/`
- **GET** `/exchange-offers/`
- **GET** `/bookings/`
- **GET** `/products/`
- **GET** `/coachLayouts/`
- **GET** `/places/`
- **GET** `/zones/`

Note that while a `page` query parameter is provided for verbs supporting pagination, it is not mandatory to use it: One implementor might use the parameter to scroll with a fixed collectionId, while another could prefer consider scrolling the retrieval of previous and next collections, thus ignoring the parameter and linking to collections with a different id.
