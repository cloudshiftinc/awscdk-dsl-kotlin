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
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointOptions
import software.amazon.awscdk.services.ec2.SubnetSelection

/**
 * Options to add an interface endpoint to a VPC.
 *
 * Example:
 * ```
 * // Add gateway endpoints when creating the VPC
 * Vpc vpc = Vpc.Builder.create(this, "MyVpc")
 * .gatewayEndpoints(Map.of(
 * "S3", GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.S3)
 * .build()))
 * .build();
 * // Alternatively gateway endpoints can be added on the VPC
 * GatewayVpcEndpoint dynamoDbEndpoint = vpc.addGatewayEndpoint("DynamoDbEndpoint",
 * GatewayVpcEndpointOptions.builder()
 * .service(GatewayVpcEndpointAwsService.DYNAMODB)
 * .build());
 * // This allows to customize the endpoint policy
 * dynamoDbEndpoint.addToPolicy(
 * PolicyStatement.Builder.create() // Restrict to listing and describing tables
 * .principals(List.of(new AnyPrincipal()))
 * .actions(List.of("dynamodb:DescribeTable", "dynamodb:ListTables"))
 * .resources(List.of("*")).build());
 * // Add an interface endpoint
 * vpc.addInterfaceEndpoint("EcrDockerEndpoint", InterfaceVpcEndpointOptions.builder()
 * .service(InterfaceVpcEndpointAwsService.ECR_DOCKER)
 * .build());
 * ```
 */
@CdkDslMarker
public class InterfaceVpcEndpointOptionsDsl {
    private val cdkBuilder: InterfaceVpcEndpointOptions.Builder =
        InterfaceVpcEndpointOptions.builder()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param lookupSupportedAzs Limit to only those availability zones where the endpoint service
     *   can be created. Setting this to 'true' requires a lookup to be performed at synthesis time.
     *   Account and region must be set on the containing stack for this to work.
     */
    public fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
        cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
    }

    /**
     * @param open Whether to automatically allow VPC traffic to the endpoint. If enabled, all
     *   traffic to the endpoint from within the VPC will be automatically allowed. This is done
     *   based on the VPC's CIDR range.
     */
    public fun `open`(`open`: Boolean) {
        cdkBuilder.`open`(`open`)
    }

    /**
     * @param privateDnsEnabled Whether to associate a private hosted zone with the specified VPC.
     *   This allows you to make requests to the service using its default DNS hostname.
     */
    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
        cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /** @param securityGroups The security groups to associate with this interface VPC endpoint. */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /** @param securityGroups The security groups to associate with this interface VPC endpoint. */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param service The service to use for this interface VPC endpoint. */
    public fun service(service: IInterfaceVpcEndpointService) {
        cdkBuilder.service(service)
    }

    /**
     * @param subnets The subnets in which to create an endpoint network interface. At most one per
     *   availability zone.
     */
    public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnets)
        cdkBuilder.subnets(builder.build())
    }

    /**
     * @param subnets The subnets in which to create an endpoint network interface. At most one per
     *   availability zone.
     */
    public fun subnets(subnets: SubnetSelection) {
        cdkBuilder.subnets(subnets)
    }

    public fun build(): InterfaceVpcEndpointOptions {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
