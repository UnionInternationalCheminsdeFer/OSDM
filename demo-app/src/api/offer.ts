import type { components, paths } from '@/schemas/schema'
import type { Client } from 'openapi-fetch'

export class OSDMOffer {
  client: Client<paths>
  requestor: string

  constructor(client: Client<paths>, requestor: string) {
      this.client = client;
      this.requestor = requestor;
  }

  searchOffers (
    request: components['schemas']['OfferCollectionRequest'],
  ) {
    return this.client?.POST('/offers', {
      params: {
        header: {
          Requestor: this.requestor,
        },
      },
      body: request,
    })
  }
}
