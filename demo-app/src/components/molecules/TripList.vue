<template>
  <div class="bg-osdm-bg-secondary w-full h-full flex flex-col items-center gap-2 p-4">
    <TripCard v-for="trip in trips" :key="`trip-${trip.id}`" :trip="trip" class="max-w-[500px] w-2/3" />

    <div v-if="error" class="flex flex-col items-center mt-12 h-full gap-4">
      <sbb-icon :name="error.icon"></sbb-icon>
      <h2>{{ error.title }}</h2>
      <span>{{ error.description }}</span>
    </div>
  </div>
</template>

<script lang="ts">
import { useTripsStore } from '@/stores/trips'
import { SbbIconElement as SbbIcon } from '@sbb-esta/lyne-elements/icon'
import TripCard from './TripCard.vue'

export default {
  components: {
    SbbIcon,
    TripCard,
  },
  computed: {
    trips() {
      return useTripsStore().trips
    },
    error() {
      return useTripsStore().error
    },
  },
}
</script>
