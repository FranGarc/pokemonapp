package com.garciafrancisco.pokemonapp.data.remote.responses

data class PokemonResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)