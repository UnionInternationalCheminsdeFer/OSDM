---
layout: page
title: OSDM Release Version 3.8
hide_hero: false
permalink: /releases/OSDM-release-notes-v3.8/
---

## What's New in OSDM Version 3.8

### New Endpoints

- `GET /promotion-codes` — retrieve available promotion codes

### New Objects

- `CurrencyAmount`
- `PromotionCodeCollectionResponse`
- `SelectedCompartment`

### Highlights

- **Promotion codes** — new endpoint and supporting objects to enable discount and voucher workflows
- **Compartment selection** — `PlaceSelection` extended with compartment support via `SelectedCompartment`
- **Multilingual support** — translation properties added to `Address`, `Condition`, `FareConnectionPoint`, `GeneralAttribute`, `Product`, `Zone`, and more
- **Chip card fulfillment** — `CardReference` extended with `chipCardContentFormat` and `chipCardContent`
- **Provider fee flag** — `Fee` and `AfterSalesConditionsLink` gain `isProviderFee`
- **Exchange and refund fees** — new `exchangeFee` on `ExchangeOfferCollectionRequest` and `refundFee` on `RefundSpecification`
- **Distribution mode** — new `DistributionMode` enum on `ReservationOfferPart`
- **Fulfillment document references** — `Fulfillment` gains `fulfillmentDocumentRefs`

### Breaking Changes

We adhere to [Semantic Versioning](https://semver.org/), thus this version is
_backwards compatible with version 3.7._
