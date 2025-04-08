---
layout: page
title: Roles
hide_hero: true
permalink: /spec/roles/
---

## Table of contents

1. [Roles: Fare Provider, Distributor & Retailer](#RolesFareProviderDistributorRetailer)
2. [Fare Provider Role](#FareProviderRole)
   1. [Distribution Scenario - Sales](#DistributionScenarioSalesFare)
      1. [Timetable Search](#TimetableSearchFare)
      2. [Offer](#OfferFare)
      3. [Preliminary Booking](#PreliminaryBookingFare)
      4. [Confirm Booking](#ConfirmBookingFare)
      5. [Fulfillment](#FulfillmentFare)
      6. [Place Selection](#PlaceSelectionFare)
      7. [Payment](#PaymentFare)
   2. [After Sales Scenario - Cancellation](#AfterSalesScenarioCancellationFare)
      1. [Refund Offer](#RefundOfferFare)
      2. [Confirm Refund Offer](#ConfirmRefundOfferFare)
   3. [After Sales Scenario - Exchange](#AfterSalesScenarioExchangeFare)
      1. [Return Payment](#ReturnPaymentFare)
   4. [Change of personal data Scenario](#ChangeofpersonaldataScenarioFare)
      1. [Change of personal data](#ChangeofpersonaldataFare)
      2. [Reticket](#ReticketFare)
   5. [Information on personal data Scenario](#InformationonpersonaldataScenarioFare)
3. [Distributor Role](#DistributorRole)
   1. [Distribution Scenario - Sales](#DistributionScenarioSalesDist)
      1. [Timetable Search](#TimetableSearchDist)
      2. [Offer](#OfferDist)
      3. [Preliminary Booking](#PreliminaryBookingDist)
      4. [Confirm Booking](#ConfirmBookingDist)
      5. [Fulfillment](#FulfillmentDist)
      6. [Place Selection](#PlaceSelectionDist)
      7. [Payment](#PaymentDist)
   2. [After Sales Scenario - Cancellation](#AfterSalesScenarioCancellationDist)
      1. [Refund Offer](#RefundOfferDist)
      2. [Confirm Refund Offer](#ConfirmRefundOfferDist)
      3. [Return Payment](#ReturnPaymentDistCancellation)
   3. [After Sales Scenario - Exchange](#AfterSalesScenarioExchangeDist)
      1. [Return Payment](#ReturnPaymentDistExchange)
   4. [Change of personal data Scenario](#ChangeofpersonaldataScenarioDist)
      1. [Change of personal data](#ChangeofpersonaldataDist)
      2. [Reticket](#ReticketDist)
   5. [Information on personal data Scenario](#InformationonpersonaldataScenarioDist)
4. [Retailer Role](#RetailerRole)
   1. [Distribution Scenario - Sales](#DistributionScenarioSalesRetail)
      1. [Timetable Search](#TimetableSearchRetail)
      2. [Offer](#OfferRetail)
      3. [Preliminary Booking](#PreliminaryBookingRetail)
      4. [Confirm Booking](#ConfirmBookingRetail)
      5. [Fulfillment](#FulfillmentRetail)
      6. [Place Selection](#PlaceSelectionRetail)
      7. [Payment](#PaymentRetail)
   2. [After Sales Scenario - Cancellation](#AfterSalesScenarioCancellationRetail)
      1. [Refund Offer](#RefundOfferRetail)
      2. [Confirm Refund Offer](#ConfirmRefundOfferRetail)
      3. [Return Payment](#ReturnPaymentRetailCancellation)
   3. [After Sales Scenario - Exchange](#AfterSalesScenarioExchangeRetail)
      1. [Return Payment](#ReturnPaymentRetailExchange)
   4. [Change of personal data Scenario](#ChangeofpersonaldataScenarioRetail)
      1. [Change of personal data](#ChangeofpersonaldataRetail)
      2. [Reticket](#ReticketRetail)
   5. [Information on personal data Scenario](#InformationonpersonaldataScenarioRetail)


## Roles: Fare Provider, Distributor & Retailer <a name="RolesFareProviderDistributorRetailer">

A participant can play the following roles:

- **Fare Provider** – defining the fare and combination rules and providing them
  to distributors offline or online.
- **Distributor** – combining fares, defining after sales rules within the
  constraints set by the fare provider, providing combined offers and managing
  the booking transaction, managing the ticket security (barcode, control
  processes), creating a fulfillment, managing compensations processes, managing
  the stock control process.
- **Retailer** – selling tickets from one or more distributors to the customer.
  Selecting the distributors and joining multiple independent bookings.

A public transport provider, e.g. a railway or a system provider can support
more than one role.

In the following sections, five scenario from the point of view of the different
are high lighted.

## Fare Provider Role <a name="FareProviderRole">

The services defined to exchange fares online are designed to support general
sales and after sales scenarios. Here the general flow is listed, and the
supporting services of the fare exchange are indicated as well as other services
of UIC specifications.

### Distribution Scenario - Sales <a name="DistributionScenarioSalesFare">

#### Timetable Search <a name="TimetableSearchFare">

Timetable data are not in the scope of this specification. It is assumed, that
the distributor has retrieved a valid travel solution from a timetable search
engine before requesting fares.

#### Offer <a name="OfferFare">

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

#### Preliminary Booking <a name="PreliminaryBookingFare">

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

#### Confirm Booking <a name="ConfirmBookingFare">

The booking is confirmed by the distributor to the carrier. This is the trigger
for the accounting processes between the distributor and the carrier.

#### Fulfillment <a name="FulfillmentFare">

For combined tickets the distributor creates the ticket and is responsible to
for the fulfillment. The fare provider might provide additional security
features to be included within the fulfillment of the distributor.

The distributor is responsible to provide the ticket data for the control by the
carriers. This is not in the scope of this specification but defined in IRS
90918-4.

#### Place Selection <a name="PlaceSelectionFare">

Place selection is implemented as a patch to the selected offer.

Place selection does not allocate places.

For an intermediate time the booking and fulfillment of reservations might be
implemented using IRS 90918-1 and not via 90918-10. In this case only the offer
service is used.

The current 90918-1 service require a detailed specification of fares and place
features. The fare data of the offer defined in this specification will provide
these data to allow an integration with the existing services of reservation
systems. (see Reservation Parameter).

#### Payment <a name="PaymentFare">

Payment is not in the scope of this specification. The carrier/fare provider is
not involved in this step.

### After Sales Scenario - Cancellation <a name="AfterSalesScenarioCancellationFare">

#### Refund Offer <a name="RefundOfferFare">

The fare description obtained with the original offer includes all information
on cancellation fees in case the fees are not calculated by the distributor.

A refund offer from the carrier is therefore not required for the process.

A refund offer request can indicate a special reason for cancellation without
fees due to an error of the distributor or unavailability of the service. The
reason might not be accepted by the carrier.

The refund offer might indicate that the payment of the refund needs to be
delayed checking whether the ticket has been used.

#### Confirm Refund Offer <a name="ConfirmRefundOfferFare">

A confirmed booking is cancelled.

### After Sales Scenario - Exchange <a name="AfterSalesScenarioExchangeFare">

A cancellation offer is requested using special exchange reasons.

An offer for the new booking is requested with a reference to the old
booking(s).

These covers:

- Exchange
- Upgrade
- Increase of passengers
- Decrease of passengers

#### Return Payment <a name="ReturnPaymentFare">

No data exchange is foreseen in this step between distributor and carrier.

In case of a delayed payment of refunds the distributor needs to validate the
ticket control data (IRS 90918-4) before the payment to the customer.

### Change of personal data Scenario <a name="ChangeofpersonaldataScenarioFare">

#### Change of personal data <a name="ChangeofpersonaldataFare">

The change of personal data can be provided as an optional feature.

Note: according to GDPR it must be possible to correct errors in personal data.

#### Reticket <a name="ReticketFare">

The reticketing is not in the scope of this specification.

The distributor is responsible to provide the ticket data for the control by the
carriers. This is not in the scope of this specification but defined in IRS
90918-4.

### Information on personal data Scenario <a name="InformationonpersonaldataScenarioFare">

In order to fulfill GDPR requirements information on stored personal data of the
customer or passenger must be provided. As personal data are transferred from
the distributor to the carrier the customer can ask at the issuer or distributor
for information on the still stored personal data. The distributor then needs a
possibility to request this information from the carrier.

To retrieve the stored personal data the booking has to be requested.

## Distributor Role <a name="DistributorRole">

### Distribution Scenario - Sales <a name="DistributionScenarioSalesDist">

#### Timetable Search <a name="TimetableSearchDist">

The distributor makes a timetable search himself or retrieves the trip from a
retailer. The distributor must specify additionally for which part of the trip
he requests the fares.

#### Offer <a name="OfferDist">

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

#### Preliminary Booking <a name="PreliminaryBookingDist">

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

#### Confirm Booking <a name="ConfirmBookingDist">

The booking is confirmed by the distributor to the carrier. This is the trigger
for the accounting processes between the distributor and the carrier.

In case the confirmation of a booking fails the distributor is responsible to
restore a consistent status of the booking either by retries of the failed
confirmation or by deleting the confirmed booking.

The distributor is responsible to delete bookings in case of failures and to
repeat delete requests until the request is successful of the departure date of
the trip has passed. The repletion of delete requests should avoid network
bottlenecks (e.g. one retry every hour).

#### Fulfillment <a name="FulfillmentDist">

For combined tickets the distributor creates the ticket and is responsible for
the fulfillment. The fare provider might provide additional security features to
be included within the fulfillment of the distributor.

The distributor is responsible to provide the ticket data for the control by the
carriers/fare providers. This is not in the scope of this specification but
defined in IRS 90918-4.

#### Place Selection <a name="PlaceSelectionDist">

Place selection is implemented as a patch to the selected offer.

Place selection does not allocate places.

For an intermediate time the booking and fulfillment of reservations might be
implemented using IRS 90918-1 and not via 90918-10. In this case only the offer
service is used.

The current 90918-1 service require a detailed specification of fares and place
features. The fare data of the offer defined in this specification will provide
these data to allow an integration with the existing services of reservation
systems. (see Reservation Parameter).

#### Payment <a name="PaymentDist">

Payment is not in the scope of this specification. The carrier/fare provider is
not involved in this step.

### After Sales Scenario - Cancellation <a name="AfterSalesScenarioCancellationDist">

#### Refund Offer <a name="RefundOfferDist">

A refund offer from the carrier is required in case of online sales for the
process

A refund offer request can indicate a special reason for cancellation without
fees due to an error of the distributor or unavailability of the service. The
reason might not be accepted by the carrier.

The refund offer might indicate that the payment of the refund needs to be
delayed checking whether the ticket has been used.

#### Confirm Refund Offer <a name="ConfirmRefundOfferDist">

A confirmed booking is cancelled. In case after sales fees for the carrier are
applied that need to be transferred in the booking confirmation.

#### Return Payment <a name="ReturnPaymentDistCancellation">

In case of a delayed payment of refunds the distributor needs to validate the
ticket control data (IRS 90918-4).

### After Sales Scenario - Exchange <a name="AfterSalesScenarioExchangeDist">

A exchange offer is requested using special exchange reasons.

An offer for the new booking is requested with a reference to the old
booking(s).

These covers:

- Exchange
- Upgrade
- Increase of passengers
- Decrease of passengers

#### Return Payment <a name="ReturnPaymentDistExchange">

No data exchange is foreseen in this step between distributor and carrier. The
distributor hast to pass on information on delayed payment to the retailer.

In case of a delayed payment of refunds the distributor needs to validate the
ticket control data (IRS 90918-4) before the payment to the customer.

### Change of personal data Scenario <a name="ChangeofpersonaldataScenarioDist">

#### Change of personal data <a name="ChangeofpersonaldataDist">

The change of personal data can be provided as an optional feature.

Note: according to GDPR it must be possible to correct errors in personal data.

#### Reticket <a name="ReticketDist">

The reticketing is not in the scope of this specification.

The distributor is responsible to provide the ticket data for the control by the
carriers. This is not in the scope of this specification but defined in IRS
90918-4.

### Information on personal data Scenario <a name="InformationonpersonaldataScenarioDist">

In order to fulfill GDPR requirements information on stored personal data of the
customer or passenger must be provided. As personal data are transferred from
the distributor to the carrier the customer can ask at the issuer or distributor
for information on the still stored personal data. The distributor then needs a
possibility to request this information from the carrier.

To retrieve the stored personal data the booking has to be requested.

## Retailer Role <a name="RetailerRole">

### Distribution Scenario - Sales <a name="DistributionScenarioSalesRetail">

#### Timetable Search <a name="TimetableSearchRetail">

The retailer makes a timetable search itself or retrieves the trip from a
distributor.

#### Offer <a name="OfferRetail">

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

#### Preliminary Booking <a name="PreliminaryBookingRetail">

The preliminary booking allocates the offer for a period defined by the
distributor. Technically it is implemented as a post /booking using the offerId.
The distributor is responsible to manage the transactions including multiple
carriers/fare providers.

#### Confirm Booking <a name="ConfirmBookingRetail">

The booking is confirmed by the retailer to the distributor. In case the
confirmation of a booking fails the retailer is responsible to restore a
consistent status of the booking either by retries of the failed confirmation or
by deleting the confirmed booking.

The retailer is responsible to delete bookings in case of failures and to repeat
delete requests until the request is successful of the departure date of the
trip has passed. The repletion of delete requests should avoid network
bottlenecks (e.g. one retry every hour).

#### Fulfillment <a name="FulfillmentRetail">

The retailer requests fulfillments from the distributor and hands them to the
passenger.

#### Place Selection <a name="PlaceSelectionRetail">

Place selection is implemented as a patch to the selected offer.

Place selection does not allocate places.

#### Payment <a name="PaymentRetail">

Payment is not in the scope of this specification. The distributor is not
involved in this step.

### After Sales Scenario - Cancellation <a name="AfterSalesScenarioCancellationRetail">

#### Refund Offer <a name="RefundOfferRetail">

The retailer needs to get a refund offer from the distributor to start the
refund process. The refund offer is part of the booking to be refunded.

A refund offer request can indicate a special reason for cancellation without
fees due to an error of the sales staff or unavailability of the service. The
reason might not be accepted by the distributor.

The refund offer might indicate that the payment of the refund needs to be
delayed checking whether the ticket has been used.

#### Confirm Refund Offer <a name="ConfirmRefundOfferRetail">

A confirmed booking is cancelled.

#### Return Payment <a name="ReturnPaymentRetailCancellation">

The retailer needs to obey the delayed payment instruction provided by the
distributor.

### After Sales Scenario - Exchange <a name="AfterSalesScenarioExchangeRetail">

An exchange offer is requested using special exchange reasons.

An offer for the new booking is requested with a reference to the old
booking(s).

These covers:

- Exchange
- Upgrade
- Increase of passengers
- Decrease of passengers

#### Return Payment <a name="ReturnPaymentRetailExchange">

The retailer needs to obey the delayed payment instruction provided by the
distributor.

### Change of personal data Scenario <a name="ChangeofpersonaldataScenarioRetail">

#### Change of personal data <a name="ChangeofpersonaldataRetail">

The change of personal data can be provided as an optional feature.

Note: according to GDPR it must be possible to correct errors in personal data.

#### Reticket <a name="ReticketRetail">

The reticketing is not in the scope of this specification.

### Information on personal data Scenario <a name="InformationonpersonaldataScenario">

To fulfill GDPR requirements information on stored personal data of the customer
or passenger must be provided. As personal data are transferred to the
distributor the customer can ask at the retailer for information on the still
stored personal data. The retailer then needs a possibility to request this
information from the carrier.

To retrieve the stored personal data the booking must be requested.
