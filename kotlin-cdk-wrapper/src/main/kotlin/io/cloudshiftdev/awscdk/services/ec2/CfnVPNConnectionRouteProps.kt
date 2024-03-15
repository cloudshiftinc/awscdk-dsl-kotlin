@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnVPNConnectionRouteProps {
  public fun destinationCidrBlock(): String

  public fun vpnConnectionId(): String

  @CdkDslMarker
  public interface Builder {
    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun vpnConnectionId(vpnConnectionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps.builder()

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun vpnConnectionId(vpnConnectionId: String) {
      cdkBuilder.vpnConnectionId(vpnConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps,
  ) : CdkObject(cdkObject), CfnVPNConnectionRouteProps {
    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    override fun vpnConnectionId(): String = unwrap(this).getVpnConnectionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPNConnectionRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps):
        CfnVPNConnectionRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnectionRouteProps):
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps
  }
}
