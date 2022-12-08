package com.garciafrancisco.pokemonapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "Pokemon"
)
data class Pokemon (
    @PrimaryKey
    val id: Int,
    val name: String,
//    val sprites: PokemonSprites? = null,
//    val height: Int?= null,
//    val weight: Int?= null,
//    val abilities: List<PokemonAbilityItem>?= null,
//    val forms: List<PokemonForm>?= null,
//    val types: List<PokemonTypeItem>?= null,
)

data class PokemonForm (
    val name: String,
    val url: String,
)

data class PokemonTypeItem (
    val slot: Int,
    val type:PokemonType
)

data class PokemonType (
    val name: String,
    val url: String,
)

data class PokemonAbilityItem (
    val is_hideen: Boolean = true,
    val slot: Int,
    val ability: PokemonAbility
)

data class PokemonAbility (
    val id: Int,
    val name: String,
    val localizedNames: List<LocalizedText>
)

data class LocalizedText (
    val language: String,
    val text: String
)

data class PokemonSprites (
    val front_default: String,
    val back_default: String,
    val front_shiny: String,
    val back_shiny: String,
    val front_female: String?,
    val back_female: String?,
    val front_female_shiny: String?,
    val back_female_shiny: String?,

    )
