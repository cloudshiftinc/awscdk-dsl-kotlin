package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.constructs.Construct
import kotlin.Unit

public interface HttpRouteIntegrationBindOptions {
  public fun route(): IHttpRoute

  public fun scope(): Construct

  public interface Builder {
    public fun route(route: IHttpRoute)

    public fun scope(scope: Construct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions.builder()

    override fun route(route: IHttpRoute) {
      cdkBuilder.route(route.let(IHttpRoute::unwrap))
    }

    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions,
  ) : HttpRouteIntegrationBindOptions {
    override fun route(): IHttpRoute = unwrap(this).getRoute().let(IHttpRoute::wrap)

    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpRouteIntegrationBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions):
        HttpRouteIntegrationBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpRouteIntegrationBindOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}