@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IPrivateSubnet : ISubnet {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IPrivateSubnet,
  ) : CdkObject(cdkObject), IPrivateSubnet {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun associateNetworkAcl(arg0: String, arg1: INetworkAcl) {
      unwrap(this).associateNetworkAcl(arg0, arg1.let(INetworkAcl::unwrap))
    }

    override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun internetConnectivityEstablished(): IDependable =
        unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

    override fun ipv4CidrBlock(): String = unwrap(this).getIpv4CidrBlock()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun routeTable(): IRouteTable = unwrap(this).getRouteTable().let(IRouteTable::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPrivateSubnet): IPrivateSubnet
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPrivateSubnet): software.amazon.awscdk.services.ec2.IPrivateSubnet
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IPrivateSubnet
  }
}