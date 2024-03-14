package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpMethod
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import kotlin.Unit

public interface HttpUrlIntegrationProps {
  /**
   * The HTTP method that must be used to invoke the underlying HTTP proxy.
   *
   * Default: HttpMethod.ANY
   */
  public fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

  /**
   * Specifies how to transform HTTP requests before sending them to the backend.
   *
   * Default: undefined requests are sent to the backend unmodified
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
   */
  public fun parameterMapping(): ParameterMapping? =
      unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)

  /**
   * A builder for [HttpUrlIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy.
     */
    public fun method(method: HttpMethod)

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps.builder()

    /**
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy.
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    /**
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend.
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps,
  ) : CdkObject(cdkObject), HttpUrlIntegrationProps {
    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     */
    override fun method(): HttpMethod? = unwrap(this).getMethod()?.let(HttpMethod::wrap)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     */
    override fun parameterMapping(): ParameterMapping? =
        unwrap(this).getParameterMapping()?.let(ParameterMapping::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpUrlIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps):
        HttpUrlIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpUrlIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps
  }
}
