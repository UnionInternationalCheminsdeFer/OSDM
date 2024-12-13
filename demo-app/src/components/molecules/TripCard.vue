<template>
  <sbb-card>
    <div class="flex items-center gap-5">
      <TripPearlChain :trip="trip" />
      <sbb-button icon-name="chevron-right-small" @click="handleSelect"></sbb-button>
    </div>
  </sbb-card>
</template>

<script lang="ts">
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import TripPearlChain from '../atoms/TripPearlChain.vue'

export default {
  props: {
    trip: {
      type: Object,
      required: true,
    },
  },
  components: {
    SbbCard,
    TripPearlChain,
  },
  methods: {
    handleSelect() {
      this.$router.push({
        name: 'offers',
        query: {
          trip: btoa(encodeURIComponent(JSON.stringify(this.$props.trip))),
          ...this.$route.query
        },
      })
    },
  },
}
</script>
