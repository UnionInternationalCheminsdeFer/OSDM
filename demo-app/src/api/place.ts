import levenshtein from 'js-levenshtein'
import type { Client } from "openapi-fetch"
import type { components, paths } from "@/schemas/schema"

export class OSDMPlace {
    client: Client<paths>
    requestor: string

    constructor(client: Client<paths>, requestor: string) {
        this.client = client;
        this.requestor = requestor;
    }

    async findPlaces(request: components['schemas']['PlaceRequest']) {
        const response = await this.client?.POST('/places', {
            params: {
              header: {
                Requestor: this.requestor,
              },
            },
            body: request,
          })
        
        if (response?.data?.places) {
            const places = response.data.places.filter((p) => p.objectType == "StopPlace") as components['schemas']['StopPlace'][];
            places.sort((a, b) => 
              {
                if (request.placeInput && request.placeInput.name) {
                  return levenshtein(a.name, request.placeInput.name) - levenshtein(b.name, request.placeInput.name)
                }
                return -1
              }
            )
            return places
        }
    
        return []
    }
}
