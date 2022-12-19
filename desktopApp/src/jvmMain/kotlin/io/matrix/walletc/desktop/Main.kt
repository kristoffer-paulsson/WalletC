package io.matrix.walletc.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.matrix.walletc.shared.App

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}