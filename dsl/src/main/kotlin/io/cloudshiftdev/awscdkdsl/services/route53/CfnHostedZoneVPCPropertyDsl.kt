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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53.CfnHostedZone

/**
 * *Private hosted zones only:* A complex type that contains information about an Amazon VPC.
 *
 * Route 53 Resolver uses the records in the private hosted zone to route traffic in that VPC.
 *
 * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53.*;
 * VPCProperty vPCProperty = VPCProperty.builder()
 * .vpcId("vpcId")
 * .vpcRegion("vpcRegion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-vpc.html)
 */
@CdkDslMarker
public class CfnHostedZoneVPCPropertyDsl {
    private val cdkBuilder: CfnHostedZone.VPCProperty.Builder = CfnHostedZone.VPCProperty.builder()

    /**
     * @param vpcId *Private hosted zones only:* The ID of an Amazon VPC.
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpcRegion *Private hosted zones only:* The region that an Amazon VPC was created in.
     *
     * For public hosted zones, omit `VPCs` , `VPCId` , and `VPCRegion` .
     */
    public fun vpcRegion(vpcRegion: String) {
        cdkBuilder.vpcRegion(vpcRegion)
    }

    public fun build(): CfnHostedZone.VPCProperty = cdkBuilder.build()
}
