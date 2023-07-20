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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import kotlin.Number

@CdkDslMarker
public class CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl {
    private val cdkBuilder: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder =
        CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.builder()

    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty = cdkBuilder.build()
}
