@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.codebuild.CloudWatchLoggingOptions
import software.amazon.awscdk.services.logs.ILogGroup

/**
 * Information about logs built to a CloudWatch Log Group for a build project.
 *
 * Example:
 * ```
 * Project.Builder.create(this, "Project")
 * .logging(LoggingOptions.builder()
 * .cloudWatch(CloudWatchLoggingOptions.builder()
 * .logGroup(new LogGroup(this, "MyLogGroup"))
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CloudWatchLoggingOptionsDsl {
    private val cdkBuilder: CloudWatchLoggingOptions.Builder = CloudWatchLoggingOptions.builder()

    /**
     * @param enabled The current status of the logs in Amazon CloudWatch Logs for a build project.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param logGroup The Log Group to send logs to. */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    /** @param prefix The prefix of the stream name of the Amazon CloudWatch Logs. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CloudWatchLoggingOptions = cdkBuilder.build()
}
