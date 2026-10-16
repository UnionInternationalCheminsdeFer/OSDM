# Changelog v3.11.0

All changes merged into `master` since v3.10. See the
[full diff](https://github.com/UnionInternationalCheminsdeFer/OSDM/compare/v3.10...v3.11)
for the complete list of commits.

## Additions

- **Accounting references for fares** — accounting reference data added to the fare model ([#1545](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1545))
- **`deckLevel` on `ReservedPlace`** — identifies the deck of a reserved place in multi-deck vehicles ([#1543](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1543))
- **`AncillarySubType`** — new ancillary sub-type classification ([#1534](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1534))
- **`refundPaymentBreakdown`** — payment breakdown for refunds ([#1515](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1515))
- **`TripPatternRef` for `Trip`** — reference from a trip to its trip pattern ([#1611](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1611))
- **`tripTags`, `returnTags`, `offerTag` on booking parts** — offer tags carried through to booking parts ([#1620](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1620))
- **Additional types for `exchangedBookedOfferRefs`** ([#1624](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1624))
- **`status` in trip specification request** ([#1614](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1614))

## Changes and deprecations

- **Rendering preferences moved to the fulfillment endpoints**; the booking-level fields are deprecated ([#1556](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1556))
- **`category` in `AncillaryOfferPart` deprecated**, replaced by `AncillarySubType` ([#1534](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1534))
- **Place number is no longer required to be unique** ([#1575](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1575))
- **HTTP 409 is now available consistently** across the affected operations ([#1580](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1580))
- **`requestor` is optional in `EventDetail`** ([#1511](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1511))
- **`minItems` removed from `FulfillmentOption.applications`** ([#1643](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1643))
- Further refinements to `OSDM-online-api.yml` and `_common.yml` ([#1523](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1523), [#1566](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1566), [#1631](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1631))

## Fixes

- **Offline model schema restored** — a part of the offline model lost during the 3.9 modularization has been reinstated
- **Typos fixed** in the API specification and the offline model ([#1535](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1535), [#1613](https://github.com/UnionInternationalCheminsdeFer/OSDM/pull/1613))

## Notes

- The webhook specification (`OSDM-online-webhook.yml`) is unchanged since v3.8 and keeps `info.version: 3.8.0`; the release therefore ships `OSDM-online-webhook-v3.8.0.yml` alongside the 3.11.0 API bundle.
