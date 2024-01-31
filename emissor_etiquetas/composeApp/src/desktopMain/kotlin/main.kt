import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import settings.HEIGHT
import settings.TITLE
import settings.WIDTH

fun main() = application {
    val state = rememberWindowState(
        size = DpSize(WIDTH.dp, HEIGHT.dp),
        position = WindowPosition(50.dp,50.dp),
    )
    Window(
        onCloseRequest = ::exitApplication,
        title = TITLE,
        state = state,
        resizable = false
    ) {
        App()
    }
}

@Preview
@Composable
fun AppDesktopPreview() {
    App()
}