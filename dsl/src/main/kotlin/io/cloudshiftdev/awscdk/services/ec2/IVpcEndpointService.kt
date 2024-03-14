package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVpcEndpointService : IResource {
  public fun vpcEndpointServiceId(): String

  public fun vpcEndpointServiceName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointService,
  ) : IVpcEndpointService {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun vpcEndpointServiceId(): String = unwrap(this).getVpcEndpointServiceId()

    public override fun vpcEndpointServiceName(): String = unwrap(this).getVpcEndpointServiceName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointService):
        IVpcEndpointService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcEndpointService):
        software.amazon.awscdk.services.ec2.IVpcEndpointService = (wrapped as Wrapper).cdkObject
  }
}
