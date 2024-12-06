<template>
  <main class="h-full">
    <HeaderBar />
    <OfferList />
  </main>
</template>

<script lang="ts">
import HeaderBar from '@/components/molecules/HeaderBar.vue'
import OfferList from '@/components/molecules/OfferList.vue'
export default {
  components: {
    HeaderBar,
    OfferList,
  },
}
</script>
