import type { components, paths } from '@/schemas/schema'
import { BookingError, useBookingStore } from '@/stores/booking'
import type { Client } from 'openapi-fetch'

export class OSDMBooking {
  client: Client<paths>
  requestor: string

  constructor(client: Client<paths>, requestor: string) {
      this.client = client;
      this.requestor = requestor;
  }

  async fulfillBooking(booking: components['schemas']['Booking']) {
    await this.client?.POST('/bookings/{bookingId}/fulfillments', {
      params: {
        header: {
          Requestor: this.requestor,
        },
        path: {
          bookingId: booking.id,
        },
      },
      body: {},
    })
  }

  async placeBooking (
    offerId: string,
    ancillaryId: string[],
    passengers: components['schemas']['Passenger'][],
  ) {

    useBookingStore().setLoading(true)
    const response = await this.client?.POST('/bookings', {
      params: {
        header: {
          Requestor: this.requestor,
        },
      },
      body: {
        offers: [
          {
            offerId: offerId,
            afterSaleByRetailerOnly: null,
            passengerRefs: passengers.map((p) => p.externalRef),
            optionalAncillarySelections: ancillaryId.map((aID) => ({
              ancillaryId: aID,
              passengerRefs: passengers.map((p) => p.externalRef),
            })),
          },
        ],
        passengerSpecifications: passengers,
        purchaser: {
          detail: passengers[0].detail ?? {firstName: '', lastName: ''},
        }
      },
    })
    if (response?.data?.booking) {
      this.fulfillBooking(response.data.booking)
      useBookingStore().setBooking(response.data.booking)
      // useBookingStore().setFulfillment(fulfillment)
      return
    } else if (response?.data) {
      useBookingStore().setError(
        new BookingError(
          'No results',
          'No booking could be created for the specified offer',
          'sign-exclamation-point-medium',
        ),
      )
      return
    }
    useBookingStore().setError(
      new BookingError(
        'An error occurred',
        'The Server returned an error',
        'sign-exclamation-point-medium',
      ),
    )
  }
}
