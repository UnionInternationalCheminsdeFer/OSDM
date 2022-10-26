---
layout: page
title: OSDM Release Version 1.2
hide_hero: false
permalink: /releases/OSDM-release-notes-v1.2/
---

## What's New In OSDM Version 1.2

The following features have been added with version 1.2 of OSDM.

### Add support to sell non-journey based products (passes)

A new booking flow enables to sell tickets that are not bound to a trip, e.g.,
day passes or ancillary service such a WIFI access. This feature opens the
possibility to potentially sell public transportation unrelated services such as
entrance to a museum or concert.

See the `/non-trip-based-offers` for more details.

### Add support to query availabilities

If supported by the underlying systems, the attribute `numericAvailability`
returns the number of offers of a given fare still available. Having the number
of available service is of special values for agents helping a passenger to find
the best time to travel

Note that the availability is on _fares_ and not on actual seats.

### Complete support for partial refund/exchange

Exchange of tickets especially with yielded fares is a difficult topic. In this
release we have carefully reviewed the initial implementation of OSDM V1.1 and
completed it where necessary. The most atomic element we can after-sale on is a
ticket (Ticket Control Number).

See the resources under **Exchange** for details.

### Combination of offers

While there are powerful combination rules on fare level, OSDM was lacking this
feature on offer level. With this release, we have added a light-weight option
to steer the combination of offers. This allows a fare provider or distributor
to control the combination of its offers with other. This can be used for return
tickets as well as offer-based through fares.

In a nutshell the mechanism is the following: if no combination tags are set, an
offer can be combined with any other offer. However, if the tags are set, only
offers which contain the tags can be combined. The tags can be defined mutually
between two parties.

See the `tripTags` and `returnTags` attribute on `Offer` for details.

### Add full support for PRMs

If a passenger has reduced mobility the basic idea is that an OSDM distributor
implementation informs the _UIC's PRM ABT_ about the travel wish such that he or
she can be contacted by the experts. The impacts on OSDM are:

- If we have a PRM traveling from to _A_ to _B_ (via _C_) a system implementing
  OSDM must inform the UIC's PRM ABT tool about the assistance needs a these
  stops.

Impact on specification: The `PRMNeedType` `NEED_PRM_SUPPORT` allows to indicate
the need to ask for support at a station. In this case the distributor needs to
inform the UIC ABT Tool to contact the passenger. The distributor thus needs to
transfer the passenger's contact address (mail or phone) and the booking id.

- If a request of PRM assistance can not be met, a refund/exchange process must
  be triggered by UIC's PRM ABT tool via the OSDM protocol and the PRM must be
  informed accordingly.

Impact on specification: The over rule code `PRM_SUPPORT_UNAVAILABLE` allows a
booking to be refunded or exchanged by the UIC PRM ABT tool even when the fare
is non-refundable/exchangeable.

Other work addressed includes:

- Improving the API's description
- Fixing minor inconsistencies
- Incorporating feedback from the first implementors
- Setting up a mock infrastructure as well as writing actual mocks
- Best Practices concerning non-functional requirements
