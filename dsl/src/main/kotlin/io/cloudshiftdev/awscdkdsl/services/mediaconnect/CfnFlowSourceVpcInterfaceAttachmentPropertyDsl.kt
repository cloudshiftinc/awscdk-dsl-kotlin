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

package io.cloudshiftdev.awscdkdsl.services.mediaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlowSource

/**
 * The VPC interface that you want to send your output to.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * VpcInterfaceAttachmentProperty vpcInterfaceAttachmentProperty =
 * VpcInterfaceAttachmentProperty.builder()
 * .vpcInterfaceName("vpcInterfaceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconnect-flowsource-vpcinterfaceattachment.html)
 */
@CdkDslMarker
public class CfnFlowSourceVpcInterfaceAttachmentPropertyDsl {
    private val cdkBuilder: CfnFlowSource.VpcInterfaceAttachmentProperty.Builder =
        CfnFlowSource.VpcInterfaceAttachmentProperty.builder()

    /**
     * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
     */
    public fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    public fun build(): CfnFlowSource.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
