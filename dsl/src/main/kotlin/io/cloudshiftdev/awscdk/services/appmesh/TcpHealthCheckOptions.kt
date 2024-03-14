package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface TcpHealthCheckOptions {
  /**
   * The number of consecutive successful health checks that must occur before declaring listener
   * healthy.
   *
   * Default: 2
   */
  public fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

  /**
   * The time period between each health check execution.
   *
   * Default: Duration.seconds(5)
   */
  public fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

  /**
   * The amount of time to wait when receiving a response from the health check.
   *
   * Default: Duration.seconds(2)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * The number of consecutive failed health checks that must occur before declaring a listener
   * unhealthy.
   *
   * Default: - 2
   */
  public fun unhealthyThreshold(): Number? = unwrap(this).getUnhealthyThreshold()

  /**
   * A builder for [TcpHealthCheckOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param healthyThreshold The number of consecutive successful health checks that must occur
     * before declaring listener healthy.
     */
    public fun healthyThreshold(healthyThreshold: Number)

    /**
     * @param interval The time period between each health check execution.
     */
    public fun interval(interval: Duration)

    /**
     * @param timeout The amount of time to wait when receiving a response from the health check.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param unhealthyThreshold The number of consecutive failed health checks that must occur
     * before declaring a listener unhealthy.
     */
    public fun unhealthyThreshold(unhealthyThreshold: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions.Builder =
        software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions.builder()

    /**
     * @param healthyThreshold The number of consecutive successful health checks that must occur
     * before declaring listener healthy.
     */
    override fun healthyThreshold(healthyThreshold: Number) {
      cdkBuilder.healthyThreshold(healthyThreshold)
    }

    /**
     * @param interval The time period between each health check execution.
     */
    override fun interval(interval: Duration) {
      cdkBuilder.interval(interval.let(Duration::unwrap))
    }

    /**
     * @param timeout The amount of time to wait when receiving a response from the health check.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param unhealthyThreshold The number of consecutive failed health checks that must occur
     * before declaring a listener unhealthy.
     */
    override fun unhealthyThreshold(unhealthyThreshold: Number) {
      cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions,
  ) : CdkObject(cdkObject), TcpHealthCheckOptions {
    /**
     * The number of consecutive successful health checks that must occur before declaring listener
     * healthy.
     *
     * Default: 2
     */
    override fun healthyThreshold(): Number? = unwrap(this).getHealthyThreshold()

    /**
     * The time period between each health check execution.
     *
     * Default: Duration.seconds(5)
     */
    override fun interval(): Duration? = unwrap(this).getInterval()?.let(Duration::wrap)

    /**
     * The amount of time to wait when receiving a response from the health check.
     *
     * Default: Duration.seconds(2)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * The number of consecutive failed health checks that must occur before declaring a listener
     * unhealthy.
     *
     * Default: - 2
     */
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
