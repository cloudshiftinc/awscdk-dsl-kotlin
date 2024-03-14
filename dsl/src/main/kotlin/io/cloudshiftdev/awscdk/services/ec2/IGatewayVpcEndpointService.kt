package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String

public interface IGatewayVpcEndpointService {
  public fun name(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService,
  ) : IGatewayVpcEndpointService {
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService):
        IGatewayVpcEndpointService = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGatewayVpcEndpointService):
        software.amazon.awscdk.services.ec2.IGatewayVpcEndpointService = (wrapped as
        Wrapper).cdkObject
  }
}
