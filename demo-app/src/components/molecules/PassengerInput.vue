<template>
    <div class="relative">
        <div
            class="flex items-center font-bold text-sm rounded-full pl-4 py-1 w-fit bg-osdm-gray text-osdm-text-secondary gap-4">
            <div class="flex items-center ">
                <sbb-icon name="walk-slow-small"></sbb-icon>
                <span>{{ summaryString(selectedPassengers) }}</span>

            </div>
            <button @click="togglePopover"
                class="bg-white rounded-full py-1 my-[-20px] px-4 border border-osdm-text-secondary text-osdm-text-secondary flex items-center">
                <sbb-icon name="pen-small"></sbb-icon>
            </button>
        </div>
        <div v-if="expanded"
            class="absolute w-fit bg-osdm-bg-white shadow-lg rounded-lg p-4 border left-0 top-full mt-2 flex flex-col gap-2 min-w-48 z-20"
            ref="popout">
            <div class="flex items-center justify-between">
                <h2>Passengers</h2>
                <sbb-button icon-name="plus-small" size="s" @click="addPassenger"></sbb-button>
            </div>
            <hr class="my-2">
            <div class="flex  items-center gap-4" v-for="(passenger, index) in selectedPassengers"
                :key="`passenger-${index}`">

                {{ `Passenger ${index + 1}` }}
                <button v-if="index > 0" @click="() => removePassenger(index)">
                    <sbb-icon name="trash-small" />
                </button>
            </div>
        </div>
    </div>
</template>

<script lang="ts">
import type { components } from '@/schemas/schema';
import { SbbIconElement as SbbIcon } from '@sbb-esta/lyne-elements/icon'

export default {
    components: {
        SbbIcon,
    },
    props: {
        selectedPassengers: {
            type: Array<components['schemas']['Passenger']>,
            required: true,
        },
        selectCallback: {
            type: Function,
            required: true,
        },
    },
    data() {
        return {
            expanded: false,
        }
    },
    methods: {
        summaryString(passengers: components['schemas']['Passenger'][]) {
            if (passengers.length == 1) {
                return "1 Passenger"
            }
            return `${passengers.length} Passengers`
        },
        togglePopover(event: MouseEvent) {
            event.stopPropagation();
            this.expanded = !this.expanded;

            if (this.expanded) {
                window.addEventListener("click", this.checkClickOutside)
            } else {
                window.removeEventListener("click", this.checkClickOutside)
            }
        },
        checkClickOutside(event: MouseEvent) {
            let targetParent = (event.target as HTMLElement);
            while (targetParent.parentElement) {
                if (targetParent == this.$refs.popout) {
                    return;
                }
                targetParent = targetParent.parentElement
            }
            this.expanded = false;
            window.removeEventListener("click", this.checkClickOutside)
        },
        addPassenger() {
            this.selectCallback([...this.selectedPassengers, {
                id: `passenger_0${this.selectedPassengers.length}`,
                externalRef: `passenger_0${this.selectedPassengers.length}`,
                type: 'PERSON',
            }])
        },
        removePassenger(index: number) {
            if (index > 0) {
                this.selectCallback(this.selectedPassengers?.filter((s, i) => i != index))
            }
        }
    }
}
</script>