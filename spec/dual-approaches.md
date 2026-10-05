---
layout: page
title: Dual Approaches for use cases
hide_hero: true
permalink: /spec/dual-approaches/
---

## Table of contents

1. [Handling of Non-Person Transportables](#NonPersonTransportables)

2. [Return Offers](#ReturnOffers)

3. [Requesting Offers for known Vehicle Number](#RequestingOffersforknownVehicleNumber)
   1. [Offers for known Vehicle Number by Trip Specification](#OffersforknownVehicleNumberbyTripSpecification)
   2. [Offers for known Vehicle Number by Trip Search Criteria-Vehicle Filter](#OffersforknownVehicleNumberbyTripSearchCriteriaVehicleFilter)


## Requesting Offers for Non-Person Transportables

Non-Person transportables are items that are transported together with the passenger which need an additional permission to be taken on the vehicle and in many cases have to be paid additionally. These could be a *bicycle*, *dog*, *luggage* or *pram*. Depending on the conditions of the carrier these might need to be paid additionally or need a reservation.

The expected behavior of an OSDM provider is that provided offers would always allow the transport of the indicated items. However, an OSDM provider might construct the offers differently:

1. Including the items **in the admission** and linking the admission to the passenger representing the item.
2. Including the items in **separate admissions** and linking the admission to the passenger representing the item.
3. Including the items in **separate ancillary** and linking the ancillary to the passenger representing the item.

Further variances:

- The item might result in separate fulfillments or might be integrated in the collective fulfillment with persons. 

- There might be an optional or mandatory reservation required for the items depending on the train services.

- There might be data required to identify the item, e.g. license plate. These are subject to the GDPR regulation.

The indication of the whole route of travel in the request is recommended, as there might be restrictions that allow the transport of bicycles during rush hours only in case it is part of a longer journey.

In case the item is not indicated in the offer request the OSDM provider might provide optional ancillary offers for items he thinks might be interesting for the passenger.

## Return Offers

In version 3.6 offers on return trips are provided as separate offers with a dependency described via the return offer tags. With version 3.7 it is possible to define real return offers as a single return offer referencing inward and outward trip via trip coverage objects. The old way of providing separate offers with return tags is still allowed.

## Requesting Offers for known Vehicle Number

When the reseller/distributor performs trip planning in its own system and wants to instruct the distributor/fare provider on desired _trip_ and _legs_, there is _trip specification_ structure to describe the _trip_. This is also usable when _purchaser_ requests specified _products_ for specified _vehicle number_, e.g. direct seat/berth reservation booking.

The preferred solution uses the _trip specification_. The alternate solution uses _trip search criteria_ with _vehicle filter_. It is used for HERMES compatibility as well as when the _carrier_ of the _service_ is not known.

## Offers for known Vehicle Number by Trip Specification 

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

### Offers for known Vehicle Number by Trip Search Criteria-Vehicle Filter

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
