import type { paths } from '@/schemas/schema'
import type { Client } from 'openapi-fetch'
import { OSDMPlace } from './place'
import createClient from 'openapi-fetch'
import { OSDMOffer } from './offer'
import { OSDMTrip } from './trip'
import { OSDMBooking } from './booking'

export class OSDM {
    place: OSDMPlace
    trip: OSDMTrip
    offer: OSDMOffer
    booking: OSDMBooking

    constructor(baseUrl: string, requestor: string) {
        const client = createClient<paths>({
            baseUrl,
          })

        this.place = new OSDMPlace(client, requestor)
        this.trip = new OSDMTrip(client, requestor)
        this.offer = new OSDMOffer(client, requestor)
        this.booking = new OSDMBooking(client, requestor)
    }
}