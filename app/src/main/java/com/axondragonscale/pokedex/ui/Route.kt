package com.axondragonscale.pokedex.ui

/**
 * Created by Ronak Harkhani on 25/03/24
 */
sealed class Route(val route: String) {
    data object Home : Route("home")
}
