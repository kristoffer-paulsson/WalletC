package io.matrix.walletc.piv

import com.yubico.yubikit.android.YubiKitManager

actual class PivTool {

    val yubikit = YubiKitManager(null)

    actual fun piv() {
    }
}