package com.garciafrancisco.pokemonapp.ui

import androidx.lifecycle.ViewModel
import com.garciafrancisco.pokemonapp.data.repository.PokemonRepository

class PokemonViewModel(
    val pokemonRepository: PokemonRepository
): ViewModel() {
}