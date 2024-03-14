package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMetricFilter internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The name of the metric filter.
   */
  public open fun filterName(): String? = unwrap(this).getFilterName()

  /**
   * The name of the metric filter.
   */
  public open fun filterName(`value`: String) {
    unwrap(this).setFilterName(`value`)
  }

  /**
   * A filter pattern for extracting metric data out of ingested log events.
   */
  public open fun filterPattern(): String = unwrap(this).getFilterPattern()

  /**
   * A filter pattern for extracting metric data out of ingested log events.
   */
  public open fun filterPattern(`value`: String) {
    unwrap(this).setFilterPattern(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of an existing log group that you want to associate with this metric filter.
   */
  public open fun logGroupName(): String = unwrap(this).getLogGroupName()

  /**
   * The name of an existing log group that you want to associate with this metric filter.
   */
  public open fun logGroupName(`value`: String) {
    unwrap(this).setLogGroupName(`value`)
  }

  /**
   * The metric transformations.
   */
  public open fun metricTransformations(): Any = unwrap(this).getMetricTransformations()

  /**
   * The metric transformations.
   */
  public open fun metricTransformations(`value`: IResolvable) {
    unwrap(this).setMetricTransformations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The metric transformations.
   */
  public open fun metricTransformations(__idx_ac66f0: List<Any>) {
    unwrap(this).setMetricTransformations(__idx_ac66f0)
  }

  /**
   * The metric transformations.
   */
  public open fun metricTransformations(vararg __idx_ac66f0: Any): Unit =
      metricTransformations(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.logs.CfnMetricFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the metric filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filtername)
     * @param filterName The name of the metric filter. 
     */
    public fun filterName(filterName: String)

    /**
     * A filter pattern for extracting metric data out of ingested log events.
     *
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filterpattern)
     * @param filterPattern A filter pattern for extracting metric data out of ingested log events. 
     */
    public fun filterPattern(filterPattern: String)

    /**
     * The name of an existing log group that you want to associate with this metric filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-loggroupname)
     * @param logGroupName The name of an existing log group that you want to associate with this
     * metric filter. 
     */
    public fun logGroupName(logGroupName: String)

    /**
     * The metric transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
     * @param metricTransformations The metric transformations. 
     */
    public fun metricTransformations(metricTransformations: IResolvable)

    /**
     * The metric transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
     * @param metricTransformations The metric transformations. 
     */
    public fun metricTransformations(metricTransformations: List<Any>)

    /**
     * The metric transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
     * @param metricTransformations The metric transformations. 
     */
    public fun metricTransformations(vararg metricTransformations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnMetricFilter.Builder =
        software.amazon.awscdk.services.logs.CfnMetricFilter.Builder.create(scope, id)

    /**
     * The name of the metric filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filtername)
     * @param filterName The name of the metric filter. 
     */
    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    /**
     * A filter pattern for extracting metric data out of ingested log events.
     *
     * For more information, see [Filter and Pattern
     * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filterpattern)
     * @param filterPattern A filter pattern for extracting metric data out of ingested log events. 
     */
    override fun filterPattern(filterPattern: String) {
      cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * The name of an existing log group that you want to associate with this metric filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-loggroupname)
     * @param logGroupName The name of an existing log group that you want to associate with this
     * metric filter. 
     */
    override fun logGroupName(logGroupName: String) {
      cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The metric transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
     * @param metricTransformations The metric transformations. 
     */
    override fun metricTransformations(metricTransformations: IResolvable) {
      cdkBuilder.metricTransformations(metricTransformations.let(IResolvable::unwrap))
    }

    /**
     * The metric transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
     * @param metricTransformations The metric transformations. 
     */
    override fun metricTransformations(metricTransformations: List<Any>) {
      cdkBuilder.metricTransformations(metricTransformations)
    }

    /**
     * The metric transformations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
     * @param metricTransformations The metric transformations. 
     */
    override fun metricTransformations(vararg metricTransformations: Any): Unit =
        metricTransformations(metricTransformations.toList())

    public fun build(): software.amazon.awscdk.services.logs.CfnMetricFilter = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMetricFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMetricFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter):
        CfnMetricFilter = CfnMetricFilter(cdkObject)

    internal fun unwrap(wrapped: CfnMetricFilter):
        software.amazon.awscdk.services.logs.CfnMetricFilter = wrapped.cdkObject
  }

  public interface DimensionProperty {
    /**
     * The name for the CloudWatch metric dimension that the metric filter creates.
     *
     * Dimension names must contain only ASCII characters, must include at least one non-whitespace
     * character, and cannot start with a colon (:).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-dimension.html#cfn-logs-metricfilter-dimension-key)
     */
    public fun key(): String

    /**
     * The log event field that will contain the value for this dimension.
     *
     * This dimension will only be published for a metric if the value is found in the log event.
     * For example, `$.eventType` for JSON log events, or `$server` for space-delimited log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-dimension.html#cfn-logs-metricfilter-dimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [DimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name for the CloudWatch metric dimension that the metric filter creates. 
       * Dimension names must contain only ASCII characters, must include at least one
       * non-whitespace character, and cannot start with a colon (:).
       */
      public fun key(key: String)

      /**
       * @param value The log event field that will contain the value for this dimension. 
       * This dimension will only be published for a metric if the value is found in the log event.
       * For example, `$.eventType` for JSON log events, or `$server` for space-delimited log events.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty.Builder =
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty.builder()

      /**
       * @param key The name for the CloudWatch metric dimension that the metric filter creates. 
       * Dimension names must contain only ASCII characters, must include at least one
       * non-whitespace character, and cannot start with a colon (:).
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The log event field that will contain the value for this dimension. 
       * This dimension will only be published for a metric if the value is found in the log event.
       * For example, `$.eventType` for JSON log events, or `$server` for space-delimited log events.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty,
    ) : CdkObject(cdkObject), DimensionProperty {
      /**
       * The name for the CloudWatch metric dimension that the metric filter creates.
       *
       * Dimension names must contain only ASCII characters, must include at least one
       * non-whitespace character, and cannot start with a colon (:).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-dimension.html#cfn-logs-metricfilter-dimension-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The log event field that will contain the value for this dimension.
       *
       * This dimension will only be published for a metric if the value is found in the log event.
       * For example, `$.eventType` for JSON log events, or `$server` for space-delimited log events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-dimension.html#cfn-logs-metricfilter-dimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnMetricFilter.DimensionProperty
    }
  }

  public interface MetricTransformationProperty {
    /**
     * (Optional) The value to emit when a filter pattern does not match a log event.
     *
     * This value can be null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-defaultvalue)
     */
    public fun defaultValue(): Number? = unwrap(this).getDefaultValue()

    /**
     * The fields to use as dimensions for the metric. One metric filter can include as many as
     * three dimensions.
     *
     *
     * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
     * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
     * dimensions. Each different value found for a dimension is treated as a separate metric and
     * accrues charges as a separate custom metric.
     *
     * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs for
     * your specified dimensions within a certain amount of time. This helps to prevent accidental high
     * charges.
     *
     * You can also set up a billing alarm to alert you if your charges are higher than expected.
     * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
     * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the CloudWatch metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-metricname)
     */
    public fun metricName(): String

    /**
     * A custom namespace to contain your metric in CloudWatch.
     *
     * Use namespaces to group together metrics that are similar. For more information, see
     * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-metricnamespace)
     */
    public fun metricNamespace(): String

    /**
     * The value that is published to the CloudWatch metric.
     *
     * For example, if you're counting the occurrences of a particular term like `Error` , specify 1
     * for the metric value. If you're counting the number of bytes transferred, reference the value
     * that is in the log event by using $. followed by the name of the field that you specified in the
     * filter pattern, such as `$.size` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-metricvalue)
     */
    public fun metricValue(): String

    /**
     * The unit to assign to the metric.
     *
     * If you omit this, the unit is set as `None` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [MetricTransformationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValue (Optional) The value to emit when a filter pattern does not match a log
       * event.
       * This value can be null.
       */
      public fun defaultValue(defaultValue: Number)

      /**
       * @param dimensions The fields to use as dimensions for the metric. One metric filter can
       * include as many as three dimensions.
       *
       * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
       * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
       * dimensions. Each different value found for a dimension is treated as a separate metric and
       * accrues charges as a separate custom metric.
       *
       * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs
       * for your specified dimensions within a certain amount of time. This helps to prevent
       * accidental high charges.
       *
       * You can also set up a billing alarm to alert you if your charges are higher than expected.
       * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
       * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
       * .
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions The fields to use as dimensions for the metric. One metric filter can
       * include as many as three dimensions.
       *
       * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
       * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
       * dimensions. Each different value found for a dimension is treated as a separate metric and
       * accrues charges as a separate custom metric.
       *
       * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs
       * for your specified dimensions within a certain amount of time. This helps to prevent
       * accidental high charges.
       *
       * You can also set up a billing alarm to alert you if your charges are higher than expected.
       * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
       * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
       * .
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions The fields to use as dimensions for the metric. One metric filter can
       * include as many as three dimensions.
       *
       * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
       * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
       * dimensions. Each different value found for a dimension is treated as a separate metric and
       * accrues charges as a separate custom metric.
       *
       * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs
       * for your specified dimensions within a certain amount of time. This helps to prevent
       * accidental high charges.
       *
       * You can also set up a billing alarm to alert you if your charges are higher than expected.
       * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
       * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
       * .
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param metricName The name of the CloudWatch metric. 
       */
      public fun metricName(metricName: String)

      /**
       * @param metricNamespace A custom namespace to contain your metric in CloudWatch. 
       * Use namespaces to group together metrics that are similar. For more information, see
       * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
       * .
       */
      public fun metricNamespace(metricNamespace: String)

      /**
       * @param metricValue The value that is published to the CloudWatch metric. 
       * For example, if you're counting the occurrences of a particular term like `Error` , specify
       * 1 for the metric value. If you're counting the number of bytes transferred, reference the
       * value that is in the log event by using $. followed by the name of the field that you
       * specified in the filter pattern, such as `$.size` .
       */
      public fun metricValue(metricValue: String)

      /**
       * @param unit The unit to assign to the metric.
       * If you omit this, the unit is set as `None` .
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.Builder
          =
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty.builder()

      /**
       * @param defaultValue (Optional) The value to emit when a filter pattern does not match a log
       * event.
       * This value can be null.
       */
      override fun defaultValue(defaultValue: Number) {
        cdkBuilder.defaultValue(defaultValue)
      }

      /**
       * @param dimensions The fields to use as dimensions for the metric. One metric filter can
       * include as many as three dimensions.
       *
       * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
       * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
       * dimensions. Each different value found for a dimension is treated as a separate metric and
       * accrues charges as a separate custom metric.
       *
       * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs
       * for your specified dimensions within a certain amount of time. This helps to prevent
       * accidental high charges.
       *
       * You can also set up a billing alarm to alert you if your charges are higher than expected.
       * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
       * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
       * .
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions The fields to use as dimensions for the metric. One metric filter can
       * include as many as three dimensions.
       *
       * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
       * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
       * dimensions. Each different value found for a dimension is treated as a separate metric and
       * accrues charges as a separate custom metric.
       *
       * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs
       * for your specified dimensions within a certain amount of time. This helps to prevent
       * accidental high charges.
       *
       * You can also set up a billing alarm to alert you if your charges are higher than expected.
       * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
       * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
       * .
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions The fields to use as dimensions for the metric. One metric filter can
       * include as many as three dimensions.
       *
       * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
       * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
       * dimensions. Each different value found for a dimension is treated as a separate metric and
       * accrues charges as a separate custom metric.
       *
       * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs
       * for your specified dimensions within a certain amount of time. This helps to prevent
       * accidental high charges.
       *
       * You can also set up a billing alarm to alert you if your charges are higher than expected.
       * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
       * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
       * .
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param metricName The name of the CloudWatch metric. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param metricNamespace A custom namespace to contain your metric in CloudWatch. 
       * Use namespaces to group together metrics that are similar. For more information, see
       * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
       * .
       */
      override fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
      }

      /**
       * @param metricValue The value that is published to the CloudWatch metric. 
       * For example, if you're counting the occurrences of a particular term like `Error` , specify
       * 1 for the metric value. If you're counting the number of bytes transferred, reference the
       * value that is in the log event by using $. followed by the name of the field that you
       * specified in the filter pattern, such as `$.size` .
       */
      override fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
      }

      /**
       * @param unit The unit to assign to the metric.
       * If you omit this, the unit is set as `None` .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty,
    ) : CdkObject(cdkObject), MetricTransformationProperty {
      /**
       * (Optional) The value to emit when a filter pattern does not match a log event.
       *
       * This value can be null.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-defaultvalue)
       */
      override fun defaultValue(): Number? = unwrap(this).getDefaultValue()

      /**
       * The fields to use as dimensions for the metric. One metric filter can include as many as
       * three dimensions.
       *
       *
       * Metrics extracted from log events are charged as custom metrics. To prevent unexpected high
       * charges, do not specify high-cardinality fields such as `IPAddress` or `requestID` as
       * dimensions. Each different value found for a dimension is treated as a separate metric and
       * accrues charges as a separate custom metric.
       *
       * CloudWatch Logs disables a metric filter if it generates 1000 different name/value pairs
       * for your specified dimensions within a certain amount of time. This helps to prevent
       * accidental high charges.
       *
       * You can also set up a billing alarm to alert you if your charges are higher than expected.
       * For more information, see [Creating a Billing Alarm to Monitor Your Estimated AWS
       * Charges](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/monitor_estimated_charges_with_cloudwatch.html)
       * .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The name of the CloudWatch metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * A custom namespace to contain your metric in CloudWatch.
       *
       * Use namespaces to group together metrics that are similar. For more information, see
       * [Namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Namespace)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-metricnamespace)
       */
      override fun metricNamespace(): String = unwrap(this).getMetricNamespace()

      /**
       * The value that is published to the CloudWatch metric.
       *
       * For example, if you're counting the occurrences of a particular term like `Error` , specify
       * 1 for the metric value. If you're counting the number of bytes transferred, reference the
       * value that is in the log event by using $. followed by the name of the field that you
       * specified in the filter pattern, such as `$.size` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-metricvalue)
       */
      override fun metricValue(): String = unwrap(this).getMetricValue()

      /**
       * The unit to assign to the metric.
       *
       * If you omit this, the unit is set as `None` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-logs-metricfilter-metrictransformation.html#cfn-logs-metricfilter-metrictransformation-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricTransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty):
          MetricTransformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricTransformationProperty):
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.logs.CfnMetricFilter.MetricTransformationProperty
    }
  }
}
