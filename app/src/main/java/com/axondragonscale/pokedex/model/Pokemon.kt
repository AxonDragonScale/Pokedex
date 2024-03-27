package com.axondragonscale.pokedex.model

import kotlinx.serialization.Serializable

/**
 * Created by Ronak Harkhani on 26/03/24
 */
@Serializable
data class Pokemon(
    val id: Int,
    val name: String,
    val baseExperience: Int,
    val height: Int,
    val weight: Int,
    val abilities: List<PokemonAbility>,
    val heldItems: List<PokemonHeldItem>,
    val moves: List<PokemonMove>,
    val sprites: PokemonSprites,
    val cries: PokemonCries,
    val stats: List<PokemonStat>,
    val types: List<PokemonType>,
)

@Serializable
data class PokemonAbility(
    val isHidden: Boolean,
    val slot: Int,
    val ability: NamedApiResource
)

@Serializable
data class PokemonHeldItem(val item: NamedApiResource)

@Serializable
data class PokemonMove(val move: NamedApiResource)

@Serializable
data class PokemonStat(
    val stat: NamedApiResource,
    val effort: Int,
    val baseStat: Int,
)

@Serializable
data class PokemonType(
    val slot: Int,
    val type: NamedApiResource,
)

@Serializable
data class PokemonSprites(
    val backDefault: String?,
    val backShiny: String?,
    val frontDefault: String?,
    val frontShiny: String?,
    val backFemale: String?,
    val backShinyFemale: String?,
    val frontFemale: String?,
    val frontShinyFemale: String?
)

@Serializable
data class PokemonCries(val latest: String?)
