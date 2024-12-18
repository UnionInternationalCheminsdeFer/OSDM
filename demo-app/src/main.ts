import './assets/main.css'

import { osdmClientKey } from './types/symbols'
import { createApp } from 'vue'
import { createPinia } from 'pinia'

import App from './App.vue'
import router from './router'
import { OSDM } from './api/main'
import { AuthMiddleware } from './auth'

const osdm = new OSDM(localStorage.getItem("sandboxURL") ?? "https://osdm.io/not-a-sandbox", import.meta.env.VITE_REQUESTOR_HEADER)

osdm.use(AuthMiddleware)

const app = createApp(App)

app.provide(osdmClientKey, osdm)
app.use(createPinia())
app.use(router)

app.mount('#app')
