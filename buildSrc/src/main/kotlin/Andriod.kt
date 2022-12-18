/**
 * Copyright (c) 2022 by Kristoffer Paulsson <kristoffer.paulsson@talenten.se>.
 *
 * This software is available under the terms of the MIT license. Parts are licensed
 * under different terms if stated. The legal terms are attached to the LICENSE file
 * and are made available on:
 *
 *      https://opensource.org/licenses/MIT
 *
 * SPDX-License-Identifier: MIT
 *
 * Contributors:
 *      Kristoffer Paulsson - initial implementation
 */

object Android {
    const val composeUi = "androidx.compose.ui:ui:${Versions.androidxCompose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.androidxCompose}"
    const val composeUiPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.androidxCompose}"
    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.androidxCompose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.androidxCompose}"
    const val androidxActivity = "androidx.activity:activity-compose:${Versions.androidxActivity}"
}