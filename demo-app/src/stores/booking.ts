import { defineStore } from 'pinia'
import type { components } from '@/schemas/schema'

export class BookingError {
  title: string
  description: string
  icon: string

  constructor(title: string, description: string, icon: string) {
    this.title = title
    this.description = description
    this.icon = icon
  }
}

export const useBookingStore = defineStore('booking', {
  state: (): {
    booking: components['schemas']['Booking'] | undefined
    fulfillment: components['schemas']['Fulfillment'] | undefined
    error: BookingError | undefined
    status: string
    loading: boolean
  } => ({
    booking: undefined,
    fulfillment: undefined,
    loading: false,
    status: 'prebooking',
    error: undefined,
  }),
  actions: {
    setBooking(booking: components['schemas']['Booking']) {
      this.booking = booking
      this.status = 'fullfilling'
      this.fulfillment = undefined
      this.error = undefined
    },
    setFulfillment(fulfillment: components['schemas']['Fulfillment']) {
      this.fulfillment = fulfillment
      this.status = 'done'
      this.error = undefined
      this.loading = false
    },
    setLoading(value: boolean) {
      this.loading = value
      this.status = 'prebooking'
    },
    setError(error: BookingError) {
      this.error = error
      this.booking = undefined
      this.fulfillment = undefined
      this.loading = false
    },
  },
})
