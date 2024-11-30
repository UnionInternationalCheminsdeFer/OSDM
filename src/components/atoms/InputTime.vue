<template>
  <sbb-form-field width="collapse">
    <label>{{ name }}</label>
    <sbb-time-input @input="handleInput"></sbb-time-input>
    <input />
  </sbb-form-field>
</template>

<script lang="ts">
import { SbbTimeInputElement as SbbTimeInput } from '@sbb-esta/lyne-elements/time-input'
import { SbbFormFieldElement as SbbFormField } from '@sbb-esta/lyne-elements/form-field'
import { SbbFormErrorElement as SbbFormError } from '@sbb-esta/lyne-elements/form-error.js'
export default {
  props: {
    name: String,
    selectCallback: {
      type: Function,
      required: true,
    },
  },
  components: {
    SbbTimeInput,
    SbbFormField,
    SbbFormError,
  },
  methods: {
    handleInput(event: Event) {
      this.selectCallback(event.target.getValueAsDate())
    },
  },
}
</script>
