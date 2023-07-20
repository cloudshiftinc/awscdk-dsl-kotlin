@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions
import software.amazon.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class InterfaceVpcEndpointOptionsDsl {
    private val cdkBuilder: InterfaceVpcEndpointOptions.Builder =
        InterfaceVpcEndpointOptions.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
        cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
    }

    public fun `open`(`open`: Boolean) {
        cdkBuilder.`open`(`open`)
    }

    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
        cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun service(service: IInterfaceVpcEndpointService) {
        cdkBuilder.service(service)
    }

    public fun subnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.subnets(builder.build())
    }

    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    public fun build(): InterfaceVpcEndpointOptions {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
