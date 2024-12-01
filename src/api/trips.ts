import { TripListError, useTripsStore, type SearchCriteria } from '@/stores/trips'
import { osdmClientKey, requestorHeaderKey } from '@/types/symbols'
import { inject } from 'vue'

export const searchTrips = async (searchCriteria: SearchCriteria) => {
  const OSDM = inject(osdmClientKey)
  const requestor = inject(requestorHeaderKey) ?? ''

  useTripsStore().setLoading(true)
  useTripsStore().setSearchCriteria(searchCriteria)
  const response = await OSDM?.POST('/trips-collection', {
    params: {
      header: {
        Requestor: requestor,
      },
    },
    body: {
      origin: searchCriteria.origin,
      destination: searchCriteria.destination,
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
