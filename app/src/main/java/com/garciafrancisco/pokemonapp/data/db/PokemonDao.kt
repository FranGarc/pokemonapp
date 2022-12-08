package com.garciafrancisco.pokemonapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.garciafrancisco.pokemonapp.data.model.Pokemon

@Dao
interface PokemonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPokemon(pokemon: Pokemon): Long

    @Update
    suspend fun updatePokemon(pokemon: Pokemon)

    @Query("SELECT * FROM Pokemon")
    fun getAllPokemon(): LiveData<List<Pokemon>>

    @Delete
    suspend fun deletePokemon(pokemon: Pokemon)

}