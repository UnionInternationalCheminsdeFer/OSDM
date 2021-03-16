---
layout: page
title: Non-Functional Requirements
hide_hero: true
permalink: /spec/nonfunctionalRequirements/
---

## Non-Functional Requirements

### Non-Functional Requirements for Allocator Services

| Resources  | Supported Look-2-Book Rate | Response Times (msec) | Required Error Handling |
|----|----|----|---|
|`/locations` and `/trips` | TODO | TODO | |
|`/trip-offers-collection` | 1000:1 | 800 | | 
|`/offers` | 100:1 |  800 ||
|`/offers/{offerId}/...` | 5:1 | 600 ||
|`/bookings |  1:1 | 400 | Retry of the booking request followed by a delete booking/{bookingId} in case the booking is not needed any more. The error handling must be repeated for 3 days but no further than the train departure or until an appropriate reply was received indicating that the booking was not made.|
|`/bookings/{id}/passengers` |   0,01:1|   400 | retry| 
|`/bookings/{id}/fulfillements` |    1:1 |  600 | |  
|`/fulfillements`|   1,1:1 |   400 | | 
|`/bookings/{id}/refundOffers |  0,5:1 |   800 | | 
|`/bookings/{id}/exchangeOffers` |   0,01:1 |  800 | | 
|`/coachLayouts` |   Once per day |    10000  | |  
|`/coachLayouts/{layoutId}` |    2:1|  300 | | 
|`/coachLayouts/offerId=1234567890` |    2:1|  300 | | 


### Non-Functional Requirements for Fare Provider Services

### Compliance as a Fare Provider / Carrier


Mandatory service level requirements to be fulfilled by a fare provider / carrier.
The Look-2-Book rate relates to the number of bookings created by the type of offer request.
The expected average response time in milliseconds that a service must provide includes the infrastructure of the provider of the server (firewalls, load balancer, circuit breaker and application) but not the network in-between the sender and receiver.
Deviating service level requirements can be defined bilaterally.


| Resources  | Supported Look-2-Book Rate | Response Times (msec) | Required Error Handling |
|----|----|----|---|
|`/locations` | TODO | TODO | |
|`/trip-offers-collection` | 1000:1 | 400 | | 
|`/offers` | 100:1 |  400 ||
|`/offers/{offerId}/...` | 5:1 | 400 ||
|`/offers/{offerId}/fares/{fareId}` |    5:1|  300 || 
|`/bookings |  1:1 | 200 | Retry of the booking request followed by a delete booking/{bookingId} in case the booking is not needed any more. The error handling must be repeated for 3 days but no further than the train departure or until an appropriate reply was received indicating that the booking was not made.|
|`/bookings/{id}/passengers` |   0,01:1|   200 | retry| 
|`/bookings/{id}/fulfillements` |    1:1 |  200 | |  
|`/fulfillements`|   1,1:1 |   400 | | 
|`/bookings/{id}/refundOffers |  0,5:1 |   400 | | 
|`/bookings/{id}/exchangeOffers` |   0,01:1 |  400 | | 
|`/coachLayouts` |   Once per day |    10000  | |  
|`/coachLayouts/{layoutId}` |    2:1|  200 | | 
|`/coachLayouts/offerId=1234567890` |    2:1|  200 | | 



