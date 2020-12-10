---
layout: page
title:  Catalog of Code Lists
hide_hero: true
permalink: /spec/catalog-of-code-lists
---

This code lists are provided for convenience only. The mandatory code lists are 
provided within the schema or within the IRS90918-10 specification.

## Accommodation Type

| Code | Description | 
|---|---|
| SEAT |  |
| COUCHETTE | Night trains only |
| BERTH | Night trains only  |
| VEHICLE |  |

## Carrier

Carrier codes used in OSDM are based on the [UIC RICS Company Code](https://uic.org/support-activities/it/rics?recherche=RICS%20code) standard.

## Currency

Currency codes used in OSDM are based on the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.

## Fare BerthType

Legacy reservation code defined in UIC 90918-1.

## Fare CoachType

Legacy reservation code defined in UIC 90918-1.

## Fare CompartementTypeCode

Legacy reservation code defined in UIC 90918-1.

## Language

Language codes used in OSDM are based on the [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) standard.

## Nationality

Language codes used in OSDM are based on the [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) standard.

## Passport

| Code | Description | 
|---|---|
| ID_CARD |  |
| PASSPORT |  |
| DIPLOMATIC_PASSPORT |  |
| REFUGGE_TRAVEL_DOCUMENT |  |
| DRIVING_LICENCE |  |

## POI

POICodeList: By default the code list is set to UIC.

Additional code lists can be defined by implementers. The code list name should then be prefixed by "X_<3 letters code for the provider>". Example: "X_PAO_POIS"

POICode: Values are depending on code list and set is too large to be reproduced

## Refund Overrule Codes

| Code | Description |
|---|---|
| STRIKE |   |
| SALES_STAFF_ERROR | Error made by sales staff |
| PAYMENT-FAILURE | Cancellation made by the allocator due to a failed payment |

## Reservation Service Code

Legacy reservation code defined in UIC 90918-1.

## Reservation Preference

Todo

## Reservation Preference Group

Todo

## Service Brands

Todo

## Service Class

| Code | Description | 
|---|---|
| BEST |  |
| HIGH |  |
| STANDARD |  |
| BASIC |  |

## Stations

codeList = UIC, ERA, HAFAS

Additional codelists can be defined by implementers. The codelist name should then be prefixed by "X_<3 letters code for the provider>". Example: "X_PAO_STATIONS"

*StationCode*: Values are depending on codelist and set is too large to be reproduced.

## Transfer Type

| Code | Description |
|---|---|
| WALK | A walk |
| OTHER| Other types of transfer (e.g. taxi, local city transport not included in the offer,...) |

## Transport Mode

??? Need Merits input

## TravelerType

| Code | Description |
|---|---|
| DOG | |
| ACCOMP_DOG | |
| LUGGAGE | |
| BICYCLE | |
| CAR | |
| MOTORCYCLE |  |
| TRAILER |  |
| PRM | Person with reduced mobility |
