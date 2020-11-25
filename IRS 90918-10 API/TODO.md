# TO DO

## YAML (sorted by priority)
* have a list of value for all codelists in the api

- check required properties              
- clarify reference (definition is a must, reference is optional)
- add notion of TTL (time to life)
- explicitly model inner classes for code generation
- 'Ref' for reference, '' for definition
- Order definitions alphabetically

## Open for discussion:
  - sub resources are accessed via the main resource, except for passengers 
     --> use the same approach also for passengers?
  - correctly reference entities
  * add a status to fulfillments: created, travelled, refunded
  * Add a balance in the booking (provisional, confirmed, paid)

## Documentation
- Todo Nicolas :-)

## Done
- add fulfillmentMedia for PATCH /bookings/{id}/offerParts
- change id to type of id (bookingId)
- reservationOptions for fares and IRT
- add graphical layouts resource
- add exchange
- run YAML through code generator
* refund and refundOffer are the same thing => refund must be removed
* serviceClass to be removed of reservationDetailsRef
* add offermessage
