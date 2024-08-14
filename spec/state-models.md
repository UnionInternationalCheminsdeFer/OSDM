---
layout: page
title: State Models
hide_hero: true
permalink: /spec/state-models/
---

## State Models <a name="stateModels">

### Trip State Model

The state `PLANNED` is relevant for trips on touristic trains or if trains only
run if a certain amount of bookings have been made. If the the trip is
confirmed, the purchaser can be informed using the webhook API.

![Trip State Model](../images/models/trip-state-model.png)

### Booking State Model

The status applies to the booking parts, no booking state exists.

### Booking Part State Model

![Booking State Model](../images/models/booking-state-model.png)

### Fulfillment State Model

![Fulfillment State Model](../images/models/fulfillment-state-model.png)

### Fulfillment State Model with Activation

In case of multi-journey products, a fulfillment needs to be activated before,
thus it changes from `AVAILABLE` to `FULFILLED`.

![Fulfillment State Model](../images/models/fulfillment-state-model-with-activation.png)

### Refund State Model

![Refund State Data Model](../images/models/refund-state-model.png)

### Exchange State Model

Values are a subset of the booking status values (see before).
![Exchange State Data Model](../images/models/exchangeOperation-state-model.png)

### Complaint State Model

![Complaint State Model](../images/models/complaint-state-model.png)
