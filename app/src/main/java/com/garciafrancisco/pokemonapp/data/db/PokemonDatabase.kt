package com.garciafrancisco.pokemonapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.garciafrancisco.pokemonapp.data.model.PokemonResponse

@Database(
    entities = [PokemonResponse::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class PokemonDatabase : RoomDatabase() {
    abstract fun getPokemonDao(): PokemonDao

    companion object {
        @Volatile //other threads can inmediately see when a thread changes this instance
        private var instance: PokemonDatabase? = null
        private val LOCK = Any() // used to synchronize setting the instance

        // called when this object is created
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also {
                instance = it
            }
        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context,
            PokemonDatabase::class.java,
            "pokemon_db.db"
        ).build()
    }
}