plugins {
    `kotlin-jvm`
    `javiersc-kotlin-library`
    `javiersc-publish`
}

kotlin {
    explicitApi()
}

dependencies {
    implementation(libs.gitlab.arturboschDetekt.detektApi)
    testImplementation(libs.gitlab.arturboschDetekt.detektTest)
    testImplementation(libs.jetbrains.kotlin.kotlinTest)
    testImplementation(libs.kotest.kotestAssertionsCore)
}
