@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIPSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun activate(): Any? = unwrap(this).getActivate()

  public open fun activate(`value`: Boolean) {
    unwrap(this).setActivate(`value`)
  }

  public open fun activate(`value`: IResolvable) {
    unwrap(this).setActivate(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun detectorId(): String? = unwrap(this).getDetectorId()

  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  public open fun format(): String = unwrap(this).getFormat()

  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun location(): String = unwrap(this).getLocation()

  public open fun location(`value`: String) {
    unwrap(this).setLocation(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
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
    public fun activate(activate: Boolean)

    public fun activate(activate: IResolvable)

    public fun detectorId(detectorId: String)

    public fun format(format: String)

    public fun location(location: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnIPSet.Builder =
        software.amazon.awscdk.services.guardduty.CfnIPSet.Builder.create(scope, id)

    override fun activate(activate: Boolean) {
      cdkBuilder.activate(activate)
    }

    override fun activate(activate: IResolvable) {
      cdkBuilder.activate(activate.let(IResolvable::unwrap))
    }

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnIPSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.guardduty.CfnIPSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnIPSet): CfnIPSet =
        CfnIPSet(cdkObject)

    internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.guardduty.CfnIPSet =
        wrapped.cdkObject
  }
}
