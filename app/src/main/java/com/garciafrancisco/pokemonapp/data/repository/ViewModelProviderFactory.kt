package com.garciafrancisco.pokemonapp.data.repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.garciafrancisco.pokemonapp.ui.PokemonViewModel

class PokemonViewModelProviderFactory(
    val pokemonRepository: PokemonRepository
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PokemonViewModel(pokemonRepository ) as T
    }
}