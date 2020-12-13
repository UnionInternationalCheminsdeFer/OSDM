---
layout: page
title:  Catalog of Code Lists
hide_hero: true
permalink: /catalog-of-code-lists/
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
|`OB`|	Bicycle |
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
| `REFUGEE_TRAVEL_DOCUMENT` |  |
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

## Reservation Service Code

Legacy reservation code defined in UIC 90918-1.

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
| `BICYCLE` | `VEHICLE` | | Bicycle |
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
| `37`|	| normal train |	Train|
| `46`| `TAJ`| 	TAJ| 	Day car train|
| `47`| `TAC`| 	TAC| 	Car sleeper train, motor rail (CST)|
| `48`| `SAE`| 	SAE| 	Unaccompanied car service, motor rail|
| `49`| `EIC`| 	ExpressIC | 	Fast and Comfortable Interregional trains|
| `50`| `EC` | 	EuroCity | 	EuroCity|
| `51`| `ICE`| 	ICE| 	ICE|
| `52`| `AVE`| 	AVE| 	AVE|
| `53`| `EIL`| 	EUROSTAR| 	Eurostar|
| `54`| | |	Talgo|
| `55`| `OTU`| 	Oresundstog| 	Oresundstog|
| `56`| `TGV`| 	TGV| 	TGV Bruxelles – Lille / Province|
| `58`| `TRN`| 	Intercités| 	Intercités|
| `59`| `AE`| 	ALLEGRO| 	Allegro|
| `60`| `ECB`| 	EuroCityBrenner	EuroCityBrenner|
| `62`| | |Suburban service|
| `63`|	`IC`| 	Intercity|   	Intercity|
| `64`|||	Hotel Train|
| `65`| |	Ferry	| hydrofoil|
| `66`| `IC`| 	Intercity |  	Inter City Lyn|
| `67`| |	| TRN|
| `68`| | |	International|
| `69`| | |	Express|
| `70`| `EN`| 	EuroNight  | 	Euro Night|
| `71`| `HST`| 	High-speed train| 	High-speed train|
| `72`| `TRN`| 	TRAIN| 	Train SNCF|
| `73`| `TGV`| 	TGV| 	TGV Sud-Est|
| `74`| `TGV`| 	TGV| 	TGV Atlantique|
| `75`| `TGV`| 	TGV| 	TGV Nord|
| `76`| `TGV`| 	TGV| 	TGV Lyria|
| `77`| `TGV`| 	TGV| 	TGV Duplex|
| `79`| `TGV`| 	TGV| 	TGV Est|
| `80`| `TGV`| 	TGV| 	TGV Interconnexion|
| `82`| |THALYS | 	Thalys|
| `83`| |Ferry  |	hovercraft|
| `84`| `RE`| 	regional train|	Regional|
| `85`| `GPE`| 	Gotthard Panorama Express	|Gotthard Panorama Express
| `87`| | PENDOLINO  | 	Pendolino
| `88`| | |Suburban|
| `89`| `ALV`| 	Alvia| 	Alvia|
| `90`| `AVN`| 	Avant| 	Avant|
| `91`| `TER`| 	TRAIN| 	Regional TER|
| `92`| `REG`| 	Regiontog| 	Regiontog|
| `93`| `FB`| 	FRECCIABIANCA|	FRECCIABIANCA|
| `94`| `SC`| 	SuperCity| 	Supercity|
| `95`| `CNL`| 	City Night Line (D) 	DB Nachtzug|
| `96`| `INI`| 	InterCityNotte Italia  	InterCityNotte|
| `97`| `GB`| 	ATOC MEMBER OPERATED SERVICE	ATOC MEMBER OPERATED SERVICE|
| `98`| `ESI`| 	ES Italia | 	Eurostar Italia|
| `99`| ||Funicular|
| `100`|	||Airport train|
| `101`| 	||Night train|
| `102`| 	||Touristic train|
| `107`| 	||Historical train, steam engine train|
| `108`| `IRE`| 	IRE	|Interregio-Express|
| `109`| `RB`| 	RB|	Regionalbahn|
| `110`| `RE`|	RE|	Regional-Express|
| `111`| `RT`| 	RT|	RegioTram|
| `112`| ||	Shinkansen
| `113`| `THT`| 	TrainHotel Talgo	|Train hotel talgo|
| `114`| `EUR`| 	Euromed|	Euromed
| `115`| `ALR`| 	Alaris|	Alaris|
| `116`| `ALT`| 	Altaria|	Altaria|
| `117`| `ARC`| 	Arco	|Arco|
| `119`| 	||S-Bahn
| `121`| 	||Night Train	Night Train
| `122`| `IR`| 	Interregional	| Interregional
| `123`| `IRN`| 	Interregional Night Train |	Interregional Night Train
| `124`| `NLT`| 	TOLSTOI	| Tolstoi
| `126`| 	|  |  ARZ||
| `128`| `AVE`| 	RENFE SNCF EN COOPERATION	| Renfe SNCF|
| `129`| `TGV`| 	TGV INOUI	| Renfe SNCF|
| `130`| `BUS`| 	IC Bus |	Bus|
| `131`| `BUS`| 	IC Bus International	|Bus|
| `153`| 	|special train |	Sonderzug|
| `154`| 	||InterCityRapid|
| `155`| 	||InterPici|
| `157`| 	||Fast train|
| `158`| 	||Euregio|
| `159`| 	| Bus |	IC Ersatzbus|
| `160`| 	|Bus 	| IP Ersatzbus|
| `162`| 	|Bus 	| Replacement Bus|
| `163`| `TGV`| 	TGV|	TGV Duplex Lyria|
| `166`| `TGV`| 	TGV INOUI|	TGV Duplex France Allemagne|
| `170`| `YHT`| 	YHT|	High speed train in Turkey|
| `171`| `FA`|	FRECCIARGENTO|	FRECCIARGENTO|
| `172`| `FR`| 	FRECCIAROSSA|	FRECCIAROSSA|
| `173`| `AP`| 	Albula Panorama	| Albula Panorama (Panoramic Car)|
| `174`| `BEX`| 	Bernina Express	|Bernina Express (Panorama Train)|
| `175`| `GEX`| 	Glacier Express	| Glacier Express (Panorama Train)|
| `176`| `GP`| 	Golden Pass	|Golden Pass (Panorama Train)|
| `177`| `BNI`| 	Bernina Panorama|	Bernina Panorama (Panoramic Car)|
| `178`| `zb`| 	zb Zentralbahn AG|	Luzern-Interlaken Express (Panorama Train)|
| `179`| `BXB`| 	Bernina Express Bus|	Bernina Express (Panorama Bus)|
| `200`| `GGB`| 	Gornergrat Bahn	Mountain| train|
| `202`| `ICE`| 	ICE-Allemagne France  |	ICE Allemagne-France|
| `203`|	| ÖBB-NIGHTLINE	|ÖBB Night Line|
| `205`| `ICP`| 	Intercity Plus| 	Intercity Plus|
| `206`| `RID`| 	Riviera Day |	Riviera day|
| `207`| `RIN`| 	Riviera Night| 	Riviera night|
| `209`| `RJ`| 	R A I L JET|  	Rail Jet|
| `213`| `AZ`| 	DB Autozug |	DB Autozug|
| `214`| 	| Berlin-Warszawa-Expresas | 	Berlin-Warszawa-Express|
| `215`| 	| Railpromo Austria Express/Treski|	Austria Express/Treski|
| `216`| `PRECIOS`| MERCADO|	Precios Mercado|
| `219`| `TGV`| 	TGV|	TGV|
| `223`| `FB`| 	FB|	FernBus|
| `224`| `ICB`| 	Intercitybus|	ÖBB-Intercitybus|
| `225`| `TLK`| 	TLK train 	|Yours Rail Lines|
| `226`| `A`| 	RailBus|	RailBus|
| `227`| `BUS`| 	Replacement bus for Regional Train|	Replacement bus for Regional Train|
| `228`| `IR`| 	InterREGIO train|	InterREGIO train|
| `229`| `IRB`| 	Replacement bus for InterRegio train|	Replacement bus for InterRegio train|
| `230`| `MP`| 	Fast International Train|	Fast International Train|
| `231`| `MR`| 	musicREGIO train|	musicREGIO train|
| `232`| `OS`| 	Stopping Train|	Stopping Train|
| `233`| `P`| 	Fast Train|	Fast Train|
| `234`| `R`| 	REGIO train|	REGIO train|
| `235`| `RE`| 	REGIOekspres train|	REGIOekspres train|
| `236`| `VR`| 	viaREGIO| train	viaREGIO train|
| `237`| `TK`| 	TurKol|	TurKol|
| `238`| `EIP`| 	EIC Premium|	High-speed train|
| `239`| `SKM`| 	PKP SKM| w Trojmiescie	PKP| SKM w Trojmiescie|
| `240`| `SA`| 	SAPSAN|	High speed train|
| `242`| `STR`| 	STRIZH|	Strizh night train|
| `243`| `STR`| 	STRIZH|	Strizh interregional|
| `244`| `NJ`| 	NJ	|NJ Night Jet|
| `245`| `CAR`| 	AUTOCAR|	French regional buses (not sold via Hermes)|
| `246`| `RJX`| 	RJX|	RJX railjet xpress|
| `247`| `CJX`| 	CJX|	CJX cityjet xpress|
| `248`| 	| Night train BC |	Night train BC |
| `249`| `TGV`| 	TGV INOUI|	TGV INOUI|
| `250`| `TGV`| 	TGV INOUI|	TGV INOUI DUPLEX (double decker TGV)|
| `251`| `ALI`| 	Aare Linth| 	Aare Linth (Panorama Train)|
| `252`| `TGO`| 	Treno Gottardo| 	Treno Gottardo (Panorama Train)|
| `253`| `VAE`| 	Voralpen-Express| 	Voralpen-Express (Panorama Train)|
| `254`| `LK`| 	FRECCIALINK|	FRECCIALINK|

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

??? Need Merits input

## TravelerType

| Code | Description |
|------|-------------|
| `DOG` | |
| `ACCOMP_DOG` | |
| `LUGGAGE` | |
| `BICYCLE` | |
| `CAR` | |
| `MOTORCYCLE` |  |
| `TRAILER` |  |
| `PRM` | Person with reduced mobility |
