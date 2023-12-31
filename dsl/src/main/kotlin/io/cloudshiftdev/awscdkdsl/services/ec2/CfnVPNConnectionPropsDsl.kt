@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPNConnectionProps

/**
 * Properties for defining a `CfnVPNConnection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNConnectionProps cfnVPNConnectionProps = CfnVPNConnectionProps.builder()
 * .customerGatewayId("customerGatewayId")
 * .type("type")
 * // the properties below are optional
 * .staticRoutesOnly(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transitGatewayId("transitGatewayId")
 * .vpnGatewayId("vpnGatewayId")
 * .vpnTunnelOptionsSpecifications(List.of(VpnTunnelOptionsSpecificationProperty.builder()
 * .preSharedKey("preSharedKey")
 * .tunnelInsideCidr("tunnelInsideCidr")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html)
 */
@CdkDslMarker
public class CfnVPNConnectionPropsDsl {
    private val cdkBuilder: CfnVPNConnectionProps.Builder = CfnVPNConnectionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpnTunnelOptionsSpecifications: MutableList<Any> = mutableListOf()

    /**
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection.
     */
    public fun customerGatewayId(customerGatewayId: String) {
        cdkBuilder.customerGatewayId(customerGatewayId)
    }

    /**
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. Static
     *   routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     */
    public fun staticRoutesOnly(staticRoutesOnly: Boolean) {
        cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    /**
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only. Static
     *   routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     */
    public fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
        cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    /** @param tags Any tags assigned to the VPN connection. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Any tags assigned to the VPN connection. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection. You
     *   must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /** @param type The type of VPN connection. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     *   connection. You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    /** @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. */
    public fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any) {
        _vpnTunnelOptionsSpecifications.addAll(listOf(*vpnTunnelOptionsSpecifications))
    }

    /** @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: Collection<Any>) {
        _vpnTunnelOptionsSpecifications.addAll(vpnTunnelOptionsSpecifications)
    }

    /** @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection. */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
        cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications)
    }

    public fun build(): CfnVPNConnectionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpnTunnelOptionsSpecifications.isNotEmpty())
            cdkBuilder.vpnTunnelOptionsSpecifications(_vpnTunnelOptionsSpecifications)
        return cdkBuilder.build()
    }
}
