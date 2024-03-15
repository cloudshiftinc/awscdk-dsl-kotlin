@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetNetworkAclAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkAclId(): String = unwrap(this).getNetworkAclId()

  public open fun networkAclId(`value`: String) {
    unwrap(this).setNetworkAclId(`value`)
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun networkAclId(networkAclId: String)

    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.Builder.create(scope, id)

    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetNetworkAclAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetNetworkAclAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation):
        CfnSubnetNetworkAclAssociation = CfnSubnetNetworkAclAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetNetworkAclAssociation):
        software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation = wrapped.cdkObject
  }
}
