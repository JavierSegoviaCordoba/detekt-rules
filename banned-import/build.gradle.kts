plugins {
    alias(libs.plugins.javiersc.hubdle)
}

hubdle {
    config {
        documentation {
            api()
        }
        explicitApi()
        publishing()
    }
    kotlin {
        jvm {
            main {
                dependencies {
                    implementation(libs.gitlab.arturboschDetekt.detektApi)
                }
            }
            test {
                dependencies {
                    implementation(libs.gitlab.arturboschDetekt.detektTest)
                }
            }
        }
    }
}
