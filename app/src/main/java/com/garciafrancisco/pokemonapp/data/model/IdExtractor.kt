package com.garciafrancisco.pokemonapp.data.model

object IdExtractor {
    fun extractPokemonIdFromUrl(url: String): Int {
        val array = url.split("/")
        val idPosition = array.lastIndex -1
        val pokemonId: String = array[idPosition]
        return pokemonId.toInt()
    }
}