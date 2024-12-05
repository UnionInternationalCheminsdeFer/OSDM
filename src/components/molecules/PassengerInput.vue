<template>
    <div>
        <div
            class="flex items-center font-bold text-sm rounded-full pl-4 py-1 w-fit bg-osdm-gray text-osdm-text-secondary gap-4">
            <div class="flex items-center ">
                <sbb-icon name="walk-slow-small"></sbb-icon>
                <span>{{ summaryString(passengers) }}</span>

            </div>
            <button
                class="bg-white rounded-full py-1 my-[-20px] px-4 border border-osdm-text-secondary text-osdm-text-secondary flex items-center">
                <sbb-icon name="pen-small"></sbb-icon>
            </button>
        </div>
    </div>
</template>

<script lang="ts">
import type { components } from '@/schemas/schema';
import { usePassengerStore } from '@/stores/passengers';
import { SbbIconElement as SbbIcon } from '@sbb-esta/lyne-elements/icon'

export default {
    components: {
        SbbIcon,
    },
    computed: {
        passengers() {
            return usePassengerStore().passengers;
        },
    },
    methods: {
        summaryString(passengers: components['schemas']['Passenger'][]) {
            if (passengers.length == 1) {
                return "1 Passenger"
            }
            return `${passengers.length} Passengers`
        }
    }
}
</script>