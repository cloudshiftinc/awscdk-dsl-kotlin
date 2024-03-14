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

public open class CfnDevice internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrDeviceArn(): String = unwrap(this).getAttrDeviceArn()

  public open fun attrDeviceId(): String = unwrap(this).getAttrDeviceId()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun awsLocation(): Any? = unwrap(this).getAwsLocation()

  public open fun awsLocation(`value`: IResolvable) {
    unwrap(this).setAwsLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun awsLocation(`value`: AWSLocationProperty) {
    unwrap(this).setAwsLocation(`value`.let(AWSLocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("83d22458fe4c928e3b0d576756cf7d4cb96076efe3f14dec0ba40189d51f952c")
  public open fun awsLocation(`value`: AWSLocationProperty.Builder.() -> Unit): Unit =
      awsLocation(AWSLocationProperty(`value`))

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
  @JvmName("fe1d2e6c4bcf17ed92a42706fcc004b539bdf2c9344bca7ead7c95d2bea105cb")
  public open fun location(`value`: LocationProperty.Builder.() -> Unit): Unit =
      location(LocationProperty(`value`))

  public open fun model(): String? = unwrap(this).getModel()

  public open fun model(`value`: String) {
    unwrap(this).setModel(`value`)
  }

  public open fun serialNumber(): String? = unwrap(this).getSerialNumber()

  public open fun serialNumber(`value`: String) {
    unwrap(this).setSerialNumber(`value`)
  }

  public open fun siteId(): String? = unwrap(this).getSiteId()

  public open fun siteId(`value`: String) {
    unwrap(this).setSiteId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun vendor(): String? = unwrap(this).getVendor()

  public open fun vendor(`value`: String) {
    unwrap(this).setVendor(`value`)
  }

  public interface Builder {
    public fun awsLocation(awsLocation: IResolvable) {
    }

    public fun awsLocation(awsLocation: AWSLocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("876b852edb9897dee52b427b91554cf016d67b1c8c78a214475b98d0e8752b43")
    public fun awsLocation(awsLocation: AWSLocationProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun globalNetworkId(globalNetworkId: String) {
    }

    public fun location(location: IResolvable) {
    }

    public fun location(location: LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a741859ec421cd2266f4416b1a2c580555d70e8b533608f512b1a0b89cde9c39")
    public fun location(location: LocationProperty.Builder.() -> Unit) {
    }

    public fun model(model: String) {
    }

    public fun serialNumber(serialNumber: String) {
    }

    public fun siteId(siteId: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun type(type: String) {
    }

    public fun vendor(vendor: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnDevice.Builder =
        software.amazon.awscdk.services.networkmanager.CfnDevice.Builder.create(scope, id)

    public override fun awsLocation(awsLocation: IResolvable) {
      cdkBuilder.awsLocation(awsLocation.let(IResolvable::unwrap))
    }

    public override fun awsLocation(awsLocation: AWSLocationProperty) {
      cdkBuilder.awsLocation(awsLocation.let(AWSLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("876b852edb9897dee52b427b91554cf016d67b1c8c78a214475b98d0e8752b43")
    public override fun awsLocation(awsLocation: AWSLocationProperty.Builder.() -> Unit): Unit =
        awsLocation(AWSLocationProperty(awsLocation))

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
    @JvmName("a741859ec421cd2266f4416b1a2c580555d70e8b533608f512b1a0b89cde9c39")
    public override fun location(location: LocationProperty.Builder.() -> Unit): Unit =
        location(LocationProperty(location))

    public override fun model(model: String) {
      cdkBuilder.model(model)
    }

    public override fun serialNumber(serialNumber: String) {
      cdkBuilder.serialNumber(serialNumber)
    }

    public override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public override fun vendor(vendor: String) {
      cdkBuilder.vendor(vendor)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnDevice =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDevice {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDevice(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice):
        CfnDevice = CfnDevice(cdkObject)

    internal fun unwrap(wrapped: CfnDevice):
        software.amazon.awscdk.services.networkmanager.CfnDevice = wrapped.cdkObject
  }

  public interface AWSLocationProperty {
    public fun subnetArn(): String? = unwrap(this).getSubnetArn()

    public fun zone(): String? = unwrap(this).getZone()

    public interface Builder {
      public fun subnetArn(subnetArn: String) {
      }

      public fun zone(zone: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty.builder()

      public override fun subnetArn(subnetArn: String) {
        cdkBuilder.subnetArn(subnetArn)
      }

      public override fun zone(zone: String) {
        cdkBuilder.zone(zone)
      }

      public fun build():
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty,
    ) : AWSLocationProperty {
      public override fun subnetArn(): String? = unwrap(this).getSubnetArn()

      public override fun zone(): String? = unwrap(this).getZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AWSLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty):
          AWSLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AWSLocationProperty):
          software.amazon.awscdk.services.networkmanager.CfnDevice.AWSLocationProperty = (wrapped as
          Wrapper).cdkObject
    }
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
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty.Builder =
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty.builder()

      public override fun address(address: String) {
        cdkBuilder.address(address)
      }

      public override fun latitude(latitude: String) {
        cdkBuilder.latitude(latitude)
      }

      public override fun longitude(longitude: String) {
        cdkBuilder.longitude(longitude)
      }

      public fun build(): software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty):
          LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocationProperty):
          software.amazon.awscdk.services.networkmanager.CfnDevice.LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
