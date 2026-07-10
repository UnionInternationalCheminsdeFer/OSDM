# On Transportables

Lets' divide and conqur.

## 1. Person

Input:

- (`Person`,  age)

Optional Output:

- `YOUNG_CHILD`
- `CHILD`
- `YOUTH`
- `ADULT`
- `SENIOR`
- (`FAMILY_CHILD`) -- no longer needed
- `ACCOMP_PRM`, links to `PRM` or `PRM_CHILD`

### Business Rule

- In international rail output types are **not** needed.

## (Living Things: Humans with Reduced Mobility) - solved 

- `PRM`
- `PRM_CHILD`
- `WHEELCHAIR` + a Human

## 2. Animals

- `ACCOMP_DOG`
- `DOG`  --> `ANIMAL`
- `PET` --> `ANIMAL_IN_CAGE`

### Requirements

- Needs an Owner, i,e, Human

## 3. Personal Belonging

- `DANDY_HORSE` - for a PRM
- `LUGGAGE`
- `BICYCLE`
- `PRAM`

### Requirements

- Can not travel alone
- Needs an Owner, i,e, Human (tbd)

## 4. Vehicles

Are transported on a car carrying vehicle

- `CAR`
- `MOTOCYCLE`
- `SPECIAL_VEHICLE` - needs to be placed at special places in a transport train
- `TRAILER`

### Requirements

- Needs an Owner, i,e, Human
- Needs a Licence Plate
- Needs Dimensions (Height, Width, Length)
- Neeeds Weight

## Solution Draft

We add four `TranportableType`

1. `PassengerType`
2. `AnimalType`
3. `PersonalBelongingType`
4. `VehicleType`

Relatioship between types: Which 

|     | PT         | AT       | PBT      | VT       |
|-----|------------|----------|----------|----------|
| PT  |  can have  | can have | can have | can have |
| AT  |  needs a   |          |          |          |
| PBT |  needs a   |          |          |          |
| VT  |  needs a   |          |          |          |

Existing Classes

- `PERSON`/`PASSENGER`
- not yet: `PERSONALBELONGING`
- not yet: `ANIMAL`
- `VEHICLE`/ `TRANSPORTABLE`

### Proposal 

```yaml
## Types

TranportableType:
    oneOf:
        - $ref: AnimalType
        - $ref: PassengerType
        - $ref: PersonalBelongingType
        - $ref: VehicleType

AnimalType:
    type: string
    x-enum:
        - `ANIMAL`
        - `ANIMAL_IN_CAGE`

PassengerType:
    type: string
    ...

PersonalBelongingType:
    type: string
    x-enum:
        - `BICYCLE`
        - `DANDY_HORSE` - for a PRM
        - `LUGGAGE`
        - `PRAM`
        - `TANDEM_BIKE`

VehicleType:
    type: string
    x-enum:
        ..

## Classes

AbstractTransportable:
    type: object
    required:
        -type

Passenger:
    type: object
    required:
      - type
    properties:
        type:
            $ref: PassengerType
        accompaniedPassengerRef:
            $ref: option passenger reference

Animal:
    type: object
    required:
      - type
    properties:
        type:
            $ref: AnimalType
        accompaniedPassengerRef: 
            $ref: optional passenger reference

PersonalBelonging:
    type: object
    required:
      - type
    properties:
        type:   
            PersonalBelongingType
        accompaniedPassengerRef: 
            $ref: optional passenger reference

Vehicle:
    type: object
    required:
        -type
    properties:
        type:
            Vehcile
        accompaniedPassengerRef:
            $ref: option passenger reference
```
