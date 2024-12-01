<template>
  <div class="h-full bg-osdm-accent mt-1 flex flex-col items-center p-4 gap-4">
    <sbb-card
      class="max-w-[500px] w-1/2"
      v-for="fulfillment in booking.fulfillments"
      :key="`ful-${fulfillment.id}`"
    >
      {{ fulfillment }}
    </sbb-card>
  </div>
</template>

<script lang="ts">
import { useBookingStore } from '@/stores/booking'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
export default {
  components: { SbbCard },
  computed: {
    booking() {
      return useBookingStore().booking
    },
  },
}
</script>
