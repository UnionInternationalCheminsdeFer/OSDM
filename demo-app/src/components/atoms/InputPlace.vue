<template>
  <sbb-form-field>
    <label>{{ name }}</label>
    <!-- Trigger element -->
    <input placeholder="Trigger element" @input="handleInput" ref="input" />

    <sbb-form-field-clear />
    <sbb-autocomplete @optionSelected="handleSelect">
      <sbb-option v-for="place in places" :key="`option-${place.id}`" :icon-name="getIconByType(place.objectType)"
        :value="place.id">
        {{ place.name }}
      </sbb-option>
    </sbb-autocomplete>
  </sbb-form-field>
</template>

<script lang="ts">
import {
  SbbFormFieldElement as SbbFormField,
  SbbFormFieldClearElement as SbbFormFieldClear,
} from '@sbb-esta/lyne-elements/form-field'
import { SbbAutocompleteElement as SbbAutocomplete } from '@sbb-esta/lyne-elements/autocomplete'
import { SbbOptionElement as SbbOption } from '@sbb-esta/lyne-elements/option'
import { osdmClientKey } from "@/types/symbols"
import { inject } from "vue"
import type { components } from '@/schemas/schema'

export default {
  props: {
    name: String,
    selectedPlace: Object,
    selectCallback: {
      type: Function,
      required: true,
    },
  },
  components: {
    SbbFormField,
    SbbFormFieldClear,
    SbbAutocomplete,
    SbbOption,
  },
  data(): { places: components['schemas']['Place'][]; active: boolean; inputValue: string } {
    return {
      places: [],
      active: false,
      inputValue: '',
    }
  },
  setup() {
    const OSDM = inject(osdmClientKey)
    return { OSDM }
  },
  mounted() {
    this.findPlaces('')
    if (this.selectedPlace) {
      ; (this.$refs.input as HTMLInputElement).value = this.selectedPlace.name
    }
  },
  methods: {
    handleInput(input: Event) {
      this.inputValue = (input.target as HTMLInputElement).value
      this.findPlaces(this.inputValue)
    },
    findPlaces(input: string) {

      const request = {
        placeInput: {
          name: input,
        },
      };

      this.OSDM?.place.findPlaces(request).then((result) => this.places = result.slice(0, 5))
    },
    handleActivate() {
      this.inputValue = ''
      this.active = true
    },
    handleDeactivate() {
      this.active = false
    },
    handleSelect(selectEvent: Event) {
      const selectedId = (selectEvent.target as HTMLOptionElement).value
      const selectedItem = this.places.find((place) => place.id === selectedId)
      this.$props.selectCallback(selectedItem)
      this.active = false
        ; (this.$refs.input as HTMLInputElement).value = selectedItem?.name ?? ''
    },
    getIconByType(placeType: string) {
      if (placeType === 'StopPlace') {
        return 'station-medium'
      } else {
        return 'location-pin-medium'
      }
    },
  },
}
</script>
