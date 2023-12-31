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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps

/**
 * Properties for defining a `CfnTransitGatewayRouteTablePropagation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteTablePropagationProps cfnTransitGatewayRouteTablePropagationProps =
 * CfnTransitGatewayRouteTablePropagationProps.builder()
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayRouteTableId("transitGatewayRouteTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRouteTablePropagationPropsDsl {
    private val cdkBuilder: CfnTransitGatewayRouteTablePropagationProps.Builder =
        CfnTransitGatewayRouteTablePropagationProps.builder()

    /** @param transitGatewayAttachmentId The ID of the attachment. */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /** @param transitGatewayRouteTableId The ID of the propagation route table. */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
        cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): CfnTransitGatewayRouteTablePropagationProps = cdkBuilder.build()
}
