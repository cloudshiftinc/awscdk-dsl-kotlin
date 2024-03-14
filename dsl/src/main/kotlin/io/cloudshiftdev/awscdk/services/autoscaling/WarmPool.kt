package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WarmPool internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.WarmPool,
) : Resource(cdkObject) {
  public interface Builder {
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    }

    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
    }

    public fun minSize(minSize: Number) {
    }

    public fun poolState(poolState: PoolState) {
    }

    public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.WarmPool.Builder =
        software.amazon.awscdk.services.autoscaling.WarmPool.Builder.create(scope, id)

    public override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    public override fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
      cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    public override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    public override fun poolState(poolState: PoolState) {
      cdkBuilder.poolState(poolState.let(PoolState::unwrap))
    }

    public override fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
      cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.WarmPool = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WarmPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WarmPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.WarmPool): WarmPool =
        WarmPool(cdkObject)

    internal fun unwrap(wrapped: WarmPool): software.amazon.awscdk.services.autoscaling.WarmPool =
        wrapped.cdkObject
  }
}
