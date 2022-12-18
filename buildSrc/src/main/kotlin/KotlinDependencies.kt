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

object KotlinDependencies {
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val compose = "org.jetbrains.compose"

    const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val androidxAppcompat = "androidx.appcompat:appcompat:${Versions.androidxAppcompat}"
}