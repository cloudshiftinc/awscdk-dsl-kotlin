@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface GrpcConnectionPool {
  public fun maxRequests(): Number

  @CdkDslMarker
  public interface Builder {
    public fun maxRequests(maxRequests: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcConnectionPool.Builder =
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool.builder()

    override fun maxRequests(maxRequests: Number) {
      cdkBuilder.maxRequests(maxRequests)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcConnectionPool =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool,
  ) : CdkObject(cdkObject), GrpcConnectionPool {
    override fun maxRequests(): Number = unwrap(this).getMaxRequests()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcConnectionPool {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcConnectionPool):
        GrpcConnectionPool = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcConnectionPool):
        software.amazon.awscdk.services.appmesh.GrpcConnectionPool = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GrpcConnectionPool
  }
}