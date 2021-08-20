---
layout: page
title: Getting Started with OSDM
permalink: /getting-started/
---

# A Gentle Introduction to OSDM

## Introduction

The OSDM interface is rich and can be overwhelming at start. Reason for its feature richness (leading ti complexity) is that fact that it aims to cover all possible public transportation products within Europe. There's a rich set of products and fares and operations to support all the 30+ systems within Europe.

The products can be split roughly split into three categories:

- *admissions*: the right to ride on a train, resulting in a ticket.
- *reservations*: seat or couchette or bed in case of night trains
- *ancillary*: WIFI, 3-Menu plate

Between the two product types, relationships are modelled to express whether it is optional or mandatory to have a certain seat reservation or ancillary on a given vehicle. In an open system (e.g. Switzerland) having a reservation is optional or a closed system (e.g. France) a seat reservation is a must.

### Booking a Ticket

We will start with booking a ticket, i.e. admission on a very simple trip: *Basel* - *Chur*. We assume there's no changing of trains, thus one segment only.

A segment has all the stops as well as information on the vehicle running on this segment. On this segment this is a ICE train operated by SBB.

- Step 1: Look up location codes

  To uniquely identify a location, stations etc. internally a code is used. Thus a helper service is provided that allows you to look up codes:

  `GET locations?matchValue=Basel`

  As response, you get information on the location, e.g. its local name or its geo coordinates.

    ```json
    {
    "locations": [
        {
        "id": "8500010",
        "abstract": "Basel SBB",
        "station": {
            "country": "ch",
            "codes": [
              {
                "codeList": "UIC",
                "code": "8500010"
              }
            ],
            "geoCoordinate": {
                "latitude": 47.547408,
                "longitude": 7.589548
            },
            "names": [
              {
                "language": "de",
                "text": "Basel SBB"
              },
              {
                "language": "fr",
                "text": "Bâle SBB"
              }
            ]
         }
        }
     ]
    }
    ```

  Thus by calling the service you will the following UIC codes: *Basel*: 8500010 and *Chur*: 8509000.

- Step 2: Request Offers

    Next, the simplest way to receive offers is to pass in *origin*, *destination*, *date* and *time* was well as the *passenger's* date of birth by calling.

    `POST /trips-offers-collection`

    with a body

    ```json
    {
        "tripSearchCriteria": {
            "origin": {
                "codeList": "UIC",
                "code": "8500010"
            },
            "destination": {
                "codeList": "UIC",
                "code": "8509000"
            },
            "travelDateTime": {
                "dateTime": "<departure_timestamp>",
                "isArrival": false
            }
        },
        "passengers": [
            {
                "dateOfBirth": "1970-01-01"
            }
        ],
        "offerSearchCriteria": {
            "currency": "CHF"
        }
    }
    ```

    As a result you get a set of offers, with exact information about the trip covered for the given set of passengers.

    ```json
    {
       "id": "C_0KKC..",
        "tripOffers": [
            {
                "id": "T_0KK--",
                "abstract": "Basel SBB - Chur",
                "trip": [..
            ],
            "offers": [..
            ],
            "passengers": [
             {
                "id": "passenger_1",
                 "abstract": "John Doe",
                "externalReference": "ext_reference",
                "dateOfBirth": "1970-01-01",
                "gender": "MALE"
             }
          ]
        }
      ]
    }
    ```

    An offer is structured starting with an offer summary, followed by admission, reservations and ancillaries if available.

    On this train a valid offer consists of an admission with a optional reservation. As no reduction card has been submitted, the second class is full price, thus 68.00 CHF. Other valid offers for this trip, e.g. for super safer fares or for first class are returned.

    ```json
      {
        "id": "O_72gFY..",
        "offerSummary": {
            "minimalPrice": {
                "currency": "CHF",
                "amount": 6800
            },
            "overallServiceClass": {
                "type": "BASIC"
            },
            "overallFlexibility": "SEMIFLEX"
        },
        "isReusable": true,
        "coveredSegmentIndexes": [
            0
        ],
        "availableFulfillmentTypes": [
            "ETICKET"
        ],
        "validFrom": "2021-08-30T00:00:00+00:00",
        "validUntil": "2021-08-31T00:00:00+00:00",
        "admissions": [
            {
                "id": "P_oLA5WtMSxS9EoAFwyb05DIhn$qbvv0Xo0NnUez5jw3EHGGNxHhxYfPYOryvAE29f",
                "commonOfferPartAttributes": {
                    "price": {
                        "currency": "CHF",
                        "amount": 6800
                    },
                    "passengers": [
                        {
                            "id": "<passenger_id>"
                        }
                    ],
                    "validFrom": "2021-08-30T00:00:00+00:00",
                    "validUntil": "2021-08-31T00:00:00+00:00",
                    "refundable": "YES",
                    "exchangeable": "YES",
                    "products": [
                        {
                            "id": "SBB_POINT_TO_POINT",
                            "abstract": "Point-to-point Ticket, Second Class",
                            "code": "125",
                            "description": "",
                            "isTrainBound": false
                        }
                    ]
                },
                "isReservationRequired": false
            }
        ],
        "reservations": [
            {
                "id": "P_WD18ohUYPc0o2xDGdLjS4lZp2GKCBCPiZZTJMVZPE+R+IZXvmnwWfCzAvQqqFsbF",
                "commonOfferPartAttributes": {
                    "price": {
                        "currency": "CHF",
                        "amount": 500,
                    },
                    "passengers": [
                        {
                            "id": "<passenger_id>"
                        }
                    ],
                    "validFrom": "2021-08-30T00:00:00+00:00",
                    "validUntil": "2021-08-31T00:00:00+00:00",
                    "refundable": "NO",
                    "exchangeable": "NO",
                    "products": [
                        {
                            "id": "SBB_SEAT_RESERVATION",
                            "abstract": "Seat Reservation",
                            "code": "PRODUCT_10000",
                            "description": "",
                            "isTrainBound": true
                        }
                    ]
                },
                "optionality": "OPTIONAL"
            }
        ]
    }
    ```

    If your overwhelmed by the numbers of offers you are getting, you can filter that by setting `flexibilities`, `comfortClasses`, `offerPartType`.

- Step 3: Booking Offers.

    Next your task is to display this offers in a meaningful way to your customer. Therefore every offer has a lot information about the underlying product, its comfort class, its flexibility etc. so that the customer can choose the offer best suited for its needs.

    Once the customer has chosen an offer, you book it by calling

    `POST /bookings`

    with a body of

    ```json
    {
        "selectedOffers": [
            {
                "selectedOfferId": "<selected_offer_id>",
                "passengers": [
                    "<passenger_id>"
                ]
            }
        ]
    }
    ```

    The system now creates a booking for you, containing all the information about the trip, the passenger and the products booked.

- Step 4: Get the fulfillments

    To handout a ticket the last call is to get fulfillments of this ticket. Fulfillments are a general term to describe physical tickets as well as non-digital one such as Apple's passbook or a simple code only.

    The fulfillments can be simply accessed by calling:

    `GET /bookings/{booking_id}/fulfillments`

    For example, you can use the included URL to download the PDF.

    **Thats it**.

### What is in a Booking?

Once a booking has been created, you can get detailed information about it calling the booking resource:

`GET /bookings/{bookingId}`

The response gives you detailed information about the state and the price of the booking as well as the trip, the passengers and - if in state fulfilled - its fulfillments. Spend some time understanding it structure.

### Reserving a Seat

In the offer response of Step 2 you will see, that additionally to a admission, there are also seat reservations returned on this trip. The seat reservation has an `"optionality": OPTIONAL`, thus you don't need to book it. Thus you call

`POST /bookings`

with a body of

```json
{
    "selectedOffers": [
        {
            "selectedOfferId": "<selected_offer_id>",
            "selectedOptionalReservationIds": [
                "<selected_reservation_id>"
            ],
            "passengers": [
                "<passenger_id>"
            ]
        }
    ]
}
```

As you can see, in the most simple case you just have to add the id of the selected reservation offer in the booking request. The inventory system will then choose a seat for you.

### Traveling a Bit Further

Assuming you are hungry and want to see a scenic landscape, let's change the trip slightly: We travel from *Basel* to *Chur* and then switch train from *Chur* to *Brig* on a touristic train running through the wonderful Swiss alps. To find the UIC code of *Brig* you can again use `GET /locations?matchValue=Brig` and set the UIC code of *Chur* as a via station.

In the offer request the trip now consists of two segments. The second segment is a Panorama express operated by RhB. As there's high demand on these touristic trains, seat reservation is a must. This is indicated by a reservation offer with an mandatory reservation (`"optionality": "MANDATORY"`).

Additionally, on this train there are ancillary services available. You can choose between a 3-menu plate or a plate of the day. To book one of them, you just pass in the id in the booking step.

```json
{
    "selectedOffers": [
        {
            "selectedOfferId": "<selected_offer_id>",
            "selectedOptionalReservationIds": [
                "<selected_reservation_id>"
            ],
            "selectedOptionalAncillaryIds": [
                "<selected_ancillary_id>"
            ],
            "passengers": [
                "<passengers_id>"
            ]
        }
    ]
}
```

### Refunding an Offer

If a customer wants to refund its ticket, the flow is a two step process analogously to the booking flow. If a booking (i.e. its underlying product) is fully refundable you will get the full amount refunded. On the other hand, if the booking is non refundable you will get a offer of 0 CHF is returned.

- Step 1: Request a refund offer.

    The get a refund offer you `POST /bookings/{booking_id}/refundOffers`

    with ids of the fulfillments to be cancelled (You can look up the fulfillmentIds of a booking by `GET /bookings/{bookingId}`)

    ```json
    {
        "fulfillmentIds": [
            "<fulfillment_id>"
        ],
        "overruleCode": "PAYMENT_FAILURE",
        "refundDate": "<refund_timestamp>"
    }
    ```

   In the response you get a collection of refund offers including refund fees and the refundable amount.

- Step 2: Accept the refund offer.

    To accept the refund offer you patch the `PATCH /bookings/{{booking_id}}/refundOffers/{{refund_id}}`

    with a body of:

    ```json
    {
        "confirmedRefundOfferId": "<offer_id>"
    }

    ```

   **Again, that's it**

## Next Steps

This short introduction should help you getting started and assure you that OSDM is simple to use. While it's simple to use it's powerful to handle night trains, thru fares, passes and complex exchange processes on yielded.

To fully understand OSDM we recommend you to have a look at the [specification](../spec/), especially the [model](../spec/models) and the [processes](../spec/processes) pages. A good start is also to study API itself. Or you can ask the OSDM technical group for introduction.

## FAQ

### Why is there no pre-booking step?

In some countries, super saver fares are loaded as promotion into the system at a given date, which can lead to millions of request for offers within a short period. Storing hundreds of millions of offers server side becomes a challenge.

To deal with such scenarios, the protocol is stateless by the design. Stateless in the sense that the state is held on the client and not on the server side. How can this be achieved? The trick is to encode all necessary information about an offer into the offerId and thus implicitly stored on the server side. Thus once an offerId is chosen, the offer is generated on the fly on the server side and then booked. Before booking the offer is validated for consistency.

If your system thus not support this magic, you probably don't need it and can of course work cache the offers on the server side for a given time and return this information as part of the offer information.

### Are using POST when there should be a GET?

It would be in the spirit of REST to search for `GET /bookings?firstName=John&lastName=Doe` to return all bookings of John Doe. As such a call would be logged by any involved system, this collection of data violates GDPR regulations. We have reviewed all our services and decided to us POST in such cases and thus support privacy by design.

### When to pass in which passenger attributes?

We take special care not to violate a passengers personal rights and build in privacy by design. Thus we collect as few information as possible at every step, i.e. only the attributes absolutely necessary to fulfill the operation are gathered. To indicate which information is needed you there is a `requestedInformation` attribute which express the information needed expressed in small DSL.

## Advanced Topics

### Choosing Your Seat

There are two options: You can express your seating wishes such as at the window etc in the XYZ

Or if you have chosen a unique seat using e.g. a graphical seat reservation (see below) you just pass in a coach and seat number.

```json
{
    "selectedOffers": [
        {
            "selectedOfferId": "<selected_offer_id>",
            "selectedOptionalReservationIds": [
                "<selected_reservation_id>"
            ],
            "passengers": [
                "<passenger_id>"
            ],
            "placeSelections": {
                "reservationId": "<selected_reservation_id>",
                "placeSelection": {
                    "selectedCoach": {
                        "selectedCoaches": [
                            {
                                "coachNumber": "2",
                                "selectedPlaces": [
                                    {
                                        "passengerId": "<passenger_id>",
                                        "place": "2"
                                    }
                                ]
                            }
                        ]
                    }
                }
            }
        }
    ]
}
```

To be able to build a graphical seat reservation, you first need information of the layout of a the vehicle. The service `GET /coachLayouts/{layoutId}` allows you to download the layout.

As a distributor you can now use this information to build a slick reservation UI that allows your customer to choose the seat or bed.

### What are fares?

Fares are priced segments which can be used to create offers for a given trips constrained by fare combination constraints. In the role as a distributor you don't need to care about them.
