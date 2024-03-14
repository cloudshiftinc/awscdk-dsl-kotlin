package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLocalGatewayId(): String = unwrap(this).getAttrLocalGatewayId()

  public open fun attrLocalGatewayRouteTableArn(): String =
      unwrap(this).getAttrLocalGatewayRouteTableArn()

  public open fun attrLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(): String =
      unwrap(this).getAttrLocalGatewayRouteTableVirtualInterfaceGroupAssociationId()

  public open fun attrOwnerId(): String = unwrap(this).getAttrOwnerId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

  public open fun localGatewayRouteTableId(`value`: String) {
    unwrap(this).setLocalGatewayRouteTableId(`value`)
  }

  public open fun localGatewayVirtualInterfaceGroupId(): String =
      unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

  public open fun localGatewayVirtualInterfaceGroupId(`value`: String) {
    unwrap(this).setLocalGatewayVirtualInterfaceGroupId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
    }

    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder
        =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation.Builder.create(scope,
        id)

    public override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    public override
        fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
      cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
        = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation):
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation =
        CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVirtualInterfaceGroupAssociation
        = wrapped.cdkObject
  }
}
