package com.axondragonscale.pokedex.repository

import com.axondragonscale.pokedex.database.dao.PokemonDao
import com.axondragonscale.pokedex.database.mapper.toEntity
import com.axondragonscale.pokedex.network.PokeApiClient
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Ronak Harkhani on 26/03/24
 */
@Singleton
class PokemonRepository @Inject constructor(
    private val apiClient: PokeApiClient,
    private val pokemonDao: PokemonDao,
) {

    suspend fun getPokemon(id: Int) = apiClient.getPokemon(id).also {
        pokemonDao.upsertPokemons(listOf(it.toEntity()))
    }

}
