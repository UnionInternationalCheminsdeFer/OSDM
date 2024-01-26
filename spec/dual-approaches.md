# Dual Approaches for a single Use case

There are identified dual approaches usable for a single use case in the OSDM API. Each of the use cases is described here with identified preferred and alternative request.

## Requesting Offers for known Vehicle Number

When the reseller/distributor performs trip planning in its own system and wants to intruct the distributor/fare provider on desired _trip_ and _legs_, there is _trip specification_ structure to describe the _trip_. This is also usable when _purchaser_ requests specified _products_ for specified _vehicle number_, e.g. direct seat/berth reservation booking.

The preferred solution uses the _trip specification_. The alternate solution uses _trip search criteria_ with _vehicle filter_. It is used for HERMES compatibility as well as when the _carrier_ of the _service_ is not known.

### Offers for known Vehicle Number by Trip Specification

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
