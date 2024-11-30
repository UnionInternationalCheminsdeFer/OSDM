<template>
  <sbb-form-field>
    <label>{{ name }}</label>
    <!-- Trigger element -->
    <input placeholder="Trigger element" @input="handleInput" ref="input" />

    <sbb-form-field-clear />
    <sbb-autocomplete @optionSelected="handleSelect">
      <sbb-option
        v-for="place in places"
        :key="`option-${place.id}`"
        :icon-name="getIconByType(place.objectType)"
        :value="place.id"
      >
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
import { inject } from 'vue'
import { osdmClientKey, requestorHeaderKey } from '@/types/symbols'
import levenshtein from 'js-levenshtein'
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
  setup() {
    const OSDM = inject(osdmClientKey)
    const Requestor = inject(requestorHeaderKey) ?? ''
    return { OSDM, Requestor }
  },
  data(): { places: components['schemas']['Place'][]; active: boolean; inputValue: string } {
    return {
      places: [],
      active: false,
      inputValue: '',
    }
  },
  methods: {
    handleInput(input: Event) {
      this.inputValue = (input.target as HTMLInputElement).value
      this.loadPlaces(this.inputValue)
    },
    loadPlaces(input: string) {
      this.OSDM?.POST('/places', {
        params: {
          header: {
            Requestor: this.Requestor,
          },
        },
        body: {
          placeInput: {
            name: input,
          },
        },
      }).then((response) => {
        if (response.data && response.data.places) {
          const places = response.data.places
          places.sort((a, b) => levenshtein(a.name, input) - levenshtein(b.name, input))
          this.places = places
        }
      })
    },
    handleActivate() {
      this.inputValue = ''
      this.loadPlaces(this.inputValue)
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
      ;(this.$refs.input as HTMLInputElement).value = selectedItem?.name ?? ''
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
