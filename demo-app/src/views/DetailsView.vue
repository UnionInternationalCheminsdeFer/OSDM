<template>
  <main class="h-full">
    <HeaderBar />
    <TravelerList />
  </main>
</template>

<script lang="ts">
import HeaderBar from '@/components/molecules/HeaderBar.vue'
import TravelerList from '@/components/molecules/TravelerList.vue'
import { useOfferStore } from '@/stores/offers';

export default {
  components: {
    HeaderBar,
    TravelerList,
  },
  mounted() {
    if (!useOfferStore().selectedOffer) {
      this.$router.push({ name: 'offers', query: this.$route.query })
    }
  }
}
</script>
