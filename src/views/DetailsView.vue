<template>
  <main class="h-full">
    <HeaderBar />
    <TravelerList />
  </main>
</template>

<script lang="ts">
import HeaderBar from '@/components/molecules/HeaderBar.vue'
import TravelerList from '@/components/molecules/TravelerList.vue'

export default {
  components: {
    HeaderBar,
    TravelerList,
  },
}
</script>
