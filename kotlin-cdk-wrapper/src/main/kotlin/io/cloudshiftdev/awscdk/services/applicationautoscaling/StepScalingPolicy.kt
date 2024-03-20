@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Alarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define a scaling strategy which scales depending on absolute values of some metric.
 *
 * You can specify the scaling behavior for various values of the metric.
 *
 * Implemented using one or more CloudWatch alarms and Step Scaling Policies.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Metric metric;
 * ScalableTarget scalableTarget;
 * StepScalingPolicy stepScalingPolicy = StepScalingPolicy.Builder.create(this,
 * "MyStepScalingPolicy")
 * .metric(metric)
 * .scalingSteps(List.of(ScalingInterval.builder()
 * .change(123)
 * // the properties below are optional
 * .lower(123)
 * .upper(123)
 * .build()))
 * .scalingTarget(scalableTarget)
 * // the properties below are optional
 * .adjustmentType(AdjustmentType.CHANGE_IN_CAPACITY)
 * .cooldown(Duration.minutes(30))
 * .datapointsToAlarm(123)
 * .evaluationPeriods(123)
 * .metricAggregationType(MetricAggregationType.AVERAGE)
 * .minAdjustmentMagnitude(123)
 * .build();
 * ```
 */
public open class StepScalingPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StepScalingPolicyProps,
  ) :
      this(software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(StepScalingPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StepScalingPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, StepScalingPolicyProps(props)
  )

  /**
   *
   */
  public open fun lowerAction(): StepScalingAction? =
      unwrap(this).getLowerAction()?.let(StepScalingAction::wrap)

  /**
   *
   */
  public open fun lowerAlarm(): Alarm? = unwrap(this).getLowerAlarm()?.let(Alarm::wrap)

  /**
   *
   */
  public open fun upperAction(): StepScalingAction? =
      unwrap(this).getUpperAction()?.let(StepScalingAction::wrap)

  /**
   *
   */
  public open fun upperAlarm(): Alarm? = unwrap(this).getUpperAlarm()?.let(Alarm::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.applicationautoscaling.StepScalingPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * How the adjustment numbers inside 'intervals' are interpreted.
     *
     * Default: ChangeInCapacity
     *
     * @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted. 
     */
    public fun adjustmentType(adjustmentType: AdjustmentType)

    /**
     * Grace period after scaling activity.
     *
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     *
     * Default: No cooldown period
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     * @param cooldown Grace period after scaling activity. 
     */
    public fun cooldown(cooldown: Duration)

    /**
     * The number of data points out of the evaluation periods that must be breaching to trigger a
     * scaling action.
     *
     * Creates an "M out of N" alarm, where this property is the M and the value set for
     * `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     *
     * Default: - Same as `evaluationPeriods`
     *
     * @param datapointsToAlarm The number of data points out of the evaluation periods that must be
     * breaching to trigger a scaling action. 
     */
    public fun datapointsToAlarm(datapointsToAlarm: Number)

    /**
     * How many evaluation periods of the metric to wait before triggering a scaling action.
     *
     * Raising this value can be used to smooth out the metric, at the expense
     * of slower response times.
     *
     * If `datapointsToAlarm` is not set, then all data points in the evaluation period
     * must meet the criteria to trigger a scaling action.
     *
     * Default: 1
     *
     * @param evaluationPeriods How many evaluation periods of the metric to wait before triggering
     * a scaling action. 
     */
    public fun evaluationPeriods(evaluationPeriods: Number)

    /**
     * Metric to scale on.
     *
     * @param metric Metric to scale on. 
     */
    public fun metric(metric: IMetric)

    /**
     * Aggregation to apply to all data points over the evaluation periods.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     *
     * Default: - The statistic from the metric if applicable (MIN, MAX, AVERAGE), otherwise
     * AVERAGE.
     *
     * @param metricAggregationType Aggregation to apply to all data points over the evaluation
     * periods. 
     */
    public fun metricAggregationType(metricAggregationType: MetricAggregationType)

    /**
     * Minimum absolute number to adjust capacity with as result of percentage scaling.
     *
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
     * the minimum absolute effect size.
     *
     * Default: No minimum scaling effect
     *
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     * percentage scaling. 
     */
    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

    /**
     * The intervals for scaling.
     *
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     *
     * @param scalingSteps The intervals for scaling. 
     */
    public fun scalingSteps(scalingSteps: List<ScalingInterval>)

    /**
     * The intervals for scaling.
     *
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     *
     * @param scalingSteps The intervals for scaling. 
     */
    public fun scalingSteps(vararg scalingSteps: ScalingInterval)

    /**
     * The scaling target.
     *
     * @param scalingTarget The scaling target. 
     */
    public fun scalingTarget(scalingTarget: IScalableTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy.Builder =
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy.Builder.create(scope,
        id)

    /**
     * How the adjustment numbers inside 'intervals' are interpreted.
     *
     * Default: ChangeInCapacity
     *
     * @param adjustmentType How the adjustment numbers inside 'intervals' are interpreted. 
     */
    override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    /**
     * Grace period after scaling activity.
     *
     * Subsequent scale outs during the cooldown period are squashed so that only
     * the biggest scale out happens.
     *
     * Subsequent scale ins during the cooldown period are ignored.
     *
     * Default: No cooldown period
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepScalingPolicyConfiguration.html)
     * @param cooldown Grace period after scaling activity. 
     */
    override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    /**
     * The number of data points out of the evaluation periods that must be breaching to trigger a
     * scaling action.
     *
     * Creates an "M out of N" alarm, where this property is the M and the value set for
     * `evaluationPeriods` is the N value.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     *
     * Default: - Same as `evaluationPeriods`
     *
     * @param datapointsToAlarm The number of data points out of the evaluation periods that must be
     * breaching to trigger a scaling action. 
     */
    override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    /**
     * How many evaluation periods of the metric to wait before triggering a scaling action.
     *
     * Raising this value can be used to smooth out the metric, at the expense
     * of slower response times.
     *
     * If `datapointsToAlarm` is not set, then all data points in the evaluation period
     * must meet the criteria to trigger a scaling action.
     *
     * Default: 1
     *
     * @param evaluationPeriods How many evaluation periods of the metric to wait before triggering
     * a scaling action. 
     */
    override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    /**
     * Metric to scale on.
     *
     * @param metric Metric to scale on. 
     */
    override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    /**
     * Aggregation to apply to all data points over the evaluation periods.
     *
     * Only has meaning if `evaluationPeriods != 1`.
     *
     * Default: - The statistic from the metric if applicable (MIN, MAX, AVERAGE), otherwise
     * AVERAGE.
     *
     * @param metricAggregationType Aggregation to apply to all data points over the evaluation
     * periods. 
     */
    override fun metricAggregationType(metricAggregationType: MetricAggregationType) {
      cdkBuilder.metricAggregationType(metricAggregationType.let(MetricAggregationType::unwrap))
    }

    /**
     * Minimum absolute number to adjust capacity with as result of percentage scaling.
     *
     * Only when using AdjustmentType = PercentChangeInCapacity, this number controls
     * the minimum absolute effect size.
     *
     * Default: No minimum scaling effect
     *
     * @param minAdjustmentMagnitude Minimum absolute number to adjust capacity with as result of
     * percentage scaling. 
     */
    override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    /**
     * The intervals for scaling.
     *
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     *
     * @param scalingSteps The intervals for scaling. 
     */
    override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    /**
     * The intervals for scaling.
     *
     * Maps a range of metric values to a particular scaling behavior.
     *
     * Must be between 2 and 40 steps.
     *
     * @param scalingSteps The intervals for scaling. 
     */
    override fun scalingSteps(vararg scalingSteps: ScalingInterval): Unit =
        scalingSteps(scalingSteps.toList())

    /**
     * The scaling target.
     *
     * @param scalingTarget The scaling target. 
     */
    override fun scalingTarget(scalingTarget: IScalableTarget) {
      cdkBuilder.scalingTarget(scalingTarget.let(IScalableTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StepScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StepScalingPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy):
        StepScalingPolicy = StepScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: StepScalingPolicy):
        software.amazon.awscdk.services.applicationautoscaling.StepScalingPolicy = wrapped.cdkObject
  }
}
