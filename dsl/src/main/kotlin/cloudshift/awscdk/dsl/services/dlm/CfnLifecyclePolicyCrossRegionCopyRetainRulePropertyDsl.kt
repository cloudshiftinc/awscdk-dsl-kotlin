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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyRetainRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder =
        CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.builder()

    public fun interval(interval: Number) {
        cdkBuilder.interval(interval)
    }

    public fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
    }

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty = cdkBuilder.build()
}
