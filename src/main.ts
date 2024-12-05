import './assets/main.css'

import { osdmClientKey } from './types/symbols'
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'
import { OSDM } from './api/main'

const osdm = new OSDM(import.meta.env.VITE_OSDM_SERVER, import.meta.env.VITE_REQUESTOR_HEADER)

// // To inject Authentication use a openapi-fetch middleware:
// // https://openapi-ts.dev/openapi-fetch/middleware-auth
// osdm.use(AuthMiddleware)

const app = createApp(App)

app.provide(osdmClientKey, osdm)
app.use(createPinia())
app.use(router)

app.mount('#app')
