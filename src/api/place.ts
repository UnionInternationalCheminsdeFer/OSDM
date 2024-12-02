import levenshtein from 'js-levenshtein'
import type { Client } from "openapi-fetch"
import type { paths } from "@/schemas/schema"

export class OSDMPlace {
    client: Client<paths>
    requestor: string

    constructor(client: Client<paths>, requestor: string) {
        this.client = client;
        this.requestor = requestor;
    }

    async findPlaces(input: string) {
        const response = await this.client?.POST('/places', {
            params: {
              header: {
                Requestor: this.requestor,
              },
            },
            body: {
              placeInput: {
                name: input,
              },
            },
          })
        
        if (response && response.data && response.data.places) {
            const places = response.data.places
            places.sort((a, b) => levenshtein(a.name, input) - levenshtein(b.name, input))
            return places
        }
    
        return []
    }
}
