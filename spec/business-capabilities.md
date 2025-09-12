---
layout: page
title: Business Capabilities
hide_hero: true
permalink: /spec/business-capabilities/
---

## Table of contents

1. [Actor Model and Business Use Cases](#ActorModelandBusinessUseCases)
   1. [Actors in OSDM](#ActorsinOSDM)
2. [Common Business Capabilities](#CommonBusinessCapabilities)
   1. [Powerful Fare Combination](#PowerfulFareCombination)
   2. [Simple Sales](#SimpleSales)
3. [Business Capabilities for Retailers](#BusinessCapabilitiesforRetailers)
   1. [Lookup Location](#LookupLocation)
   2. [Search Trips](#SearchTrips)
   3. [Find Offers](#FindOffers)
   4. [Offer combination](#Offercombination)
   5. [Pre-book Offers](#PrebookOffers)
   6. [Book pre-booked Booking](#BookprebookedBooking)
   7. [Fulfill Booking](#FulfillBooking)
   8. [Get Booking](#GetBookingRetail)
   9. [Refund Booking](#RefundBookingRetail)
   10. [Exchange Booking](#ExchangeBooking)
   11. [Graphical Seat Reservation](#GraphicalSeatReservation)
   12. [Edit Passenger Information](#EditPassengerInformation)
   13. [Retrieve Product Information](#RetrieveProductInformation)
   14. [Retrieve Stored Personal Data](#RetrieveStoredPersonalData)
   15. [Manage complaints](#ManagecomplaintsRetail)
   16. [Provide Masterdata](#ProvideMasterdata)
      1. [Reduction Card Definitions](#ReductionCardDefinitions)
4. [Business Capabilities for Fare Allocation](#BusinessCapabilitiesforFareAllocation)
   1. [Combine Fares](#CombineFares)
   2. [Service Resource Location  (Locate Dynamic Fares)](#ServiceResourceLocation(LocateDynamicFares))
   3. [Provide Bulk Fare Data](#ProvideBulkFareData)
   4. [Provide Dynamic Fare](#ProvideDynamicFare)
   5. [Book Offer](#BookOffer)
   6. [Fulfillment](#Fulfillment)
   7. [Reservation](#Reservation)
      1. [Option/Step 1: Using old messages for reservation](#OptionStep1Usingoldmessagesforreservation)
      2. [Option/Step 2: Using REST services for all services](#OptionStep2UsingRESTservicesforallservices)
   8. [Get Booking](#GetBookingFare)
   9. [Refund Booking](#RefundBookingFare)
   10. [Exchange booking](#Exchangebooking)
   11. [Accounting](#Accounting)
      1. [direct accounting](#directaccounting)
   12. [Graphical seat reservation](#Graphicalseatreservation)
   13. [Passenger information](#Passengerinformation)
   14. [Retrieve stored personal data](#Retrievestoredpersonaldata)
   15. [Manage complaints](#ManagecomplaintsFare)
   16. [Manage reimbourcements](#Managereimbourcements)


## Actor Model and Business Use Cases <a name="ActorModelandBusinessUseCases">

Actors are defined according to the UML specification. An Actor models a type of role played by an entity that interacts with the subject (e.g., by exchanging signals and data), but which is external to the subject.

Actors may represent roles played by human users, external hardware, or other subjects.

Note that **an actor does not necessarily represent a specific entity but merely a facet (e.g., “role”) of some entity** that is relevant to the specification of its associated use cases. Thus, a single instance may play the role of several different actors and, conversely, a given actor may be played by multiple different instances.

The following diagram shows the actors and principal use cases involved in rail distribution and control. The principal use case relevant for this specification is marked in yellow.

![Actor Model](../../images/business-capabilities/business-use-cases.png)

### Actors in OSDM <a name="ActorsinOSDM">

| **Actor**   | **Description** | Motivation / Distinction to other roles |
|-------------|-----------------|-----------------------------------------|
| Distributor | The **distributor** manages the lifecycle of a product sold (the travel contract). He therefore needs to establish information exchange with the **retailer**, **carriers** and **TCOs** involved. The **distributor** makes products available to the **retailer**. The distributor could provide direct services to the **passenger** to modify the ticket status (e.g. activate / check in on a ticket). The distributor combines fares defined by the carriers according to their rules.The distributor creates the ticket fulfillment data (e.g. pdf, pkpass, ...). The distributor is introduced to separate the role of just selling tickets along a route (retailer) from the role of creating the ticket content and providing it to retailers for sale.
| Carrier     | The **carrier** provides the transport service to the **traveller himself or via a substitute carrier**. The travel contract provided to the customer establishes a contract between the traveller and each carrier participating in the service. Carriers include Railway undertaking, Bus companies, Maritime companies. Unless some intermeta fare provider organizes the fare the carrier is the owner of the fare.|
| Customer    | The **customer** purchases a travel contract for one or more traveller. *Note*: **The customer** is entitled to receive refund payments. | 
| Retailer    | The **retailer** is the company selling the ticket provided and managed by the distributor to the customer. | 
| Fare Provider | The **fare provider** manages fares on behalf of a carrier or a local transport authority. | 
| Local Transport Authority | The **local transport authority** organizes the local traffic within an area a behalf of the government or is itself a governmental organization. It defines a fare structure for the local transport which all carriers included must apply.
| Passenger   | The **passenger** is the person who travels using a travel contract. | The passenger and the customer can be to distinct person, e.g., if a mom buys a ticket for her daughter.
| Ticket Controller | Person (train staff) or machine (e.g. gates) responsible for controling the ticket. The ticket controler is always part of a **ticket controlling organization** (**TCO**) acting on behalf ot the carrier. | 

## Common Business Capabilities <a name="CommonBusinessCapabilities">

### Powerful Fare Combination <a name="PowerfulFareCombination">

It must be possible to combine fare according to existing fare
combinations (e.g. NRT) as well as new fare combination
models.

### Simple Sales <a name="SimpleSales">

It must be easily possible to sell existing and new products.
Easily possible means two things: Firstly, for a customer it must be
easily possible to find and book and – if needed – refund a booking.
Secondly, for the rail sector as a whole the complexity of distribution
must be reduced to save costs both for development as well as
distribution.

## Business Capabilities for Retailers <a name="BusinessCapabilitiesforRetailers">

### Lookup Location <a name="LookupLocation">

In order to uniquely identify a place of origin and destination a
service to look up the unique code is needed. For railway stations this
code is the UIC station code.

### Search Trips <a name="SearchTrips">

A service to lookup possible trips from origin to destination is needed,
especially as the most attractive offers are bound to trip.

### Find Offers <a name="FindOffers">

For a given trip possible offers spanning the complete trip need to be
calculated to the customer. An offer has an overall flexibility, an
overall comfort class and a minimal price. An offer consists of
admissions, reservations or ancillaries. Reservations or ancillaries can
be included, optional or mandatory.

The overall offer should be “homogenous”, i.e. consisting of offers of
the same service class if possible. For the Italian market, non-homogenous offers
need to be supported. Some trains of the trip might not support all service classes.

Searching for non-trip based offers is supported by the same service. Search criteria can 
be tags, regions, geo-coordiantes.

### Offer combination <a name="Offercombination">

Offers can provide tags to indicate that some products from a provider can be sold only when in conjunction 
with product(s) from another provider using the same tag. At least one, not all, combinationTags must be in 
common to allow combination. No combinationTags indicate that there are no combination constraints on the product. 
The comination might be mandatory or optional.

The combination tags must be unique across all partners involved on a given trip.

If offers have no combination restrictions they can be combined freely.
However if business rule require, it must be to express combination constraints to
secure the tariff validity.

### Pre-book Offers <a name="PrebookOffers">

If a customer puts an offer into a basket on a retail channel, it
most be possible to retain this offer for a given time using a prebook
service. In our design this service creates a booking in the created in
the status “pre-booked”. If the pre-booked booking is not booked after a
given time limit it well be freed which also includes freeing all
eventual reservations on inventories.

### Book pre-booked Booking <a name="BookprebookedBooking">

After the booking has been paid by the customer, he or she owns the
booking and the booking is changed to “booked” by a booking service.

### Fulfill Booking <a name="FulfillBooking">

After the booking process the customer needs a set of documents to
travel and to prove to a ticket control organization that he or she is
eligible to travel. Therefore, a service to fulfill a booking in given
form, e.g. a ticket is needed. Internally, the state of the booking is
changed to “fulfilled”.

Multiple formats and media are supported including pdf, pkpass. Parts to be included 
in a fulfillment (visual security elements, separate bar code) can be used as well in case of fares.

### Get Booking <a name="GetBookingRetail">

To get the booking of a customer a service is needed. Specially care
needs to be taken into account that privacy regulations are respected.

### Refund Booking <a name="RefundBookingRetail">

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

### Exchange Booking <a name="ExchangeBooking">

If a customer wants to exchange a booking a service to exchange is
needed. Conceptually it takes the existing booking and a new trip and
calculates an exchange-offer. This exchange-offer can be booked and
fulfilled similarly to refund-offer.


### Graphical Seat Reservation <a name="GraphicalSeatReservation">

In order to display the layout of a train to a customer a service to
access coach layout data and availability pf places is needed.


### Edit Passenger Information <a name="EditPassengerInformation">

To add or in special cases edit passenger information a service is
provided. This service is explicitly designed to be fully complaint to
GDPR regulation.

### Retrieve Product Information <a name="RetrieveProductInformation">

A service to access the attributes of a product such as detailed sales
and after-sales is optional. Product information is part of the offer or
booking and is included there by default.

### Retrieve Stored Personal Data <a name="RetrieveStoredPersonalData">

A customer can request information on the stored personal data. This
includes also information on personal data passed on to distributors. The
booking data can be used to show the stored personal data.

There is no specific service to retrieve the stored personal data. The booking can be retrieved 
to get the passenger references and then the passengers can be retireved.
This will provide all stored personal data.

### Manage complaints <a name="ManagecomplaintsRetail">

Complaints can be created on behalf of the passenger by Retailers. The distributor can request 
additional documents to proof the complaint. The passenger can add documents to prove the claim and 
change his data (e.g. bank account). The Retailer is informed on changes on the claim.


### Provide Masterdata <a name="ProvideMasterdata">

#### Reduction Card Definitions <a name="ReductionCardDefinitions">

The Definitions of reduction cards are provided as Master Data. 
The reduction card definitions can be used by the Retailers for selection 
lists in the sales process or in customer accounts.


## Business Capabilities for Fare Allocation <a name="BusinessCapabilitiesforFareAllocation">

### Combine Fares <a name="CombineFares">

The distributor combines fares from different carriers into one offer. The
rules on how to combine fares are part of the fare data.

### Service Resource Location  (Locate Dynamic Fares) <a name="ServiceResourceLocation(LocateDynamicFares)">

Dynamic fares must be requested online. The distributor needs to find the
online resource where to request the offer and book. The fare data
provide information on how to find the online service.

### Provide Bulk Fare Data <a name="ProvideBulkFareData">

The carrier provides bulk data on his static fares and additional data
for locating online services to the distributors.

### Provide Dynamic Fare <a name="ProvideDynamicFare">

The carrier provides an online service to retrieve dynamic fares.

### Book Offer <a name="BookOffer">

The carrier provides online services to book fares and cancel or
exchange fares. 

### Fulfillment <a name="Fulfillment">

All necessary information for an distributor to build a valid a ticket
including necessary attributes and control elements most be included by
the provider of the fare.

### Reservation <a name="Reservation">

Reservation has been included in the online services and the inventory
resolution data for fare or reservation are included in the bulk data
(see FareResourceLocation).

#### Option/Step 1: Using old messages for reservation <a name="OptionStep1Usingoldmessagesforreservation">

1. offer (REST service) à parameters for 90918-1 soap services are delivered
2. reservation as-if (old soap service) / graphical place display (old soap service)
3. reservation (old soap service) / specific place reservation (old soap service)
4. pre-booking NRT (REST service)
5. confirm booking NRT (REST service)

#### Option/Step 2: Using REST services for all services <a name="OptionStep2UsingRESTservicesforallservices">

1. offer (REST service)
2. checkPreferences (REST service) / graphical place display (REST service)
3. pre-booking NRT / reservation (REST service)
4. confirm booking of reservation / NRT (REST service)

### Get Booking <a name="GetBookingFare">

To get the booking of a customer a service is needed. Specially care
needs to be taken into account that privacy regulations are respected.

### Refund Booking <a name="RefundBookingFare">

If a customer wants to refund a booking a service to refund a booking is
needed. The service calculates a refund offer including fees and amount
returned which is offered to the customer. If he or she accepts the
refund offer the refund offer can be booked. Special refund reasons need
to exist, which affect fees and amount returned. Especially, if an agent
or a machine makes a mistake a refund reason is needed to refund a
booking with no penalties.

By design, the refund process is modelled similarly to the offer/booking
process.

### Exchange booking <a name="Exchangebooking">

If a customer wants to exchange a booking a service to exchange is
needed. Conceptually it takes the existing booking and a new trip and
calculates an exchange-offer. This exchange-offer can be booked and
fulfilled similarly to refund-offer.


### Accounting <a name="Accounting">

The specification of the accounting data is not part of this document,
however some on the fare content defined in this specification must be
included in the accounting data.

The accounting data of a booking should include:

- The identification of the entire ticket sold (unique id within the
  context of the distributor for at least 2 years)

- The booking id provided by the carriers in case of online fares (unique
  id within the context of the carrier for at least 2 years)

- The identification of each fare included in the ticket (unique id e.g. UUID)

- The identification of individual tickets of the distributor (unique id within
  the context of the distributor for at least 2 years)

- The identification of individual tickets of the carriers (unique id within
  the context of the carrier for at least 2 years)

- The price for each fare and carrier included in the ticket

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

The distributor is responsible for the accounting. The data structure for
NRT is used.

- In case of fares (IRT or NRT) used with an online booking service:

The carrier is responsible for the accounting. The data structure for
IRT is used.

- In case of fares (IRT or NRT) used with an online booking service
  but with carrier fees defined by the distributor:

The carrier is responsible for the accounting. The data structure for
IRT is used. The distributor will inform the carrier on the applied fees
in the cancellation confirmation.

#### direct accounting <a name="directaccounting">

In some cases the accounting is not done by the provider of the OSDM API itself but is done 
from the provider of a train service booked via OSDM. The service provider that creates the accounting 
will most likely not use the OSDM booking part ids in the accounting data. To provide the link between the OSDM booking parts, fees 
and refunds the accountingRef Object must be used in the OSDM api to provide the ids that will be used in the accounting data exchange.


Example:

Retailer A books a train service from the OSDM API of distributor B where the train is provided by Carrier C and Carrier C manages the accounting with A itself.
The accounting data send from C to A as billing will contain the accounting IDs that have been provided in the OSDM api as accounting reference.





### Graphical seat reservation <a name="Graphicalseatreservation">

In order to display the layout of a train to a customer a service to
access coach layout data and availability of places is needed.


### Passenger information <a name="Passengerinformation">

Passenger names are supported with an element for fits names and an element for last names. As 
an additional option it is possibe to provide a first and a last familiy name additionally. This is used to 
cover lewgal requirements in some spanish speaking countries where both family names might be required separately. 

To add or in special cases edit passenger information a service is
provided. This service is explicitly designed to be fully complaint to
GDPR regulation.

### Retrieve stored personal data <a name="Retrievestoredpersonaldata">

There is no specific service to retrieve stored personal data. The booking can be retrieved 
to get the passenger references and then the passengers can be retireved.
This will provide all stored personal data.

### Manage complaints <a name="ManagecomplaintsFare">

Complaints can be created on behalf of the passenger by the reteiler. The distributor and the carrier 
can request additional documents to proof the complaint. The passenger can add documents to 
prove the claim and change his data (e.g. bank account). The distributor can decide on a claim 
himself in case the carrier has not kept the legal time line.

### Manage reimbourcements <a name="Managereimbourcements">

Reimbourcements can be requested by the retailer to the distributor in case 
the fare allows the reimbourcement of unused tickets. The distributor can forward the request to fare providers.






