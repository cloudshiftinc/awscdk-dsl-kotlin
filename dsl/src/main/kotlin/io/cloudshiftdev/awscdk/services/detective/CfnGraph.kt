package io.cloudshiftdev.awscdk.services.detective

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGraph internal constructor(
  private val cdkObject: software.amazon.awscdk.services.detective.CfnGraph,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun autoEnableMembers(): Any? = unwrap(this).getAutoEnableMembers()

  public open fun autoEnableMembers(`value`: Boolean) {
    unwrap(this).setAutoEnableMembers(`value`)
  }

  public open fun autoEnableMembers(`value`: IResolvable) {
    unwrap(this).setAutoEnableMembers(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun autoEnableMembers(autoEnableMembers: Boolean) {
    }

    public fun autoEnableMembers(autoEnableMembers: IResolvable) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.detective.CfnGraph.Builder =
        software.amazon.awscdk.services.detective.CfnGraph.Builder.create(scope, id)

    public override fun autoEnableMembers(autoEnableMembers: Boolean) {
      cdkBuilder.autoEnableMembers(autoEnableMembers)
    }

    public override fun autoEnableMembers(autoEnableMembers: IResolvable) {
      cdkBuilder.autoEnableMembers(autoEnableMembers.let(IResolvable::unwrap))
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.detective.CfnGraph = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraph {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraph(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.detective.CfnGraph): CfnGraph =
        CfnGraph(cdkObject)

    internal fun unwrap(wrapped: CfnGraph): software.amazon.awscdk.services.detective.CfnGraph =
        wrapped.cdkObject
  }
}
