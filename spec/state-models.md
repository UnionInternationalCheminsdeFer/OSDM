---
layout: page
title: State Models
hide_hero: true
permalink: /spec/state-models/
---

## Table of contents

1. [State Models](#stateModels)
   1. [Trip State Model](#trip)
   2. [Booking State Model](#booking)
   3. [Booking Part State Model](#bookingPart)
   4. [Fulfillment State Model](#fulfillment)
   5. [Fulfillment Summary / Content State Model](#fulfillmentContent)
   6. [Fulfillment State Model with Activation](#fulfillmentActivation)
   7. [Refund State Model](#refund)
   8. [Exchange State Model](#exchange)
   9. [Complaint State Model](#complaint)

## State Models <a name="stateModels">

### Trip State Model <a name="trip">

The state `PLANNED` is relevant for trips on touristic trains or if trains only
run if a certain amount of bookings have been made. If the the trip is
confirmed, the purchaser can be informed using the webhook API.

![Trip State Model](../../images/models/trip-state-model.png)

### Booking State Model <a name="booking">

The status applies to the booking parts, no booking state exists.

### Booking Part State Model <a name="bookingPart">

![Booking State Model](../../images/models/booking-state-model.png)

### Fulfillment State Model <a name="fulfillment">

![Fulfillment State Model](../../images/models/fulfillment-state-model.png)

### Fulfillment Content State Model <a name="fulfillmentContent">

The fulfillment content state describes the general state of the content of a fulfillment generated in asynchronous mode. In the Booking object it describes a summary:

        - PENDING   some content of the fulfillment is not jet generated. In a booking it indicates that for at least one fulfillment not all content has jet been generated.
        - CREATED   all requested content in a fulfillment is created. In a booking it indicates that all the requested content of all fulfillments has been generated. 
        - COMPLETE  all possible content in a fulfillment is created. In a booking it indicates that all the possible content of all fulfillments has been generated. 

The difference between CREATED and COMPLETE referes to the case of content that requires an additional activation to be created (e.g. multi journey tickets where individual tickets need to be activated). If the last multi journey ticket is created the fulfillment is complete.

Note: in version 4 the status has been renamed to FulfillmentContentStatus.

### Fulfillment State Model with Activation <a name="fulfillmentActivation">

In case of multi-journey products, a fulfillment needs to be activated before,
thus it changes from `AVAILABLE` to `FULFILLED`.

![Fulfillment State Model](../../images/models/fulfillment-state-model-with-activation.png)

### Refund State Model <a name="refund">

![Refund State Data Model](../../images/models/refund-state-model.png)

### Exchange State Model <a name="exchange">

Values are a subset of the booking status values (see before).
![Exchange State Data Model](../../images/models/exchangeOperation-state-model.png)

### Complaint State Model <a name="complaint">

![Complaint State Model](../../images/models/complaint-state-model.png)
