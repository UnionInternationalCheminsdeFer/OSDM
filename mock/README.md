# Mocking the OSDM Interface

## Scenario 1: Basel SBB - Davos Platz

Mocked resources:

- GET `/locations/?matchValue=Basel`
- GET `/locations/?matchValue=Davos`
- GET `/locations/?matchValue=Landquart`
- GET `/locations/?matchValue=Sargans`
- GET `/locations/?matchValue=Zürich`
- POST `/trips-collection`
- POST `/trip-offers-collection`
- POST `/bookings`
- POST `/bookings/{bookingId}/fulfillments`
- GET `/bookings/booking_001/passengers/passenger_001`
- GET `/products/CH00125FIRST`
- GET `/products/CH10125FIRST`
- GET `/fulfillments/94a4c484-702f-11eb-9439-0242ac130002`
- GET `/fulfillments/3730e668-7032-11eb-9439-0242ac130002`
- GET `/fulfillments/406e9432-7032-11eb-9439-0242ac130002`

The [WireMock](https://wiremock.org) is used to build the mock which is configured
by [WireMock Mappings](./mappings/sale-core-mappings.json).

Use `./startMock.sh` to run mock.

## Used Ids

Ids used for this scenario (`grep -C 2 -n '"id' trip-offer-response-Basel-DavosPlatz.json`):

- stops: Basel SBB, Davos Platz, Landquart, Sargans, Zürich HB
- trip offer id:  `tripOffer_001`
- admission id: `admission_BaselSBB-DavosPlatz`
- reservation ids:
  - `reservation_BaselSBB-Landquart`
  - `reservation_Landquart-DavosPlatz`
- product ids:
  - `CH00125FIRST`
  - `CH10125FIRST`
- passenger id: `ca622d56-7033-11eb-9439-0242ac130002`
- fulfillment Id:
  - `94a4c484-702f-11eb-9439-0242ac130002` (Admission Basel SBB - Davos Platz)
  - `3730e668-7032-11eb-9439-0242ac130002` (Reservation Basel SBB - Landquart)
  - `406e9432-7032-11eb-9439-0242ac130002` (Reservation Landquart - Davos Platz)

## Journeys to Add Next

- Zürich Hb - Wien (öBB)
- Basel SBB - Frankfurt (DB)
- Basel SBB - Paris (SNCF)
- Zürich HB - Milano (Trenitalia)
- Paris - London (Sqills)
- Paris - Brüssels (BENE)
- Paris - Bordeaux (Amadeus)
- ...
