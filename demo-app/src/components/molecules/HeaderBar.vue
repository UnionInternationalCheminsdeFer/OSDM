<template>
  <div class="bg-osdm-bg-primary flex justify-center p-4 gap-5 items-stretch">
    <sbb-button class="absolute z-10 top-4 left-4 md:relative md:left-auto md:top-auto self-center" negative=""
      icon-name="arrow-left-small" @click="handleGoBack"></sbb-button>
    <sbb-card>
      <div>
        <sbb-journey-header :origin="searchCriteria?.origin.name"
          :destination="searchCriteria?.destination.name"></sbb-journey-header>
        <span>{{ searchCriteria?.date.toLocaleDateString() }}</span>
        <TripPearlChain v-if="selectedTrip" :trip="selectedTrip" />
      </div>
    </sbb-card>
    <OfferSummary v-if="selectedOffer" :offer="selectedOffer" :addedAncillaries="selectedAncilleries" />
  </div>
</template>

<script lang="ts">
import { useTripsStore } from '@/stores/trips'
import { SbbButtonElement as SbbButton } from '@sbb-esta/lyne-elements/button'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import { SbbJourneyHeaderElement as SbbJourneyHeader } from '@sbb-esta/lyne-elements/journey-header'
import TripPearlChain from '../atoms/TripPearlChain.vue'
import { useOfferStore } from '@/stores/offers'
import OfferSummary from './HeaderOfferSummary.vue'

export default {
  components: {
    SbbButton,
    SbbCard,
    SbbJourneyHeader,
    TripPearlChain,
    OfferSummary,
  },
  computed: {
    searchCriteria() {
      return useTripsStore().search
    },
    selectedTrip() {
      return useTripsStore().selectedTrip
    },
    selectedOffer() {
      return useOfferStore().selectedOffer
    },
    selectedAncilleries() {
      return useOfferStore().selectedAncilleries
    },
  },
  methods: {
    handleGoBack() {
      if (this.selectedOffer) {
        useOfferStore().unselectOffer()
      }
      if (this.$route.query.offerId) {
        this.$router.push({ name: 'offers', query: { ...this.$route.query, offerId: undefined, ancillariesIds: undefined } })
      } else if (this.$route.query.trip) {
        this.$router.push({ name: 'trips', query: { ...this.$route.query, trip: undefined } })
      } else {
        this.$router.push({ name: 'search' })
      }
    },
  },
}
</script>
