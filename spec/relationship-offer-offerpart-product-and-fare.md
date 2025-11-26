---
title: Relationship Offer, OfferPart, Product and Fare
hide_hero: true
layout: page
permalink: /spec/relationship-offer-offerpart-product-and-fare/
---

# Relationships between Offers, OfferParts, Products and Fares

The entities `offer`, `offerpart`, `product` and `fare` represent different
concepts.

An `offer` spans the trip consisting of segments. An `offerpart` spans a segment
or - in the case of through fares - multiple segments. An `offerpart` references
zero or two products. Mostly, the relationship is one-to-one (zero in case of
included seat reservation, whereas two products are only referenced in some rare
TGV-TER scenarios).

A `fare` is not necessarily bound to segments but reflects the tariff worlds. A
`fare` often starts or ends at country borders where no train station exist.
This border points are thus called `virtual border points` which can be modelled
by `ConnectionPoints`. Fares are combined following a `fare combination model`
to an offer.

![Relationships between Offers, OfferParts, Products and Fares](../../images/models/relationship-offer-offerpart-product-fare.png)

See [Constructing Products from Fares](../constructing-products-from-fares/)
to understand how fares are combined to products, offerparts and offers.
