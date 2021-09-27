---
layout: post
title: "OSDM Demo App Publicly Available"
author: Andreas Schlapbach
date: 2021-10-04 14:20:33 +0100
categories: osdm update
---

## Introduction

The [Open Sales and Distribution Model (OSDM)](https://unioninternationalcheminsdefer.github.io/OSDM/) is a open source specification enabling interoperable ticket sales for trains and other modes of transport, and is defined in the new UIC International Railway Solution (IRS) 90918-10.

The OSDM API is jointly produced by the members of [UIC](https://uic.org) and Ticket Vendors with the members of [EU Travel Tech](https://eutraveltech.eu/) and the European Travel Agents’ and Tour Operators’ Association.

OSDM aims to enhance the customer experience along different modes by improving access to cross-border mobility offers and by providing combined tickets, at domestic and international levels, for most transport modes in a single purchase.

## The OSDM Demo App

UIC member SBB (Swiss Railways), has built an application using the OSDM API to show simulations of routes and services within the system and the capabilities of real time railway ticket distribution.

The application is connected to the  [OSDM sandbox](https://unioninternationalcheminsdefer.github.io/OSDM/tools/sandbox/) environment developed by [Sqills](https://sqills.com), which is powered by the Sqills S3 Passenger inventory, reservation and ticketing SaaS. The sandbox is a working prototype which enables the study of the behavior and semantics of the OSDM API and is open to any party interested in implementing OSDM.

Within this context, SBB presented one of its developers with the challenge of developing an application within seven days. [Hoang Tran](https://www.linkedin.com/in/hoang-tran-388200195/), a front end developer at SBB's [AppBakery](https://appbakery.medium.com/), took the challenge and without any prior knowledge about online distribution started to work on the app.

The result of this challenge is presented below.

>> Bilder oder Video <<

The app covers the complete booking flow including the reservation of seats and ancillary services and supports  trains, buses or other means of public transportation.

Interestingly, the app is developed without any backend, thus directly consuming the API. Last but not least, the app is multi-platform and runs natively on Android, iOS or the web (thanks to [Flutter](https://flutter.dev/)).

[Andreas Schlapbach](https://www.linkedin.com/in/andreas-schlapbach/), SBB Architect and Tech Lead OSDM, says.

  *"While were confident that our API was consistent and feature rich, we were unsure how intuitive or difficult the API is to consume, especially for somebody not related to the field of online distribution. The app developed of Hoang in such a short time frame is astonishing and shows that results can be reached and that the API can easily be consumed by any party. It also shows that the API is well-documented, consistent and ready for use. Thanks to Hoang Tran for his amazing work!"*

In order for other parties to start their distribution front-ends, SBB has decided to open source the app on [GitHub](https://github.com/).

[Vittorio Carta](https://www.linkedin.com/in/vittorio-carta-mba-0b90b728/), DB Transport Policy Europe Manager and OSDM Chair says:

  *“Again, a great demonstration that OSDM is the right and smart choice to improve seamless ticketing and distribution for passengers, and another great effort performed by the technical team!”*

UIC congratulates SBB on this achievement and fully supports this sector initiative with the aim of improving international passenger travel.

This development follows the release in July of a fact sheet and a short video explaining the implementation of the OSDM specification, as well as the benefits and purpose of the sector's initiative. A longer version of the video is currently being prepared and will be ready with the release of the next version of the OSDM version.

For further information please consult [David Sarfatti](https://www.linkedin.com/in/dsarfatti/), Senior Passenger Advisor UIC.

Visit the [OSDM GitHub web page](https://unioninternationalcheminsdefer.github.io/OSDM/) for more details on the specification or the [UIC OSDM webpage](https://uic.org/passenger/passenger-services-group/#OSDM) for general information on the UIC standards.
