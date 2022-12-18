import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.matrix.walletc.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
