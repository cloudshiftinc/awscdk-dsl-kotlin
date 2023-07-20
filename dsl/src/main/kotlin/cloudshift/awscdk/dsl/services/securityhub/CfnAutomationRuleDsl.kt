@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAutomationRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAutomationRule.Builder = CfnAutomationRule.Builder.create(scope, id)

    private val _actions: MutableList<Any> = mutableListOf()

    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    public fun criteria(criteria: IResolvable) {
        cdkBuilder.criteria(criteria)
    }

    public fun criteria(criteria: CfnAutomationRule.AutomationRulesFindingFiltersProperty) {
        cdkBuilder.criteria(criteria)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun isTerminal(isTerminal: Boolean) {
        cdkBuilder.isTerminal(isTerminal)
    }

    public fun isTerminal(isTerminal: IResolvable) {
        cdkBuilder.isTerminal(isTerminal)
    }

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun ruleOrder(ruleOrder: Number) {
        cdkBuilder.ruleOrder(ruleOrder)
    }

    public fun ruleStatus(ruleStatus: String) {
        cdkBuilder.ruleStatus(ruleStatus)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnAutomationRule {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        return cdkBuilder.build()
    }
}
