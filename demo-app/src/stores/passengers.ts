import { defineStore } from 'pinia'
import type { components } from '@/schemas/schema'
import { convertDateToOsdmDate } from '@/helpers/conversions';

export const usePassengerStore = defineStore('passenger', {
  state: (): {
    passengers: components['schemas']['Passenger'][]
  } => {
    const dummyBirthdate = new Date(Date.now());
    dummyBirthdate.setFullYear(dummyBirthdate.getFullYear() - 27)

    return {
    passengers: [
      {
        id: 'passenger_01',
        externalRef: 'passenger_01',
        dateOfBirth: convertDateToOsdmDate(dummyBirthdate),
        type: 'PERSON',
      },
    ],
  }},
  actions: {
    definePassengers(passengers: components['schemas']['Passenger'][]) {
      this.passengers = passengers
    },
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
