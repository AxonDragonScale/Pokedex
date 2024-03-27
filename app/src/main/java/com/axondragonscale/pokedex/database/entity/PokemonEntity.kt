package com.axondragonscale.pokedex.database.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.axondragonscale.pokedex.model.PokemonAbility

/**
 * Created by Ronak Harkhani on 27/03/24
 */
@Entity(
    tableName = "pokemon"
)
data class PokemonEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val baseExperience: Int,
    val height: Int,
    val weight: Int,
    @Embedded val abilities: List<PokemonAbility>,
)


