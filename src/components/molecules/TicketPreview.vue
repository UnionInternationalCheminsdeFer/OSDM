<template>
  <div class="h-full bg-osdm-bg-secondary mt-1 flex flex-col items-center p-4 gap-4">

    <sbb-card v-if="booking" class="max-w-[500px] w-1/2">
      <h1 class="text-2xl font-bold mb-4">Overview</h1>

      <div class="mb-4">
        <h2 class="text-xl font-semibold">Booking ID: {{ booking.id }}</h2>
      </div>

      <div class="mb-4">
        <h3 class="text-lg font-semibold">Passenger Details</h3>
        <div class="list-disc pl-5" v-for="passenger in booking.passengers" :key="`pas-${passenger.id}`">
          <ul v-if="passenger.detail">
            <li>{{ passenger.detail.firstName }} {{ passenger.detail.lastName }}</li>
            <li v-if="passenger.detail.email">Email: {{ passenger.detail.email }}</li>
            <li v-if="passenger.detail.phoneNumber">Phone: {{ passenger.detail.phoneNumber }}</li>
            <li v-if="passenger.age">Age: {{ passenger.age }}</li>
          </ul>
        </div>

      </div>

      <div class="mb-4" v-if="booking.confirmedPrice">
        <h3 class="text-lg font-semibold">Price Overview</h3>
        <p class="font-bold">
          {{ displayPrice(booking.confirmedPrice) }}
        </p>
      </div>
    </sbb-card>
    <sbb-card class="max-w-[500px] w-1/2" v-for="fulfillment in booking?.fulfillments" :key="`ful-${fulfillment.id}`">
      <div>
        <span>Control Number: {{ fulfillment.controlNumber }}</span>

        <div v-for="(fulfillmentDocument, index) in fulfillment.fulfillmentDocuments"
          :key="`ful-doc-${fulfillment.id}-${index}`">
          <a v-if="fulfillmentDocument.downloadLink" href="{{ fulfillmentDocument.downloadLink }}"
            class="text-blue-500 hover:underline">Download Ticket</a>
        </div>

      </div>
    </sbb-card>
  </div>
</template>

<script lang="ts">
import { displayPrice } from '@/helpers/price';
import { useBookingStore } from '@/stores/booking'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'

export default {
  components: { SbbCard },
  computed: {
    booking() {
      return useBookingStore().booking
    },
  },
  setup() {
    return { displayPrice }
  },
}
</script>
