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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationCloudWatchLoggingOption
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationReferenceDataSource
import kotlin.Unit

public inline fun CfnApplicationCloudWatchLoggingOption.setCloudWatchLoggingOption(
    block: CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationCloudWatchLoggingOptionCloudWatchLoggingOptionPropertyDsl()
    builder.apply(block)
    return setCloudWatchLoggingOption(builder.build())
}

public inline fun CfnApplicationReferenceDataSource.setReferenceDataSource(
    block: CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationReferenceDataSourceReferenceDataSourcePropertyDsl()
    builder.apply(block)
    return setReferenceDataSource(builder.build())
}

public inline fun CfnApplication.setApplicationConfiguration(
    block: CfnApplicationApplicationConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationApplicationConfigurationPropertyDsl()
    builder.apply(block)
    return setApplicationConfiguration(builder.build())
}

public inline fun CfnApplication.setApplicationMaintenanceConfiguration(
    block: CfnApplicationApplicationMaintenanceConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationApplicationMaintenanceConfigurationPropertyDsl()
    builder.apply(block)
    return setApplicationMaintenanceConfiguration(builder.build())
}

public inline fun CfnApplication.setRunConfiguration(
    block: CfnApplicationRunConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationRunConfigurationPropertyDsl()
    builder.apply(block)
    return setRunConfiguration(builder.build())
}

public inline fun CfnApplicationOutput.setOutput(
    block: CfnApplicationOutputOutputPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnApplicationOutputOutputPropertyDsl()
    builder.apply(block)
    return setOutput(builder.build())
}
