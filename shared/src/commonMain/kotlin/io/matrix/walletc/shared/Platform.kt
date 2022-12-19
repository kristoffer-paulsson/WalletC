package io.matrix.walletc.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform