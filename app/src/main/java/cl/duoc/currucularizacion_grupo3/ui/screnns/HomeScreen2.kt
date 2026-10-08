package cl.duoc.currucularizacion_grupo3.ui.screnns

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import cl.duoc.currucularizacion_grupo3.ui.utils.obtenerWindowSizeClass


@Composable
fun HomeScreen2() {

    val windowSizeClass = obtenerWindowSizeClass()
    when (windowSizeClass.widthSizeClass) {
        WindowWidthSizeClass.Compact -> HomeScreenCompacta()
        WindowWidthSizeClass.Medium -> HomeScreenMediana()
        WindowWidthSizeClass.Expanded -> HomeScreenExtensa()
        else -> HomeScreenCompacta()
    }
}