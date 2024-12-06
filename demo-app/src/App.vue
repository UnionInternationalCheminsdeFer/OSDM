<template>
  <div class="h-full">
    <header class="bg-osdm-bg-primary text-osdm-text-inverted flex justify-center p-4 text-xl font-medium">
      <span>OSDM-Demo-App</span>
      <div class="absolute right-4 top-4">
        <SandboxSettings />
      </div>
    </header>
    <RouterView />
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
