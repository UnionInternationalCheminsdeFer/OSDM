import { defineStore } from 'pinia'

export const useAuthStore = defineStore('auth', {
  state: (): {
    sandboxURL: string,
    clientSecret: string,
    clientId: string,
    accessToken: string
  } => ({
    sandboxURL: '',
    clientSecret: '',
    clientId: '',
    accessToken: '',
  }),
  actions: {
    setAccessDetails(sandboxURL: string, clientId: string, clientSecret: string,) {
      this.sandboxURL = sandboxURL
      this.clientSecret = clientSecret
      this.clientId = clientId
    },
  },
})
