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

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation
import software.constructs.Construct

/**
 * A self-service action association consisting of the Action ID, the Product ID, and the
 * Provisioning Artifact ID.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CfnServiceActionAssociation cfnServiceActionAssociation =
 * CfnServiceActionAssociation.Builder.create(this, "MyCfnServiceActionAssociation")
 * .productId("productId")
 * .provisioningArtifactId("provisioningArtifactId")
 * .serviceActionId("serviceActionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html)
 */
@CdkDslMarker
public class CfnServiceActionAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServiceActionAssociation.Builder =
        CfnServiceActionAssociation.Builder.create(scope, id)

    /**
     * The product identifier.
     *
     * For example, `prod-abcdzk7xy33qa` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-productid)
     *
     * @param productId The product identifier.
     */
    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    /**
     * The identifier of the provisioning artifact.
     *
     * For example, `pa-4abcdjnxjj6ne` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-provisioningartifactid)
     *
     * @param provisioningArtifactId The identifier of the provisioning artifact.
     */
    public fun provisioningArtifactId(provisioningArtifactId: String) {
        cdkBuilder.provisioningArtifactId(provisioningArtifactId)
    }

    /**
     * The self-service action identifier.
     *
     * For example, `act-fs7abcd89wxyz` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html#cfn-servicecatalog-serviceactionassociation-serviceactionid)
     *
     * @param serviceActionId The self-service action identifier.
     */
    public fun serviceActionId(serviceActionId: String) {
        cdkBuilder.serviceActionId(serviceActionId)
    }

    public fun build(): CfnServiceActionAssociation = cdkBuilder.build()
}
