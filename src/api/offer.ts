import type { components, paths } from '@/schemas/schema'
import { OfferListError, useOfferStore } from '@/stores/offers'
import { TripListError, useTripsStore, type SearchCriteria } from '@/stores/trips'
import type { Client } from 'openapi-fetch'

export class OSDMOffer {
  client: Client<paths>
  requestor: string

  constructor(client: Client<paths>, requestor: string) {
      this.client = client;
      this.requestor = requestor;
  }

  async searchOffers (
    trip: components['schemas']['Trip'],
    passengers: components['schemas']['Passenger'][],
  ) {

  useOfferStore().setLoading(true)
  const response = await this.client?.POST('/offers', {
    params: {
      header: {
        Requestor: this.requestor,
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
}
