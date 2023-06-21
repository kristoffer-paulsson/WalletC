package io.matrix.walletc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform