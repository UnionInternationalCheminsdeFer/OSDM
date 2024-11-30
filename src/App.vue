<template>
  <div class="h-full">
    <header class="bg-osdm-accent text-osdm-text-inverted flex justify-center p-4">
      OSDM-Demo-App
    </header>
    <RouterView />
  </div>
</template>

<script lang="ts">
import { RouterView } from 'vue-router'

export default {
  components: {
    RouterView,
  },
}
</script>
