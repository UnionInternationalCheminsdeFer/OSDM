<template>
  <sbb-form-field width="collapse">
    <label>{{ name }}</label>
    <input class="min-w-20" :value="value" @input="handleInput" />
  </sbb-form-field>
</template>

<script lang="ts">
import { SbbFormFieldElement as SbbFormField } from '@sbb-esta/lyne-elements/form-field'
export default {
  props: {
    name: String,
    value: String,
  },
  components: {
    SbbFormField,
  },
  methods: {
    handleInput(event: Event) {
      this.$emit('input', event)
    },
  },
}
</script>
