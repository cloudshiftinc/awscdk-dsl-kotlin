@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRepositoryLink internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrProviderType(): String = unwrap(this).getAttrProviderType()

  public open fun attrRepositoryLinkArn(): String = unwrap(this).getAttrRepositoryLinkArn()

  public open fun attrRepositoryLinkId(): String = unwrap(this).getAttrRepositoryLinkId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun connectionArn(): String = unwrap(this).getConnectionArn()

  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ownerId(): String = unwrap(this).getOwnerId()

  public open fun ownerId(`value`: String) {
    unwrap(this).setOwnerId(`value`)
  }

  public open fun repositoryName(): String = unwrap(this).getRepositoryName()

  public open fun repositoryName(`value`: String) {
    unwrap(this).setRepositoryName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun connectionArn(connectionArn: String)

    public fun encryptionKeyArn(encryptionKeyArn: String)

    public fun ownerId(ownerId: String)

    public fun repositoryName(repositoryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink.Builder.create(scope,
        id)

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    override fun ownerId(ownerId: String) {
      cdkBuilder.ownerId(ownerId)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRepositoryLink {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRepositoryLink(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink):
        CfnRepositoryLink = CfnRepositoryLink(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryLink):
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink = wrapped.cdkObject
  }
}