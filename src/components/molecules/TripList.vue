<template>
  <div class="bg-osdm-bg-secondary w-full h-full flex flex-col items-center gap-2 p-4">
    <sbb-card v-for="trip in trips" :key="`trip-${trip.id}`" class="max-w-[500px] w-2/3">
      <div class="flex items-center gap-5">
        <div class="flex-1 flex flex-col">
          <sbb-pearl-chain-time
            :legs="calculateSBBLegsFromTrip(trip)"
            :arrival-time="trip.endTime"
            :departure-time="trip.startTime"
          ></sbb-pearl-chain-time>
          <div>
            <span>{{
              trip.transfers == 0
                ? 'direct'
                : trip.transfers == 0
                  ? `${trip.transfers} transfers`
                  : `${trip.transfers} transfers`
            }}</span>
            <span>{{}}</span>
          </div>
        </div>

        <sbb-button icon-name="chevron-right-small"></sbb-button>
      </div>
    </sbb-card>

    <div v-if="error" class="flex flex-col items-center justify-center h-full">
      <sbb-icon :icon-name="error.icon"></sbb-icon>
      <h2>{{ error.title }}</h2>
      <span>{{ error.description }}</span>
    </div>
  </div>
</template>

<script lang="ts">
import type { components } from '@/schemas/schema'
import { useTripsStore } from '@/stores/trips'
import type { PtRideLeg } from '@sbb-esta/lyne-elements-experimental/core/timetable.js'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import { SbbPearlChainTimeElement as SbbPearlChainTime } from '@sbb-esta/lyne-elements-experimental/pearl-chain-time'
import { SbbIconElement as SbbIcon } from '@sbb-esta/lyne-elements/icon'

export default {
  components: {
    SbbCard,
    SbbPearlChainTime,
    SbbIcon,
  },
  computed: {
    trips() {
      return useTripsStore().trips
    },
    error() {
      return useTripsStore().error
    },
  },
  methods: {
    calculateSBBLegsFromTrip(trip: components['schemas']['Trip']) {
      const sbbLegs: PtRideLeg[] = trip.legs
        .map((tripLeg): PtRideLeg | undefined => {
          if (tripLeg.timedLeg) {
            return {
              __typename: 'PTRideLeg',
              id: tripLeg.id,
              arrival: {
                time: tripLeg.timedLeg.end.serviceArrival.timetabledTime,
                quayChanged: false,
              },
              departure: {
                time: tripLeg.timedLeg.start.serviceDeparture.timetabledTime,
                quayChanged: false,
              },
              serviceJourney: {
                quayTypeName: 'platform',
                quayTypeShortName: 'Pl.',
                serviceAlteration: {
                  cancelled: false,
                  delayText: 'string',
                  reachable: true,
                  unplannedStopPointsText: '',
                  partiallyCancelled: false,
                  redirected: false,
                  redirectedText: '',
                },
                id: tripLeg.id,
                notices: [],
                serviceProducts: [],
                situations: [],
                stopPoints: tripLeg.timedLeg.intermediates?.map(() => ({
                  //stop: components['schemas']['Intermediate']
                  stopStatus: 'PLANNED',
                })) ?? [{}],
              },
              start: {
                id: tripLeg.timedLeg.start.stopPlaceRef.stopPlaceRef,
                name: tripLeg.timedLeg.start.stopPlaceName,
              },
              end: {
                id: tripLeg.timedLeg.end.stopPlaceRef.stopPlaceRef,
                name: tripLeg.timedLeg.end.stopPlaceName,
              },
              countryCodes: {},
              duration: tripLeg.timedLeg.duration ? parseInt(tripLeg.timedLeg.duration) : undefined,
            }
          }
        })
        .filter((leg) => !!leg) as PtRideLeg[]

      return sbbLegs
    },
  },
}
</script>
