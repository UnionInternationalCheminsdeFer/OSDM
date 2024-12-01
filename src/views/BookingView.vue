<template>
  <main class="h-full">
    <HeaderBar />
    <div v-if="error" class="flex flex-col items-center mt-12 h-full gap-4">
      <sbb-icon :name="error.icon"></sbb-icon>
      <h2>{{ error.title }}</h2>
      <span>{{ error.description }}</span>
    </div>
    <div v-else class="flex flex-col items-center mt-12 h-full gap-4">
      <sbb-loading-indicator />
      <span>{{ status }}</span>
    </div>
  </main>
</template>

<script lang="ts">
import HeaderBar from '@/components/molecules/HeaderBar.vue'
import { useBookingStore } from '@/stores/booking'
import { SbbLoadingIndicatorElement as SbbLoadingIndicator } from '@sbb-esta/lyne-elements/loading-indicator'

export default {
  components: {
    HeaderBar,
    SbbLoadingIndicator,
  },
  computed: {
    error() {
      return useBookingStore().error
    },
    status() {
      return useBookingStore().status
    },
  },
  mounted() {
    this.$router.push({ name: 'ticket', query: this.$route.query })
  },
}
</script>
