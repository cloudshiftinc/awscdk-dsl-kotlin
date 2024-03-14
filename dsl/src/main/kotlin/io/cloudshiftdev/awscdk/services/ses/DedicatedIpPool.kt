package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class DedicatedIpPool internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPool,
) : Resource(cdkObject), IDedicatedIpPool {
  public override fun dedicatedIpPoolName(): String = unwrap(this).getDedicatedIpPoolName()

  public interface Builder {
    public fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
    }

    public fun scalingMode(scalingMode: ScalingMode) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.DedicatedIpPool.Builder =
        software.amazon.awscdk.services.ses.DedicatedIpPool.Builder.create(scope, id)

    public override fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
      cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    public override fun scalingMode(scalingMode: ScalingMode) {
      cdkBuilder.scalingMode(scalingMode.let(ScalingMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.DedicatedIpPool = cdkBuilder.build()
  }

  public companion object {
    public open fun fromDedicatedIpPoolName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      dedicatedIpPoolName: String,
    ): IDedicatedIpPool =
        software.amazon.awscdk.services.ses.DedicatedIpPool.fromDedicatedIpPoolName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, dedicatedIpPoolName).let(IDedicatedIpPool::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): DedicatedIpPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return DedicatedIpPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DedicatedIpPool):
        DedicatedIpPool = DedicatedIpPool(cdkObject)

    internal fun unwrap(wrapped: DedicatedIpPool):
        software.amazon.awscdk.services.ses.DedicatedIpPool = wrapped.cdkObject
  }
}
