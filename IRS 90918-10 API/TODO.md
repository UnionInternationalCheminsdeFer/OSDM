# TO DO

# Get reservation right
- PATCH /offers/{offerId}
  Body
   - per segment per passenger expresses Passengers' place preferences 
   - Place preferences

- In response to POST /bookings/{bookingId} you get 
  per segment and/or per passenger what has actually been reserved.

## Small Things
- remove *Ref classes
- add TTL (time to life)
- explicitly model inner classes for code generation
- add product to segment reference
- check required properties              

## for discussion:
  - sub resources are accessed via the main resource, except for passengers 
     --> use the same approach also for passengers?
  - correctly reference entities

## Documentation
- Todo Nicolas :-)


# DONE
- add fulfillmentMedia for PATCH /bookings/{id}/offerParts  - FulfillmentOption added
- reservationOptions for fares and IRT                      - done, merge pending
- add graphical layouts resource                            - done, merge pending
- change id to type of id (bookingId)                       - done
- add exchange                                              - done, merge pending
- run YAML through code generator                           - done, code is being generated