---
layout: page
title: Transportables (Draft 10.07.2026)
hide_hero: true
permalink: /spec/transportables/
---

## 1. Passenger

Input:

- (`Passenger`,  age)

Optional Output:

- `YOUNG_CHILD`
- `CHILD`
- `YOUTH`
- `ADULT`
- `SENIOR`
- (`FAMILY_CHILD`) # no longer needed
- `ACCOMP_PRM`, links to `PRM` or `PRM_CHILD`

### Business Rule

- SPG decided that in international rail output types are **not** needed.

## (Humans with Reduced Mobility) - solved

- `PRM`
- `PRM_CHILD`
- `WHEELCHAIR`

## 2. Pets

- `ACCOMP_DOG`
- `PET`           # formerly DOG
- `PET_IN_CAGE`   # formerly PET

### Requirements on Pets

- Needs an Owner, i,e, Human

## 3. Personal Belonging

- `DANDY_HORSE`  # for PRM
- `LUGGAGE`
- `BICYCLE`
- `PRAM`

### Requirements on Personal Belongings

- Can not travel alone
- Needs an Owner, i,e, Human (tbd)

## 4. Vehicles

Are transported on a car carrying vehicle

- `CAR`
- `MOTOCYCLE`       # TODO: fix typo
- `SPECIAL_VEHICLE` # needs to be placed at special places in a transport train
- `TRAILER`

### Requirements on Vehicles

- Needs an owner, i,e, passenger
- Needs a License Plate
- Needs dimensions (height, width, length)
- Needs Weight

## Solution Draft

We add four `TransportableType`

1. `PassengerType`
2. `PetType`
3. `PersonalBelongingType`
4. `VehicleType`

Relationship between classes:

|                     | `Passenger`         | `Pet`.   | `Personal` | `Vehicle` |
|---------------------|---------------------|----------|------------|-----------|
| `Passenger`         |  needs a & can have | can have | can have   | can have  |
| `Pet`               |  needs a            |          |            |           |
| `PersonalBelonging` |  needs a            |          |            |           |
| `Vehicle`           |  needs a            |          |            |           |

Existing Classes

- `Passenger`
- not yet: `PersonalBelonging`
- not yet: `Pet`
- `Vehicle`

## YAML Proposal

```yaml
## Types
schema:
    TransportableType:
        oneOf:  # ToDo:  add proper inheritance
        - $ref: PetType
        - $ref: PassengerType
        - $ref: PersonalBelongingType
        - $ref: VehicleType

    PetType:
        type: string
        x-enum:
        - `PET`
        - `PET_IN_CAGE`

    PassengerType:
        type: string
        x-enum:
        - `YOUNG_CHILD`
        - `CHILD` 
        - `YOUTH`
        - `ADULT`
        - `SENIOR`
        - (`ACCOMP_PRM`)  # TBC

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
        - `MOTOCYCLE`
        - `SPECIAL_VEHICLE`  # needs to be placed at special places in a transport train 
        - `TRAILER`

    ## Classes

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
        properties:
            type:
                $ref: PassengerType
            accompaniedPassengerRef:
                $ref: PassengerRef

    Pet:
        type: object
        required:
            - type
        properties:
            type:
                $ref: PetType
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

    Vehicle:
        type: object
        required:
            - type
        properties:
            type:
                $ref: VehicleType
            accompaniedPassengerRef:
                $ref: PassengerRef
```
