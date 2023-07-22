@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInterfaceProps

/**
 * Properties for defining a `CfnNetworkInterface`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNetworkInterfaceProps cfnNetworkInterfaceProps = CfnNetworkInterfaceProps.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .description("description")
 * .enablePrimaryIpv6(false)
 * .groupSet(List.of("groupSet"))
 * .interfaceType("interfaceType")
 * .ipv6AddressCount(123)
 * .ipv6Addresses(List.of(InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build()))
 * .privateIpAddress("privateIpAddress")
 * .privateIpAddresses(List.of(PrivateIpAddressSpecificationProperty.builder()
 * .primary(false)
 * .privateIpAddress("privateIpAddress")
 * .build()))
 * .secondaryPrivateIpAddressCount(123)
 * .sourceDestCheck(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-networkinterface.html)
 */
@CdkDslMarker
public class CfnNetworkInterfacePropsDsl {
  private val cdkBuilder: CfnNetworkInterfaceProps.Builder = CfnNetworkInterfaceProps.builder()

  private val _groupSet: MutableList<String> = mutableListOf()

  private val _ipv6Addresses: MutableList<Any> = mutableListOf()

  private val _privateIpAddresses: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description for the network interface.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param enablePrimaryIpv6 If you have instances or ENIs that rely on the IPv6 address not
   * changing, to avoid disrupting traffic to instances or ENIs, you can enable a primary IPv6 address.
   * Enable this option to automatically assign an IPv6 associated with the ENI attached to your
   * instance to be the primary IPv6 address. When you enable an IPv6 address to be a primary IPv6, you
   * cannot disable it. Traffic will be routed to the primary IPv6 address until the instance is
   * terminated or the ENI is detached. If you have multiple IPv6 addresses associated with an ENI and
   * you enable a primary IPv6 address, the first IPv6 address associated with the ENI becomes the
   * primary IPv6 address.
   */
  public fun enablePrimaryIpv6(enablePrimaryIpv6: Boolean) {
    cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6)
  }

  /**
   * @param enablePrimaryIpv6 If you have instances or ENIs that rely on the IPv6 address not
   * changing, to avoid disrupting traffic to instances or ENIs, you can enable a primary IPv6 address.
   * Enable this option to automatically assign an IPv6 associated with the ENI attached to your
   * instance to be the primary IPv6 address. When you enable an IPv6 address to be a primary IPv6, you
   * cannot disable it. Traffic will be routed to the primary IPv6 address until the instance is
   * terminated or the ENI is detached. If you have multiple IPv6 addresses associated with an ENI and
   * you enable a primary IPv6 address, the first IPv6 address associated with the ENI becomes the
   * primary IPv6 address.
   */
  public fun enablePrimaryIpv6(enablePrimaryIpv6: IResolvable) {
    cdkBuilder.enablePrimaryIpv6(enablePrimaryIpv6)
  }

  /**
   * @param groupSet The security group IDs associated with this network interface.
   */
  public fun groupSet(vararg groupSet: String) {
    _groupSet.addAll(listOf(*groupSet))
  }

  /**
   * @param groupSet The security group IDs associated with this network interface.
   */
  public fun groupSet(groupSet: Collection<String>) {
    _groupSet.addAll(groupSet)
  }

  /**
   * @param interfaceType The type of network interface.
   * The default is `interface` . The supported values are `efa` and `trunk` .
   */
  public fun interfaceType(interfaceType: String) {
    cdkBuilder.interfaceType(interfaceType)
  }

  /**
   * @param ipv6AddressCount The number of IPv6 addresses to assign to a network interface.
   * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. To specify specific
   * IPv6 addresses, use the `Ipv6Addresses` property and don't specify this property.
   */
  public fun ipv6AddressCount(ipv6AddressCount: Number) {
    cdkBuilder.ipv6AddressCount(ipv6AddressCount)
  }

  /**
   * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of your
   * subnet to associate with the network interface.
   * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and don't
   * specify this property.
   */
  public fun ipv6Addresses(vararg ipv6Addresses: Any) {
    _ipv6Addresses.addAll(listOf(*ipv6Addresses))
  }

  /**
   * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of your
   * subnet to associate with the network interface.
   * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and don't
   * specify this property.
   */
  public fun ipv6Addresses(ipv6Addresses: Collection<Any>) {
    _ipv6Addresses.addAll(ipv6Addresses)
  }

  /**
   * @param ipv6Addresses One or more specific IPv6 addresses from the IPv6 CIDR block range of your
   * subnet to associate with the network interface.
   * If you're specifying a number of IPv6 addresses, use the `Ipv6AddressCount` property and don't
   * specify this property.
   */
  public fun ipv6Addresses(ipv6Addresses: IResolvable) {
    cdkBuilder.ipv6Addresses(ipv6Addresses)
  }

  /**
   * @param privateIpAddress Assigns a single private IP address to the network interface, which is
   * used as the primary private IP address.
   * If you want to specify multiple private IP address, use the `PrivateIpAddresses` property.
   */
  public fun privateIpAddress(privateIpAddress: String) {
    cdkBuilder.privateIpAddress(privateIpAddress)
  }

  /**
   * @param privateIpAddresses Assigns private IP addresses to the network interface.
   * You can specify a primary private IP address by setting the value of the `Primary` property to
   * `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically assign
   * private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not specify this
   * property.
   */
  public fun privateIpAddresses(vararg privateIpAddresses: Any) {
    _privateIpAddresses.addAll(listOf(*privateIpAddresses))
  }

  /**
   * @param privateIpAddresses Assigns private IP addresses to the network interface.
   * You can specify a primary private IP address by setting the value of the `Primary` property to
   * `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically assign
   * private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not specify this
   * property.
   */
  public fun privateIpAddresses(privateIpAddresses: Collection<Any>) {
    _privateIpAddresses.addAll(privateIpAddresses)
  }

  /**
   * @param privateIpAddresses Assigns private IP addresses to the network interface.
   * You can specify a primary private IP address by setting the value of the `Primary` property to
   * `true` in the `PrivateIpAddressSpecification` property. If you want EC2 to automatically assign
   * private IP addresses, use the `SecondaryPrivateIpAddressCount` property and do not specify this
   * property.
   */
  public fun privateIpAddresses(privateIpAddresses: IResolvable) {
    cdkBuilder.privateIpAddresses(privateIpAddresses)
  }

  /**
   * @param secondaryPrivateIpAddressCount The number of secondary private IPv4 addresses to assign
   * to a network interface.
   * When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses
   * within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one
   * private IP address using `privateIpAddresses` .
   *
   * You can't specify a count of private IPv4 addresses if you've specified one of the following:
   * specific private IPv4 addresses, specific IPv4 prefixes, or a count of IPv4 prefixes.
   */
  public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
    cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
  }

  /**
   * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
   * instance is either the source or the destination of any traffic that it receives.
   * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
   * The default value is `true` . You must disable source/destination checks if the instance runs
   * services such as network address translation, routing, or firewalls.
   */
  public fun sourceDestCheck(sourceDestCheck: Boolean) {
    cdkBuilder.sourceDestCheck(sourceDestCheck)
  }

  /**
   * @param sourceDestCheck Enable or disable source/destination checks, which ensure that the
   * instance is either the source or the destination of any traffic that it receives.
   * If the value is `true` , source/destination checks are enabled; otherwise, they are disabled.
   * The default value is `true` . You must disable source/destination checks if the instance runs
   * services such as network address translation, routing, or firewalls.
   */
  public fun sourceDestCheck(sourceDestCheck: IResolvable) {
    cdkBuilder.sourceDestCheck(sourceDestCheck)
  }

  /**
   * @param subnetId The ID of the subnet to associate with the network interface. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  /**
   * @param tags An arbitrary set of tags (key-value pairs) for this network interface.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An arbitrary set of tags (key-value pairs) for this network interface.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnNetworkInterfaceProps {
    if(_groupSet.isNotEmpty()) cdkBuilder.groupSet(_groupSet)
    if(_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
    if(_privateIpAddresses.isNotEmpty()) cdkBuilder.privateIpAddresses(_privateIpAddresses)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
