@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnImage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrImageArn(): String = unwrap(this).getAttrImageArn()

  public open fun imageDescription(): String? = unwrap(this).getImageDescription()

  public open fun imageDescription(`value`: String) {
    unwrap(this).setImageDescription(`value`)
  }

  public open fun imageDisplayName(): String? = unwrap(this).getImageDisplayName()

  public open fun imageDisplayName(`value`: String) {
    unwrap(this).setImageDisplayName(`value`)
  }

  public open fun imageName(): String = unwrap(this).getImageName()

  public open fun imageName(`value`: String) {
    unwrap(this).setImageName(`value`)
  }

  public open fun imageRoleArn(): String = unwrap(this).getImageRoleArn()

  public open fun imageRoleArn(`value`: String) {
    unwrap(this).setImageRoleArn(`value`)
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

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun imageDescription(imageDescription: String)

    public fun imageDisplayName(imageDisplayName: String)

    public fun imageName(imageName: String)

    public fun imageRoleArn(imageRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnImage.Builder =
        software.amazon.awscdk.services.sagemaker.CfnImage.Builder.create(scope, id)

    override fun imageDescription(imageDescription: String) {
      cdkBuilder.imageDescription(imageDescription)
    }

    override fun imageDisplayName(imageDisplayName: String) {
      cdkBuilder.imageDisplayName(imageDisplayName)
    }

    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    override fun imageRoleArn(imageRoleArn: String) {
      cdkBuilder.imageRoleArn(imageRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnImage = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sagemaker.CfnImage.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnImage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnImage): CfnImage =
        CfnImage(cdkObject)

    internal fun unwrap(wrapped: CfnImage): software.amazon.awscdk.services.sagemaker.CfnImage =
        wrapped.cdkObject
  }
}
