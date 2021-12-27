package com.javiersc.detekt.rules.banned.import

import io.gitlab.arturbosch.detekt.api.CodeSmell
import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Entity
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Rule
import io.gitlab.arturbosch.detekt.api.Severity
import io.gitlab.arturbosch.detekt.api.config
import io.gitlab.arturbosch.detekt.api.internal.Configuration
import org.jetbrains.kotlin.psi.KtImportDirective

public class BannedImport(config: Config = Config.empty) : Rule(config) {

    public override val issue: Issue =
        Issue(
            javaClass.simpleName,
            Severity.Defect,
            "Banned imports should be replaced with different imports.",
            Debt.FIVE_MINS
        )

    @Configuration("Define a list of package names that must not be allowed to be imported.")
    private val bannedImports: List<String> by config(defaultValue = emptyList())

    override fun visitImportDirective(importDirective: KtImportDirective) {
        super.visitImportDirective(importDirective)

        val import: String? = importDirective.importPath?.pathStr
        if (bannedImports.any { import?.contains(it, ignoreCase = true) == true }) {
            report(
                CodeSmell(
                    issue,
                    Entity.from(importDirective),
                    "The $import is banned. Replace it with another import."
                )
            )
        }
    }
}
