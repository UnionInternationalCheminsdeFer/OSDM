import type { paths } from '@/schemas/schema'
import type { Client, Middleware } from 'openapi-fetch'
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
    _client: Client<paths>
    _requestor: string
    _middlewares: Middleware[]

    constructor(baseUrl: string, requestor: string) {
        const client = createClient<paths>({
            baseUrl,
          })

        this._client = client;
        this._requestor = requestor;
        this._middlewares = [];
        this.place = new OSDMPlace(this._client, this._requestor)
        this.trip = new OSDMTrip(this._client, this._requestor)
        this.offer = new OSDMOffer(this._client, this._requestor)
        this.booking = new OSDMBooking(this._client, this._requestor)
    }

    setupEndpoints() {
        this.place = new OSDMPlace(this._client, this._requestor)
        this.trip = new OSDMTrip(this._client, this._requestor)
        this.offer = new OSDMOffer(this._client, this._requestor)
        this.booking = new OSDMBooking(this._client, this._requestor)
    }

    // ToDo: Find a better solution for this
    setEndpoint(baseUrl: string) {
        const client = createClient<paths>({
            baseUrl,
        })
        this._client = client;
        this._middlewares.forEach((m) => {
            this._client.use(m)
        })
        this.setupEndpoints()
    }

    use(middleware: Middleware) {
        this._client.use(middleware)
        this._middlewares.push(middleware)
    }
}