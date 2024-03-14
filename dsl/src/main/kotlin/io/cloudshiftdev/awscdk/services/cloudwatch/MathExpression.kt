package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class MathExpression internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpression,
) : CdkObject(cdkObject), IMetric {
  /**
   * The hex color code, prefixed with '#' (e.g. '#00ff00'), to use when this metric is rendered on
   * a graph. The `Color` class has a set of standard colors that can be used here.
   */
  public open fun color(): String? = unwrap(this).getColor()

  /**
   * Make a new Alarm for this metric.
   *
   * Combines both properties that may adjust the metric (aggregation) as well
   * as alarm properties.
   *
   * @param scope 
   * @param id 
   * @param props 
   */
  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions,
  ): Alarm = unwrap(this).createAlarm(scope.let(Construct::unwrap), id,
      props.let(CreateAlarmOptions::unwrap)).let(Alarm::wrap)

  /**
   * Make a new Alarm for this metric.
   *
   * Combines both properties that may adjust the metric (aggregation) as well
   * as alarm properties.
   *
   * @param scope 
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e03736e112999f1b75773f76c5cb9dc73905e2afad3ba0d5d2a8408be21202b")
  public open fun createAlarm(
    scope: Construct,
    id: String,
    props: CreateAlarmOptions.Builder.() -> Unit,
  ): Alarm = createAlarm(scope, id, CreateAlarmOptions(props))

  /**
   * The expression defining the metric.
   */
  public open fun expression(): String = unwrap(this).getExpression()

  /**
   * Label for this metric when added to a Graph.
   */
  public open fun label(): String? = unwrap(this).getLabel()

  /**
   * Aggregation period of this metric.
   */
  public open fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

  /**
   * Account to evaluate search expressions within.
   */
  public open fun searchAccount(): String? = unwrap(this).getSearchAccount()

  /**
   * Region to evaluate search expressions within.
   */
  public open fun searchRegion(): String? = unwrap(this).getSearchRegion()

  /**
   * Inspect the details of the metric object.
   */
  public override fun toMetricConfig(): MetricConfig =
      unwrap(this).toMetricConfig().let(MetricConfig::wrap)

  /**
   * The metrics used in the expression as KeyValuePair &lt;id, metric&gt;.
   */
  public open fun usingMetrics(): Map<String, IMetric> =
      unwrap(this).getUsingMetrics().mapValues{IMetric.wrap(it.value)}

  /**
   * (deprecated) Warnings generated by this math expression.
   *
   * * use warningsV2
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun warnings(): List<String> = unwrap(this).getWarnings() ?: emptyList()

  /**
   * Warnings generated by this math expression.
   */
  public override fun warningsV2(): Map<String, String> = unwrap(this).getWarningsV2() ?: emptyMap()

  /**
   * Return a copy of Metric with properties changed.
   *
   * All properties except namespace and metricName can be changed.
   *
   * @param props The set of properties to change. 
   */
  public open fun with(props: MathExpressionOptions): MathExpression =
      unwrap(this).with(props.let(MathExpressionOptions::unwrap)).let(MathExpression::wrap)

  /**
   * Return a copy of Metric with properties changed.
   *
   * All properties except namespace and metricName can be changed.
   *
   * @param props The set of properties to change. 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0ff43fd6c00818abf7bc21f37d5472ceadccaac268d3b4f841dd9abaaea03d1")
  public open fun with(props: MathExpressionOptions.Builder.() -> Unit): MathExpression =
      with(MathExpressionOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.MathExpression].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Color for this metric when added to a Graph in a Dashboard.
     *
     * Default: - Automatic color
     *
     * @param color Color for this metric when added to a Graph in a Dashboard. 
     */
    public fun color(color: String)

    /**
     * The expression defining the metric.
     *
     * When an expression contains a SEARCH function, it cannot be used
     * within an Alarm.
     *
     * @param expression The expression defining the metric. 
     */
    public fun expression(expression: String)

    /**
     * Label for this expression when added to a Graph in a Dashboard.
     *
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     *
     * Default: - Expression value is used as label
     *
     * @param label Label for this expression when added to a Graph in a Dashboard. 
     */
    public fun label(label: String)

    /**
     * The period over which the expression's statistics are applied.
     *
     * This period overrides all periods in the metrics used in this
     * math expression.
     *
     * Default: Duration.minutes(5)
     *
     * @param period The period over which the expression's statistics are applied. 
     */
    public fun period(period: Duration)

    /**
     * Account to evaluate search expressions within.
     *
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment account.
     *
     * @param searchAccount Account to evaluate search expressions within. 
     */
    public fun searchAccount(searchAccount: String)

    /**
     * Region to evaluate search expressions within.
     *
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment region.
     *
     * @param searchRegion Region to evaluate search expressions within. 
     */
    public fun searchRegion(searchRegion: String)

    /**
     * The metrics used in the expression, in a map.
     *
     * The key is the identifier that represents the given metric in the
     * expression, and the value is the actual Metric object.
     *
     * Default: - Empty map.
     *
     * @param usingMetrics The metrics used in the expression, in a map. 
     */
    public fun usingMetrics(usingMetrics: Map<String, IMetric>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MathExpression.Builder =
        software.amazon.awscdk.services.cloudwatch.MathExpression.Builder.create()

    /**
     * Color for this metric when added to a Graph in a Dashboard.
     *
     * Default: - Automatic color
     *
     * @param color Color for this metric when added to a Graph in a Dashboard. 
     */
    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    /**
     * The expression defining the metric.
     *
     * When an expression contains a SEARCH function, it cannot be used
     * within an Alarm.
     *
     * @param expression The expression defining the metric. 
     */
    override fun expression(expression: String) {
      cdkBuilder.expression(expression)
    }

    /**
     * Label for this expression when added to a Graph in a Dashboard.
     *
     * If this expression evaluates to more than one time series (for
     * example, through the use of `METRICS()` or `SEARCH()` expressions),
     * each time series will appear in the graph using a combination of the
     * expression label and the individual metric label. Specify the empty
     * string (`''`) to suppress the expression label and only keep the
     * metric label.
     *
     * You can use [dynamic
     * labels](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/graph-dynamic-labels.html)
     * to show summary information about the displayed time series
     * in the legend. For example, if you use:
     *
     * ```
     * [max: ${MAX}] MyMetric
     * ```
     *
     * As the metric label, the maximum value in the visible range will
     * be shown next to the time series name in the graph's legend. If the
     * math expression produces more than one time series, the maximum
     * will be shown for each individual time series produce by this
     * math expression.
     *
     * Default: - Expression value is used as label
     *
     * @param label Label for this expression when added to a Graph in a Dashboard. 
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * The period over which the expression's statistics are applied.
     *
     * This period overrides all periods in the metrics used in this
     * math expression.
     *
     * Default: Duration.minutes(5)
     *
     * @param period The period over which the expression's statistics are applied. 
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    /**
     * Account to evaluate search expressions within.
     *
     * Specifying a searchAccount has no effect to the account used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment account.
     *
     * @param searchAccount Account to evaluate search expressions within. 
     */
    override fun searchAccount(searchAccount: String) {
      cdkBuilder.searchAccount(searchAccount)
    }

    /**
     * Region to evaluate search expressions within.
     *
     * Specifying a searchRegion has no effect to the region used
     * for metrics within the expression (passed via usingMetrics).
     *
     * Default: - Deployment region.
     *
     * @param searchRegion Region to evaluate search expressions within. 
     */
    override fun searchRegion(searchRegion: String) {
      cdkBuilder.searchRegion(searchRegion)
    }

    /**
     * The metrics used in the expression, in a map.
     *
     * The key is the identifier that represents the given metric in the
     * expression, and the value is the actual Metric object.
     *
     * Default: - Empty map.
     *
     * @param usingMetrics The metrics used in the expression, in a map. 
     */
    override fun usingMetrics(usingMetrics: Map<String, IMetric>) {
      cdkBuilder.usingMetrics(usingMetrics.mapValues{IMetric.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MathExpression =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MathExpression {
      val builderImpl = BuilderImpl()
      return MathExpression(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MathExpression):
        MathExpression = MathExpression(cdkObject)

    internal fun unwrap(wrapped: MathExpression):
        software.amazon.awscdk.services.cloudwatch.MathExpression = wrapped.cdkObject
  }
}
