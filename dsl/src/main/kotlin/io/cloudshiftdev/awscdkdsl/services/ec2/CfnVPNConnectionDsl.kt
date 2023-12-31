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
import software.amazon.awscdk.services.ec2.CfnVPNConnection
import software.constructs.Construct

/**
 * Specifies a VPN connection between a virtual private gateway and a VPN customer gateway or a
 * transit gateway and a VPN customer gateway.
 *
 * To specify a VPN connection between a transit gateway and customer gateway, use the
 * `TransitGatewayId` and `CustomerGatewayId` properties.
 *
 * To specify a VPN connection between a virtual private gateway and customer gateway, use the
 * `VpnGatewayId` and `CustomerGatewayId` properties.
 *
 * For more information, see
 * [AWS Site-to-Site VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the *AWS
 * Site-to-Site VPN User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPNConnection cfnVPNConnection = CfnVPNConnection.Builder.create(this, "MyCfnVPNConnection")
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
public class CfnVPNConnectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPNConnection.Builder = CfnVPNConnection.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _vpnTunnelOptionsSpecifications: MutableList<Any> = mutableListOf()

    /**
     * The ID of the customer gateway at your end of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-customergatewayid)
     *
     * @param customerGatewayId The ID of the customer gateway at your end of the VPN connection.
     */
    public fun customerGatewayId(customerGatewayId: String) {
        cdkBuilder.customerGatewayId(customerGatewayId)
    }

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     *
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only.
     */
    public fun staticRoutesOnly(staticRoutesOnly: Boolean) {
        cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    /**
     * Indicates whether the VPN connection uses static routes only.
     *
     * Static routes must be used for devices that don't support BGP.
     *
     * If you are creating a VPN connection for a device that does not support Border Gateway
     * Protocol (BGP), you must specify `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-staticroutesonly)
     *
     * @param staticRoutesOnly Indicates whether the VPN connection uses static routes only.
     */
    public fun staticRoutesOnly(staticRoutesOnly: IResolvable) {
        cdkBuilder.staticRoutesOnly(staticRoutesOnly)
    }

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     *
     * @param tags Any tags assigned to the VPN connection.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Any tags assigned to the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-tags)
     *
     * @param tags Any tags assigned to the VPN connection.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ID of the transit gateway associated with the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-transitgatewayid)
     *
     * @param transitGatewayId The ID of the transit gateway associated with the VPN connection.
     */
    public fun transitGatewayId(transitGatewayId: String) {
        cdkBuilder.transitGatewayId(transitGatewayId)
    }

    /**
     * The type of VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-type)
     *
     * @param type The type of VPN connection.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * The ID of the virtual private gateway at the AWS side of the VPN connection.
     *
     * You must specify either `TransitGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpngatewayid)
     *
     * @param vpnGatewayId The ID of the virtual private gateway at the AWS side of the VPN
     *   connection.
     */
    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     *
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    public fun vpnTunnelOptionsSpecifications(vararg vpnTunnelOptionsSpecifications: Any) {
        _vpnTunnelOptionsSpecifications.addAll(listOf(*vpnTunnelOptionsSpecifications))
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     *
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: Collection<Any>) {
        _vpnTunnelOptionsSpecifications.addAll(vpnTunnelOptionsSpecifications)
    }

    /**
     * The tunnel options for the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnection.html#cfn-ec2-vpnconnection-vpntunneloptionsspecifications)
     *
     * @param vpnTunnelOptionsSpecifications The tunnel options for the VPN connection.
     */
    public fun vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications: IResolvable) {
        cdkBuilder.vpnTunnelOptionsSpecifications(vpnTunnelOptionsSpecifications)
    }

    public fun build(): CfnVPNConnection {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_vpnTunnelOptionsSpecifications.isNotEmpty())
            cdkBuilder.vpnTunnelOptionsSpecifications(_vpnTunnelOptionsSpecifications)
        return cdkBuilder.build()
    }
}
