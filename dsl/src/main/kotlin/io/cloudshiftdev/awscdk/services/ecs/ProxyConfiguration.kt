package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct

public abstract class ProxyConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
) {
  public open fun bind(arg0: Construct, arg1: TaskDefinition):
      CfnTaskDefinition.ProxyConfigurationProperty = unwrap(this).bind(arg0.let(Construct::unwrap),
      arg1.let(TaskDefinition::unwrap)).let(CfnTaskDefinition.ProxyConfigurationProperty::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration,
  ) : ProxyConfiguration(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ProxyConfiguration):
        ProxyConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ProxyConfiguration):
        software.amazon.awscdk.services.ecs.ProxyConfiguration = (wrapped as Wrapper).cdkObject
  }
}
