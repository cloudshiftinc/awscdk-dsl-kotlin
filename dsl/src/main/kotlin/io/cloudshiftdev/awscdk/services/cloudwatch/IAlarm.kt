package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IAlarm : IAlarmRule, IResource {
  public fun alarmArn(): String

  public fun alarmName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarm,
  ) : IAlarm {
    override fun alarmArn(): String = unwrap(this).getAlarmArn()

    override fun alarmName(): String = unwrap(this).getAlarmName()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun renderAlarmRule(): String = unwrap(this).renderAlarmRule()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarm): IAlarm =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlarm): software.amazon.awscdk.services.cloudwatch.IAlarm =
        (wrapped as Wrapper).cdkObject
  }
}
