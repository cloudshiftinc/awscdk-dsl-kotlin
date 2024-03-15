@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ram

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

public open class CfnResourceShare internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ram.CfnResourceShare,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allowExternalPrincipals(): Any? = unwrap(this).getAllowExternalPrincipals()

  public open fun allowExternalPrincipals(`value`: Boolean) {
    unwrap(this).setAllowExternalPrincipals(`value`)
  }

  public open fun allowExternalPrincipals(`value`: IResolvable) {
    unwrap(this).setAllowExternalPrincipals(`value`.let(IResolvable::unwrap))
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissionArns(): List<String> = unwrap(this).getPermissionArns() ?: emptyList()

  public open fun permissionArns(`value`: List<String>) {
    unwrap(this).setPermissionArns(`value`)
  }

  public open fun permissionArns(vararg `value`: String): Unit = permissionArns(`value`.toList())

  public open fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  public open fun principals(`value`: List<String>) {
    unwrap(this).setPrincipals(`value`)
  }

  public open fun principals(vararg `value`: String): Unit = principals(`value`.toList())

  public open fun resourceArns(): List<String> = unwrap(this).getResourceArns() ?: emptyList()

  public open fun resourceArns(`value`: List<String>) {
    unwrap(this).setResourceArns(`value`)
  }

  public open fun resourceArns(vararg `value`: String): Unit = resourceArns(`value`.toList())

  public open fun sources(): List<String> = unwrap(this).getSources() ?: emptyList()

  public open fun sources(`value`: List<String>) {
    unwrap(this).setSources(`value`)
  }

  public open fun sources(vararg `value`: String): Unit = sources(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun allowExternalPrincipals(allowExternalPrincipals: Boolean)

    public fun allowExternalPrincipals(allowExternalPrincipals: IResolvable)

    public fun name(name: String)

    public fun permissionArns(permissionArns: List<String>)

    public fun permissionArns(vararg permissionArns: String)

    public fun principals(principals: List<String>)

    public fun principals(vararg principals: String)

    public fun resourceArns(resourceArns: List<String>)

    public fun resourceArns(vararg resourceArns: String)

    public fun sources(sources: List<String>)

    public fun sources(vararg sources: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnResourceShare.Builder =
        software.amazon.awscdk.services.ram.CfnResourceShare.Builder.create(scope, id)

    override fun allowExternalPrincipals(allowExternalPrincipals: Boolean) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals)
    }

    override fun allowExternalPrincipals(allowExternalPrincipals: IResolvable) {
      cdkBuilder.allowExternalPrincipals(allowExternalPrincipals.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissionArns(permissionArns: List<String>) {
      cdkBuilder.permissionArns(permissionArns)
    }

    override fun permissionArns(vararg permissionArns: String): Unit =
        permissionArns(permissionArns.toList())

    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    override fun sources(sources: List<String>) {
      cdkBuilder.sources(sources)
    }

    override fun sources(vararg sources: String): Unit = sources(sources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ram.CfnResourceShare = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ram.CfnResourceShare.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceShare {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceShare(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnResourceShare):
        CfnResourceShare = CfnResourceShare(cdkObject)

    internal fun unwrap(wrapped: CfnResourceShare):
        software.amazon.awscdk.services.ram.CfnResourceShare = wrapped.cdkObject
  }
}
