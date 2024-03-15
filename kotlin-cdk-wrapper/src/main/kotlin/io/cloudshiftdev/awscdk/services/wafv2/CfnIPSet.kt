@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wafv2

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

public open class CfnIPSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun addresses(): List<String> = unwrap(this).getAddresses()

  public open fun addresses(`value`: List<String>) {
    unwrap(this).setAddresses(`value`)
  }

  public open fun addresses(vararg `value`: String): Unit = addresses(`value`.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipAddressVersion(): String = unwrap(this).getIpAddressVersion()

  public open fun ipAddressVersion(`value`: String) {
    unwrap(this).setIpAddressVersion(`value`)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun scope(): String = unwrap(this).getScope()

  public open fun scope(`value`: String) {
    unwrap(this).setScope(`value`)
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
    public fun addresses(addresses: List<String>)

    public fun addresses(vararg addresses: String)

    public fun description(description: String)

    public fun ipAddressVersion(ipAddressVersion: String)

    public fun name(name: String)

    public fun scope(scope: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnIPSet.Builder =
        software.amazon.awscdk.services.wafv2.CfnIPSet.Builder.create(scope, id)

    override fun addresses(addresses: List<String>) {
      cdkBuilder.addresses(addresses)
    }

    override fun addresses(vararg addresses: String): Unit = addresses(addresses.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ipAddressVersion(ipAddressVersion: String) {
      cdkBuilder.ipAddressVersion(ipAddressVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.wafv2.CfnIPSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wafv2.CfnIPSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIPSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIPSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnIPSet): CfnIPSet =
        CfnIPSet(cdkObject)

    internal fun unwrap(wrapped: CfnIPSet): software.amazon.awscdk.services.wafv2.CfnIPSet =
        wrapped.cdkObject
  }
}