---
layout: page
title: Roles
hide_hero: true
permalink: /spec/roles/
---

## Roles: Fare Provider, Distributor & Retailer

A participant can play the following roles:

- **Fare Provider** – defining the fare and combination rules and providing them
  to distributors offline or online.
- **Distributor** – combining fares, defining after sales rules within the
  frames et by the fare provider, providing combined offers and managing the
  booking transaction, managing the ticket security (barcode, control
  processes), managing compensations processes, managing the stock control
  process.
- **Retailer** – selling tickets from one or more distributors to the customer.
  Selecting the distributors and joining multiple independent bookings.

A RU or system provider can support more than one role.

In the following sections, five scenario from the point of view of the different are high lighted.

## Fare Provider Role

The services defined to exchange fares online are designed to support general
sales and after sales scenarios. Here the general flow is listed, and the
supporting services of the fare exchange are indicated as well as other services
of UIC specifications.

### Distribution Scenario – Sales

#### Timetable search

Timetable data are not in the scope of this specification. It is assumed, that
the distributor has retrieved a valid travel solution from a timetable search
engine before requesting fares.

#### Offer

Requesting fares of a carrier or train for a specified set of passengers.
Splitting of the entire travel solution into appropriate parts is the task of
the distributor. Data supporting the selection of the carriers/fare providers to
be requested are part of this specification and can be transferred beforehand.

The carrier should deliver all applicable fares for the requested offer and the
rules for combining them.

The prices provided within the offer might be fixed for a specific time range
depending on the fare, but this is not mandatory. Some carriers don’t guarantee
prices at all.

In case of offers with reservation the offer reply will contain the availability
of the different fares and services, but no availability on other place features
(e.g. window, aisle, ...) if they don’t affect the price.

In case a trip description needs to be change as the carrier/ fare provider has
more accurate data on the trip the reply contains a new trip and an indication
of change.

#### Preliminary Booking

The preliminary booking allocates the fare for a period defined by the carrier.
Technically it is implemented as a post /booking using the offerId.

For an intermediate time the booking and fulfillment of reservations might be
implemented using IRS 90918-1 and not via 90918-10. In this case only the offer
service is used.

In case of reservations the currently defined flow in IRS 90918-1 is different,
as the preliminary booking must be implemented by the distributor receiving the
reservation by cancelling the allocated fare and places in due time and with a
specific reason for cancellation.

The current 90918-1 service require a detailed specification of fares and place
features. The fare data of the offer defined in this specification will provide
these data to allow an integration with the existing services of reservation
systems.

#### Confirm Booking

The booking is confirmed by the distributor to the carrier. This is the trigger
for the accounting processes between the distributor and the carrier.

#### Fulfillment

For combined tickets the distributor creates the ticket and is responsible to
for the fulfillment. The fare provider might provide additional security
features to be included within the fulfillment of the distributor.

The distributor is responsible to provide the ticket data for the control by the
carriers. This is not in the scope of this specification but defined in IRS
90918-4.

#### Place Selection

Place selection is implemented as a patch to the selected offer.

Place selection does not allocate places.

For an intermediate time the booking and fulfillment of reservations might be
implemented using IRS 90918-1 and not via 90918-10. In this case only the offer
service is used.

The current 90918-1 service require a detailed specification of fares and place
features. The fare data of the offer defined in this specification will provide
these data to allow an integration with the existing services of reservation
systems. (see Reservation Parameter).

#### Payment

Payment is not in the scope of this specification. The carrier/fare provider is
not involved in this step.

### After sales scenario – cancellation

#### Refund Offer

The fare description obtained with the original offer includes all information
on cancellation fees in case the fees are not calculated by the distributor.

A refund offer from the carrier is therefore not required for the process.

A refund offer request can indicate a special reason for cancellation without
fees due to an error of the distributor or unavailability of the service. The
reason might not be accepted by the carrier.

The refund offer might indicate that the payment of the refund needs to be
delayed checking whether the ticket has been used.

#### Confirm Refund Offer

A confirmed booking is cancelled.

### After sales scenario - exchange

A cancellation offer is requested using special exchange reasons.

An offer for the new booking is requested with a reference to the old
booking(s).

These covers:

- Exchange
- Upgrade
- Increase of passengers
- Decrease of passengers

#### Return Payment

No data exchange is foreseen in this step between distributor and carrier.

In case of a delayed payment of refunds the distributor needs to validate the
ticket control data (IRS 90918-4) before the payment to the customer.

### Change of personal data Scenario

#### Change of personal data

The change of personal data can be provided as an optional feature.

Note: according to GDPR it must be possible to correct errors in personal data.

#### Reticket

The reticketing is not in the scope of this specification.

The distributor is responsible to provide the ticket data for the control by the
carriers. This is not in the scope of this specification but defined in IRS
90918-4.

### Information on personal data Scenario

In order to fulfill GDPR requirements information on stored personal data of the
customer or passenger must be provided. As personal data are transferred from
the distributor to the carrier the customer can ask at the issuer or distributor
for information on the still stored personal data. The distributor then needs a
possibility to request this information from the carrier.

To retrieve the stored personal data the booking has to be requested.

## Distributor Role

### Distribution Scenario – Sales

#### Timetable search

The distributor makes a time table search himself or retrieves the trip from a
retailer. The distributor must specify additionally for which part of the trip
he requests the fares.

#### Offer

Requesting fares of a carrier or train for a specified set of passengers.
Splitting of the entire travel solution into appropriate parts is the task of
the distributor. Data supporting the selection of the carriers/fare providers to
be requested are part of this specification and can be transferred beforehand.

The prices provided within the offer might be fixed for a specific time range
depending on the fare, but this is not mandatory. Some carriers don’t guarantee
prices at all.

In case of offers with reservation the offer reply will contain the availability
of the different fares and services, but no availability on other place features
(e.g. window, aisle, ...) if they don’t affect the price.

In case the fare provider delivers a changed trip the distributor has to take
this into account. The reply contains a new trip and an indication of change.

#### Preliminary Booking

The preliminary booking allocates the fare for a period defined by the carrier.
Technically it is implemented as a post /booking using the offerId. The
distributor is responsible to manage the transactions including multiple
carriers/fare providers.

For an intermediate time the booking and fulfillment of reservations might be
implemented using IRS 90918-1 and not via 90918-10. In this case only the offer
service is used.

In case of reservations the currently defined flow in IRS 90918-1 is different,
as the preliminary booking must be implemented by the distributor receiving the
reservation by cancelling the allocated fare and places in due time and with a
specific reason for cancellation.

The current 90918-1 service require a detailed specification of fares and place
features. The fare data of the offer defined in this specification will provide
these data to allow an integration with the existing services of reservation
systems.

#### Confirm Booking

The booking is confirmed by the distributor to the carrier. This is the trigger
for the accounting processes between the distributor and the carrier.

In case the confirmation of a booking fails the distributor is responsible to
restore a consistent status of the booking either by retries of the failed
confirmation or by deleting the confirmed booking.

The distributor is responsible to delete bookings in case of failures and to
repeat delete requests until the request is successful of the departure date of
the trip has passed. The repletion of delete requests should avoid network
bottlenecks (e.g. one retry every hour).

#### Fulfillment

For combined tickets the distributor creates the ticket and is responsible for
the fulfillment. The fare provider might provide additional security features to
be included within the fulfillment of the distributor.

The distributor is responsible to provide the ticket data for the control by the
carriers/fare providers. This is not in the scope of this specification but
defined in IRS 90918-4.

#### Place Selection

Place selection is implemented as a patch to the selected offer.

Place selection does not allocate places.

For an intermediate time the booking and fulfillment of reservations might be
implemented using IRS 90918-1 and not via 90918-10. In this case only the offer
service is used.

The current 90918-1 service require a detailed specification of fares and place
features. The fare data of the offer defined in this specification will provide
these data to allow an integration with the existing services of reservation
systems. (see Reservation Parameter).

#### Payment

Payment is not in the scope of this specification. The carrier/fare provider is
not involved in this step.

### After sales scenario – cancellation

#### Refund Offer

A refund offer from the carrier is required in case of online sales for the
process

A refund offer request can indicate a special reason for cancellation without
fees due to an error of the distributor or unavailability of the service. The
reason might not be accepted by the carrier.

The refund offer might indicate that the payment of the refund needs to be
delayed checking whether the ticket has been used.

#### Confirm Refund Offer

A confirmed booking is cancelled. In case after sales fees for the carrier are
applied that need to be transferred in the booking confirmation.

#### Return Payment

In case of a delayed payment of refunds the distributor needs to validate the
ticket control data (IRS 90918-4).

### After sales scenario - exchange

A exchange offer is requested using special exchange reasons.

An offer for the new booking is requested with a reference to the old
booking(s).

These covers:

- Exchange
- Upgrade
- Increase of passengers
- Decrease of passengers

#### Return Payment

No data exchange is foreseen in this step between distributor and carrier. The
distributor hast to pass on information on delayed payment to the retailer.

In case of a delayed payment of refunds the distributor needs to validate the
ticket control data (IRS 90918-4) before the payment to the customer.

### Change of personal data Scenario

#### Change of personal data

The change of personal data can be provided as an optional feature.

Note: according to GDPR it must be possible to correct errors in personal data.

#### Reticket

The reticketing is not in the scope of this specification.

The distributor is responsible to provide the ticket data for the control by the
carriers. This is not in the scope of this specification but defined in IRS
90918-4.

### Information on personal data Scenario

In order to fulfill GDPR requirements information on stored personal data of the
customer or passenger must be provided. As personal data are transferred from
the distributor to the carrier the customer can ask at the issuer or distributor
for information on the still stored personal data. The distributor then needs a
possibility to request this information from the carrier.

To retrieve the stored personal data the booking has to be requested.

## Retailer Role

### Distribution Scenario – sales

#### Timetable search

The retailer makes a time table search himself or retrieves the trip from an
distributor.

#### Offer

Requesting offers of an distributor for a specified set of passengers and
optionally for a trip.

The prices provided within the offer might be fixed for a specific time range
depending on the offer, but this is not mandatory. Some carriers don’t guarantee
prices at all.

In case of offers with reservation the offer reply will contain the availability
of the different services, but no availability on other place features (e.g.
window, aisle, ...) if they don’t affect the price.

In case the distributor delivers a changed trip the retailer has to take this
into account. The reply contains a new trip and an indication of change.

#### Preliminary Booking

The preliminary booking allocates the offer for a period defined by the
distributor. Technically it is implemented as a post /booking using the offerId.
The distributor is responsible to manage the transactions including multiple
carriers/fare providers.

#### Confirm Booking

The booking is confirmed by the retailer to the distributor. In case the
confirmation of a booking fails the retailer is responsible to restore a
consistent status of the booking either by retries of the failed confirmation or
by deleting the confirmed booking.

The retailer is responsible to delete bookings in case of failures and to repeat
delete requests until the request is successful of the departure date of the
trip has passed. The repletion of delete requests should avoid network
bottlenecks (e.g. one retry every hour).

#### Fulfillment

The retailer requests fulfillments from the distributor and hands them to the
passenger.

#### Place Selection

Place selection is implemented as a patch to the selected offer.

Place selection does not allocate places.

#### Payment

Payment is not in the scope of this specification. The distributor is not
involved in this step.

### After sales scenario – cancellation

#### Refund Offer

The retailer needs to get a refund offer from the distributor to start the
refund process. The refund offer is part of the booking to be refunded.

A refund offer request can indicate a special reason for cancellation without
fees due to an error of the sales staff or unavailability of the service. The
reason might not be accepted by the distributor.

The refund offer might indicate that the payment of the refund needs to be
delayed checking whether the ticket has been used.

#### Confirm Refund Offer

A confirmed booking is cancelled.

#### Return Payment

The retailer needs to obey the delayed payment instruction provided by the
distributor.

### After sales scenario - exchange

An exchange offer is requested using special exchange reasons.

An offer for the new booking is requested with a reference to the old
booking(s).

These covers:

- Exchange
- Upgrade
- Increase of passengers
- Decrease of passengers

#### Return Payment

The retailer needs to obey the delayed payment instruction provided by the
distributor.

### Change of personal data Scenario

#### Change of personal data

The change of personal data can be provided as an optional feature.

Note: according to GDPR it must be possible to correct errors in personal data.

#### Reticket

The reticketing is not in the scope of this specification.

### Information on personal data Scenario

To fulfill GDPR requirements information on stored personal data of the customer
or passenger must be provided. As personal data are transferred to the
distributor the customer can ask at the retailer for information on the still
stored personal data. The retailer then needs a possibility to request this
information from the carrier.

To retrieve the stored personal data the booking must be requested.
