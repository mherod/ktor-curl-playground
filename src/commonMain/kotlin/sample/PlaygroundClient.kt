package sample

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url

class PlaygroundClient {
    private val client = HttpClient {
    }

    suspend fun makeRequest(): String {

        return client.get<String> {
            url("https://tools.ietf.org/rfc/rfc1866.txt")
        }
    }
}
