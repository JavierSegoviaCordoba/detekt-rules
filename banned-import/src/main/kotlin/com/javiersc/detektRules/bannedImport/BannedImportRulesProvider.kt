package com.javiersc.detektRules.bannedImport

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

public class BannedImportRulesProvider : RuleSetProvider {

    override val ruleSetId: String = "banned-import"

    override fun instance(config: Config): RuleSet =
        RuleSet(
            ruleSetId,
            listOf(
                BannedImport(config),
            ),
        )
}
