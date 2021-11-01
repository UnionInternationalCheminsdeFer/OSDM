---
layout: page
title: Compliance
hide_hero: true
permalink: /spec/compliance/
---

## Compliance

To be compliant with the OSDM specification in total a party must be compliant
with the offline as well as the online part of the specification. However, a
party can decide based on their business need to implement the offline or the
online part online based on the role they want to play in the distribution and
sales process.

![Compliance](../images/compliance/compliance.svg)

## Compliance with the Offline Part

An implementation of the bulk data exchange specification is compliant with the
specification if

- A feature specified in the data structure is implemented

Or

- A fare providing the feature in its data is excluded from sale

A system receiving data for a fare must be able to understand all features and
rules of the fare defined in the data and obey these features and rules or must
not sell such a fare.

## Compliance with the Online Part

### Compliance as an Allocator

The following services/features are mandatory/optional to implement:

| Resources | Description | Need to Support |
| --- | --- | --- |
| `/places` and `/trips` | Resources to search for trip and places | **Mandatory** for train stations UIC code need to be supported. |
| `/trip-offers-collection` and `/trip-offers` and `/offers` | Resources to get bookable offers | **Mandatory** is to provide at least admission offers. |
| `/offers/{offerId}/admissions` and `/offers/{offerId}/reservations` and `/offers/{offerId}/ancillaries` | Resources to manipulate parts of an offer consisting of, e.g., admissions, reservations or ancillaries; | **Mandatory** |
| `/offers/{offerId}/reservations/{reservationId}` | Resources to manipulate seat assignment | *Conditional*; mandatory to be supported in case seat assignment is provided. |
| `/bookings` | Resources to manipulate bookings | **Mandatory** |
| `/bookings/{bookingId}/passengers` | Resources to manipulate passenger information at every stage of the flow | **Mandatory** |
| `/bookings/{bookingId}/booker` | Resources to manipulate a bookers information at every stage of the flow | **Mandatory** |
| `/products` | Resources to retrieve products information on one or more products | **Mandatory** |
| `/bookings/{bookingId}/fulfillments` and `/fulfillments` | Resources to retrieve fulfillments, e.g. tickets | **Mandatory** is to support A4 PDF tickets. |
| `/bookings/{bookingId}/refundOffers` | Resources to get and accept a refund offer | **Mandatory** is to support full refund. |
| `/bookings/{bookingId}/exchangeOffers` | Resources to get and accept an exchange offer | *Optional* |
| `/coachLayouts` | Resources to get layouts of coaches | *Optional* |

All [non-functional requirements](../non-functional-requirements) defined in the services must be fulfilled.

Especially all implementations most support the Tolerant Reader pattern. This
integration pattern helps creating robust communication systems. The idea is to
be as tolerant as possible when reading data from another service. This way,
when the communication schema changes, the readers must not break.

### Compliance as a Fare Provider

The following services/features are mandatory/optional to implement:

| Resources | Description | Need to Support |
| --- | --- | --- |
| `/places` and `/trips` | Resources to search for trip and places | *Optional* |
| `/trip-offers-collection` and `/trip-offers` and `/offers` | Resources to get bookable offers | **Mandatory** is to provide fare offers on a `/trip-offers-collection`. *Optional*: `/offers` for non trip based offers. |
| `/offers/{offerId}/admissions`and `/offers/{offerId}/reservations` and `/offers/{offerId}/ancillaries` and `/offers/{offerId}/fares` | Resources to manipulate parts of an offer consisting of, e.g., admissions, reservations or ancillaries; if permitted, also fares are offered. | **Mandatory** is to support pre-booking and booking of fares. |
| `/bookings` | Resources to manipulate bookings | **Mandatory** is to support bookings consisting of fares except in the special case of direct sale fare offers |
| `/offers/{offerId}/passengers` and `/bookings/{bookingId}/passengers` | Resources to manipulate  passenger information at every stage of the flow | *Conditional*, mandatory to be supported in case personal data are required by the fare provider |
| `/products` | Resources to retrieve products information on one or more products | **Mandatory** |
| `/offers/{offerId}/fares/{fareId}` and `/offers/{offerId}/reservations/{reservationId}` | Resources to manipulate seat assignment | *Conditional*, to be supported in case seat assignment is provided. |
| `/bookings/{bookingid}/fulfillments` and `fulfillments` | Resources to retrieve fulfillments, e.g. tickets | *Conditional*, mandatory to be supported in case fulfillment items need to be provided |
| `/bookings/{bookingId}/refundOffers` | Resources to get and accept a refund offer | **Mandatory** is to support for full refund, partial refund is optional. Not required in the special case of direct sale offers |
| `/bookings/{bookingId}/exchangeOffers` | Resources to get and accept an exchange offer | *Optional* |
| `/coachLayouts` and `/coachLayouts/{layoutId}` | Resources to get layouts of coaches | *Optional* |

All [non-functional requirements](../non-functional-requirements) defined in the services must be fulfilled.

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
