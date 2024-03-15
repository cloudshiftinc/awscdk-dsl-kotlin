@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

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

public open class CfnPhoneNumber internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumber,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAddress(): String = unwrap(this).getAttrAddress()

  public open fun attrPhoneNumberArn(): String = unwrap(this).getAttrPhoneNumberArn()

  public open fun countryCode(): String? = unwrap(this).getCountryCode()

  public open fun countryCode(`value`: String) {
    unwrap(this).setCountryCode(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun prefix(): String? = unwrap(this).getPrefix()

  public open fun prefix(`value`: String) {
    unwrap(this).setPrefix(`value`)
  }

  public open fun sourcePhoneNumberArn(): String? = unwrap(this).getSourcePhoneNumberArn()

  public open fun sourcePhoneNumberArn(`value`: String) {
    unwrap(this).setSourcePhoneNumberArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun targetArn(): String = unwrap(this).getTargetArn()

  public open fun targetArn(`value`: String) {
    unwrap(this).setTargetArn(`value`)
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun countryCode(countryCode: String)

    public fun description(description: String)

    public fun prefix(prefix: String)

    public fun sourcePhoneNumberArn(sourcePhoneNumberArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetArn(targetArn: String)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPhoneNumber.Builder =
        software.amazon.awscdk.services.connect.CfnPhoneNumber.Builder.create(scope, id)

    override fun countryCode(countryCode: String) {
      cdkBuilder.countryCode(countryCode)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    override fun sourcePhoneNumberArn(sourcePhoneNumberArn: String) {
      cdkBuilder.sourcePhoneNumberArn(sourcePhoneNumberArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnPhoneNumber = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnPhoneNumber.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPhoneNumber {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPhoneNumber(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPhoneNumber):
        CfnPhoneNumber = CfnPhoneNumber(cdkObject)

    internal fun unwrap(wrapped: CfnPhoneNumber):
        software.amazon.awscdk.services.connect.CfnPhoneNumber = wrapped.cdkObject
  }
}