---
layout: page
title:  Catalog of Code Lists
hide_hero: true
permalink: /spec/catalog-of-code-lists/
---

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
|`AC`| Seat near children's play area |
|`AH`| Seat in historic coach |
|`AM`| Seat in separate Compartment |
|`AR`| Wheel chair seat |
|`AS`| Quiet Compartment (Seat)|
|`AV`| Seat with front-view |
|`BE`| Restaurant (places in a dining car) |
|`BP`| Private compartment seats |
|`D2`| Cabin-couchette coach |
|`D4`| Couchette Four-berth |
|`D5`| Couchette Five-berth |
|`D6`| Couchette Six-berth |
|`DP`| Private compartment couchettes |
|`DR`| Wheelchair in sleeping car |
|`E`| Sleeperette |
|`F4`| Ladies compartment, 4-couchettes |
|`F6`| Ladies compartment, 6-couchettes |
|`L`| Single |
|`M`| Special |
|`N`| Double |
|`O3`| Vehicle parking place category 1-3 |
|`O4`| Motorcycle |
|`O5`| Motorcycle with sidecar  |
|`O8`| Vehicle parking place category 6-8 |
|`OB`| Bicycle |
|`OT`| Tandem Bicycle|
|`P`| T2|
|`PD`| Private compartment berth deluxe |
|`PS`| Private compartment berth |
|`Q`| T3 |
|`R`| T4 |
|`S`| Single with shower & WC |
|`SL`| Single with shower & WC & double bed |
|`T`| Double with shower & WC |
|`TL`| Double with shower & WC & double bed |
|`U`| T3 with shower & WC |
|`W`| Double with shower |

## BarcodeType

| Code | Description |
|------|-------------|
| `FCB` | Flexible Content Barcode - See IRS 90918-9 |
| `TLB` | Ticket Layout Barcode - See IRS 90918-9 |
| `SBB` | Small Structured Barcode -See IRS 90918-9 |

## CardType

| Code | Description |
|------|-------------|
| `LOYALTY_CARD` | Loyalty card |
| `REDUCTION_CARD` | Card providing reduction |
| `PASS` | Pass for travelling |

## Carrier

Carrier codes used in OSDM are based on the [UIC RICS Company Code](https://uic.org/support-activities/it/rics?recherche=RICS%20code) standard.

## ControlDataExchangeType

| Code | Description |
|------|-------------|
| `REGISTRY` | See IRS 90918-4, data are delivered to the UIC registry|
| `PEER2PEER` | See IRS 90918-4, data are exchange peer 2 peer|

## ControlSecurityType

| Code | Description |
|------|-------------|
| `SIP  Security in Paper -CIT secure background See IRS 90918-9 |
| `SID  Security in Data (e.g. signed barcode) See IRS 90918-9 |
| `SIS  Security in System (Online control vs. Ticket registry) See IRS 90918-9/90918-4 |

## Currency

Currency codes used in OSDM are based on the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.

## FareType

| Code | Description |
|------|-------------|
| `NRT` | NRT |
| `IRT` | IRT |
| `RES` | RES (with or without supplement) |
| `ANCILLARY` | Ancillary |

## Fare CoachType

Legacy reservation code defined in UIC 90918-1.

## Fare CompartementTypeCode

Legacy reservation code defined in UIC 90918-1.

## Gender

| Code | Description |
|------|-------------|
| `MALE` | Male |
| `FEMALE` | Female |
| `X` | Diverse |

## Graphics Items

| icon | description | icon code | orientation used | mounting used | 
|------|-------------|-----------|------------------|---------------| 
|![](../images/catalog-of-code-lists/graphics-icons/image001.png)|seat|1|to right|- |
|![](../images/catalog-of-code-lists/graphics-icons/image002.png)|seat|1|to left|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image003.png)|seat|1|up|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image004.png)|seat|1|bottom|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image005.png)|berth|2|to left|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image006.png)|berth|2|to right|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image007.png)|couchette|3|to right|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image009.jpg)|couchette|3|to left|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image010.png)|small table|20|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image011.png)|small table|20|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image012.png)|big table|21|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image013.png)|big table|21|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image014.png)|wall with angle to left, height covers three places|24|-|bottom | | 
|![](../images/catalog-of-code-lists/graphics-icons/image015.png)|wall with angle to right, height covers three places|25|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image016.png)|wall with angle to left, height covers three places|24|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image017.png)|wall with angle to right, height covers three places|25|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image018.png)|small wall with angle to left, height covers two places|27|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image019.png)|small wall with angle to right, height covers two places|28|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image020.png)|small wall with angle to left, height covers two places|27|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image021.png)|small wall with angle to right, height covers two places|28|-|top | | 
|![](../images/catalog-of-code-lists/graphics-icons/image022.png)|wall between two compartments, height covers three places|23|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image023.png)|wall between two compartments, height covers three places|23|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image024.png)|small wall between two compartments, height covers two places|26|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image025.png)|small wall between two compartments, height covers two places|26|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image026.png)|small wall between two compartments, height covers two places|29|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image026.png)|small wall between two compartments,height covers two places|29|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image027.png)|very small wall between two compartments, height covers one places|32|-|bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image028.png)|Very small wall between two compartments, height covers one places|32|-|top | |
|![](../images/catalog-of-code-lists/graphics-icons/image029.png)|end-to-end wall|30|-|top-to-bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image031.jpg)|Mobile wall between sleeping compartments, height covers three places|31|-|
|![](../images/catalog-of-code-lists/graphics-icons/image032.png)|arrow indicating upper level|51|-|top-to-bottom | | 
|![](../images/catalog-of-code-lists/graphics-icons/image033.png)|arrow indicating lower level|52|-|top-to-bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image034.png)|arrow indicating upper level|53|-|top-to-bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image035.png)|arrow indicating lower level|54|-|top-to-bottom | |
|![](../images/catalog-of-code-lists/graphics-icons/image036.png)|1st class area|101|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image037.png)|2nd class area |100|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image038.png)|mobile phone area|103|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image039.png)|mobile phone forbidden area|104|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image040.png)|silence area |116|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image041.png)|bar area|102|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image042.png)|dining area|107|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image043.png)|bicycle area|108|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image044.png)|luggage area|109|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image045.png)|luggage locker|110|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image046.png)|conference compartment|111|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image047.png)|wardrobe|113|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image048.png)|dust bin|114|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image049.png)|children play area|117|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image050.png)|Space for prams|112|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image051.png)|family area|106|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image052.png)|PRM area|105|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image053.png)|Priority Seats|120|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image054.png)|Non-smoker area|118|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image055.png)|WC|115|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image056.png)|power socket|119|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image058.jpg)|WiFi area|130|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image060.jpg)|PRM toilet|131|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image062.jpg)|Air condition|132|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image064.jpg)|USB ports for charging|133|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image066.png)|Reclining seat|134|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image067.png)|Window|135|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image069.jpg)|stairs upwards</span><span|136|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image070.jpg)|stairs downwards|137|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image072.jpg)|Working compartment|144|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image074.jpg)|Cabin for allergic passengers|145|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image076.jpg)|Meeting lounge for 7 persons (Pendolino)|150|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image078.jpg)|Meeting lounge for 12 persons|151|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image080.jpg)|Space for skis|154|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image082.jpg)|Conductor working compartment|155|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image084.jpg)|Mobile phone booth|156|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image086.jpg)|T-loop (audio induction loop)|158|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image088.jpg)|Pets compartment|160|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image090.jpg)|Sleeping cabin with toilet and shower|161|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image092.jpg)|interconnectible sleeping compartments|162|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image094.jpg)|Shower|163|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image096.jpg)|Baby-care table|168|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image098.jpg)|push-button operated wheelchair ramp|170|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image099.png)|Sink / washbasin|171|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image101.jpg)|Ladies compartment|172|-|- | |
|||||||
|||||||
|icons concerning the entire coach||||||
|![](../images/catalog-of-code-lists/graphics-icons/image102.png)|1st class coach|121|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image103.png)|2nd class coach|122|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image104.png)|mobile phone coach|127|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image105.png)|mobile phone forbidden in the entire coach|128|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image106.png)|1silence coach|126|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image107.png)|coffee bar|123|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image108.png)|dining car|124|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image109.png)|bicycle coach|125|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image110.png)|mixed group/individual coach|129|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image112.jpg)|WiFi area|139|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image114.jpg)|Air condition |140|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image116.jpg)|USB ports for charging|141|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image118.jpg)|business class|142|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image119.png)|panorama coach|143|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image121.jpg)|luggage coach|173|-|- | |
|![](../images/catalog-of-code-lists/graphics-icons/image123.jpg)|sleeping car|174|-|- | | 
|![](../images/catalog-of-code-lists/graphics-icons/image125.jpg)|car-carrier|175|-|- |

## Language

Language codes used in OSDM are based on the [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) standard.

## Nationality

Language codes used in OSDM are based on the [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) standard.

## OverRule Code

| Code | Description |
|------|------|
| `SALES_STAFF_ERROR` |  |
| `PAYMENT_ERROR` |  |
| `STRIKE` |  |

Refund because of breakage of a vehicle is handled in a separate process.

## Passport

| Code | Description |
|------|------|
| `ID_CARD` |  |
| `PASSPORT` |  |
| `DIPLOMATIC_PASSPORT` |  |
| `REFUGEE_TRAVEL_DOCUMENT` |  |
| `DRIVING_LICENCE` |  |

## Place Property

| Code | Description |
|------|------|
| `ACC_BICYCLE` | Place with bicycle|
| `ACC_PRAM` | Place with space for a pram|
| `ACC_TANDEM`| Place with tandem bicycle|
| `AISLE`||
| `AIR-CONDITIONED`||
| `BICYCLE`| Bicycle |
| `BICYCLE_INCL_SEAT`| Bicycle including seat|
| `BISTRO` | Places in a coach with self-service bistro|
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

UIC code list:

| Card-Id | Issuer | Description | Type |
|---------|--------|-------------|------|
| `UIC_EURAIL` | Eurail | Eurail Pass | `PASS` |
| `UIC_INTERRAIL` | Eurail | Interrail Pass | `PASS` |
| `UIC_FIP_LEASURE_RED` |  FIP |  FIP reduction (50%) | `REDUCTION_CARD` |
| `UIC_FIP_DUTY` |  FIP |  FIP duty | `PASS`|
| `UIC_FIP_LEASURE_FREE` |  FIP |  FIP free personal use | `PASS` |
| `UIC_RAILPLUS` | *  | A pure rail plus card | `REDUCTION_CARD` |
| `UIC_RIT_1` | * | RIT reduction for RIT 1 members | `REDUCTION_CARD` |
| `UIC_RIT_2` | * | RIT reduction for RIT 2 members | `REDUCTION_CARD` |
| `UIC_RIT_3` | * | RIT reduction for RIT 3 members | `REDUCTION_CARD` |

Other parties are allowed to accept additional reduction cards.

## Refund Overrule Codes

| Code | Description |
|------|-------------|
| `STRIKE` |   |
| `SALES_STAFF_ERROR` | Error made by sales staff |
| `PAYMENT-FAILURE` | Cancellation made by the allocator due to a failed payment |

## Reservation Preference

| Code | Group | Description |
|------|-------|-------------|
| `AISLE` | `PLACE_LOCATION` |
| `WINDOW` | `PLACE_LOCATION` |
| `UPPER_BED` | `BED_LOCATION` |
| `LOWER_BED` | `BED_LOCATION` |
| `MIDDLE_BED` | `BED_LOCATION` |
| `UPPER_COUCHETTE` | `BED_LOCATION` |
| `MIDDLE_COUCHETTE` | `BED_LOCATION` |
| `LOWER_COUCHETTE` | `BED_LOCATION` |
| `UPPER_DECK` | `LEVEL` |
| `LOWER_DECK` | `LEVEL` |
| `COMPARTMENT` | `PLACE_GROUPING` |
| `OPEN_SPACE` | `PLACE_GROUPING` |
| `TABLE` || Places at a table |
| `BICYCLE` | `VEHICLE` | Bicycle |
| `TANDEM` | `VEHICLE` | Tandem bicycle
| `PRAM` | `VEHICLE` | Space for a pram |
| `AIR-CONDITIONED` | |
| `PANORAMA` | | Panorama coach |
| `MANAGER` | | Manager compartment / business |
| `VIDEO` | | Place with video entertainment |
| `CABIN8` | `PLACE_GROUPING` |
| `DUO_F2F` | `PLACE_GROUPING` | Duo face to face (2 seats facing) |
| `DUO_SBS` | `PLACE_GROUPING` | Duo side by side (2 seats side by side) |
| `CLUB_2` | `PLACE_GROUPING` | Club Duo (2 seats facing in a separate compartment) |
| `CLUB_4` | `PLACE_GROUPING` | Club 4 (4 seats facing) |
| `CARRE` | `PLACE_GROUPING` | Carré (4 seats facing normally 2nd Class) |
| `SALON` | `PLACE_GROUPING` | Salon (6 seats facing in separate compartment) |
| `KIOSQUE` | `PLACE_GROUPING` | Kiosque (special seats in edge area) |
| `SOLO` | `PLACE_GROUPING` | Separate place |

## Reservation Preference Group

| Code | Description |
|------|-------------|
| `ACC_VEHICLE`| Different types of accompanying vehicles |
| `BERTH_LOCATION`| Location of a berth or couchette|
| `FAMILY`| Different types of places for families|
| `LEVEL` | Upper or lower deck|
| `PLACE_GROUPING` | Compartment / Open Space|
| `PLACE_LOCATION` | Place location (Aisle, Window)|
| `USAGE` | Different usage types for different coach areas|
| `VEHICLE`|  Different types of vehicles|

## Service Brands

https://uic.org/spip.php?action=telecharger&arg=3007

| Service Brand Code | Abbreviation | Reservation Ticket Text | MERITS Description |
|--------------------|--------------|-------------------------|--------------------|
| `33`| | Ferry | Ship |
| `37`| | normal train | Train|
| `46`| `TAJ`| TAJ| Day car train|
| `47`| `TAC`| TAC| Car sleeper train, motor rail (CST)|
| `48`| `SAE`| SAE| Unaccompanied car service, motor rail|
| `49`| `EIC`| ExpressIC | Fast and Comfortable Interregional trains|
| `50`| `EC` | EuroCity | EuroCity|
| `51`| `ICE`| ICE| ICE|
| `52`| `AVE`| AVE| AVE|
| `53`| `EIL`| EUROSTAR | Eurostar|
| `54`| | | Talgo|
| `55`| `OTU`| Oresundstog | Oresundstog|
| `56`| `TGV`| TGV | TGV Bruxelles à Lille / Province|
| `58`| `TRN`| Intercités| Intercités|
| `59`| `AE`| ALLEGRO| Allegro|
| `60`| `ECB`| EuroCityBrenner | EuroCityBrenner|
| `62`| | |Suburban service|
| `63`| `IC`| Intercity| Intercity|
| `64`| || Hotel Train|
| `65`| | Ferry | hydrofoil|
| `66`| `IC`| Intercity | Inter City Lyn|
| `67`| | | TRN|
| `68`| | | International|
| `69`| | | Express|
| `70`| `EN`| EuroNight | Euro Night|
| `71`| `HST`| High-speed train | High-speed train|
| `72`| `TRN`| TRAIN | Train SNCF|
| `73`| `TGV`| TGV| TGV Sud-Est|
| `74`| `TGV`| TGV| TGV Atlantique|
| `75`| `TGV`| TGV| TGV Nord|
| `76`| `TGV`| TGV| TGV Lyria|
| `77`| `TGV`| TGV| TGV Duplex|
| `79`| `TGV`| TGV| TGV Est|
| `80`| `TGV`| TGV| TGV Interconnexion|
| `82`| |THALYS | Thalys|
| `83`| |Ferry  | Hovercraft|
| `84`| `RE`| regional train | Regional|
| `85`| `GPE`| Gotthard Panorama Express | Gotthard Panorama Express
| `87`| | PENDOLINO  | Pendolino
| `88`| | |Suburban|
| `89`| `ALV`| Alvia | Alvia|
| `90`| `AVN`| Avant | Avant|
| `91`| `TER`| TRAIN | Regional TER|
| `92`| `REG`| Regiontog | Regiontog|
| `93`| `FB`| FRECCIABIANCA |FRECCIABIANCA|
| `94`| `SC`| SuperCity| Supercity|
| `95`| `CNL`| City Night Line (D) | DB Nachtzug|
| `96`| `INI`| InterCityNotte Italia | InterCityNotte|
| `97`| `GB`| ATOC MEMBER OPERATED SERVICE | ATOC MEMBER OPERATED SERVICE|
| `98`| `ESI`| ES Italia | Eurostar Italia|
| `99`| ||Funicular|
| `100`| ||Airport train|
| `101`| ||Night train|
| `102`| ||Touristic train|
| `107`| ||Historical train, steam engine train|
| `108`| `IRE`| IRE | Interregio-Express|
| `109`| `RB`| RB| Regionalbahn|
| `110`| `RE`| RE| Regional-Express|
| `111`| `RT`| RT| RegioTram|
| `112`| || Shinkansen |
| `113`| `THT`| TrainHotel Talgo |Train hotel talgo|
| `114`| `EUR`| Euromed| Euromed
| `115`| `ALR`| Alaris| Alaris|
| `116`| `ALT`| Altaria| Altaria|
| `117`| `ARC`| Arco |Arco|
| `119`| || S-Bahn |
| `121`| | Night Train | Night Train
| `122`| `IR`| Interregional | Interregional
| `123`| `IRN`| Interregional Night Train | Interregional Night Train
| `124`| `NLT`| TOLSTOI | Tolstoi
| `126`| || ARZ|
| `128`| `AVE`| RENFE SNCF EN COOPERATION | Renfe SNCF|
| `129`| `TGV`| TGV INOUI | Renfe SNCF|
| `130`| `BUS`| IC Bus | Bus|
| `131`| `BUS`| IC Bus International |Bus|
| `153`| |special train | Sonderzug|
| `154`| ||InterCityRapid|
| `155`| ||InterPici|
| `157`| ||Fast train|
| `158`| ||Euregio|
| `159`| | Bus | IC Ersatzbus|
| `160`| | Bus | IP Ersatzbus|
| `162`| | Bus | Replacement Bus|
| `163`| `TGV`| TGV| TGV Duplex Lyria|
| `166`| `TGV`| TGV INOUI| TGV Duplex France Allemagne|
| `170`| `YHT`| YHT| High speed train in Turkey|
| `171`| `FA`| FRECCIARGENTO | FRECCIARGENTO|
| `172`| `FR`| FRECCIAROSSA | FRECCIAROSSA|
| `173`| `AP`| Albula Panorama | Albula Panorama (Panoramic Car)|
| `174`| `BEX`| Bernina Express |Bernina Express (Panorama Train)|
| `175`| `GEX`| Glacier Express | Glacier Express (Panorama Train)|
| `176`| `GP`| Golden Pass |Golden Pass (Panorama Train)|
| `177`| `BNI`| Bernina Panorama | Bernina Panorama (Panoramic Car)|
| `178`| `zb`| zb Zentralbahn AG | Luzern-Interlaken Express (Panorama Train)|
| `179`| `BXB`| Bernina Express Bus | Bernina Express (Panorama Bus)|
| `200`| `GGB`| Gornergrat Bahn | Mountain train|
| `202`| `ICE`| ICE-Allemagne France | ICE Allemagne-France|
| `203`| | ÖBB-NIGHTLINE |ÖBB Night Line|
| `205`| `ICP`| Intercity Plus| Intercity Plus|
| `206`| `RID`| Riviera Day | Riviera day|
| `207`| `RIN`| Riviera Night| Riviera night|
| `209`| `RJ`| R A I L JET| Rail Jet|
| `213`| `AZ`| DB Autozug | DB Autozug|
| `214`| | Berlin-Warszawa-Expresas | Berlin-Warszawa-Express|
| `215`| | Railpromo Austria Express/Treski| Austria Express/Treski|
| `216`| `PRECIOS`| MERCADO | Precios Mercado|
| `219`| `TGV`| TGV| TGV|
| `223`| `FB`| FB| FernBus|
| `224`| `ICB`| Intercitybus | ÖBB-Intercitybus|
| `225`| `TLK`| TLK train |Yours Rail Lines|
| `226`| `A`| RailBus | RailBus|
| `227`| `BUS`| Replacement bus for Regional Train | Replacement bus for Regional Train|
| `228`| `IR`| InterREGIO train | InterREGIO train |
| `229`| `IRB`| Replacement bus for InterRegio train | Replacement bus for InterRegio train|
| `230`| `MP`| Fast International Train | Fast International Train|
| `231`| `MR`| musicREGIO train | musicREGIO train|
| `232`| `OS`| Stopping Train | Stopping Train|
| `233`| `P`| Fast Train | Fast Train|
| `234`| `R`| REGIO train | REGIO train|
| `235`| `RE`| REGIOekspres train | REGIOekspres train|
| `236`| `VR`| viaREGIO train |viaREGIO train|
| `237`| `TK`| TurKol | TurKol|
| `238`| `EIP`| EIC Premium| High-speed train|
| `239`| `SKM`| PKP SKM w Trojmiescie | PKP SKM w Trojmiescie|
| `240`| `SA`| SAPSAN | High speed train|
| `242`| `STR`| STRIZH | Strizh night train|
| `243`| `STR`| STRIZH | Strizh interregional|
| `244`| `NJ`| NJ |NJ Night Jet|
| `245`| `CAR`| AUTOCAR | French regional buses (not sold via Hermes)|
| `246`| `RJX`| RJX | RJX railjet xpress|
| `247`| `CJX`| CJX |CJX cityjet xpress|
| `248`| | Night train BC | Night train BC |
| `249`| `TGV`| TGV INOUI | TGV INOUI|
| `250`| `TGV`| TGV INOUI | TGV INOUI DUPLEX (double decker TGV)|
| `251`| `ALI`| Aare Linth | Aare Linth (Panorama Train)|
| `252`| `TGO`| Treno Gottardo | Treno Gottardo (Panorama Train)|
| `253`| `VAE`| Voralpen-Express | Voralpen-Express (Panorama Train)|
| `254`| `LK`| FRECCIALINK |FRECCIALINK|

## Service Class

| Code | Description |
|------|-------------|
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
|------|-------------|
| `WALK` | A walk |
| `OTHER` | Other types of transfer (e.g. taxi, local city transport not included in the offer,...) |

## Transport Mode

Corresponding to numerical codes in TAP-TSI / MERITS

| Code | Description |
|------|-------------|
| `HIGH_SPEED_TRAIN` | |
| `HISTORIC_TRAIN` | |
| `INTERCITY` | |
| `REGIONAL` | |
| `INTERREGIONAL` | |
| `TRAIN` | |
| `URBAN` | |
| `TRAM` | |
| `UNDERGROUND` | |
| `NIGHT_TRAIN` | |
| `SHARED_TAXI` | |
| `MOTOR_RAIL` | Car carriage trains |
| `MOUNTAIN_TRAIN` | |
| `PLANE` | |
| `COACH_GROUP` | Group of coaches included in multiple trains (through coaches) |
| `SHIP` | |
| `BUS` | |

## TravelerType

| Code | Description | Transportable  | Bulk (Offline) | Online Request | Online Reply |
|------|-------------|----------------|----------------|----------------|--------------|
| `YOUNG_CHILD` | Young child defined by the carrier depending on the age || X || X |
| `CHILD` | Child defined by the carrier depending on the age || X || X |
| `YOUTH` | Youth defined by the carrier depending on the age || X || X |
| `ADULT` | Adult defined by the carrier depending on the age || X || X |
| `SENIOR` | Senior defined by the carrier depending on the age || X || X |
| `FAMILY_CHILD` | Child associated with a family traveling together || X | X | X |
| `ACCOMP_PRM` | Accompanying Person for PRM || X || X |
| `PRM_CHILD` | Handicapped young child accompanied by one person where the usual child according to the age price would be zero and the accompanying person would also be free || X || X |
| `WHEELCHAIR` | Passenger with wheel-chair ||| X ||
| `PERSON` | Used in requests together with date of birth ||| X ||
| `PRM` | Person with reduced mobility - to be used in case of accompanying person or dog, date of birth must be provided additionally ||| X ||
| `DOG` | A dog | X | X | X | X |
| `PET` | A pet but not a dog | X | X | X | X |
| `LUGGAG` | Over-size luggage | X | X | X | X |
| `BICYCLE` | A bicycle | X | X | X | X |
| `ACCOMP_DOG` | An accompanying dog for a PRM | X | X | X | X |
| `CAR` | A car for car-carriage trains | X | X | X | X |
| `MOTOCYCLE` | A motorcycle for car carriage trains | X | X | X | X |
| `TRAILER` | A trailer for car carriage trains | X | X | X | X |
