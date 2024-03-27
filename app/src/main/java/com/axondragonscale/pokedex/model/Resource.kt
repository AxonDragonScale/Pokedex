package com.axondragonscale.pokedex.model

import com.axondragonscale.pokedex.network.BASE_URL
import kotlinx.serialization.Serializable

/**
 * Created by Ronak Harkhani on 27/03/24
 */

private const val BASE_URL_LEN = BASE_URL.length

private fun getCategoryFromUrl(url: String) =
    url.drop(BASE_URL_LEN).substringBefore('/')

private fun getIdFromUrl(url: String) =
    url.drop(BASE_URL_LEN).substringAfter('/').substringBefore('/').toInt()

interface PokeResource {
    val category: String
    val id: Int
}

interface PokeResourceList<T: PokeResource> {
    val count: Int
    val next: String?
    val previous: String?
    val result: List<T>
}

@Serializable
data class ApiResource(val url: String): PokeResource {
    override val category: String by lazy { getCategoryFromUrl(url) }
    override val id: Int by lazy { getIdFromUrl(url) }
}

@Serializable
data class NamedApiResource(val name: String, val url: String): PokeResource {
    override val category: String by lazy { getCategoryFromUrl(url) }
    override val id: Int by lazy { getIdFromUrl(url) }
}

@Serializable
data class ApiResourceList(
    override val count: Int,
    override val next: String?,
    override val previous: String?,
    override val result: List<ApiResource>
) : PokeResourceList<ApiResource>

@Serializable
data class NamedApiResourceList(
    override val count: Int,
    override val next: String?,
    override val previous: String?,
    override val result: List<NamedApiResource>
): PokeResourceList<NamedApiResource>
