<template>
  <div class="h-full">
    <header class="bg-osdm-bg-primary text-osdm-text-inverted flex justify-center p-4 text-xl font-medium">
      <span>OSDM-Demo-App</span>
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
