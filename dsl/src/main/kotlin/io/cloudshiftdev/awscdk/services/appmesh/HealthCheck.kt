package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class HealthCheck internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheck,
) {
  public open fun bind(arg0: Construct, arg1: HealthCheckBindOptions): HealthCheckConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap),
      arg1.let(HealthCheckBindOptions::unwrap)).let(HealthCheckConfig::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e14868d4f0eef12d5bfd839171646876cecc6acfb144938855aea88892fd5219")
  public open fun bind(arg0: Construct, arg1: HealthCheckBindOptions.Builder.() -> Unit):
      HealthCheckConfig = bind(arg0, HealthCheckBindOptions(arg1))

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HealthCheck,
  ) : HealthCheck(cdkObject)

  public companion object {
    public open fun grpc(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.grpc().let(HealthCheck::wrap)

    public open fun grpc(options: GrpcHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.grpc(options.let(GrpcHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca4aa5f646cab38266ec9a00ad9f89bc1ca43aeacd9b12580cb2e1f842fcd263")
    public open fun grpc(options: GrpcHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        grpc(GrpcHealthCheckOptions(options))

    public open fun http(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http().let(HealthCheck::wrap)

    public open fun http(options: HttpHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http(options.let(HttpHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c354f1fe3451f953e1691c5d04b8c36b09946d906547a0b8b5f34bc696285e76")
    public open fun http(options: HttpHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        http(HttpHealthCheckOptions(options))

    public open fun http2(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http2().let(HealthCheck::wrap)

    public open fun http2(options: HttpHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.http2(options.let(HttpHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80291b38f690382fada9f5ea7fa44011f91859a26b6f5446e003b9e2d9c09e27")
    public open fun http2(options: HttpHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        http2(HttpHealthCheckOptions(options))

    public open fun tcp(): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.tcp().let(HealthCheck::wrap)

    public open fun tcp(options: TcpHealthCheckOptions): HealthCheck =
        software.amazon.awscdk.services.appmesh.HealthCheck.tcp(options.let(TcpHealthCheckOptions::unwrap)).let(HealthCheck::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40dcb0b765391f6b0f9a4c2e59045f055eda8aec8e9f36cd3ee748c070b37b90")
    public open fun tcp(options: TcpHealthCheckOptions.Builder.() -> Unit): HealthCheck =
        tcp(TcpHealthCheckOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HealthCheck): HealthCheck =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HealthCheck): software.amazon.awscdk.services.appmesh.HealthCheck =
        (wrapped as Wrapper).cdkObject
  }
}