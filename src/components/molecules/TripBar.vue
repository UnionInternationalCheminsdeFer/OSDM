<template>
  <div class="bg-osdm-accent flex justify-center p-4 gap-5 items-center">
    <sbb-button negative="" icon-name="arrow-left-small" @click="handleGoBack"></sbb-button>
    <sbb-card>
      <div>
        <sbb-journey-header
          :origin="searchCriteria?.origin.name"
          :destination="searchCriteria?.destination.name"
        ></sbb-journey-header>
        <span>{{ searchCriteria?.date.toLocaleDateString() }}</span>
      </div>
    </sbb-card>
  </div>
</template>

<script lang="ts">
import { useTripsStore } from '@/stores/trips'
import { SbbButtonElement as SbbButton } from '@sbb-esta/lyne-elements/button'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import { SbbJourneyHeaderElement as SbbJourneyHeader } from '@sbb-esta/lyne-elements/journey-header'

export default {
  components: {
    SbbButton,
    SbbCard,
    SbbJourneyHeader,
  },
  computed: {
    searchCriteria() {
      return useTripsStore().search
    },
  },
  methods: {
    handleGoBack() {
      this.$router.push('/')
    },
  },
}
</script>
