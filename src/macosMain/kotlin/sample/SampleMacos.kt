package sample

import kotlinx.coroutines.runBlocking

fun main() {
    val playgroundClient = PlaygroundClient()

    runBlocking {
        playgroundClient.makeRequest()
    }

    println(runBlocking {
        playgroundClient.makeRequest()
    })
}
