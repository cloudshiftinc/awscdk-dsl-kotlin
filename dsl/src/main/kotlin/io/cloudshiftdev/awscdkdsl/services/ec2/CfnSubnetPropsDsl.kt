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
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSubnetProps

/**
 * Properties for defining a `CfnSubnet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Object privateDnsNameOptionsOnLaunch;
 * CfnSubnetProps cfnSubnetProps = CfnSubnetProps.builder()
 * .vpcId("vpcId")
 * // the properties below are optional
 * .assignIpv6AddressOnCreation(false)
 * .availabilityZone("availabilityZone")
 * .availabilityZoneId("availabilityZoneId")
 * .cidrBlock("cidrBlock")
 * .enableDns64(false)
 * .ipv4IpamPoolId("ipv4IpamPoolId")
 * .ipv4NetmaskLength(123)
 * .ipv6CidrBlock("ipv6CidrBlock")
 * .ipv6CidrBlocks(List.of("ipv6CidrBlocks"))
 * .ipv6IpamPoolId("ipv6IpamPoolId")
 * .ipv6Native(false)
 * .ipv6NetmaskLength(123)
 * .mapPublicIpOnLaunch(false)
 * .outpostArn("outpostArn")
 * .privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-subnet.html)
 */
@CdkDslMarker
public class CfnSubnetPropsDsl {
    private val cdkBuilder: CfnSubnetProps.Builder = CfnSubnetProps.builder()

    private val _ipv6CidrBlocks: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     *   subnet receives an IPv6 address. The default value is `false` . If you specify
     *   `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
        cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * @param assignIpv6AddressOnCreation Indicates whether a network interface created in this
     *   subnet receives an IPv6 address. The default value is `false` . If you specify
     *   `AssignIpv6AddressOnCreation` , you must also specify an IPv6 CIDR block.
     */
    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable) {
        cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    /**
     * @param availabilityZone The Availability Zone of the subnet. If you update this property, you
     *   must also update the `CidrBlock` property.
     */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param availabilityZoneId The AZ ID of the subnet. */
    public fun availabilityZoneId(availabilityZoneId: String) {
        cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    /**
     * @param cidrBlock The IPv4 CIDR block assigned to the subnet. If you update this property, we
     *   create a new subnet, and then delete the existing one.
     */
    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    /**
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     *   this subnet should return synthetic IPv6 addresses for IPv4-only destinations. For more
     *   information, see
     *   [DNS64 and NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     *   in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun enableDns64(enableDns64: Boolean) {
        cdkBuilder.enableDns64(enableDns64)
    }

    /**
     * @param enableDns64 Indicates whether DNS queries made to the Amazon-provided DNS Resolver in
     *   this subnet should return synthetic IPv6 addresses for IPv4-only destinations. For more
     *   information, see
     *   [DNS64 and NAT64](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-nat64-dns64)
     *   in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun enableDns64(enableDns64: IResolvable) {
        cdkBuilder.enableDns64(enableDns64)
    }

    /** @param ipv4IpamPoolId An IPv4 IPAM pool ID for the subnet. */
    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
        cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    /** @param ipv4NetmaskLength An IPv4 netmask length for the subnet. */
    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
        cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    /**
     * @param ipv6CidrBlock The IPv6 CIDR block. If you specify `AssignIpv6AddressOnCreation` , you
     *   must also specify an IPv6 CIDR block.
     */
    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    /** @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation. */
    public fun ipv6CidrBlocks(vararg ipv6CidrBlocks: String) {
        _ipv6CidrBlocks.addAll(listOf(*ipv6CidrBlocks))
    }

    /** @param ipv6CidrBlocks The IPv6 network ranges for the subnet, in CIDR notation. */
    public fun ipv6CidrBlocks(ipv6CidrBlocks: Collection<String>) {
        _ipv6CidrBlocks.addAll(ipv6CidrBlocks)
    }

    /** @param ipv6IpamPoolId An IPv6 IPAM pool ID for the subnet. */
    public fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
        cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    /**
     * @param ipv6Native Indicates whether this is an IPv6 only subnet. For more information, see
     *   [Subnet basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics)
     *   in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun ipv6Native(ipv6Native: Boolean) {
        cdkBuilder.ipv6Native(ipv6Native)
    }

    /**
     * @param ipv6Native Indicates whether this is an IPv6 only subnet. For more information, see
     *   [Subnet basics](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html#subnet-basics)
     *   in the *Amazon Virtual Private Cloud User Guide* .
     */
    public fun ipv6Native(ipv6Native: IResolvable) {
        cdkBuilder.ipv6Native(ipv6Native)
    }

    /** @param ipv6NetmaskLength An IPv6 netmask length for the subnet. */
    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
        cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    /**
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     *   public IPv4 address. The default value is `false` . AWS charges for all public IPv4
     *   addresses, including public IPv4 addresses associated with running instances and Elastic IP
     *   addresses. For more information, see the *Public IPv4 Address* tab on the
     *   [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /**
     * @param mapPublicIpOnLaunch Indicates whether instances launched in this subnet receive a
     *   public IPv4 address. The default value is `false` . AWS charges for all public IPv4
     *   addresses, including public IPv4 addresses associated with running instances and Elastic IP
     *   addresses. For more information, see the *Public IPv4 Address* tab on the
     *   [VPC pricing page](https://docs.aws.amazon.com/vpc/pricing/) .
     */
    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    /** @param outpostArn The Amazon Resource Name (ARN) of the Outpost. */
    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
     *   subnet and how DNS A and AAAA record queries to the instances should be handled. For more
     *   information, see
     *   [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Available options:
     * * EnableResourceNameDnsAAAARecord (true | false)
     * * EnableResourceNameDnsARecord (true | false)
     * * HostnameType (ip-name | resource-name)
     */
    public fun privateDnsNameOptionsOnLaunch(
        privateDnsNameOptionsOnLaunch: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(privateDnsNameOptionsOnLaunch)
        cdkBuilder.privateDnsNameOptionsOnLaunch(builder.map)
    }

    /**
     * @param privateDnsNameOptionsOnLaunch The hostname type for EC2 instances launched into this
     *   subnet and how DNS A and AAAA record queries to the instances should be handled. For more
     *   information, see
     *   [Amazon EC2 instance hostname types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-naming.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     *
     * Available options:
     * * EnableResourceNameDnsAAAARecord (true | false)
     * * EnableResourceNameDnsARecord (true | false)
     * * HostnameType (ip-name | resource-name)
     */
    public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
        cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
    }

    /** @param tags Any tags assigned to the subnet. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Any tags assigned to the subnet. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param vpcId The ID of the VPC the subnet is in. If you update this property, you must also
     *   update the `CidrBlock` property.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnSubnetProps {
        if (_ipv6CidrBlocks.isNotEmpty()) cdkBuilder.ipv6CidrBlocks(_ipv6CidrBlocks)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
