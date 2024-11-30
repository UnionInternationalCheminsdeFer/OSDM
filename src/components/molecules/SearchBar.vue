<template>
  <div>
    <sbb-card>
      <div class="flex gap-4">
        <InputPlace name="Origin" :select-callback="setOrigin" :selected-place="origin" />
        <InputPlace
          name="Destination"
          :select-callback="setDestination"
          :selected-place="destination"
        />
        <InputDate name="Date" :select-callback="setDate" />
        <InputTime name="Time" :select-callback="setTime" />
        <sbb-button @click="handleSearchTrip">Search</sbb-button>
      </div>
    </sbb-card>
  </div>
</template>

<script lang="ts">
import { SbbButtonElement as SbbButton } from '@sbb-esta/lyne-elements/button'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import InputDate from '../atoms/InputDate.vue'
import InputPlace from '../atoms/InputPlace.vue'
import InputTime from '../atoms/InputTime.vue'
import type { components } from '@/schemas/schema'
import { osdmClientKey, requestorHeaderKey } from '@/types/symbols'
import { inject } from 'vue'

export default {
  components: {
    InputDate,
    InputPlace,
    InputTime,
    SbbButton,
    SbbCard,
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
      origin: undefined,
      destination: undefined,
      date: new Date(Date.now()),
    }
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
        this.OSDM?.POST('/trips-collection', {
          params: {
            header: {
              Requestor: this.Requestor,
            },
          },
          body: {
            origin: this.getOnlyRef(this.origin),
            destination: this.getOnlyRef(this.destination),
            departureTime: this.date.toISOString().split('Z')[0],
          },
        }).then((response) => {
          console.log(response)
        })
      }
    },
    getOnlyRef(place: components['schemas']['Place']) {
      return {
        objectType: place.objectType,
        stopPlaceRef: place.id,
      }
    },
  },
}
</script>
