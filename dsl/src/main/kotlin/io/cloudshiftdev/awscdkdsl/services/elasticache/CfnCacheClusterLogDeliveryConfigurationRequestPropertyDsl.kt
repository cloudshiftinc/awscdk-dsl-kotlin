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

package io.cloudshiftdev.awscdkdsl.services.elasticache

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnCacheCluster

/**
 * Specifies the destination, format and type of the logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * LogDeliveryConfigurationRequestProperty logDeliveryConfigurationRequestProperty =
 * LogDeliveryConfigurationRequestProperty.builder()
 * .destinationDetails(DestinationDetailsProperty.builder()
 * .cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty.builder()
 * .logGroup("logGroup")
 * .build())
 * .kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty.builder()
 * .deliveryStream("deliveryStream")
 * .build())
 * .build())
 * .destinationType("destinationType")
 * .logFormat("logFormat")
 * .logType("logType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-cachecluster-logdeliveryconfigurationrequest.html)
 */
@CdkDslMarker
public class CfnCacheClusterLogDeliveryConfigurationRequestPropertyDsl {
    private val cdkBuilder: CfnCacheCluster.LogDeliveryConfigurationRequestProperty.Builder =
        CfnCacheCluster.LogDeliveryConfigurationRequestProperty.builder()

    /**
     * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
     *   Kinesis Data Firehose destination.
     */
    public fun destinationDetails(destinationDetails: IResolvable) {
        cdkBuilder.destinationDetails(destinationDetails)
    }

    /**
     * @param destinationDetails Configuration details of either a CloudWatch Logs destination or
     *   Kinesis Data Firehose destination.
     */
    public fun destinationDetails(destinationDetails: CfnCacheCluster.DestinationDetailsProperty) {
        cdkBuilder.destinationDetails(destinationDetails)
    }

    /**
     * @param destinationType Specify either CloudWatch Logs or Kinesis Data Firehose as the
     *   destination type. Valid values are either `cloudwatch-logs` or `kinesis-firehose` .
     */
    public fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
    }

    /** @param logFormat Valid values are either `json` or `text` . */
    public fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
    }

    /**
     * @param logType Valid value is either `slow-log` , which refers to
     *   [slow-log](https://docs.aws.amazon.com/https://redis.io/commands/slowlog) or `engine-log` .
     */
    public fun logType(logType: String) {
        cdkBuilder.logType(logType)
    }

    public fun build(): CfnCacheCluster.LogDeliveryConfigurationRequestProperty = cdkBuilder.build()
}
