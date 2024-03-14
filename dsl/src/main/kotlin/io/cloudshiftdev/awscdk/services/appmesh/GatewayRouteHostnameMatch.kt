package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String

public abstract class GatewayRouteHostnameMatch internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch,
) : CdkObject(cdkObject) {
  /**
   * Returns the gateway route host name match configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): GatewayRouteHostnameMatchConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(GatewayRouteHostnameMatchConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch,
  ) : GatewayRouteHostnameMatch(cdkObject)

  public companion object {
    public fun endsWith(suffix: String): GatewayRouteHostnameMatch =
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch.endsWith(suffix).let(GatewayRouteHostnameMatch::wrap)

    public fun exactly(name: String): GatewayRouteHostnameMatch =
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch.exactly(name).let(GatewayRouteHostnameMatch::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch):
        GatewayRouteHostnameMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteHostnameMatch):
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatch
  }
}
