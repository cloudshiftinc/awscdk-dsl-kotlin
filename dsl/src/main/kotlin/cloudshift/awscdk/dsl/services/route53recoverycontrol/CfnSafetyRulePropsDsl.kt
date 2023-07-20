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

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRule
import software.amazon.awscdk.services.route53recoverycontrol.CfnSafetyRuleProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSafetyRulePropsDsl {
    private val cdkBuilder: CfnSafetyRuleProps.Builder = CfnSafetyRuleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun assertionRule(assertionRule: IResolvable) {
        cdkBuilder.assertionRule(assertionRule)
    }

    public fun assertionRule(assertionRule: CfnSafetyRule.AssertionRuleProperty) {
        cdkBuilder.assertionRule(assertionRule)
    }

    public fun controlPanelArn(controlPanelArn: String) {
        cdkBuilder.controlPanelArn(controlPanelArn)
    }

    public fun gatingRule(gatingRule: IResolvable) {
        cdkBuilder.gatingRule(gatingRule)
    }

    public fun gatingRule(gatingRule: CfnSafetyRule.GatingRuleProperty) {
        cdkBuilder.gatingRule(gatingRule)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun ruleConfig(ruleConfig: IResolvable) {
        cdkBuilder.ruleConfig(ruleConfig)
    }

    public fun ruleConfig(ruleConfig: CfnSafetyRule.RuleConfigProperty) {
        cdkBuilder.ruleConfig(ruleConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSafetyRuleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
