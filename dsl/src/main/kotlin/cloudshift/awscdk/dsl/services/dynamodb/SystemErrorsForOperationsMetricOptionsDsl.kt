@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudwatch.Unit
import software.amazon.awscdk.services.dynamodb.Operation
import software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions

/**
 * Options for configuring a system errors metric that considers multiple operations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
 * import software.amazon.awscdk.services.dynamodb.*;
 * SystemErrorsForOperationsMetricOptions systemErrorsForOperationsMetricOptions =
 * SystemErrorsForOperationsMetricOptions.builder()
 * .account("account")
 * .color("color")
 * .dimensionsMap(Map.of(
 * "dimensionsMapKey", "dimensionsMap"))
 * .label("label")
 * .operations(List.of(Operation.GET_ITEM))
 * .period(Duration.minutes(30))
 * .region("region")
 * .statistic("statistic")
 * .unit(Unit.SECONDS)
 * .build();
 * ```
 */
@CdkDslMarker
public class SystemErrorsForOperationsMetricOptionsDsl {
  private val cdkBuilder: SystemErrorsForOperationsMetricOptions.Builder =
      SystemErrorsForOperationsMetricOptions.builder()

  private val _operations: MutableList<Operation> = mutableListOf()

  /**
   * @param account Account which this metric comes from.
   */
  public fun account(account: String) {
    cdkBuilder.account(account)
  }

  /**
   * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric is
   * rendered on a graph. The `Color` class has a set of standard colors that can be used here.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param dimensionsMap Dimensions of the metric.
   */
  public fun dimensionsMap(dimensionsMap: Map<String, String>) {
    cdkBuilder.dimensionsMap(dimensionsMap)
  }

  /**
   * @param label Label for this metric when added to a Graph in a Dashboard.
   * You can use [dynamic
   * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
   * to show summary information about the entire displayed time series
   * in the legend. For example, if you use:
   *
   * ```
   * [max: ${MAX}] MyMetric
   * ```
   *
   * As the metric label, the maximum value in the visible range will
   * be shown next to the time series name in the graph's legend.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param operations The operations to apply the metric to.
   */
  public fun operations(vararg operations: Operation) {
    _operations.addAll(listOf(*operations))
  }

  /**
   * @param operations The operations to apply the metric to.
   */
  public fun operations(operations: Collection<Operation>) {
    _operations.addAll(operations)
  }

  /**
   * @param period The period over which the specified statistic is applied.
   */
  public fun period(period: Duration) {
    cdkBuilder.period(period)
  }

  /**
   * @param region Region which this metric comes from.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param statistic What function to use for aggregating.
   * Use the `aws_cloudwatch.Stats` helper class to construct valid input strings.
   *
   * Can be one of the following:
   *
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
   * @param unit Unit used to filter the metric stream.
   * Only refer to datums emitted to the metric stream with the given unit and
   * ignore all others. Only useful when datums are being emitted to the same
   * metric stream under different units.
   *
   * The default is to use all matric datums in the stream, regardless of unit,
   * which is recommended in nearly all cases.
   *
   * CloudWatch does not honor this property for graphs.
   */
  public fun unit(unit: Unit) {
    cdkBuilder.unit(unit)
  }

  public fun build(): SystemErrorsForOperationsMetricOptions {
    if(_operations.isNotEmpty()) cdkBuilder.operations(_operations)
    return cdkBuilder.build()
  }
}
