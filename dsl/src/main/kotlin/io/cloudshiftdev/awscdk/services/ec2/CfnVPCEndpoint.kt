package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpoint,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The date and time the VPC endpoint was created.
   *
   * For example: `Fri Sep 28 23:34:36 UTC 2018.`
   */
  public open fun attrCreationTimestamp(): String = unwrap(this).getAttrCreationTimestamp()

  /**
   * (Interface endpoints) The DNS entries for the endpoint.
   *
   * Each entry is a combination of the hosted zone ID and the DNS name. The entries are ordered as
   * follows: regional public DNS, zonal public DNS, private DNS, and wildcard DNS. This order is not
   * enforced for AWS Marketplace services.
   *
   * The following is an example. In the first entry, the hosted zone ID is Z1HUB23UULQXV and the
   * DNS name is vpce-01abc23456de78f9g-12abccd3.ec2.us-east-1.vpce.amazonaws.com.
   *
   * ["Z1HUB23UULQXV:vpce-01abc23456de78f9g-12abccd3.ec2.us-east-1.vpce.amazonaws.com",
   * "Z1HUB23UULQXV:vpce-01abc23456de78f9g-12abccd3-us-east-1a.ec2.us-east-1.vpce.amazonaws.com",
   * "Z1C12344VYDITB0:ec2.us-east-1.amazonaws.com"]
   *
   * If you update the `PrivateDnsEnabled` or `SubnetIds` properties, the DNS entries in the list
   * will change.
   */
  public open fun attrDnsEntries(): List<String> = unwrap(this).getAttrDnsEntries()

  /**
   * The ID of the VPC endpoint.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * (Interface endpoints) The network interface IDs.
   *
   * If you update the `PrivateDnsEnabled` or `SubnetIds` properties, the items in this list might
   * change.
   */
  public open fun attrNetworkInterfaceIds(): List<String> =
      unwrap(this).getAttrNetworkInterfaceIds()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An endpoint policy, which controls access to the service from the VPC.
   */
  public open fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  /**
   * An endpoint policy, which controls access to the service from the VPC.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * Indicate whether to associate a private hosted zone with the specified VPC.
   */
  public open fun privateDnsEnabled(): Any? = unwrap(this).getPrivateDnsEnabled()

  /**
   * Indicate whether to associate a private hosted zone with the specified VPC.
   */
  public open fun privateDnsEnabled(`value`: Boolean) {
    unwrap(this).setPrivateDnsEnabled(`value`)
  }

  /**
   * Indicate whether to associate a private hosted zone with the specified VPC.
   */
  public open fun privateDnsEnabled(`value`: IResolvable) {
    unwrap(this).setPrivateDnsEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The IDs of the route tables.
   */
  public open fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

  /**
   * The IDs of the route tables.
   */
  public open fun routeTableIds(`value`: List<String>) {
    unwrap(this).setRouteTableIds(`value`)
  }

  /**
   * The IDs of the route tables.
   */
  public open fun routeTableIds(vararg `value`: String): Unit = routeTableIds(`value`.toList())

  /**
   * The IDs of the security groups to associate with the endpoint network interfaces.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of the security groups to associate with the endpoint network interfaces.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of the security groups to associate with the endpoint network interfaces.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The name of the endpoint service.
   */
  public open fun serviceName(): String = unwrap(this).getServiceName()

  /**
   * The name of the endpoint service.
   */
  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  /**
   * The IDs of the subnets in which to create endpoint network interfaces.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The IDs of the subnets in which to create endpoint network interfaces.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The IDs of the subnets in which to create endpoint network interfaces.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * The type of endpoint.
   */
  public open fun vpcEndpointType(): String? = unwrap(this).getVpcEndpointType()

  /**
   * The type of endpoint.
   */
  public open fun vpcEndpointType(`value`: String) {
    unwrap(this).setVpcEndpointType(`value`)
  }

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An endpoint policy, which controls access to the service from the VPC.
     *
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. AWS
     * CloudFormation converts YAML policies to JSON format before calling the API to create or modify
     * the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC. 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    public fun privateDnsEnabled(privateDnsEnabled: Boolean)

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    public fun privateDnsEnabled(privateDnsEnabled: IResolvable)

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    public fun routeTableIds(routeTableIds: List<String>)

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    public fun routeTableIds(vararg routeTableIds: String)

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The name of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
     * @param serviceName The name of the endpoint service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The type of endpoint.
     *
     * Default: Gateway
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
     * @param vpcEndpointType The type of endpoint. 
     */
    public fun vpcEndpointType(vpcEndpointType: String)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpoint.Builder.create(scope, id)

    /**
     * An endpoint policy, which controls access to the service from the VPC.
     *
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. AWS
     * CloudFormation converts YAML policies to JSON format before calling the API to create or modify
     * the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    override fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled.let(IResolvable::unwrap))
    }

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The name of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
     * @param serviceName The name of the endpoint service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The type of endpoint.
     *
     * Default: Gateway
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
     * @param vpcEndpointType The type of endpoint. 
     */
    override fun vpcEndpointType(vpcEndpointType: String) {
      cdkBuilder.vpcEndpointType(vpcEndpointType)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpoint): CfnVPCEndpoint
        = CfnVPCEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpoint): software.amazon.awscdk.services.ec2.CfnVPCEndpoint
        = wrapped.cdkObject
  }
}
