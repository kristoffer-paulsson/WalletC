package io.matrix.walletc

class DesktopPlatform: Platform {
    override val name: String = "Desktop ${System.getProperty("os.name")} ${System.getProperty("os.arch")}"
}

actual fun getPlatform(): Platform = DesktopPlatform()