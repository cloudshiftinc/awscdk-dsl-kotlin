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
import kotlin.String
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * `CloudWatchLogs` is a property of the
 * [AWS CodeBuild Project LogsConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html)
 * property type that specifies settings for CloudWatch logs generated by an AWS CodeBuild build.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * CloudWatchLogsConfigProperty cloudWatchLogsConfigProperty =
 * CloudWatchLogsConfigProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .groupName("groupName")
 * .streamName("streamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html)
 */
@CdkDslMarker
public class CfnProjectCloudWatchLogsConfigPropertyDsl {
    private val cdkBuilder: CfnProject.CloudWatchLogsConfigProperty.Builder =
        CfnProject.CloudWatchLogsConfigProperty.builder()

    /**
     * @param groupName The group name of the logs in CloudWatch Logs. For more information, see
     *   [Working with Log Groups and Log Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
     *   .
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * @param status The current status of the logs in CloudWatch Logs for a build project. Valid
     *   values are:.
     * * `ENABLED` : CloudWatch Logs are enabled for this build project.
     * * `DISABLED` : CloudWatch Logs are not enabled for this build project.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * @param streamName The prefix of the stream name of the CloudWatch Logs. For more information,
     *   see
     *   [Working with Log Groups and Log Streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/Working-with-log-groups-and-streams.html)
     *   .
     */
    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): CfnProject.CloudWatchLogsConfigProperty = cdkBuilder.build()
}
