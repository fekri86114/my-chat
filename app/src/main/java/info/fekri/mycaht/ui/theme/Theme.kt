package info.fekri.mycaht.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val LightColorScheme = lightColors(
    primary = GreenDark,
    secondary = GreenLight,
    background = ItemBackground
)

@Composable
fun MyChatTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colorScheme = LightColorScheme

    MaterialTheme(
        colors = colorScheme,
        typography = Typography,
        content = content
    )

    val uiController = rememberSystemUiController()
    uiController.setStatusBarColor(GreenLight)
    uiController.setNavigationBarColor(Color.Transparent)

}