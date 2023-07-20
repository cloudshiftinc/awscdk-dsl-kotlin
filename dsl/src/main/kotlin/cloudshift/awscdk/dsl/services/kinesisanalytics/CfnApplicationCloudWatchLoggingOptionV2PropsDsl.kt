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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationCloudWatchLoggingOptionV2Props
import kotlin.String

@CdkDslMarker
public class CfnApplicationCloudWatchLoggingOptionV2PropsDsl {
    private val cdkBuilder: CfnApplicationCloudWatchLoggingOptionV2Props.Builder =
        CfnApplicationCloudWatchLoggingOptionV2Props.builder()

    public fun applicationName(applicationName: String) {
        cdkBuilder.applicationName(applicationName)
    }

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: IResolvable) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    public fun cloudWatchLoggingOption(cloudWatchLoggingOption: CfnApplicationCloudWatchLoggingOptionV2.CloudWatchLoggingOptionProperty) {
        cdkBuilder.cloudWatchLoggingOption(cloudWatchLoggingOption)
    }

    public fun build(): CfnApplicationCloudWatchLoggingOptionV2Props = cdkBuilder.build()
}
