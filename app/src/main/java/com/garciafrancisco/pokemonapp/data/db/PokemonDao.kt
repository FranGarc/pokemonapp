package com.garciafrancisco.pokemonapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.garciafrancisco.pokemonapp.data.model.PokemonResponse

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPokemon(id: Int, name: String): Long

    @Update
    suspend fun updatePokemon(pokemon: PokemonResponse)

    @Query("SELECT * FROM Pokemon")
    fun getAllPokemon(): LiveData<List<PokemonResponse>>

    @Delete
    suspend fun deletePokemon(pokemon: PokemonResponse)

}