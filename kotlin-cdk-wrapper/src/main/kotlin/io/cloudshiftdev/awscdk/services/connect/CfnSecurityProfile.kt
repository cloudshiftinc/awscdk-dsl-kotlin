@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun allowedAccessControlTags(): Any? = unwrap(this).getAllowedAccessControlTags()

  public open fun allowedAccessControlTags(`value`: IResolvable) {
    unwrap(this).setAllowedAccessControlTags(`value`.let(IResolvable::unwrap))
  }

  public open fun allowedAccessControlTags(__idx_ac66f0: List<Any>) {
    unwrap(this).setAllowedAccessControlTags(__idx_ac66f0)
  }

  public open fun allowedAccessControlTags(vararg __idx_ac66f0: Any): Unit =
      allowedAccessControlTags(__idx_ac66f0.toList())

  public open fun attrSecurityProfileArn(): String = unwrap(this).getAttrSecurityProfileArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  public open fun permissions(`value`: List<String>) {
    unwrap(this).setPermissions(`value`)
  }

  public open fun permissions(vararg `value`: String): Unit = permissions(`value`.toList())

  public open fun securityProfileName(): String = unwrap(this).getSecurityProfileName()

  public open fun securityProfileName(`value`: String) {
    unwrap(this).setSecurityProfileName(`value`)
  }

  public open fun tagRestrictedResources(): List<String> = unwrap(this).getTagRestrictedResources()
      ?: emptyList()

  public open fun tagRestrictedResources(`value`: List<String>) {
    unwrap(this).setTagRestrictedResources(`value`)
  }

  public open fun tagRestrictedResources(vararg `value`: String): Unit =
      tagRestrictedResources(`value`.toList())

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun allowedAccessControlTags(allowedAccessControlTags: IResolvable)

    public fun allowedAccessControlTags(allowedAccessControlTags: List<Any>)

    public fun allowedAccessControlTags(vararg allowedAccessControlTags: Any)

    public fun description(description: String)

    public fun instanceArn(instanceArn: String)

    public fun permissions(permissions: List<String>)

    public fun permissions(vararg permissions: String)

    public fun securityProfileName(securityProfileName: String)

    public fun tagRestrictedResources(tagRestrictedResources: List<String>)

    public fun tagRestrictedResources(vararg tagRestrictedResources: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityProfile.Builder =
        software.amazon.awscdk.services.connect.CfnSecurityProfile.Builder.create(scope, id)

    override fun allowedAccessControlTags(allowedAccessControlTags: IResolvable) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags.let(IResolvable::unwrap))
    }

    override fun allowedAccessControlTags(allowedAccessControlTags: List<Any>) {
      cdkBuilder.allowedAccessControlTags(allowedAccessControlTags)
    }

    override fun allowedAccessControlTags(vararg allowedAccessControlTags: Any): Unit =
        allowedAccessControlTags(allowedAccessControlTags.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    override fun securityProfileName(securityProfileName: String) {
      cdkBuilder.securityProfileName(securityProfileName)
    }

    override fun tagRestrictedResources(tagRestrictedResources: List<String>) {
      cdkBuilder.tagRestrictedResources(tagRestrictedResources)
    }

    override fun tagRestrictedResources(vararg tagRestrictedResources: String): Unit =
        tagRestrictedResources(tagRestrictedResources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnSecurityProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityProfile):
        CfnSecurityProfile = CfnSecurityProfile(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityProfile):
        software.amazon.awscdk.services.connect.CfnSecurityProfile = wrapped.cdkObject
  }
}
