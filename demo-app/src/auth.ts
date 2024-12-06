import type { Middleware } from 'openapi-fetch'
import { useAuthStore } from './stores/auth'

const getAccessToken = async () => {
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
      // ToDo: Add token expired check
      return data.access_token;
}

export const AuthMiddleware: Middleware = {
  async onRequest({ request }) {
    // Check if accessToken is present
    if (useAuthStore().sandboxURL.length <= 0) {
        return request
    }
    let accessToken = useAuthStore().accessToken;

    if (accessToken.length <= 0) {
        accessToken = await getAccessToken();
        useAuthStore().accessToken = accessToken;
    }

    request.headers.set(
        'Authorization',
        `Bearer ${accessToken}`
    )

    return request
  },
}
