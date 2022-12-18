plugins {
    id(KotlinDependencies.androidApplication).version(Versions.comAndroid).apply(false)
    id(KotlinDependencies.androidLibrary).version(Versions.comAndroid).apply(false)
    id(KotlinDependencies.compose).version(Versions.compose).apply(false)
    kotlin("android").version(Versions.kotlin).apply(false)
    kotlin("multiplatform").version(Versions.kotlin).apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
