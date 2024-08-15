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

A consumer of a trip offer collection where the first mile can be made via an On-Demand-Service. The retailer expects a complete offer and the distributor to handle the connection to the provider of the On-Demand-Service.

The consumer can search for available vehicles that can provide the service. He can select a service which becomes blocked for other consumers. 
The consumer can start the usage of the service with the allocated vehicle.
The consumer can end the usage of the service with the vehicle in use.

The providers may have implemented different pricing and payment schemes:

        - prepayed fixed price or included in an overall admission booking part
        - prepayed with pay per use and a refund on unused time or distance
        - postpayment with pay per use based on time or distance

### offer/booking <a name="booking">

Case 1: Additional Offer to an existing booking:

        The additional offer is requested at the end or beginn of the times journey

        GET  /bookings/{bookingId}/booked-offers/{bookedOfferId}/additional-offers

        additional descriptions in offer and booking / product
              - service description (link to images?)
              - pricing description
              - allocation procedure description
              - usage procedure description
              - description on handling accidents/damages/irregularities     

        find a service vehicle, allocate it, start using it, end using it

Case 2: Initial Offer

        Request an offer 
        Search for available services nearby before confirming the offer based on offerpartid

        find a service vehicle, allocate it, start using it, end using it


Case 3: book the service and allocate the service later

        search for services referes to bookingpart

        find a service vehicle, allocate it, start using it, end using it


payment alternatives:

  - Fixed price of the booking
            - should work without changes
  - Prepaid booking and refund of unused part
            - display of amount used and refundable part needed. (indicatedConsumption already defined in bookingPart)
  - Post Payment
            - display of amount used needed (indicatedConsumption already defined in bookingPart)
    

### Resources:

ContinuousServuces: just the endpoint to seatch for service vehicles providing the continuous service
ServiceVehicle: A service vehicle that could ppotentially provide a continuous service
ServiceVehicleUsage: The acual allocated service vehicle for the continuous service



### allocate a service <a name="allocation">


search for available ContinuousServices by:

    PATCH continuousServices
             ContinuousServiceVediclesSearcRequest:
                     - JourneyId/trip section  (from Trip)
                     - bookingId (context of a booking or a prebooked service) / offerId (context of an offer without booking)
                     - passengerRef  (multiple passengers in case of taxi, self driving shuttle) or number of passengers?
                     - BookingPartId of a previous booking (special price as add on to booked timed services, ..)
                     - geo-coordinate of requested pick-up place
                     - geo-coordinate of requestor

            reply: list of available Continuous Service Vehicles
                      - description
                              - service description (link to images)
                              - pricing description
                              - allocation procedure description
                              - usage procedure description
                              - description on handling accidents/damages/irregularitries       
                      - per service vehicle:
                           id
                           description
                              - pricing
                              - allocation procedure description
                              - usage procedure description
                              - description on handling accidents/damages/irregularitries
                           available but not close enough for allocation / available for allocation
                           fee for allocation
                           time limit for blocking
                           geo-location of the service vehicle
                           estimated time of arrival at pick-up-place (taxi,..)
                           alternative pick-up-place
                           estimated price (in case of pay per use)

### allocate service vehicle

allocate Service Vehicle by id. The Service vehicle gets blocked for othre requests and the passenger(s) can start the usage of the vehicle

           POST /ServiceVehicleUsage serviceVehicleId 
           request:
              passengerRef(s)
           
           return ServiceVehicleUsage:
              id
              status = allocated
              usage procedure description
              descrition on end of usage
              credentials to start the usage  (e.g. code, nfc-enabled pkpass, ...)
              time limit to start the usage

           DELETE ServiceVehicleUsage by id
            


notification in case
  - allocation expires
  - allocation is changed (new taxi)
  - usage ends
  - usage ends due to missuse (e.g. area restrictions)
  - usage ends for technical reasons (e.g. battery empty)

refund if allocation fails?



### start and end usage <a name="usage">


start usage on continuous service usage by id

        PATCH ServiceVehicleUsage by id
          StartUsageRequest
                  optionally provide credentials (scanned vehicle barcode   
                  
          return ContinuousServiceUsage: 
              status = in use
              usage procedure description
              descrition on end of usage        
    
end usage on continuous service usage by id
          PATCH ServiceVehicleUsage by id
          request:
             EndUsageRequest
                id
                image of parking situation
          return ServiceVehicleUsage
             status
             refund of unused prepayed amount
             driver tip?
                
         GET ServiceVehicleUsage by id
             return:   ServiceVehicleUsage including
                      - id
                      - status
                          - WAITING_TO_START
                          - STARTED
                          - CONTINUING
                          - ENDED
                      - usage procedure description
                      - descrition on end of usage
                      - technical features
                         - IMAGE_OF_PARKKING_REQUIRED
                         - NFC_PKPASS_SUPPORT_REQUIRED
                         - TIP_OPTION_SUPPORTED
                      - credentials to start the usage  (e.g. code, nfc-enabled pkpass, ...)
                      - time limit to start the usage
                      - time of starting the usage
                      - time limit to end the usage
                      - time of ending the usage
                      - geo-coordinate to end the usage / place?
                      - geo-coordinate of the current location
                      - descriptions from the ServiceVehicle
                      - bookingPartId                                          --> fulfillments for billing, refund of unused prepayed amount
                      - remaining amount for prepayed usage                    --> in corresponding booking part?
                      - current refund amount if usage ends                    --> in corresponding booking part?
                      - current amount used                                    --> in corresponding booking part?
                      - current xyz used  /in case of fixed time or distance   --> in corresponding booking part?
                      - current xyz left  /in case of fixed time or distance   --> in corresponding booking part?



--
