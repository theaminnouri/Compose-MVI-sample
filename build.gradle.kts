plugins {
    id("com.android.application") version ("7.3.1") apply false
    id("com.android.library") version ("7.3.1") apply false
    id("org.jetbrains.kotlin.android") version ("1.7.20") apply false
    id("org.jetbrains.kotlin.jvm") version ("1.7.20") apply false
}
tasks.register<Delete>("clean"){
    delete(rootProject.buildDir)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
}
