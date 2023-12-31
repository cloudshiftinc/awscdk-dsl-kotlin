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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * The definition of a CloudWatch metric alarm, which determines when an automatic scaling activity
 * is triggered.
 *
 * When the defined alarm conditions are satisfied, scaling activity begins.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * CloudWatchAlarmDefinitionProperty cloudWatchAlarmDefinitionProperty =
 * CloudWatchAlarmDefinitionProperty.builder()
 * .comparisonOperator(EmrCreateCluster.getCloudWatchAlarmComparisonOperator().GREATER_THAN_OR_EQUAL)
 * .metricName("metricName")
 * .period(Duration.minutes(30))
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .evaluationPeriods(123)
 * .namespace("namespace")
 * .statistic(EmrCreateCluster.getCloudWatchAlarmStatistic().SAMPLE_COUNT)
 * .threshold(123)
 * .unit(EmrCreateCluster.getCloudWatchAlarmUnit().NONE)
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_CloudWatchAlarmDefinition.html)
 */
@CdkDslMarker
public class EmrCreateClusterCloudWatchAlarmDefinitionPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.CloudWatchAlarmDefinitionProperty.Builder =
        EmrCreateCluster.CloudWatchAlarmDefinitionProperty.builder()

    private val _dimensions: MutableList<EmrCreateCluster.MetricDimensionProperty> = mutableListOf()

    /**
     * @param comparisonOperator Determines how the metric specified by MetricName is compared to
     *   the value specified by Threshold.
     */
    public fun comparisonOperator(
        comparisonOperator: EmrCreateCluster.CloudWatchAlarmComparisonOperator
    ) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    /** @param dimensions A CloudWatch metric dimension. */
    public fun dimensions(dimensions: EmrCreateClusterMetricDimensionPropertyDsl.() -> Unit) {
        _dimensions.add(EmrCreateClusterMetricDimensionPropertyDsl().apply(dimensions).build())
    }

    /** @param dimensions A CloudWatch metric dimension. */
    public fun dimensions(dimensions: Collection<EmrCreateCluster.MetricDimensionProperty>) {
        _dimensions.addAll(dimensions)
    }

    /**
     * @param evaluationPeriods The number of periods, in five-minute increments, during which the
     *   alarm condition must exist before the alarm triggers automatic scaling activity.
     */
    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * @param metricName The name of the CloudWatch metric that is watched to determine an alarm
     *   condition.
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param namespace The namespace for the CloudWatch metric. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param period The period, in seconds, over which the statistic is applied. EMR CloudWatch
     *   metrics are emitted every five minutes (300 seconds), so if an EMR CloudWatch metric is
     *   specified, specify 300.
     */
    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    /** @param statistic The statistic to apply to the metric associated with the alarm. */
    public fun statistic(statistic: EmrCreateCluster.CloudWatchAlarmStatistic) {
        cdkBuilder.statistic(statistic)
    }

    /** @param threshold The value against which the specified statistic is compared. */
    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    /**
     * @param unit The unit of measure associated with the CloudWatch metric being watched. The
     *   value specified for Unit must correspond to the units specified in the CloudWatch metric.
     */
    public fun unit(unit: EmrCreateCluster.CloudWatchAlarmUnit) {
        cdkBuilder.unit(unit)
    }

    public fun build(): EmrCreateCluster.CloudWatchAlarmDefinitionProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
