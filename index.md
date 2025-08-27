---
title: OSDM
subtitle: Open Sales and Distribution Model
layout: page
show_sidebar: true
hero_link: https://github.com/UnionInternationalCheminsdeFer/OSDM/blob/master/specification/v3.6/IRS-90918-10-v3.6.0.pdf
hero_link_text: Download Specification
---

## Introduction

The aims of the **Open Sales and Distribution Model (OSDM)** are twofold:

1. to substantially **simplify and improve the booking process for customers**
   of public transport trips and,
2. to **lower complexity and distribution costs** for retailers, distributor and
   carriers.

The OSDM **strengthens rail and public transport** as a convenient and
ecological means of transportation by simplifying distribution. Finally, it lays
a **solid fundament** which can be extended to the distribution of other means
of transportation.

The OSDM Online API and specification essentially consists of two parts:
**Offline Model** and **Online API**. The Online API works in two modes:
**Retailer Mode** and **Distributor Mode**. The Distributor Mode differs from
the Retailer Mode only in that additionally to **Admissions (aka. tickets)**,
**Reservations**, or **Ancillaries** also **Fares (a.k.a priced segments)** are
offered and can be booked.

The OSDM API and documents are **Open Source** and freely available to all
parties interested. The OSDM-Online API is modelled in `YAML`, fully supporting
the `REST paradigm`.

## Roles

The OSDM Model is split between roles participants can take:

- **Fare Provider** – defining the fare and combination rules and providing them
  to distributors offline or online.
- **Distributor** – combining fares, defining after sales rules within the
  frames set by the fare provider, providing combined offers and managing the
  booking transaction, managing the ticket security (barcode, control
  processes), managing compensations processes, managing the stock control
  process.
- **Retailer** – selling tickets from one or more distributors to the customer.
  Selecting the distributors and joining multiple independent bookings.

A railway/public transport company or a system provider can support more than
one role.

## Design Goals

The design of the OSDM-Online API focuses on three main goals:

1. To provide a convenient way for a customer to book an international train
   service, including refund and exchange processes.
2. To provide a specification that can be supported by existing or upcoming
   systems without major investments.
3. To reduce unnecessary message conversions between callers as they provide no
   business value.

To address the first goal we started with the customer experience and worked
backwards to define the sales and distributions processes supported by OSDM.
This resulted in a booking process modelled by the following steps:

- Searching for trips
- Getting offers
- Booking an offer
- Confirmation of the booking
- Fulfillment of the booking

Analogously, the after-sale process is modelled in the following steps:

- Getting a refund/exchange offers
- Booking a refund/exchange offer
- Fulfillment of the booking

To address the second goal, we studied the existing commercial products and
online distribution/carrier systems of [BENE](https://www.benerail.com),
[CD](https://www.cd.cz/), [DB](https://www.bahn.de/),
[DSB](https://www.dsb.dk/en/), [öBB](https://www.oebb.at/),
[PKP IC](https://www.intercity.pl/), [RENFE](https://www.renfe.com/),
[Rail Delivery Group](https://www.raildeliverygroup.com),
[SBB](https://www.sbb.ch), [SJ](https://www.sj.se/),
[SNCF](https://www.sncf.fr), [Trenitalia](https://www.trenitalia.com/) and other
**UIC Railways** as well as distribution solutions provided by
[Amadeus](https://amadeus.com/), [Sabre](https://www.sabre.com/),
[Silverrail](https://www.silverrailtech.com/), [Sqills](https://sqills.com/),
[Turnit](https://turnit.com), [Trainline](https://www.thetrainline.com/),
[Travelport](https://www.travelport.com/) and others. Furthermore, the
[Hermes ecosystem](https://www.hitrail.com/hermes-ecosystem) for reservations as
well as existing [UIC leaflets](https://www.shop-etf.com/en/leaflets-irs) were
carefully examined and taken into account.

Proofing that the specification is not bound to rail,
[Bileto](https://www.bileto.com/en) is successfully using the standard for the
distribution of bus rides.

Advisors from [CER](https://www.cer.be/), [CIT](https://www.cit-rail.org/en/),
[ECTAA](https://www.ectaa.org/en), [eu travel tech](https://eutraveltech.eu/),
[OpenRail Association](https://openrailassociation.org/) and sounding boards
from the **European Commission** as well as the **European Rail Agency** were
involved from the start and guided the effort.

By involving the [experts](./team) of all the parties, we are confident that the
OSDM Model is powerful enough to support the distribution of existing or
upcoming commercial products and can be implemented and supported at reasonable
cost.

To address the third goal we took an **end-to-end approach** to the call chain
from **Retailer** to **Distributor** to **Fare Provider (aka. carrier)** and
aligned the interfaces by modelling them the same. Thus calling a provider, an
distributor or a fare provider is exactly the same from an API perspective. The
only difference is that in distributor mode you get fare specific information.
