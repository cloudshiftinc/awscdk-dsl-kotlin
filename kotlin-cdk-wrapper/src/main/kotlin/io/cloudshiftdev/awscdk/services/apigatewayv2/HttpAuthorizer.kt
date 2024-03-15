@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class HttpAuthorizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer,
) : Resource(cdkObject), IHttpAuthorizer {
  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun authorizerUri(authorizerUri: String)

    public fun enableSimpleResponses(enableSimpleResponses: Boolean)

    public fun httpApi(httpApi: IHttpApi)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun jwtAudience(jwtAudience: List<String>)

    public fun jwtAudience(vararg jwtAudience: String)

    public fun jwtIssuer(jwtIssuer: String)

    public fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion)

    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    public fun type(type: HttpAuthorizerType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer.Builder.create(scope, id)

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    override fun enableSimpleResponses(enableSimpleResponses: Boolean) {
      cdkBuilder.enableSimpleResponses(enableSimpleResponses)
    }

    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun jwtAudience(jwtAudience: List<String>) {
      cdkBuilder.jwtAudience(jwtAudience)
    }

    override fun jwtAudience(vararg jwtAudience: String): Unit = jwtAudience(jwtAudience.toList())

    override fun jwtIssuer(jwtIssuer: String) {
      cdkBuilder.jwtIssuer(jwtIssuer)
    }

    override fun payloadFormatVersion(payloadFormatVersion: AuthorizerPayloadVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(AuthorizerPayloadVersion::unwrap))
    }

    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    override fun type(type: HttpAuthorizerType) {
      cdkBuilder.type(type.let(HttpAuthorizerType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromHttpAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpAuthorizerAttributes,
    ): IHttpRouteAuthorizer =
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer.fromHttpAuthorizerAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(HttpAuthorizerAttributes::unwrap)).let(IHttpRouteAuthorizer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1a033791ee074ae395c0f1b6787e8eba84915efec33220ef959a38f976984f")
    public fun fromHttpAuthorizerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HttpAuthorizerAttributes.Builder.() -> Unit,
    ): IHttpRouteAuthorizer = fromHttpAuthorizerAttributes(scope, id,
        HttpAuthorizerAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HttpAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HttpAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer):
        HttpAuthorizer = HttpAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpAuthorizer):
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizer = wrapped.cdkObject
  }
}