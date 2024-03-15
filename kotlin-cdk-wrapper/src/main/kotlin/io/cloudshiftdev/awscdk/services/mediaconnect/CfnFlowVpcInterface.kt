@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlowVpcInterface internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrNetworkInterfaceIds(): List<String> =
      unwrap(this).getAttrNetworkInterfaceIds()

  public open fun flowArn(): String = unwrap(this).getFlowArn()

  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun flowArn(flowArn: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface.Builder.create(scope, id)

    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowVpcInterface {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowVpcInterface(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface):
        CfnFlowVpcInterface = CfnFlowVpcInterface(cdkObject)

    internal fun unwrap(wrapped: CfnFlowVpcInterface):
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface = wrapped.cdkObject
  }
}
