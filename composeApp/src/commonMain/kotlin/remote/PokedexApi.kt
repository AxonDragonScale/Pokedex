package remote

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

/**
 * Created by Ronak Harkhani on 17/12/23
 */
object PokedexApi {

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun getPokemon() =
        httpClient.get("https://pokeapi.co/api/v2/pokemon/1").bodyAsText()
}
