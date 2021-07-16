---
layout: page
title: Errors and Warnings
hide_hero: true
permalink: /spec/errors-warnings/
---

# Errors and Warnings (Draft)

*To be released in version 1.3*

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

## Functional errors and the JSON Problem element

The OSDM API makes use of the JSON Problem structure to return
information about functional errors in the handling of a request.

The problem structure is based on the Problem Details for HTTP APIs RFC
[RfC-7807](https://tools.ietf.org/html/rfc7807) which defines a
\"problem detail\" as a way to carry machine-readable details of errors in a HTTP response to avoid the need to define new error response formats for HTTP APIs.

For OSDM, the title property should begin with the code of the error
type. This code should be the unique identifier for the functional
situation in the absolute URI in the type property as well.

In order that OSDM implementations also behave consistently in error situations,
the following error codes must be supported in case of functional errors by all 
implementations:

| **Functional area** | **Code**     | **Title**                     |
|---------------------|--------------|-------------------------------|
| Locations  | `OSDM_L_INV`   | Invalid characters in the search string |
| Locations  | `OSDM_L_NORES` | The search did not return any result|
| Trips      | `OSDM_TR_INV`  | A search criteria value contains invalid value or invalid characters |
| Trips      | `OSDM_TR_OAB`  | A search criteria lies outside accepted boundaries |
| Trips      | `OSDM_TR_UL`   | A provided location is not known |
| Trips      | `OSDM_TR_NORES`| The search did not return any result |
| Offers     | `OSDM_O_TRMIS` | The referenced trip cannot be found (expired ?) |
| Offers     | `OSDM_O_INV`   | A search criteria value contains invalid value or invalid characters |
| Offers     | `OSDM_O_OOB`   | A search criteria lies outside accepted boundaries |
| Offers     | `OSDM_O_UL`    | A provided location is not known |
| Offers     | `OSDM_O_NOTR`  | The trip search did not return any result |
| Offers     | `OSDM_O_NOOF`  | No offer could be built for any of the discovered trips |
| Offers     | `OSDM_O_SMM`   | Schedule mismatch between systems |
| Offers     | `OSDM_O_RONA`  | The requested reservation option is not available on this transport |
| Offers     | `OSDM_O_PINV`  | An invalid value is provided for a passenger property |
| Offers     | `OSDM_O_PROP`  | Attempted to modify a read-only property (passenger) |
| Offers     | `OSDM_O_OPROP` | Attempted to modify a read-only property (reservation, ancillary or fare) |
| Booking    | `OSDM_B_ONF`   | Referenced Offer or offer part not found (offer expired ?) |
| Booking    | `OSDM_O_RIG`   | No rights to access referenced offer |
| Booking    | `OSDM_B_INC`   | Incompatible offer part with the offer |
| Booking    | `OSDM_B_MSI`   | Missing information |
| Booking    | `OSDM_B_SSU`   | Unknown error while pre-booking to sub-system |
| Booking    | `OSDM_B_AV`    | Insufficient availability for one of the requested products |
| Booking    | `OSDM_B_PAV`   | The requested place is not available |
| Booking    | `OSDM_B_`      | An invalid value is provided for a passenger property |
| Booking    | `OSDM_B_ROP`   | Attempted to modify a read-only property |
| Booking    | `OSDM_B_BCO`   | The booking is already confirmed |
| Booking    | `OSDM_B_BCA`   | The booking is already cancelled |
| Booking    | `OSDM_B_NMOD`  | The booking  and does not allow  modifications |
| Confirm    | `OSDM_C_PS`    | Partial success |
| Confirm    | `OSDM_C_NOSUP` | Operation not supported on one of the offer parts |
| Confirm    | `OSDM_C_U`     | Unknown error on provider side |
| Confirm    | `OSDM_C_MSI`   | Missing information in the booking |
| Confirm    | `OSDM_C_NOFT`  | No fulfillment type selected |
| Confirm    | `OSDM_C_BCO`   | Booking already confirmed |
| Confirm    | `OSDM_C_BFUL`  | Booking already fulfilled |
| Confirm    | `OSDM_C_BCL`   | Booking already cancelled |

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
