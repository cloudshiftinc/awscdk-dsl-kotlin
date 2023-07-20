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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster

@CdkDslMarker
public class CfnClusterScalingTriggerPropertyDsl {
    private val cdkBuilder: CfnCluster.ScalingTriggerProperty.Builder =
        CfnCluster.ScalingTriggerProperty.builder()

    public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: IResolvable) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
    }

    public fun cloudWatchAlarmDefinition(cloudWatchAlarmDefinition: CfnCluster.CloudWatchAlarmDefinitionProperty) {
        cdkBuilder.cloudWatchAlarmDefinition(cloudWatchAlarmDefinition)
    }

    public fun build(): CfnCluster.ScalingTriggerProperty = cdkBuilder.build()
}
