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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnListenerRuleTargetGroupTuplePropertyDsl {
    private val cdkBuilder: CfnListenerRule.TargetGroupTupleProperty.Builder =
        CfnListenerRule.TargetGroupTupleProperty.builder()

    public fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnListenerRule.TargetGroupTupleProperty = cdkBuilder.build()
}
