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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancingv2.IpAddressType
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps

/**
 * Properties for a network load balancer.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * Vpc vpc = new Vpc(this, "VPC");
 * NetworkLoadBalancer nlb = NetworkLoadBalancer.Builder.create(this, "NLB")
 * .vpc(vpc)
 * .build();
 * VpcLink link = VpcLink.Builder.create(this, "link")
 * .targets(List.of(nlb))
 * .build();
 * Integration integration = Integration.Builder.create()
 * .type(IntegrationType.HTTP_PROXY)
 * .integrationHttpMethod("ANY")
 * .options(IntegrationOptions.builder()
 * .connectionType(ConnectionType.VPC_LINK)
 * .vpcLink(link)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkLoadBalancerPropsDsl {
    private val cdkBuilder: NetworkLoadBalancerProps.Builder = NetworkLoadBalancerProps.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /** @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled. */
    public fun crossZoneEnabled(crossZoneEnabled: Boolean) {
        cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    /** @param deletionProtection Indicates whether deletion protection is enabled. */
    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    /** @param internetFacing Whether the load balancer has an internet-routable address. */
    public fun internetFacing(internetFacing: Boolean) {
        cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * @param ipAddressType The type of IP addresses to use. If you want to add a UDP or TCP_UDP
     *   listener to the load balancer, you must choose IPv4.
     */
    public fun ipAddressType(ipAddressType: IpAddressType) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /** @param loadBalancerName Name of the load balancer. */
    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /** @param securityGroups Security groups to associate with this load balancer. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups Security groups to associate with this load balancer. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param vpc The VPC network to place the load balancer in. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /** @param vpcSubnets Which subnets place the load balancer in. */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(vpcSubnets)
        cdkBuilder.vpcSubnets(builder.build())
    }

    /** @param vpcSubnets Which subnets place the load balancer in. */
    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): NetworkLoadBalancerProps {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
