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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkPerformanceMetricSubscriptionProps

/**
 * Properties for defining a `CfnNetworkPerformanceMetricSubscription`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkPerformanceMetricSubscriptionProps cfnNetworkPerformanceMetricSubscriptionProps =
 * CfnNetworkPerformanceMetricSubscriptionProps.builder()
 * .destination("destination")
 * .metric("metric")
 * .source("source")
 * .statistic("statistic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkperformancemetricsubscription.html)
 */
@CdkDslMarker
public class CfnNetworkPerformanceMetricSubscriptionPropsDsl {
    private val cdkBuilder: CfnNetworkPerformanceMetricSubscriptionProps.Builder =
        CfnNetworkPerformanceMetricSubscriptionProps.builder()

    /**
     * @param destination The Region or Availability Zone that's the target for the subscription.
     *   For example, `eu-west-1` .
     */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    /** @param metric The metric used for the subscription. */
    public fun metric(metric: String) {
        cdkBuilder.metric(metric)
    }

    /**
     * @param source The Region or Availability Zone that's the source for the subscription. For
     *   example, `us-east-1` .
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /** @param statistic The statistic used for the subscription. */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    public fun build(): CfnNetworkPerformanceMetricSubscriptionProps = cdkBuilder.build()
}
