plugins {
    `javiersc-versioning`
    `javiersc-all-projects`
    `javiersc-changelog`
    `javiersc-code-analysis`
    `javiersc-code-formatter`
    `javiersc-dependency-updates`
    `javiersc-docs`
    `binary-compatibility-validator`
    `javiersc-gradle-wrapper-updater`
    `javiersc-nexus`
    `javiersc-readme-badges-generator`
    `javiersc-build-version-catalogs-updater`
}

allprojects {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}
