hubdle {
    config {
        analysis()
        coverage()
        documentation { //
            api()
        }
        explicitApi()
        publishing()
    }
    kotlin {
        jvm {
            features { //
                kotest()
            }
            main {
                dependencies { //
                    implementation(libs.gitlab.arturboschDetekt.detektApi)
                }
            }
            test {
                dependencies { //
                    implementation(libs.gitlab.arturboschDetekt.detektTest)
                }
            }
        }
    }
}
