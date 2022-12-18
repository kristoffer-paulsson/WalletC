plugins {
    id(KotlinDependencies.androidApplication)
    kotlin("android")
}

android {
    namespace = "io.matrix.walletc.android"
    compileSdk = 32
    defaultConfig {
        applicationId = "io.matrix.walletc.android"
        minSdk = 27
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(Android.composeUi)
    implementation(Android.composeUiTooling)
    implementation(Android.composeUiPreview)
    implementation(Android.composeFoundation)
    implementation(Android.composeMaterial)
    implementation(Android.androidxActivity)
}