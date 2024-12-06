<template>
  <sbb-form-field>
    <label>{{ name }}</label>
    <sbb-datepicker-toggle></sbb-datepicker-toggle>
    <input />
    <sbb-datepicker ref="input" @change="handleChange"></sbb-datepicker>
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
    value: Date,
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
  mounted() {
    if (this.value) {
      // Sbb-datepicker element
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      (this.$refs.input as any).setValueAsDate(this.value)
    }
  },
  methods: {
    handleChange(event: Event) {
      this.selectCallback((event.target as HTMLInputElement).valueAsDate)
    },
  },
}
</script>
