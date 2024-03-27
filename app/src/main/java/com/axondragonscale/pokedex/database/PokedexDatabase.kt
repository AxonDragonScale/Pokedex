package com.axondragonscale.pokedex.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.axondragonscale.pokedex.database.dao.PokemonDao
import com.axondragonscale.pokedex.database.entity.PokemonEntity

/**
 * Created by Ronak Harkhani on 26/03/24
 */
@Database(
    entities = [
        PokemonEntity::class
    ],
    views = [],
    version = 1,
    exportSchema = true,
    autoMigrations = [],
)
internal abstract class PokedexDatabase : RoomDatabase() {

    companion object {

        private const val DB_NAME = "PokedexDatabase"

        fun create(appContext: Context) =
            Room.databaseBuilder(
                context = appContext,
                klass = PokedexDatabase::class.java,
                name = DB_NAME
            ).build()

    }

    abstract fun pokemonDao(): PokemonDao

}
