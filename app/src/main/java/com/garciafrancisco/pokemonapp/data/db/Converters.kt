package com.garciafrancisco.pokemonapp.data.db

import androidx.room.TypeConverter
import com.garciafrancisco.pokemonapp.data.model.PokemonSprites

class Converters {

    @TypeConverter
    fun fromSprites(sprites: PokemonSprites): String {
        val convertedString =
            sprites.front_default + "/" + sprites.back_default + "/"
        sprites.front_shiny + "/" + sprites.back_shiny + "/"
        sprites.front_female + "/" + sprites.back_female + "/"
        sprites.front_female_shiny + "/" + sprites.back_female_shiny
        return sprites.toString()
    }

    fun toSprites(
        front_default: String,
        back_default: String,
        front_shiny: String,
        back_shiny: String,
        front_female: String,
        back_female: String,
        front_female_shiny: String,
        back_female_shiny: String,
    ): PokemonSprites = PokemonSprites(
        front_default,
        back_default,
        front_shiny,
        back_shiny,
        front_female,
        back_female,
        front_female_shiny,
        back_female_shiny
    )
}