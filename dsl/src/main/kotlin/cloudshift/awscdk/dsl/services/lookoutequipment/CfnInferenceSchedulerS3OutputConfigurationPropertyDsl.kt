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

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler
import kotlin.String

@CdkDslMarker
public class CfnInferenceSchedulerS3OutputConfigurationPropertyDsl {
    private val cdkBuilder: CfnInferenceScheduler.S3OutputConfigurationProperty.Builder =
        CfnInferenceScheduler.S3OutputConfigurationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnInferenceScheduler.S3OutputConfigurationProperty = cdkBuilder.build()
}
