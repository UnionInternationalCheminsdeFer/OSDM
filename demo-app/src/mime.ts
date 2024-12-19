import type { Middleware } from "openapi-fetch";

export const JSONMimeTypeMiddleware: Middleware = {
  async onRequest({ request }) {
    // This is a temporary fix and should not be required regarding to the standard
    request.headers.set(
        'Accept',
        'application/json'
    )

    return request
  },
}
