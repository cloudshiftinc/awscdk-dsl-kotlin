@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IVpcEndpointService : IResource {
  public fun vpcEndpointServiceId(): String

  public fun vpcEndpointServiceName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointService,
  ) : CdkObject(cdkObject), IVpcEndpointService {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpcEndpointServiceId(): String = unwrap(this).getVpcEndpointServiceId()

    override fun vpcEndpointServiceName(): String = unwrap(this).getVpcEndpointServiceName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpcEndpointService):
        IVpcEndpointService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpcEndpointService):
        software.amazon.awscdk.services.ec2.IVpcEndpointService = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.IVpcEndpointService
  }
}
