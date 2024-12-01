import type { components } from '@/schemas/schema'
import { OfferListError, useOfferStore } from '@/stores/offers'
import { osdmClientKey, requestorHeaderKey } from '@/types/symbols'
import { inject } from 'vue'

export const searchOffers = async (
  trip: components['schemas']['Trip'],
  passengers: components['schemas']['Passenger'][],
) => {
  const OSDM = inject(osdmClientKey)
  const requestor = inject(requestorHeaderKey) ?? ''

  useOfferStore().setLoading(true)
  const response = await OSDM?.POST('/offers', {
    params: {
      header: {
        Requestor: requestor,
      },
    },
    body: {
      anonymousPassengerSpecifications: passengers,
      tripSpecifications: [
        {
          externalRef: trip.externalRef,
          legs: trip.legs,
          isPartOfInternationalTrip: null,
        },
      ],
    },
  })
  if (response?.data?.offers) {
    useOfferStore().setOffers(response.data.offers)
    return
  } else if (response?.data) {
    useOfferStore().setError(
      new OfferListError(
        'No results',
        'No trips could be found for your search request',
        'binoculars-large',
      ),
    )
    return
  }
  useOfferStore().setError(
    new OfferListError(
      'An error occurred',
      'The Server returned an error',
      'sign-exclamation-point-medium',
    ),
  )
}
