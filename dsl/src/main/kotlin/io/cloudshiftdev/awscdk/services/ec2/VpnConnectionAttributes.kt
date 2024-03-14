package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VpnConnectionAttributes {
  public fun customerGatewayAsn(): Number

  public fun customerGatewayId(): String

  public fun customerGatewayIp(): String

  public fun vpnId(): String

  public interface Builder {
    public fun customerGatewayAsn(customerGatewayAsn: Number)

    public fun customerGatewayId(customerGatewayId: String)

    public fun customerGatewayIp(customerGatewayIp: String)

    public fun vpnId(vpnId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnectionAttributes.Builder =
        software.amazon.awscdk.services.ec2.VpnConnectionAttributes.builder()

    override fun customerGatewayAsn(customerGatewayAsn: Number) {
      cdkBuilder.customerGatewayAsn(customerGatewayAsn)
    }

    override fun customerGatewayId(customerGatewayId: String) {
      cdkBuilder.customerGatewayId(customerGatewayId)
    }

    override fun customerGatewayIp(customerGatewayIp: String) {
      cdkBuilder.customerGatewayIp(customerGatewayIp)
    }

    override fun vpnId(vpnId: String) {
      cdkBuilder.vpnId(vpnId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnectionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionAttributes,
  ) : VpnConnectionAttributes {
    override fun customerGatewayAsn(): Number = unwrap(this).getCustomerGatewayAsn()

    override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

    override fun customerGatewayIp(): String = unwrap(this).getCustomerGatewayIp()

    override fun vpnId(): String = unwrap(this).getVpnId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpnConnectionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionAttributes):
        VpnConnectionAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionAttributes):
        software.amazon.awscdk.services.ec2.VpnConnectionAttributes = (wrapped as Wrapper).cdkObject
  }
}
