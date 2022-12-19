plugins {
    id(KotlinDependencies.androidApplication)
    kotlin("android")
}

android {
    namespace = "${KotlinDependencies.self}.android"
    compileSdk = Versions.androidCompileSdk
    defaultConfig {
        applicationId = "${KotlinDependencies.self}.android"
        minSdk = Versions.androidMinSdk
        targetSdk = Versions.androidTargetSdk
        versionCode = 1
        versionName = Versions.walletcRelease
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