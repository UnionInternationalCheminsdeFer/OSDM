import type { Middleware } from 'openapi-fetch'
import { useAuthStore } from './stores/auth'

export class AccessToken {
  token: string | null
  tokenType: string | null
  tokenExpiration: number | null

  constructor() {
    this.token = null
    this.tokenType = null
    this.tokenExpiration = null
  }

  async get() {
    if (!this.token || !this.tokenExpiration || this.tokenExpiration > Date.now()) {
      await this.refresh()
    }
    return `${this.tokenType} ${this.token}`
  }

  async refresh() {
    const response = await fetch(
      `${useAuthStore().sandboxURL}/oauth/token?grant_type=client_credentials&client_id=${useAuthStore().clientId}&client_secret=${useAuthStore().clientSecret}`,
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
      }
    );
    const data = await response.json();

    if (!data.access_token || !data.token_type || !data.expires_in) {
      this.token = null
      this.tokenType = null
      this.tokenExpiration = null
    }
    this.token = data.access_token
    this.tokenType = data.token_type
    this.tokenExpiration = Date.now() + data.expires_in
  }
}

export const AuthMiddleware: Middleware = {
  async onRequest({ request }) {
    // Check if accessToken is present
    if (useAuthStore().sandboxURL.length <= 0) {
        return request
    }

    const accessToken = await useAuthStore().accessToken.get();

    request.headers.set(
        'Authorization',
        accessToken
    )

    return request
  },
}
