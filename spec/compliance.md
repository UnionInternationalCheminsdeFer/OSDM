---
layout: page
title: Compliance
hide_hero: true
permalink: /spec/compliance/
---

## Table of contents

1. [Compliance](#Compliance)
2. [Compliance with the Offline Part](#CompliancewiththeOfflinePart)
3. [Compliance with the Online Part](#CompliancewiththeOnlinePart)
   1. [Compliance as a Retailer](#ComplianceasaRetailer)
   2. [Compliance as a Distributor](#ComplianceasaDistributor)
   3. [Compliance as a Carrier aka. Fare Provider](#ComplianceasaCarrieraka.FareProvider)


## Compliance <a name="Compliance">

To be compliant with the OSDM specification in total a party must be compliant
with the offline as well as the online part of the specification. However, a
party can decide based on their business need to implement the offline or the
online part online based on the role they want to play in the sales process.

![Compliance](../../images/compliance/compliance.png)

## Compliance with the Offline Part <a name="CompliancewiththeOfflinePart">

An implementation of the bulk data exchange specification is compliant with the
specification if

- A feature specified in the data structure is implemented

Or

- A fare providing the feature in its data is excluded from sale

A system receiving data for a fare must be able to understand all features and
rules of the fare defined in the data and obey these features and rules or must
not sell such a fare.

## Compliance with the Online Part <a name="CompliancewiththeOnlinePart">

### Compliance as a Retailer <a name="ComplianceasaRetailer">

The following services/features are mandatory/optional to implement:

| consumed API calls                    | Description                                                                 | Need to Support    | remark                               |
| ------------------------------------- | --------------------------------------------------------------------------- | ------------------ | ------------------------------------ |
| **Version Ressource**                 |                                                                             |                    |                                      |
| `GET /versions`                       | retrieve implemented and upcoming versions                                  |  _Optional_        |                                      |
| **Place Resources**                   | get places                                                                  |                    |  Alternative: location code data via files  |
| `POST /places`                        | search for a place                                                          | _Recommended_      |                                      |
| `GET  /places`                        | search for a place                                                          | _Recommended_      |                                      |
| `GET  /places/{placesId}`             | download all places                                                         | _Optional_         |                                      |
| **Trip planning Resources**           |                                                                             | _Optional_         |  Alternative: time table data via files     |
| `POST /trips-collection`              | search for trips                                                            | _Optional_         |                                      |
| `GET  /trips-collections/{tripsCollectionId}`     |                                                                 | _Optional_         |                                      |
| `POST /trips                          | Returns a new trip for given search parameters based on an existing trip    | _Optional_         |                                      |
| `GET  /trips/{tripId}                 | Returns a trp based on the tripid                                           | _Optional_         |                                      |
| **Offer Resources**                   | resources to get bookable offers                                            |                    |                                      |
| POST  /offers                         | Returns offers for trips or trip search criteria.                           | **Mandatory**      |  trips and trip search criteria must be supported in the request |
| GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}/additional-offers  |   Get additional offers of booked offer for a given booking. |   _Optional_  |                                      |
| **Offer Overview**                   | resources to get an overview of prices without detailed offer information   |                    |                                      |
| POST  /offer-overview-route           | Returns an overview of prices based on route                                |  _Optional_        |                                     |
| POST  /offer-overview-trip            | Returns an overview of prices based on trips                                |  _Optional_        |                                     |
| **Availabilities resources**         |    query availabilities before or after pre-booking                         |                    |                                      |
| POST  /availabilities/vehicle-place-map  | Get a place map for a requested vehicle including availabilities.       |  _Optional_        |                                      |
| GET  /availabilities/nearby          | Get availabilities nearby a given place.                                    |  _Optional_        |                                      |
| GET  /availabilities/preferences     |  Get availabilities for a set of preferences.                               |  _Optional_        |                                      |
| POST  /availabilities/on-demand-services |  Get availabilities of an on-demand service.                            |  **Conditional**   | Mandatory if on demand services are supported    | 
| **Booking Resource**                 | manipulate bookings                                                         |                    |                                      |
| POST  /bookings                      |  Creates a booking based on a previously requested offer.                   | **Mandatory**      |                                      |
| GET  /bookings/{bookingId}           |  Returns a booking.                                                         | **Mandatory**      |                                      |
| PATCH  /bookings/{bookingId}         |  Updates a booking but does *not* confirm the booking.                      | Recommended        |                                      |
| DELETE  /bookings/{bookingId}        |  Deletes a booking.                                                         | Recommended        |                                      |
| POST  /bookings/{bookingId}/cleanup  |  Performs a complete cleanup of a booking in a single step                  | Recommended        |                                      |
| GET  /bookings/{bookingId}/history   |  Returns the history of changes to a booking.                               | _Optional_         |                                      |
| POST  /bookings/{bookingId}/fulfillments |  Confirms the booking a triggers the fulfillment of the booking synchronously or asynchronously. | **Mandatory**  |                 |
| PATCH /bookings/{bookingId}/fulfillments |   Optionally finalizes the fulfillments in asynchronous mode.           | _Optional_         |                                      |
| GET  /bookings/{bookingId}/fulfillment-check | Check step (step 1 in a two phase commit process) to run before the effective fulfillment endpoint. | Recommended        |  |
| POST  /bookings/{bookingId}/booked-offers | Creates bookedOffers from offers and adds them in a booking.           | Recommended        |                                      |
| **Booking Part Resource**            | manipulate booking parts                                                    |                    |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{bookedOfferId}/admissions/{admissionId}  | Removes an admission from a booking in case the admission is not confirmed. | Recommended    |           |
| POST  /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts  | Adds a reservation or ancillary not previously added from offer to a booking.  | Recommended        |           |
| DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts  | Removes reservations or ancillaries from a booking in case the parts were not yet confirmed. | Recommended        |            |
| GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}  |  Gets a bookedOffer of a booking.                      | Recommended        |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{bookedOfferId}  |  Delete a bookedOffer from a booking.               | Recommended        |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{offerId}/passengers/{passengerId}  |  Delete a passenger from bookedOffer of a booking.  |  _Optional_   |        |
| **Purchaser Resource**            | manipulate purchaser                                                           |                    |                                      |                   
| GET  /bookings/{bookingId}/purchaser    | Returns the purchaser's information at booking step.                     | **Mandatory**      |                                      |           
| PATCH  /bookings/{bookingId}/purchaser  | Allows updating a purchaser's information at booking step.               | **Mandatory**      |                                      |           
| POST  /bookings/{bookingId}/purchaser   | Allows creating a purchaser for a booking already existing.              |  _Optional_        |                                      |           
| **Passenger Resource**            | manipulate passengers                                                          |                    |                                      |                                                     
| GET  /bookings/{bookingId}/passengers/{passengerId} | Returns the passenger's information at booking step.         | **Mandatory**      |                                      |                   
| PATCH  /bookings/{bookingId}/passengers/{passengerId} | Allows updating a passenger's information at booking step. | **Mandatory**      |                                      |                   
| GET  /bookings/{bookingId}/passengers | Returns all the passenger's in the booking.                                | **Mandatory**      |                                      |                   
| PATCH  /bookings/{bookingId}/passengers | Allows updating a set of passengers in a batch at booking step.          | **Mandatory**      |                                      |                   
| **Fulfillment Resource**             | manipulate fulfillments                                                     |                    |                                      |                
| PATCH  /fulfillments/{fulfillmentId} | Activates a fulfillment, i.e. changes the status from AVAILABLE to FULFILLED. |  **Conditional**  |  Mandatory if dynamic fulfillments are used (e.g. multi journey ticket packages) |
| GET  /fullfillments                  | get all fulfillments for a booking                                          | Recommended        |                                      |              
| GET  /fulfillments/{fulfillmentId}   | Returns the fulfillment, aka. ticket for the provided id.                   | **Mandatory**      |                                      |         
| GET  /fulfillments/{fulfillmentId}/continuous-service-usage/{continuousServiceUsageId}  | return the continuous service usage including latest updates |  **Conditional**  |  Mandatory if on demand services are used |
| PATCH  /fulfillments/{fulfillmentId}/continuous-service-usage/{continuousServiceUsageId}  |  start or end the usage of a continuous service of an demand vehicle |  **Conditional**  |  Mandatory if on demand services are used |
| **Refund resources**                 | to get and accept a refund offer                                            |                    |                                      |
| POST  /bookings/{bookingId}/refund-offers  | Initiates a refund process by creating a refundOffer resource.        | **Mandatory**      |                                      |         
| GET  /bookings/{bookingId}/refund-offers/{refundOfferId}/confirmation-check  | Verification step (step 1 in a two phase commit process) to run before the effective patch endpoint. Provider do all checks to "guarantee" that refund will work. | Recommended    |   |           
| GET  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Returns the refund offer for the ids provided. Does not return confirmed refunds. | **Mandatory**       |          |         
| PATCH  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Allows to accept and confirm a refund offer.         | **Mandatory**      |                                      |         
| DELETE  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Deletes a refundOffer without waiting for expiry.   |  _Optional_        |                                      |         
| **Exchange resources**                 | to get and accept a exchange offer                                        |  **Conditional**    |  Mandatory in case exchangable products are sold and the exchange is not possible via other channels. ZThis also applies in case the exchange is used to mitigate disruptions and delays. |
| POST  /bookings/{bookingId}/exchange-offers | Returns exchange offers for specified fulfillments or booking parts    |  **Conditional**  |    |
| POST  /bookings/{bookingId}/exchange-operations | Pre-books an exchangeOffer as part of an exchange operation.       |  **Conditional**  |     |
| GET  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} |  Returns the exchange operation with the id provided.  |  **Conditional**  |     |
| PATCH  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} | Allows to update an ongoing exchange operation.     |  **Conditional**  |   |
| DELETE  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} |  Cancels an ongoing exchange operation in provisional state. |  **Conditional**  |  |
| **Release resources**                |  to release a fulfillment (two-step refund where the first step is to mark the release date, release allocated seats, invalidate the ticket. Refund of money is performed in the second step.)   |  _Optional_       |         |
| POST  /bookings/{bookingId}/release-offers | Initiates a release process by creating a releaseOffers resource. |  **Conditional**   | Mandatory if a release is supported    | 
| GET  /bookings/{bookingId}/release-offers/{releaseOfferId} |  Returns the release offer for the ids provided.   |  **Conditional**   | Mandatory if a release is supported    | 
| PATCH  /bookings/{bookingId}/release-offers/{releaseOfferId} | accept and confirm a release offer. |  **Conditional**   | Mandatory if a release is supported    | 
| DELETE  /bookings/{bookingId}/release-offers/{releaseOfferId} |  Deletes a release offer without waiting for expiry.|  **Conditional**   | Mandatory if a release is supported    | 
| **On Hold resources** |  to put a pre-booking on hold for a given time limit                                       |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/on-hold-offer                                                                          |  Creates an on hold offer.    |  **Conditional**   | Mandatory if a release is supported    | 
| PATCH  /bookings/{bookingId}/on-hold-offer/{onHoldOfferId}                                                         |  Confirms the on hold offer.  |  **Conditional**   | Mandatory if a release is supported    | 
| DELETE  /bookings/{bookingId}/on-hold-offer/{onHoldOfferId}                                                        |  Deletes the on hold offer    |  **Conditional**   | Mandatory if a release is supported    | 
| **Travel Account resource**          |  to get a travel account                                                    |                    |                                      |
| GET  /travel-accounts                |   Returns a travel account.                                                 | _Optional_   |   |
| **Cancel Fulfillments resources** |  to cancel fulfillments to reissue them later-on                              |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/cancel-fulfillments-offers Initiates a cancel fulfillments process                     |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| GET  /bookings/{bookingId}/cancel-fulfillments-offers/{cancelFulfillmentsOfferId} | Returns the cancel fulfillments offer for the ids provided.  |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| PATCH  /bookings/{bookingId}/cancel-fulfillments-offers/{cancelFulfillmentsOfferId} | Allows to accept and confirm a cancel fulfillments offer.   |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| DELETE  /bookings/{bookingId}/cancel-fulfillments-offers/{cancelFulfillmentsOfferId} | Deletes a cancel fulfillments offer without waiting for expiry.  |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| **Complaint Management**             |  resources to manage complaints                                              |  _Optional_        |                                      |
| POST  /complaints                    | Allows adding a complaint.                                                   |  **Conditional**   | Mandatory if complaints are supported | 
| GET  /complaints/{complaintId}       | Returns a complaint.                                                         |  **Conditional**   | Mandatory if complaints are supported | 
| PATCH  /complaints/{complaintId}     | Allows updating a complaint.                                                 |  **Conditional**   | Mandatory if complaints are supported | 
| **Reimbursement Management resources**      | to manage reimbursements                                              |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/reimbursements  | Create reimbursement for a booking.                                   |  **Conditional**   | Mandatory if reimbourcement is supported | 
| GET  /bookings/{bookingId}/reimbursements/{reimbursementId}  | Get reimbursement of a booking.                      |  **Conditional**   | Mandatory if reimbourcement is supported | 
| PATCH  /bookings/{bookingId}/reimbursements/{reimbursementId}  | Update reimbursement of a booking.                 |  **Conditional**   | Mandatory if reimbourcement is supported | 
| **Bookings Split resources** |  to split a booking                                                                  |                    |                                      |
| POST  /bookings/{bookingId}/split | Split a booking into multiple bookings.                                          |  _Optional_        |                                      |
| **Master Data Resources**             |                                                                              |                    |                                      |
| GET  /coach-deck-layouts  | Returns all coach deck layouts.                                                          |  **Conditional**   | Mandatory if graphical reservation is supported | 
| GET  /coach-deck-layouts/{layoutId}  | Returns a coach deck layout for a provided id.                                |  **Conditional**   | Mandatory if graphical reservation is supported | 
| GET  /passenger-categories  | Returns all defined passenger categories.                                              |  _Optional_        |                                      |
| GET  /reduction-card-types  | Returns all reduction card definitions.                                                |  **Conditional**   | Mandatory if reduction cards are supported | 
| GET  /zones  |  Returns all zone definitions.                                                                        |  _Optional_        |                                      |
| GET  /products  | Returns all products.                                                                              |  recommended       |                                      |   
| GET  /products/{productId}  | Returns a product for the provided id.                                                 |  **Conditional**   | Mandatory if product tags are used | 
| GET  /product-tags  | Returns all product tags and their grouping.                                                   |  _Optional_        |                                      |
| POST  /products-search  | Search for products based on search parameters.                                            |  _Optional_        |                                      |
| GET  /passenger-categories |  Returns all defined passenger categories.                                              |  _Optional_        |                                      |
| **Search search resources**            |                                                                             |                    |                                      |
| POST  /bookings-search  |  Search for bookings based on search parameters.                                           |  _Optional_        |                                      |
| POST  /products-search  |  Search for products based on search parameters.                                           |  _Optional_        |                                      |
| **Webhooks**            |                                                                                            |                    |                                      |
| POST events             |  Event occurred                                                                            |  recommended       |                                      |   
| **Booking Documents resources** | to get documents                                                                   |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/documents | Allows adding a document to a booking.                                       |  _Optional_        |                                      |
| GET  /bookings/{bookingId}/documents/{documentId} | Returns a booking document.                                      |  _Optional_        |                                      |
| DELETE  /bookings/{bookingId}/documents/{documentId} | Delete a document from a booking.                             |  _Optional_        |                                      |


### Compliance as a Distributor <a name="ComplianceasaDistributor">

The following services/features are mandatory/optional to implement:

| API calls                             | Description                                                                 | Need to Support    | remark                               |
| ------------------------------------- | --------------------------------------------------------------------------- | ------------------ | ------------------------------------ |
| **Version Ressource**                 |                                                                             |                    |                                      |
| `GET /versions`                       | retrieve implemented and upcoming versions                                  |  _Optional_        |                                      |
| **Place Resources**                   | get places                                                                  |                    |                                      |
| `POST /places`                        | search for a place                                                          | _Recommended_      |                                      |
| `GET  /places`                        | search for a place                                                          | _Recommended_      |                                      |
| `GET  /places/{placesId}`             | download all places                                                         | _Optional_         |                                      |
| **Trip planning Resources**           |                                                                             | _Optional_         |                                      |
| `POST /trips-collection`              | search for trips                                                            | _Optional_         |                                      |
| `GET  /trips-collections/{tripsCollectionId}`     |                                                                 | _Optional_         |                                      |
| `POST /trips                          | Returns a new trip for given search parameters based on an existing trip    | _Optional_         |                                      |
| `GET  /trips/{tripId}                 | Returns a trp based on the tripid                                           | _Optional_         |                                      |
| **Offer Resources**                   | resources to get bookable offers                                            |                    |                                      |
| POST  /offers                         | Returns offers for trips or trip search criteria.                           | **Mandatory**      |  trips and trip search criteria must be supported in the request |
| GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}/additional-offers  |   Get additional offers of booked offer for a given booking. |   _Optional_  |                                      |
| **Offer Overview**                   | resources to get an overview of prices without detailed offer information   |                    |                                      |
| POST  /offer-overview-route           | Returns an overview of prices based on route                                |  _Optional_        |                                      |
| POST  /offer-overview-trip            | Returns an overview of prices based on trips                                |  _Optional_        |                                      |
| **Availabilities resources**         |    query availabilities before or after pre-booking                         |                    |                                      |
| POST  /availabilities/vehicle-place-map  | Get a place map for a requested vehicle including availabilities.       |  **Conditional**   |  Mandatory if graphical reservation is supported |
| GET  /availabilities/nearby          | Get availabilities nearby a given place.                                    |  _Optional_        |                                      |
| GET  /availabilities/preferences     |  Get availabilities for a set of preferences.                               |  _Optional_        |                                      |
| POST  /availabilities/on-demand-services |  Get availabilities of an on-demand service.                            |  **Conditional**   | Mandatory if on demand services are supported    | 
| **Booking Resource**                 | manipulate bookings                                                         |                    |                                      |
| POST  /bookings                      |  Creates a booking based on a previously requested offer.                   | **Mandatory**      |                                      |
| GET  /bookings/{bookingId}           |  Returns a booking.                                                         | **Mandatory**      |                                      |
| PATCH  /bookings/{bookingId}         |  Updates a booking but does *not* confirm the booking.                      | Recommended        |                                      |
| DELETE  /bookings/{bookingId}        |  Deletes a booking.                                                         | Recommended        |                                      |
| POST  /bookings/{bookingId}/cleanup  |  Performs a complete cleanup of a booking in a single step                  | Recommended        |                                      |
| GET  /bookings/{bookingId}/history   |  Returns the history of changes to a booking.                               | _Optional_         |                                      |
| POST  /bookings/{bookingId}/fulfillments |  Confirms the booking a triggers the fulfillment of the booking synchronously or asynchronously. | **Mandatory**  |                 |
| PATCH /bookings/{bookingId}/fulfillments |   Optionally finalizes the fulfillments in asynchronous mode.           | _Optional_         |                                      |
| GET  /bookings/{bookingId}/fulfillment-check | Check step (step 1 in a two phase commit process) to run before the effective fulfillment endpoint. | Recommended        |  |
| POST  /bookings/{bookingId}/booked-offers | Creates bookedOffers from offers and adds them in a booking.           | Recommended        |                                      |
| **Booking Part Resource**            | manipulate booking parts                                                    |                    |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{bookedOfferId}/admissions/{admissionId}  | Removes an admission from a booking in case the admission is not confirmed. | Recommended    |           |
| POST  /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts  | Adds a reservation or ancillary not previously added from offer to a booking.  | Recommended        |           |
| DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts  | Removes reservations or ancillaries from a booking in case the parts were not yet confirmed. | Recommended        |            |
| GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}  |  Gets a bookedOffer of a booking.                      | Recommended        |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{bookedOfferId}  |  Delete a bookedOffer from a booking.               | Recommended        |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{offerId}/passengers/{passengerId}  |  Delete a passenger from bookedOffer of a booking.  |  _Optional_   |        |
| **Purchaser Resource**            | manipulate purchaser                                                           |                    |                                      |                   
| GET  /bookings/{bookingId}/purchaser    | Returns the purchaser's information at booking step.                     | **Mandatory**      |                                      |           
| PATCH  /bookings/{bookingId}/purchaser  |  Allows updating a purchaser's information at booking step.              | **Mandatory**      |                                      |           
| POST  /bookings/{bookingId}/purchaser   | Allows creating a purchaser for a booking already existing.              | **Mandatory**      |                                      |           
| **Passenger Resource**            | manipulate passengers                                                          |                    |                                      |                                                     
| GET  /bookings/{bookingId}/passengers/{passengerId} | Returns the passenger's information at booking step.         | **Mandatory**      |                                      |                   
| PATCH  /bookings/{bookingId}/passengers/{passengerId} | Allows updating a passenger's information at booking step. | **Mandatory**      |                                      |                   
| GET  /bookings/{bookingId}/passengers | Returns all the passenger's in the booking.                                | **Mandatory**      |                                      |                   
| PATCH  /bookings/{bookingId}/passengers | Allows updating a set of passengers in a batch at booking step.          | **Mandatory**      |                                      |                   
| **Fulfillment Resource**             | manipulate fulfillments                                                     |                    |                                      |                
| PATCH  /fulfillments/{fulfillmentId} | Activates a fulfillment, i.e. changes the status from AVAILABLE to FULFILLED. |  **Conditional**  |  Mandatory if dynamic fulfillments are used (e.g. multi journey ticket packages) |
| GET  /fullfillments                  | get all fulfillments for a booking                                          | Recommended        |                                      |              
| GET  /fulfillments/{fulfillmentId}   | Returns the fulfillment, aka. ticket for the provided id.                   | **Mandatory**      |                                      |         
| GET  /fulfillments/{fulfillmentId}/continuous-service-usage/{continuousServiceUsageId}  | return the continuous service usage including latest updates |  **Conditional**  |  Mandatory if on demand services are used |
| PATCH  /fulfillments/{fulfillmentId}/continuous-service-usage/{continuousServiceUsageId}  |  start or end the usage of a continuous service of an demand vehicle |  **Conditional**  |  Mandatory if on demand services are used |
| **Refund resources**                 | to get and accept a refund offer                                            |                    |                                      |
| POST  /bookings/{bookingId}/refund-offers  | Initiates a refund process by creating a refundOffer resource.        | **Mandatory**      |                                      |         
| GET  /bookings/{bookingId}/refund-offers/{refundOfferId}/confirmation-check  | Verification step (step 1 in a two phase commit process) to run before the effective patch endpoint. Provider do all checks to "guarantee" that refund will work. | Recommended    |   |           
| GET  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Returns the refund offer for the ids provided. Does not return confirmed refunds. | **Mandatory**       |          |         
| PATCH  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Allows to accept and confirm a refund offer.         | **Mandatory**      |                                      |         
| DELETE  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Deletes a refundOffer without waiting for expiry.   | **Mandatory**      |                                      |         
| **Exchange resources**                 | to get and accept a exchange offer                                        |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/exchange-offers | Returns exchange offers for specified fulfillments or booking parts    |  **Conditional**  |  Mandatory if exchange is supported   |
| POST  /bookings/{bookingId}/exchange-operations | Pre-books an exchangeOffer as part of an exchange operation.       |  **Conditional**  |  Mandatory if exchange is supported   |
| GET  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} |  Returns the exchange operation with the id provided.  |  **Conditional**  |  Mandatory if exchange is supported   |
| PATCH  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} | Allows to update an ongoing exchange operation.     |  **Conditional**  |  Mandatory if exchange is supported   |
| DELETE  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} |  Cancels an ongoing exchange operation in provisional state. |  **Conditional**  |  Mandatory if exchange is supported   |
| **Release resources**                |  to release a fulfillment (two-step refund where the first step is to mark the release date, release allocated seats, invalidate the ticket. Refund of money is performed in the second step.)   |  _Optional_       |         |
| POST  /bookings/{bookingId}/release-offers | Initiates a release process by creating a releaseOffers resource. |  **Conditional**   | Mandatory if a release is supported    | 
| GET  /bookings/{bookingId}/release-offers/{releaseOfferId} |  Returns the release offer for the ids provided.   |  **Conditional**   | Mandatory if a release is supported    | 
| PATCH  /bookings/{bookingId}/release-offers/{releaseOfferId} | accept and confirm a release offer. |  **Conditional**   | Mandatory if a release is supported    | 
| DELETE  /bookings/{bookingId}/release-offers/{releaseOfferId} |  Deletes a release offer without waiting for expiry.|  **Conditional**   | Mandatory if a release is supported    | 
| **On Hold resources** |  to put a pre-booking on hold for a given time limit                                       |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/on-hold-offer                                                                          |  Creates an on hold offer.    |  **Conditional**   | Mandatory if a release is supported    | 
| PATCH  /bookings/{bookingId}/on-hold-offer/{onHoldOfferId}                                                         |  Confirms the on hold offer.  |  **Conditional**   | Mandatory if a release is supported    | 
| DELETE  /bookings/{bookingId}/on-hold-offer/{onHoldOfferId}                                                        |  Deletes the on hold offer    |  **Conditional**   | Mandatory if a release is supported    | 
| **Travel Account resource**          |  to get a travel account                                                    |                    |                                      |
| GET  /travel-accounts                |   Returns a travel account.                                                 |  **Conditional**   | Mandatory if booking via travel account is supported  |
| **Cancel Fulfillments resources** |  to cancel fulfillments to reissue them later-on                              |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/cancel-fulfillments-offers Initiates a cancel fulfillments process                     |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| GET  /bookings/{bookingId}/cancel-fulfillments-offers/{cancelFulfillmentsOfferId} | Returns the cancel fulfillments offer for the ids provided.  |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| PATCH  /bookings/{bookingId}/cancel-fulfillments-offers/{cancelFulfillmentsOfferId} | Allows to accept and confirm a cancel fulfillments offer.   |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| DELETE  /bookings/{bookingId}/cancel-fulfillments-offers/{cancelFulfillmentsOfferId} | Deletes a cancel fulfillments offer without waiting for expiry.  |  **Conditional**   | Mandatory if cancel fulfillment is supported    | 
| **Complaint Management**             |  resources to manage complaints                                              |  _Optional_        |                                      |
| POST  /complaints                    | Allows adding a complaint.                                                   |  **Conditional**   | Mandatory if complaints are supported | 
| GET  /complaints/{complaintId}       | Returns a complaint.                                                         |  **Conditional**   | Mandatory if complaints are supported | 
| PATCH  /complaints/{complaintId}     | Allows updating a complaint.                                                 |  **Conditional**   | Mandatory if complaints are supported | 
| **Reimbursement Management resources**      | to manage reimbursements                                              |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/reimbursements  | Create reimbursement for a booking.                                   |  **Conditional**   | Mandatory if reimbourcement is supported | 
| GET  /bookings/{bookingId}/reimbursements/{reimbursementId}  | Get reimbursement of a booking.                      |  **Conditional**   | Mandatory if reimbourcement is supported | 
| PATCH  /bookings/{bookingId}/reimbursements/{reimbursementId}  | Update reimbursement of a booking.                 |  **Conditional**   | Mandatory if reimbourcement is supported | 
| **Bookings Split resources** |  to split a booking                                                                  |                    |                                      |
| POST  /bookings/{bookingId}/split | Split a booking into multiple bookings.                                          |  _Optional_        |                                      |
| **Master Data Resources**             |                                                                              |                    |                                      |
| GET  /coach-deck-layouts  | Returns all coach deck layouts.                                                          |  **Conditional**   | Mandatory if graphical reservation is supported | 
| GET  /coach-deck-layouts/{layoutId}  | Returns a coach deck layout for a provided id.                                |  **Conditional**   | Mandatory if graphical reservation is supported | 
| GET  /passenger-categories  | Returns all defined passenger categories.                                              |  _Optional_        |                                      |
| GET  /reduction-card-types  | Returns all reduction card definitions.                                                |  **Conditional**   | Mandatory if reduction cards are supported | 
| GET  /zones  |  Returns all zone definitions.                                                                        |  _Optional_        |                                      |
| GET  /products  | Returns all products.                                                                              |  recommended       |                                      |   
| GET  /products/{productId}  | Returns a product for the provided id.                                                 |  **Conditional**   | Mandatory if product tags are used | 
| GET  /product-tags  | Returns all product tags and their grouping.                                                   |  _Optional_        |                                      |
| POST  /products-search  | Search for products based on search parameters.                                            |  _Optional_        |                                      |
| GET  /passenger-categories |  Returns all defined passenger categories.                                              |  _Optional_        |                                      |
| **Search search resources**            |                                                                             |                    |                                      |
| POST  /bookings-search  |  Search for bookings based on search parameters.                                           |  _Optional_        |                                      |
| POST  /products-search  |  Search for products based on search parameters.                                           |  _Optional_        |                                      |
| **Webhooks**            |                                                                                            |                    |                                      |
| POST events             |  Event occurred                                                                            |  recommended       |                                      |   
| **Booking Documents resources** | to get documents                                                                   |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/documents | Allows adding a document to a booking.                                       |  _Optional_        |                                      |
| GET  /bookings/{bookingId}/documents/{documentId} | Returns a booking document.                                      |  _Optional_        |                                      |
| DELETE  /bookings/{bookingId}/documents/{documentId} | Delete a document from a booking.                             |  _Optional_        |                                      |



All [non-functional requirements](../non-functional-requirements) defined in the
services must be fulfilled.

Especially all implementations most support the Tolerant Reader pattern. This
integration pattern helps creating robust communication systems. The idea is to
be as tolerant as possible when reading data from another service. This way,
when the communication schema changes, the readers must not break.

### Compliance as a Carrier aka. Fare Provider <a name="ComplianceasaCarrieraka.FareProvider">

The following services/features are mandatory/optional to implement:

| API calls                             | Description                                                                 | Need to Support    | remark                               |
| ------------------------------------- | --------------------------------------------------------------------------- | ------------------ | ------------------------------------ |
| **Version Ressource**                 |                                                                             |                    |                                      |
| `GET /versions`                       | retrieve implemented and upcoming versions                                  |  _Optional_        |                                      |
| **Offer Resources**                   | resources to get bookable offers                                            |                    |                                      |
| POST  /offers                         | Returns offers for trips or trip search criteria.                           | **Mandatory**      |  trips and trip search criteria must be supported in the request |
| GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}/additional-offers  |   Get additional offers of booked offer for a given booking. |   _Optional_  |                                      |
| **Offer Overview**                   | resources to get an overview of prices without detailed offer information   |                    |                                      |
| POST  /offer-overview-route           | Returns an overview of prices based on route                                |  _Optional_        |                                      |
| POST  /offer-overview-trip            | Returns an overview of prices based on trips                                |  _Optional_        |                                      |
| **Availabilities resources**         |    query availabilities before or after pre-booking                         |                    |                                      |
| POST  /availabilities/vehicle-place-map  | Get a place map for a requested vehicle including availabilities.       |  **Conditional**   |  Mandatory if graphical reservation is supported |
| GET  /availabilities/nearby          | Get availabilities nearby a given place.                                    |  _Optional_        |                                      |
| GET  /availabilities/preferences     |  Get availabilities for a set of preferences.                               |  _Optional_        |                                      |
| POST  /availabilities/on-demand-services |  Get availabilities of an on-demand service.                            |  **Conditional**   | Mandatory if on demand services are supported    | 
| **Booking Resource**                 | manipulate bookings                                                         |                    |                                      |
| POST  /bookings                      |  Creates a booking based on a previously requested offer.                   | **Mandatory**      |                                      |
| GET  /bookings/{bookingId}           |  Returns a booking.                                                         | **Mandatory**      |                                      |
| PATCH  /bookings/{bookingId}         |  Updates a booking but does *not* confirm the booking.                      | Recommended        |                                      |
| DELETE  /bookings/{bookingId}        |  Deletes a booking.                                                         | Recommended        |                                      |
| POST  /bookings/{bookingId}/cleanup  |  Performs a complete cleanup of a booking in a single step                  | Recommended        |                                      |
| GET  /bookings/{bookingId}/history   |  Returns the history of changes to a booking.                               | _Optional_         |                                      |
| POST  /bookings/{bookingId}/fulfillments |  Confirms the booking a triggers the fulfillment of the booking synchronously or asynchronously. | **Mandatory**  |                 |
| PATCH /bookings/{bookingId}/fulfillments |   Optionally finalizes the fulfillments in asynchronous mode.           | _Optional_         |                                      |
| GET  /bookings/{bookingId}/fulfillment-check | Check step (step 1 in a two phase commit process) to run before the effective fulfillment endpoint. | Recommended        |  |
| POST  /bookings/{bookingId}/booked-offers | Creates bookedOffers from offers and adds them in a booking.           | Recommended        |                                      |
| **Booking Part Resource**            | manipulate booking parts                                                    |                    |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{bookedOfferId}/admissions/{admissionId}  | Removes an admission from a booking in case the admission is not confirmed. | Recommended    |           |
| POST  /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts  | Adds a reservation or ancillary not previously added from offer to a booking.  | Recommended        |           |
| DELETE /bookings/{bookingId}/booked-offers/{bookedOfferId}/offer-parts  | Removes reservations or ancillaries from a booking in case the parts were not yet confirmed. | Recommended        |            |
| GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}  |  Gets a bookedOffer of a booking.                      | Recommended        |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{bookedOfferId}  |  Delete a bookedOffer from a booking.               | Recommended        |                                      |
| DELETE  /bookings/{bookingId}/booked-offers/{offerId}/passengers/{passengerId}  |  Delete a passenger from bookedOffer of a booking.  |  _Optional_   |        |
| **Purchaser Resource**            | manipulate purchaser                                                           |                    |                                      |                   
| GET  /bookings/{bookingId}/purchaser    | Returns the purchaser's information at booking step.                     | **Mandatory**      |                                      |           
| PATCH  /bookings/{bookingId}/purchaser  |  Allows updating a purchaser's information at booking step.              | **Mandatory**      |                                      |           
| POST  /bookings/{bookingId}/purchaser   | Allows creating a purchaser for a booking already existing.              | **Mandatory**      |                                      |           
| **Passenger Resource**            | manipulate passengers                                                          |                    |                                      |                                                     
| GET  /bookings/{bookingId}/passengers/{passengerId} | Returns the passenger's information at booking step.         | **Mandatory**      |                                      |                   
| PATCH  /bookings/{bookingId}/passengers/{passengerId} | Allows updating a passenger's information at booking step. | **Mandatory**      |                                      |                   
| GET  /bookings/{bookingId}/passengers | Returns all the passenger's in the booking.                                | **Mandatory**      |                                      |                   
| PATCH  /bookings/{bookingId}/passengers | Allows updating a set of passengers in a batch at booking step.          | **Mandatory**      |                                      |                   
| **Refund resources**                 | to get and accept a refund offer                                            |                    |                                      |
| POST  /bookings/{bookingId}/refund-offers  | Initiates a refund process by creating a refundOffer resource.        | **Mandatory**      |                                      |         
| GET  /bookings/{bookingId}/refund-offers/{refundOfferId}/confirmation-check  | Verification step (step 1 in a two phase commit process) to run before the effective patch endpoint. Provider do all checks to "guarantee" that refund will work. | Recommended    |   |           
| GET  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Returns the refund offer for the ids provided. Does not return confirmed refunds. | **Mandatory**       |          |         
| PATCH  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Allows to accept and confirm a refund offer.         | **Mandatory**      |                                      |         
| DELETE  /bookings/{bookingId}/refund-offers/{refundOfferId}  | Deletes a refundOffer without waiting for expiry.   | **Mandatory**      |                                      |         
| **Exchange resources**                 | to get and accept a exchange offer                                        |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/exchange-offers | Returns exchange offers for specified fulfillments or booking parts    |  **Conditional**  |  Mandatory if exchange is supported   |
| POST  /bookings/{bookingId}/exchange-operations | Pre-books an exchangeOffer as part of an exchange operation.       |  **Conditional**  |  Mandatory if exchange is supported   |
| GET  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} |  Returns the exchange operation with the id provided.  |  **Conditional**  |  Mandatory if exchange is supported   |
| PATCH  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} | Allows to update an ongoing exchange operation.     |  **Conditional**  |  Mandatory if exchange is supported   |
| DELETE  /bookings/{bookingId}/exchange-operations/{exchangeOperationId} |  Cancels an ongoing exchange operation in provisional state. |  **Conditional**  |  Mandatory if exchange is supported   |
| **Release resources**                |  to release a fulfillment (two-step refund where the first step is to mark the release date, release allocated seats, invalidate the ticket. Refund of money is performed in the second step.)   |  _Optional_       |         |
| POST  /bookings/{bookingId}/release-offers | Initiates a release process by creating a releaseOffers resource. |  **Conditional**   | Mandatory if a release is supported    | 
| GET  /bookings/{bookingId}/release-offers/{releaseOfferId} |  Returns the release offer for the ids provided.   |  **Conditional**   | Mandatory if a release is supported    | 
| PATCH  /bookings/{bookingId}/release-offers/{releaseOfferId} | accept and confirm a release offer. |  **Conditional**   | Mandatory if a release is supported    | 
| DELETE  /bookings/{bookingId}/release-offers/{releaseOfferId} |  Deletes a release offer without waiting for expiry.|  **Conditional**   | Mandatory if a release is supported    | 
| **On Hold resources** |  to put a pre-booking on hold for a given time limit                                       |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/on-hold-offer                                                                          |  Creates an on hold offer.    |  **Conditional**   | Mandatory if a release is supported    | 
| PATCH  /bookings/{bookingId}/on-hold-offer/{onHoldOfferId}                                                         |  Confirms the on hold offer.  |  **Conditional**   | Mandatory if a release is supported    | 
| DELETE  /bookings/{bookingId}/on-hold-offer/{onHoldOfferId}                                                        |  Deletes the on hold offer    |  **Conditional**   | Mandatory if a release is supported    | 
| **Travel Account resource**          |  to get a travel account                                                    |                    |                                      |
| GET  /travel-accounts                |   Returns a travel account.                                                 |  **Conditional**   | Mandatory if booking via travel account is supported  |
| **Complaint Management**             |  resources to manage complaints                                              |  _Optional_        |                                      |
| POST  /complaints                    | Allows adding a complaint.                                                   |  **Conditional**   | Mandatory if complaints are supported | 
| GET  /complaints/{complaintId}       | Returns a complaint.                                                         |  **Conditional**   | Mandatory if complaints are supported | 
| PATCH  /complaints/{complaintId}     | Allows updating a complaint.                                                 |  **Conditional**   | Mandatory if complaints are supported | 
| **Reimbursement Management resources**      | to manage reimbursements                                              |  _Optional_        |                                      |
| POST  /bookings/{bookingId}/reimbursements  | Create reimbursement for a booking.                                   |  **Conditional**   | Mandatory if reimbourcement is supported | 
| GET  /bookings/{bookingId}/reimbursements/{reimbursementId}  | Get reimbursement of a booking.                      |  **Conditional**   | Mandatory if reimbourcement is supported | 
| PATCH  /bookings/{bookingId}/reimbursements/{reimbursementId}  | Update reimbursement of a booking.                 |  **Conditional**   | Mandatory if reimbourcement is supported | 
| **Master Data Resources**             |                                                                              |                    |                                      |
| GET  /coach-deck-layouts  | Returns all coach deck layouts.                                                          |  **Conditional**   | Mandatory if graphical reservation is supported | 
| GET  /coach-deck-layouts/{layoutId}  | Returns a coach deck layout for a provided id.                                |  **Conditional**   | Mandatory if graphical reservation is supported | 
| GET  /passenger-categories  | Returns all defined passenger categories.                                              |  _Optional_        |                                      |
| GET  /reduction-card-types  | Returns all reduction card definitions.                                                |  **Conditional**   | Mandatory if reduction cards are supported | 
| GET  /zones  |  Returns all zone definitions.                                                                        |  _Optional_        |                                      |
| GET  /passenger-categories |  Returns all defined passenger categories.                                              |  _Optional_        |                                      |
| **Webhooks**            |                                                                                            |                    |                                      |
| POST events             |  Event occurred                                                                            |  recommended       |                                      |   


| Resources                            | Description                                                                 | Need to Support                             |
| ------------------------------------ | --------------------------------------------------------------------------- | ------------------------------------------- |
| `/offers`                            | Resources to get bookable offers                                            | **Mandatory** is to provide fare offers     |
| `/bookings`                          | Resources to manipulate bookings                                            | **Mandatory**                               |
| `/bookings/{bookingId}/passengers`   | Resources to manipulate passenger information at every stage of the flow    | **Mandatory**                               |
| `/bookings/{bookingId}/purchaser`    | Resources to manipulate a purchasers information at every stage of the flow | **Mandatory**                               |
| `/bookings/{bookingId}/fulfillments` | Resources to retrieve fulfillments, e.g. tickets                            | **Mandatory** is to support A4 PDF tickets. |
| `/bookings/{bookingId}/refundOffers` | Resources to get and accept a refund offer                                  | **Mandatory** is to support full refund.    |
| `/booking-search/`                   | Resources to search for bookings                                            | _Optional_                                  |
| `/products-search/`                  | Resources to search for products                                            | _Optional_                                  |
| `/fulfillments`                      | Resources to retrieve fulfillments, e.g. tickets                            | **Mandatory** is to support A4 PDF tickets. |

| Trip planning Resources | Description                     | Need to Support |
| ----------------------- | ------------------------------- | --------------- |
| `/places`               | Resources to search for a place | _Optional_      |
| `/trips`                | Resources to search for trips   | _Optional_      |

| Booking Modifications Resources                                    | Description                                                           | Need to Support                                                               |
| ------------------------------------------------------------------ | --------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `/bookings/{bookingId}/booked-offers/{bookedOfferId}/ancillaries`  | Resources to manipulate parts of a booking consisting of ancillaries  | _Conditional_                                                                 |
| `/bookings/{bookingId}/booked-offers/{bookedOfferId}/reservations` | Resources to manipulate parts of a booking consisting of reservations | _Conditional_; mandatory to be supported in case seat assignment is provided. |

| Reservation Resources | Description                                                   | Need to Support                                                               |
| --------------------- | ------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `/availabilities`     | Resources to get information on available seats for a booking | _Conditional_; mandatory to be supported in case seat assignment is provided. |

| Advanced After Sales Resources                    | Description                                                                                       | Need to Support |
| ------------------------------------------------- | ------------------------------------------------------------------------------------------------- | --------------- |
| `/bookings/{bookingId}/documents`                 | Resources to add documents to a booking                                                           | _Optional_      |
| `/bookings/{bookingId}/exchange-operations`       | Resources to manage exchange operations                                                           | _Optional_      |
| `/bookings/{bookingId}/release-offers`            | Resources to get and accept a release offer to return a ticket as a preliminary step for a refund | _Optional_      |
| `/bookings/{bookingId}/reimbursements`            | Resources to manage reimbursements of unused tickets                                              | _Optional_      |
| `/bookings/{bookingId}/on-hold-offers`            | Resources to manage on hold offers (extensions of the booking time limit)                         | _Optional_      |
| `/bookings/{bookingId}/cancel-fulfillment-offers` | Resources to cancel a fulfillment                                                                 | _Optional_      |

| Complaint Resources | Description                    | Need to Support |
| ------------------- | ------------------------------ | --------------- |
| `/complaints`       | Resources to manage complaints | _Optional_      |

| Master Data Resources | Description                                                        | Need to Support |
| --------------------- | ------------------------------------------------------------------ | --------------- |
| `/coach-layouts`      | Resources to get layouts of coaches                                | _Optional_      |
| `/coach-deck-layouts` | Resources to get coach deck layouts                                | _Optional_      |
| `/places`             | Resources to get all places                                        | _Optional_      |
| `/products`           | Resources to retrieve products information on one or more products | _Optional_      |
| `/product-tags`       | Resources to retrieve products tags and their grouping             | _Optional_      |
| `/reduction-cards`    | Resources to retrieve reduction cards                              | _Optional_      |
| `/zones`              | Resources to retrieve zone information                             | _Optional_      |

All [non-functional requirements](../non-functional-requirements) defined in the
services must be fulfilled.

On a technical level the implementation must support the Tolerant Reader
pattern. This integration pattern helps creating robust communication systems.
The idea is to be as tolerant as possible when reading data from another
service. This way, when the communication schema changes, the readers must not
break.

An implementation of specification is compliant with the specification if for a
given version

- A feature specified in the data structure is implemented

Or

- A fare providing the feature in its data is excluded from sale

A system receiving data for a fare must be able to understand all features and
rules of the fare defined in the data and obey these features and rules or must
not sell such a fare.
