package com.axondragonscale.pokedex.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.axondragonscale.pokedex.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Ronak Harkhani on 26/03/24
 */
@HiltViewModel
class HomeVM @Inject constructor(
    private val pokemonRepository: PokemonRepository
): ViewModel() {

    private var id = 35

    fun getPokemon() = viewModelScope.launch {
        val pokemon = pokemonRepository.getPokemon(id++)
        println("zeref - $pokemon")
    }

}
