package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpGatewayListenerOptions {
  public fun connectionPool(): HttpConnectionPool? =
      unwrap(this).getConnectionPool()?.let(HttpConnectionPool::wrap)

  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  public fun port(): Number? = unwrap(this).getPort()

  public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

  public interface Builder {
    public fun connectionPool(connectionPool: HttpConnectionPool) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1456b4806c467b496e17dc162a206c03d4db27eea70e56e0a9f61313d7ef3f49")
    public fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    public fun port(port: Number) {
    }

    public fun tls(tls: ListenerTlsOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7bba94bb4ff504931cd3491e0e09cc730140a309dcf29e2573741bb345649eb")
    public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions.Builder =
        software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions.builder()

    public override fun connectionPool(connectionPool: HttpConnectionPool) {
      cdkBuilder.connectionPool(connectionPool.let(HttpConnectionPool::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1456b4806c467b496e17dc162a206c03d4db27eea70e56e0a9f61313d7ef3f49")
    public override fun connectionPool(connectionPool: HttpConnectionPool.Builder.() -> Unit): Unit
        = connectionPool(HttpConnectionPool(connectionPool))

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun tls(tls: ListenerTlsOptions) {
      cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7bba94bb4ff504931cd3491e0e09cc730140a309dcf29e2573741bb345649eb")
    public override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
        tls(ListenerTlsOptions(tls))

    public fun build(): software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions,
  ) : HttpGatewayListenerOptions {
    public override fun connectionPool(): HttpConnectionPool? =
        unwrap(this).getConnectionPool()?.let(HttpConnectionPool::wrap)

    public override fun healthCheck(): HealthCheck? =
        unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    public override fun port(): Number? = unwrap(this).getPort()

    public override fun tls(): ListenerTlsOptions? =
        unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpGatewayListenerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions):
        HttpGatewayListenerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpGatewayListenerOptions):
        software.amazon.awscdk.services.appmesh.HttpGatewayListenerOptions = (wrapped as
        Wrapper).cdkObject
  }
}
