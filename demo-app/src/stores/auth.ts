import { AccessToken } from '@/auth'
import { defineStore } from 'pinia'

export const useAuthStore = defineStore('auth', {
  state: (): {
    sandboxURL: string,
    clientSecret: string,
    clientId: string,
    accessToken: AccessToken
  } => ({
    sandboxURL: localStorage.getItem("sandboxURL") ?? '',
    clientSecret: localStorage.getItem("clientSecret") ?? '',
    clientId: localStorage.getItem("clientId") ?? '',
    accessToken: new AccessToken(),
  }),
  actions: {
    setAccessDetails(sandboxURL: string, clientId: string, clientSecret: string,) {
      this.sandboxURL = sandboxURL
      this.clientSecret = clientSecret
      this.clientId = clientId
      localStorage.setItem("sandboxURL", sandboxURL);
      localStorage.setItem("clientSecret", clientSecret);
      localStorage.setItem("clientId", clientId);
    },
  },
})
