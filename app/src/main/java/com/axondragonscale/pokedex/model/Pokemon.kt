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
    val order: Int,
    val isDefault: Boolean,
)
