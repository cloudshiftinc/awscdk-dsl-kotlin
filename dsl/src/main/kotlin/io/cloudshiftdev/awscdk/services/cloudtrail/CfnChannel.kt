package io.cloudshiftdev.awscdk.services.cloudtrail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrChannelArn(): String = unwrap(this).getAttrChannelArn()

  public open fun destinations(): Any? = unwrap(this).getDestinations()

  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable::unwrap))
  }

  public open fun destinations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinations(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun source(): String? = unwrap(this).getSource()

  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun name(name: String)

    public fun source(source: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudtrail.CfnChannel.Builder =
        software.amazon.awscdk.services.cloudtrail.CfnChannel.Builder.create(scope, id)

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudtrail.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannel): CfnChannel
        = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel): software.amazon.awscdk.services.cloudtrail.CfnChannel
        = wrapped.cdkObject
  }

  public interface DestinationProperty {
    public fun location(): String

    public fun type(): String

    public interface Builder {
      public fun location(location: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty.Builder =
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty.builder()

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty,
    ) : DestinationProperty {
      override fun location(): String = unwrap(this).getLocation()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty):
          DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.cloudtrail.CfnChannel.DestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
