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
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCoreNetwork internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCoreNetworkArn(): String = unwrap(this).getAttrCoreNetworkArn()

  public open fun attrCoreNetworkId(): String = unwrap(this).getAttrCoreNetworkId()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrEdges(): IResolvable = unwrap(this).getAttrEdges().let(IResolvable::wrap)

  public open fun attrOwnerAccount(): String = unwrap(this).getAttrOwnerAccount()

  public open fun attrSegments(): IResolvable =
      unwrap(this).getAttrSegments().let(IResolvable::wrap)

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

  public open fun globalNetworkId(`value`: String) {
    unwrap(this).setGlobalNetworkId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun policyDocument(policyDocument: Any)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.Builder =
        software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnCoreNetwork =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCoreNetwork {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCoreNetwork(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork):
        CfnCoreNetwork = CfnCoreNetwork(cdkObject)

    internal fun unwrap(wrapped: CfnCoreNetwork):
        software.amazon.awscdk.services.networkmanager.CfnCoreNetwork = wrapped.cdkObject
  }

  public interface CoreNetworkSegmentProperty {
    public fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations() ?: emptyList()

    public fun name(): String? = unwrap(this).getName()

    public fun sharedSegments(): List<String> = unwrap(this).getSharedSegments() ?: emptyList()

    public interface Builder {
      public fun edgeLocations(edgeLocations: List<String>)

      public fun name(name: String)

      public fun sharedSegments(sharedSegments: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty.builder()

      override fun edgeLocations(edgeLocations: List<String>) {
        cdkBuilder.edgeLocations(edgeLocations)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun sharedSegments(sharedSegments: List<String>) {
        cdkBuilder.sharedSegments(sharedSegments)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty,
    ) : CoreNetworkSegmentProperty {
      override fun edgeLocations(): List<String> = unwrap(this).getEdgeLocations() ?: emptyList()

      override fun name(): String? = unwrap(this).getName()

      override fun sharedSegments(): List<String> = unwrap(this).getSharedSegments() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CoreNetworkSegmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty):
          CoreNetworkSegmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreNetworkSegmentProperty):
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkSegmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CoreNetworkEdgeProperty {
    public fun asn(): Number? = unwrap(this).getAsn()

    public fun edgeLocation(): String? = unwrap(this).getEdgeLocation()

    public fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?: emptyList()

    public interface Builder {
      public fun asn(asn: Number)

      public fun edgeLocation(edgeLocation: String)

      public fun insideCidrBlocks(insideCidrBlocks: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty.Builder
          =
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty.builder()

      override fun asn(asn: Number) {
        cdkBuilder.asn(asn)
      }

      override fun edgeLocation(edgeLocation: String) {
        cdkBuilder.edgeLocation(edgeLocation)
      }

      override fun insideCidrBlocks(insideCidrBlocks: List<String>) {
        cdkBuilder.insideCidrBlocks(insideCidrBlocks)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty,
    ) : CoreNetworkEdgeProperty {
      override fun asn(): Number? = unwrap(this).getAsn()

      override fun edgeLocation(): String? = unwrap(this).getEdgeLocation()

      override fun insideCidrBlocks(): List<String> = unwrap(this).getInsideCidrBlocks() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CoreNetworkEdgeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty):
          CoreNetworkEdgeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreNetworkEdgeProperty):
          software.amazon.awscdk.services.networkmanager.CfnCoreNetwork.CoreNetworkEdgeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}