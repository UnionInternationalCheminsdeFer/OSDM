---
layout: page
title: Integrating On Demand Services
hide_hero: true
permalink: /spec/on-demand-services/
---
## Table of contents

1. [Introduction](#introduction)
2. [Use Cases](#useCases)
3. [Offer and Booking Process](#Booking)
4. [Allocation of Service](#Allocation)
5. [Usage of Service](#Usage)

## Introduction <a name="introduction">

This page describes the integration of OSDM with TOMP to include on-Demand-Services on the first ad last mile of a journey.


## Use Cases <a name="useCases">

A retailer requests a trip offer collection where trhe first mile can be made via an On-Demand-Service. The retailer expects a complete offer and the distributor to handle the connection to the provider of the On-Demand-Service.


### offer/booking <a name="booking">

Case 1: Additional Offer to an existing booking:

        The additional offer is requested at the end or beginn of the times journey

        GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}/additional-offers

        additional descriptions in offer and booking / product
              - service description (link to images)
              - pricing description
              - allocation procedure description
              - usage procedure description
              - description on handling accidents/damages/irregularities     
        

Case 2: Initial Offer

        Request an offer 
        Search for available services nearby before conirming the offer



Case 3: book the service and allocate the service later

        search for services referes to booking



payment alternatives:

  - Fixed price of the bookin
            - should work without changes
  - Prepaid booking and refund of unused part
            - display of amount used and refundable part needed.
  - Post Payment
            - display of amount used needed
    


### allocate a service <a name="allocation">


search for available ContinuousServices by:

     - JourneyId  (from Trip)
     - bookingId (context of a booking or a prebooked service) / offerId (context of an offer without booking)
     - passengerRef  (multiple ones in case of taxi, self driving taxi)
     - BookingPartId of a previous booking (special price as add on to booked timed services, ..)
     - geo-coordinate of requested pick-up place
     - geo-coordinate of requestor

    reply: list of available Continuous Services
       generic
           description
              - service description (link to images)
              - pricing description
              - allocation procedure description
              - usage procedure description
              - description on handling accidents/damages/irregularitries       
       per service:
           id
           description
              - pricing
              - allocation procedure description
              - usage procedure description
              - description on handling accidents/damages/irregularitries
           available but not close enough for allocation / available for allocation
           fee for allocation
           time limit for blocking
           geo-location of the service
           time to arrival at pick-up-place (taxi,..)
           alternative pick-up-place

### allocate service

block ContinuousService by id
           post usage
           
           return ContinuousServiceUsage:
              id
              status = blocked
              usage procedure description
              descrition on end of usage
              credentials to start the usage  (e.g. nfc-enabled pkpass, ...)
              time limit for start of usage

delete usage by id

refund if allocation fails?

### start and end usage <a name="usage">

start usage on continuous service usage by id
          patch usage   
          return ContinuousServiceUsage: 
              status = in use
              usage procedure description
              descrition on end of usage        
    
end usage on continuous service usage by id
          patch usage
          request:
             EndUsageRequest
                id
                image of parking situation
          return ContinuousServiceUsage 
             status
             refund of unused prepayed amount

get usage of continuous service
         return ContinuousServiceUsage 
               status
               amount to pay
               remaining amount for prepayed usage
               time to arrival at pick-up-place (taxi,..)




## Offer and Booking Process <a name="tompBooking">

| OSDM Service called by the retailer  | TOMP Service(s) called by the distributor | required mappings  | 
| ------------------------------------ | ----------------------------------------- | ------------------ | 
|                                      |                                           |                    | 


