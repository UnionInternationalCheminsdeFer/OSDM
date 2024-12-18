<template>
    <sbb-form-field width="collapse" :size="size">
        <label>{{ name }}</label>
        <input class="min-w-20" type="number" :min="min" :mazx="max" :value="value" @input="handleInput" />
    </sbb-form-field>
</template>

<script lang="ts">
import { SbbFormFieldElement as SbbFormField } from '@sbb-esta/lyne-elements/form-field'
export default {
    props: {
        name: String,
        value: String,
        size: String,
        min: Number,
        max: Number,
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