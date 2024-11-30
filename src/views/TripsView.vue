<template>
  <main class="h-full">
    <TripBar />
    <TripList />
  </main>
</template>

<script lang="ts">
import TripBar from '@/components/molecules/TripBar.vue'
import TripList from '@/components/molecules/TripList.vue'
export default {
  components: {
    TripBar,
    TripList,
  },
}
</script>
