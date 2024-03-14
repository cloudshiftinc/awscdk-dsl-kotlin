package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetRouteTableAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun routeTableId(): String = unwrap(this).getRouteTableId()

  public open fun routeTableId(`value`: String) {
    unwrap(this).setRouteTableId(`value`)
  }

  public open fun subnetId(): String = unwrap(this).getSubnetId()

  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  public interface Builder {
    public fun routeTableId(routeTableId: String) {
    }

    public fun subnetId(subnetId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation.Builder.create(scope, id)

    public override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetRouteTableAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetRouteTableAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation):
        CfnSubnetRouteTableAssociation = CfnSubnetRouteTableAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetRouteTableAssociation):
        software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation = wrapped.cdkObject
  }
}
