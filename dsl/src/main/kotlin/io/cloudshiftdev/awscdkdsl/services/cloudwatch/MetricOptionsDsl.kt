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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.MetricOptions
import software.amazon.awscdk.services.cloudwatch.Unit

/**
 * Properties of a metric that can be changed.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * DeliveryStream deliveryStream;
 * // Alarm that triggers when the per-second average of incoming bytes exceeds 90% of the current
 * service limit
 * MathExpression incomingBytesPercentOfLimit = MathExpression.Builder.create()
 * .expression("incomingBytes / 300 / bytePerSecLimit")
 * .usingMetrics(Map.of(
 * "incomingBytes",
 * deliveryStream.metricIncomingBytes(MetricOptions.builder().statistic(Statistic.SUM).build()),
 * "bytePerSecLimit", deliveryStream.metric("BytesPerSecondLimit")))
 * .build();
 * Alarm.Builder.create(this, "Alarm")
 * .metric(incomingBytesPercentOfLimit)
 * .threshold(0.9)
 * .evaluationPeriods(3)
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricOptionsDsl {
    private val cdkBuilder: MetricOptions.Builder = MetricOptions.builder()

    /** @param account Account which this metric comes from. */
    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    /**
     * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric
     *   is rendered on a graph. The `Color` class has a set of standard colors that can be used
     *   here.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /** @param dimensionsMap Dimensions of the metric. */
    public fun dimensionsMap(dimensionsMap: Map<String, String>) {
        cdkBuilder.dimensionsMap(dimensionsMap)
    }

    /**
     * @param label Label for this metric when added to a Graph in a Dashboard. You can use
     *   [dynamic labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     *   to show summary information about the entire displayed time series in the legend. For
     *   example, if you use:
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will be shown next to the time
     * series name in the graph's legend.
     */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    /** @param period The period over which the specified statistic is applied. */
    public fun period(period: Duration) {
        cdkBuilder.period(period)
    }

    /** @param region Region which this metric comes from. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param statistic What function to use for aggregating. Use the `aws_cloudwatch.Stats` helper
     *   class to construct valid input strings.
     *
     * Can be one of the following:
     * * "Minimum" | "min"
     * * "Maximum" | "max"
     * * "Average" | "avg"
     * * "Sum" | "sum"
     * * "SampleCount | "n"
     * * "pNN.NN"
     * * "tmNN.NN" | "tm(NN.NN%:NN.NN%)"
     * * "iqm"
     * * "wmNN.NN" | "wm(NN.NN%:NN.NN%)"
     * * "tcNN.NN" | "tc(NN.NN%:NN.NN%)"
     * * "tsNN.NN" | "ts(NN.NN%:NN.NN%)"
     */
    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    /**
     * @param unit Unit used to filter the metric stream. Only refer to datums emitted to the metric
     *   stream with the given unit and ignore all others. Only useful when datums are being emitted
     *   to the same metric stream under different units.
     *
     * The default is to use all matric datums in the stream, regardless of unit, which is
     * recommended in nearly all cases.
     *
     * CloudWatch does not honor this property for graphs.
     */
    public fun unit(unit: Unit) {
        cdkBuilder.unit(unit)
    }

    public fun build(): MetricOptions = cdkBuilder.build()
}
