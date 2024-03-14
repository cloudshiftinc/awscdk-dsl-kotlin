package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface BasicStepScalingPolicyProps {
  public fun adjustmentType(): AdjustmentType? =
      unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

  public fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

  public fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

  public fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

  public fun metric(): IMetric

  public fun metricAggregationType(): MetricAggregationType? =
      unwrap(this).getMetricAggregationType()?.let(MetricAggregationType::wrap)

  public fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

  public fun scalingSteps(): List<ScalingInterval>

  public interface Builder {
    public fun adjustmentType(adjustmentType: AdjustmentType) {
    }

    public fun cooldown(cooldown: Duration) {
    }

    public fun datapointsToAlarm(datapointsToAlarm: Number) {
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps.builder()

    public override fun adjustmentType(adjustmentType: AdjustmentType) {
      cdkBuilder.adjustmentType(adjustmentType.let(AdjustmentType::unwrap))
    }

    public override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    public override fun datapointsToAlarm(datapointsToAlarm: Number) {
      cdkBuilder.datapointsToAlarm(datapointsToAlarm)
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

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps,
  ) : BasicStepScalingPolicyProps {
    public override fun adjustmentType(): AdjustmentType? =
        unwrap(this).getAdjustmentType()?.let(AdjustmentType::wrap)

    public override fun cooldown(): Duration? = unwrap(this).getCooldown()?.let(Duration::wrap)

    public override fun datapointsToAlarm(): Number? = unwrap(this).getDatapointsToAlarm()

    public override fun evaluationPeriods(): Number? = unwrap(this).getEvaluationPeriods()

    public override fun metric(): IMetric = unwrap(this).getMetric().let(IMetric::wrap)

    public override fun metricAggregationType(): MetricAggregationType? =
        unwrap(this).getMetricAggregationType()?.let(MetricAggregationType::wrap)

    public override fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

    public override fun scalingSteps(): List<ScalingInterval> =
        unwrap(this).getScalingSteps().map(ScalingInterval::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BasicStepScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps):
        BasicStepScalingPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicStepScalingPolicyProps):
        software.amazon.awscdk.services.applicationautoscaling.BasicStepScalingPolicyProps =
        (wrapped as Wrapper).cdkObject
  }
}
