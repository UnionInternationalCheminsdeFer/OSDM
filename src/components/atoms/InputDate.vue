<template>
  <sbb-form-field>
    <label>{{ name }}</label>
    <sbb-datepicker-toggle></sbb-datepicker-toggle>
    <input />
    <sbb-datepicker @change="handleChange"></sbb-datepicker>
  </sbb-form-field>
</template>

<script lang="ts">
import { SbbFormFieldElement as SbbFormField } from '@sbb-esta/lyne-elements/form-field'
import {
  SbbDatepickerElement as SbbDatepicker,
  SbbDatepickerToggleElement as SbbDatepickerToggle,
} from '@sbb-esta/lyne-elements/datepicker'

export default {
  props: {
    name: String,
    selectCallback: {
      type: Function,
      required: true,
    },
  },
  components: {
    SbbFormField,
    SbbDatepicker,
    SbbDatepickerToggle,
  },
  methods: {
    handleChange(event: Event) {
      this.selectCallback((event.target as HTMLInputElement).valueAsDate)
    },
  },
}
</script>
