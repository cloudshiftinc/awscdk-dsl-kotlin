package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSite internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnSite,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrSiteArn(): String = unwrap(this).getAttrSiteArn()

  public open fun attrSiteId(): String = unwrap(this).getAttrSiteId()

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

  public open fun location(): Any? = unwrap(this).getLocation()

  public open fun location(`value`: IResolvable) {
    unwrap(this).setLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun location(`value`: LocationProperty) {
    unwrap(this).setLocation(`value`.let(LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e7c32235714b5ec1221088a74ca97e391ed26ab8bf4eda63b175f27f41ee0ef")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun globalNetworkId(globalNetworkId: String) {
    }

    public fun location(location: IResolvable) {
    }

    public fun location(location: LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bfa01d646df37bd2c197504cf756b0316d72477463a0eab7da00a546fb82910")
    public fun location(location: LocationProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnSite.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSite.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    public override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    public override fun location(location: LocationProperty) {
      cdkBuilder.location(location.let(LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bfa01d646df37bd2c197504cf756b0316d72477463a0eab7da00a546fb82910")
    public override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnSite = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSite {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSite(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSite): CfnSite =
        CfnSite(cdkObject)

    internal fun unwrap(wrapped: CfnSite): software.amazon.awscdk.services.networkmanager.CfnSite =
        wrapped.cdkObject
  }

  public interface LocationProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun latitude(): String? = unwrap(this).getLatitude()

    public fun longitude(): String? = unwrap(this).getLongitude()

    public interface Builder {
      public fun address(address: String) {
      }

      public fun latitude(latitude: String) {
      }

      public fun longitude(longitude: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      public override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public fun build(): software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty,
    ) : LocationProperty {
      public override fun address(): String? = unwrap(this).getAddress()

      public override fun latitude(): String? = unwrap(this).getLatitude()

      public override fun longitude(): String? = unwrap(this).getLongitude()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.networkmanager.CfnSite.LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
