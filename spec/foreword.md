# Open Sales and Distribution Model OSDM

## Table of contents

   1. [International Railway Solution to be classified in volumes of UIC 9](#InternationalRailwaySolutiontobeclassifiedinvolumesofUIC9)
   2. [Application](#Application)
   3. [Record of Updates](#RecordofUpdates)
   4. [Licensing](#Licensing)
1. [The International Railway Solutions](#TheInternationalRailwaySolutions)
2. [Current Situation](#CurrentSituation)
   1. [Offline Distribution](#OfflineDistribution)
   2. [Online Distribution](#OnlineDistribution)
3. [Objectives](#Objectives)
   1. [Objectives for Offline Distribution](#ObjectivesforOfflineDistribution)
   2. [Objectives for Online Distribution](#ObjectivesforOnlineDistribution)
4. [Summary](#Summary)
5. [Normative References](#NormativeReferences)
   1. [UIC Leaflets](#UICLeaflets)
      1. [International Union of Railway (UIC)](#InternationalUnionofRailway(UIC))
   2. [International Rail Standards](#InternationalRailStandards)
      1. [International Union of Railway (UIC)](#InternationalUnionofRailway(UIC))
      2. [CIT Manual for International Rail Tickets (MIRT)\*\*](#CITManualforInternationalRailTickets(MIRT)\*\*)
      3. [CIT Guidelines on Protection of Privacy and Processing of Personal Data used in International Passenger Traffic by Rail (GDP CIT)](#CITGuidelinesonProtectionofPrivacyandProcessingofPersonalDatausedinInternationalPassengerTrafficbyRail(GDPCIT))
      4. [International Union of Railway (UIC)/PSS](#InternationalUnionofRailway(UIC)PSS)
   3. [International Standards](#InternationalStandards)
      1. [International Organization for Standardization (ISO)\*\*](#InternationalOrganizationforStandardization(ISO)\*\*)
      2. [European Union Agency for Railways (ERA)](#EuropeanUnionAgencyforRailways(ERA))
      3. [European Union (EU)](#EuropeanUnion(EU))
      4. [International Civil Aviation Organization (ICAO)](#InternationalCivilAviationOrganization(ICAO))
6. [Terms and Definitions](#TermsandDefinitions)
7. [Acronyms](#Acronyms)


_This IRS is to be published only in English_

### International Railway Solution to be classified in volumes of UIC 9 <a name="InternationalRailwaySolutiontobeclassifiedinvolumesofUIC9">

- Information, Technology, Miscellaneous

### Application <a name="Application">

With effect from 1st April 2020

All members of the International Union of Railways

### Record of Updates <a name="RecordofUpdates">

- **2020 March** Version 1.0 Fares only released
- **2020 December** Version 1.0 OSDM released
- **2021 February** Version 1.1 OSDM released
- **2021 June** Version 1.2 OSDM released
- **2021 October** Version 1.3 OSDM released
- **2021 February** Version 1.4 OSDM released
- **2022 October** Version 2.0 OSDM released
- **2023 February** Version 3.0 OSDM released
- **2023 November** Version 3.1 OSDM released
- **2024 February** Version 3.2 OSDM released

### Licensing <a name="Licensing">

**Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at**

**[Apache License V2.0](http://www.apache.org/licenses/LICENSE-2.0)**

**Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
for the specific language governing permissions and limitations under the
License.**

Printed by the International Union of Railways (UIC)

## The International Railway Solutions <a name="TheInternationalRailwaySolutions">

The International Railway Solutions (IRS) are structured in a General Part and
in some eventual Application Parts.

The General Part is valid worldwide, while the Application Parts are valid for a
specific railway application, based on a geographical or on a service
implementation.

The eventual Application Parts may thus be added according to the current needs
of the Railway Community.

Structure of the International Railway Solution:

- **IRS 90918-10: Open Sales and Distribution Model OSDM**

Within the UIC context this IRS relates to sales and distribution of tickets for
services in Europe and those linked with Europe.

**GENERAL PART**

# Foreword

## Current Situation <a name="CurrentSituation">

### Offline Distribution <a name="OfflineDistribution">

The first main goal of this specification is to addresses the difficulties in
the fare data exchange and sales with the current data exchange formats
specified in UIC leaflet 108.1 and 2. Some of the difficulties are:

- Missing access to yield managed fares
- Current data exchange is partially non-structured (word, excel, text, ...)
- Fare data are not in line with timetable data (different station codes)
- Missing solution in case of two carriers on the same line
- Data exchange possible only once a year
- Mapping of fares to passengers is difficult

### Online Distribution <a name="OnlineDistribution">

The second main goal of this specification is to address the lack of a unified
interface for distribution of admissions (i.e., tickets), reservations,
integrated reservation and ancillaries. Currently within the rail sector there
exists a variety of very complex and incompatible interfaces to distribute rail
services within Europe and beyond. Thus, international distributions demands
major investments and produces high operating costs.

Furthermore, for a customer the booking of a rail ticket is unnecessarily
complicated. This fact weakens rail as a convenient and ecological means of
transportation.

## Objectives <a name="Objectives">

The main objectives guiding this specification are:

### Objectives for Offline Distribution <a name="ObjectivesforOfflineDistribution">

- Create a new tariff model to enable the NRT-carriers/operators to offer
  customer-friendly and competitive prices for international travel, preferably
  based on timetables.

- Enable the allocating distributor to offer through-tickets based on different
  conditions-ranges (e.g. fully flexible, semi flexible, non-flex, others).

- The portfolio to be offered to the customer shall be set at the decision of
  the issuing undertaking.

- Focus on easy possibly online-solutions to be implemented within the next two
  years taking into account upcoming requirements, i.e. new RICS-codes etc.

- The reservation should be fully integrated in the new technology.

### Objectives for Online Distribution <a name="ObjectivesforOnlineDistribution">

- To provide a convenient way for a customer to book an international train
  service, including refund and exchange processes.

- To define unified process steps for offering, booking, fulfillment and after
  sale.

- To define unified messages that are support the distributor, the distributor
  as well as the fare provider role.

- To provide a specification that can be supported by existing or upcoming
  systems without major investments to secure existing investments.

- To reduce unnecessary message conversions between callers as they provide no
  business value.

## Summary <a name="Summary">

The specification covers two aspects:

- Data exchange and sales services for rail products either to provide fare
  details to combine fares into offers and to provide entire offers for tickets
  as well. It defines the data structures to define the fares in detail and the
  combination rules for fares.

The specification covers static fares that can be exchanged as bulk data as well
as dynamic fares and offers that need to be requested and booked online.
Reservation of places is included to have a harmonized solution for the complete
sales service.

A migration is supported by additional data items to cover conversion into the
existing data formats 108.1 and to support existing reservation service IRS
90918-1 and accounting data formats IRS 30301.

- A set of services and unified messages to distribute rail content involving
  all parties in the distribution process.

We started with the customer experience and worked backwards to define the sales
and distributions processes supported by OSDM. This resulted in a booking
process modelled by the following steps:

1. Searching for trips
2. Getting offers
3. Booking an offer
4. Confirmation of the booking
5. Fulfillment of the booking

Analogously, the after-sale process is modelled in the following steps:

1. Getting a refund/exchange offers
2. Booking a refund/exchange offer
3. Fulfillment of the booking

By involving the experts of the parties (distributors, railways and legal
experts), we are confident that the OSDM online standard is powerful enough to
support the distribution of existing or upcoming commercial products and can be
implemented and supported at reasonable cost.

## Normative References <a name="NormativeReferences">

### UIC Leaflets <a name="UICLeaflets">

#### International Union of Railway (UIC) <a name="InternationalUnionofRailway(UIC)">

- _UIC Leaflet 920-1: Standard numerical coding for railway undertakings,
  infrastructure managers and other companies involved in rail-transport chains_
- _UIC Leaflet 920-2: Standard numerical coding of locations_
- _UIC Leaflet 920-14: Standard numerical country coding for use in railway
  traffic_

### International Rail Standards <a name="InternationalRailStandards">

#### International Union of Railway (UIC) <a name="InternationalUnionofRailway(UIC)">

- _IRS 30301: Accountancy regulations for international "Passenger" traffic_
- _IRS 90918-0: Electronic seat/berth reservation and electronic production of
  travel documents_
- _IRS 90918-1: Electronic reservation of seats/berths and electronic production
  of travel documents - Exchange of messages_
- _IRS 90918-4: e-Ticket Exchange for Control_
- _IRS 90918-9: Digital Security Elements for Rail Passenger Ticketing_

#### CIT Manual for International Rail Tickets (MIRT)\*\* <a name="CITManualforInternationalRailTickets(MIRT)\*\*">

#### CIT Guidelines on Protection of Privacy and Processing of Personal Data used in International Passenger Traffic by Rail (GDP CIT) <a name="CITGuidelinesonProtectionofPrivacyandProcessingofPersonalDatausedinInternationalPassengerTrafficbyRail(GDPCIT)">

#### International Union of Railway (UIC)/PSS <a name="InternationalUnionofRailway(UIC)PSS">

- _Implementation guide reservation systems_

### International Standards <a name="InternationalStandards">

#### International Organization for Standardization (ISO)\*\* <a name="InternationalOrganizationforStandardization(ISO)\*\*">

- _ISO 3166:2006: Codes for the representation of names of countries and their
  subdivisions,_ 2006
- _ISO 4217:2001: Codes for the representation of currencies and funds,_ 08-2001

#### European Union Agency for Railways (ERA) <a name="EuropeanUnionAgencyforRailways(ERA)">

- _ERA TAP TSI Technical Document B.6: Electronic seat/berth reservation and
  electronic_
- _production of transport documents - Transport documents (RCT2 Standard)_
- _ERA TAP TSI Technical Document B.7: International Rail Ticket for Home
  Printing_
- _ERA TAP TSI Technical Document B.8: Standard numerical coding for railway
  undertakings, infrastructure managers and other companies involved in
  rail-transport chains_
- _ERA TAP TSI Technical Document B.9: Standard numerical coding of locations_

#### European Union (EU) <a name="EuropeanUnion(EU)">

- _Regulation (EU) 2016/679 of the European Parliament and of the Council of 27
  April 2016 on the protection of natural persons regarding the processing of
  personal data and on the free movement of such data, and repealing Directive
  95/46/EC (General Data Protection Regulation)_

#### International Civil Aviation Organization (ICAO) <a name="InternationalCivilAviationOrganization(ICAO)">

- _Doc 9303 Machine Readable Travel Documents - Part 3: Specifications Common to
  all_
- _MRTDs,_ 7th edition, 2015

## Terms and Definitions <a name="TermsandDefinitions">

| Term                                    | Definition                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| --------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Admission                               | The right to travel on a train, aka. as ticket.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| Ancillary                               | An extra service like meal or WIFI.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| Complaint                               | Complaint of a customer due to a service not provided as contracted. The handling of complaints in case of delays is subject to EU PRR and COTIV defining minimal refund amounts and time-line for decisions.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| Conditions                              | Conditions that limit the use of a travel contract or the changes of a travel contract.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| e-Ticket                                | The electronic representation of the travel contract on a data base. The home print ticket (A4RT or FST) where the contract of travel is represented in a printed or displayed bar code is not an e-ticket according to this definition. Synonym: dematerialized ticket.                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| Fare                                    | Proposal to purchase a transport service for specific passenger subject to specific conditions for a specific price. Handling fees by the distributor or retailer are not included.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| Fare structure                          | A fare is the fee paid by a passenger for use of a public transport system: rail, bus, taxi, etc. In the case of air transport, the term airfare is often used. Fare structure is the system set up to determine how much is to be paid by various passengers using a transit vehicle at any given time.                                                                                                                                                                                                                                                                                                                                                                                                                                |
| Fulfillment                             | A fulfillment is a document (either for paper printing or electronically) provided to the passenger to prove his travel right,facilitate access to trains and stations (e.g. via gates), provide further information on the travel and provide access to services either directly or via exchange (voucher).                                                                                                                                                                                                                                                                                                                                                                                                                            |
| Individual ticketing                    | A separate ticket is created per passenger.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| Individual contracts                    | A separate ticket is created per passenger and these tickets can be treated as individual contracts of carriage. After sales transactions can be applied independently per passenger and ticket.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| Integrated Reservation Ticket (IRT)     | Ticket for a specific train on a travel day usually including the seats. All tickets for a train are managed in one central system of the distributor. The ticket is valid on that train on a certain day only.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| Non-integrated Reservation Ticket (NRT) | A ticket not including an integrated reservation. Multiple distributors can create tickets for the same route independently. The distributor of the ticket is usually the same company that issues the ticket. The ticket might be applicable to a route with many trains or a zone or a list of trains or combinations of these. The validity might be more than one day. Some conditions allow a partial refund on unused parts of the ticket route. Refund can be done via the retailer. These conditions depend on the fare providers and the distributors (i.e. providing the option of reducing the number of passengers or to interrupt the journey). NRTs not linked to a train might be reused in case the use is not tracked. |
| Offer Part                              | An abstraction of things that can be offered. Can be of type Admission, Reservation or Ancillary.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| Reimbursement Claim                     | Special customer request for refund after the ticket validity has started where the customer needs to provide proof for not using a ticket.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| Tariff                                  | A schedule of prices and conditions for the sale or rental of a product or service. In UIC context the term “tariff” is used for fare structure.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| Ticket                                  | Medium of the passenger to prove a travel contract. Contains a description or a reference to the travel contract. The ticket might provide direct proof of the travel contract via its security features or via a link to the contract. The tickets are sold by retailers. The assembling of the ticket is done by the distributors(s). The distributor holds the master ticket data/contract of the sold ticket. A ticket can include multiple fare providers in the travel contract. The control of one ticket is done by one or many Ticket Controlling Organizations (TCO) 1. Other means of ticket checking (e.g. gates) will also be named TCOs.                                                                                  |
| Sales fee                               | Sales fees are fees added by the distributor or retailer to the price provided by the fare provider. Sales fees are not part of the fare provider offers defined in the scope of this document.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| Station fee                             | A station fee is a fee for the use of a station by a passenger. It might be included in the fare provider offer.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| Station                                 | A station is a is a location where trains or busses regularly stop to load or unload passengers.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |

## Acronyms <a name="Acronyms">

| Acronyms | Acronym Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| -------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ERA      | **European Union Agency for Railways** (https://www.era.europa.eu/)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| EWT      | **East West tariff**: Tariff used for Non-Integrated-Reservation-Tickets. The fare data model follows UIC IRS 10108.1.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| FCB      | **Flexible Content Bar Code**: Barcode specification that contains ticket data for control as structured data and is therefore machine interpretable. The Specification provides a data model of a ticket for control. FCB covers various ticket type (IRT, NRT, RPT,..). (UIC 90918-9).                                                                                                                                                                                                                                                                                                                        |
| IRT      | **Integrated Reservation Tariff**: Tariff used for Integrated-Reservation-Tickets. The fare data model replaced UIC IRS 10108.2.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| IRT      | **Integrated Reservation Ticket**: Ticket including mandatory reservation.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| JWT      | **JSON Web Token**: Specification to transport authentication information used by the OAUTH2 authorization protocol. JSON Web Token - RFC 7519                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| NRT      | **Non-Integrated Reservation Tariff**: Tariff used for Non-Integrated-Reservation-Tickets. The fare data model replaced UIC IRS 10108.1.                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| NRT      | **Non-Integrated Reservation Ticket**: Ticket not including an integrated reservation.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| REST     | **Representational State Transfer (REST)**: REST is a software architectural style that defines a set of constraints to be used for creating Web services. Web services that conform to the REST architectural style, called RESTful Web services, provide interoperability between computer systems on the internet. RESTful Web services allow the requesting systems to access and manipulate textual representations of Web resources by using a uniform and predefined set of stateless operations. Other kinds of Web services, such as SOAP Web services, expose their own arbitrary sets of operations. |
| RPT      | **Rail Pass Ticket** Ticket valid for multiple trips in a region                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| SiP      | **Security in Paper**: A ticket (representing the contract of carriage) is unique and printed on secured paper to avoid modification or creation by other than a railway company. The security is provided by the quality of the security elements included in the paper and the quality of the stock control process that controls the access to blank secure paper. (UIC IRS 90918-0)                                                                                                                                                                                                                         |
| SiD      | **Security in Data**: A ticket contains security elements. These are created/calculated based on the content of the ticket, resulting in a non-compliant security element in case of falsification or modification. SiD tickets are usually easy to regenerate or to copy. As SiD does not provide copy protection additional measures must be taken to avoid double use. The tickets are personalized, and the validity of the ticket is limited. (UIC IRS 90918-0).                                                                                                                                           |
| SiS      | **Security in System**: The contract is on a server. Every operation (creation, check, modification, …) on the ticket is conducted on the record(s) on the server or a synchronized replica. The access to the contract requires an authentication of the passenger. The ticket control id (key to the ticket) or personal data of the passenger (name, date of birth,) are used to retrieve the ticket. (UIC IRS 90918-0).                                                                                                                                                                                     |
| SiV      | **Security by Visual** elements: The ticket is controlled by a visual element printed with the ticket data on blank paper of displayed on a device. To use an image as a security feature the costs to create the complex image must be higher than the price of the ticket. (UIC IRS 90918-0).                                                                                                                                                                                                                                                                                                                 |
| TAP TSI  | European regulation on Interoperability: **Telematics Applications for Passenger Service Technical Specification for Interoperablility**                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| TCO      | **Ticket Controlling Organization**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| TLT      | **Train Linked Ticket**: Ticket not including a reservation but restricted to a train run (or multiple train runs along the route).                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| TLB      | **Ticket Layout Barcode**: Barcode specification describing the “printed” layout of a ticket. It is not machine interpretable and does not provide ticket data, only a ticket display.                                                                                                                                                                                                                                                                                                                                                                                                                          |
| UML      | **Unified Modelling Language**: A specification defining a graphical language for visualizing, specifying, constructing, and documenting the artifacts of distributed object systems.                                                                                                                                                                                                                                                                                                                                                                                                                           |
| UUID     | **Universally Unique Identifier**: Standard to create a unique id. The specification is published as ISO/IEC 9834-8:2005.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
