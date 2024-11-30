<template>
  <sbb-form-field width="collapse">
    <label>{{ name }}</label>
    <sbb-time-input @input="handleInput" ref="input"></sbb-time-input>
    <input class="min-w-20" />
  </sbb-form-field>
</template>

<script lang="ts">
import { SbbTimeInputElement as SbbTimeInput } from '@sbb-esta/lyne-elements/time-input'
import { SbbFormFieldElement as SbbFormField } from '@sbb-esta/lyne-elements/form-field'
import { SbbFormErrorElement as SbbFormError } from '@sbb-esta/lyne-elements/form-error.js'
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
    SbbTimeInput,
    SbbFormField,
    SbbFormError,
  },
  mounted() {
    if (this.value) {
      this.$refs.input.setValueAsDate(this.value)
    }
  },
  methods: {
    handleInput(event: Event) {
      this.selectCallback(event.target.getValueAsDate())
    },
  },
}
</script>
