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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps

/**
 * Properties for defining a `CfnTransitGatewayMulticastDomainAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayMulticastDomainAssociationProps cfnTransitGatewayMulticastDomainAssociationProps
 * = CfnTransitGatewayMulticastDomainAssociationProps.builder()
 * .subnetId("subnetId")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html)
 */
@CdkDslMarker
public class CfnTransitGatewayMulticastDomainAssociationPropsDsl {
    private val cdkBuilder: CfnTransitGatewayMulticastDomainAssociationProps.Builder =
        CfnTransitGatewayMulticastDomainAssociationProps.builder()

    /**
     * @param subnetId The IDs of the subnets to associate with the transit gateway multicast
     *   domain.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /** @param transitGatewayAttachmentId The ID of the transit gateway attachment. */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /** @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
        cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): CfnTransitGatewayMulticastDomainAssociationProps = cdkBuilder.build()
}
