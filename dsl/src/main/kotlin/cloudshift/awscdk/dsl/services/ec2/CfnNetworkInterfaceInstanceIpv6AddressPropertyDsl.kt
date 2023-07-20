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
import software.amazon.awscdk.services.ec2.CfnNetworkInterface
import kotlin.String

@CdkDslMarker
public class CfnNetworkInterfaceInstanceIpv6AddressPropertyDsl {
    private val cdkBuilder: CfnNetworkInterface.InstanceIpv6AddressProperty.Builder =
        CfnNetworkInterface.InstanceIpv6AddressProperty.builder()

    public fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
    }

    public fun build(): CfnNetworkInterface.InstanceIpv6AddressProperty = cdkBuilder.build()
}
