@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface INodegroup : IResource {
  public fun nodegroupName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.INodegroup,
  ) : CdkObject(cdkObject), INodegroup {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun nodegroupName(): String = unwrap(this).getNodegroupName()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.INodegroup): INodegroup =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: INodegroup): software.amazon.awscdk.services.eks.INodegroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.INodegroup
  }
}