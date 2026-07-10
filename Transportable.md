# On Transportables

Divide et impera.

## 1. Passenger

Input:

- (`Passenger`,  age)

Optional Output:

- `YOUNG_CHILD`
- `CHILD`
- `YOUTH`
- `ADULT`
- `SENIOR`
- (`FAMILY_CHILD`) - no longer needed
- `ACCOMP_PRM`, links to `PRM` or `PRM_CHILD`

### Business Rule

- SPG decided that in international rail output types are **not** needed.

## (Humans with Reduced Mobility) - solved 

- `PRM`
- `PRM_CHILD`
- `WHEELCHAIR`

## 2. Pets

- `ACCOMP_DOG`
- `PET`          # formerly DOG
- `PET_IN_CAGE`  # formerly PET

### Requirements on Pets

- Needs an Owner, i,e, Human

## 3. Personal Belonging

- `DANDY_HORSE` - for a PRM
- `LUGGAGE`
- `BICYCLE`
- `PRAM`

### Requirements on Personal Belongings

- Can not travel alone
- Needs an Owner, i,e, Human (tbd)

## 4. Vehicles

Are transported on a car carrying vehicle

- `CAR`
- `MOTOCYCLE`
- `SPECIAL_VEHICLE` - needs to be placed at special places in a transport train
- `TRAILER`

### Requirements on Vehciles

- Needs an Owner, i,e, Human
- Needs a Licence Plate
- Needs dimensions (height, width, length)
- Needs Weight

## Solution Draft

We add four `TranportableType`

1. `PassengerType`
2. `PetType`
3. `PersonalBelongingType`
4. `VehicleType`

Relatioship between types: Which 

|                         | Passenger Type   | Pet Type | PBT      | Vehivle Type       |
|-------------------------|------------------|----------|----------|----------|
| Passenger Type          |  needs a & can have | can have | can have | can have |
| Pet Type                |  needs a        |          |          |          |
| Personal Belonging Type |  needs a        |          |          |          |
| Vehicle Type            |  needs a        |          |          |          |

Existing Classes

- `PERSON`/`PASSENGER`
- not yet: `PERSONALBELONGING`
- not yet: `PET`
- `VEHICLE`/ `TRANSPORTABLE`

### Proposal 

```yaml
## Types

TranportableType:
    oneOf:
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
