package com.garciafrancisco.pokemonapp.data.api

import com.garciafrancisco.pokemonapp.data.model.Pokemon
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val BASE_URL = "https://pokeapi.co"
const val DEFAULT_RESULT_LIMIT = 20
interface PokemonAPI {

    @GET("api/v2/pokemon")
    suspend fun getPokemons(
        @Query("limit") limit: Int = DEFAULT_RESULT_LIMIT,
        @Query("offset") first: Int = 0,
    ): Response<Pokemon>

    @GET("api/v2/pokemon/{id}")
    suspend fun getPokemonById(
        @Path("id") id: Int ,
    ): Response<Pokemon>

    @GET("api/v2/pokemon/{name}")
    suspend fun getPokemonByName(
        @Path("name") name: String ,
    ): Response<Pokemon>
}