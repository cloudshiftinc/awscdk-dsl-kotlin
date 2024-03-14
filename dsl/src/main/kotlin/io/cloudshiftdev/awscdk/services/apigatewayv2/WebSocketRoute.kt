package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WebSocketRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute,
) : Resource(cdkObject), IWebSocketRoute {
  public open fun integrationResponseId(): String? = unwrap(this).getIntegrationResponseId()

  public override fun routeId(): String = unwrap(this).getRouteId()

  public override fun routeKey(): String = unwrap(this).getRouteKey()

  public override fun webSocketApi(): IWebSocketApi =
      unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)

  public interface Builder {
    public fun apiKeyRequired(apiKeyRequired: Boolean) {
    }

    public fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
    }

    public fun integration(integration: WebSocketRouteIntegration) {
    }

    public fun returnResponse(returnResponse: Boolean) {
    }

    public fun routeKey(routeKey: String) {
    }

    public fun webSocketApi(webSocketApi: IWebSocketApi) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRoute.Builder.create(scope, id)

    public override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    public override fun authorizer(authorizer: IWebSocketRouteAuthorizer) {
      cdkBuilder.authorizer(authorizer.let(IWebSocketRouteAuthorizer::unwrap))
    }

    public override fun integration(integration: WebSocketRouteIntegration) {
      cdkBuilder.integration(integration.let(WebSocketRouteIntegration::unwrap))
    }

    public override fun returnResponse(returnResponse: Boolean) {
      cdkBuilder.returnResponse(returnResponse)
    }

    public override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    public override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRoute =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRoute):
        WebSocketRoute = WebSocketRoute(cdkObject)

    internal fun unwrap(wrapped: WebSocketRoute):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRoute = wrapped.cdkObject
  }
}
