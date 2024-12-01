<template>
  <div class="bg-osdm-accent flex justify-center p-4">
    <sbb-card>
      <div class="flex gap-4">
        <InputPlace name="Origin" :select-callback="setOrigin" :selected-place="origin" />
        <InputPlace
          name="Destination"
          :select-callback="setDestination"
          :selected-place="destination"
        />
        <InputDate name="Date" :value="date" :select-callback="setDate" />
        <InputTime name="Time" :value="date" :select-callback="setTime" />
        <sbb-button
          icon-name="arrow-right-small"
          @click="handleSearchTrip"
          :disabled="!origin || !destination"
        >
          <span v-if="!loading">Search</span>
          <sbb-loading-indicator
            v-else
            variant="circle"
            size="s"
            color="white"
          ></sbb-loading-indicator>
        </sbb-button>
      </div>
    </sbb-card>
  </div>
</template>

<script lang="ts">
import { SbbButtonElement as SbbButton } from '@sbb-esta/lyne-elements/button'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import { SbbLoadingIndicatorElement as SbbLoadingIndicator } from '@sbb-esta/lyne-elements/loading-indicator'
import InputDate from '../atoms/InputDate.vue'
import InputPlace from '../atoms/InputPlace.vue'
import InputTime from '../atoms/InputTime.vue'
import type { components } from '@/schemas/schema'
import { osdmClientKey, requestorHeaderKey } from '@/types/symbols'
import { inject } from 'vue'
import { TripListError, useTripsStore } from '@/stores/trips'

export default {
  components: {
    InputDate,
    InputPlace,
    InputTime,
    SbbButton,
    SbbCard,
    SbbLoadingIndicator,
  },
  setup() {
    const OSDM = inject(osdmClientKey)
    const Requestor = inject(requestorHeaderKey) ?? ''
    return { OSDM, Requestor }
  },
  data(): {
    origin: components['schemas']['Place'] | undefined
    destination: components['schemas']['Place'] | undefined
    date: Date
  } {
    return {
      origin: useTripsStore().search?.origin,
      destination: useTripsStore().search?.destination,
      date: useTripsStore().search?.date ?? new Date(Date.now()),
    }
  },
  computed: {
    loading() {
      return useTripsStore().loading
    },
  },
  methods: {
    setOrigin(selectedValue: components['schemas']['Place']) {
      this.origin = selectedValue
    },
    setDestination(selectedValue: components['schemas']['Place']) {
      this.destination = selectedValue
    },
    setDate(selectedDate: Date) {
      this.date.setFullYear(selectedDate.getFullYear())
      this.date.setMonth(selectedDate.getMonth())
      this.date.setDate(selectedDate.getDate())
    },
    setTime(setTime: Date | null) {
      if (setTime) {
        this.date.setHours(setTime.getHours())
        this.date.setMinutes(setTime.getMinutes())
      }
    },
    handleSearchTrip() {
      if (this.origin && this.destination) {
        this.$router.push({
          name: 'trips',
          query: {
            o: btoa(JSON.stringify(this.getOnlyRef(this.origin))),
            d: btoa(JSON.stringify(this.getOnlyRef(this.destination))),
            t: this.date.toISOString(),
          },
        })
      }
    },
    getOnlyRef(place: components['schemas']['Place']) {
      return {
        objectType: place.objectType,
        stopPlaceRef: place.id,
        name: place.name,
      }
    },
  },
}
</script>
