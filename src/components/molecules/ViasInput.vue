<template>
    <div class="relative">
        <div class="w-full flex">
            <div class="flex-1" />
            <button class="flex-1 text-left pl-4" @click="toggleVias" v-if="!expanded">
                {{ summaryString(selectedVias) }}
            </button>
        </div>
        <div v-if="expanded"
            class="absolute w-fit bg-osdm-bg-white shadow-lg rounded-lg p-4 right-0 flex flex-col gap-2" ref="popout">
            <div class="flex  items-center gap-4" v-for="(_entry, index) in selectedVias ? [...selectedVias, -1] : [-1]"
                :key="`via-${index}`">
                <span>via</span>
                <InputPlace name="Via 1" :select-callback="(via) => setVia(via, index)"
                    :selected-place="selectedVias && selectedVias[index]" />
                <button v-if="index < (selectedVias?.length ?? 0)" @click="() => removeVia(index)">
                    <sbb-icon name="trash-small" />
                </button>
                <div class="w-7" v-else />
            </div>
        </div>
    </div>
</template>

<script lang="ts">
import { placeToSearchCriteriaLocation, type SearchCriteriaLocation } from '@/stores/trips';
import { SbbIconElement as SbbIcon } from '@sbb-esta/lyne-elements/icon'
import InputPlace from '../atoms/InputPlace.vue';
import type { components } from '@/schemas/schema';

export default {
    props: {
        selectedVias: {
            type: Array<SearchCriteriaLocation>
        },
        selectCallback: {
            type: Function,
            required: true,
        },
    },
    data() {
        return {
            expanded: false,
            viasAdded: this.selectedVias?.length ?? 0 + 1,
        }
    },
    components: {
        SbbIcon,
        InputPlace,
    },
    methods: {
        summaryString(vias: SearchCriteriaLocation[] | undefined) {
            if (!vias || vias.length == 0) {
                return "+ Add Vias"
            } else if (vias.length > 3 || `via ${vias.map((v) => v.name)}`.length > 20) {
                return `via ${vias.length} stops`
            }
            return `via ${vias.map((v) => v.name).join(', ')}`
        },
        setVia(via: components['schemas']['Place'], index: number) {
            if (!this.selectedVias) {
                this.selectCallback([placeToSearchCriteriaLocation(via)])
            } else if (this.selectedVias.length == index) {
                this.selectCallback([...this.selectedVias, placeToSearchCriteriaLocation(via)])
            } else {
                const updatedVias = this.selectedVias
                updatedVias[index] = via;
                this.selectCallback(updatedVias)
            }
        },
        toggleVias(event: MouseEvent) {
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
        removeVia(index: number) {
            if (index < (this.selectedVias?.length ?? 0)) {
                this.selectCallback(this.selectedVias?.filter((s, i) => i != index))
            }
        }
    }
}
</script>