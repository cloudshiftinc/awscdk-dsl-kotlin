package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface FunctionUrlCorsOptions {
  public fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

  public fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?: emptyList()

  public fun allowedMethods(): List<HttpMethod> =
      unwrap(this).getAllowedMethods()?.map(HttpMethod::wrap) ?: emptyList()

  public fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins() ?: emptyList()

  public fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?: emptyList()

  public fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)

  public interface Builder {
    public fun allowCredentials(allowCredentials: Boolean) {
    }

    public fun allowedHeaders(allowedHeaders: List<String>) {
    }

    public fun allowedMethods(allowedMethods: List<HttpMethod>) {
    }

    public fun allowedOrigins(allowedOrigins: List<String>) {
    }

    public fun exposedHeaders(exposedHeaders: List<String>) {
    }

    public fun maxAge(maxAge: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions.Builder =
        software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions.builder()

    public override fun allowCredentials(allowCredentials: Boolean) {
      cdkBuilder.allowCredentials(allowCredentials)
    }

    public override fun allowedHeaders(allowedHeaders: List<String>) {
      cdkBuilder.allowedHeaders(allowedHeaders)
    }

    public override fun allowedMethods(allowedMethods: List<HttpMethod>) {
      cdkBuilder.allowedMethods(allowedMethods.map(HttpMethod::unwrap))
    }

    public override fun allowedOrigins(allowedOrigins: List<String>) {
      cdkBuilder.allowedOrigins(allowedOrigins)
    }

    public override fun exposedHeaders(exposedHeaders: List<String>) {
      cdkBuilder.exposedHeaders(exposedHeaders)
    }

    public override fun maxAge(maxAge: Duration) {
      cdkBuilder.maxAge(maxAge.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions,
  ) : FunctionUrlCorsOptions {
    public override fun allowCredentials(): Boolean? = unwrap(this).getAllowCredentials()

    public override fun allowedHeaders(): List<String> = unwrap(this).getAllowedHeaders() ?:
        emptyList()

    public override fun allowedMethods(): List<HttpMethod> =
        unwrap(this).getAllowedMethods()?.map(HttpMethod::wrap) ?: emptyList()

    public override fun allowedOrigins(): List<String> = unwrap(this).getAllowedOrigins() ?:
        emptyList()

    public override fun exposedHeaders(): List<String> = unwrap(this).getExposedHeaders() ?:
        emptyList()

    public override fun maxAge(): Duration? = unwrap(this).getMaxAge()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlCorsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions):
        FunctionUrlCorsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FunctionUrlCorsOptions):
        software.amazon.awscdk.services.lambda.FunctionUrlCorsOptions = (wrapped as
        Wrapper).cdkObject
  }
}
