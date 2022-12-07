package com.garciafrancisco.pokemonapp.data.model

data class PokemonListResponse (
    val name: String,
    val url: String,
)

data class PokemonResponse (
    val id: Int,
    val name: String,
    val sprites: PokemonSprites,
    val height: Int,
    val weight: Int,
    val abilities: List<PokemonAbilityItem>,
    val forms: List<PokemonForm>,
    val types: List<PokemonTypeItem>,
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
