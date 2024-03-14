package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBrowserSettings internal constructor(
  private val cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns() ?: emptyList()

  public open fun attrBrowserSettingsArn(): String = unwrap(this).getAttrBrowserSettingsArn()

  public open fun browserPolicy(): String? = unwrap(this).getBrowserPolicy()

  public open fun browserPolicy(`value`: String) {
    unwrap(this).setBrowserPolicy(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
    }

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
    }

    public fun browserPolicy(browserPolicy: String) {
    }

    public fun customerManagedKey(customerManagedKey: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings.Builder
        = software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings.Builder.create(scope, id)

    public override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    public override
        fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    public override fun browserPolicy(browserPolicy: String) {
      cdkBuilder.browserPolicy(browserPolicy)
    }

    public override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBrowserSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBrowserSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings):
        CfnBrowserSettings = CfnBrowserSettings(cdkObject)

    internal fun unwrap(wrapped: CfnBrowserSettings):
        software.amazon.awscdk.services.workspacesweb.CfnBrowserSettings = wrapped.cdkObject
  }
}
