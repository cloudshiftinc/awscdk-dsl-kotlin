@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IFargateService : IService {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.IFargateService,
  ) : CdkObject(cdkObject), IFargateService {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun serviceArn(): String = unwrap(this).getServiceArn()

    override fun serviceName(): String = unwrap(this).getServiceName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.IFargateService):
        IFargateService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFargateService):
        software.amazon.awscdk.services.ecs.IFargateService = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.IFargateService
  }
}
