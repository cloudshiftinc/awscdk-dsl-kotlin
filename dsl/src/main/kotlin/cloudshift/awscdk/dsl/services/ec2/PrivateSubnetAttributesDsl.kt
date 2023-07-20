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
import software.amazon.awscdk.services.ec2.PrivateSubnetAttributes
import kotlin.String

@CdkDslMarker
public class PrivateSubnetAttributesDsl {
    private val cdkBuilder: PrivateSubnetAttributes.Builder = PrivateSubnetAttributes.builder()

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun ipv4CidrBlock(ipv4CidrBlock: String) {
        cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
    }

    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): PrivateSubnetAttributes = cdkBuilder.build()
}
