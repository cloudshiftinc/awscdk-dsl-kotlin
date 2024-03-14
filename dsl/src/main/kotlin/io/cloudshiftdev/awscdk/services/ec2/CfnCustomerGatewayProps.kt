package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCustomerGatewayProps {
  /**
   * For devices that support BGP, the customer gateway's BGP ASN.
   *
   * Default: 65000
   *
   * Default: - 65000
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
   */
  public fun bgpAsn(): Number

  /**
   * The name of customer gateway device.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
   */
  public fun deviceName(): String? = unwrap(this).getDeviceName()

  /**
   * IPv4 address for the customer gateway device's outside interface.
   *
   * The address must be static.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
   */
  public fun ipAddress(): String

  /**
   * One or more tags for the customer gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnCustomerGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bgpAsn For devices that support BGP, the customer gateway's BGP ASN. 
     * Default: 65000
     */
    public fun bgpAsn(bgpAsn: Number)

    /**
     * @param deviceName The name of customer gateway device.
     */
    public fun deviceName(deviceName: String)

    /**
     * @param ipAddress IPv4 address for the customer gateway device's outside interface. 
     * The address must be static.
     */
    public fun ipAddress(ipAddress: String)

    /**
     * @param tags One or more tags for the customer gateway.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags One or more tags for the customer gateway.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ). 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.builder()

    /**
     * @param bgpAsn For devices that support BGP, the customer gateway's BGP ASN. 
     * Default: 65000
     */
    override fun bgpAsn(bgpAsn: Number) {
      cdkBuilder.bgpAsn(bgpAsn)
    }

    /**
     * @param deviceName The name of customer gateway device.
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param ipAddress IPv4 address for the customer gateway device's outside interface. 
     * The address must be static.
     */
    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    /**
     * @param tags One or more tags for the customer gateway.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags One or more tags for the customer gateway.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of VPN connection that this customer gateway supports ( `ipsec.1` ). 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps,
  ) : CdkObject(cdkObject), CfnCustomerGatewayProps {
    /**
     * For devices that support BGP, the customer gateway's BGP ASN.
     *
     * Default: 65000
     *
     * Default: - 65000
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-bgpasn)
     */
    override fun bgpAsn(): Number = unwrap(this).getBgpAsn()

    /**
     * The name of customer gateway device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-devicename)
     */
    override fun deviceName(): String? = unwrap(this).getDeviceName()

    /**
     * IPv4 address for the customer gateway device's outside interface.
     *
     * The address must be static.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-ipaddress)
     */
    override fun ipAddress(): String = unwrap(this).getIpAddress()

    /**
     * One or more tags for the customer gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of VPN connection that this customer gateway supports ( `ipsec.1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-customergateway.html#cfn-ec2-customergateway-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomerGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps):
        CfnCustomerGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomerGatewayProps):
        software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps
  }
}
