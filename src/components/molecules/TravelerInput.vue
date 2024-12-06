<template>
  <sbb-card>
    <div class="flex flex-col gap-4 pb-4">
      <h1>Passenger {{ passengerStoreIndex + 1 }}</h1>
      <InputText name="First Name" :value="passenger.details?.firstName"
        @input="(event) => updatePassengerProperty('firstName', event)" />
      <InputText name="Last Name" :value="passenger.details?.lastName"
        @input="(event) => updatePassengerProperty('lastName', event)" />
      <InputPhone name="Phone Number" :value="passenger.details?.lastName"
        @input="(event) => updatePassengerProperty('phoneNumber', event)" />
      <InputEmail name="E-Mail" :value="passenger.details?.lastName"
        @input="(event) => updatePassengerProperty('email', event)" />
    </div>
  </sbb-card>
</template>

<script lang="ts">
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import InputText from '../atoms/InputText.vue'
import { usePassengerStore } from '@/stores/passengers'
import type { components } from '@/schemas/schema'
import InputEmail from '../atoms/InputEmail.vue'
import InputPhone from '../atoms/InputPhone.vue'

export default {
  props: {
    passenger: {
      type: Object,
      required: true,
    },
    passengerStoreIndex: {
      type: Number,
      required: true,
    },
  },
  components: {
    SbbCard,
    InputText,
    InputEmail,
    InputPhone,
  },
  methods: {
    updatePassengerProperty(
      propertyKey: 'lastName' | 'firstName' | 'phoneNumber' | 'email',
      event: InputEvent,
    ) {
      const value = (event.target as HTMLInputElement).value

      const passengerDetails = this.passenger as components['schemas']['Passenger']
      if (!passengerDetails.detail) {
        passengerDetails.detail = { firstName: '', lastName: '' }
      }
      if (passengerDetails.detail) {
        passengerDetails.detail[propertyKey] = value
        usePassengerStore().setPassengerDetails(this.passengerStoreIndex, passengerDetails)
      }
    },
  },
}
</script>
