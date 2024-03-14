package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCreationTimestamp(): String = unwrap(this).getAttrCreationTimestamp()

  public open fun attrDnsEntries(): List<String> = unwrap(this).getAttrDnsEntries() ?: emptyList()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrNetworkInterfaceIds(): List<String> =
      unwrap(this).getAttrNetworkInterfaceIds() ?: emptyList()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun privateDnsEnabled(): Any? = unwrap(this).getPrivateDnsEnabled()

  public open fun privateDnsEnabled(`value`: Boolean) {
    unwrap(this).setPrivateDnsEnabled(`value`)
  }

  public open fun privateDnsEnabled(`value`: IResolvable) {
    unwrap(this).setPrivateDnsEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

  public open fun routeTableIds(`value`: List<String>) {
    unwrap(this).setRouteTableIds(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun serviceName(): String = unwrap(this).getServiceName()

  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public open fun vpcEndpointType(): String? = unwrap(this).getVpcEndpointType()

  public open fun vpcEndpointType(`value`: String) {
    unwrap(this).setVpcEndpointType(`value`)
  }

  public open fun vpcId(): String = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public interface Builder {
    public fun policyDocument(policyDocument: Any) {
    }

    public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
    }

    public fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
    }

    public fun routeTableIds(routeTableIds: List<String>) {
    }

    public fun securityGroupIds(securityGroupIds: List<String>) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun vpcEndpointType(vpcEndpointType: String) {
    }

    public fun vpcId(vpcId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpoint.Builder.create(scope, id)

    public override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    public override fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled.let(IResolvable::unwrap))
    }

    public override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    public override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun vpcEndpointType(vpcEndpointType: String) {
      cdkBuilder.vpcEndpointType(vpcEndpointType)
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpoint = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
