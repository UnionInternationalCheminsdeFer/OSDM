# #1450 — Link seat-related ancillaries to the places of a reservation

## Problem

Some ancillaries depend on the seat:

1. **Ancillary → place.** A passenger booking the *power* ancillary needs a `POWER` seat. Power seats stay open to
   everyone else.
2. **Place → ancillary.** A seat near the bicycle area can only be taken with *bike* or *extra luggage*.

A passenger can combine both (*power* + *bike* → a seat with both properties).

Today the retailer cannot tell which seats a passenger may pick at offer stage: nothing links an ancillary to the
places it requires.

## Change

**`ReservationOfferPart.ancillaryPlaceRequirements`**: new list of `AncillaryPlaceRequirement`.

| Field | Type | Meaning |
|---|---|---|
| `id` | string, required | Unique within the offer. Referenced by the place map. |
| `placeProperties` | `PlaceProperty[]`, required | Properties shared by the places concerned. |
| `ancillaryRefs` | `OfferPartReference[]`, required | Ancillaries requiring one of these places. |
| `isReservedForAncillaries` | boolean, default `false` | If true, these places require one of `ancillaryRefs`. |

**`SpecificPlaceAvailability.ancillaryPlaceRequirementIds`**: the requirements that concern the place, empty or
absent if none does. This sits next to `selectionFee`, as agreed in the WG.

Additive only. The place-map request and `status` are unchanged.

```json
"ancillaryPlaceRequirements": [
  { "id": "req-power", "placeProperties": ["POWER"],
    "ancillaryRefs": [{ "id": "anc-power" }] },
  { "id": "req-bike", "placeProperties": ["NEAR_BICYCLE_AREA"],
    "ancillaryRefs": [{ "id": "anc-bike" }, { "id": "anc-luggage" }], "isReservedForAncillaries": true }
]
```

## Rule for the consumer

A passenger can select a `FREE` place only if:

1. every requirement referencing one of their ancillaries is listed on the place (**AND**), and
2. for every listed requirement with `isReservedForAncillaries: true`, they book at least one of its ancillaries
   (**OR**).

The provider checks the same rule at `POST /bookings`, where `OfferSelection` carries both the ancillaries and the
selected places.

## Example

Coach 5 has four free seats with different properties, plus one seat already taken.

### 1. `POST /offers` response

The offer contains one reservation and three optional ancillaries:

| Offer part | Type | Content |
|---|---|---|
| `res-1` | `ReservationOfferPart` | Any seat, with the `ancillaryPlaceRequirements` below |
| `anc-power` | `AncillaryOfferPart` | Power socket |
| `anc-bike` | `AncillaryOfferPart` | Bicycle |
| `anc-luggage` | `AncillaryOfferPart` | Extra luggage |

`res-1.ancillaryPlaceRequirements`:

| `id` | `placeProperties` | `ancillaryRefs` | `isReservedForAncillaries` | Meaning for the distributor |
|---|---|---|---|---|
| `req-power` | `POWER` | `anc-power` | `false` | A passenger booking the power ancillary must sit on a `POWER` seat. Other passengers can take these seats too. |
| `req-bike` | `NEAR_BICYCLE_AREA` | `anc-bike`, `anc-luggage` | `true` | A passenger booking the bike or the luggage ancillary must sit near the bicycle area. Only these passengers can take these seats. |

At this stage the distributor already knows which ancillaries depend on the seat. For example, it can offer the
power ancillary together with the seat choice.

### 2. `POST /vehicle-place-map` response

The request references `res-1` as usual. In the response, each seat lists the requirements it satisfies:

| Seat | `status` | `ancillaryPlaceRequirementIds` | Meaning for the distributor |
|---|---|---|---|
| 11 | `FREE` | empty | Plain seat. No ancillary needs it and it is closed to no one. |
| 12 | `FREE` | `req-power` | Suits the power ancillary. Open to every passenger. |
| 13 | `FREE` | `req-bike` | Suits the bike and luggage ancillaries. Reserved for passengers booking one of them. |
| 14 | `FREE` | `req-power`, `req-bike` | Suits the power, bike and luggage ancillaries. Reserved for passengers booking bike or luggage. |
| 15 | `ALLOCATED` | `req-power` | Already taken. The requirements do not matter. |

### 3. Seats each passenger can select

The distributor applies the rule to each passenger with the ancillaries they picked:

| Passenger's ancillaries | Selectable seats | Why |
|---|---|---|
| none | 11, 12 | 13 and 14 list `req-bike`, which is reserved, and the passenger books neither bike nor luggage. |
| power | 12 | The seat must list `req-power`: 12 or 14. Seat 14 also lists `req-bike`, which is reserved, and power is not one of its ancillaries. |
| bike | 13, 14 | The seat must list `req-bike`. The bike satisfies its reservation. On seat 14, `req-power` is not reserved, so it does not block. |
| luggage | 13, 14 | Same as bike: `req-bike` accepts either of its ancillaries. |
| power + bike | 14 | The seat must list both `req-power` and `req-bike`. Only seat 14 does. |
| meal (not in any requirement) | 11, 12 | The meal does not restrict seats, so this is the same as no ancillary. |

In a group, each passenger is evaluated with their own ancillaries. A passenger with a bike picks from 13 and 14,
while a passenger without ancillaries on the same reservation picks from 11 and 12.

If the provider opens the seats near the bicycle area to everyone (e.g. close to departure), its offers return
`req-bike` with `isReservedForAncillaries: false`. Seats 13 and 14 then become selectable by passengers without
ancillaries.

## Why this design

- **On the reservation, not the ancillary.** The reservation is the right to a place. The ancillary only narrows
  which place it can use. This follows the 3.7 direction (reservations link to ancillaries, not the reverse).
- **Two directions, one list.** `requiredAncillaryRefs` alone covers reserved places (2) but not power (1): it would close
  power seats to everyone without the ancillary. The boolean distinguishes the two.
- **Ids in the place map.** The consumer does not have to match layout properties to requirements by place number,
  which is not unique per coach. It also works for properties with no code yet.
- **Not one reservation offer per combination.** That works today, but needs 2^k offers per seat type, per passenger
  and leg, all computed up front, and loses the ancillary's own identity for after-sales.
- **Not ancillary refs in the place-map request.** The provider would need one call per combination, and could not
  serve a group whose passengers take different ancillaries.

## Out of scope

- A seat with two reserved requirements needs one ancillary per requirement (AND), not one across both.
- Reserving only some of the places with a property for ancillaries (a quota).
- A code for luggage storage in the `PlaceProperty` list (separate code-list request).
- Compartments selectable only as a whole (no known use case).
- Port to v4 once agreed.
