---
layout: page
title: Requirements
hide_hero: true
permalink: /spec/requirements/
---

## Table of contents

- [Table of contents](#table-of-contents)
- [Common Functional Requirements ](#common-functional-requirements-)
  - [Requirements on Product Range ](#requirements-on-product-range-)
  - [Requirements on Price ](#requirements-on-price-)
  - [Requirements on Personal Data ](#requirements-on-personal-data-)
- [Functional Requirements of the Retailer ](#functional-requirements-of-the-retailer-)
  - [Requirements on Passenger ](#requirements-on-passenger-)
  - [Requirements on Location ](#requirements-on-location-)
  - [Requirements on Trip ](#requirements-on-trip-)
  - [Requirements on Offers ](#requirements-on-offers-)
    - [Requirements on Admission ](#requirements-on-admission-)
    - [Requirements on Reservation ](#requirements-on-reservation-)
    - [Requirements on Ancillary ](#requirements-on-ancillary-)
    - [Requirements on Fees ](#requirements-on-fees-)
  - [Requirements on Prolonging an Offer ](#requirements-on-prolonging-an-offer-)
  - [Requirements on Offer Combination ](#requirements-on-offer-combination-)
  - [Requirements on Round Trips ](#requirements-on-round-trips-)
  - [Requirements on Booking ](#requirements-on-booking-)
  - [Requirements on Products ](#requirements-on-products-)
  - [Requirements on Fulfillment ](#requirements-on-fulfillment-)
  - [Requirements on Documents ](#requirements-on-documents-)
  - [Requirements on Refund ](#requirements-on-refund-)
  - [Requirements on Partial Refund  ](#requirements-on-partial-refund--)
  - [Requirements on Exchange ](#requirements-on-exchange-)
  - [Requirements on Seat Change ](#requirements-on-seat-change-)
  - [Requirement to Release Allocated Resources ](#requirement-to-release-allocated-resources-)
  - [Requirement to Cancel a Fulfillment ](#requirement-to-cancel-a-fulfillment-)
  - [Requirements on Complaints ](#requirements-on-complaints-)
  - [Requirements on Reimbursements ](#requirements-on-reimbursements-)
- [Functional Requirements of a Distributor ](#functional-requirements-of-a-distributor-)
  - [Requirements on regional validity ](#requirements-on-regional-validity-)
    - [Station ](#station-)
    - [Fare reference station set (virtual pricing point) ](#fare-reference-station-set-virtual-pricing-point-)
    - [Route ](#route-)
      - [routes used as line routes or as bubble routes](#are-routes-used-as-line-routes-or-as-bubble-routes-)
    - [Areas ](#areas-)
    - [Connection Point ](#connection-point-)
  - [Requirements on Allowed Service ](#requirements-on-allowed-service-)
    - [Allowed Services ](#allowed-services-)
    - [Class of Service ](#class-of-service-)
  - [Requirements on availability for purchase ](#requirements-on-availability-for-purchase-)
  - [Requirements on validity for usage ](#requirements-on-validity-for-usage-)
  - [Requirements on validity for passengers / transportables ](#requirements-on-validity-for-passengers--transportables-)
  - [Requirements on validity for reductions ](#requirements-on-validity-for-reductions-)
  - [Requirements on prices ](#requirements-on-prices-)
  - [Requirements on the basic fare structure ](#requirements-on-the-basic-fare-structure-)
  - [Requirements on the after sales conditions ](#requirements-on-the-after-sales-conditions-)
  - [Requirements on conditions on fulfillment ](#requirements-on-conditions-on-fulfillment-)
  - [Requirements on dynamic fares and train linked tickets ](#requirements-on-dynamic-fares-and-train-linked-tickets-)
    - [Indication of dynamic fares available online ](#indication-of-dynamic-fares-available-online-)
    - [Indication of train links on the ticket ](#indication-of-train-links-on-the-ticket-)
    - [Request for online fares ](#request-for-online-fares-)
  - [Requirements on combining fares ](#requirements-on-combining-fares-)
    - [SEPARATE\_CONTRACTS model ](#separate_contracts-model-)
      - [Implementation Aspect ](#implementation-aspect-)
      - [Business Rule ](#business-rule-)
    - [CLUSTERING model ](#clustering-model-)
      - [Implementation Aspect ](#implementation-aspect--1)
      - [Business Rule ](#business-rule--1)
    - [COMBINATION model ](#combination-model-)
    - [Implementation Aspect ](#implementation-aspect--2)
  - [Requirements on Reservation ](#requirements-on-reservation--1)
  - [Requirements on Trip Interruptions ](#requirements-on-trip-interruptions-)
  - [Requirements on Multi-Journeys Tickets ](#requirements-on-multi-journeys-tickets-)
  - [Requirements on Fare Exchange ](#requirements-on-fare-exchange-)
- [Architectural Requirements ](#architectural-requirements-)
  - [Requirements on aligned processes end to end ](#requirements-on-aligned-processes-end-to-end-)
  - [Requirements on aligned services ](#requirements-on-aligned-services-)
  - [Requirements on messages ](#requirements-on-messages-)
  - [Requirements on extendibility ](#requirements-on-extendibility-)
  - [Requirements on security ](#requirements-on-security-)
- [Legal Requirements ](#legal-requirements-)
  - [Rail PRR Regulation (EC) 1371/2007 on Rail Passengers’ Rights and Obligations ](#rail-prr-regulation-ec-13712007-on-rail-passengers-rights-and-obligations-)
  - [GDPR: Regulation (EU) 2016/679 on data protection ](#gdpr-regulation-eu-2016679-on-data-protection-)
    - [Art. 101§1 TFEU (Competition Law) ](#art-1011-tfeu-competition-law-)
- [Requirements not in Scope ](#requirements-not-in-scope-)


## Common Functional Requirements <a name="CommonFunctionalRequirements">

Content provided to a client in a transaction must be complete, no additional information besides basic code lists (e.g. locations) is needed to process them.

### Requirements on Product Range <a name="RequirementsonProductRange">

It must be possible to distribute and sell all existing products. Existing products include admissions (a.k.a Tickets),
reservations and ancillaries.

### Requirements on Price and Payment <a name="RequirementsonPrice">

The pice must always be provided, no calculations on the client side despite the addition in receipts are allowed. 

Vouchers might be issued for a refund, claim or reimboursement. Vouchers can also be purchased as non trip offers. 

Vouchers can be used as payment method. The used vouchers and possible remaining amounts must be shown in the booking.

The payment is not prt of OSDM. However the payment method needs to be provided to avoid missuse, e.g. refund in cash on a booking made by card.

The price must already consider all applicable reductions and promotions.

The price of an offer is not guaranteed before pre-booking.

A price has a currency, an amount and a scale. Per default the scale is set to two.

A price has a set of value added taxes. A tax is valid for a country and has amount.


### Requirements on Personal Data <a name="RequirementsonPersonalData">

The needed personal data must be indicated. Only personal data needed for the
given business process can be transferred between the parties involved.

## Functional Requirements of the Retailer <a name="FunctionalRequirementsoftheRetailer">

Content provided to the retailer must be self contained and include all required textual descriptions needed for the presentation of the products to a client.


### Requirements on Passenger <a name="RequirementsonPassenger">

A passenger is the person travailing on a vehicle. A passenger may not
necessarily be the person who has performed the booking, i.e. the customer.

A passenger has a gender (male, female or X) and date of birth. A passenger can
own reductions, most often in the form of cards.

A reduction has a type, a name and an issuer.

Passenger information must be collected sparsely and only if needed for a
dedicated process step. Passenger details providing personal information shall
only be used to meet the requirements of the offer. It is not allowed to send
personal information not required in the offer reply. It is not allowed to send
these personal data already in the offer request.

Additional personal data of a passenger are title, first name, last name, phone
numbers, emails or other social account.

For certain context it might be necessary to have information about the
passenger’s passport. This information can be added to a passenger if needed
(e.g. Eurostar trains).

A passenger can have a set of reduction cards.

A passenger can further transport dogs, bicycles, cars, motorcycles or trailers
if this is supported by the transport vehicle.

### Requirements on Location <a name="RequirementsonLocation">

A location uniquely identifies a place in space. A location can be of type
station, point-of-interest, address or geo-coordinate.

For railway stations the UIC station codes must be supported.

To support other means of transportation the types can potentially be extended.

### Requirements on Trip <a name="RequirementsonTrip">

A trip must contain the following information.

- `origin`: a location where the vehicle departs
- `destination`: a location where the vehicle arrives
- `duration`: the duration of the trip
- `tripLegs`: a list of tripLegs

A trip is composed of one or more `tripLegs` and can be of one the following
type:

- **TimedLeg**: A type of leg with a timetable schedule such a provided by
  public transport
- **TransferLeg**: A type of leg that links two legs such as walking from one
  stop to another
- **ContinuosLeg**: A type of leg that is not bound to a timetable. This leg is
  mainly aimed at new modes such as scooter, taxis,..

A tripLeg represents a subsection of a trip that is realized with the same
transport vehicle. In railways it is typically one train (between the moment
passenger steps on-board until stepping out of that train) but could be using
different means of transportation. A tripLeg has an origin, a destination and
duration.

A vehicle is defined by a number or line and a service brand.

A transfer is a special kind of tripLeg, defining how long the transfer takes.

### Requirements on Offers <a name="RequirementsonOffers">

Search for offers must be possible by specifying a trip and the part of the trip where the offer is requried.

Serach for offers must be possible without specifying a trip to search for mutli journey passes of related non transport offers.

The serach for offers must provide offers including the price.

The availability of offers provided should be checked when they are provided. 

The availability of offers does not need to be garanteed before booking.

The offer must provide its internal dependencies for the selection of optional offer parts.

The offer must provide descriptions on its conditions to be used for display to the customer.

An overall offer presented to a retailer or a distributer bundles offers that
contain admissions, reservation and ancillaries.

An offer has an overall comfort class and an overall flexibility.

An offer has a minimal price. The minimal price is the price that does not
include optional reservations or ancillaries.

An offer is valid for a given time.

An offer can be pre-booked.

An offer should span at least one tripLeg of the trip and include all needed
services.

An offer should contain all offer parts, or fares, respectively per travel class and per flexibility/product code.

Per passenger there should be an offer part, or fare for different parts of the trip, e.g. legs. I.e., all offers generated are always proposed for the complete set of passengers.

Even if a trip provides partial first class support only, a first class offer is always provided.

If a part of a trip is free, a fare or offer part with price zero must be provided.

#### Requirements on Admission <a name="RequirementsonAdmission">

An admission provides the right to travel on a vehicle.

An admission has a price. In general, the price is calculated per passenger.

An admission offer is valid for a given time. An admission offer shows which
reductions has been applied.

An admission is linked to one or more passengers.

For the possible states of an admission, refer to the [state model](../state-models#bookingPart) for booking parts.

In general, there’s a one-to-one relationship between offer and product. Only
for some combinations of TGV and TER in France an offer must support referencing
two products. Additionally, an included reservation does not reference a
product.

An admission may be linked mandatorily or optionally to one or more reservations.

#### Requirements on Reservation <a name="RequirementsonReservation">

A reservation provides the right to sit or lay on dedicated place in a vehicle.

A reservation has a price.

A reservation can be **OPTIONAL, MANDATORY, INCLUDED** to an admission.

A reservation offer is valid for a given time. An admission offer shows which
reductions have been applied.

A reservation is linked to one or more passengers.

For the possible states of a reservation, refer to the [state model](../state-models#bookingPart) for booking parts.

A reservation has a one-to-one relationship to a product.

An integrated reservation shall be modelled as an admission with an included
reservation.

#### Requirements on Ancillary <a name="RequirementsonAncillary">

An ancillary is a service that can be offered to a customer. Examples for
ancillary services: Wifi access or on-board meal.

An ancillary has a price.

An ancillary can be **OPTIONAL, MANDATORY,INCLUDED** to an admission or
reservation.

An ancillary offer is valid for a given time.

An ancillary is linked to one or more passengers.

For the possible states of an ancillary, refer to 
the [state model](../state-models#bookingPart) for booking parts.

An ancillary has a one-to-one relationship to a product.

#### Requirements on Fees <a name="RequirementsonFees">

Fees of a distributor or a carrier can be required upon the sale of
reservations, admissions or ancillaries or collectively for a set of
reservations, or for a booking.

A fee has a value.

A fee applies to one or more offer parts, and to one or more passengers.

A fee is automatically added to a booking if the relevant offer parts are
included, e.g. a reservation fee is automatically added when any reservation has
been selected.

Whether a fee is refundable is defined by the tariff.

The state of a fee depends on the state of the associated product.

### Requirements on Prolonging an Offer <a name="RequirementsonProlonginganOffer">

_Optional requirement_

Especially for travel agency a common use case is to prolong the validity of an
offer, so that the customer has more time to decide. This process can also be
understood as putting an offer on hold.

If a supported by the underlying system it must be possible to request an on
hold offer to put an offer on hold for given time period.

If accepted a deposit will be charged from the requestor. Additionally, a fee
can be requested once the prolonged offer is actually booked.

### Requirements on Offer Combination <a name="RequirementsonOfferCombination">

Offers from different providers might have a restriction to be sold in
combination only.

The combination might not be be required by all offers. E.g. an offer from
provider A might only be sold if offer B of another provider is sold but offer B
can be sold stand alone.

The combination logic needs to be fast (<20ms).

### Requirements on Round Trips <a name="RequirementsonRoundTrips">

Round trip offers should be possible considering both trips when making the
offer.

Support for round trips consisting of one or two products need to be supported.

### Requirements on Booking <a name="RequirementsonBooking">

A booking consists of one or more selected offers and optionally reservations or optional
ancillaries.

It must be possible to search for bookings:

- Passenger first name, last name or passenger date
- Booking reference
- Fulfillment reference
- Travel date or end
- Origin or destination

To support stateless booking an explicit pre-booking step is _not_ supported by
design.

A booking has a purchaser which has booked the booking. The purchaser may, but does not have to
be a passenger.

Booking must be supported by all parties.

### Requirements on Products <a name="RequirementsonProducts">

A product must contain the following information:

- An id uniquely identifying the product, e.g. "Sparschiene".
- A textual description of the product.
- A structured description of the sales or after-sales conditions which are
  machine interpretable as well as a human readable.
- A indication whether a product is _refundable_, _refundable with conditions_
  or _not refundable_.
- A indication whether a product is _exchangeable_, _exchangeable with
  conditions_ or _not exchangeable_.
- The service class describing the level of comfort.
- Define the supported fulfillment media types.

A product does not have a price, as the price is bound to an offer as an
instantiation of a product.

### Requirements on Fulfillment <a name="RequirementsonFulfillment">

A fulfillment must be in a well-defined state and have a unique control number. The fulfillment must
reference the offer parts covered by the fulfillment.

For the possible states of a fulfillment, refer to the relevant state
models:
- [regular fulfillments](../state-models#fulfillment)
- [fulfillments with activation](../state-models#fulfillmentActivation)

A fulfillment must reference fulfillment documents (aka. tickets). Fulfillment
documents in form of a UIC PDF ticket most be supported by all parties. A
fulfillment is provided for a specific FulfillmentType (e.g. `CIT_PAPER`) and
FulfillmentMedia specifying the format (e.g. `RCT2`).

**In distributor mode only:** A fulfillment may reference fulfillment items such
as visual security elements, additional bar codes or control key.

### Requirements on Documents <a name="RequirementsonDocuments">

It must be possible to add and delete a document to a booking. Such a document
can be a booking receipt, a CO2 report, a explanatory documentation to a
complaint or any other general document.

A document can reference a booking or a passenger in a booking.

### Requirements on Refund <a name="RequirementsonRefund">

For a given a booking a refund can be requested.

A refund can have a fee.

Cancellation (a.k.a. revoke) is a special kind of refund where no fees apply,
and the complete amount is returned triggered by an overrule code.

Cancellation must be supported by all parties.

Total refund must be supported by all parties.

### Requirements on Partial Refund  <a name="RequirementsonPartialRefund">

Partial refund allows to remove passengers and booking parts (only if supported by the
underlying tarif) from a booking.

A partial refund can have a fee.

Partial refund may be supported by all parties.

### Requirements on Exchange <a name="RequirementsonExchange">

Exchange allows to change trip and passengers.

An exchange can have a fee.

Exchange may be supported by all parties.

### Requirements on Seat Change <a name="RequirementsonSeatChange">

_Optional requirement_

If supported by the underlying system, it must be possible to change of seat
after the booking is confirmed and fulfilled. This change can either be free or
for a fee when requested by the carrier.

The following scenarii exist:

1. Specific seat and coach requested: optionally, a seat map can be requested,
   so that the user knows which seat is available. The user can then select a
   specific coach and seat number.
2. Near to a given seat: The user provides in the request a seat number he
   wishes to be seated next to.
3. Seat preferences: The user provides seat arrangement such as window, aisle
   etc…

Some providers give the possibility to up-sell to a better seat after booking.
This is an adjacent but not equivalent case, as the change of seat should not
affect allocation or update the inventory.

### Requirement to Release Allocated Resources <a name="RequirementtoReleaseAllocatedResources">

_Optional requirement_

For some systems (e.g in the French or Swedish market) it must be possible to
allocated resources such as places, meal or others.

### Requirement to Cancel a Fulfillment <a name="RequirementtoCancelaFulfillment">

_Optional requirement_

For some systems (e.g. in the French) it must be possible to cancel a
fulfillment (_Void PNR_).

### Requirements on Complaints <a name="RequirementsonComplaints">

It must be possible to manage a complaint according to (EU) **2021/782**.

It must be possible that the claim is managed by a separate person on behalf of
the passenger.

It must be possible to retailers or distributors to submit a claim for a booking
or parts of it (e.g. in case of a return trip) where the service has not been
provided as promised. This includes:

- Delays of trains
  - In case the fare was not restricted to specific trains this also includes
    trains which were not mentioned in the trip of the booking
  - A description of the cause is needed delayed trains incl. the delay, missed
    connections, cancelled trains, …
  - Abandoned travel (e.g. in case of a return, subsequent trains, …)
- Service derogation (e.g. first class not available, …)

It must be possible to provide documentation to support the claim (e.g. scanned
manual remark of train staff) (Alternatively require exchange via **UIC
90918-4**).

It must be possible to demand that the claimed amount is issued as a voucher
or transferred to a bank account.

It must be possible to lookup the status of the claim made.

In case a claim is accepted or rejected the actor that made the request must be
informed. The accepted or rejected claim must provide an explanation for the
decision especially if the amount covers the ticket price only partially.

It must be possible to inform the distributor / fare provider that the payment
was made and the claim is settled.

It must be possible for a distributor to inform the fare provider that the claim
was accepted because the fare provider missed a legal timeline to handling the
claim.

### Requirements on Reimbursements <a name="RequirementsonReimbursements">

Customers who have bought a ticket which allows reimbursement and which have not
traveled or traveled partially only can claim to be reimbursed. The customer
must prove that he has not or only partially used the ticket.

A partial use might be a only a part of the trip was traveled or only some of
the travelers were traveling or a combination of both.

The non-use of a ticket may be proven by documents that were provided to the
customer/traveler on a train or at a station. This proof can also be provided in
electronic form by a carrier.

The customer must be able to make the claim via a retailer to the distributor
who needs to forward the request to the involved carriers.

## Functional Requirements of a Distributor <a name="FunctionalRequirementsofaDistributor">

The requirements covered by this specification are listed here with references
to the implementation. Changes in the requirements during the lifecycle of this
specification might lead to changes in the corresponding implementations.

### Requirements on regional validity <a name="Requirementsonregionalvalidity">

Users of the data:

- The distributor to link a journey from the timetable to the valid offers based
  on the fare data (automated)
- The passenger in a readable form to know which transport connections he can
  use (manual)
- A controller to validate the ticket on a train or station or station (manual
  and/or automated (e.g. gates))

Non-functional:

- The fares depend on the timetable. The station data are not part of the fare
  structure. Stations will always be referenced by the station code used in the
  timetable. Station codes used are those in the timetable according to EU
  TAP-TSI B.1.

Functional concepts:

#### Station <a name="Station">

A station which could be used in timetable data to embark and/or disembark
passengers.

#### Fare reference station set (virtual pricing point) <a name="Farereferencestationset(virtualpricingpoint)">

A fare reference station is a list of stations where the fare is valid with a
common name.

#### Route <a name="Route">

A route is defined as an ordered list of stations or “fare reference stations”
along a possible travel route. In the human readable form, the stations are
separated by “\*”.

A route can split into optional routes indicated in the human readable route by
“/”.

The end of a route of one carrier when combined to another route of another
carrier might be indicated with an additional text (e.g. FR or GR) in the human
readable form if it is not at a “real” station.

##### routes used as line routes or as bubble routes <a name="Areroutesusedaslineroutesorasbubbleroutes">

![Line- vs. Bubble Route interpretation](../../images/business-capabilities/line-vs-buble-route.png)

`A*B/D*C` as line routes: `A-E-C` is not allowed

`A*B/D*C` as bubble route: `A-E-C` is allowed


More than two alternative routes must be possible in the route description.

#### Areas <a name="Areas">

Areas for the regional validity are needed. The areas defined in IRS 90918-4
(control) and IRS 90918-9 (bar codes) will be available for the fares as well:

- Zones
- Countries
- Geographical polygons

Route for dynamic fares:

- Train bound ticket only

  - No route
  - List of train number, travel date and time, service brand (optional),
    from/to station

- Route based only

  - Route same as for non-yielded NRT
  - Optionally depending on service brand(s)

- Train bound (long distance) + route (regional)

  - Yield management can be on both parts combined, so the complete part must be
    requested online

- Train bound (carrier 1) + Train bound (carrier 2)

  - Train bound offer until the border point/connection point on both sides
  - Train bound can be combined into one

- Train bound (carrier 1) + route (carrier 2)
  - Train bound offer until the border point/connection point
  - Route description from the border point/connection point onwards

#### Connection Point <a name="ConnectionPoint">

Regions (routes) of different carriers can be connected at defined connection
points. The old concept of a central predefined list of points (as part of
TAP-TSI) is replaced by the concept of “connection points” which can be defined
by each carrier independently using the station codes.

ConnectionPoints provide information on the points where two fares of different
provides can be glued together.

As in principle every station can become a connection point (e.g. all stops from
Aachen to Brussels are connection points from DB to SNCB as the train is a DB
train also inside of Belgium).

![Connection point](../../images/business-capabilities/connection-point.png)

![Connection point](../../images/business-capabilities/connection-point-simple.png)

![Connection point](../../images/business-capabilities/connection-point-complex.png)

As on both sides of a connection multiple small stations could be connected and
not all of them might be in the timetable of a train the connection point should
allow to connect sets of stations.

### Requirements on Allowed Service <a name="RequirementsonAllowedService">

#### Allowed Services <a name="AllowedServices">

Open tickets - not linked to a train - might be valid for some carriers or
services on the route only.

As the offers should be created based on the timetable the allowed services in
an offer should be defined based on the service brand code in the timetable
data.

Carriers and service brands can be included or excluded.

#### Class of Service <a name="ClassofService">

List of classes allowed in the ticket. Railways use different notions and names
on service classes on their trains. A common type is needed to combine different
levels of service from different railways.

A marketing name is required for the class.

Service class is optional for transportables

- Bicycle
- Dog (might depend on the class of the ticket)
- Luggage (might depend on the class of the ticket)
- Oversize Luggage (might depend on the class of the ticket)

IRT fares don’t use classes but service levels (defined in IRS 90918-1) to cover
the more detailed products available via reservation.

In case NRT and Reservation needs to be combined, rules are needed which service
levels of the reservation are allowed in combination with a fare.

### Requirements on availability for purchase <a name="Requirementsonavailabilityforpurchase">

An offer is available a specific time range before the start of travel at the
first departure station in the time zone of the departure station.

An offer might become unavailable a specific time range before the start of
travel at the first departure station in the time zone of the departure station.

An offer might be available from a specific time onwards or in a time range or
time ranges (either in UTC or alternatively in the time zone of the ticket
vendor).

**SalesAvailability** defines the constraints on the time when a sale of a fare
can start or end. The sales availability is used in the offline data exchange
only. A constraint is provided as a list of salesRestrictions that have to be
applied.

Sales restrictions can define a start and end of the sale relative to the date
of sale or the date of travel.

A reference to a calendar can be provided to indicate all sales dates.

_Example:_

- Offer A is available from 3 months before departure until 2 days before
  departure and can be purchased in June and July on Thursdays only.

Real examples

- Available for purchase 180 to 3 days before departure day
- Available for purchase 01 JUN – 30 JUN for travels 01 JUL – 31 AUG for 30
  consecutive days of validity

  - purchase 01 JUN – 30 JUN
  - travels in 01 JUL – 31 AUG (validity for usage)
  - 30 days of validity (validity for usage)

- Available for purchase 180 to 0 days before departure day, valid for two
  consecutive days

The following rules can be defined (and combined):

- Sales start hours or days prior to the departure in the time zone of the
  departure station

- Sales ends minutes, hours or days prior to the departure in the time zone of
  the departure station

- Sales start hours or days prior to the start of validity in the time zone of
  the departure station

- Sales ends minutes, hours or days prior to the start of validity in the time
  zone of the departure station

- Sales ends minutes, hours after the start of validity in the time zone of the
  departure station

  - A specific range of days in UTC

- A specific range of days in the time zone of the sales location

### Requirements on validity for usage <a name="Requirementsonvalidityforusage">

The validity of usage defines the time when the passenger is allowed to use a
fare. To define this time there is a need to:

- Simple duration (number of days starting from the first day of validity 00:00
  in the time zone of the departure station until the number of days and hours
  later at a specified time in the time zone of the arrival station:

_Example:_

> Start of Validity: 1.1.2020 00:00 CET
>
> Validity data: 4 days 5 hours
>
> End of Validity: 5.1.2020 05:00 GMT
>
> Printed text on the ticket: 1.1.2020 – 4.1.2020

- Duration as number of days and hours + number of days of the journey according
  to the timetable

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
  - the number of nights in between the inbound and outbound part of a return
    ticket
  - a specific weekday in between the inbound and outbound part of a return
    ticket is not allowed

_Decision_: no return tickets on one “paper” but return fares should be
possible.

- Validity for passes

  - Indication that the ticket is a pass
  - Start and end of validity in UTC
  - Start and end date of validity in local dates (e.g. for passes that cover
    more than one time zone)
  - Number of allowed trips or days
  - The validity might depend on the time of Boarding or De-Boarding of a train.
    E.g. a pass might be valid on the train if the the passenger boards the
    train during the validity of the pass.

- Examples:
  - Valid Monday – Friday if work day from 09:00 until 03:00 the following day
  - Valid Saturday – Sunday and public holidays from 00:00 until 03:00 the
    following day

### Requirements on validity for passengers / transportables <a name="Requirementsonvalidityforpassengerstransportables">

Transportables can be different types of passengers, animals or other items
carried by a passenger.

- A passenger might have an upper and / or lower age limit.
- A passenger might have an additional age limit for traveling alone.
- There might be a limit on the number of accompanying passengers of one type a
  passenger of another type can accompany. (e.g. not more than 8 children with
  one adult)
- A passenger might have an additional age limit for being entitled for
  reservation.
- A number of passengers might be entitled to carry a number of passengers of
  another type for free (1 Adult + 1 accompanying person for PRM).

A fare might be available with a specific number of passengers only (group
fares):

The passenger weight of each passenger type needs to be considered.

### Requirements on validity for reductions <a name="Requirementsonvalidityforreductions">

Reductions are price reductions due to a reduction “card” an existing ticket or
a pass which the passenger already holds. It might be that the physical card
does not correspond to a specific reduction but provides the option to carry
different reductions.

Different prices due to the age of the passenger are separate fares, not
reductions to a fare.

- A card might be valid only for combined tickets only (special NS card)

- Multiple cards might apply to the same route tripLeg, but only one of them
  would be applied.

- A reduction might grant a 100% price reduction

  In this case an NRT is created up to the final station the customer goes with
  the price to the border of the area. The ticket indicates that the ticket has
  a reduction of 100% within the area and an indication that it is valid only
  together with the card. Pricing data are needed for the free travel area to
  get the route description.

### Requirements on prices <a name="Requirementsonprices">

Prices might be needed in more than one currency.

- Currency (local currency might be required additionally due to local
  legislation for two carriers in one country)
- Amount

Value Added Tax (VAT) details must be given to the customer to enable a business
customer to claim a refund. The VAT details include:

- Country
- VAT-Company-Id
- Percentage
- Amount

The VAT given is the VAT the carrier pays for this fare to the countries where
he is providing his service. The VAT might depend additionally on whether the
fare is issued as national ticket, international ticket or integrated in an
international ticket. Also, the VAT might depend on whether the fare is used for
short distance or integrated in a long-distance ticket.

**Note**: There are national rules on where and when to display the VAT on a
ticket or receipt when a ticket is sold in that country. These are not
considered here.

Possible Price formats are:

- Fixed prices attached to a route (and fare) including VAT details (country,
  percentage, amount, VAT id)
- Prices depending on an intermediate distance (“fare kilometer”)
- Price depending of other prices.

_Decision_: The price will be delivered also in case of reductions or
kilometers. No calculation is needed at the receiver side of the data.

### Requirements on the basic fare structure <a name="Requirementsonthebasicfarestructure">

The basic fare element links the constraints and the price.

A name of the fare needs to be provided.

### Requirements on the after sales conditions <a name="Requirementsontheaftersalesconditions">

After sales conditions define fees to be taken in case of an aftersales
transaction on behalf of a customer. The after sales transactions considered
are:

- Cancellation (Refund)
- Exchange with a new fare of the same carrier
- Exchange with a new fare of another carrier
- Exchange for the same travel day
- Upgrade

After sales transactions due to service violations of the carrier are governed
by PRR rules and are not considered here.

Some railways make refunds using other “means of payment” like bonus points,
vouchers. These are not considered here and thus will not apply to the fares
defined here.

Some railways apply different refund rules depending on the type of payment.
These restrictions will not be considered here. It is assumed that the refund
will be processed by the distributor who manages the combined fare. He needs to
consider payment restrictions in order to avoid fraud (e.g. no cash refund on
electronically payed tickets, no refund unless ticket control data have been
received, …).

The refund fee can be claimed by the carrier.

### Requirements on conditions on fulfillment <a name="Requirementsonconditionsonfulfillment">

The fulfillment defines the required types of creating a ticket for the
passenger and therefore especially the required types of security to be applied.

The fulfillment might be restricted depending on:

- Allowed types of fulfillment
- Accepted / required bar codes
- Required control data exchange
- Individual ticketing

The Required personal data might depend on the fulfillment:

- Required personal data to be provided from the distributor to the carrier
  depending on type of fulfillment

- Depending on border crossing and train types (Belgium border crossing of
  high-speed trains requires personal data)

- Data might be required for ticket holders only or for all passengers

Fares should provide the involved TCOs that need to have access to the ticket
data for control of fulfillments.

### Requirements on dynamic fares and train linked tickets <a name="Requirementsondynamicfaresandtrainlinkedtickets">

#### Indication of dynamic fares available online <a name="Indicationofdynamicfaresavailableonline">

The distributor needs to find where he can request offers online.

- Solution 1: add the carrier(s) providing offers in their systems to the trains
  in the timetable

- Solution 2: publish station or ODs (optionally also by country) and/or train
  types (service brands) and/or the carrier(s) mentioned in the timetable where
  fares can be requested

- Solution 3: publish for which carriers and service brands (and optionally
  trains) offers can be requested

_Decision_: The solution should be independent from the timetable.

#### Indication of train links on the ticket <a name="Indicationoftrainlinksontheticket">

Tickets may be linked to the use of specific trains even in the case there is no
seat reservation. There are different options on how to indicate this restriction:

- DB solution: The train information replaces the corresponding route part

- ÖBB solution: The route description is identical to the ticket without train
  link and the trains are added in the condition description

_Decision_: in case of a train bound ticket the route of the train should
replace the route description for the part of the train bound\*

Train link should include:

- Date and departure time
- Service Brand Abbreviation (e.g. RJ, ICE) (can be retrieved from timetable
  data)
- Train number
- Departure Station (short name)
- Arrival Station (short name)

#### Request for online fares <a name="Requestforonlinefares">

- The complete connection must be sent

  - To check whether it is international
  - To check that it is not inside some regional tariff area
  - To calculate the correct VAT
  - To check for supplements applicable only at the start or end of the journey

- The part where the offer should be built must be provided

  - the station/connection point from and to where the offer is needed

### Requirements on combining fares <a name="Requirementsoncombiningfares">

Multiple models are defined for combining fares. The carrier defines in the fare
data which model(s) the distributor can apply.

Combining the fares tries to achieve:

- Apply the conditions set by the carrier for the service he provides to secure
  the business model and financial interests of the carrier
- Create a simple combined fare for the customer

It is not possible to achieve both target at the same time. The different models
of combining fares implement different priorities given to these targets.

In general, the basic parameters defining the price must be listed separately on
the combined offer:

- route description / train link
- class of service
- passenger types

The combined price is always the sum of the prices of the parts. The distributor
might add a handling fee.

#### SEPARATE_CONTRACTS model <a name="SEPARATE_CONTRACTSmodel">

This is the model for not combining the fares in one ticket and not allowing the
integration in one contract. The rules applied for this ticket are exactly the
rules defined by the carrier in the fare data.

The distributor must ensure that it is clear for the customer that no common
contract was established.

##### Implementation Aspect <a name="ImplementationAspectSeparate">

Relevant attributes:

```js
-FareCombinationConstraintDef.combinationModels.model ==
  SEPARATE_CONTRACT -
    FareCombinationConstraintDef.combinationModels.allowedCommonContracts;
```

##### Business Rule <a name="BusinessRuleSeparate">

Let CC_A be the set of allowedCommonContracts for Fare A and let CC_B be the set
of allowedCommonContracts for Fare B.

**If** the intersection of two sets CC_A and CC_B is empty, **then** separate
contracts most be issued. Otherwise a combined contract can be issued.

#### CLUSTERING model <a name="CLUSTERINGmodel">

The `CLUSTERING` model tries to simplify conditions and fares for the customer
but sacrifices a part of the control of the carrier on its fares.

Similar types of fares are defined to belong to the same “cluster”. The after
sales conditions for a cluster are defined by the distributor. However, the
after sales conditions must respect basic rules on after sales for that cluster.

The clusters correspond to the flexibility a passenger receives to change the
booked train. This corresponds directly to the after sales conditions. Hereby
the fees to be paid for such an exchange are essential for the definition of
clusters and not the complexity of the process to change. Thus, a train bound
ticket and an open ticket belong to the same cluster in case the fees to change
to different trains / times are comparable.

The after sales fees can be demanded by the carrier.

The other conditions might either be listed per carrier or combined by rules.

The customer buying products from one distributor has a simple unique view on
after sales conditions. Optionally this might be restricted by a list of
carriers and/or distributors where this combination is allowed.

The validity for usage is combined to be:

> The minimal validity of all included fares but at least the time needed for
> the combined journey according to a timetable information.

The combined fare is available for sale only if all parts are available for
sale.

The following clusters are defined (with the order from high to low
flexibility): `BUSINESS` > `FULL-FLEX` > `SEMI-FLEX` > `NON-FLEX` > `PROMO`.

Any of the clusters can contain train-linked or non train-linked offers.

Offers of a less restrictive cluster can be included in a more restrictive
cluster using the more restrictive rules for the combined offer, e.g.,
`BUSINESS` + `FULL-FLEX` leads to `FULL-FLEX`.

`BUSINESS`:

- Refundable after the departure or last day of validity
- Exchangeable after the departure or last day of validity

`FULL-FLEX`:

- Refundable before the departure or last day of validity
- Exchangeable before the departure or last day of validity

`SEMI-FLEX`:

- Refundable with fee depending on conditions of the distributor
- Exchangeable with fee depending on conditions of the distributor
- Minimum validity applies

`NON-FLEX`:

- Non refundable
- Non exchangeable
- Minimum validity applies

`PROMO`:

- Non refundable
- Non exchangeable
- Minimum validity applies
- Restricted combination with other cluster offers

##### Implementation Aspect <a name="ImplementationAspectCluster">

Relevant attributes:

```js
-FareCombinationConstraintDef.combinationModels.model ==
  CLUSTERING -
    FareCombinationConstraintDef.combinationModels.combinableCarriers -
    FareCombinationConstraintDef.combinationModels.referencedCluster -
    FareCombinationConstraintDef.combinationModels.allowedDistributors;
```

##### Business Rule <a name="BusinessRuleCluster">

Let A, B be fares.

**If** A.referenceCluster is element of B.allowedClusters AND if the fare
provider of fare B is in A.combinableCarriers AND if the fare provider of fare A
is in B.combinableCarriers **then** the fare A and B are combinable according to
the CLUSTERING MODEL.

#### COMBINATION model <a name="COMBINATIONmodel">

The `COMBINING` model tries to be close to the fare conditions defined by the
carrier but sacrifices the simplicity of the fare towards the customer.

The after sales conditions of the different fares will be combined into one
condition to best reflect the conditions of all included carriers.

The after sales conditions will thus depend on the combinations of carriers.

Optionally this might be restricted by a list of carriers where this combination
is allowed.

The combination model tries to apply all rules of the involved carriers but
sacrifices simplicity of rules.

The validity is combined to be:

> The minimal validity of all included fares but at least the time needed for
> the combined journey according to a timetable information.

The combined fare is available for sale only if all parts are available for
sale.

The after sales fees are combined accordingly:

> At any time, the fees defined by the carriers are applied on the price part of
> these carriers only. The result is a list of times with increasing fees.

Example

- Fare 1: 10% 20 days before departure, price: 100€
- Fare 2: 90% 2 days before departure, price: 200 €
- Result: 10€ fee 20 days before departure

10€ + 180€ = 190€ fee 2 days before departure

#### Implementation Aspect <a name="ImplementationAspectCombination">

Relevant attributes:

```js
-FareCombinationConstraintDef.combinationModels.model ==
  COMBINING -
    FareCombinationConstraintDef.combinationModels.combinableCarriers -
    AfterSalesCondition.afterSalesRules.fee -
    AfterSalesCondition.afterSalesRules.applicationTime;
```

### Requirements on Reservation <a name="RequirementsonReservationDist">

It should be possible to book reservations within the same technology.

The existing reservation services in IRS 90918-1 should also be supported.

### Requirements on Trip Interruptions <a name="RequirementsonTripInterruptions">

Restrictions oon allowed trip interruptions must be indicated in a fare.

Restrictions on interruptions can specify the maximal number of interruptions
and the maximal duration of interruptions.

The fare must provide information whether the interruption has to be confirmed
by staff of by deactivation of the electronic ticket.

### Requirements on Multi-Journeys Tickets <a name="RequirementsonMultiJourneysTickets">

The restrictions on the use of a multi-journey ticket for individual trips must
be described in the fare.

Restrictions can specify the number of das, trips or time units to be used.

The process to use an individual trip with a multi journey ticket must be
indicated. These  
include separate fulfillments per individual trips or activation for a trip.

### Requirements on Fare Exchange <a name="RequirementsonFareExchange">

In principle prices for customers are created by addition of prices per fare
provider. Nevertheless, bi-multilateral agreements may include other
regulations.

Conversion from Euro into a national currency (if necessary, vice versa) is
subject to national distribution systems of the carrier/distributor concerned.

## Architectural Requirements <a name="ArchitecturalRequirements">

### Requirements on aligned processes end to end <a name="Requirementsonalignedprocessesendtoend">

The processes must be are aligned over all actors to reduce overall complexity
and thus costs.

### Requirements on aligned services <a name="Requirementsonalignedservices">

The services must be aligned such that there is a close mapping to the processes
supported by the services.

The services must be aligned such that the call chain between the services does
not involve unnecessary mappings between different actors.

### Requirements on messages <a name="Requirementsonmessages">

The messages of the online services must contain no unnecessary attributes or
data structures. Unnecessary attributes are attributes that are not needed for
the online processes.

### Requirements on extendibility <a name="Requirementsonextendibility">

The specification must be extendible in various dimensions:

- Support of new products on the fare as well as on the offer level
- Support of new processes, e.g. product-based distribution
- Support of new modes of transportation, e.g. scooters or rail

### Requirements on security <a name="Requirementsonsecurity">

The specification must include the protocols to ensure secure authentication and
data transfer.

## Legal Requirements <a name="LegalRequirements">

The flowing legal regulations provide requirements that affect the solution:

### Rail PRR Regulation (EC) 1371/2007 on Rail Passengers’ Rights and Obligations <a name="RailPRRRegulation(EC)13712007onRailPassengers’RightsandObligations">

This regulation must be fulfilled.

### GDPR: Regulation (EU) 2016/679 on data protection <a name="GDPRRegulation(EU)2016679ondataprotection">

- The passenger must be informed on the use of his data and on passing his data
  to the carrier and TCO
- The passenger must be informed which data are stored including data passed to
  the carrier and TCO
- The passenger has the right to ask to delete the data in case the data are not
  required to fulfil the contract of carriage
- The passenger has the right to ask for data correction in case the data are
  wrong
- Legal basis for processing of personal data with a view of black listing

  Although the exchange of blacklists is not in the scope of the specification
  the data exchanged can be used by the distributor for a local blacklist. He
  has therefore to obey the regulations when using the data.

  Two processing actions (automated profiling) are concerned:

  1. Collection and analysis of personal data on regular basis for trigger
     points: consent of passengers or legitimate interests of the rail carrier
     is needed

  2. Storage of information in the blacklists: legitimate interest of the rail
     carrier is needed

- General black list for use by multiple companies is allowed

  1. No access to the full list is provided
  2. No automatic checking in all cases

- Pre-cautions to be pursued by the railway undertaking

  1. Ensure right of access and objection
  2. Information preceding such processing and notification of inclusion into
     the blacklist
  3. Safeguards to prevent confusion
  4. Additional organizational and technical safeguards for processing

#### Art. 101§1 TFEU (Competition Law) <a name="Art.101§1TFEU(CompetitionLaw)">

All agreements between undertakings, decisions by associations of undertakings
and concerted practices which are restrictive of competition are prohibited and
void

Sensitive activities are:

- Information sharing
- Joint purchasing/selling
- Technical standards
- Standard terms and conditions

The following guidelines apply:

- Technical specifications for data formats should be ok

- Technical specifications for data exchange scenarios should be ok, but
  excessive error handling scenarios should be optional and agreed bilaterally
  as unnecessarily high requirements would be a restriction for small companies

- Service Level Requirements should be minimal requirements as unnecessarily
  high requirements would be a restriction for small companies, higher service
  levels must be agreed bilaterally

- Information exchange is allowed between the carriers within one contract of
  carriage as they are all involved in the contract. This does not apply in case
  of separate contracts.

## Requirements not in Scope <a name="RequirementsnotinScope">

- Payment procedures including payment procedures via private currencies alike
  bonus points

  Information whether such payments are allowed can be included in the fare
  data, but the required service to handle such payments are not specified here.

- Validation of customer cards

- Combination with flight


