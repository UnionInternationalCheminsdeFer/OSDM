<template>
  <div class="flex-1 flex flex-col min-w-64">
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
</template>

<script lang="ts">
import type { components } from '@/schemas/schema'
import type { PtRideLeg } from '@sbb-esta/lyne-elements-experimental/core/timetable.js'
import { SbbPearlChainTimeElement as SbbPearlChainTime } from '@sbb-esta/lyne-elements-experimental/pearl-chain-time'

export default {
  props: {
    trip: {
      type: Object,
      required: true,
    },
  },
  components: {
    SbbPearlChainTime,
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
