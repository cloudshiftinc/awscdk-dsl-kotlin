package io.cloudshiftdev.awscdk.services.dms

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

public open class CfnReplicationSubnetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun replicationSubnetGroupDescription(): String =
      unwrap(this).getReplicationSubnetGroupDescription()

  public open fun replicationSubnetGroupDescription(`value`: String) {
    unwrap(this).setReplicationSubnetGroupDescription(`value`)
  }

  public open fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  public open fun replicationSubnetGroupIdentifier(`value`: String) {
    unwrap(this).setReplicationSubnetGroupIdentifier(`value`)
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
    public fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String)

    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup.Builder.create(scope, id)

    override fun replicationSubnetGroupDescription(replicationSubnetGroupDescription: String) {
      cdkBuilder.replicationSubnetGroupDescription(replicationSubnetGroupDescription)
    }

    override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup):
        CfnReplicationSubnetGroup = CfnReplicationSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationSubnetGroup):
        software.amazon.awscdk.services.dms.CfnReplicationSubnetGroup = wrapped.cdkObject
  }
}