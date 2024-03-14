package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayMulticastGroupSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrGroupMember(): IResolvable =
      unwrap(this).getAttrGroupMember().let(IResolvable::wrap)

  public open fun attrGroupSource(): IResolvable =
      unwrap(this).getAttrGroupSource().let(IResolvable::wrap)

  public open fun attrMemberType(): String = unwrap(this).getAttrMemberType()

  public open fun attrResourceId(): String = unwrap(this).getAttrResourceId()

  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  public open fun attrSourceType(): String = unwrap(this).getAttrSourceType()

  public open fun attrSubnetId(): String = unwrap(this).getAttrSubnetId()

  public open fun attrTransitGatewayAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayAttachmentId()

  public open fun groupIpAddress(): String = unwrap(this).getGroupIpAddress()

  public open fun groupIpAddress(`value`: String) {
    unwrap(this).setGroupIpAddress(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public open fun transitGatewayMulticastDomainId(): String =
      unwrap(this).getTransitGatewayMulticastDomainId()

  public open fun transitGatewayMulticastDomainId(`value`: String) {
    unwrap(this).setTransitGatewayMulticastDomainId(`value`)
  }

  public interface Builder {
    public fun groupIpAddress(groupIpAddress: String) {
    }

    public fun networkInterfaceId(networkInterfaceId: String) {
    }

    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource.Builder.create(scope,
        id)

    public override fun groupIpAddress(groupIpAddress: String) {
      cdkBuilder.groupIpAddress(groupIpAddress)
    }

    public override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayMulticastGroupSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayMulticastGroupSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource):
        CfnTransitGatewayMulticastGroupSource = CfnTransitGatewayMulticastGroupSource(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastGroupSource):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource =
        wrapped.cdkObject
  }
}
