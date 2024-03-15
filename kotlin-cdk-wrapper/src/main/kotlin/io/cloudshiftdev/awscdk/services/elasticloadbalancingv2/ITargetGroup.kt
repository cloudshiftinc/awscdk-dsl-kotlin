@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ITargetGroup : IConstruct {
  public fun loadBalancerArns(): String

  public fun loadBalancerAttached(): IDependable

  public fun targetGroupArn(): String

  public fun targetGroupName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup,
  ) : CdkObject(cdkObject), ITargetGroup {
    override fun loadBalancerArns(): String = unwrap(this).getLoadBalancerArns()

    override fun loadBalancerAttached(): IDependable =
        unwrap(this).getLoadBalancerAttached().let(IDependable::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()

    override fun targetGroupName(): String = unwrap(this).getTargetGroupName()
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup):
        ITargetGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticloadbalancingv2.ITargetGroup
  }
}
