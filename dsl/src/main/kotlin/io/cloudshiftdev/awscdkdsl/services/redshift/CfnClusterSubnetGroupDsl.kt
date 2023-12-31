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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.redshift.CfnClusterSubnetGroup
import software.constructs.Construct

/**
 * Specifies an Amazon Redshift subnet group.
 *
 * You must provide a list of one or more subnets in your existing Amazon Virtual Private Cloud (
 * Amazon VPC ) when creating Amazon Redshift subnet group.
 *
 * For information about subnet groups, go to
 * [Amazon Redshift Cluster Subnet Groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-cluster-subnet-groups.html)
 * in the *Amazon Redshift Cluster Management Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterSubnetGroup cfnClusterSubnetGroup = CfnClusterSubnetGroup.Builder.create(this,
 * "MyCfnClusterSubnetGroup")
 * .description("description")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html)
 */
@CdkDslMarker
public class CfnClusterSubnetGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnClusterSubnetGroup.Builder =
        CfnClusterSubnetGroup.Builder.create(scope, id)

    private val _subnetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the subnet group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-description)
     *
     * @param description A description for the subnet group.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An array of VPC subnet IDs.
     *
     * A maximum of 20 subnets can be modified in a single request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
     *
     * @param subnetIds An array of VPC subnet IDs.
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * An array of VPC subnet IDs.
     *
     * A maximum of 20 subnets can be modified in a single request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-subnetids)
     *
     * @param subnetIds An array of VPC subnet IDs.
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
     *
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     *   subnet group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies an arbitrary set of tags (key–value pairs) to associate with this subnet group.
     *
     * Use tags to manage your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersubnetgroup.html#cfn-redshift-clustersubnetgroup-tags)
     *
     * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
     *   subnet group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnClusterSubnetGroup {
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
