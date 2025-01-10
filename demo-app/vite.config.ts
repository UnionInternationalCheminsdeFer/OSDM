import { fileURLToPath, URL } from 'node:url'
import { exec } from "child_process"

import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import vueDevTools from 'vite-plugin-vue-devtools'

const getVersionInfo = async () => {
  return await new Promise((resolve) => {
    exec('git describe --tags --always', (error, stdout) => {
      if (error) {
        console.error(`Error getting version number: ${error}`);
        resolve ('unknown');
      }
      resolve(stdout.trim());
    });
  });
};

// https://vite.dev/config/
export default defineConfig(async () => {
  const version = await getVersionInfo();

  return {
  plugins: [
    vue({
      template: {
        compilerOptions: {
          // 1. Tell Vite that all components starting with "sbb-" are webcomponents
          isCustomElement: (tag) => tag.startsWith('sbb-'),
        },
      },
    }),
    vueDevTools(),
  ],
  define: {
    __VERSION__: JSON.stringify(version),
  },
  resolve: {
    alias: {
      '@': fileURLToPath(new URL('./src', import.meta.url)),
      '@sbb-esta': fileURLToPath(new URL('./node_modules/@sbb-esta', import.meta.url)),
    },
  },
}})
