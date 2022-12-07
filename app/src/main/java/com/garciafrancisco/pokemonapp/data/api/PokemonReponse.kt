package com.garciafrancisco.pokemonapp.data.api

data class PokemonReponse(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Result>
)