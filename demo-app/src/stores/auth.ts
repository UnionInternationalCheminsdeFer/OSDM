import { AccessToken } from '@/auth'
import { defineStore } from 'pinia'

export const useAuthStore = defineStore('auth', {
  state: (): {
    sandboxURL: string,
    clientSecret: string,
    clientId: string,
    accessToken: AccessToken
  } => ({
    sandboxURL: '',
    clientSecret: '',
    clientId: '',
    accessToken: new AccessToken(),
  }),
  actions: {
    setAccessDetails(sandboxURL: string, clientId: string, clientSecret: string,) {
      this.sandboxURL = sandboxURL
      this.clientSecret = clientSecret
      this.clientId = clientId
    },
  },
})
