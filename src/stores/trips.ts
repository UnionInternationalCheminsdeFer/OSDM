import { defineStore } from 'pinia'
import type { components } from '@/schemas/schema'

export class TripListError {
  title: string
  description: string
  icon: string

  constructor(title: string, description: string, icon: string) {
    this.title = title
    this.description = description
    this.icon = icon
  }
}

export type SearchCriteria = {
  origin: components['schemas']['Place']
  destination: components['schemas']['Place']
  date: Date
}

export const useTripsStore = defineStore('trips', {
  state: (): {
    search: SearchCriteria | undefined
    trips: components['schemas']['Trip'][]
    selectedTrip: components['schemas']['Trip'] | undefined
    error: TripListError | undefined
    loading: boolean
  } => ({
    search: undefined,
    selectedTrip: undefined,
    loading: false,
    error: undefined,
    trips: [],
  }),
  actions: {
    setTrips(trips: components['schemas']['Trip'][]) {
      this.trips = trips
      this.loading = false
      this.error = undefined
    },
    setSearchCriteria(searchCriteria: SearchCriteria) {
      this.search = searchCriteria
    },
    setLoading(value: boolean) {
      this.loading = value
    },
    selectTrip(value: components['schemas']['Trip']) {
      this.selectedTrip = value
    },
    setError(error: TripListError) {
      this.error = error
      this.trips = []
      this.loading = false
    },
  },
})
