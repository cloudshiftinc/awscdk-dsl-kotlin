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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.PrivateSubnetAttributes

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PrivateSubnetAttributes privateSubnetAttributes = PrivateSubnetAttributes.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .ipv4CidrBlock("ipv4CidrBlock")
 * .routeTableId("routeTableId")
 * .build();
 * ```
 */
@CdkDslMarker
public class PrivateSubnetAttributesDsl {
    private val cdkBuilder: PrivateSubnetAttributes.Builder = PrivateSubnetAttributes.builder()

    /** @param availabilityZone The Availability Zone the subnet is located in. */
    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    /** @param ipv4CidrBlock The IPv4 CIDR block associated with the subnet. */
    public fun ipv4CidrBlock(ipv4CidrBlock: String) {
        cdkBuilder.ipv4CidrBlock(ipv4CidrBlock)
    }

    /** @param routeTableId The ID of the route table for this particular subnet. */
    public fun routeTableId(routeTableId: String) {
        cdkBuilder.routeTableId(routeTableId)
    }

    /** @param subnetId The subnetId for this particular subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): PrivateSubnetAttributes = cdkBuilder.build()
}
