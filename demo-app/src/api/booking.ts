import type { components, paths } from '@/schemas/schema'
import type { Client } from 'openapi-fetch'

export class OSDMBooking {
  client: Client<paths>
  requestor: string

  constructor(client: Client<paths>, requestor: string) {
      this.client = client;
      this.requestor = requestor;
  }

  fulfillBooking(bookingId: string) {
    return this.client?.POST('/bookings/{bookingId}/fulfillments', {
      params: {
        header: {
          Requestor: this.requestor,
          'Content-Type': 'application/json',
        },
        path: {
          bookingId,
        },
      },
      body: {},
    })
  }

  getBooking(bookingId: string) {
    return this.client?.GET('/bookings/{bookingId}', {
      params: {
        header: {
          Requestor: this.requestor,
        },
        path: {
          bookingId,
        },
      }
    })
  }

  placeBooking (
    request: components['schemas']['BookingRequest']
  ) {
    return this.client?.POST('/bookings', {
      params: {
        header: {
          Requestor: this.requestor,
        },
      },
      body: request,
    })
  }
}
