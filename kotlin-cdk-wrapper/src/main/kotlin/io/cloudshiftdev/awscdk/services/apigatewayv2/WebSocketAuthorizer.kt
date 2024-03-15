@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WebSocketAuthorizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer,
) : Resource(cdkObject), IWebSocketAuthorizer {
  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun authorizerUri(authorizerUri: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun type(type: WebSocketAuthorizerType)

    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer.Builder
        = software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer.Builder.create(scope, id)

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun type(type: WebSocketAuthorizerType) {
      cdkBuilder.type(type.let(WebSocketAuthorizerType::unwrap))
    }

    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromWebSocketAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketAuthorizerAttributes,
    ): IWebSocketRouteAuthorizer =
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer.fromWebSocketAuthorizerAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(WebSocketAuthorizerAttributes::unwrap)).let(IWebSocketRouteAuthorizer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1ef7641b7e24d5299874ba34280a6013ee58585e0c382e2bd0a1c5bd8550955")
    public fun fromWebSocketAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketAuthorizerAttributes.Builder.() -> Unit,
    ): IWebSocketRouteAuthorizer = fromWebSocketAuthorizerAttributes(scope, id,
        WebSocketAuthorizerAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer):
        WebSocketAuthorizer = WebSocketAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizer = wrapped.cdkObject
  }
}
