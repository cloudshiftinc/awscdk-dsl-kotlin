@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface WebSocketRouteIntegrationConfig {
  public fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

  public fun method(): String? = unwrap(this).getMethod()

  public fun passthroughBehavior(): PassthroughBehavior? =
      unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

  public fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
      emptyMap()

  public fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
      emptyMap()

  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  public fun type(): WebSocketIntegrationType

  public fun uri(): String

  @CdkDslMarker
  public interface Builder {
    public fun credentialsRole(credentialsRole: IRole)

    public fun method(method: String)

    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    public fun requestParameters(requestParameters: Map<String, String>)

    public fun requestTemplates(requestTemplates: Map<String, String>)

    public fun templateSelectionExpression(templateSelectionExpression: String)

    public fun type(type: WebSocketIntegrationType)

    public fun uri(uri: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig.builder()

    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
    }

    override fun method(method: String) {
      cdkBuilder.method(method)
    }

    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
    }

    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    override fun type(type: WebSocketIntegrationType) {
      cdkBuilder.type(type.let(WebSocketIntegrationType::unwrap))
    }

    override fun uri(uri: String) {
      cdkBuilder.uri(uri)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig,
  ) : CdkObject(cdkObject), WebSocketRouteIntegrationConfig {
    override fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    override fun method(): String? = unwrap(this).getMethod()

    override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    override fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()

    override fun type(): WebSocketIntegrationType =
        unwrap(this).getType().let(WebSocketIntegrationType::wrap)

    override fun uri(): String = unwrap(this).getUri()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketRouteIntegrationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig):
        WebSocketRouteIntegrationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketRouteIntegrationConfig):
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
  }
}