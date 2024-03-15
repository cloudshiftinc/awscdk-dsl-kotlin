@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface AddApplicationActionProps : AddRuleProps {
  public fun action(): ListenerAction

  @CdkDslMarker
  public interface Builder {
    public fun action(action: ListenerAction)

    public fun conditions(conditions: List<ListenerCondition>)

    public fun conditions(vararg conditions: ListenerCondition)

    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps.builder()

    override fun action(action: ListenerAction) {
      cdkBuilder.action(action.let(ListenerAction::unwrap))
    }

    override fun conditions(conditions: List<ListenerCondition>) {
      cdkBuilder.conditions(conditions.map(ListenerCondition::unwrap))
    }

    override fun conditions(vararg conditions: ListenerCondition): Unit =
        conditions(conditions.toList())

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps,
  ) : CdkObject(cdkObject), AddApplicationActionProps {
    override fun action(): ListenerAction = unwrap(this).getAction().let(ListenerAction::wrap)

    override fun conditions(): List<ListenerCondition> =
        unwrap(this).getConditions()?.map(ListenerCondition::wrap) ?: emptyList()

    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddApplicationActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps):
        AddApplicationActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddApplicationActionProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps
  }
}
