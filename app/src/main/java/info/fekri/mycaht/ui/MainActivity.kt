package info.fekri.mycaht.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import info.fekri.mycaht.ui.theme.MyChatTheme

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    MyChatTheme {

    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyChatTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    // will complete later
                }
            }
        }
    }
}

