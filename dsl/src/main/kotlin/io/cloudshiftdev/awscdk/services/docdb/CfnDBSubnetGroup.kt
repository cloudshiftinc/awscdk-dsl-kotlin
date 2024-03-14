package io.cloudshiftdev.awscdk.services.docdb

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

public open class CfnDBSubnetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.CfnDBSubnetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun dbSubnetGroupDescription(): String = unwrap(this).getDbSubnetGroupDescription()

  public open fun dbSubnetGroupDescription(`value`: String) {
    unwrap(this).setDbSubnetGroupDescription(`value`)
  }

  public open fun dbSubnetGroupName(): String? = unwrap(this).getDbSubnetGroupName()

  public open fun dbSubnetGroupName(`value`: String) {
    unwrap(this).setDbSubnetGroupName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
    }

    public fun dbSubnetGroupName(dbSubnetGroupName: String) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBSubnetGroup.Builder =
        software.amazon.awscdk.services.docdb.CfnDBSubnetGroup.Builder.create(scope, id)

    public override fun dbSubnetGroupDescription(dbSubnetGroupDescription: String) {
      cdkBuilder.dbSubnetGroupDescription(dbSubnetGroupDescription)
    }

    public override fun dbSubnetGroupName(dbSubnetGroupName: String) {
      cdkBuilder.dbSubnetGroupName(dbSubnetGroupName)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBSubnetGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBSubnetGroup):
        CfnDBSubnetGroup = CfnDBSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBSubnetGroup):
        software.amazon.awscdk.services.docdb.CfnDBSubnetGroup = wrapped.cdkObject
  }
}
