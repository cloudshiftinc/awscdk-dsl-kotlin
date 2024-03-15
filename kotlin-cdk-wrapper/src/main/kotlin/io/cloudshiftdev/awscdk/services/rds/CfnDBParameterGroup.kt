@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBParameterGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDbParameterGroupName(): String = unwrap(this).getAttrDbParameterGroupName()

  public open fun dbParameterGroupName(): String? = unwrap(this).getDbParameterGroupName()

  public open fun dbParameterGroupName(`value`: String) {
    unwrap(this).setDbParameterGroupName(`value`)
  }

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

  public open fun parameters(): Any? = unwrap(this).getParameters()

  public open fun parameters(`value`: Any) {
    unwrap(this).setParameters(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dbParameterGroupName(dbParameterGroupName: String)

    public fun description(description: String)

    public fun family(family: String)

    public fun parameters(parameters: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBParameterGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBParameterGroup.Builder.create(scope, id)

    override fun dbParameterGroupName(dbParameterGroupName: String) {
      cdkBuilder.dbParameterGroupName(dbParameterGroupName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBParameterGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBParameterGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBParameterGroup):
        CfnDBParameterGroup = CfnDBParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBParameterGroup):
        software.amazon.awscdk.services.rds.CfnDBParameterGroup = wrapped.cdkObject
  }
}