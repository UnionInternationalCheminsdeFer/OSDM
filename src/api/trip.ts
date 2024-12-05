import type { paths } from '@/schemas/schema'
import { TripListError, useTripsStore, type SearchCriteria, type SearchCriteriaLocation } from '@/stores/trips'
import type { Client } from 'openapi-fetch'

export class OSDMTrip {
  client: Client<paths>
  requestor: string

  constructor(client: Client<paths>, requestor: string) {
      this.client = client;
      this.requestor = requestor;
  }

  async searchTrips(searchCriteria: SearchCriteria) {

    const toStopRef = (scl: SearchCriteriaLocation) => (
      {
        objectType: scl.objectType,
        stopPlaceRef: scl.id,
        name: scl.name,
      }
    );

    useTripsStore().setLoading(true)
      const vias = searchCriteria.vias.map((v) => ({viaPlace: toStopRef(v)}));
      const viasRequest = vias.length > 0 ? vias : undefined;
      const response = await this.client?.POST('/trips-collection', {
        params: {
          header: {
            Requestor: this.requestor,
          },
        },
        body: {
          origin: toStopRef(searchCriteria.origin),
          destination: toStopRef(searchCriteria.destination),
          vias: viasRequest,
          departureTime: searchCriteria.date.toISOString().split('Z')[0],
        },
      })
      if (response?.data?.trips) {
        useTripsStore().setTrips(response.data.trips)
        return
      } else if (response?.data) {
        useTripsStore().setError(
          new TripListError(
            'No results',
            'No trips could be found for your search request',
            'binoculars-large',
          ),
        )
        return
      }
      useTripsStore().setError(
        new TripListError(
          'An error occurred',
          'The Server returned an error',
          'sign-exclamation-point-medium',
        ),
      )
  }
}
