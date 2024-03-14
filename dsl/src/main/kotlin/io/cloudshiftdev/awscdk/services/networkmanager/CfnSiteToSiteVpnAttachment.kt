package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSiteToSiteVpnAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  public open fun attrAttachmentPolicyRuleNumber(): Number =
      unwrap(this).getAttrAttachmentPolicyRuleNumber()

  public open fun attrAttachmentType(): String = unwrap(this).getAttrAttachmentType()

  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrEdgeLocation(): String = unwrap(this).getAttrEdgeLocation()

  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  public open fun attrResourceArn(): String = unwrap(this).getAttrResourceArn()

  public open fun attrSegmentName(): String = unwrap(this).getAttrSegmentName()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun coreNetworkId(): String = unwrap(this).getCoreNetworkId()

  public open fun coreNetworkId(`value`: String) {
    unwrap(this).setCoreNetworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public open fun proposedSegmentChange(`value`: IResolvable) {
    unwrap(this).setProposedSegmentChange(`value`.let(IResolvable::unwrap))
  }

  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty) {
    unwrap(this).setProposedSegmentChange(`value`.let(ProposedSegmentChangeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("336ef54f14a81fe5f5273097375dd293068269cd141a3bff84bb76c5e0587aef")
  public open fun proposedSegmentChange(`value`: ProposedSegmentChangeProperty.Builder.() -> Unit):
      Unit = proposedSegmentChange(ProposedSegmentChangeProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpnConnectionArn(): String = unwrap(this).getVpnConnectionArn()

  public open fun vpnConnectionArn(`value`: String) {
    unwrap(this).setVpnConnectionArn(`value`)
  }

  public interface Builder {
    public fun coreNetworkId(coreNetworkId: String)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ede075052f137cb415454c0085f7edd151418adae72edc0456ce3bd825c957d")
    public
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun vpnConnectionArn(vpnConnectionArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.Builder.create(scope,
        id)

    override fun coreNetworkId(coreNetworkId: String) {
      cdkBuilder.coreNetworkId(coreNetworkId)
    }

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(ProposedSegmentChangeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ede075052f137cb415454c0085f7edd151418adae72edc0456ce3bd825c957d")
    override
        fun proposedSegmentChange(proposedSegmentChange: ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit = proposedSegmentChange(ProposedSegmentChangeProperty(proposedSegmentChange))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpnConnectionArn(vpnConnectionArn: String) {
      cdkBuilder.vpnConnectionArn(vpnConnectionArn)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSiteToSiteVpnAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSiteToSiteVpnAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment):
        CfnSiteToSiteVpnAttachment = CfnSiteToSiteVpnAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnSiteToSiteVpnAttachment):
        software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment =
        wrapped.cdkObject
  }

  public interface ProposedSegmentChangeProperty {
    public fun attachmentPolicyRuleNumber(): Number? = unwrap(this).getAttachmentPolicyRuleNumber()

    public fun segmentName(): String? = unwrap(this).getSegmentName()

    public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    public interface Builder {
      public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number)

      public fun segmentName(segmentName: String)

      public fun tags(tags: List<CfnTag>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty.builder()

      override fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
        cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
      }

      override fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty,
    ) : ProposedSegmentChangeProperty {
      override fun attachmentPolicyRuleNumber(): Number? =
          unwrap(this).getAttachmentPolicyRuleNumber()

      override fun segmentName(): String? = unwrap(this).getSegmentName()

      override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProposedSegmentChangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty):
          ProposedSegmentChangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProposedSegmentChangeProperty):
          software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
