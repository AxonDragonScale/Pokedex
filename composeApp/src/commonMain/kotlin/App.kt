import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import remote.PokedexApi

@Composable
fun App() {
    MaterialTheme {
        var response by remember { mutableStateOf("Loading") }
        LaunchedEffect(Unit) {
            response = PokedexApi.getPokemon()
        }

        Text(text = response)
    }
}


