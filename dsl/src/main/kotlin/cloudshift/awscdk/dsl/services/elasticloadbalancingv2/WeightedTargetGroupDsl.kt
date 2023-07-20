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
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup
import kotlin.Number

@CdkDslMarker
public class WeightedTargetGroupDsl {
    private val cdkBuilder: WeightedTargetGroup.Builder = WeightedTargetGroup.builder()

    public fun targetGroup(targetGroup: IApplicationTargetGroup) {
        cdkBuilder.targetGroup(targetGroup)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): WeightedTargetGroup = cdkBuilder.build()
}
