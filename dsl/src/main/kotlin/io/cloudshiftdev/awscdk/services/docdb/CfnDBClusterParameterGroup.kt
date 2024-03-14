package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBClusterParameterGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun family(): String = unwrap(this).getFamily()

  public open fun family(`value`: String) {
    unwrap(this).setFamily(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parameters(): Any = unwrap(this).getParameters()

  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun family(family: String)

    public fun name(name: String)

    public fun parameters(parameters: Any)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup.Builder
        = software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBClusterParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBClusterParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup):
        CfnDBClusterParameterGroup = CfnDBClusterParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterParameterGroup):
        software.amazon.awscdk.services.docdb.CfnDBClusterParameterGroup = wrapped.cdkObject
  }
}
