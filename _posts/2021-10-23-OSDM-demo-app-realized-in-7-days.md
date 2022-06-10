---
layout: post
title: "OSDM Demo App Realized in Seven Days"
author: Andreas Schlapbach
date: 2021-10-23 10:20:33 +0100
categories: osdm update
---

UIC member [SBB](https://www.sbb.ch), has built an **OSDM application in seven days** only using the **OSDM API** to show simulations of routes and services within the system and the capabilities of real time railway ticket distribution.

The application is connected to the [OSDM sandbox](https://osdm.io/tools/sandbox/) environment developed by [Sqills](https://sqills.com), which is powered by the Sqills S3 Passenger inventory, reservation and ticketing SaaS. The sandbox is a working prototype which enables the study of the behaviour and semantics of the OSDM API and is open to any party interested in implementing OSDM.  

Within this context, SBB presented one of its developers with the challenge of developing an application within seven days. [Hoang Tran](https://www.linkedin.com/in/hoang-tran-388200195/), a front-end developer at SBB’s [AppBakery](https://appbakery.medium.com/), took on the challenge – and without any prior knowledge about online distribution – started to work on the app.

The results is impressive; the app covers the complete booking flow, including the reservation of seats and ancillary services, and supports trains, buses or other means of public transport.

![App flow](https://osdm.io/images/blog/osdm-app-flow.gif)

Interestingly, the app is developed without any backend, thus directly consuming the API. Last but not least, the app is multi-platform and runs natively on Android, iOS or the web (thanks to [Flutter](https://flutter.dev/)).

[Andreas Schlapbach](https://www.linkedin.com/in/andreas-schlapbach/), SBB Architect & Tech Lead OSDM, says.

  *"While were quite confident that our API was consistent and feature rich, we were unsure how intuitive or difficult the API is to consume, especially for somebody not related to the field of online distribution. The app developed of Hoang in such a short time frame is astonishing and shows that results can be reached and that the API can easily be consumed by any party. It also shows that the API is well-documented, consistent and ready for use."*

In order for other parties to start their distribution front-ends, SBB has decided to open source the app on GitHub.

[Vittorio Carta](https://www.linkedin.com/in/vittorio-carta-mba-0b90b728/), DB Transport Policy Europe Manager and OSDM Chair says:

  *“Again, a great demonstration that OSDM is the right and smart choice to improve seamless ticketing and distribution for passengers, and another great effort performed by the technical team!”*

To enable other parties to start their distribution frontends, SBB will make the app publicly available on GitHub within the next few weeks.

UIC congratulates SBB and especially Hoang Tran on this achievement and fully supports this sector initiative with the aim of improving international passenger travel. 

This development follows the release in July of a factsheet and a short video explaining the implementation of the OSDM specification, as well as the benefits and purpose of this sector initiative. A longer version of the video can be seen here: [What is OSDM?](https://youtu.be/TVxQdq8nMAI).

For further information please consult [Andreas Schlapbach](https://www.linkedin.com/in/andreas-schlapbach/), Senior Architect, or [David Sarfatti](https://www.linkedin.com/in/dsarfatti/), Senior Passenger Advisor.

![SBB](https://osdm.io/images/logo/SBB-logo.png)


(Source: [https://uic.org/com/enews/article/osdm-demo-app-developed-in-seven-days?var_recherche=osdm](https://uic.org/com/enews/article/osdm-demo-app-developed-in-seven-days?var_recherche=osdm))