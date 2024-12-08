<template>
  <div class="bg-osdm-bg-primary flex justify-center p-4">
    <sbb-card>
      <div class="grid  sm:grid-cols-1  md:grid-cols-3 justify-center align-middle gap-4">
        <div class="gap-2">
          <InputPlace name="Origin" aria-placeholder="origin" :select-callback="setOrigin" :selected-place="origin" />
        </div>
        <div class="gap-2">
          <InputPlace name="Destination" aria-placeholder="destination" :select-callback="setDestination"
            :selected-place="destination" />
        </div>
        <div class="gap-2">
          <ViasInput aria-placeholder="Vias" :select-callback="setVias" :selectedVias="vias" />
        </div>
        <div class="gap-2">
          <InputDate name="Date" :value="date" :select-callback="setDate" />
        </div>
        <div class="gap-2">
          <InputTime name="Time" :value="date" :select-callback="setTime" />
        </div>
        <div class="gap-1">
          <sbb-toggle v-model="dateReferenceTypeString" size="s">
            <sbb-toggle-option value="DEPARTURE">Departure</sbb-toggle-option>
            <sbb-toggle-option value="ARRIVAL">Arrival</sbb-toggle-option>
          </sbb-toggle>
        </div>
        <div class="gap-2">
          <div class="flex flex-col">
            <div class="gap-1">
              <PassengerInput :select-callback="setPassengers" :selected-passengers="passengers" />
            </div>
          </div>
        </div>
        <div class="gap-2">
          <sbb-button class="self-center" icon-name="arrow-right-small" @click="handleSearchTrip"
            :disabled="!origin || !destination">
            <span v-if="!loading">Search</span>
            <sbb-loading-indicator v-else variant="circle" size="s" color="white"></sbb-loading-indicator>
          </sbb-button>
        </div>
      </div>
    </sbb-card>
  </div>
</template>

<script lang="ts">
import { SbbButtonElement as SbbButton } from '@sbb-esta/lyne-elements/button'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import { SbbToggleElement as SbbToggle } from '@sbb-esta/lyne-elements/toggle'
import { SbbLoadingIndicatorElement as SbbLoadingIndicator } from '@sbb-esta/lyne-elements/loading-indicator'
import InputDate from '../atoms/InputDate.vue'
import InputPlace from '../atoms/InputPlace.vue'
import InputTime from '../atoms/InputTime.vue'
import type { components } from '@/schemas/schema'
import { DateReferenceType, placeToSearchCriteriaLocation, useTripsStore } from '@/stores/trips'
import PassengerInput from './PassengerInput.vue'
import ViasInput from './ViasInput.vue'
import { usePassengerStore } from '@/stores/passengers'

export default {
  components: {
    InputDate,
    InputPlace,
    InputTime,
    SbbToggle,
    SbbButton,
    SbbCard,
    SbbLoadingIndicator,
    ViasInput,
    PassengerInput,
  },
  data(): {
    origin: components['schemas']['Place'] | undefined
    destination: components['schemas']['Place'] | undefined
    vias: components['schemas']['Place'][]
    date: Date
    dateReferenceType: DateReferenceType
  } {
    return {
      origin: useTripsStore().search?.origin,
      destination: useTripsStore().search?.destination,
      vias: useTripsStore().search?.vias ?? [],
      date: useTripsStore().search?.date ?? new Date(Date.now()),
      dateReferenceType: DateReferenceType.DEPARTURE,
    }
  },
  computed: {
    loading() {
      return useTripsStore().loading
    },
    passengers() {
      return usePassengerStore().passengers
    },
    dateReferenceTypeString: {
      get() {
        return this.dateReferenceType == DateReferenceType.DEPARTURE ? 'DEPARTURE' : 'ARRIVAL'
      },
      set(value: string) {
        if (value == 'ARRIVAL') {
          this.dateReferenceType = DateReferenceType.ARRIVAL
        } else {
          this.dateReferenceType = DateReferenceType.DEPARTURE
        }
      },
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
    setVias(selectedValue: components['schemas']['Place'][]) {
      this.vias = selectedValue
    },
    setPassengers(passengers: components['schemas']['Passenger'][]) {
      usePassengerStore().definePassengers(passengers)
    },
    handleSearchTrip() {
      if (this.origin && this.destination) {
        this.$router.push({
          name: 'trips',
          query: {
            o: btoa(encodeURIComponent(JSON.stringify(placeToSearchCriteriaLocation(this.origin)))),
            d: btoa(
              encodeURIComponent(JSON.stringify(placeToSearchCriteriaLocation(this.destination))),
            ),
            t: this.date.toISOString(),
            tr: JSON.stringify(this.dateReferenceType == DateReferenceType.DEPARTURE),
            v: btoa(
              encodeURIComponent(
                JSON.stringify(this.vias.map((sv) => placeToSearchCriteriaLocation(sv))),
              ),
            ),
          },
        })
      }
    },
  },
}
</script>
