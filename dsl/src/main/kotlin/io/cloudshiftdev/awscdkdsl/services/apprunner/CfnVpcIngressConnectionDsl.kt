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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.constructs.Construct

/**
 * Specify an AWS App Runner VPC Ingress Connection by using the
 * `AWS::AppRunner::VpcIngressConnection` resource in an AWS CloudFormation template.
 *
 * The `AWS::AppRunner::VpcIngressConnection` resource is an AWS App Runner resource type that
 * specifies an App Runner VPC Ingress Connection.
 *
 * App Runner requires this resource when you want to associate your App Runner service to an Amazon
 * VPC endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * CfnVpcIngressConnection cfnVpcIngressConnection = CfnVpcIngressConnection.Builder.create(this,
 * "MyCfnVpcIngressConnection")
 * .ingressVpcConfiguration(IngressVpcConfigurationProperty.builder()
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build())
 * .serviceArn("serviceArn")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcIngressConnectionName("vpcIngressConnectionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html)
 */
@CdkDslMarker
public class CfnVpcIngressConnectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVpcIngressConnection.Builder =
        CfnVpcIngressConnection.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     *
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     *   AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource.
     */
    public fun ingressVpcConfiguration(ingressVpcConfiguration: IResolvable) {
        cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration)
    }

    /**
     * Specifications for the customer’s Amazon VPC and the related AWS PrivateLink VPC endpoint
     * that are used to create the VPC Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-ingressvpcconfiguration)
     *
     * @param ingressVpcConfiguration Specifications for the customer’s Amazon VPC and the related
     *   AWS PrivateLink VPC endpoint that are used to create the VPC Ingress Connection resource.
     */
    public fun ingressVpcConfiguration(
        ingressVpcConfiguration: CfnVpcIngressConnection.IngressVpcConfigurationProperty
    ) {
        cdkBuilder.ingressVpcConfiguration(ingressVpcConfiguration)
    }

    /**
     * The Amazon Resource Name (ARN) for this App Runner service that is used to create the VPC
     * Ingress Connection resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-servicearn)
     *
     * @param serviceArn The Amazon Resource Name (ARN) for this App Runner service that is used to
     *   create the VPC Ingress Connection resource.
     */
    public fun serviceArn(serviceArn: String) {
        cdkBuilder.serviceArn(serviceArn)
    }

    /**
     * An optional list of metadata items that you can associate with the VPC Ingress Connection
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
     *
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     *   Connection resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An optional list of metadata items that you can associate with the VPC Ingress Connection
     * resource.
     *
     * A tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-tags)
     *
     * @param tags An optional list of metadata items that you can associate with the VPC Ingress
     *   Connection resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The customer-provided VPC Ingress Connection name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apprunner-vpcingressconnection.html#cfn-apprunner-vpcingressconnection-vpcingressconnectionname)
     *
     * @param vpcIngressConnectionName The customer-provided VPC Ingress Connection name.
     */
    public fun vpcIngressConnectionName(vpcIngressConnectionName: String) {
        cdkBuilder.vpcIngressConnectionName(vpcIngressConnectionName)
    }

    public fun build(): CfnVpcIngressConnection {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
