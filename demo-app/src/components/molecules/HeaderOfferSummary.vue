<template>
  <sbb-card>
    <div class="flex flex-col items-center">
      <div class="self-start mb-4">
        <p
          v-for="(description, index) in getOfferPartSummary(offer.admissionOfferParts)"
          :key="`desc-offer-${offer.id}-${index}`"
          class="text-lg font-bold"
        >
          {{ description }}
        </p>
      </div>
      <div class="flex justify-between w-full">
        <sbb-chip size="xs" color="Granite">
          <div class="flex items-center">
            <sbb-icon name="tickets-class-small"></sbb-icon>
            {{ normalizeClassText(offer.offerSummary.overallTravelClass) }}
          </div>
        </sbb-chip>
        <sbb-chip size="xs" color="Milk">
          <div class="flex items-center">
            <sbb-icon name="hand-heart-small"></sbb-icon>
            {{ normalizeText(offer.offerSummary.overallServiceClass.name) }}
          </div>
        </sbb-chip>
        <sbb-chip size="xs" color="Milk">
          <div class="flex items-center">
            <sbb-icon name="arrows-circle-small"></sbb-icon>
            {{ normalizeText(offer.offerSummary.overallFlexibility) }}
          </div>
        </sbb-chip>
      </div>
      <hr class="w-full my-4" v-if="addedAncillaries.length > 0" />
      <div
        v-for="ancillaryOffer in addedAncillaries"
        :key="`desc-${ancillaryOffer.id}`"
        class="flex justify-between w-full items-center"
      >
        +
        <span> {{ displayPrice(ancillaryOffer.price) }}</span>
        <p>{{ getOfferPartSummary([ancillaryOffer]).join(' ') }}</p>
      </div>
      <hr class="w-full my-2" />
      <div class="w-full flex justify-end gap-14 items-center">
        <span class="text-lg font-bold">{{
          displayPrice(
            offer.offerSummary.minimalPrice,
            addedAncillaries.map((aa) => aa.price),
          )
        }}</span>
      </div>
    </div>
  </sbb-card>
</template>

<script lang="ts">
import { displayPrice } from '@/helpers/price'
import type { components } from '@/schemas/schema'
import { SbbCardElement as SbbCard } from '@sbb-esta/lyne-elements/card'
import { SbbChipElement as SbbChip } from '@sbb-esta/lyne-elements/chip'

export default {
  components: {
    SbbCard,
    SbbChip,
  },
  props: {
    offer: {
      type: Object,
      required: true,
    },
    addedAncillaries: {
      type: Array<components['schemas']['AncillaryOfferPart']>,
      required: true,
    },
  },
  setup() {
    return { displayPrice }
  },
  methods: {
    getOfferPartSummary(offerParts: components['schemas']['AbstractOfferPart'][]) {
      const productIds = offerParts.flatMap((op) => op.products.map((prod) => prod.productId))
      return productIds?.map(
        (ap) =>
          this.offer.products?.find((prod: components['schemas']['Product']) => prod.id == ap)
            ?.summary,
      )
    },
    normalizeText(text: string) {
      // Convert the text to lowercase
      const lowercased = text.toLowerCase()

      // Replace underscores with spaces
      const spacesAdded = lowercased.replace(/_/g, ' ')

      // Capitalize the first letter of each word
      const words = spacesAdded.split(' ')
      const capitalized = words.map((word) => word.charAt(0).toUpperCase() + word.slice(1))

      // Join the words back into a single string
      return capitalized.join(' ')
    },
    normalizeClassText(text: string) {
      if (text.toLowerCase() == 'first') {
        return '1st class'
      }
      if (text.toLowerCase() == 'second') {
        return '2nd class'
      }
      return this.normalizeText(text)
    },
  },
}
</script>
