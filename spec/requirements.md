---
layout: page
title: Requirements
hide_hero: true
permalink: /spec/requirements/
---

## Common Functional Requirements

### Requirements on product range

It must be possible to distribute and sell all existing products on a
fare as well as on an offer basis. Existing products include admissions
(a.k.a Tickets), reservations and ancillaries.

### Requirements on price

A price has a currency, an amount and a scale.

A price has a set of value added taxes. A tax is valid for a country and
has amount.

### Requirements on personal data

The needed personal data must be indicated. Only personal data needed
can be transferred between the involved parties.

## Functional Requirements Distribution

### Requirements on passenger

A passenger is the person travailing on a vehicle. A passenger must not
necessarily be the person who has bought the booking, i.e. the customer.

A passenger has a gender (male, female or X) and date of birth. A
passenger can own reductions, most often in the form of cards.

A reduction has a type, a name and an issuer.

Passenger information must be collected as sparsely and only if needed
for a dedicated process step. Passenger details providing personal
information only information required in the offer. It is not allowed to
send personal information not required in the offer reply. It is not
allowed to send these personal data already in the offer request.

Additional data of a passenger are title, first name, last name, phone
numbers, emails or other social account.

For certain context it might be necessary to have information about the
passenger’s passport. This information can be added to a passenger if
needed (e.g. Eurostar trains).

A passenger can have a set of reduction cards.

A passenger can further transport dogs, bicycle, car, motorcycle or
trailers if this is supported by the transport vehicle.

### Requirements on location

A location uniquely identifies a place in space. A location can be of
type station, point-of-interest, address or geo-coordinate.

For railway stations the UIC code station code most be supported.

To support other means of transportation the types can potentially
extended.

### Requirements on trip

A trip most contain the following information.

- `origin`: a location where the vehicle departs
- `destination`: a location where the vehicle arrives
- `duration`: the duration of the trip
- `segments`: a list of segments

A segment represents a subsection of a trip that is realized with the
same transport. In railways it is typically one train (between the
moment passenger steps on-board until stepping out of that train) but
could be using a different means of transportation. A segment has an
origin, a destination and duration.

A vehicle is defined by a number or line and is defined by a service
brand.

A transfer is a special kind of segment, define how long the transfer
takes.

### Requirements on offers

An offer bundles admissions, reservation and ancillaries into an overall
offer presented to an allocator or a distributor.

An offer has an overall comfort class and an overall flexibility.

An offer has a minimal price. The minimal price is the price that does
not include optional reservations or ancillaries.

An offer is valid for a given time.

An offer can be pre-booked.

An offer should span the whole trip and include all needed services.

#### Requirements on admission

An admission provides the right to travel on a vehicle.

An admission has a price. In general, the price is calculated per
passenger, however for DB pricing also collective pricing must be
supported.

An admission offer is valid for a given time. An admission offer shows
which reductions has been applied.

An admission is linked to one or more passengers.

An admission is in state **CONFIRMED, FULFILLED, USED, REFUNDED.**

In general, there’s a one-to-one relationship between offer and product.
Only for some combinations of TGV and TER in France an offer most
support referencing two products.

An admission might be linked mandatorily or optional to one or more
reservations

#### Requirements on reservation

A reservation provides the right to sit or lay on dedicated place in a
vehicle

A reservation has a price. A reservation can be **OPTIONAL, MANDATORY,
INCLUDED** to an admission.

A reservation offer is valid for a given time. An admission offer shows
which reductions has been applied.

A reservation is linked to one or more passengers.

A reservation is in state **CONFIRMED, FULFILLED, USED, REFUNDED.**

A reservation has a 1-to-1 relationship to a product.

An integrated reservation shall be modelled as an admission with an
included reservation.

#### Requirements on ancillary

An ancillary is a service that can be offered to a customer. Example an
ancillary service a Wifi access or on-board meal.

An ancillary has a price.

An ancillary offer is valid for a given time.

An ancillary is linked to one or more passengers.

An ancillary is in state **CONFIRMED, FULFILLED, USED, REFUNDED.**

An ancillary has a 1-to-1 relationship to a product.

#### Requirements on fees

Sales fees of an allocator need to be possible for reservations,
admissions or auxiliaries or collectively for a set of reservations.

Requirements on fees will be treated in more details within the next
version.

### Requirements on round trips

Round trip offers should be possible considering both trips when making
the offer.

Requirements on round trip will be treated in more detail in the next
version.

### Requirements on pre-booking

A pre-booking is an offer in the state **BOOKED.**

After a given time a pre-booking becomes invalid. At this point the
allocator is required to free all resources allocated by other
allocators or fare providers.

The pre-booking process must be supported by all parties.

### Requirements on booking

A booking consists of a selected offer and optionally reservations or
optional ancillaries.

It must be possible to search for bookings:

- Passenger first name, last name or passenger date
- Booking reference
- Fulfillment reference
- Travel date or end
- Origin or destination

### Requirements on products

A product most contain the following information:

- `id`: an id uniquely identifying the product, e.g. Sparschiene
- `description`: A textual description of the product
- `conditions`: A structured description of the sales or after-sales
   conditions which can be machine interpreted.
- `refundable`: Indicates whether a product is refundable,
   refundable with conditions or not refundable
- `exchangeable`: Indicates whether a product is refundable,
   refundable with conditions or not exchangeable
- `serviceClass`: The service class describing the level of comfort.

Other attributes may define the supported fulfillment media types of the
product as well as text defining service or carrier constraint.

### Requirements on fulfillment

A fulfillment must be in a well-defined state (**CONFIRMED, FULFILLED,
CHECKEDIN, REFUNDED**) and have a unique control number. The fulfillment
must reference the offer parts covert by the fulfillment.

A fulfillment must reference fulfillment documents (aka. tickets).
Fulfillment documents in form of a UIC PDF ticket most be supported by
all parties. Other media types such as **RCT2, RCCST, UIC\_PDF, PDF\_A4,
PKPASS, TICKETLESS, ALLOCATOR\_APP, SOCIAL\_MEDIA\_ACCOUNTS** can be
supported. Especially the support ticketless is encouraged to be
supported by all parties.

**In allocator mode only:** A fulfillment may reference fulfillment
items such as visual security elements, additional bar codes or control
key,

### Requirements on refund

For a given a booking a refund can be requested.

A refund can have a fee.

Cancellation (a.k.a. as revoke) is a special kind of refund where no
fees apply, and the complete amount is returned.

Cancellation must be supported by all parties. Total refund must be
supported by all parties

### Requirements on partial refund or exchange

Partial refund is regarded as special form of exchange

Partial refund as well as exchange may be supported by all parties.

## Functional Requirements Allocation

The requirements covered by this specification are listed here with
references to the implementation. Changes in the requirements during the
lifecycle of this specification might lead to changes in the
corresponding implementations.

### Requirements on regional validity

Users of the data:

- The allocator to link a journey from the timetable to the valid
  offers based on the fare data (automated)
- The passenger in a readable form to know which transport connections
  he can use (manual)

- A controller to validate the ticket on a train or station or station
  (manual and/or automated (e.g. gates))

Non-functional:

- The fares depend on the timetable. The station data are not part of
  the fare structure. Stations will always be referenced by the
  station code used in the timetable. Station codes used are those in
  the timetable according to EU TAP-TSI B.1.

Functional concepts:

#### Station

A station which could be used in timetable data to embark and/or
disembark passengers.

#### Fare reference station set (virtual pricing point)

A fare reference station is a list of stations where the fare is valid
with a common name.

*Implementation:* **FareReferenceStationSet**

#### Route

A route is defined as an ordered list of stations or “fare reference
stations” along a possible travel route. In the human readable form, the
stations are separated by “\*”.

A route can split into optional routes indicated in the human readable
route by “/”.

The end of a route of one carrier when combined to another route of
another carrier is indicated with an additional “(FR)” in the human
readable form if it is not at a “real” station.

Are routes used as line routes or as bubble routes?

A\*B/D\*C as line routes: A-E-C is not allowed

A\*B/D\*C as bubble route: A-E-C is allowed

*Decision*: only the line routes will be supported, “bubbles” must be defined as areas

More than two alternative routes must be possible in the route
description.

#### Areas

Areas for the regional validity are needed. The areas defined in IRS
90918-4 (control) and IRS 90918-9 (bard codes) will be available for the
fares as well:

- Zones
- Countries
- Geographical polygons

Route for dynamic fares:

- Train bound ticket only
  - No route
  - List of train number, travel date and time, service brand (optional), from/to station

- Route based only
  - Route same as for non-yielded NRT
  - Optionally depending on service brand(s)

- Train bound (long distance) + route (regional)
  - Yield management can be on both parts combined, so the complete part must be
    requested online

- Train bound (carrier 1) + Train bound (carrier 2)
  - Train bound offer until the border point on both sides
  - Train bound can be combined into one

- Train bound (carrier 1) + route (carrier 2)
  - Train bound offer until the border point
  - Route description from the border point onwards

#### Connection Point

Regions (routes) of different carriers can be connected at defined
connection points. The old concept of a central predefined list of
border points (as part of TAP-TSI) is replaced by the concept of
“connection points” which can be defined by each carrier independently
using the station codes.

Connection points will include a border point code to support existing
implementations where the border point code is compared with the
timetable data. As in principle every station can become a connection
point (e.g. all stops from Aachen to Brussels are connection points from
DB to SNCB) implementations based on border point codes cannot cover all
connections.

As on both sides of a connection multiple small stations could be
connected and not all of them might be in the timetable of a train the
connections point should allow to connect sets of stations.

*Implementation:* **ConnectionPoint**

### Requirements on allowed service

#### Allowed services

Open tickets - not linked to a train - might be valid for some carriers
or services on the route only.

As the offers should be created based on the timetable the allowed
services in an offer should be defined based on the service brand code
in the timetable data.

Carriers and service brands can be included or excluded.

*Implementation:* **CarrierConstraint,** **ServiceConstraint**

#### Class of Service

List of classes allowed in the ticket. Railways use different notions
and names on service classes on their trains. A common type is needed to
combine different levels of service from different railways.

There needs to be a marketing name for the class.

Service class is optional for transportables

- Bicycle
- Dog (might depend on the class of the ticket)
- Luggage (might depend on the class of the ticket)
- Oversize Luggage (might depend on the class of the ticket)

*Implementation:* **ServiceConstraint,** **ServiceClass**

IRT fares don’t use classes but service levels (defined in IRS 90918-1)
to cover the more detailed products available via reservation.

In case NRT and Reservation needs to be combined, rules are needed which
service levels of the reservation are allowed in combination with a
fare.

**Implementation: à**

<img src="media/image2.png" style="width:4.58333in;height:1.98958in" />

<img src="media/image3.png" style="width:3.3in;height:3.2in" />

|     |     |
|-----|-----|
|     |     |

**SalesAvailabilitySales** availability defines the constraints on the
time when a sale of a fare can start or end. The sales availability is
used in the offline data exchange only. A constraint is provides as a
list of salesRestrictions that have to be applied. Figure 42: Sales
availability structureSales restrictions can define a start and end of
the sale relative to the date of sale or the date of travel.A reference
to a calendar can be provided to indicate all sales dates.Figure 43
SalesAvaillability data structure - calendar  
**Data constraints**startOfSale, endOfSalestartOfSale &lt; endOfSale
**  
**ServiceClassRequirements on availability for purchase

An offer is available a specific time range before the start of travel
at the first departure station in the time zone of the departure
station.

An offer might become unavailable a specific time range before the start
of travel at the first departure station in the time zone of the
departure station.

An offer might be available from a specific time onwards or in a time
range or time ranges (either in UTC or alternatively in the time zone of
the ticket vendor).

Example: Offer A is available from 3 months before departure until 2
days before departure and can be purchased in June and July on Thursdays
only.

Real examples

- Available for purchase 180 to 3 days before departure day
- Available for purchase 01 JUN – 30 JUN for travels 01 JUL – 31 AUG
  for 30 consecutive days of validity

  - purchase 01 JUN – 30 JUN
  - travels in 01 JUL – 31 AUG à validity for usage
  - 30 days of validity à validity for usage

- Available for purchase 180 to 0 days before departure day, valid for
    2 consecutive days

The following rules can be defined (and combined):

- Sales start hours or days prior to the departure in the time zone of
  the departure station

- Sales ends minutes, hours or days prior to the departure in the time
  zone of the departure station

- Sales start hours or days prior to the start of validity in the time
  zone of the departure station

- Sales ends minutes, hours or days prior to the start of validity in
  the time zone of the departure station

- Sales ends minutes, hours after the start of validity in the time
  zone of the departure station

  - A specific range of days in UTC

- A specific range of days in the time zone of the sales location

*Implementation:* **SalesAvailability,**

### Requirements on validity for usage

The validity of usage defines the time when the passenger is allowed to
use a fare. To define this time there is a need to:

- Simple duration (number of days starting from the first day of
  validity 00:00 in the time zone of the departure station until the
  number of days and hours later at a specified time in the time zone
  of the arrival station:

Example:

> Start of Validity: 1.1.2020 00:00 CET
>
> Validity data: 4 days 5 hours
>
> End of Validity: 5.1.2020 05:00 GMT
>
> Printed text on the ticket: 1.1.2020 – 4.1.2020

- Duration as number of days and hours + number of days of the journey
    according to the timetable

- Exclusions (e.g. not valid during peak hours 8:00 – 10:00)
  - Peak hours in case the journey starts in the peak hours (e.g. at NS)
  - Peak hours in general

- Restrictions to specific days
  - Mondays
  - Tuesdays
  - …
  - Sundays
  - Specific dates or date ranges

- Restriction on return tickets
  - return ticket of the same carrier must be sold
  - the number of nights in between the inbound and outbound part of a return ticket
  - a specific weekday in between the inbound and outbound part of a return ticket
    is not allowed

*Decision*: no return tickets on one “paper” but return fares should be possible.

- Validity for passes

  - Indication that the ticket is a pass
  - Start and end of validity in UTC
  - Number of allowed trips or days

<!-- -->

- Examples:
  - Valid Monday – Friday when work day from 09:00 until 03:00 the following day
    - à Mo – Fr without holidays

  - Valid Saturday – Sunday and public holidays from 00:00 until 03:00 the 
    following day

*Implementation:* **TravelValidityConstraint**

### Requirements on validity for passengers / transportables

Transportables can be different types of passengers, animals or other
items carried by a passenger.

- A passenger might have an upper and / or lower age limit.
- A passenger might have an additional age limit for travelling alone.
- There might be a limit on the number of accompanying passengers of
  one type a passenger of another type can accompany. (e.g. not more
  than 8 children with one adult)
- A passenger might have an additional age limit for being entitled for reservation.
- A number of passengers might be entitled to carry a number of passengers of
  another type for free (1 Adult + 1 accompanying person for PRM).

**Implementation:**

|     |     |
|-----|-----|
|     |     |
|     |     |

CodeDescriptionWALK**A walk**OTHER**Other types of transfer (e.g. taxi,
local city transport not included in the offer,...)**PassengerTypes

A fare might be available with a specific number of passengers only
(group fares):

- Minimum number of passengers (adults + seniors + children + youths +
  Accompanying Person for PRM)

- Minimum number of adults + seniors + (children + youths) / 2

*Implementation:* **PassengerConstraint**

### Requirements on validity for reductions

Reductions are price reduction due to a reduction “card” an existing
ticket or a pass which the passenger already holds. It might be that the
physical card does not correspond to a specific reduction but provides
the option to carry different reductions.

Different prices due to the age of the passenger are separate fares, not
reductions to a fare.

- A card might be valid only for combined tickets only (special NS card)

- Multiple cards might apply to the same route segment, but only one
    of them would be applied.

- A reduction might grant a 100% price reduction à In this case an NRT
    is created up to the final station the customer goes with the price
    to the border of the area. The ticket indicates that the ticket has
    a reduction of 100% within the area and an indication that it is
    valid only together with the card. Pricing data are needed for the
    free travel area to get the route description.

*Implementation:* **ReductionCard**

### Requirements on prices

Prices might be needed in more than one currency.

- Currency (local currency might be required additionally due to local legislation for two carriers in one country)
- Amount

Value Added Tax (VAT) details must be given to the customer to enable a business
customer to claim a refund. The VAT details include:

- Country
- VAT-Company-Id
- Percentage
- Amount

The VAT given is the VAT the carrier pays for this fare to the countries
where he is providing his service. The VAT might depend additionally on
whether the fare is issued as national ticket or integrated in an
international ticket. Also, the VAT might depend on whether the fare is
used for short distance or integrated in a long-distance ticket

**Note**: There are national rules on where and when to display the
VAT on a ticket or receipt when a ticket is sold in that country. These
are not considered here.

Possible Price formats are:

- Fixed prices attached to a route (and fare) including VAT details (country, percentage, amount, VAT id)
- Prices depending on an intermediate distance (“fare kilometer”)
- Price depending of other prices.

*Decision*: The price will be delivered also in case of reductions
or kilometers. No calculation is needed at the receiver side of the
data.

*Implementation:* **Price**

### Requirements on the basic fare structure

The basic fare element links the constraints and the price.

A name of the fare needs to be provided.

*Implementation:* **Fare**

### Requirements on the after sales conditions

After sales conditions define fees to be taken in case of an after sales
transaction on behalf of a customer. The after sales transactions
considered are:

- Cancellation (Refund)
- Exchange with a new fare of the same carrier
- Exchange with a new fare of another carrier
- Exchange for the same travel day
- Upgrade

After sales transactions due to service violations of the carrier are
governed by PRR rules and are not considered here.

Some railways make refunds using other “means of payment” like bonus
points, vouchers. These are not considered here and thus will not apply
to the fares defined here.

Some railways apply different refund rules depending on the type of
payment. These restrictions will not be considered here. It is assumed
that the refund will be processed by the allocator who manages the
combined fare. He needs to consider payment restrictions in order to
avoid fraud (e.g. no cash refund on electronically payed tickets, no
refund unless ticket control data have been received, …).

The refund fee can be claimed by the carrier.

*Implementation:* **AfterSalesRules**

### Requirements on conditions on fulfillment

The fulfillment defines the required types of creating a ticket for the
passenger and therefore especially the required types of security to be
applied.

The fulfillment might be restricted depending on:

- Allowed types of fulfillment
- Accepted / required bar codes
- Required control data exchange
- Individual ticketing

*Implementation:* **FulfillmentConstraint**

The Required personal data might depend on the fulfillment:

- Required personal data to be provided from the allocator to the carrier depending on type of fulfillment

- Depending on border crossing and train types (Belgium border crossing of high-speed trains requires personal data)

- Data might be required for ticket holder(s) only or for all passengers

*Implementation*: **PersonalDataConstraint**

### Requirements on dynamic fares and train linked tickets

#### Indication of dynamic fares available online

The allocator needs to find where he can request offers online.

- Solution 1: add the carrier(s) providing offers in their systems to the trains in the timetable

- Solution 2: publish station or ODs (optionally also by country) and/or train types (service brands) and/or the carrier(s) mentioned in the timetable where fares can be requested

- Solution 3: publish for which carriers and service brands (and optionally trains) offers can be requested

*Decision*: The solution should be independent from the timetable.

*Implementation:* **FareResourceLocation**

#### Indication of train links on the ticket

Ticket might be linked to the use of specific trains even in case there
is no reservation. There are different options on how to indicate this
restriction:

- DB solution: The train information replaces the corresponding route part

- ÖBB solution: The route description is identical to the ticket without train link and the trains are added in the condition description

*Decision*: in case of a train bound ticket the route of the train
should replace the route description for the part of the train bound*

Train link should include:

- Train number
- Service Brand Abbreviation (RJ, ICE,) (can be retrieved from timetable data)
- Date and departure time
- Departure Station (short name)
- Arrival Station (short name)

#### Request for online fares

- The complete connection must be sent

  - To check whether it is international
  - To check that it is not inside some regional tariff area
  - To calculate the correct VAT
  - To check for supplements applicable only at the start of end of the journey

- The part where the offer should be built must be provided

  - the station/connection point from and to where the offer is needed

*Implementation:* **Fares**

### Requirements on combining fares

Multiple models are defined for combining fares. The carrier defines in
the fare data which model(s) the allocator can apply.

Combining the fares tries to achieve:

- Apply the conditions set by the carrier for the service he provides to
  secure the business model and financial interests of the carrier
- Create a simple combined fare for the customer

It is not possible to achieve both target at the same time. The
different models of combining fares implement different priorities given
to these targets.

In general, the basic parameters defining the price must be listed
separately on the combined offer:

- route description / train link
- class of service
- passenger types

The combined price is always the sum of the prices of the parts. The
allocator might add a handling fee.

#### SEPARATE_CONTRACTS model

This is the model for not combining the fares in one ticket and not
allowing the integration in one contract. The rules applied for this
ticket are exactly the rules defined by the carrier in the fare data.

The allocator must ensure that it is clear for the customer that no
common contract was established.

##### Implementation Aspect

Relevant attributes:

```js
- FareCombinationConstraintDef.combinationModels.model == SEPARATE_CONTRACT
- FareCombinationConstraintDef.combinationModels.allowedCommonContracts
```

##### Business Rule

Let CC\_A be the set of allowedCommonContracts for Fare A and let CC\_B
be the set of allowedCommonContracts for Fare B.

**If** the intersection of two sets CC\_A and CC\_B is empty, **then**
separate contracts most be issued. Otherwise a combined contract can be
issued.

#### SEPARATE_TICKETS model

This is the model for not combining the fares in one ticket, so the
rules applied for this ticket are exactly the rules defined by the
carrier in the fare data. The allocator can form a common contract for
the whole journey.

Optionally this might be restricted by a list of carriers where this
combination is allowed.

##### Implementation Aspect

Relevant attributes:

```js
- FareCombinationConstraintDef.combinationModels.model == SEPARATE_TICKET
```

#### CLUSTERING model

The CLUSTERING model tries to simplify conditions and fares for the
customer but sacrifices a part of the control of the carrier on its
fares.

Similar types of fares are defined to belong to the same “cluster”. The
after sales conditions for a cluster are defined by the allocator.
However, the after sales conditions must basic rules on after sales for
that cluster.

The clusters correspond to the flexibility a passenger receives to
change the booked train. This corresponds directly to the after sales
conditions. Hereby the fees to be paid for such an exchange are
essential for the definition of clusters and not the complexity of the
process to change. Thus, a train bound ticket and an open ticket belong
to the same cluster in case the fees to change to different trains /
times are comparable.

The after sales fees can be demanded by the carrier.

The other conditions might either be listed per carrier or combined by
rules.

The customer buying products from one allocator has a simple unique view
on after sales conditions. Optionally this might be restricted by a list
of carriers and/or allocators where this combination is allowed.

The validity for usage is combined to be:

> The minimal validity of all included fares but at least the time
> needed for the combined journey according to a timetable information.

The combined fare is available for sale only if all parts are available
for sale.

The following clusters are defined (with the order from high to low
flexibility): BUSINESS à FULL-FLEX àSEMI-FLEX àNON-FLEX àPROMO

Any of the clusters can contain train linked or non train-linked offers.

Offers of a less restrictive cluster can be included in a more
restrictive cluster using the more restrictive rules for the combined
offer, e.g., BUSINESS + FULL-FLEX à FULL-FLEX

`BUSINESS`:

- Refundable after the departure or last day of validity
- Exchangeable after the departure or last day of validity

`FULL-FLEX`:

- Refundable before the departure or last day of validity
- Exchangeable before the departure or last day of validity

`SEMI-FLEX`:

- Refundable with fee depending on conditions of the allocator
- Exchangeable with fee depending on conditions of the allocator
- Minimum validity applies

`NON-FLEX`:

- Non refundable
- Non exchangeable
- Minimum validity applies

`PROMO`:

- Non refundable
- Non exchangeable
- Minimum validity applies
- Restricted combination with another cluster offers

##### Implementation Aspect

Relevant attributes:

```js
- FareCombinationConstraintDef.combinationModels.model == CLUSTERING
- FareCombinationConstraintDef.combinationModels.combinableCarriers
- FareCombinationConstraintDef.combinationModels.referencedCluster
- FareCombinationConstraintDef.combinationModels.allowedAllocators
```

##### Business Rule

Let A, B be fares.

**If** A.referenceCluster is element of B.allowedClusters AND if the
fare provider of fare B is in A.combinableCarriers AND if the fare
provider of fare A is in B.combinableCarriers **then** the fare A and B
are combinable according to the CLUSTERING MODEL.

#### COMBINATION model

The COMBINING model tries to be close to the fare conditions defined by
the carrier but sacrifices the simplicity of the fare towards the
customer.

The after sales conditions of the different fares will be combined into
one condition to best reflect the conditions of all included carriers.

The after sales conditions will thus depend on the combinations of
carriers.

Optionally this might be restricted by a list of carriers where this
combination is allowed.

The combination model tries to apply all rules of the involved carriers
but sacrifices simplicity of rules.

The validity is combined to be:

> The minimal validity of all included fares but at least the time
> needed for the combined journey according to a timetable information.

The combined fare is available for sale only if all parts are available
for sale.

The after sales fees are combined accordingly:

> At any time, the fees defined by the carriers are applied on the
> price part of these carriers only. The result is a list of times with
> increasing fees.

Example

- Fare 1: 10% 20 days before departure, price: 100€
- Fare 2: 90% 2 days before departure, price: 200 €
- Result: 10€ fee 20 days before departure

10€ + 180€ = 190€ fee 2 days before departure

#### Implementation Aspect

Relevant attributes:

```js
- FareCombinationConstraintDef.combinationModels.model == COMBINING
- FareCombinationConstraintDef.combinationModels.combinableCarriers
- AfterSalesCondition.afterSalesRules.fee
- AfterSalesCondition.afterSalesRules.applicationTime
```

*Implementation:* **FareCombinationConstraint**

### Requirements on Reservation

It should be possible to book reservations within the same technology.

The existing reservation services in IRS 90918-1 should also be
supported.

## Architectural Requirements

### Requirements on aligned processes end to end

The processes must be are aligned over all actors to reduce overall
complexity and thus costs.

### Requirements on aligned services

The services must be aligned such that there is a close mapping to the
processes supported by the services.

The services must be aligned such that the call chain between the
services does not involve unnecessary mappings between different actors

### Requirements on messages

The messages of the online services must contain no unnecessary
attributes or data structures. Unnecessary attributes are attributes
that are not needed for the online processes

### Requirements on extendibility

The specification must be extendible in various dimensions:

- Support of new products on the fare as well as on the offer level
- Support of new processes, e.g. product-based distribution
- Support of new modes of transportations, e.g. scooters or rail

### Requirements on security

The specification must include the protocols to ensure secure
authentication and data transfer.

## Legal Requirements

The flowing legal regulations provide requirements that affect the solution:

### Rail PRR Regulation (EC) 1371/2007 on Rail Passengers’ Rights and Obligations

This regulation must be fulfilled.

### GDPR: Regulation (EU) 2016/679 on data protection

- The traveller must be informed on the use of his data and on passing his data
  to the carrier and TCO
- The traveller must be informed which data are stored including data passed to
  the carrier and TCO
- The traveller has the right to ask to delete the data in case the data are not
  required to fulfil the contract of carriage
- The traveller has the right to ask for data correction in case the data are wrong
- Legal basis for processing of personal data with a view of black listing

  Although the exchange of blacklists is not in the scope of the
  specification the data exchanged can be used by the allocator for a
  local blacklist. He has therefore to obey the regulations when using
  the data.

  Two processing actions (automated profiling) are concerned:

  1. Collection and analysis of personal data on regular basis for
     trigger points: consent of passengers or legitimate interests of the
     rail carrier is needed

  2. Storage of information in the blacklists: legitimate interest of the
     rail carrier is needed

- General black list for use by multiple companies is allowed

  1. No access to the full list is provided
  2. No automatic checking in all cases

- Pre-cautions to be pursued by the railway undertaking

  1. Ensure right of access and objection
  2. Information preceding such processing and notification of inclusion into the blacklist
  3. Safeguards to prevent confusion
  4. Additional organizational and technical safeguards for processing

#### Art. 101§1 TFEU (Competition Law)

All agreements between undertakings, decisions by associations of
undertakings and concerted practices which are restrictive of
competition are prohibited and void

Sensitive activities are:

- Information sharing
- Joint purchasing/selling
- Technical standards
- Standard terms and conditions

The following guidelines apply:

- Technical specifications for data formats should be ok

- Technical specifications for data exchange scenarios should be ok,
  but excessive error handling scenarios should be optional and agreed
  bilaterally as unnecessarily high requirements would be a
  restriction for small companies

- Service Level Requirements should be minimal requirements as
  unnecessarily high requirements would be a restriction for small
  companies, higher service levels must be agreed bilaterally

- Information exchange is allowed between the carriers within one
  contract of carriage as they are all involved in the contract. This
  does not apply in case of separate contracts.

## Requirements not in Scope

- Payment procedures including payment procedures via private currencies alike bonus points

  Information whether such payments are allowed can be included in the fare data, but the required service to handle such payments are not specified here.

- Validation of customer cards

- Combination with non-rail related fares, e.g., flight

- Combination with fares build on pay-per-use basis. e.g., scooters

# Actors / Business Capabilities

Actors are defined according to the UML specification. An Actor models a
type of role played by an entity that interacts with the subject (e.g.,
by exchanging signals and data), but which is external to the subject.

Actors may represent roles played by human users, external hardware, or
other subjects**.**

**Note that an actor does not necessarily represent a specific physical
entity but merely a facet (i.e., “role”) of some entity** that is
relevant to the specification of its associated use cases. Thus, a
single physical instance may play the role of several different actors
and, conversely, a given actor may be played by multiple different
instances.

The following diagram shows the actors and principal use cases involved
in rail distribution and control. The principal use case relevant for
this specification is marked in yellow.

[Actor model](../images/actors/actors.png)

The fare data exchanged might already be the result of an allocation
process between different local carriers and local transport
administrations.

## Actors

<table>
<thead>
<tr class="header">
<th>Actor</th>
<th>Description</th>
<th>Motivation / Distinction to other roles</th>
</tr>
</thead>
<tbody>
<tr class="odd">
<td>Allocator</td>
<td><p>The <strong>allocator</strong> manages the lifecycle of a product sold (the travel contract). He therefore needs to establish information exchange with the <strong>ticket vendor</strong>, <strong>carriers</strong> and <strong>TCOs</strong> involved.</p>
<p>The <strong>allocator</strong> makes products available to the <strong>ticket vendor</strong>.</p>
<p>The allocator could provide direct services to the <strong>passenger</strong> to modify the ticket status (e.g. activate / check in on a ticket).</p>
<p>The allocator combines fares defined by the carriers according to their rules.</p>
<p>The allocator creates the ticket fulfilment data (e.g. pdf, pkpass, ...).</p>
<p><u>Note</u>: To avoid confusion due to usage differences (see the CIT term bank as well as the European TAP-TSI regulation), the terms “Issuer” and “Attributor” have been avoided in this IRS.</p></td>
<td>The allocator is introduced to separate the role of just selling tickets along a route (Ticket Vendor) from the role of creating the ticket content and providing it to vendors for sale.</td>
</tr>
<tr class="even">
<td>Carrier</td>
<td><p>The <strong>carrier</strong> it the owner of the fare- He provides the transport of the <strong>traveller himself or via a substitute carrier.</strong></p>
<p>The travel contract provided to the customer establishes a contract between the traveller and each carrier participating in the product.</p>
<p>Carriers include Railway undertaking, Bus companies, Maritime companies.</p></td>
<td></td>
</tr>
<tr class="odd">
<td>Customer</td>
<td><p>Purchaser of a travel contract for one or more traveller.</p>
<p><strong>Note:</strong> The <strong>customer</strong> is entitled to receive refund payments.</p></td>
<td>The <strong>customer</strong> buys the ticket which represents the travel contract between one or more <strong>travellers</strong> and one or more <strong>carriers</strong>.</td>
</tr>
<tr class="even">
<td>Distributor</td>
<td>The <strong>ticket vendor</strong> is the company selling the ticket provided and managed by the <strong>allocator</strong> to the customer.</td>
<td>Alias: Ticket Vendor</td>
</tr>
<tr class="odd">
<td>Fare Provider</td>
<td>The fare provider manages fares on behalf of a carrier or a local transport authority.</td>
<td></td>
</tr>
<tr class="even">
<td>Local Transport Authority</td>
<td><p>The local transport authority organizes the local traffic within an area a behalf of the government or is itself a governmental organisation.</p>
<p>It defines a fare structure for the local transport which all carriers included must apply.</p></td>
<td></td>
</tr>
<tr class="odd">
<td>Passenger</td>
<td>Person who travels using a travel contract.</td>
<td>The passenger and the customer can be to distinct person, e.g., if a mom buys a ticket for her daughter.</td>
</tr>
<tr class="even">
<td>Ticket Controller</td>
<td>The Other means of ticket checking (e.g. gates) will also be named TCOs.</td>
<td>Alias: <strong>Train Agent</strong></td>
</tr>
<tr class="odd">
<td>Ticket Vendor</td>
<td><p>The <strong>ticket vendor</strong> is the company selling the ticket provided and managed by the <strong>allocator</strong> to the customer.</p>
<p><strong>The ticket vendor does not combine fare into one ticket.</strong></p></td>
<td>Alias<strong>: Distributor</strong></td>
</tr>
</tbody>
</table>

## Common Business Capabilities

### Powerful fare combination

It must be possible to combine fare according to existing fare
combinations (e.g. NRT-style PRIFIS) as well as new fare combination
models.

### Simple distribution

It must be easily possible to distribute existing and new products.
Easily possible means two things: Firstly, for a customer it must be
easily possible to find and book and – if needed – refund a booking.
Secondly, for the rail sector as a whole the complexity of distribution
must be reduced to save costs both for development as well as
distribution.

## Business Capabilities for Distribution

### Lookup location

In order to uniquely identify a place of origin and destination a
service to look up the unique code is needed. For railway stations this
code is the UIC station code.

### Search trips

A service to lookup possible trips from origin to destination is needed,
especially as the most attractive offers are bound to trip.

### Find offers

For a given trip possible offers spanning the complete trip need to be
calculated to the customer. An offer has an overall flexibility, an
overall comfort class and a minimal price. An offer consists of
admissions, reservations or ancillaries. Reservations or ancillaries can
be included, optional or mandatory.

The overall offer should be “homogenous”, i.e. consisting of offers of
the same service class. For the Italian market, non-homogenous offers
need to be supported.

**Scope**: Only trip-based offer search is defined in this version of
the specification.

**Scope:** The offer must span the complete trip in this version of the
specification.

**Scope**: Support for round-trips will be add in the next version of
the specification.

### Pre-book offers

If a customer puts an offer into a basket on a distributor channel, it
most be possible to retain this offer for a given time using a prebook
service. In our design this service creates a booking in the created in
the status “prebooked”. If the prebooked booking is not booked after a
given time limit it well be freed which also includes freeing all
eventual reservations on inventories.

### Book pre-booked booking

After the booking has been paid by the customer, he or she owns the
booking and the booking is changed to “booked” by a booking service.

### Fulfill booking

After the booking process the customer needs a set of documents to
travel and to prove to a ticket control organization that he or she is
eligible to travel. Therefore, a service to fulfill a booking in given
form, e.g. a ticket is needed. Internally, the state of the booking is
changed to “fulfilled”.

**Scope**: Only support for UIC PDF is mandatory in this version of the
specification.

### Get booking

To get the booking of a customer a service is needed. Specially care
needs to be taken into account that privacy regulations are respected.

### Refund booking

If a customer wants to refund a booking a service to refund a booking is
needed. The service calculates a refund offer including fees and amount
returned which is offered to the customer. If he or she accepts the
refund offer the refund offer can be booked. Special refund reasons need
to exist, which affect fees and amount returned. Especially, if an agent
or a machine makes a mistake a refund reason is needed to refund a
booking with no penalties.

By design, the refund process is modelled similarly to the offer/booking
process.

**Scope**: Only support for total refund is mandatory in this version of
the specification.

### Exchange booking

If a customer wants to exchange a booking a service to exchange is
needed. Conceptually it takes the existing booking and a new trip and
calculates an exchange-offer. This exchange-offer can be booked and
fulfilled similarly to refund-offer.

**Scope:** This capability is optional to support in this version of the
specification.

### Graphical seat reservation

In order to display the layout of a train to a customer a service to
access coach layout data and availability pf places is needed.

**Scope**: This capability is optional to support in this version of the
specification.

### Edit passenger information

To add or in special cases edit passenger information a service is
provided. This service is explicitly designed to be fully complaint to
GDPR regulation.

### Retrieve product information

A service to access the attributes of a product such as detailed sales
and after-sales is needed.

### Retrieve stored personal data

A customer can request information on the stored personal data. This
includes also information on personal data passed on to allocators. The
booking data can be used to show the stored personal data.

## Business Capabilities for Fare Allocation

### Combine fares

The allocator combines fares from different carriers into one offer. The
rules on how to combine fares are part of the fare data.

### Service resource location / locate dynamic fares

Dynamic fares must be requested online. The allocator needs to find the
online resource where to request the offer and book. The fare data
provide information on how to find the online service.

### Provide bulk fare data

The carrier provides bulk data on his static fares and additional data
for locating online services to the allocators.

### Provide dynamic fare

The carrier provides an online service to retrieve dynamic fares.

### Book offer

The carrier provides online services to book fares and cancel or
exchange fares. These can be either as defined in the specification
herein or via the interface defined in IRS 90918-1.

### Fulfillment

All necessary information for an allocator to build a valid a ticket
including necessary attributes and control elements most be included by
the fare provider.

### Reservation

Reservation has been included in the online services and the inventory
resolution data for fare or reservation are included in the bulk data
(see FareResourceLocation).

Option/Step 1: using 90918-1 messages for reservation

1. offer (90918-10 REST service) à parameters for 90918-1 soap services are delivered
2. reservation as-if (90918-1 soap service) / graphical place display (90918-1 soap service)
3. reservation (90918-1 soap service) / specific place reservation (90918-1 soap service)
4. pre-booking NRT (90918-10 REST service)
5. confirm booking NRT (90918-10 REST service)

Option/Step 2: using REST services 90918-10 for all services

1. offer (90918-10 REST service)
2. checkPreferences (90918-10 REST service) / graphical place display (90918-10 REST service)
3. pre-booking NRT / reservation (90918-10 REST service)
4. confirm booking of reservation / NRT (90918-10 REST service)

### Get booking

To get the booking of a customer a service is needed. Specially care
needs to be taken into account that privacy regulations are respected.

### Refund booking

If a customer wants to refund a booking a service to refund a booking is
needed. The service calculates a refund offer including fees and amount
returned which is offered to the customer. If he or she accepts the
refund offer the refund offer can be booked. Special refund reasons need
to exist, which affect fees and amount returned. Especially, if an agent
or a machine makes a mistake a refund reason is needed to refund a
booking with no penalties.

By design, the refund process is modelled similarly to the offer/booking
process.

**Scope**: Only support for total refund is mandatory in this version of
the specification.

### Exchange booking

If a customer wants to exchange a booking a service to exchange is
needed. Conceptually it takes the existing booking and a new trip and
calculates an exchange-offer. This exchange-offer can be booked and
fulfilled similarly to refund-offer.

**Scope:** This capability is optional to support in this version of the
specification.

### Accounting

The specification of the accounting data is not part of this document,
however some on the fare content defined in this specification must be
included in the accounting data.

The accounting data of a booking should include:

- The identification of the entire ticket sold (unique id within the context of the allocator for at least 2 years)

- The booking id provided by the carriers in case of online fares (unique id within the context of the carrier for at least 2 years)

- The identification of each fare included in the ticket (unique id e.g. UUID)

- The identification of individual tickets of the allocator (unique id within the context of the allocator for at least 2 years)

- The identification of individual tickets of the carriers (unique id within the context of the carrier for at least 2 years)

- The price for each fare and carrier included in the ticket

- The VAT does not need to be included in the accounting data (to be verified in RCF-1)

When using the existing 301 data file structure the ids cannot be
included. Until the accounting data structures have not been extended
the following intermediate solution is included:

For NRT fares distributed in the bulk data exchange:

A legacy accounting identifier is included in the fare element:

- `seriesId`: the last five digits of the index of a regionalValidity
  within the list of regional validities

- `addId`: the remaining digits of the index of a regionalValidity
  within the list of regional validities (max. 2 digits)

- `tariffId`: the index of the fare Element in a list of all fare
  elements referencing the same regionalValidity

Thereby it is possible to identify the fare element uniquely in the
context of a fare data delivery.

Accounting data flow:

- In case of NRT fares used from a bulk data exchange:

The allocator is responsible for the accounting. The data structure for
NRT is used.

- In case of fares (IRT or NRT) used with an online booking service:

The carrier is responsible for the accounting. The data structure for
IRT is used.

- In case of fares (IRT or NRT) used with an online booking service
  but with carrier fees defined by the allocator:

The carrier is responsible for the accounting. The data structure for
IRT is used. The allocator will inform the carrier on the applied fees
in the cancellation confirmation.

### Graphical seat reservation

In order to display the layout of a train to a customer a service to
access coach layout data and availability pf places is needed.

**Scope**: This capability is optional to support in this version of the
specification.

### Edit passenger information

To add or in special cases edit passenger information a service is
provided. This service is explicitly designed to be fully complaint to
GDPR regulation.

### Retrieve stored personal data

A customer can request information on the stored personal data. This
includes also information on personal data passed on to fare providers /
carriers. The booking data can be used to show the stored personal data.
