package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserAccessLoggingSettings internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns() ?: emptyList()

  public open fun attrUserAccessLoggingSettingsArn(): String =
      unwrap(this).getAttrUserAccessLoggingSettingsArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kinesisStreamArn(): String = unwrap(this).getKinesisStreamArn()

  public open fun kinesisStreamArn(`value`: String) {
    unwrap(this).setKinesisStreamArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun kinesisStreamArn(kinesisStreamArn: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings.Builder.create(scope,
        id)

    override fun kinesisStreamArn(kinesisStreamArn: String) {
      cdkBuilder.kinesisStreamArn(kinesisStreamArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserAccessLoggingSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserAccessLoggingSettings(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings):
        CfnUserAccessLoggingSettings = CfnUserAccessLoggingSettings(cdkObject)

    internal fun unwrap(wrapped: CfnUserAccessLoggingSettings):
        software.amazon.awscdk.services.workspacesweb.CfnUserAccessLoggingSettings =
        wrapped.cdkObject
  }
}