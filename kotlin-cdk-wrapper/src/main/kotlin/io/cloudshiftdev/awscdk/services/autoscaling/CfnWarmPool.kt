@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWarmPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPool,
) : CfnResource(cdkObject), IInspectable {
  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceReusePolicy(): Any? = unwrap(this).getInstanceReusePolicy()

  public open fun instanceReusePolicy(`value`: IResolvable) {
    unwrap(this).setInstanceReusePolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceReusePolicy(`value`: InstanceReusePolicyProperty) {
    unwrap(this).setInstanceReusePolicy(`value`.let(InstanceReusePolicyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a2dd723b4dd3b974696caba348af65602d50683acfdcda6dd4ae6ce71a00789b")
  public open fun instanceReusePolicy(`value`: InstanceReusePolicyProperty.Builder.() -> Unit): Unit
      = instanceReusePolicy(InstanceReusePolicyProperty(`value`))

  public open fun maxGroupPreparedCapacity(): Number? = unwrap(this).getMaxGroupPreparedCapacity()

  public open fun maxGroupPreparedCapacity(`value`: Number) {
    unwrap(this).setMaxGroupPreparedCapacity(`value`)
  }

  public open fun minSize(): Number? = unwrap(this).getMinSize()

  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  public open fun poolState(): String? = unwrap(this).getPoolState()

  public open fun poolState(`value`: String) {
    unwrap(this).setPoolState(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroupName(autoScalingGroupName: String)

    public fun instanceReusePolicy(instanceReusePolicy: IResolvable)

    public fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2ff5f96c2ab03a54304029bc8d707c33d8e1684eb458cf69a86659ee2f20bc8")
    public
        fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty.Builder.() -> Unit)

    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number)

    public fun minSize(minSize: Number)

    public fun poolState(poolState: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnWarmPool.Builder =
        software.amazon.awscdk.services.autoscaling.CfnWarmPool.Builder.create(scope, id)

    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    override fun instanceReusePolicy(instanceReusePolicy: IResolvable) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(IResolvable::unwrap))
    }

    override fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty) {
      cdkBuilder.instanceReusePolicy(instanceReusePolicy.let(InstanceReusePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2ff5f96c2ab03a54304029bc8d707c33d8e1684eb458cf69a86659ee2f20bc8")
    override
        fun instanceReusePolicy(instanceReusePolicy: InstanceReusePolicyProperty.Builder.() -> Unit):
        Unit = instanceReusePolicy(InstanceReusePolicyProperty(instanceReusePolicy))

    override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun poolState(poolState: String) {
      cdkBuilder.poolState(poolState)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnWarmPool = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnWarmPool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWarmPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWarmPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPool):
        CfnWarmPool = CfnWarmPool(cdkObject)

    internal fun unwrap(wrapped: CfnWarmPool):
        software.amazon.awscdk.services.autoscaling.CfnWarmPool = wrapped.cdkObject
  }

  public interface InstanceReusePolicyProperty {
    public fun reuseOnScaleIn(): Any? = unwrap(this).getReuseOnScaleIn()

    @CdkDslMarker
    public interface Builder {
      public fun reuseOnScaleIn(reuseOnScaleIn: Boolean)

      public fun reuseOnScaleIn(reuseOnScaleIn: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty.builder()

      override fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
      }

      override fun reuseOnScaleIn(reuseOnScaleIn: IResolvable) {
        cdkBuilder.reuseOnScaleIn(reuseOnScaleIn.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty,
    ) : CdkObject(cdkObject), InstanceReusePolicyProperty {
      override fun reuseOnScaleIn(): Any? = unwrap(this).getReuseOnScaleIn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceReusePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty):
          InstanceReusePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceReusePolicyProperty):
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnWarmPool.InstanceReusePolicyProperty
    }
  }
}