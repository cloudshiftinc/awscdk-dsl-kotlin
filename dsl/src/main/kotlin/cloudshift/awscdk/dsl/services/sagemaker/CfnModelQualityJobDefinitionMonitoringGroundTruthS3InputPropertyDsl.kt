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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnModelQualityJobDefinitionMonitoringGroundTruthS3InputPropertyDsl {
    private val cdkBuilder: CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.Builder =
        CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty.builder()

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnModelQualityJobDefinition.MonitoringGroundTruthS3InputProperty =
        cdkBuilder.build()
}
