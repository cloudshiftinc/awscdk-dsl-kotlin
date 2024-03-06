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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

/**
 * The metric data to return.
 *
 * Also defines whether this call is returning data for one metric only, or whether it is performing
 * a math expression on the values of returned metric statistics to create a new time series. A time
 * series is a series of data points, each of which is associated with a timestamp.
 *
 * You can call for a single metric or perform math expressions on multiple metrics. Any expressions
 * used in a metric specification must eventually return a single time series.
 *
 * For more information and examples, see
 * [Create a target tracking scaling policy for Application Auto Scaling using metric math](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking-metric-math.html)
 * in the *Application Auto Scaling User Guide* .
 *
 * `TargetTrackingMetricDataQuery` is a property of the
 * [AWS::ApplicationAutoScaling::ScalingPolicy CustomizedMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * TargetTrackingMetricDataQueryProperty targetTrackingMetricDataQueryProperty =
 * TargetTrackingMetricDataQueryProperty.builder()
 * .expression("expression")
 * .id("id")
 * .label("label")
 * .metricStat(TargetTrackingMetricStatProperty.builder()
 * .metric(TargetTrackingMetricProperty.builder()
 * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .stat("stat")
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html)
 */
@CdkDslMarker
public class CfnScalingPolicyTargetTrackingMetricDataQueryPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.TargetTrackingMetricDataQueryProperty.Builder =
        CfnScalingPolicy.TargetTrackingMetricDataQueryProperty.builder()

    /**
     * @param expression The math expression to perform on the returned data, if this object is
     *   performing a math expression. This expression can use the `Id` of the other metrics to
     *   refer to those metrics, and can also use the `Id` of other expressions to use the result of
     *   those expressions.
     *
     * Conditional: Within each `TargetTrackingMetricDataQuery` object, you must specify either
     * `Expression` or `MetricStat` , but not both.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /**
     * @param id A short name that identifies the object's results in the response. This name must
     *   be unique among all `MetricDataQuery` objects specified for a single scaling policy. If you
     *   are performing math expressions on this set of data, this name represents that data and can
     *   serve as a variable in the mathematical expression. The valid characters are letters,
     *   numbers, and underscores. The first character must be a lowercase letter.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param label A human-readable label for this metric or expression. This is especially useful
     *   if this is a math expression, so that you know what the value represents.
     */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /**
     * @param metricStat Information about the metric data to return. Conditional: Within each
     *   `MetricDataQuery` object, you must specify either `Expression` or `MetricStat` , but not
     *   both.
     */
    public fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat)
    }

    /**
     * @param metricStat Information about the metric data to return. Conditional: Within each
     *   `MetricDataQuery` object, you must specify either `Expression` or `MetricStat` , but not
     *   both.
     */
    public fun metricStat(metricStat: CfnScalingPolicy.TargetTrackingMetricStatProperty) {
        cdkBuilder.metricStat(metricStat)
    }

    /**
     * @param returnData Indicates whether to return the timestamps and raw data values of this
     *   metric. If you use any math expressions, specify `true` for this value for only the final
     *   math expression that the metric specification is based on. You must specify `false` for
     *   `ReturnData` for all the other metrics and expressions used in the metric specification.
     *
     * If you are only retrieving metrics and not performing any math expressions, do not specify
     * anything for `ReturnData` . This sets it to its default ( `true` ).
     */
    public fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
    }

    /**
     * @param returnData Indicates whether to return the timestamps and raw data values of this
     *   metric. If you use any math expressions, specify `true` for this value for only the final
     *   math expression that the metric specification is based on. You must specify `false` for
     *   `ReturnData` for all the other metrics and expressions used in the metric specification.
     *
     * If you are only retrieving metrics and not performing any math expressions, do not specify
     * anything for `ReturnData` . This sets it to its default ( `true` ).
     */
    public fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData)
    }

    public fun build(): CfnScalingPolicy.TargetTrackingMetricDataQueryProperty = cdkBuilder.build()
}
