package com.axondragonscale.pokedex.database.dao

import androidx.room.Dao
import androidx.room.Upsert
import com.axondragonscale.pokedex.database.entity.PokemonEntity

/**
 * Created by Ronak Harkhani on 27/03/24
 */
@Dao
interface PokemonDao {

    @Upsert
    suspend fun upsertPokemons(pokemons: List<PokemonEntity>)

}
