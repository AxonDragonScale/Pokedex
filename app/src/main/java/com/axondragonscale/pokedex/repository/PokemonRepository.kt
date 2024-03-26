package com.axondragonscale.pokedex.repository

import com.axondragonscale.pokedex.network.PokeApiClient
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Ronak Harkhani on 26/03/24
 */
@Singleton
class PokemonRepository @Inject constructor(
    private val apiClient: PokeApiClient,
) {

    suspend fun getPokemon(id: Int) = apiClient.getPokemon(id)

}
