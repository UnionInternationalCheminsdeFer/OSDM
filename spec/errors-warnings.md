---
layout: page
title: Errors and Warnings
hide_hero: true
permalink: /spec/errors-warnings/
---

# Errors and Warnings

## General HTTP error codes and generic situations

The following standard HTTP error codes are used in the specification:

| **Error Code** | **Description** |
|----------------|-----------------|
| `400` | Bad request |
| `401` | Unauthorized |
| `403` | Forbidden |
| `404` | Not found |
| `409` | Conflict |
| `500` | Internal server error |
| `501` | Not implemented |
| `503` | Service unavailable |

## Functional errors and the JSON Problem element

The OSDM API makes use of the JSON Problem structure to return
information about functional errors in the handling of a request.

The problem structure is based on the Problem Details for HTTP APIs RFC
[RfC-7807](https://tools.ietf.org/html/rfc7807) which defines a
\"problem detail\" as a way to carry machine-readable details of errors
in a HTTP response to avoid the need to define new error response formats 
for HTTP APIs.

For OSDM, the title property should begin with the code of the error
type. This code should be the unique identifier for the functional
situation in the absolute URI in the type property as well.

In order that OSDM implementations also behave consistently in error situations,
the following error codes must be supported in case of functional errors by all
implementations:

| **Functional area** | **Code**     | **Title**                     |
|---------------------|--------------|-------------------------------|
| Places     | `PLACE_INVALID_CHARACTERS` | Invalid characters in the search string |
| Places     | `PLACE_NO_RESULTS`         | The search did not return any result|
| Trips      | `TRIP_INVALID_CHARACTERS`  | A search criteria value contains invalid value or invalid characters |
| Trips      | `TRIP_SEARCH_CRITERIA_OUTSIDE_BOUNDARY`  | A search criteria lies outside accepted boundaries |
| Trips      | `TRIP_PLACE_UNKNOWN`       | A provided place is not known |
| Trips      | `TRIP_NO_SEARCH_RESULT`    | The search did not return any result |
| Offers     | `OFFER_TRIP_NOT_FOUND`     | The referenced trip cannot be found (expired ?) |
| Offers     | `OFFER_INVALID_CHARACTERS`   | A search criteria value contains invalid value or invalid characters |
| Offers     | `OFFER_SEARCH_CRITERIA_OUT_OF_BOUNDS`   | A search criteria lies outside accepted boundaries |
| Offers     | `OFFER_PLACE_UNKNOWN`      | A provided place is not known |
| Offers     | `OFFER_NO_RESULTS`  | The trip search did not return any result |
| Offers     | `OFFER_SCHEDULE_MISMATCH`  | Schedule mismatch between systems |
| Offers     | `OFFER_RESERVATION_OPTION_NOTA`  | The requested reservation option is not available on this vehicle |
| Offers     | `OFFER_PASSENGER_PROPERTY_NOT_MODIFIABLE`| Attempted to modify a read-only property (passenger) |
| Offers     | `OFFER_OFFERPART_PROPERTY_NOT_MODIFIABLE`| Attempted to modify a read-only property (reservation, ancillary or fare) |
| Booking    | `BOOKING_OFFER_NOT_FOUND`  | Referenced Offer or offer part not found (offer expired ?) |
| Booking    | `BOOKING_INCOMPATIBLE_OFFER_PART`        | Incompatible offer part with the offer |
| Booking    | `BOOKING_INFORMATION_MISSING`| Missing information |
| Booking    | `BOOKING_INSUFFICIENT_AVAILABILITY`      | Insufficient availability for one of the requested products |
| Booking    | `BOOKING_PLACE_NOT_AVAILABLE`| The requested place is not available |
| Booking    | `BOOKING_MODIFY_READ_ONLY_PROPERTY`      | Attempted to modify a read-only property |
| Booking    | `BOOKING_BOOKING_ALREADY_CONFIRMED`      | The booking is already confirmed |
| Booking    | `BOOKING_BOOKING_ALREADY_CANCELLED`      | The booking is already cancelled |
| Booking    | `BOOKING_MODIFICATION_NOT_ALLOWED`       | The booking and does not allow  modifications |
| Confirm    | `CONFIRMATION_PARTIAL_SUCCESS`           | Partial success |
| Confirm    | `CONFIRMATION_OPERATION_NOT_SUPPORTED`   | Operation not supported on one of the offer parts |
| Confirm    | `CONFIRMATION_UNKNOWN_ERROR`             | Unknown error on provider side |
| Confirm    | `CONFIRMATION_INFORMATION_MISSING`       | Missing information in the booking |
| Confirm    | `CONFIRMATION_FULFILLMENT_TYPE_NOT_SELECTED`  | Fulfillment type not selected |
| Confirm    | `CONFIRMATION_BOOKING_ALREADY_CONFIRMED` | Booking already confirmed |
| Confirm    | `CONFIRMATION_BOOKING_ALREADY_FULFILLED` | Booking already fulfilled |
| Confirm    | `CONFIRMATION_BOOKING_ALREADY_CANCELLED` | Booking already cancelled |

The list can be extended by an implementor but at least these errors must
be captured and they must be presented with the codes listed here above.

## Functional Warnings

In addition to errors, a generic warnings mechanism is used to pass
non-blocking information or event, such as a price difference with the
initially offered price at booking time. As for the errors, Implementers
are required to use the following codes and descriptions for the
situations identified in order to be compliant. In case they wish to
pass additional warnings specific to their situation and not covered by
any of the case below, they can do so by replacing the OSDM prefix with
an `X_` followed by an unique identifier for the provider (ex:
`X_NVS_NOMEAL`).

A warning message is typically made of a code and a text. Texts are not
translated and the expected language there should be english. It is up
to the implementers to foresee a translation based on the code if
relevant. Optionally, a warning message can contain reference to
resources in the model.
