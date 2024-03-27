package com.axondragonscale.pokedex.database

import android.content.Context
import com.axondragonscale.pokedex.database.dao.PokemonDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Ronak Harkhani on 27/03/24
 */
@InstallIn(SingletonComponent::class)
@Module
internal object DatabaseModule {

    @Singleton
    @Provides
    fun providePokedexDatabase(@ApplicationContext context: Context): PokedexDatabase =
        PokedexDatabase.create(context)

    @Singleton
    @Provides
    fun providePokemonDao(db: PokedexDatabase): PokemonDao = db.pokemonDao()

}
