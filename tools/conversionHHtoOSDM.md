---
layout: page
title: Conversion Hermes Hosa To OSDM and Back
permalink: /tools/conversionHHtoOSDM/
---

## Aim

The aim of this conversion is to build a migration path from the Hermes/Hosa protocol
to OSDM. Thus if a railway does not support OSDM yet the **Hermes Hosa to OSDM (H2O)
Converter** ensures that it can connect to railways supporting OSDM. Conversely, if
a railway only supports OSDM it guarantees that it can connect to railways supporting
Hermes Hosa only.

## Initial Analysis

The initial analysis has focused on proving the feasibility of the approach.

### Conversion Hermes Hosa to OSDM

  This conversion is simple as can be seen in the following table

  | Use Case | Hermes Hosa | OSDM     |
  |----------|-------------|----------|
  | get reservations offers | `BookingRequest` with `informationOnly=true` | `GET /trip-offers(searchCriteria)` |
  | book offer              | `BookingRequest` | `POST /bookings` followed by `POST /booking/{bookingId}/fulfillments` |
  | cancel booking          | `CancelRequest` with `reason code` | `POST /bookings/{booking}/refundOffers` |
  | refund booking          | `CancelRequest`  | `POST /bookings/{booking}/refundOffers` |
  | (exchange booking)      | *out of scope* | *out of scope*  |

  SBB has the business need to support this conversion process and is working with
  [Hitrail](https://www.hitrail.com/) to build such a converter.

### Conversion OSDM to Hermes Hosa

  This conversion is more complex, especially mapping the `/trips-offers/` call to
  `BookingRequest`. If some restrictions on possible reservations are taken however
  the converter can be realized.
  
  The business need for this form of conversion still needs to be discussed.
