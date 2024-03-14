package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IInstance : IResource {
  public fun instanceId(): String

  public fun service(): IService

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicediscovery.IInstance,
  ) : IInstance {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun service(): IService = unwrap(this).getService().let(IService::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IInstance):
        IInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInstance):
        software.amazon.awscdk.services.servicediscovery.IInstance = (wrapped as Wrapper).cdkObject
  }
}