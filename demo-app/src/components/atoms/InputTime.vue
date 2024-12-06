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
  },
  mounted() {
    if (this.value) {
      // ToDo: Fix type
      // SbbTimeInput element
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      (this.$refs.input as any).setValueAsDate(this.value)
    }
  },
  methods: {
    handleInput(event: Event) {
      // ToDo: Fix type
      // SbbTimeInput element
      // eslint-disable-next-line @typescript-eslint/no-explicit-any
      this.selectCallback((event.target as any).getValueAsDate())
    },
  },
}
</script>
