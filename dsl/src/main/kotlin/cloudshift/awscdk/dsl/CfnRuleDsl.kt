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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnRule
import software.amazon.awscdk.CfnRuleAssertion
import software.amazon.awscdk.ICfnConditionExpression
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRule.Builder = CfnRule.Builder.create(scope, id)

    private val _assertions: MutableList<CfnRuleAssertion> = mutableListOf()

    public fun assertions(assertions: CfnRuleAssertionDsl.() -> Unit) {
        _assertions.add(CfnRuleAssertionDsl().apply(assertions).build())
    }

    public fun assertions(assertions: Collection<CfnRuleAssertion>) {
        _assertions.addAll(assertions)
    }

    public fun ruleCondition(ruleCondition: ICfnConditionExpression) {
        cdkBuilder.ruleCondition(ruleCondition)
    }

    public fun build(): CfnRule {
        if (_assertions.isNotEmpty()) cdkBuilder.assertions(_assertions)
        return cdkBuilder.build()
    }
}
