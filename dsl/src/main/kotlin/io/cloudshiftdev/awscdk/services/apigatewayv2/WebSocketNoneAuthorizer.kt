package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class WebSocketNoneAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer,
) : CdkObject(cdkObject), IWebSocketRouteAuthorizer {
  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param _options 
   */
  public override fun bind(_options: WebSocketRouteAuthorizerBindOptions):
      WebSocketRouteAuthorizerConfig =
      unwrap(this).bind(_options.let(WebSocketRouteAuthorizerBindOptions::unwrap)).let(WebSocketRouteAuthorizerConfig::wrap)

  /**
   * Bind this authorizer to a specified WebSocket route.
   *
   * @param _options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4748e6838372195e9aa1a18e6e678999d779e421141e36cb85387a0736bf08b7")
  public override fun bind(_options: WebSocketRouteAuthorizerBindOptions.Builder.() -> Unit):
      WebSocketRouteAuthorizerConfig = bind(WebSocketRouteAuthorizerBindOptions(_options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer):
        WebSocketNoneAuthorizer = WebSocketNoneAuthorizer(cdkObject)

    internal fun unwrap(wrapped: WebSocketNoneAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.WebSocketNoneAuthorizer = wrapped.cdkObject
  }
}
