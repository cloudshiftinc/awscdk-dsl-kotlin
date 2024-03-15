@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

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

public open class CfnAgreement internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessRole(): String = unwrap(this).getAccessRole()

  public open fun accessRole(`value`: String) {
    unwrap(this).setAccessRole(`value`)
  }

  public open fun attrAgreementId(): String = unwrap(this).getAttrAgreementId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun baseDirectory(): String = unwrap(this).getBaseDirectory()

  public open fun baseDirectory(`value`: String) {
    unwrap(this).setBaseDirectory(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun localProfileId(): String = unwrap(this).getLocalProfileId()

  public open fun localProfileId(`value`: String) {
    unwrap(this).setLocalProfileId(`value`)
  }

  public open fun partnerProfileId(): String = unwrap(this).getPartnerProfileId()

  public open fun partnerProfileId(`value`: String) {
    unwrap(this).setPartnerProfileId(`value`)
  }

  public open fun serverId(): String = unwrap(this).getServerId()

  public open fun serverId(`value`: String) {
    unwrap(this).setServerId(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
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
    public fun accessRole(accessRole: String)

    public fun baseDirectory(baseDirectory: String)

    public fun description(description: String)

    public fun localProfileId(localProfileId: String)

    public fun partnerProfileId(partnerProfileId: String)

    public fun serverId(serverId: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnAgreement.Builder =
        software.amazon.awscdk.services.transfer.CfnAgreement.Builder.create(scope, id)

    override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    override fun baseDirectory(baseDirectory: String) {
      cdkBuilder.baseDirectory(baseDirectory)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun localProfileId(localProfileId: String) {
      cdkBuilder.localProfileId(localProfileId)
    }

    override fun partnerProfileId(partnerProfileId: String) {
      cdkBuilder.partnerProfileId(partnerProfileId)
    }

    override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnAgreement = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnAgreement.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgreement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgreement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnAgreement):
        CfnAgreement = CfnAgreement(cdkObject)

    internal fun unwrap(wrapped: CfnAgreement):
        software.amazon.awscdk.services.transfer.CfnAgreement = wrapped.cdkObject
  }
}
