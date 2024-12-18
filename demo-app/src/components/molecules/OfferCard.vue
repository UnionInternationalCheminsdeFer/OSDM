<template>
  <sbb-card>
    <div class="flex flex-col items-center gap-2">
      <div class="self-start mb-4">
        <p v-for="(description, index) in getOfferPartSummary(offer.admissionOfferParts)"
          :key="`desc-offer-${offer.id}-${index}`" class="text-lg font-bold">
          {{ description }}
        </p>
      </div>
      <div class="flex justify-between w-full">
        <sbb-chip size="s" color="Granite">
          <div class="flex items-center">
            <sbb-icon name="tickets-class-small"></sbb-icon>
            {{ normalizeClassText(offer.offerSummary.overallTravelClass) }}
          </div>
        </sbb-chip>
        <sbb-chip size="s" color="Milk">
          <div class="flex items-center">
            <sbb-icon name="hand-heart-small"></sbb-icon>
            {{ normalizeText(offer.offerSummary.overallServiceClass.name) }}
          </div>
        </sbb-chip>
        <sbb-chip size="s" color="Milk">
          <div class="flex items-center">
            <sbb-icon name="arrows-circle-small"></sbb-icon>
            {{ normalizeText(offer.offerSummary.overallFlexibility) }}
          </div>
        </sbb-chip>
      </div>
      <hr class="w-full my-4" v-if="offer.ancillaryOfferParts && offer.ancillaryOfferParts.length > 0" />
      <div v-for="ancillaryOffer in offer.ancillaryOfferParts" :key="`desc-${ancillaryOffer.id}`"
        class="flex justify-between w-full items-center">
        <button :class="addedAncillaries.includes(ancillaryOffer) ? 'btn' : 'btn btn-unselected'"
          @click="() => handleTogglAncillary(ancillaryOffer)">
          <span v-if="addedAncillaries.includes(ancillaryOffer)">-</span>
          <span v-else>+</span>
        </button>
        <span> {{ displayPrice(ancillaryOffer.price) }}</span>
        <p>{{ getOfferPartSummary([ancillaryOffer]).join(' ') }}</p>
      </div>
      <hr class="w-full my-4" />
      <div class="w-full flex justify-end gap-14 items-center">
        <span class="text-lg font-bold">{{
          displayPrice(
            offer.offerSummary.minimalPrice,
            addedAncillaries.map((aa) => aa.price),
          )
        }}</span>
        <sbb-button icon-name="chevron-right-small" @click="handleSelect"></sbb-button>
      </div>
    </div>
  </sbb-card>
</template>

<script lang="ts">
import { displayPrice } from '@/helpers/price'
import type { components } from '@/schemas/schema'
import { useOfferStore } from '@/stores/offers'
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
  },
  data(): { addedAncillaries: components['schemas']['AncillaryOfferPart'][] } {
    return {
      addedAncillaries: [],
    }
  },
  setup() {
    return { displayPrice }
  },
  methods: {
    handleSelect() {
      useOfferStore().setSelectOfferAndAncillaries(this.offer as components['schemas']['Offer'], this.addedAncillaries)
      this.$router.push({
        name: 'details',
        query: {
          offerId: this.offer.offerId,
          ancillariesIds: this.addedAncillaries.map((aa) => aa.id),
          ...this.$route.query
        },
      })
    },
    handleTogglAncillary(ancillary: components['schemas']['AncillaryOfferPart']) {
      if (this.addedAncillaries.includes(ancillary)) {
        this.addedAncillaries = this.addedAncillaries.filter((a) => a !== ancillary)
        return
      }
      this.addedAncillaries.push(ancillary)
    },
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
