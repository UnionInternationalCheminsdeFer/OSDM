<template>
  <div class="bg-osdm-bg-secondary w-full h-full flex flex-col items-center gap-2 p-4">
    <OfferCard
      v-for="offer in offers"
      :key="`trip-${offer.offerId}`"
      :offer="offer"
      class="max-w-[500px] w-2/3"
    />

    <div v-if="error" class="flex flex-col items-center mt-12 h-full gap-4">
      <sbb-icon :name="error.icon"></sbb-icon>
      <h2>{{ error.title }}</h2>
      <span>{{ error.description }}</span>
    </div>
  </div>
</template>

<script lang="ts">
import type { components } from '@/schemas/schema'
import { SbbIconElement as SbbIcon } from '@sbb-esta/lyne-elements/icon'
import OfferCard from './OfferCard.vue'
import { useOfferStore } from '@/stores/offers'

export default {
  components: {
    SbbIcon,
    OfferCard,
  },
  computed: {
    offers() {
      return useOfferStore().offers
    },
    error() {
      return useOfferStore().error
    },
  },
}
</script>
