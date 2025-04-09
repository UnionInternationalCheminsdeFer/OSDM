---
layout: page
title: Compliance
hide_hero: true
permalink: /spec/compliance/
---

## Table of contents

1. [Compliance](#Compliance)
2. [Compliance with the Offline Part](#CompliancewiththeOfflinePart)
3. [Compliance with the Online Part](#CompliancewiththeOnlinePart)
   1. [Compliance as a Distributor](#ComplianceasaDistributor)
   2. [Compliance as a Carrier aka. Fare Provider](#ComplianceasaCarrieraka.FareProvider)


## Compliance <a name="Compliance">

To be compliant with the OSDM specification in total a party must be compliant
with the offline as well as the online part of the specification. However, a
party can decide based on their business need to implement the offline or the
online part online based on the role they want to play in the sales process.

![Compliance](../images/compliance/compliance.png)

## Compliance with the Offline Part <a name="CompliancewiththeOfflinePart">

An implementation of the bulk data exchange specification is compliant with the
specification if

- A feature specified in the data structure is implemented

Or

- A fare providing the feature in its data is excluded from sale

A system receiving data for a fare must be able to understand all features and
rules of the fare defined in the data and obey these features and rules or must
not sell such a fare.

## Compliance with the Online Part <a name="CompliancewiththeOnlinePart">

### Compliance as a Distributor <a name="ComplianceasaDistributor">

The following services/features are mandatory/optional to implement:

| Resources                             | Description                                                                 | Need to Support                                        |
| ------------------------------------- | --------------------------------------------------------------------------- | ------------------------------------------------------ |
| `/offers`                             | Resources to get bookable offers                                            | **Mandatory** is to provide at least admission offers. |
| `/bookings`                           | Resources to manipulate bookings                                            | **Mandatory**                                          |
| `/bookings/{bookingId}/passengers`    | Resources to manipulate passenger information at every stage of the flow    | **Mandatory**                                          |
| `/bookings/{bookingId}/purchaser`     | Resources to manipulate a purchasers information at every stage of the flow | **Mandatory**                                          |
| `/bookings/{bookingId}/fulfillments`  | Resources to retrieve fulfillments, e.g. tickets                            | **Mandatory** is to support A4 PDF tickets.            |
| `/bookings/{bookingId}/refund-offers` | Resources to get and accept a refund offer                                  | **Mandatory** is to support full refund.               |
| `/bookings-search/`                   | Resources to search for bookings                                            | _Optional_                                             |
| `/products-search/`                   | Resources to search for products                                            | _Optional_                                             |
| `/fulfillments`                       | Resources to retrieve fulfillments, e.g. tickets                            | **Mandatory** is to support A4 PDF tickets.            |

| Trip planning Resources | Description                     | Need to Support |
| ----------------------- | ------------------------------- | --------------- |
| `/places`               | Resources to search for a place | _Optional_      |
| `/trips`                | Resources to search for trips   | _Optional_      |

| Booking Modifications Resources                                    | Description                                                           | Need to Support                                                               |
| ------------------------------------------------------------------ | --------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `/bookings/{bookingId}/booked-offers/{bookedOfferId}/ancillaries`  | Resources to manipulate parts of a booking consisting of ancillaries  | _Conditional_                                                                 |
| `/bookings/{bookingId}/booked-offers/{bookedOfferId}/reservations` | Resources to manipulate parts of a booking consisting of reservations | _Conditional_; mandatory to be supported in case seat assignment is provided. |

| Reservation Resources | Description                                                   | Need to Support                                                               |
| --------------------- | ------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `/availabilities`     | Resources to get information on available seats for a booking | _Conditional_; mandatory to be supported in case seat assignment is provided. |

| Advanced After Sales Resources                    | Description                                                                                       | Need to Support |
| ------------------------------------------------- | ------------------------------------------------------------------------------------------------- | --------------- |
| `/bookings/{bookingId}/documents`                 | Resources to add documents to a booking                                                           | _Optional_      |
| `/bookings/{bookingId}/exchange-operations`       | Resources to manage exchange operations                                                           | _Optional_      |
| `/bookings/{bookingId}/release-offers`            | Resources to get and accept a release offer to return a ticket as a preliminary step for a refund | _Optional_      |
| `/bookings/{bookingId}/reimbursements`            | Resources to manage reimbursements of unused tickets                                              | _Optional_      |
| `/bookings/{bookingId}/on-hold-offers`            | Resources to manage on hold offers (extensions of the booking time limit)                         | _Optional_      |
| `/bookings/{bookingId}/cancel-fulfillment-offers` | Resources to cancel a fulfillment                                                                 | _Optional_      |

| Complaint Resources | Description                    | Need to Support |
| ------------------- | ------------------------------ | --------------- |
| `/complaints`       | Resources to manage complaints | _Optional_      |

| Master Data Resources | Description                                                        | Need to Support |
| --------------------- | ------------------------------------------------------------------ | --------------- |
| `/coach-layouts`      | Resources to get layouts of coaches (deprecated as of V.3.5)       | _Optional_      |
| `/coach-deck-layouts` | Resources to get coach deck layouts                                | _Optional_      |
| `/places`             | Resources to get all places                                        | _Optional_      |
| `/products`           | Resources to retrieve products information on one or more products | _Optional_      |
| `/product-tags`       | Resources to retrieve products tags and their grouping             | _Optional_      |
| `/reduction-cards`    | Resources to retrieve reduction cards                              | _Optional_      |
| `/zones`              | Resources to retrieve zone information                             | _Optional_      |

All [non-functional requirements](../non-functional-requirements) defined in the
services must be fulfilled.

Especially all implementations most support the Tolerant Reader pattern. This
integration pattern helps creating robust communication systems. The idea is to
be as tolerant as possible when reading data from another service. This way,
when the communication schema changes, the readers must not break.

### Compliance as a Carrier aka. Fare Provider <a name="ComplianceasaCarrieraka.FareProvider">

The following services/features are mandatory/optional to implement:

| Resources                            | Description                                                                 | Need to Support                             |
| ------------------------------------ | --------------------------------------------------------------------------- | ------------------------------------------- |
| `/offers`                            | Resources to get bookable offers                                            | **Mandatory** is to provide fare offers     |
| `/bookings`                          | Resources to manipulate bookings                                            | **Mandatory**                               |
| `/bookings/{bookingId}/passengers`   | Resources to manipulate passenger information at every stage of the flow    | **Mandatory**                               |
| `/bookings/{bookingId}/purchaser`    | Resources to manipulate a purchasers information at every stage of the flow | **Mandatory**                               |
| `/bookings/{bookingId}/fulfillments` | Resources to retrieve fulfillments, e.g. tickets                            | **Mandatory** is to support A4 PDF tickets. |
| `/bookings/{bookingId}/refundOffers` | Resources to get and accept a refund offer                                  | **Mandatory** is to support full refund.    |
| `/booking-search/`                   | Resources to search for bookings                                            | _Optional_                                  |
| `/products-search/`                  | Resources to search for products                                            | _Optional_                                  |
| `/fulfillments`                      | Resources to retrieve fulfillments, e.g. tickets                            | **Mandatory** is to support A4 PDF tickets. |

| Trip planning Resources | Description                     | Need to Support |
| ----------------------- | ------------------------------- | --------------- |
| `/places`               | Resources to search for a place | _Optional_      |
| `/trips`                | Resources to search for trips   | _Optional_      |

| Booking Modifications Resources                                    | Description                                                           | Need to Support                                                               |
| ------------------------------------------------------------------ | --------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `/bookings/{bookingId}/booked-offers/{bookedOfferId}/ancillaries`  | Resources to manipulate parts of a booking consisting of ancillaries  | _Conditional_                                                                 |
| `/bookings/{bookingId}/booked-offers/{bookedOfferId}/reservations` | Resources to manipulate parts of a booking consisting of reservations | _Conditional_; mandatory to be supported in case seat assignment is provided. |

| Reservation Resources | Description                                                   | Need to Support                                                               |
| --------------------- | ------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `/availabilities`     | Resources to get information on available seats for a booking | _Conditional_; mandatory to be supported in case seat assignment is provided. |

| Advanced After Sales Resources                    | Description                                                                                       | Need to Support |
| ------------------------------------------------- | ------------------------------------------------------------------------------------------------- | --------------- |
| `/bookings/{bookingId}/documents`                 | Resources to add documents to a booking                                                           | _Optional_      |
| `/bookings/{bookingId}/exchange-operations`       | Resources to manage exchange operations                                                           | _Optional_      |
| `/bookings/{bookingId}/release-offers`            | Resources to get and accept a release offer to return a ticket as a preliminary step for a refund | _Optional_      |
| `/bookings/{bookingId}/reimbursements`            | Resources to manage reimbursements of unused tickets                                              | _Optional_      |
| `/bookings/{bookingId}/on-hold-offers`            | Resources to manage on hold offers (extensions of the booking time limit)                         | _Optional_      |
| `/bookings/{bookingId}/cancel-fulfillment-offers` | Resources to cancel a fulfillment                                                                 | _Optional_      |

| Complaint Resources | Description                    | Need to Support |
| ------------------- | ------------------------------ | --------------- |
| `/complaints`       | Resources to manage complaints | _Optional_      |

| Master Data Resources | Description                                                        | Need to Support |
| --------------------- | ------------------------------------------------------------------ | --------------- |
| `/coach-layouts`      | Resources to get layouts of coaches                                | _Optional_      |
| `/coach-deck-layouts` | Resources to get coach deck layouts                                | _Optional_      |
| `/places`             | Resources to get all places                                        | _Optional_      |
| `/products`           | Resources to retrieve products information on one or more products | _Optional_      |
| `/product-tags`       | Resources to retrieve products tags and their grouping             | _Optional_      |
| `/reduction-cards`    | Resources to retrieve reduction cards                              | _Optional_      |
| `/zones`              | Resources to retrieve zone information                             | _Optional_      |

All [non-functional requirements](../non-functional-requirements) defined in the
services must be fulfilled.

On a technical level the implementation must support the Tolerant Reader
pattern. This integration pattern helps creating robust communication systems.
The idea is to be as tolerant as possible when reading data from another
service. This way, when the communication schema changes, the readers must not
break.

An implementation of specification is compliant with the specification if for a
given version

- A feature specified in the data structure is implemented

Or

- A fare providing the feature in its data is excluded from sale

A system receiving data for a fare must be able to understand all features and
rules of the fare defined in the data and obey these features and rules or must
not sell such a fare.
