import type { SearchCriteriaLocation } from "@/stores/trips";

export type StopPlaceRef = {
    objectType: "StopPlaceRef";
    stopPlaceRef: string,
}

export type AddressRef = {
    objectType: "AddressRef";
    addressRef: string,
}

export type FareConnectionPointRef = {
    objectType: "FareConnectionPointRef";
    fareConnectionPointRef: string,
}

export type GeoPositionRef = {
    objectType: "GeoPositionRef";
    geoPositionRef: string,
}

export type PointOfInterestRef = {
    objectType: "PointOfInterestRef";
    pointOfInterestRef: string,
}

// SearchCriteriaLocation can be replaced with components["schema"]["Place"]
export const convertPlaceToRef = (place: SearchCriteriaLocation):  StopPlaceRef | AddressRef | FareConnectionPointRef | GeoPositionRef | PointOfInterestRef => {
    switch (place.objectType) {
        case 'StopPoint': {
            return {
                objectType: "StopPlaceRef",
                stopPlaceRef: place.id
            }
        }
        case 'Address': {
            return {
                objectType: "AddressRef",
                addressRef: place.id
            }
        }
        case 'FareConnectionPoint': {
            return {
                objectType: "FareConnectionPointRef",
                fareConnectionPointRef: place.id
            }
        }
        case 'GeoPosition': {
            return {
                objectType: "GeoPositionRef",
                geoPositionRef: place.id
            }
        }
        case 'PointOfInterest': {
            return {
                objectType: "PointOfInterestRef",
                pointOfInterestRef: place.id
            }
        }
    }
    throw Error(`Place Type unknown found ${place.objectType} it should be within [ StopPlace | Address | FareConnectionPoint | GeoPosition | PointOfInterest]`)
}