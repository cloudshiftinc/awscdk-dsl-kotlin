@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

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

public open class CfnAccessor internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessorType(): String = unwrap(this).getAccessorType()

  public open fun accessorType(`value`: String) {
    unwrap(this).setAccessorType(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrBillingToken(): String = unwrap(this).getAttrBillingToken()

  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun networkType(): String? = unwrap(this).getNetworkType()

  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
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
    public fun accessorType(accessorType: String)

    public fun networkType(networkType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnAccessor.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnAccessor.Builder.create(scope, id)

    override fun accessorType(accessorType: String) {
      cdkBuilder.accessorType(accessorType)
    }

    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnAccessor =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.managedblockchain.CfnAccessor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnAccessor):
        CfnAccessor = CfnAccessor(cdkObject)

    internal fun unwrap(wrapped: CfnAccessor):
        software.amazon.awscdk.services.managedblockchain.CfnAccessor = wrapped.cdkObject
  }
}