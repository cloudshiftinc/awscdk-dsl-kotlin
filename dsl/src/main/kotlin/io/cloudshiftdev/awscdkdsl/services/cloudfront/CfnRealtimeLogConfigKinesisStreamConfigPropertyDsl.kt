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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig

/**
 * Contains information about the Amazon Kinesis data stream where you are sending real-time log
 * data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * KinesisStreamConfigProperty kinesisStreamConfigProperty = KinesisStreamConfigProperty.builder()
 * .roleArn("roleArn")
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-kinesisstreamconfig.html)
 */
@CdkDslMarker
public class CfnRealtimeLogConfigKinesisStreamConfigPropertyDsl {
    private val cdkBuilder: CfnRealtimeLogConfig.KinesisStreamConfigProperty.Builder =
        CfnRealtimeLogConfig.KinesisStreamConfigProperty.builder()

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM)
     *   role that CloudFront can use to send real-time log data to your Kinesis data stream. For
     *   more information the IAM role, see
     *   [Real-time log configuration IAM role](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html#understand-real-time-log-config-iam-role)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param streamArn The Amazon Resource Name (ARN) of the Kinesis data stream where you are
     *   sending real-time log data.
     */
    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnRealtimeLogConfig.KinesisStreamConfigProperty = cdkBuilder.build()
}
