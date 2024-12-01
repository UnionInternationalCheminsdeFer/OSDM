import type { components } from '@/schemas/schema'
import { BookingError, useBookingStore } from '@/stores/booking'
import { osdmClientKey, requestorHeaderKey } from '@/types/symbols'
import { inject } from 'vue'

const fulfillBooking = async (booking: components['schemas']['Booking']) => {
  const OSDM = inject(osdmClientKey)
  const requestor = inject(requestorHeaderKey) ?? ''
  await OSDM?.POST('/bookings/{bookingId}/fulfillments', {
    params: {
      header: {
        Requestor: requestor,
      },
      path: {
        bookingId: booking.id,
      },
    },
    body: {},
  })
}

export const placeBooking = async (
  offerId: string,
  ancillaryId: string[],
  passengers: components['schemas']['Passenger'][],
) => {
  const OSDM = inject(osdmClientKey)
  const requestor = inject(requestorHeaderKey) ?? ''

  useBookingStore().setLoading(true)
  const response = await OSDM?.POST('/bookings', {
    params: {
      header: {
        Requestor: requestor,
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
    },
  })
  if (response?.data?.booking) {
    fulfillBooking(response.data.booking)
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
