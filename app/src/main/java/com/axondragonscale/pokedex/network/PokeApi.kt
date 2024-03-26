package com.axondragonscale.pokedex.network

import com.axondragonscale.pokedex.model.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Ronak Harkhani on 26/03/24
 */
interface PokeApi {

    @GET("pokemon/{id}/")
    suspend fun getPokemon(@Path("id") id: Int): Pokemon

}
