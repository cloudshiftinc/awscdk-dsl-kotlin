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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps

/**
 * Properties for defining a `CfnServiceNetworkVpcAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnServiceNetworkVpcAssociationProps cfnServiceNetworkVpcAssociationProps =
 * CfnServiceNetworkVpcAssociationProps.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .serviceNetworkIdentifier("serviceNetworkIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcIdentifier("vpcIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetworkvpcassociation.html)
 */
@CdkDslMarker
public class CfnServiceNetworkVpcAssociationPropsDsl {
    private val cdkBuilder: CfnServiceNetworkVpcAssociationProps.Builder =
        CfnServiceNetworkVpcAssociationProps.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param securityGroupIds The IDs of the security groups. Security groups aren't added by
     *   default. You can add a security group to apply network level controls to control which
     *   resources in a VPC are allowed to access the service network and its services. For more
     *   information, see
     *   [Control traffic to resources using security groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html)
     *   in the *Amazon VPC User Guide* .
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds The IDs of the security groups. Security groups aren't added by
     *   default. You can add a security group to apply network level controls to control which
     *   resources in a VPC are allowed to access the service network and its services. For more
     *   information, see
     *   [Control traffic to resources using security groups](https://docs.aws.amazon.com//vpc/latest/userguide/VPC_SecurityGroups.html)
     *   in the *Amazon VPC User Guide* .
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param serviceNetworkIdentifier The ID or Amazon Resource Name (ARN) of the service network.
     *   You must use the ARN when the resources specified in the operation are in different
     *   accounts.
     */
    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
        cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    /** @param tags The tags for the association. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the association. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param vpcIdentifier The ID of the VPC. */
    public fun vpcIdentifier(vpcIdentifier: String) {
        cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build(): CfnServiceNetworkVpcAssociationProps {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
