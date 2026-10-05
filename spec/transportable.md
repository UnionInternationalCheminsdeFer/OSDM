---
layout: page
title: Transportable (Draft 17.07.2026)
hide_hero: true
permalink: /spec/transportable/
---

## 1. Passenger (Human)

Input:

- (passenger,  age)

Optional Output: 

- `YOUNG_CHILD`, `CHILD`, `YOUTH`, `ADULT`,`SENIOR`.

### Business Rule for Passenger

- SPG decided that in international rail output types are **not** needed.

## (Humans with Reduced Mobility) - solved

- `PRM`
- `PRM_CHILD`
- `WHEELCHAIR`

## 2. Animal

- `ANIMAL`
- `ANIMAL_IN_CAGE`   # formerly PET
- `DOG`

### Requirements on Passenger

- Needs an Owner, i,e, Human

## 3. Personal Belonging

- `DANDY_HORSE`  # for PRM
- `LUGGAGE`
- `BICYCLE`
- `PRAM`

### Requirements on Personal Belongings

- Can not travel alone
- Needs an Owner, i,e, Human (tbd)

## 4. Road Vehicle

Road vehicle are transported on a carrying vehicle:

- `CAR`
- `MOTOCYCLE`       # typo
- `MOTORCYCLE`
- `SPECIAL_VEHICLE` # needs to be placed at special places in a transport train
- `TRAILER`

### Requirements on Vehicle

- Needs an owner, i,e, passenger
- Needs a license plate
- Needs dimensions (height, width, length)
- Needs weight

## Solution Draft

We add an abstract `TransportableType` consisting of four concrete types:

1. `PassengerType`
2. `PetType`
3. `PersonalBelongingType`
4. `TransportedVehilceType`

Relationship between classes:

|                       | `Passenger`         | `Animal` | `PersonalBelonging` | `TransportedVehilce` |
|-----------------------|---------------------|----------|------------|-----------|
| `Passenger`           |  needs a & can have | can have | can have   | can have  |
| `Animal`              |  needs a            |          |            |           |
| `PersonalBelonging`   |  needs a            |          |            |           |
| `TransportedVehilce`  |  needs a            |          |            |           |

Existing Classes

- `Passenger` - needs small extension only
- not yet: `PersonalBelonging`
- not yet: `Animal`
- `TransportedVehilce` - invented by Sir Adam Kertesz

## Type of Offer returned for a Given Type of Transportable (tbc)

*Aim*: standardize what type of offer is returned for a given transportable request (normative).

|  Type of Transportable    | Type of Offer (`OfferType`)    |
|---------------------------|--------------------------------|
| `PassengerType`           |  Admission, Reservation        |
| `AnimalType`              |  Admission + opt. Ancillary    |
| `PersonalBelongingType`   |  Ancillary                     |
| `TransportedVehilceType`  |  Reservation + opt. Ancillary  |

### Example for SBB

E.g. for SBB, a product manager needs to map its internal products to an official OSDM type offer type.

- Product 125  --> Admission
- Product 2003 --> Reservation
- Product 343434 --> Admission

## YAML Proposal

```yaml
schema:
    ## Types

    TransportableType:
        oneOf:  # ToDo:  add proper inheritance
        - $ref: AnimalType
        - $ref: PassengerType
        - $ref: PersonalBelongingType
        - $ref: TransportedVehilceType

    AnimalType:
        type: string
        x-enum:
        - `ANIMAL`
        - `ANIMAL_IN_CAGE`
        - `DOG`

    PassengerType:
        type: string
        x-enum:
        - `YOUNG_CHILD`
        - `CHILD` 
        - `YOUTH`
        - `ADULT`
        - `SENIOR`

    PersonalBelongingType:
        type: string
        x-enum:
        - `BICYCLE`
        - `DANDY_HORSE` # for a PRM
        - `LUGGAGE`
        - `PRAM`
        - `TANDEM_BIKE`

    VehicleType:
        type: string
        x-enum:
        - `CAR`
        - `MOTOCYCLE` # Typo
        - `MOTORCYCLE`
        - `SPECIAL_VEHICLE`  # needs to be placed at special places in a transport train 
        - `TRAILER`

    ## Classes (ToDo: Properly model inheritance)

    AbstractTransportable:
        type: object
        required:
            - type
        properties:
            type:
                $ref: TransportableType

    Passenger:
        type: object
        required:
            - type
            - ....
        properties:
            type:
                $ref: PassengerType
            accompaniedPassengerRef:
                $ref: PassengerRef
            ...

    Animal:
        type: object
        required:
            - type
        properties:
            type:
                $ref: AnimalType
            accompaniedPassengerRef: 
                $ref: PassengerRef

    PersonalBelonging:
        type: object
        required:
            - type
        properties:
            type:   
                $ref: PersonalBelongingType
            accompaniedPassengerRef: 
                $ref: PassengerRef

    TransportedVehilce:
        type: object
        required:
            - type
        properties:
            type:
                $ref: TransportedVehilceType
            accompaniedPassengerRef:
                $ref: PassengerRef
```
