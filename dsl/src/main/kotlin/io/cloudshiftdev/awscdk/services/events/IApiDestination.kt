package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IApiDestination : IResource {
  public fun apiDestinationArn(): String

  public fun apiDestinationName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.IApiDestination,
  ) : IApiDestination {
    override fun apiDestinationArn(): String = unwrap(this).getApiDestinationArn()

    override fun apiDestinationName(): String = unwrap(this).getApiDestinationName()

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.IApiDestination):
        IApiDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApiDestination):
        software.amazon.awscdk.services.events.IApiDestination = (wrapped as Wrapper).cdkObject
  }
}
