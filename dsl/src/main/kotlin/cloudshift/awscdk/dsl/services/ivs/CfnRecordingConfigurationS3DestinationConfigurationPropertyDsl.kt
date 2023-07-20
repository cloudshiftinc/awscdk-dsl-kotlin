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

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ivs.CfnRecordingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnRecordingConfigurationS3DestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnRecordingConfiguration.S3DestinationConfigurationProperty.Builder =
        CfnRecordingConfiguration.S3DestinationConfigurationProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun build(): CfnRecordingConfiguration.S3DestinationConfigurationProperty =
        cdkBuilder.build()
}
