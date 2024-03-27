package com.axondragonscale.pokedex.database.mapper

import com.axondragonscale.pokedex.database.entity.PokemonEntity
import com.axondragonscale.pokedex.model.Pokemon

/**
 * Created by Ronak Harkhani on 27/03/24
 */

fun Pokemon.toEntity() = PokemonEntity(
    id = id,
    name = name,
    baseExperience = baseExperience,
    height = height,
    weight = weight,
    abilities = abilities
)
