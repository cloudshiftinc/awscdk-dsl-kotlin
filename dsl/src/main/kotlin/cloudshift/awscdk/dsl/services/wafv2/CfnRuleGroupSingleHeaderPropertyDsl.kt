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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import kotlin.String

@CdkDslMarker
public class CfnRuleGroupSingleHeaderPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.SingleHeaderProperty.Builder =
        CfnRuleGroup.SingleHeaderProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnRuleGroup.SingleHeaderProperty = cdkBuilder.build()
}
