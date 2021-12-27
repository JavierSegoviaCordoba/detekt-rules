package com.javiersc.detekt.rules.banned.import

import io.gitlab.arturbosch.detekt.test.TestConfig
import io.gitlab.arturbosch.detekt.test.compileAndLint
import io.kotest.matchers.collections.shouldHaveSize
import kotlin.test.Test

class BannedImportTest {

    @Test
    fun `reports banned import`() {
        val code =
            """
                |package com.javiersc.shared.ui.designSystem
                |
                |import androidx.compose.material.Button
                |import androidx.compose.material.Strings
                |import androidx.compose.material.Surface
                |
                |@Composable
                |fun Button() { }
            """.trimMargin()
        val bannedImports =
            listOf(
                "androidx.compose.material.Button",
                "androidx.compose.material.Surface",
            )
        val findings =
            BannedImport(TestConfig(mapOf(pair = "bannedImports" to bannedImports)))
                .compileAndLint(code)

        findings shouldHaveSize 2
    }
}
