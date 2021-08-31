---
layout: post
title: "OSDM Demo App Publicly Available"
author: Andreas Schlapbach
date: 2021-09-25 14:20:33 +0100
categories: osdm update
---

The Open Sales and Distribution Model (OSDM), a B2B Sector Initiative (Railways and Ticket Vendors), is the sector solutions to the need for an open, plug-and-play IT framework for the distribution of international rail passenger services.

The OSDM-Specifications for the Offline and Online parts are available free of charge for everybody, based on JSON API REST format, therefore suitable for online sales.

Having the [OSDM sandbox](https://unioninternationalcheminsdefer.github.io/OSDM/tools/sandbox/) provided by [Sqills](https://sqills.com) available, the natural next step was to built an app connecting to the sandbox using the OSDM API.

Thus, SBB posed the challenge to develop an app to one of its developers. The time budget was fixed to 7 days. [Hoang Tran](https://www.linkedin.com/in/hoang-tran-388200195/), a front end developer at SBB's [AppBakery](https://appbakery.medium.com/), took the challenge and without any prior knowledge about online distribution started to work on the app.

The result of this challenge is presented below.

>> Bilder oder Video <<

The app covers the complete booking flow including the reservation of seats and ancillary services and supports  trains, buses or other means of public transportation.

Interestingly, the app is developed without any backend, thus directly consuming the API. Last but not least, the app is multi-platform and runs natively on Android, iOS or the web (thanks to [Flutter](https://flutter.dev/)).

[Andreas Schlapbach](https://www.linkedin.com/in/andreas-schlapbach/), SBB Architect & Tech Lead OSDM, says.

  *"While were quite confident that our API was consistent and feature rich, we were unsure how intuitive or difficult the API is to consume, especially for somebody not related to the field of online distribution. The app developed of Hoang in such a short time frame is astonishing and shows that results can be reached and that the API can easily be consumed by any party. It also shows that the API is well-documented, consistent and ready for use."*

In order for other parties to start their distribution front-ends, SBB has decided to open source the app on [GitHub](https://github.com/).

[Vittorio Carta](https://www.linkedin.com/in/vittorio-carta-mba-0b90b728/), DB Transport Policy Europe Manager and OSDM Chair says:

  *“Again, a great demonstration that OSDM is the right and smart choice to improve seamless ticketing and distribution for passengers, and another great effort performed by the technical team!”*

Thanks to Hoang Tran for his amazing work!
