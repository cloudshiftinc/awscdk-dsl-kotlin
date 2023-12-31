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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iot.CfnTopicRuleDestination

/**
 * The properties of a virtual private cloud (VPC) destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * VpcDestinationPropertiesProperty vpcDestinationPropertiesProperty =
 * VpcDestinationPropertiesProperty.builder()
 * .roleArn("roleArn")
 * .securityGroups(List.of("securityGroups"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicruledestination-vpcdestinationproperties.html)
 */
@CdkDslMarker
public class CfnTopicRuleDestinationVpcDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder =
        CfnTopicRuleDestination.VpcDestinationPropertiesProperty.builder()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param roleArn The ARN of a role that has permission to create and attach to elastic network
     *   interfaces (ENIs).
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param securityGroups The security groups of the VPC destination. */
    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups of the VPC destination. */
    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param subnetIds The subnet IDs of the VPC destination. */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /** @param subnetIds The subnet IDs of the VPC destination. */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param vpcId The ID of the VPC. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnTopicRuleDestination.VpcDestinationPropertiesProperty {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
