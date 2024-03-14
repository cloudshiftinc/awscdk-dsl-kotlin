package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface OAuthAuthorizationProps {
  public fun authorizationEndpoint(): String

  public fun bodyParameters(): Map<String, HttpParameter> =
      unwrap(this).getBodyParameters()?.mapValues { HttpParameter.wrap(it.value)} ?: emptyMap()

  public fun clientId(): String

  public fun clientSecret(): SecretValue

  public fun headerParameters(): Map<String, HttpParameter> =
      unwrap(this).getHeaderParameters()?.mapValues { HttpParameter.wrap(it.value)} ?: emptyMap()

  public fun httpMethod(): HttpMethod

  public fun queryStringParameters(): Map<String, HttpParameter> =
      unwrap(this).getQueryStringParameters()?.mapValues { HttpParameter.wrap(it.value)} ?:
      emptyMap()

  public interface Builder {
    public fun authorizationEndpoint(authorizationEndpoint: String) {
    }

    public fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
    }

    public fun clientId(clientId: String) {
    }

    public fun clientSecret(clientSecret: SecretValue) {
    }

    public fun headerParameters(headerParameters: Map<String, HttpParameter>) {
    }

    public fun httpMethod(httpMethod: HttpMethod) {
    }

    public fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.OAuthAuthorizationProps.Builder =
        software.amazon.awscdk.services.events.OAuthAuthorizationProps.builder()

    public override fun authorizationEndpoint(authorizationEndpoint: String) {
      cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    public override fun bodyParameters(bodyParameters: Map<String, HttpParameter>) {
      cdkBuilder.bodyParameters(bodyParameters.mapValues { HttpParameter.unwrap(it.value)})
    }

    public override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    public override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue::unwrap))
    }

    public override fun headerParameters(headerParameters: Map<String, HttpParameter>) {
      cdkBuilder.headerParameters(headerParameters.mapValues { HttpParameter.unwrap(it.value)})
    }

    public override fun httpMethod(httpMethod: HttpMethod) {
      cdkBuilder.httpMethod(httpMethod.let(HttpMethod::unwrap))
    }

    public override fun queryStringParameters(queryStringParameters: Map<String, HttpParameter>) {
      cdkBuilder.queryStringParameters(queryStringParameters.mapValues {
          HttpParameter.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.events.OAuthAuthorizationProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.OAuthAuthorizationProps,
  ) : OAuthAuthorizationProps {
    public override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

    public override fun bodyParameters(): Map<String, HttpParameter> =
        unwrap(this).getBodyParameters()?.mapValues { HttpParameter.wrap(it.value)} ?: emptyMap()

    public override fun clientId(): String = unwrap(this).getClientId()

    public override fun clientSecret(): SecretValue =
        unwrap(this).getClientSecret().let(SecretValue::wrap)

    public override fun headerParameters(): Map<String, HttpParameter> =
        unwrap(this).getHeaderParameters()?.mapValues { HttpParameter.wrap(it.value)} ?: emptyMap()

    public override fun httpMethod(): HttpMethod =
        unwrap(this).getHttpMethod().let(HttpMethod::wrap)

    public override fun queryStringParameters(): Map<String, HttpParameter> =
        unwrap(this).getQueryStringParameters()?.mapValues { HttpParameter.wrap(it.value)} ?:
        emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthAuthorizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.OAuthAuthorizationProps):
        OAuthAuthorizationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthAuthorizationProps):
        software.amazon.awscdk.services.events.OAuthAuthorizationProps = (wrapped as
        Wrapper).cdkObject
  }
}
