package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.Alarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class StepScalingPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.StepScalingPolicy,
) : CloudshiftdevConstructsConstruct(cdkObject) {
  public open fun lowerAction(): StepScalingAction? =
      unwrap(this).getLowerAction()?.let(StepScalingAction::wrap)

  public open fun lowerAlarm(): Alarm? = unwrap(this).getLowerAlarm()?.let(Alarm::wrap)

  public open fun upperAction(): StepScalingAction? =
      unwrap(this).getUpperAction()?.let(StepScalingAction::wrap)

  public open fun upperAlarm(): Alarm? = unwrap(this).getUpperAlarm()?.let(Alarm::wrap)

  public interface Builder {
    public fun adjustmentType(adjustmentType: AdjustmentType) {
    }

    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    }

    public fun cooldown(cooldown: Duration) {
    }

    public fun datapointsToAlarm(datapointsToAlarm: Number) {
    }

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
    }

    public fun evaluationPeriods(evaluationPeriods: Number) {
    }

    public fun metric(metric: IMetric) {
    }

    public fun metricAggregationType(metricAggregationType: MetricAggregationType) {
    }

    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
    }

    public fun scalingSteps(scalingSteps: List<ScalingInterval>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.StepScalingPolicy.Builder =
        software.amazon.awscdk.services.autoscaling.StepScalingPolicy.Builder.create(scope, id)

    public override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    public override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    public override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    public override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    public override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup.let(Duration::unwrap))
    }

    public override fun evaluationPeriods(evaluationPeriods: Number) {
      cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    public override fun metric(metric: IMetric) {
      cdkBuilder.metric(metric.let(IMetric::unwrap))
    }

    public override fun metricAggregationType(metricAggregationType: MetricAggregationType) {
      cdkBuilder.metricAggregationType(metricAggregationType.let(MetricAggregationType::unwrap))
    }

    public override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    public override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.StepScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StepScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StepScalingPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.StepScalingPolicy):
        StepScalingPolicy = StepScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: StepScalingPolicy):
        software.amazon.awscdk.services.autoscaling.StepScalingPolicy = wrapped.cdkObject
  }
}
