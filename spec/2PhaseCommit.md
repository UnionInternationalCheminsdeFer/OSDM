# Two phase commit
This feature is intended for aggregators and distributors to build robust integrations for trips operated by multiple provider systems.
In a distributed environment, it is impossible to be 100% bulletproof.

OSDM introduces a prepare step for the most critical operations.
The idea is that the aggregator runs the prepare step for each involved provider system before performing the final confirmation.
This represents a reasonable level of effort for providers and will significantly reduce the amount of manual work required in case of errors.

New Endpoints
Two new endpoints are introduced:
* `POST /bookings/{bookingId}/prepare/fulfillments`
* `POST /bookings/{bookingId}/prepare/refund-offers/{refundOfferId}`

The exchange is confirmed with `POST /fulfillments`.
`POST /bookings/{bookingId}/prepare/fulfillments` can be used beforehand to validate the booking.

Ideally, the same code is executed on the provider side for both the prepare and commit steps (except the actual commit).
While this might not be fully achievable for every provider, all validations must at least be performed during the prepare step.
There is still a small risk that issues may occur between the prepare step and the actual commit a few milliseconds later.

The endpoints are not mandatory for provider systems, but aggregators will likely request them when integrating a provider into an ecosystem with multiple provider systems.

## Response Structure
* **HTTP 202** – Empty respons (successful prepare)
* **HTTP 400** – Problems returned as an array of standard problem structures:
```
{
 "problems": [
    {
      "code": "string",
      "type": "https://example.com/probs/passenger-email-address-missing",
      "title": "Validation error",
      "status": 400,
      "detail": "Passenger email address is missing",
      "instance": "string",
      "pointers": [
        {
          "code": "string",
          "type": "https://example.com/probs/passenger-email-address-missing",
          "title": "Validation error",
          "status": 400,
          "detail": "Passenger email address is missing",
          "instance": "string",
          "responsePointer": "#/booking/passenger[4]"
        }
      ]
    }
  ]
}
```
## Advantages:
- Ping mechanism. Aggregator knows that **all** involved provider systems are up and running
- Aggregator now that all needed information is in the provider bookings and it is ready to be confirmed.

## Sequence diagrm
This sequence diagram describe the two phase commit secuence at fulfillment. Same approach can be used for refund and exchange.

```mermaid
sequenceDiagram
    actor Purchaser
    participant Aggregator
    participant Provider1
    participant Provider2
    



    note over Purchaser: Confirm booking

    Purchaser ->> Aggregator: POST /bookings/{bookingId}/fulfillments
    note over Aggregator: Check if it will work
    Aggregator ->> Provider1 : POST /bookings/{bookingId}/prepare/fulfillments
    Provider1 ->> Aggregator: http: 202/40*
    alt http-code != 202
        note over Aggregator: Stop process
        Aggregator ->> Purchaser: Not possible to fulfill. Problem returned
    end
    Aggregator ->> Provider2 : POST /bookings/{bookingId}/prepare/fulfillments
    Provider2 ->> Aggregator: http: 202/40*
    alt http-code != 202
        note over Aggregator: Stop process    
        Aggregator ->> Purchaser: Not possible to fulfill. Problem returned
    end
    note over Aggregator: All providers are prepared,<br> then collect the money followed by confirm
    Aggregator ->> Provider1 : POST /bookings/{bookingId}/fulfillments
    Provider1 ->> Aggregator: http: 202/40*
    alt http-code !=  20*
         Aggregator ->> Purchaser:  http-code 
    end
    Aggregator ->> Provider2 : POST /bookings/{bookingId}/fulfillments
    Provider2 ->> Aggregator: http: 20*/40*
    alt http-code !=  20*
        Aggregator ->> Provider1 : Refund provider1 booking (technical error)
        Provider1 ->> Aggregator :refunded
        alt error
        note over Aggregator: Big problems <br> Must be handled manually
        Aggregator->> Purchaser : big problem http-code 50*
        else
            note over Aggregator: Fulfillment failed in a controlled way.
            Aggregator ->> Purchaser:  http-code 40*
        end
    end

    note over Aggregator: All confirmed, return positive response
    Aggregator ->> Purchaser: fulfilled booking http-code: 20* with Fulfillments

```
