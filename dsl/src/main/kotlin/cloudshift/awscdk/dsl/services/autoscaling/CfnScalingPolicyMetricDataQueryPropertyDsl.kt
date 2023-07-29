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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * The metric data to return.
 *
 * Also defines whether this call is returning data for one metric only, or whether it is performing
 * a math expression on the values of returned metric statistics to create a new time series. A time
 * series is a series of data points, each of which is associated with a timestamp.
 *
 * `MetricDataQuery` is a property of the following property types:
 * * [AWS::AutoScaling::ScalingPolicy
 *   PredictiveScalingCustomizedScalingMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedscalingmetric.html)
 * * [AWS::AutoScaling::ScalingPolicy
 *   PredictiveScalingCustomizedLoadMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric.html)
 * * [AWS::AutoScaling::ScalingPolicy
 *   PredictiveScalingCustomizedCapacityMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedcapacitymetric.html)
 *
 * Predictive scaling uses the time series data received from CloudWatch to understand how to
 * schedule capacity based on your historical workload patterns.
 *
 * You can call for a single metric or perform math expressions on multiple metrics. Any expressions
 * used in a metric specification must eventually return a single time series.
 *
 * For more information and examples, see
 * [Advanced predictive scaling policy configurations using custom metrics](https://docs.aws.amazon.com/autoscaling/ec2/userguide/predictive-scaling-customized-metric-specification.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * MetricDataQueryProperty metricDataQueryProperty = MetricDataQueryProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .expression("expression")
 * .label("label")
 * .metricStat(MetricStatProperty.builder()
 * .metric(MetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .stat("stat")
 * // the properties below are optional
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html)
 */
@CdkDslMarker
public class CfnScalingPolicyMetricDataQueryPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.MetricDataQueryProperty.Builder =
        CfnScalingPolicy.MetricDataQueryProperty.builder()

    /**
     * @param expression The math expression to perform on the returned data, if this object is
     *   performing a math expression. This expression can use the `Id` of the other metrics to
     *   refer to those metrics, and can also use the `Id` of other expressions to use the result of
     *   those expressions.
     *
     * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
     * `MetricStat` , but not both.
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
    public fun metricStat(metricStat: CfnScalingPolicy.MetricStatProperty) {
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

    public fun build(): CfnScalingPolicy.MetricDataQueryProperty = cdkBuilder.build()
}
