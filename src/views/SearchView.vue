<template>
  <main>
    <SearchBar />
  </main>
</template>

<script lang="ts">
import SearchBar from '@/components/molecules/SearchBar.vue'
import { SbbButtonElement } from '@sbb-esta/lyne-elements/button'

export default {
  components: {
    SearchBar,
  },
}
</script>
