<template>
  <div class="bg-osdm-bg-secondary w-full h-full flex flex-col items-center gap-2 p-4">
    <div class="flex mb-4">
      <TravelerInput v-for="(passenger, index) in passengers" :key="`pas-${passenger.id}`" :passenger="passenger"
        :passengerStoreIndex="index" />
    </div>
    <sbb-button @click="handlePurchase">Buy for {{ totalPrice }}</sbb-button>
  </div>
</template>

<script lang="ts">
import { usePassengerStore } from '@/stores/passengers'
import TravelerInput from './TravelerInput.vue'
import { SbbButtonElement as SbbButton } from '@sbb-esta/lyne-elements/button'
import { useOfferStore } from '@/stores/offers'

export default {
  components: {
    TravelerInput,
    SbbButton,
  },
  computed: {
    passengers() {
      return usePassengerStore().passengers
    },
    totalPrice() {
      return useOfferStore().totalPriceOfSelection
    },
  },
  methods: {
    handlePurchase() {
      this.$router.push({
        name: 'booking',
        query: {
          offerId: useOfferStore().selectedOffer?.offerId,
          ancilleryIds: JSON.stringify(useOfferStore().selectedAncilleries.map((sa) => sa.id)),
          ...this.$route.query
        },
      })
    },
  },
}
</script>
