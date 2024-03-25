package com.axondragonscale.pokedex.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.axondragonscale.pokedex.ui.home.Home

/**
 * Created by Ronak Harkhani on 25/03/24
 */

@Composable
fun PokedexApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        PokedexNavHost()
    }
}

@Composable
private fun PokedexNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Route.Home.route) {
        composable(
            route = Route.Home.route,
            deepLinks = listOf(),
        ) {
            Home()
        }
    }
}
