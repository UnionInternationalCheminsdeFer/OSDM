<template>
  <div class="h-full">
    <header
      class="absolute bg-osdm-bg-primary w-full top-0 shadow-lg flex justify-center p-4 items-center md:relative  md:shadow-none md:bg-osdm-bg-primary md:p-2 md:pt-9 text-xl font-medium ">
      <h1 class="self-center text-base sm:text-xl md:text-4xl m-3 font-bold text-osdm-text-inverted text-nowrap">
        OSDM
        Demo App</h1>
      <div class="absolute right-4 top-4 ">
        <SandboxSettings />
      </div>
    </header>
    <div class="bg-osdm-bg-primary h-24 md:h-0" />
    <RouterView />
    <footer class="flex flex-col bg-osdm-bg-primary text-sm text-osdm-text-inverted justify-center items-center p-4">
      <span>Developed with ♥ for OSDM by <a href="https://xatellite.space" target="_blank">xatellite</a> and <a
          href="https://bileto.cz" target="_blank">bileto</a>.</span>
      <span>{{ version }}</span>
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
  data() {
    return {
      version: __VERSION__,
    }
  },
}
</script>
