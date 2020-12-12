---
title: OSDM
subtitle: Open Sales and Distribution Model
layout: page
show_sidebar: true
hero_link: ./OSDM-Online-v0.9.9.yml
hero_link_text: Download Specification
---

## Introduction

The aims of the **Open Sales and Distribution Model (OSDM)** are twofold:

1. to substantially **simplify the booking process for customers** of rail
   trips and,
2. to **lower complexity and distribution costs** for distributors and
   railway carriers.

OSDM strengthens rail as a convenient and ecological means of transportation by
simplifying distribution. Finally, it lays a solid fundament which can be
extended to the distribution of other means of transportation.

The OSDM API and specification essentially consists of two parts: **Offline
Model** and **Online API**. The Online API works in two modes: **Distributor Mode**
and **Allocator Mode**. The Allocator Mode differs from the Distributor
Mode only in that additionally to **admissions**, **reservations**, **integrated
reservations**, or **ancillaries** also **priced segments (aka. fares)** are offered
and can be booked.

The OSDM API and specification are *Open Source* and freely available to all
parties interested. The OSDM API is modelled in YAML fully supporting the REST
paradigm.

## Roles

The OSDM Model is split between roles participants can take:

- **Fare Provider** – defining the fare and combination rules and providing
  them to allocators offline or online.
- **Allocator** – combining fares, defining after sales rules within the frames
  et by the fare provider, providing combined offers and managing the booking
transaction, managing the ticket security (barcode, control processes),
managing compensations processes, managing the stock control process.
- **Distributor** – selling tickets from one or more allocators to the
  customer. Selecting the allocators and joining multiple independent bookings.

A railway or a system provider can support more than one role.

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
online distribution/carrier systems of **BENE**, **DB**, **öBB**, **RENFE**,
**SBB**, **SNCF**, **Trenitalia** and others as well as distribution solutions
provided by **Amadeus**, **Silverrail**, **Sqills**, **Trainline** and others.
Furthermore,  the **Hermes/HOSA** reservation eco-system as well as existing **UIC leaflets** were carefully examined and taken into account.

By involving the experts of the parties, we are confident that the OSDM
standard is powerful enough to support the distribution of existing or upcoming
commercial products and can be implemented and supported at reasonable cost.

To address the third goal we took an **end-to-end approach** to the call chain from
**Distributor** to **Allocator** to **Fare Provider (a.k.a Carrier)** and aligned the
interfaces by modelling them the same.  Thus calling a provider, an allocator
or a fare provider is exactly the same from an API perspective. The only
difference is that in allocator mode you get fare specific information needed.
This ensure that no complex transformation or mapping layers are required.

## Access to the Specification

All documents are **publicly available** in the [Specification](./spec) section.
