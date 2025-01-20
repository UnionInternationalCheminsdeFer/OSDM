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

The OSDM API handles the complete process of booking a continuous service, searching for the decices, starting and ending the usae of the devices and providing the pricing information.

### Deep Integration of on-demand services - pre-payment

The initial booking requires a payment. In case the usage does not cover the full amount a refund is created.

### Deep Integration of on-demand services - post-payment

The initial booking does notrequire a payment. In case the price is provided at the end of the usage of the service.

### Reembourcement

The existing reembourcement flow is used to handle claims due to issues with the devices like damages, empty batteries, ...)

### Get updates on the service usage (optional)

Information on time till arrival at pick-up, costs of usage, ...


## Process <a name="process">


### find on-demand service in trip search

The trip search provides on-demand services as continuous services. The continuous service provides the possibility for using this service, not the individual device (e.g. bicycle). 

The trip search can be filtered to include and exclude continuous services via the ModeFilter for.

 - ON_DEMAND_SERVICE
 - BICYCLE
 - ELECTRIC_BICYCLE
 - CARGO_BICYCLE  
 - SCOOTER     
 - TAXI          
 - SELF_DRIVING_CAR

Schedules services which need to be confirmed (e.g. by phone) to stop are not considered here, they follow the existing OSDM sales flow.



### offer for continuousService

The offer for the continuous service is provided as ContinuousServiceOfferPart inheriting from AbstractOfferPart.

The offer part includes an initial list of pick-up places for on-demand services with available vehicles and a a description on the processes to use the service. The pick-up places are located close to the place indicated in the trip section or in the location provided with a non trip search.

The processes implemented via OSDM are indicated as a list of tags. 
    
The list of pick-up places can be updated via the availabilities request:

```
   GET /availabilities/continuousServiceOfferPart/{id}    
```


### booking

The booking setp creates an ContinuousServiceBookingPart for the ContinuousServiceOfferPart. 

In case of a post-payment scenario the price will be zero. In this case the booking part will be changed after the usage of the on-demand vehicle to 
include the final price and optionall a tip (e.g. in case of a taxi).

The list of pickup places can be updated using 

```
   GET /availabilities/continuousServiceOfferPart/{id}    
```
   
with the id of the ContinuousServiceBookingPart in the path.

### confirm booking

The confirmation creates fulfillments for the continuousServiceBookingPart(s).

```
     POST /bookings/{bookingId}/fulfillments  
```

creates a Fullfillment with:

   - In case of a shallow integration: a smart link to the mobility provider app

   - In case of a deep integration: a fulfillment that needs to be activated to block the vehicle for the service

Up to here the steps are made together with the booking of the other booking parts. In case of a combined long distance journey the next steps would follow shortly before 
the on-demand service will be used.

In case of a shallow integration the OSDM flow ends here.

In case of post-payment scenarios the ricing status will be used to indicate the collecting and finalizing of the price.


### block a vehicle for the service

Blocking a vehicle reserves the vehicle for some time to walk to the pick-up-place or untiol the car arrives. 

To get an updated list of available pick-up places and vehicles:

```
     GET /availabilities/continuousServiceBookingPart/{id}    
```


To block for a limited time the vehicle you get a vehicel as ContinuousServiceUsage object with a patch on the filfillment providing the selected pick-up place and vehicle type:

```
     PATCH /fulfillments/{fulfillmentId}  FulfillmentPatchRequest
```

The fulfillment will the contain the ContinuousServiceUsage object in blocked state. This step might come with a fee depending on commercial conditions.

### delete 

Delete a blocked ContinuousServiceUsage in case you change your mind or the vehicle is broken is donev ia:

```
         DELETE fulfillment/{id}/continuousServiceUsage/{id}
```

### start usage

Start using the vehicle. This might as well been triggered by the vehicle itself. 

```
         PATCH fulfillment/{id}/continuousServiceUsage/{id}:
```

### end usage 

This ends the usage of a vehicle. This might as well be triggered by the vehicle itself (e.g. be locking the vehicle).

```
            PATCH fulfillment/{id}/continuousServiceUsage/{id}
```

An image of the parking of the vehicle can be provided. A tip to the staff can be provided (e.g. in case of taxi).

At the end of the usage the provider updates the booking to reflect the required payment:

- in case of post-payment update ContinuousServiceBookingPart in the booking:
  - including the price                   
  - pricing status becomes final
  - fulfillment documents on the pricing / calculation of costs
- in case of pre-payment update ContinuousServiceBookingPart in the booking: 
  - including a new refund on the existing ContinuousServiceBookingPart
  - fulfillment documents on the pricing / calculation of costs


### reimbourcement:

Reimborcement uses the already defined reembourcement flow. There are additional reason ccodes for continuous services:
   
   - CONTINUOUS_SERVICE_VEHICLE_BATTRY_EMPTY
   - CONTINUOUS_SERVICE_VEHICLE_BROKEN
   - CONTINUOUS_SERVICE_VEHICLE_NOT_FOUND
   - CONTINUOUS_SERVICE_VEHICLE_DID_NOT_ARRIVE
   - CONTINUOUS_SERVICE_USAGE_STARTING_FAILED
   - CONTINUOUS_SERVICE_USAGE_ENDING_FAILED
   - CONTINUOUS_SERVICE_USAGE_REPORT_WRONG

### tracking

Optional feature to get updates on the usage status:

```
          GET fulfillment/{id}/continuousServiceUsage/{id}:
```

will provide an update of the ContinuousServiceUsage including:

- status
- geo-location of the vehicle
- amount to pay (at the current usage)
- remaining amount for prepayed usage
- time till arrival at pick-up-place (taxi,..)


