<template>
  <main class="h-full">
    <HeaderBar />
    <TripList />
  </main>
</template>

<script lang="ts">
import HeaderBar from '@/components/molecules/HeaderBar.vue'
import TripList from '@/components/molecules/TripList.vue'
export default {
  components: {
    HeaderBar,
    TripList,
  },
}
</script>
