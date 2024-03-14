package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpMethod
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.IVpcLink
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.INetworkListener as CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener as AmazonAwscdkServicesElasticloadbalancingv2INetworkListener

public open class HttpNlbIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration,
) : HttpRouteIntegration(cdkObject) {
  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  public override fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy. 
     */
    public fun method(method: HttpMethod)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * Specifies the server name to verified by HTTPS when calling the backend integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration. 
     */
    public fun secureServerName(secureServerName: String)

    /**
     * The vpc link to be used for the private integration.
     *
     * Default: - a new VpcLink is created
     *
     * @param vpcLink The vpc link to be used for the private integration. 
     */
    public fun vpcLink(vpcLink: IVpcLink)
  }

  private class BuilderImpl(
    id: String,
    listener: AmazonAwscdkServicesElasticloadbalancingv2INetworkListener,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration.Builder.create(id,
        listener)

    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    /**
     * Specifies the server name to verified by HTTPS when calling the backend integration.
     *
     * Default: undefined private integration traffic will use HTTP protocol
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html)
     * @param secureServerName Specifies the server name to verified by HTTPS when calling the
     * backend integration. 
     */
    override fun secureServerName(secureServerName: String) {
      cdkBuilder.secureServerName(secureServerName)
    }

    /**
     * The vpc link to be used for the private integration.
     *
     * Default: - a new VpcLink is created
     *
     * @param vpcLink The vpc link to be used for the private integration. 
     */
    override fun vpcLink(vpcLink: IVpcLink) {
      cdkBuilder.vpcLink(vpcLink.let(IVpcLink::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      listener: CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkListener,
      block: Builder.() -> Unit = {},
    ): HttpNlbIntegration {
      val builderImpl = BuilderImpl(id,
          CloudshiftdevAwscdkServicesElasticloadbalancingv2INetworkListener.unwrap(listener))
      return HttpNlbIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration):
        HttpNlbIntegration = HttpNlbIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpNlbIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration = wrapped.cdkObject
  }
}
