import type { components, paths } from '@/schemas/schema'
import type { Client } from 'openapi-fetch'

export class OSDMTrip {
  client: Client<paths>
  requestor: string

  constructor(client: Client<paths>, requestor: string) {
      this.client = client;
      this.requestor = requestor;
  }
  

  searchTrips(request: components['schemas']['TripSearchCriteria']) {
      return this.client?.POST('/trips-collection', {
        params: {
          header: {
            Requestor: this.requestor,
          },
        },
        body: request,
      })
  }
}
