<template>
  <main class="h-full">
    <HeaderBar />
    <TicketPreview />
  </main>
</template>

<script lang="ts">
import HeaderBar from '@/components/molecules/HeaderBar.vue'
import TicketPreview from '@/components/molecules/TicketPreview.vue'

export default {
  components: {
    HeaderBar,
    TicketPreview,
  },
}
</script>
