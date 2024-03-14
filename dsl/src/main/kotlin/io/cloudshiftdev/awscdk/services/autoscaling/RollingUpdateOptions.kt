package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface RollingUpdateOptions {
  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  public fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

  public fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

  public fun pauseTime(): Duration? = unwrap(this).getPauseTime()?.let(Duration::wrap)

  public fun suspendProcesses(): List<ScalingProcess> =
      unwrap(this).getSuspendProcesses()?.map(ScalingProcess::wrap) ?: emptyList()

  public fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()

  public interface Builder {
    public fun maxBatchSize(maxBatchSize: Number) {
    }

    public fun minInstancesInService(minInstancesInService: Number) {
    }

    public fun minSuccessPercentage(minSuccessPercentage: Number) {
    }

    public fun pauseTime(pauseTime: Duration) {
    }

    public fun suspendProcesses(suspendProcesses: List<ScalingProcess>) {
    }

    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.RollingUpdateOptions.Builder
        = software.amazon.awscdk.services.autoscaling.RollingUpdateOptions.builder()

    public override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    public override fun minInstancesInService(minInstancesInService: Number) {
      cdkBuilder.minInstancesInService(minInstancesInService)
    }

    public override fun minSuccessPercentage(minSuccessPercentage: Number) {
      cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    public override fun pauseTime(pauseTime: Duration) {
      cdkBuilder.pauseTime(pauseTime.let(Duration::unwrap))
    }

    public override fun suspendProcesses(suspendProcesses: List<ScalingProcess>) {
      cdkBuilder.suspendProcesses(suspendProcesses.map(ScalingProcess::unwrap))
    }

    public override fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
      cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.RollingUpdateOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.RollingUpdateOptions,
  ) : RollingUpdateOptions {
    public override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    public override fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

    public override fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

    public override fun pauseTime(): Duration? = unwrap(this).getPauseTime()?.let(Duration::wrap)

    public override fun suspendProcesses(): List<ScalingProcess> =
        unwrap(this).getSuspendProcesses()?.map(ScalingProcess::wrap) ?: emptyList()

    public override fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RollingUpdateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.RollingUpdateOptions):
        RollingUpdateOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RollingUpdateOptions):
        software.amazon.awscdk.services.autoscaling.RollingUpdateOptions = (wrapped as
        Wrapper).cdkObject
  }
}
