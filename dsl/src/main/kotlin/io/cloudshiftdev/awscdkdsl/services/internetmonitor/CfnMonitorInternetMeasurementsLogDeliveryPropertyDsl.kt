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

package io.cloudshiftdev.awscdkdsl.services.internetmonitor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

/**
 * Publish internet measurements to an Amazon S3 bucket in addition to CloudWatch Logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.internetmonitor.*;
 * InternetMeasurementsLogDeliveryProperty internetMeasurementsLogDeliveryProperty =
 * InternetMeasurementsLogDeliveryProperty.builder()
 * .s3Config(S3ConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .logDeliveryStatus("logDeliveryStatus")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-internetmeasurementslogdelivery.html)
 */
@CdkDslMarker
public class CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl {
    private val cdkBuilder: CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder =
        CfnMonitor.InternetMeasurementsLogDeliveryProperty.builder()

    /**
     * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor internet
     *   measurements to Amazon S3.
     */
    public fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config)
    }

    /**
     * @param s3Config The configuration for publishing Amazon CloudWatch Internet Monitor internet
     *   measurements to Amazon S3.
     */
    public fun s3Config(s3Config: CfnMonitor.S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config)
    }

    public fun build(): CfnMonitor.InternetMeasurementsLogDeliveryProperty = cdkBuilder.build()
}
