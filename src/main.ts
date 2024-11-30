import './assets/main.css'

import createClient from 'openapi-fetch'
import type { paths } from './schemas/schema'
import { osdmClientKey, requestorHeaderKey } from './types/symbols'
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'

const osdm = createClient<paths>({
  baseUrl: import.meta.env.VITE_OSDM_SERVER,
})

const requestorHeader = import.meta.env.REQUESTOR_HEADER

// // To inject Authentication use a openapi-fetch middleware:
// // https://openapi-ts.dev/openapi-fetch/middleware-auth
// osdm.use(AuthMiddleware)

const app = createApp(App)

app.provide(osdmClientKey, osdm)
app.provide(requestorHeaderKey, requestorHeader)
app.use(createPinia())
app.use(router)

app.mount('#app')
