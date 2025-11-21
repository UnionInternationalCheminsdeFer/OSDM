---
layout: page
title: Getting Started with OSDM
permalink: /spec/getting-started/
---

# A Gentle Introduction to OSDM

## Table of contents

1. [Introduction](#Introduction)
   1. [Booking a Ticket](#BookingaTicket)
   2. [What is in a Booking?](#WhatisinaBooking?)
   3. [Reserving a Seat](#ReservingaSeat)
   4. [Traveling a Bit Further](#TravelingaBitFurther)
   5. [Refunding an Offer](#RefundinganOffer)
2. [Where to Go From Here](#WheretoGoFromHere)
3. [FAQ](#FAQ)
   1. [Why is there no pre-booking resource?](#Whyistherenoprebookingresource?)
   2. [Why are you using POST when there should be a GET?](#WhyareyouusingPOSTwhenthereshouldbeaGET?)
   3. [How are IRTs modeled?](#HowareIRTsmodeled?)
   4. [How many seats are available on the train?](#Howmanyseatsareavailableonthetrain?)
   5. [When to pass in which passenger attributes?](#Whentopassinwhichpassengerattributes?)
4. [Advanced Topics](#AdvancedTopics)
   1. [Choosing Your Seat](#ChoosingYourSeat)
   2. [How to book a pass?](#Howtobookapass?)
   3. [What are fares?](#Whatarefares?)


## Introduction <a name="Introduction">

OSDM (Open Sales and Distribution Model) defines an API to enable and simplify the sale of transport 
products. The API allows Retailers to access transport products provided by distributors. It also allows 
distributors to access transport product bricks provided by carriers or fare providers to build 
combined transport products. The aim of OSDM is to provide a simple API to access required information 
online, however OSDM also provides an offline data exchange of fares.

The API covers the full sales process including time table / offer serch, prebooking and booking, refund, 
exchange including special processes to handle delays, change of material and compensation. 

OSDM covers scheduled multimodal transport services (trains, busses, trams, ...). On Demand services are 
currently covered with some functional limitation.

The OSDM API is rich and can be overwhelming at start. Reason for its feature
richness (leading to its complexity) is the fact that it aims to cover all
possible public transportation products and distribution processes within Europe
and beyond.

The products can be split roughly split into three categories:

- _admissions_: the right to ride on a train, resulting in a ticket.
- _reservations_: seat or couchette or bed in case of night trains
- _ancillary_: ancillary services such WIFI, 3-Menu plate

Between these categories, relationships are modelled to express whether it is
optional or mandatory to have a certain seat reservation or ancillary on a given
vehicle. In an open system (e.g. Switzerland) having a reservation is optional.
In contrast on a closed system (e.g. France) a seat reservation is a mandatory.

### Booking a Ticket <a name="BookingaTicket">

We will start with booking a ticket, i.e. admission on a very simple trip:
_Basel_ - _Chur_. We assume there's no changing of trains, thus one segment
only. We assume that the distributor is a Swiss website.

A segment has all the stops as well as information on the vehicle running on
this segment. On this segment this is a ICE train operated by SBB.

- Step 1: Look up location codes

  To uniquely identify a location, stations etc. internally a code is used. Thus
  a helper service is provided that allows you to look up codes:

  `POST /places`

  with a body

  ```json
  {
    "placeInput": {
      "name": "Basel"
    }
  }
  ```

  As response, you get information on the location, e.g. its local name or its
  geo coordinates.

  ```json
  {
    "places": [
      {
        "id": "place-1",
        "name": "Basel SBB",
        "stopPlace": {
          "ref": "urn:uic:stn:8503000",
          "name": "Basel SBB"
        },
        "geoPosition": {
          "latitude": 47.547408,
          "longitude": 7.589548
        }
      }
    ]
  }
  ```

  Thus by calling the service you get the following UIC codes: _Basel_: 8500010
  and _Chur_: 8509000.

- Step 2: Request Offers

  Next, the simplest way to receive offers is to pass in _origin_,
  _destination_, _departureTime_ as well as the _passenger's_ date of birth by
  calling:

  `POST /offers`

  with a body

  ```json
  {
    "tripSearchCriteria": {
      "origin": "urn:uic:stn:8500010",
      "destination": "urn:uic:stn:8503000",
      "departureTime": "<departure_timestamp>"
    },
    "anonymousPassengerSpecifications": [
      {
        "externalRef": "<external-passenger-ref>",
        "type": "PERSON",
        "dateOfBirth": "1970-01-01"
      }
    ],
    "offerSearchCriteria": {
      "currency": "CHF"
    }
  }
  ```

  The birth date is necessary to return e.g. senior fares where sensible.

  As a result you get a set of offers, with exact information about the trip
  covered for the given set of passengers.

  ```json
  {
      "id": "C_0KK..",
      "offers": [..
      ],
      "trips": [..
      ],
      "anonymousPassengerSpecifications": [
          {
              "id": "passenger_1",
              "dateOfBirth": "1970-01-01",
          }
      ]
  }
  ```

  An offer is structured starting with an offer summary, followed by admission,
  reservations and ancillaries if available.

  On this train a valid offer consists of an admission with a optional
  reservation. As no reduction card has been submitted, the second class is full
  price, thus 68.00 CHF. Other valid offers for this trip, e.g. for super saver
  fares (in CH: "Sparbillett") or for first class are returned.

  ```json
    {
      "id": "O_72g..",
      "offerType": "Offer",
      "offerSummary": {
          "minimalPrice": {
              "currency": "CHF",
              "amount": 6800,
              "scale": 2
          },
          "overallServiceClass": {
              "type": "BASIC"
          },
          "overallFlexibility": "FULLFLEX"
      },
      "isReusable": true,
      "coveredLegIds": [
          "leg-1"
      ],
      "availableFulfillmentTypes": [
          "ETICKET"
      ],
      "validFrom": "2021-08-30T00:00:00+00:00",
      "validUntil": "2021-08-31T00:00:00+00:00",
      "admissions": [
          {
              "id": "P_oLA..",
              "price": {
                  "currency": "CHF",
                  "amount": 6800,
                  "scale": 2
               },
               "passengerSpecification": [
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
                          "summary": "Point-to-point Ticket, Second Class",
                          "code": "125",
                          "isTrainBound": false
                      }
                 ]
              "isReservationRequired": false
          },..
      ],
      "reservations": [
          {
              "id": "P_WD1..",
              "price": {
                  "currency": "CHF",
                  "amount": 500,
                  "scale": 2
               },
               "passengers": [
                   {
                      "id": "<passenger_id>"
                   }
                ],
                "validFrom": "2021-08-30T00:00:00+00:00",
                "validUntil": "2021-08-31T00:00:00+00:00",
                "numericAvailability": 20,
                "refundable": "NO",
                "exchangeable": "NO",
                "products": [
                      {
                          "id": "SBB_SEAT_RESERVATION",
                          "summary": "Seat Reservation",
                          "code": "PRODUCT_10000",
                          "isTrainBound": true
                      }
                  ]
                  "optionality": "OPTIONAL"
          },
          {
              "id": "P_WD1..",
              "price": {
                      "currency": "CHF",
                      "amount": 500,
                      "scale": 2
               },
               "passengers": [
                      {
                          "id": "<passenger_id>"
                      }
               ],
               "validFrom": "2021-08-30T00:00:00+00:00",
               "validUntil": "2021-08-31T00:00:00+00:00",
               "numericAvailability": 4,
               "refundable": "NO",
               "exchangeable": "NO",
               "products": [
                      {
                          "id": "SBB_BIKE_RESERVATION",
                          "summary": "Bike Reservation",
                          "code": "PRODUCT_10001",
                          "isTrainBound": true
                      }
              ]
              "optionality": "OPTIONAL"
          }
      ]
  }
  ```

  The number of available seats or bike places can be included in offers and
  expressed by the `"numericAvailability"` attribute.

  If your overwhelmed by the numbers of offers you are getting, you can filter
  them by setting `flexibilities`, `comfortClasses`, `offerPartType`.

- Step 3: Booking Offers.

  Next your task is to display this offers in a meaningful way to your customer.
  Therefore every offer has a lot information about the underlying product, its
  comfort class, its flexibility etc. so that the customer can choose the offer
  best suited for its needs.

  Once the customer has chosen an offer, you book it by calling

  `POST /bookings`

  with a body of

  ```json
  {
    "offers": [
      {
        "offerId": "<selected_offer_id>",
        "passengerRefs": ["<passengerRefs>"]
      }
    ],
    "passengerSpecifications": [
      {
        "externalRef": "<ext-person-ref>",
        "dateOfBirth": "1945-11-02",
        "type": "PERSON"
      }
    ]
  }
  ```

  The system now creates a booking for you, containing all the information about
  the trip, the passenger and the offers booked. The created booking is returned
  in state `PREBOOKED` with the offer structure being available as part of the
  `bookedOffer`.

  ```json
  {
      "booking": {
          "id": "28OD7DVM",
          "summary": "Booking number 28OD7DVM",
          "provisionalPrice": {..
          },
          "confirmedPrice": {..
          },
          "ticketTimeLimit": "2021-08-23T12:21:15+00:00",
          "fulfillmentType": "ETICKET",
          "bookedOffers": [
            {
              "id": "B_WyJ...",
              "offerSummary": {
              "minimalPrice": {
                  "currency": "CHF",
                  "amount": 500,
                  "scale": 2
                }
              },
              "isReusable": false,
              "availableFulfillmentTypes": [
              "ETICKET"
              ],
              "trip": {..
              },
              "validFrom": "2021-09-02T00:00:00+00:00",
              "validUntil": "2021-09-02T00:00:00+00:00",
              "admissions": [..
              ],
              "reservations": [],
              "ancillaries": []
            }
          ],
          "fulfillments": [
            {
              "id": "28OD7DVM-001",
              "status": "CONFIRMED",
              "controlNumber": "28OD7DVM-001",
              "offerParts": [
              "P_jekG6PnHWpW6dL8GPXLICWURJT9nh5ch5kRAjpMElgCvT8LTTNkWM6lOJsTaAUsq"
              ]
            }
          ]
      }
  }
  ```

- Step 4: Finalize the booking and get the fulfillments

  To finalize the booking and handout a ticket the last call is to get
  fulfillments of this ticket. Fulfillments are a general term to describe
  physical tickets as well as non-digital one such as Apple's passbook or a
  simple code only.

  `POST /bookings/{booking_id}/fulfillments`

  The fulfillments can be simply accessed by calling:

  `GET /bookings/{booking_id}/fulfillments`

  For example, you can use the included URL to download the PDF.

  ```json
  {
    "fulfillment": [
      {
        "id": "4ES36OIU-001",
        "status": "FULFILLED",
        "controlNumber": "4ES36OIU-001",
        "offerParts": ["P_jekG6..."],
        "fulfillmentDocuments": [
          {
            "medium": "PDF_A4",
            "type": "TICKET",
            "downloadLink": "https://ticket.osdm-demo-test.cloud.sqills.com/ticket/4ES36OIU-001_210823145615241.png"
          },
          {
            "medium": "PDF_A4",
            "type": "TICKET",
            "downloadLink": "https://ticket.osdm-demo-test.cloud.sqills.com/ticket/4ES36OIU_PASSENGERS1_210823145615245.pdf"
          }
        ]
      }
    ]
  }
  ```

  **That's it**.

### What is in a Booking? <a name="WhatisinaBooking?">

Once a booking has been created, you can get detailed information about it
calling the booking resource:

`GET /bookings/{bookingId}`

The response gives you detailed information about the state and the price of the
booking as well as the trip, the passengers and - if in state fulfilled - its
fulfillments. Spend some time understanding it structure.

### Reserving a Seat <a name="ReservingaSeat">

In the offer response of Step 2 you will see, that additionally to a admission,
there are also seat reservations returned on this trip. The seat reservation has
an `"optionality": OPTIONAL`, thus you don't need to book it. Thus you call

`POST /bookings`

with a body of

```json
{
    "offers": [
        {
            "offerId": "<selected_offer_id>",
            "optionalReservationIds": [
                "<selected_reservation_id>"
            ],
        }
    ],
    "passengerSpecifications": {...}
}
```

As you can see, in the most simple case you just have to add the id of the
selected reservation offer in the booking request. The inventory system will
then choose a seat for you. In this case, the place 25 in coach 3 was booked.

```json
{
    "booking": {
        "bookedOffers": {
            "offerId": "offer-1",
            "reservations": [
                {
                    ..
                    "status": "BOOKED",
                    "placeAllocation": {
                        "reservedPlaces": [
                            {
                                "id": "S_7H5nJ5IEwipH4dvV2UNBRQ==",
                                "passengerId": "<passenger-id>",
                                "vehicleNumber": "IC 565",
                                "coachNumber": "3",
                                "placeNumbers": "25"
                            }
                        ]
                    }
                }
            ]
            ..
        }
    }
}
```

### Traveling a Bit Further <a name="TravelingaBitFurther">

Assuming you are hungry and want to see a scenic landscape, let's change the
trip slightly: We travel from _Basel_ to _Chur_ and then switch train from
_Chur_ to _Brig_ on a touristic train running through the wonderful Swiss alps.
To find the UIC code of _Brig_ you can again use `GET /places?matchValue=Brig`
and set the UIC code of _Chur_ as a via station.

In the offer request the trip now consists of two segments. The second segment
is a Panorama express operated by RhB. As there's high demand on these touristic
trains, seat reservation is a must. This is indicated by a reservation offer
with an mandatory reservation (`"optionality": "MANDATORY"`).

Additionally, on this train there are ancillary services available. You can
choose between a 3-menu plate or a plate of the day. To book one of them, you
just pass in the id in the booking step.

```json
{
    "offers": [
        {
            "offerId": "<selected_offer_id>",
            "optionalReservationIds": [
                "<selected_reservation_id>"
            ],
            "optionalAncillaryIds": [
                "<selected_ancillary_id>"
            ]
        }
    ],
    "passengerSpecifications": {...}
}
```

### Refunding an Offer <a name="RefundinganOffer">

If a customer wants to refund its ticket, the flow is a two step process
analogously to the booking flow. If a booking (i.e. its underlying product) is
fully refundable you will get the full amount refunded. On the other hand, if
the booking is non refundable an offer of 0 CHF is returned.

- Step 1: Request a refund offer.

  The get a refund offer you `POST /bookings/{booking_id}/refundOffers`

  with ids of the fulfillments to be cancelled (You can look up the
  fulfillmentIds of a booking by `GET /bookings/{bookingId}`)

  ```json
  {
    "fulfillmentIds": ["<fulfillment_id>"],
    "overruleCode": "PAYMENT_FAILURE",
    "refundDate": "<refund_timestamp>"
  }
  ```

  In the response you get a collection of refund offers including refund fees
  and the refundable amount.

- Step 2: Accept the refund offer.

  To accept the refund offer you patch the
  `PATCH /bookings/{booking_id}/refundOffers/{refund_id}`

  with a body of:

  ```json
  {
    "status": "CONFIRMED"
  }
  ```

  **Again, that's it**

## Where to Go From Here <a name="WheretoGoFromHere">

This short introduction should help you getting started and assure you that OSDM
is simple to use. While it's simple to use it's powerful to handle all kind of
night trains, through fares, passes and complex exchange processes on yielded
products.

To fully understand OSDM we recommend you to have a look at the
[specification](/spec/), especially the [model](/spec/models) and the
[processes](/spec/processes) pages, especially state model of a `booking` and a
`fulfillment`.

Another good start is to study the **API** itself. Or you can ask the OSDM
technical group for an introduction.

## FAQ <a name="FAQ">

### Why is there no pre-booking resource? <a name="Whyistherenoprebookingresource?">

In some countries, super saver fares are loaded as promotions into the system at
a given date, which can lead to millions of request for offers within a short
period as everybody tries to get the cheapest tickets. Storing hundreds of
millions of offers or pre-bookings server side becomes a challenge.

To deal with such scenarios, the protocol is stateless between offer and
booking. Stateless in the sense that the state is held on the client and not on
the server side. How can this be achieved? The trick is to encode all necessary
information about an offer into the offerId and thus implicitly stored on the
server side.

Thus once an offerId is chosen, the offer is generated on the fly on the server
side, checked for consistency and then a booking in the state `PREBOOKED`is
created.

If your system thus not support this magic, you probably don't need it and can
of course work cache the offers on the server side for a given time and return
this information as part of the offer information.

### Why are you using POST when there should be a GET? <a name="WhyareyouusingPOSTwhenthereshouldbeaGET?">

It would be in the spirit of REST to search for
`GET /bookings?firstName=John&lastName=Doe` to return all bookings of John Doe.
As the path, including the search terms would be logged by any involved system,
this collection of data violates GDPR regulations. We have reviewed all our
services and decided to use POST in such cases and thus support privacy by
design.

### How are IRTs modeled? <a name="HowareIRTsmodeled?">

IRT stands for _integrated rail ticket_ and stands for a group of products where
the admission includes a seat as reservation. For example given, IRT are
available on Eurostar or Thalys trains which basically act as any airplane where
you can only enter if you have a reserved seat.

The way they are modelled in OSDM are as _admission_ with an _included
reservation_, i.e., the seat reservation have an `"optionality": INCLUDED`. The
admission with the included reservation have to be treated atomically by any
implementation.

### How many seats are available on the train? <a name="Howmanyseatsareavailableonthetrain?">

The availability on a given train is bound to the products available on the
train. I.e. the number of available bike reservations on a train is expressed on
the offers of type "Bike Reservation" by the attribute
`"numericAvailability": 23`. If no bike reservation places are available, no
offer of this type is returned.

This feature is optional to support by implementors, some railways decide not
give insight into the numeric availability of product (especially super saver
fares) on their trains.

### When to pass in which passenger attributes? <a name="Whentopassinwhichpassengerattributes?">

We take special care not to violate passenger personal rights and build in
privacy by design. Thus we collect as little information as possible at every step,
i.e. only the attributes absolutely necessary to fulfill the operation are
gathered. To indicate which information is needed there is a
`requestedInformation` attribute which express the information needed expressed
in small DSL for
[requested information](https://osdm.io/spec/requested-information-grammar.html).

## Advanced Topics <a name="AdvancedTopics">

### Choosing Your Seat <a name="ChoosingYourSeat">

The easiest option is to book a place near to a given place:

```json
{
    "offers": [
        {
            "offerId": "<selected_offer_id>",
            "optionalReservationSelections": [
                {
                    "reservationId": "<selected_reservation_id>"
                }
            ],
            "placeSelections": [
                {
                    "reservationId": "<selected_reservation_id>",
                    "referencePlace": {
                        "coachNumber": "string",
                        "placeNumber": "string"
                    }
                }
            ]
        }
        ..
    ],
    "passengerSpecifications": [
        {
            "externalRef": "<passenger_id>",
            "type": "PERSON"
        }
    ],
}

```

Another option is to express seating wishes of a passenger such as at the window
etc.

```json
{
    "offers": [
        {
            "offerId": "<selected_offer_id>",
            "optionalReservationSelections": [
                {
                    "reservationId": "<selected_reservation_id>"
                }
            ],
            "placeSelections": [
                {
                    "reservationId": "<selected_reservation_id>",
                    "accommodations": [
                        {
                            "passengerRefs": "string",
                            "placeProperties": [
                                "WINDOW"
                            ]
                        }
                    ]
                }
            ]
        }
        ..
    ],
    "passengerSpecifications": [
        {
            "externalRef": "<passenger_id>",
            "type": "PERSON"
        }
    ],
}

```

Or if you have unique seat chosen via a graphical seat reservation (see below)
you just pass in a coach and seat number in the `POST /bookings` request:

```json
{
    "offers": [
        {
            "offerId": "<selected_offer_id>",
            "optionalReservationSelections": [
                {
                    "reservationId": "<selected_reservation_id>"
                }
            ],
            "placeSelections": [
                {
                    "reservationId": "<selected_reservation_id>",
                    "places": [
                        {
                            "coachNumber": "5",
                            "placeNumber": "21",
                            "passengerRef": "<passenger-id>"
                        }
                    ]
                }
            ]
        }
        ..
    ],
    "passengerSpecifications": [
        {
            "externalRef": "<passenger_id>",
            "type": "PERSON"
        }
    ],
}

```

To be able to build a graphical seat reservation, you first need information of
the layout of the vehicles. The service `GET /coachLayouts/{layoutId}` allows
you to download the layout. As a distributor you can now use this information to
build a slick reservation UI that allows your customer to choose the seat or
bed.

### How to book a pass? <a name="Howtobookapass?">

Offers for a pass for a certain origin and destination can be requested by using
the `productTags` filter:

```json
{
  "tripSearchCriteria": {
    "origin": "urn:uic:stn:8500010",
    "destination": "urn:uic:stn:8503000"
  },
  "offerSearchCriteria": {
    "productTags": ["Interrail"]
  }
}
```

### What are fares? <a name="Whatarefares?">

Fares are priced segments which can be used to create offers for a given trips
constrained by fare combination constraints. In the role as a retailer you don't
need to care about them.
