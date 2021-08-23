plugins {
    `kotlin-jvm`
    `javiersc-publish-kotlin-jvm`
}

kotlin {
    explicitApi()
}

dependencies {
    implementation(libs.gitlab.arturboschDetekt.detektApi)
    testImplementation(libs.gitlab.arturboschDetekt.detektTest)
    testImplementation(libs.jetbrains.kotlin.kotlinTest)
    testImplementation(libs.jetbrains.kotlin.kotlinTestJunit)
    testImplementation(libs.kotest.kotestAssertionsCore)
}
