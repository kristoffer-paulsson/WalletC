plugins {
    kotlin("multiplatform")
    id(KotlinDependencies.compose)
    id(KotlinDependencies.androidLibrary)
}

kotlin {
    android()
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
                implementation("com.yubico.yubikit:core:2.1.0")
            }
        }
        val commonTest by getting
        val androidMain by getting {
            dependsOn(commonMain)
            dependencies {
                implementation("com.yubico.yubikit:android:2.1.0")
                implementation("com.yubico.yubikit:piv:2.1.0")
            }
        }
        val androidTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
        val desktopMain by getting {
            dependsOn(commonMain)
            dependencies {
                api(compose.preview)
                implementation("com.yubico.yubikit:android:2.1.0")
                implementation("com.yubico.yubikit:management:2.1.0")
                implementation("com.yubico.yubikit:piv:2.1.0")
            }
        }
        val desktopTest by getting
    }
}

android {
    namespace = "${KotlinDependencies.self}"
    compileSdk = Versions.androidCompileSdk
    defaultConfig {
        minSdk = Versions.androidMinSdk
        targetSdk = Versions.androidTargetSdk
    }
}