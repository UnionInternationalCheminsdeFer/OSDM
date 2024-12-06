import { defineStore } from 'pinia'
import type { components } from '@/schemas/schema'
import { displayPrice } from '@/helpers/price'

export class OfferListError {
  title: string
  description: string
  icon: string

  constructor(title: string, description: string, icon: string) {
    this.title = title
    this.description = description
    this.icon = icon
  }
}

export const useOfferStore = defineStore('offer', {
  state: (): {
    offers: components['schemas']['Offer'][]
    selectedOffer: components['schemas']['Offer'] | undefined
    selectedAncilleries: components['schemas']['AncillaryOfferPart'][]
    error: OfferListError | undefined
    loading: boolean
  } => ({
    offers: [],
    selectedOffer: undefined,
    selectedAncilleries: [],
    loading: false,
    error: undefined,
  }),
  actions: {
    setOffers(offers: components['schemas']['Offer'][]) {
      this.offers = offers
      this.loading = false
      this.error = undefined
    },
    setLoading(value: boolean) {
      this.loading = value
    },
    setSelectOfferAndAncillaries(
      offer: components['schemas']['Offer'],
      ancillaries: components['schemas']['AncillaryOfferPart'][],
    ) {
      this.selectedOffer = offer
      this.selectedAncilleries = ancillaries
    },
    unselectOffer() {
      this.selectedOffer = undefined
      this.selectedAncilleries = []
    },
    setError(error: OfferListError) {
      this.error = error
      this.offers = []
      this.loading = false
    },
  },
  getters: {
    totalPriceOfSelection(): string {
      if (this.selectedOffer && this.selectedOffer.offerSummary) {
        return displayPrice(
          this.selectedOffer.offerSummary.minimalPrice,
          this.selectedAncilleries.map((aa) => aa.price),
        )
      }
      return ''
    },
  },
})
