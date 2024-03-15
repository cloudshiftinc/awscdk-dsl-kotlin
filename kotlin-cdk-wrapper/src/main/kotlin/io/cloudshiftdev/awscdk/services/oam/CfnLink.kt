@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.oam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLink internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.oam.CfnLink,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrLabel(): String = unwrap(this).getAttrLabel()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun labelTemplate(): String? = unwrap(this).getLabelTemplate()

  public open fun labelTemplate(`value`: String) {
    unwrap(this).setLabelTemplate(`value`)
  }

  public open fun resourceTypes(): List<String> = unwrap(this).getResourceTypes()

  public open fun resourceTypes(`value`: List<String>) {
    unwrap(this).setResourceTypes(`value`)
  }

  public open fun resourceTypes(vararg `value`: String): Unit = resourceTypes(`value`.toList())

  public open fun sinkIdentifier(): String = unwrap(this).getSinkIdentifier()

  public open fun sinkIdentifier(`value`: String) {
    unwrap(this).setSinkIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun labelTemplate(labelTemplate: String)

    public fun resourceTypes(resourceTypes: List<String>)

    public fun resourceTypes(vararg resourceTypes: String)

    public fun sinkIdentifier(sinkIdentifier: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.oam.CfnLink.Builder =
        software.amazon.awscdk.services.oam.CfnLink.Builder.create(scope, id)

    override fun labelTemplate(labelTemplate: String) {
      cdkBuilder.labelTemplate(labelTemplate)
    }

    override fun resourceTypes(resourceTypes: List<String>) {
      cdkBuilder.resourceTypes(resourceTypes)
    }

    override fun resourceTypes(vararg resourceTypes: String): Unit =
        resourceTypes(resourceTypes.toList())

    override fun sinkIdentifier(sinkIdentifier: String) {
      cdkBuilder.sinkIdentifier(sinkIdentifier)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.oam.CfnLink = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.oam.CfnLink.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLink(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.oam.CfnLink): CfnLink =
        CfnLink(cdkObject)

    internal fun unwrap(wrapped: CfnLink): software.amazon.awscdk.services.oam.CfnLink =
        wrapped.cdkObject
  }
}