@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface TcpHealthCheckOptions {
  public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

  @CdkDslMarker
  public interface Builder {
    public fun healthyThreshold(healthyThreshold: Number)

    public fun interval(interval: Duration)

    public fun timeout(timeout: Duration)

    public fun unhealthyThreshold(unhealthyThreshold: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions.Builder =
        software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions.builder()

    override fun healthyThreshold(healthyThreshold: Number) {
      cdkBuilder.healthyThreshold(healthyThreshold)
    }

    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun unhealthyThreshold(unhealthyThreshold: Number) {
      cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions,
  ) : CdkObject(cdkObject), TcpHealthCheckOptions {
    override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TcpHealthCheckOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions):
        TcpHealthCheckOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TcpHealthCheckOptions):
        software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions
  }
}
