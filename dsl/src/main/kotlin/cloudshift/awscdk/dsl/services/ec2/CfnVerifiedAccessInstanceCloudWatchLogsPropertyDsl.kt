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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnVerifiedAccessInstanceCloudWatchLogsPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessInstance.CloudWatchLogsProperty.Builder =
        CfnVerifiedAccessInstance.CloudWatchLogsProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnVerifiedAccessInstance.CloudWatchLogsProperty = cdkBuilder.build()
}
