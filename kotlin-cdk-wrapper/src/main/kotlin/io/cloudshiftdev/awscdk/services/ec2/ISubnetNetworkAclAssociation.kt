@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISubnetNetworkAclAssociation : IResource {
  public fun subnetNetworkAclAssociationAssociationId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation,
  ) : CdkObject(cdkObject), ISubnetNetworkAclAssociation {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun subnetNetworkAclAssociationAssociationId(): String =
        unwrap(this).getSubnetNetworkAclAssociationAssociationId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation):
        ISubnetNetworkAclAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISubnetNetworkAclAssociation):
        software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation
  }
}
