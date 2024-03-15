@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlowSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrIngestIp(): String = unwrap(this).getAttrIngestIp()

  public open fun attrSourceArn(): String = unwrap(this).getAttrSourceArn()

  public open fun attrSourceIngestPort(): String = unwrap(this).getAttrSourceIngestPort()

  public open fun decryption(): Any? = unwrap(this).getDecryption()

  public open fun decryption(`value`: IResolvable) {
    unwrap(this).setDecryption(`value`.let(IResolvable::unwrap))
  }

  public open fun decryption(`value`: EncryptionProperty) {
    unwrap(this).setDecryption(`value`.let(EncryptionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6bef9d320d73a09780a6b8a6ad11f125ecd161cfd424639faac0d6256d4e946e")
  public open fun decryption(`value`: EncryptionProperty.Builder.() -> Unit): Unit =
      decryption(EncryptionProperty(`value`))

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

  public open fun entitlementArn(`value`: String) {
    unwrap(this).setEntitlementArn(`value`)
  }

  public open fun flowArn(): String? = unwrap(this).getFlowArn()

  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
  }

  public open fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

  public open fun gatewayBridgeSource(`value`: IResolvable) {
    unwrap(this).setGatewayBridgeSource(`value`.let(IResolvable::unwrap))
  }

  public open fun gatewayBridgeSource(`value`: GatewayBridgeSourceProperty) {
    unwrap(this).setGatewayBridgeSource(`value`.let(GatewayBridgeSourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6c461a61dbbc538bc19f84b2a06355eb21b6bf4dfeb61a89e6d71e93dafe04f8")
  public open fun gatewayBridgeSource(`value`: GatewayBridgeSourceProperty.Builder.() -> Unit): Unit
      = gatewayBridgeSource(GatewayBridgeSourceProperty(`value`))

  public open fun ingestPort(): Number? = unwrap(this).getIngestPort()

  public open fun ingestPort(`value`: Number) {
    unwrap(this).setIngestPort(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

  public open fun maxBitrate(`value`: Number) {
    unwrap(this).setMaxBitrate(`value`)
  }

  public open fun maxLatency(): Number? = unwrap(this).getMaxLatency()

  public open fun maxLatency(`value`: Number) {
    unwrap(this).setMaxLatency(`value`)
  }

  public open fun minLatency(): Number? = unwrap(this).getMinLatency()

  public open fun minLatency(`value`: Number) {
    unwrap(this).setMinLatency(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun protocol(): String? = unwrap(this).getProtocol()

  public open fun protocol(`value`: String) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

  public open fun senderControlPort(`value`: Number) {
    unwrap(this).setSenderControlPort(`value`)
  }

  public open fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

  public open fun senderIpAddress(`value`: String) {
    unwrap(this).setSenderIpAddress(`value`)
  }

  public open fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

  public open fun sourceListenerAddress(`value`: String) {
    unwrap(this).setSourceListenerAddress(`value`)
  }

  public open fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

  public open fun sourceListenerPort(`value`: Number) {
    unwrap(this).setSourceListenerPort(`value`)
  }

  public open fun streamId(): String? = unwrap(this).getStreamId()

  public open fun streamId(`value`: String) {
    unwrap(this).setStreamId(`value`)
  }

  public open fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

  public open fun vpcInterfaceName(`value`: String) {
    unwrap(this).setVpcInterfaceName(`value`)
  }

  public open fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()

  public open fun whitelistCidr(`value`: String) {
    unwrap(this).setWhitelistCidr(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun decryption(decryption: IResolvable)

    public fun decryption(decryption: EncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a11efebc014cff7bfdf7e8b2e789149fbafcb3d0f1cf703b54b7747b44a8d95")
    public fun decryption(decryption: EncryptionProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun entitlementArn(entitlementArn: String)

    public fun flowArn(flowArn: String)

    public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable)

    public fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1cdbcb9bc692f05686bb840b6e19403470dbeb5b6b434a34687d0f43c867b4")
    public
        fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit)

    public fun ingestPort(ingestPort: Number)

    public fun maxBitrate(maxBitrate: Number)

    public fun maxLatency(maxLatency: Number)

    public fun minLatency(minLatency: Number)

    public fun name(name: String)

    public fun protocol(protocol: String)

    public fun senderControlPort(senderControlPort: Number)

    public fun senderIpAddress(senderIpAddress: String)

    public fun sourceListenerAddress(sourceListenerAddress: String)

    public fun sourceListenerPort(sourceListenerPort: Number)

    public fun streamId(streamId: String)

    public fun vpcInterfaceName(vpcInterfaceName: String)

    public fun whitelistCidr(whitelistCidr: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowSource.Builder.create(scope, id)

    override fun decryption(decryption: IResolvable) {
      cdkBuilder.decryption(decryption.let(IResolvable::unwrap))
    }

    override fun decryption(decryption: EncryptionProperty) {
      cdkBuilder.decryption(decryption.let(EncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a11efebc014cff7bfdf7e8b2e789149fbafcb3d0f1cf703b54b7747b44a8d95")
    override fun decryption(decryption: EncryptionProperty.Builder.() -> Unit): Unit =
        decryption(EncryptionProperty(decryption))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun entitlementArn(entitlementArn: String) {
      cdkBuilder.entitlementArn(entitlementArn)
    }

    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    override fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable::unwrap))
    }

    override fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty) {
      cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(GatewayBridgeSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1cdbcb9bc692f05686bb840b6e19403470dbeb5b6b434a34687d0f43c867b4")
    override
        fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit):
        Unit = gatewayBridgeSource(GatewayBridgeSourceProperty(gatewayBridgeSource))

    override fun ingestPort(ingestPort: Number) {
      cdkBuilder.ingestPort(ingestPort)
    }

    override fun maxBitrate(maxBitrate: Number) {
      cdkBuilder.maxBitrate(maxBitrate)
    }

    override fun maxLatency(maxLatency: Number) {
      cdkBuilder.maxLatency(maxLatency)
    }

    override fun minLatency(minLatency: Number) {
      cdkBuilder.minLatency(minLatency)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    override fun senderControlPort(senderControlPort: Number) {
      cdkBuilder.senderControlPort(senderControlPort)
    }

    override fun senderIpAddress(senderIpAddress: String) {
      cdkBuilder.senderIpAddress(senderIpAddress)
    }

    override fun sourceListenerAddress(sourceListenerAddress: String) {
      cdkBuilder.sourceListenerAddress(sourceListenerAddress)
    }

    override fun sourceListenerPort(sourceListenerPort: Number) {
      cdkBuilder.sourceListenerPort(sourceListenerPort)
    }

    override fun streamId(streamId: String) {
      cdkBuilder.streamId(streamId)
    }

    override fun vpcInterfaceName(vpcInterfaceName: String) {
      cdkBuilder.vpcInterfaceName(vpcInterfaceName)
    }

    override fun whitelistCidr(whitelistCidr: String) {
      cdkBuilder.whitelistCidr(whitelistCidr)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnFlowSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource):
        CfnFlowSource = CfnFlowSource(cdkObject)

    internal fun unwrap(wrapped: CfnFlowSource):
        software.amazon.awscdk.services.mediaconnect.CfnFlowSource = wrapped.cdkObject
  }

  public interface EncryptionProperty {
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun deviceId(): String? = unwrap(this).getDeviceId()

    public fun keyType(): String? = unwrap(this).getKeyType()

    public fun region(): String? = unwrap(this).getRegion()

    public fun resourceId(): String? = unwrap(this).getResourceId()

    public fun roleArn(): String

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    public fun url(): String? = unwrap(this).getUrl()

    @CdkDslMarker
    public interface Builder {
      public fun algorithm(algorithm: String)

      public fun constantInitializationVector(constantInitializationVector: String)

      public fun deviceId(deviceId: String)

      public fun keyType(keyType: String)

      public fun region(region: String)

      public fun resourceId(resourceId: String)

      public fun roleArn(roleArn: String)

      public fun secretArn(secretArn: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty.builder()

      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty,
    ) : CdkObject(cdkObject), EncryptionProperty {
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      override fun deviceId(): String? = unwrap(this).getDeviceId()

      override fun keyType(): String? = unwrap(this).getKeyType()

      override fun region(): String? = unwrap(this).getRegion()

      override fun resourceId(): String? = unwrap(this).getResourceId()

      override fun roleArn(): String = unwrap(this).getRoleArn()

      override fun secretArn(): String? = unwrap(this).getSecretArn()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.EncryptionProperty
    }
  }

  public interface VpcInterfaceAttachmentProperty {
    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    @CdkDslMarker
    public interface Builder {
      public fun vpcInterfaceName(vpcInterfaceName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty.builder()

      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject), VpcInterfaceAttachmentProperty {
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.VpcInterfaceAttachmentProperty
    }
  }

  public interface GatewayBridgeSourceProperty {
    public fun bridgeArn(): String

    public fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()

    @CdkDslMarker
    public interface Builder {
      public fun bridgeArn(bridgeArn: String)

      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable)

      public fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc2783e910543d146007ba790ef8cae3c4b0f4c17d102fca4b56d927036fb84d")
      public
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty.builder()

      override fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
      }

      override fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(IResolvable::unwrap))
      }

      override fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty) {
        cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment.let(VpcInterfaceAttachmentProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc2783e910543d146007ba790ef8cae3c4b0f4c17d102fca4b56d927036fb84d")
      override
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit = vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty,
    ) : CdkObject(cdkObject), GatewayBridgeSourceProperty {
      override fun bridgeArn(): String = unwrap(this).getBridgeArn()

      override fun vpcInterfaceAttachment(): Any? = unwrap(this).getVpcInterfaceAttachment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GatewayBridgeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty):
          GatewayBridgeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayBridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlowSource.GatewayBridgeSourceProperty
    }
  }
}
