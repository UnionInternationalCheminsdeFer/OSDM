---
layout: page
title: On Demand Services
hide_hero: true
permalink: /spec/processes/
---

## Table of contents

1. [Introduction](#introduction)
2. [Use Cases](#usecases)
2. [Process](#process)

## Introduction <a name="introduction">

The process described covers unscheduled on-demand transport modes. These include:

   - bicycles (e-bike, bike, cargo bike, scooter)
   - cars (taxis, self-driving vehicles,..)

The initial booking follows the OSDM flow from offer to fulfillment. The additional processes to allocate the devide are handled in the fulfillment resource. Pos-Payment is 
handled via an additional booking part generated on the provider side at the end of the usage of the vehicle.

## Use Cases <a name="usecases">

### Shallow Integration of on-demand services

The OSDM API provides the trip including the continuous services and also provides initial offers for the service. This service can be booked in OSDM, but the 
fulfillment only includes a link to the application providing the service. The actual booking and payment of the service is made in the application of the service provider. 
The traveller needs to install the provider app (or use a web interface if possible) and he needs to register there.    

### Deep Integration of on-demand services

The OSDM API handles the complete process of booking a continuous service, searching for the devices, starting and ending the usage of the devices and providing the pricing information.

### Deep Integration of on-demand services - pre-payment

The initial booking requires a payment. In case the usage does not cover the full amount a refund is created.

### Deep Integration of on-demand services - post-payment

The initial booking does not require a payment. In case the price is provided at the end of the usage of the service.

### Reembourcement

The existing reembourcement flow is used to handle claims due to issues with the devices like damages, empty batteries, ...)

### Get updates on the service usage (optional)

Information on time till arrival at pick-up, costs of usage, ...


## Process <a name="process">


### find on-demand service in trip search

The trip search provides on-demand services as continuous services. The continuous service provides the possibility for using this service, not the individual device (e.g. bicycle). 

TODO: 
 - The ModeFilter needs additional values to exclude bicycles, taxis or scooters from the search
 - The IndiviualMode needs additional values to indicate electric bicycles


Schedules services which need to be confirmed (e.g. by phone) to stop are not considered here, they follow the existing OSDM sales flow.



### offer for continuousService

The offer for the continuous service is provided as cContinuousServiceOfferPart inheriting from AbstractOfferPart

TODO: new ContinuousOfferPart included in Offer.
     
ContinuousServiceOfferPart:

       pick-up-place 
           id
           description
           allocation procedure description
           available number of service devices (bicycles, scooters, taxis, large taxis, ...)
               - list of types and numbers
           available for blocking - is the device already available for blocking until the usage starts
           time limit for blocking - who long can the device be blocked until the usage starts
           process indications - indication how the service usage is handled
              - shallow integration
              - deep integration
              - prepayed
              - postpayed
              - usage starts automatically (e.g. by entering a key code at the vehicle)
              - usage ends automatically (e.g. by locking the service) - The end of the usage does not need to be handled via OSDM
              - updates provided before pick-up (e.g. current location of a taxi)
              - updates provided after pick-up (e.g. price for current consumption)
              - parking image required
              - tip supported
           geo-location of the service (pick-up-place)
           time to arrival at pick-up-place (taxi,..) - When is the devide to be expected at the pic-up place
       alternative pick-up-places: 
           - same as for the initial pick-up-place


GET /availabilities/continuousServiceOfferPart/{id}    to get an updated list of available vehicles and pick-up places


### booking

Creates an bookingPart for the continuousServiceOfferPart. 

     TODO new ContinuousServiceBookingPart:

     POST bookings

     ContinuousServiceBookingPart
     - no price in case of post payment
     + elements from the offer part



To get an updated list of available vehicles and pick-up places:

    GET /availabilities/continuousServiceBookingPart/{id}   

       


### confirm booking

The confirmation creates fulfillments for the continuousServiceBookingPart(s)

     POST /bookings/{bookingId}/fulfillments  creates a Fulfillment with:

          In case of a shallow integration
                    a smart link to the mobility provider app

          In case of a deep integration
                    a fulfillment that needs to be activated to block the vehicle for the service

Up to here the steps are made together with the booking of the other booking parts. In case of a combined long distance journey the next steps would follow shortly before
the on-demand service will be used.

In case of a shallow integration the OSDM flow ends here.

### block a vehicle for the service

Blocking a vehicle reserves the vehicle for some time to walk to the pick-up-place or until the car arrives.

To get an updated list of available pick-up places and vehicles:

     GET /availabilities/continuousServiceBookingPart/{id}    

To block the vehicle:

     PATCH /fulfillments/{fulfillmentId}

     Request:
        TODO additional selection elements in the request:
           - pick-up-location
           - device type (e-bike, normal bike, ...)

     Reply:
           the fulfillmentId(s) updated:

           TODO: include an ContinuousServiceUsage Object in the fulfillment
    
           fulfillment updated to include:
               ContinuousServiceUsage(s)
                 id
                 status
                    - vehicle-blocked
                    - usage-started
                    - blocking-time-out
                    - usage-ended
                    - usage-time-out
                 pricing status (post payment)
                   - final (default)
                   - no charges jet
                   - accumulating prices
                 usage procedure description
                 description on end of usage
                 credentials to start the usage  (e.g. nfc-enabled pkpass, ...)
                 time limit for start of usage
                 + fee for blocking (in Fee Object)

### delete 

Delete a blocking in case you change your mind or the vehicle is broken

         DELETE fulfillment/{id}/continuousServiceUsage/{id}

### start usage

Start using the vehicle. This might as well been triggered by the vehicle itself. 

         PATCH fulfillment/{id}/continuousServiceUsage/{id}:

         start usage on continuous service usage by id
               request:
                     status = start
                     id
               return    
                    changed fulfillment(s)

### end usage 

This ends the usage. This might as well be triggered by the vehicle itself (e.g. be locking the vehicle).

            PATCH fulfillment/{id}/continuousServiceUsage/{id}:
               request:
                     status = end
                     id
                     image of parking situation
               return ContinuousServiceUsage 
                  status


At the end of the usage the provider updates the booking to reflect the required payment:

                  in case of post-payment: update ContinuousServiceBookingPart in the booking:
                    - including the price                   
                    - pricing status --> final
                    - fulfillment documents on the pricing / calculation of costs
                  in case of pre-payment: 
                    - including a new refund on the existing ContinuousServiceBookingPart
                    - fulfillment documents on the pricing / calculation of costs


### reembourcement:

   Reemborcement uses the already defined reembourcement flow.

   TODO:   additional reason codes needed
               - vehicle broken
               - vehicle battery empty
               - vehicle not found
               - vehicle did not arrive


### tracking

optional: get updates on the usage status:

          GET fulfillment/{id}/continuousServiceUsage/{id}:
          return ContinuousServiceUsage
               status
               geo-location of the vehicle
               amount to pay (at the current usage)
               remaining amount for prepayed usage
               time till arrival at pick-up-place (taxi,..)






