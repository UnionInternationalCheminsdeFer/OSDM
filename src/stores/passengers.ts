import { defineStore } from 'pinia'
import type { components } from '@/schemas/schema'

export const usePassengerStore = defineStore('passenger', {
  state: (): {
    passengers: components['schemas']['Passenger'][]
  } => ({
    passengers: [
      {
        id: 'passenger_01',
        externalRef: 'passenger_01',
        type: 'PERSON',
      },
    ],
  }),
  actions: {
    setPassengerDetails(index: number, passenger: components['schemas']['Passenger']) {
      this.passengers[index] = passenger
    },
    addPassenger(passenger: components['schemas']['Passenger']) {
      this.passengers.push(passenger)
    },
    removePassenger(index: number) {
      this.passengers = this.passengers.filter((_, i) => i != index)
    },
  },
})
