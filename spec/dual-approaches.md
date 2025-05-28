---
layout: page
title: Dual Approaches for use cases
hide_hero: true
permalink: /spec/dual-approaches/
---

## Table of contents

1. [Handling of Non-Person Transportables](#NonPersonTransportables)

1. [Requesting Offers for known Vehicle Number](#RequestingOffersforknownVehicleNumber)
   1. [Offers for known Vehicle Number by Trip Specification](#OffersforknownVehicleNumberbyTripSpecification)
   2. [Offers for known Vehicle Number by Trip Search Criteria-Vehicle Filter](#OffersforknownVehicleNumberbyTripSearchCriteriaVehicleFilter)
      

# Dual Approaches for a single Use case

There are identified dual approaches usable for a single use case in the OSDM API. Each of the use cases is described here with identified preferred and alternative request.

## Requesting offers for non-person transportables <a name="NonPersonTransportables">

Non-Person transportables are items that are transported by the traveller which need an additional permission to be taken on the train and in many cases have to be paid additionally.

These could be:

- bicycles
- large pets
- large luggage
- prams
- cars, motocycles or trailers on car carriage trains

depending on the conditions of the carrier these might need to be payed additionally or need a reservation.

I case the transport of the item is essential for the travel it must be indicated in the initial offer request. This can be done via a passenger with a specific passenger type for the transportable. The transportable as passenger has an id that can be used in partial cancellation.

The expected behaviour of an OSDM provider is that provided offers would always allow the transport of the indicated items.

The OSDM providers might construct the offers differently:

- including the items in the admission and linking the admission to the passenger representing the item
- including the items in separate admissions and linking the admission to the passenger representing the item
- including the items in separate ancillary and linking the ancillary to the passenger representing the item

The item might result in separate fulfillments or might be integrated in the collective fulfillment with persons. 

There might be an optional or mandatory reservation required for the items depending on the train services.

There might be data required to identify the item, e.g. licence plate. These are subject to the GDPR regulation.

The indication of the whole route of travel in the request is recommended, as there might be restrictions that allow the transport of bicycles during rush hours only in case it is part of a longer yourney.

In case the item is not indicated in the offer request the OSDM provider might provide optional ancillay offers for items he thinks might be interesting for the traveller.



## Requesting Offers for known Vehicle Number <a name="RequestingOffersforknownVehicleNumber">

When the reseller/distributor performs trip planning in its own system and wants to instruct the distributor/fare provider on desired _trip_ and _legs_, there is _trip specification_ structure to describe the _trip_. This is also usable when _purchaser_ requests specified _products_ for specified _vehicle number_, e.g. direct seat/berth reservation booking.

The preferred solution uses the _trip specification_. The alternate solution uses _trip search criteria_ with _vehicle filter_. It is used for HERMES compatibility as well as when the _carrier_ of the _service_ is not known.

### Offers for known Vehicle Number by Trip Specification <a name="OffersforknownVehicleNumberbyTripSpecification">

```json
{
    "tripSpecifications": [
        {
            "legs": [
                {
                    "timedLeg": {
                        "start": {
                            "stopPlaceRef": {
                                "stopPlaceRef": "{{leg_1_start_stop_place_ref}}",
                                "objectType": "StopPlaceRef"
                            },
                            "serviceDeparture": {
                                "timetabledTime": "{{leg_1_service_departure}}"
                            }
                        },
                        "end": {
                            "stopPlaceRef": {
                                "stopPlaceRef": "{{leg_1_end_stop_place_ref}}",
                                "objectType": "StopPlaceRef"
                            },
                            "serviceArrival": {
                                "timetabledTime": "{{leg_1_service_arrival}}"
                            }
                        },
                        "service": {
                            "vehicleNumbers": [
                                "{{vehicle_number_leg_1}}"
                            ],
                            "carriers": [
                                {
                                    "ref": "{{leg_1_carrier_ref}}"
                                }
                            ]
                        }
                    }
                }
            ]
        }
    ]
}
```

### Offers for known Vehicle Number by Trip Search Criteria-Vehicle Filter <a name="OffersforknownVehicleNumberbyTripSearchCriteriaVehicleFilter">

```json
{
    "tripSearchCriteria": {
        "departureTime": "{{leg_1_service_departure}}",
        "origin": {
            "objectType": "StopPlaceRef",
            "stopPlaceRef": "{{leg_1_start_stop_place_ref}}"
        },
        "destination": {
            "objectType": "StopPlaceRef",
            "stopPlaceRef": "{{leg_1_end_stop_place_ref}}"
        },
        "parameters": {
            "dataFilter": {
                "vehicleFilter": {
                    "vehicleNumbers": [
                        "{{vehicle_number_leg_1}}"
                    ]
                }
            }
        }
    }
}
```
