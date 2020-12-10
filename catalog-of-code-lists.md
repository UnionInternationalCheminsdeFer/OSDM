---
layout: page
title:  Catalog of Code Lists
hide_hero: true
permalink: /spec/catalog-of-code-lists
---
# Catalog of Code Lists
This code lists are provided for convenience only. The mandatory code lists are 
provided within the schema or within the IRS90918-10 specification.

## Accommodation Type

| Code | Description |
|------|---|
| `SEAT` |  |
| `COUCHETTE` | Night trains only |
| `BERTH` | Night trains only  |
| `VEHICLE` |  |

## Accommodation Sub Type

RS 90918-1 (Service Level).

(to be updated if/when further changes are applied to 

| Code | Description |
|------|---|
|`AC`|	Seat near children's play area |
|`AH`|	Seat in historic coach |
|`AM`|	Seat in separate Compartment |
|`AR`|	Wheel chair seat |
|`AS`|	Quiet Compartment (Seat)|
|`AV`|	Seat with front-view |
|`BE`|	Restaurant (places in a dining car) |
|`BP`|	private compartment seats |
|`D2`|	Cabin-couchette coach |
|`D4`|	Couchette  four-berth |
|`D5`|	Couchette  five-berth |
|`D6`|	Couchette  six-berth |
|`DP`|	Private compartment couchettes |
|`DR`|	Wheelchair in sleeping car |
|`E`|	Sleeperette |
|`F4`|	Ladies compartment, 4-couchettes |
|`F6`|	Ladies compartment, 6-couchettes |
|`L`|	Single |
|`M`|	Special |
|`N`|	Double |
|`O3`|	Vehicle parking place category 1 – 3 |
|`O4`|	Motorcycle |
|`O5`|	Motorcycle with sidecar  |
|`O8`|	Vehicle parking place category 6 – 8 |
|`OB`|	Bycicle |
|`OT`|	Tandem Bicycle|
|`P`|	T2|
|`PD`|	Private compartment berth deluxe |
|`PS`|	Private compartment berth |
|`Q`|	T3 |
|`R`|	T4 |
|`S`|	Single with shower & WC |
|`SL`|	Single with shower & WC & double bed |
|`T`|	Double with shower & WC |
|`TL`|	Double with shower & WC & double bed |
|`U`|	T3 with shower & WC |
|`W`|	Double with shower |


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
|------|------|
| `ID_CARD` |  |
| `PASSPORT` |  |
| `DIPLOMATIC_PASSPORT` |  |
| `REFUGGE_TRAVEL_DOCUMENT` |  |
| `DRIVING_LICENCE` |  |

## Place Property

| Code | Description |
|------|------|
| `ACC_BICYCLE` | Place with bicycle|
| `ACC_PRAM` | Place with space for a pram|
| `ACC_TANDEM`| Place with tandem bicycle|
| `AILE`||
| `AIR-CONDITIONED`||
| `BICYCLE`| Bicycle |
| `BICYCLE_INCL_SEAT`| Bicycle including seat|
|` BISTRO`| Places in a coach with self-service bistro|
| `BUSINESS`| Manager compartment/business|
| `CABIN8`| |
| `CARRE`| Carré (4 seats facing normally 2nd Class)|
| `CLASSIC` | Classic coach|
| `CLUB`| Club (RENFE)|
| `CLUB_2`| Club Duo (2 seats facing in a separate compartment)|
| `CLUB_4`| Club 4 (4 seats facing)|
| `COMPARTMENT`| |
| `COMPARTMENT_SHOWER_WC`| Compartment with shower and WC|
| `COMPARTMENT_WC`| Compartment with shower|
| `CONFERENCE`| Conference compartment|
| `CONFERENCE_ROOM`| Conference room|
| `CONNECTING_DOOR`| Compartments with connecting Door (in Sleepers)|
| `DOUBLE_BED`| Sleeper with double bed|
| `DUO_F2F`| Duo face to face (2 seats facing)|
| `DUO_SBS`| Duo side by side (2 seats side by side)|
| `EASY_ACCESS`| Place with easy access for PRMs|
| `FAMILY`| Places in family area|
| `FEMALE`| Female compartment|
| `FRONT_VIEW`| Places with view to the front|
| `KIOSQUE`| Kiosque (special seats in edge area)|
| `LOWER_BED`| |
| `LOWER_COUCHETTE`| |
| `LOWER_DECK`| |
| `MANAGER`| Manager compartment / business|
| `MIDDLE_BED` | |
| `MIDDLE_COUCHETTE`| |
| `NEAR_ANIMALS`|Places close to place with animals|
| `NEAR_DINING`| Places near the dining car|
| `NEAR_PLAY_AREA`| Places near a child play area|
| `OFFICE`| |
| `OPEN_SPACE`| |
| `PANORAMA`| Panorama coach|
| `PHONE`| Places in an area with mobile phone amplifier|
| `POWER`| Place with power socket|
| `PRAM`| Space for a pram|
| `PRM`| Places for passenger needing assistance / disabled|
| `RESTAURANT`| Places in the restaurant coach|
| `SALON`| Salon (6 seats facing in separate compartment)|
| `SILENCE`| Places in silence area|
| `SLEEPERETTE`| Sleeperette (reclining seat)|
| `SOLO`| Separate place|
| `TABLE`| Places at a table|
| `TANDEM`| Tandem bicycle|
| `UPPER_BED`| |
| `UPPER_COUCHETTE`| |
| `UPPER_DECK`| |
| `VIDEO`| Place with video entertainment|
| `WHEELCHAIR`| Wheelchair place with additional seat|
| `WHEELCHAIR_WS`| Wheelchair place without additional seat|
| `WIFI`| Places with WiFi access point|
| `WINDOW`| |
| `WITH_ANIMALS`| Place with animals (animals allowed)|
| `WITH_SMALL_CHILDREN`| Places for passengers with small children|
| `WITHOUT_ANIMALS`| Place in an area where animals are not allowed |


## Point of Interest (POI)

POICodeList: By default the code list is set to UIC.

Additional code lists can be defined by implementers. The code list name should then be prefixed by "X_<3 letters code for the provider>". Example: "X_PAO_POIS"

POICode: Values are depending on code list and set is too large to be reproduced

## Reduction Cards

UIC codelist:

|Card-Id |Issuer | Description | Type |
|--------|---|---|---|
|`UIC_EURAIL` | Eurail | Eurail Pass |`PASS`|
|`UIC_INTERRAIL` | Eurail | Interrail Pass |`PASS`|
|`UIC_FIP_LEASURE_RED` |  FIP |  FIP reduction (50%) |  `REDUCTION_CARD`|
|`UIC_FIP_DUTY` |  FIP |  FIP duty |  `PASS`|
|`UIC_FIP_LEASURE_FREE` |  FIP |  FIP free personal use |  `PASS`|
|`UIC_RAILPLU` | S *  | A pure rail plus card  | `REDUCTION_CARD`|
|`UIC_RIT_1`  | *  | RIT reduction for RIT 1 members  | `REDUCTION_CARD`|
|`UIC_RIT_2`  | * |  RIT reduction for RIT 2 members  | `REDUCTION_CARD`|
|`UIC_RIT_3` |  * |  RIT reduction for RIT 3 members |  `REDUCTION_CARD`|

Other parties are allowed to accept additionnal reduction cards.


## Refund Overrule Codes

| Code | Description |
|------|---|
| `STRIKE` |   |
| `SALES_STAFF_ERROR` | Error made by sales staff |
| `PAYMENT-FAILURE` | Cancellation made by the allocator due to a failed payment |

## Reservation Service Code

Legacy reservation code defined in UIC 90918-1.

## Reservation Preference

| Code | Group | Description |
|------|---|---|
| AISLE | PLACE_LOCATION |
| WINDOW | PLACE_LOCATION |
| UPPER_BED | BED_LOCATION |
| LOWER_BED | BED_LOCATION |
| MIDDLE_BED | BED_LOCATION |
| UPPER_COUCHETTE | BED_LOCATION |
| MIDDLE_COUCHETTE | BED_LOCATION |
| LOWER_COUCHETTE | BED_LOCATION |
| UPPER_DECK | LEVEL |
| LOWER_DECK | LEVEL |
| COMPARTMENT | PLACE_GROUPING |
| OPEN_SPACE | PLACE_GROUPING |
| TABLE || Places at a table |
| BICYCLE | VEHICLE | | Bicycle |
| TANDEM | VEHICLE | Tandem bicycle
| PRAM | VEHICLE | Space for a pram |
| AIR-CONDITIONED | |
| PANORAMA | | Panorama coach |
| MANAGER | | Manager compartment / business |
| VIDEO | | Place with video entertainment |
| CABIN8 | PLACE_GROUPING |
| DUO_F2F | PLACE_GROUPING | Duo face to face (2 seats facing) |
| DUO_SBS | PLACE_GROUPING | Duo side by side (2 seats side by side) |
| CLUB_2 | PLACE_GROUPING | Club Duo (2 seats facing in a separate compartment) |
| CLUB_4 | PLACE_GROUPING | Club 4 (4 seats facing) |
| CARRE | PLACE_GROUPING | Carré (4 seats facing normally 2nd Class) |
| SALON | PLACE_GROUPING | Salon (6 seats facing in separate compartment) |
| KIOSQUE | PLACE_GROUPING | Kiosque (special seats in edge area) |
| SOLO | PLACE_GROUPING | Separate place |

## Reservation Preference Group

| Code | Description |
|------|---|
| `ACC_VEHICLE`| Different types of accompanying vehicles |
| `BERTH_LOCATION`| Location of a berth or couchette|
| `FAMILY`| Different types of places for families|
| `LEVEL` | Upper or lower deck|
| `PLACE_GROUPING` | Compartment / Open Space|
| `PLACE_LOCATION` | Place location (Aisle, Window)|
| `USAGE `| Different usage types for different coach areas|
| `VEHICLE`|  Different types of vehicles|



## Service Brands

Todo

## Service Class

| Code | Description |
|------|---|
| `BEST` |  |
| `HIGH` |  |
| `STANDARD` |  |
| `BASIC` |  |

## Stations

codeList = UIC, ERA, HAFAS

Additional codelists can be defined by implementers. The codelist name should then be prefixed by "X_<3 letters code for the provider>". Example: "X_PAO_STATIONS"

*StationCode*: Values are depending on codelist and set is too large to be reproduced.

## Transfer Type

| Code | Description |
|------|---|
| `WALK` | A walk |
| `OTHER` | Other types of transfer (e.g. taxi, local city transport not included in the offer,...) |

## Transport Mode

??? Need Merits input

## TravelerType

| Code | Description |
|------|---|
| `DOG` | |
| `ACCOMP_DOG` | |
| `LUGGAGE` | |
| `BICYCLE` | |
| `CAR` | |
| `MOTORCYCLE` |  |
| `TRAILER` |  |
| `PRM` | Person with reduced mobility |
