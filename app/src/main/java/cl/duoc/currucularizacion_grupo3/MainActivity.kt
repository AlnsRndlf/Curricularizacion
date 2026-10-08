package cl.duoc.currucularizacion_grupo3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.duoc.currucularizacion_grupo3.ui.screnns.HomeScreen2
import cl.duoc.currucularizacion_grupo3.ui.screnns.HomeScreenCompacta
import cl.duoc.currucularizacion_grupo3.ui.screnns.HomeScreenExtensa
import cl.duoc.currucularizacion_grupo3.ui.screnns.HomeScreenMediana
import cl.duoc.currucularizacion_grupo3.ui.theme.Currucularizacion_grupo3Theme




/* save main
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Currucularizacion_grupo3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
*/


/* save geeting
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Currucularizacion_grupo3Theme {
        Greeting("Android")
    }
}
*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Currucularizacion_grupo3Theme {
                HomeScreen2()
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GeetingPreview() {
    Currucularizacion_grupo3Theme {
        HomeScreen2()
    }
}


@Preview(name = "Compact", widthDp = 360, heightDp = 800)
@Composable
fun PreviewCompact() {
    HomeScreenCompacta() //[cite: 1]
}

@Preview(name = "Medium", widthDp = 600, heightDp = 900)
@Composable
fun PreviewMedium() {
    HomeScreenMediana()
}

@Preview(name = "Expanded", widthDp = 840, heightDp = 1080)
@Composable
fun PreviewExpanded() {
    HomeScreenExtensa()
}