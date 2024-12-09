<template>
  <div class="h-full">
    <header class="bg-osdm-bg-primary flex justify-center p-2 pt-9 text-xl font-medium">
      <h1 class="self-center text-4xl m-3 font-bold">OSDM Demo App</h1>
      <div class="absolute right-4 top-4">
        <SandboxSettings />
      </div>
    </header>
    <RouterView />
    <footer class="bg-osdm-bg-primary text-sm text-osdm-text-inverted flex justify-center p-4">
      <p>Kindly brought to you by <a href="https://xatellite.space">xatellite</a>.</p>
    </footer>
  </div>
</template>

<script lang="ts">
import { RouterView } from 'vue-router'
import SandboxSettings from '@/components/molecules/SandboxSettings.vue'

export default {
  components: {
    RouterView,
    SandboxSettings,
  },
}
</script>
