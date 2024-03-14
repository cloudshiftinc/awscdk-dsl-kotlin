package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Unit

public interface DeploymentAlarmOptions {
  public fun behavior(): AlarmBehavior? = unwrap(this).getBehavior()?.let(AlarmBehavior::wrap)

  public interface Builder {
    public fun behavior(behavior: AlarmBehavior) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions.Builder =
        software.amazon.awscdk.services.ecs.DeploymentAlarmOptions.builder()

    public override fun behavior(behavior: AlarmBehavior) {
      cdkBuilder.behavior(behavior.let(AlarmBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentAlarmOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions,
  ) : DeploymentAlarmOptions {
    public override fun behavior(): AlarmBehavior? =
        unwrap(this).getBehavior()?.let(AlarmBehavior::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentAlarmOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions):
        DeploymentAlarmOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentAlarmOptions):
        software.amazon.awscdk.services.ecs.DeploymentAlarmOptions = (wrapped as Wrapper).cdkObject
  }
}
