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
import software.amazon.awscdk.services.ec2.AllocatedSubnet
import software.amazon.awscdk.services.ec2.SubnetIpamOptions
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class SubnetIpamOptionsDsl {
    private val cdkBuilder: SubnetIpamOptions.Builder = SubnetIpamOptions.builder()

    private val _allocatedSubnets: MutableList<AllocatedSubnet> = mutableListOf()

    public fun allocatedSubnets(allocatedSubnets: AllocatedSubnetDsl.() -> Unit) {
        _allocatedSubnets.add(AllocatedSubnetDsl().apply(allocatedSubnets).build())
    }

    public fun allocatedSubnets(allocatedSubnets: Collection<AllocatedSubnet>) {
        _allocatedSubnets.addAll(allocatedSubnets)
    }

    public fun build(): SubnetIpamOptions {
        if (_allocatedSubnets.isNotEmpty()) cdkBuilder.allocatedSubnets(_allocatedSubnets)
        return cdkBuilder.build()
    }
}
