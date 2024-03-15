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

public open class CfnFlow internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrFlowArn(): String = unwrap(this).getAttrFlowArn()

  public open fun attrFlowAvailabilityZone(): String = unwrap(this).getAttrFlowAvailabilityZone()

  public open fun attrSourceIngestIp(): String = unwrap(this).getAttrSourceIngestIp()

  public open fun attrSourceSourceArn(): String = unwrap(this).getAttrSourceSourceArn()

  public open fun attrSourceSourceIngestPort(): String =
      unwrap(this).getAttrSourceSourceIngestPort()

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun source(): Any = unwrap(this).getSource()

  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1cab647f51a5450b2a4fcffeffe02c98559948506b0b730b43959630b2684b8c")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  public open fun sourceFailoverConfig(): Any? = unwrap(this).getSourceFailoverConfig()

  public open fun sourceFailoverConfig(`value`: IResolvable) {
    unwrap(this).setSourceFailoverConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty) {
    unwrap(this).setSourceFailoverConfig(`value`.let(FailoverConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c6ceeb1eb4eed29a4ba3a766c50ca14ac56f766293c5979c53dffa685b655f0c")
  public open fun sourceFailoverConfig(`value`: FailoverConfigProperty.Builder.() -> Unit): Unit =
      sourceFailoverConfig(FailoverConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun availabilityZone(availabilityZone: String)

    public fun name(name: String)

    public fun source(source: IResolvable)

    public fun source(source: SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("035c5b8913aae2921a893416990a1e83d27fded454beb33081c792d1e91f189c")
    public fun source(source: SourceProperty.Builder.() -> Unit)

    public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable)

    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5abeb077251f47edc02bd2b28a08721f306e31d06bd4f4b2bbc800e2fc3b9141")
    public fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlow.Builder.create(scope, id)

    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("035c5b8913aae2921a893416990a1e83d27fded454beb33081c792d1e91f189c")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    override fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(IResolvable::unwrap))
    }

    override fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty) {
      cdkBuilder.sourceFailoverConfig(sourceFailoverConfig.let(FailoverConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5abeb077251f47edc02bd2b28a08721f306e31d06bd4f4b2bbc800e2fc3b9141")
    override
        fun sourceFailoverConfig(sourceFailoverConfig: FailoverConfigProperty.Builder.() -> Unit):
        Unit = sourceFailoverConfig(FailoverConfigProperty(sourceFailoverConfig))

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconnect.CfnFlow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow): CfnFlow =
        CfnFlow(cdkObject)

    internal fun unwrap(wrapped: CfnFlow): software.amazon.awscdk.services.mediaconnect.CfnFlow =
        wrapped.cdkObject
  }

  public interface SourcePriorityProperty {
    public fun primarySource(): String

    @CdkDslMarker
    public interface Builder {
      public fun primarySource(primarySource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty.builder()

      override fun primarySource(primarySource: String) {
        cdkBuilder.primarySource(primarySource)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty,
    ) : CdkObject(cdkObject), SourcePriorityProperty {
      override fun primarySource(): String = unwrap(this).getPrimarySource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourcePriorityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty):
          SourcePriorityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourcePriorityProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourcePriorityProperty
    }
  }

  public interface FailoverConfigProperty {
    public fun failoverMode(): String? = unwrap(this).getFailoverMode()

    public fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

    public fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

    public fun state(): String? = unwrap(this).getState()

    @CdkDslMarker
    public interface Builder {
      public fun failoverMode(failoverMode: String)

      public fun recoveryWindow(recoveryWindow: Number)

      public fun sourcePriority(sourcePriority: IResolvable)

      public fun sourcePriority(sourcePriority: SourcePriorityProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("433bb811abbc6de8c47e56b6bda3581404f5d13ff508958578003f78c0329544")
      public fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit)

      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty.builder()

      override fun failoverMode(failoverMode: String) {
        cdkBuilder.failoverMode(failoverMode)
      }

      override fun recoveryWindow(recoveryWindow: Number) {
        cdkBuilder.recoveryWindow(recoveryWindow)
      }

      override fun sourcePriority(sourcePriority: IResolvable) {
        cdkBuilder.sourcePriority(sourcePriority.let(IResolvable::unwrap))
      }

      override fun sourcePriority(sourcePriority: SourcePriorityProperty) {
        cdkBuilder.sourcePriority(sourcePriority.let(SourcePriorityProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("433bb811abbc6de8c47e56b6bda3581404f5d13ff508958578003f78c0329544")
      override fun sourcePriority(sourcePriority: SourcePriorityProperty.Builder.() -> Unit): Unit =
          sourcePriority(SourcePriorityProperty(sourcePriority))

      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty,
    ) : CdkObject(cdkObject), FailoverConfigProperty {
      override fun failoverMode(): String? = unwrap(this).getFailoverMode()

      override fun recoveryWindow(): Number? = unwrap(this).getRecoveryWindow()

      override fun sourcePriority(): Any? = unwrap(this).getSourcePriority()

      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FailoverConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty):
          FailoverConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FailoverConfigProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty
    }
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
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty
    }
  }

  public interface SourceProperty {
    public fun decryption(): Any? = unwrap(this).getDecryption()

    public fun description(): String? = unwrap(this).getDescription()

    public fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

    public fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

    public fun ingestIp(): String? = unwrap(this).getIngestIp()

    public fun ingestPort(): Number? = unwrap(this).getIngestPort()

    public fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

    public fun maxLatency(): Number? = unwrap(this).getMaxLatency()

    public fun minLatency(): Number? = unwrap(this).getMinLatency()

    public fun name(): String? = unwrap(this).getName()

    public fun protocol(): String? = unwrap(this).getProtocol()

    public fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

    public fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

    public fun sourceArn(): String? = unwrap(this).getSourceArn()

    public fun sourceIngestPort(): String? = unwrap(this).getSourceIngestPort()

    public fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

    public fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

    public fun streamId(): String? = unwrap(this).getStreamId()

    public fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

    public fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()

    @CdkDslMarker
    public interface Builder {
      public fun decryption(decryption: IResolvable)

      public fun decryption(decryption: EncryptionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      public fun decryption(decryption: EncryptionProperty.Builder.() -> Unit)

      public fun description(description: String)

      public fun entitlementArn(entitlementArn: String)

      public fun gatewayBridgeSource(gatewayBridgeSource: IResolvable)

      public fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59af1f5ef7b61a09b7066cb3d6d56bbcc153a0fef7d5dae13da07b5541281d90")
      public
          fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit)

      public fun ingestIp(ingestIp: String)

      public fun ingestPort(ingestPort: Number)

      public fun maxBitrate(maxBitrate: Number)

      public fun maxLatency(maxLatency: Number)

      public fun minLatency(minLatency: Number)

      public fun name(name: String)

      public fun protocol(protocol: String)

      public fun senderControlPort(senderControlPort: Number)

      public fun senderIpAddress(senderIpAddress: String)

      public fun sourceArn(sourceArn: String)

      public fun sourceIngestPort(sourceIngestPort: String)

      public fun sourceListenerAddress(sourceListenerAddress: String)

      public fun sourceListenerPort(sourceListenerPort: Number)

      public fun streamId(streamId: String)

      public fun vpcInterfaceName(vpcInterfaceName: String)

      public fun whitelistCidr(whitelistCidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty.builder()

      override fun decryption(decryption: IResolvable) {
        cdkBuilder.decryption(decryption.let(IResolvable::unwrap))
      }

      override fun decryption(decryption: EncryptionProperty) {
        cdkBuilder.decryption(decryption.let(EncryptionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4736f95280944e4bcd40573c2195bc3caddc65327139bf37b054c53d7db418bc")
      override fun decryption(decryption: EncryptionProperty.Builder.() -> Unit): Unit =
          decryption(EncryptionProperty(decryption))

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun entitlementArn(entitlementArn: String) {
        cdkBuilder.entitlementArn(entitlementArn)
      }

      override fun gatewayBridgeSource(gatewayBridgeSource: IResolvable) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(IResolvable::unwrap))
      }

      override fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty) {
        cdkBuilder.gatewayBridgeSource(gatewayBridgeSource.let(GatewayBridgeSourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("59af1f5ef7b61a09b7066cb3d6d56bbcc153a0fef7d5dae13da07b5541281d90")
      override
          fun gatewayBridgeSource(gatewayBridgeSource: GatewayBridgeSourceProperty.Builder.() -> Unit):
          Unit = gatewayBridgeSource(GatewayBridgeSourceProperty(gatewayBridgeSource))

      override fun ingestIp(ingestIp: String) {
        cdkBuilder.ingestIp(ingestIp)
      }

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

      override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      override fun sourceIngestPort(sourceIngestPort: String) {
        cdkBuilder.sourceIngestPort(sourceIngestPort)
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

      public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      override fun decryption(): Any? = unwrap(this).getDecryption()

      override fun description(): String? = unwrap(this).getDescription()

      override fun entitlementArn(): String? = unwrap(this).getEntitlementArn()

      override fun gatewayBridgeSource(): Any? = unwrap(this).getGatewayBridgeSource()

      override fun ingestIp(): String? = unwrap(this).getIngestIp()

      override fun ingestPort(): Number? = unwrap(this).getIngestPort()

      override fun maxBitrate(): Number? = unwrap(this).getMaxBitrate()

      override fun maxLatency(): Number? = unwrap(this).getMaxLatency()

      override fun minLatency(): Number? = unwrap(this).getMinLatency()

      override fun name(): String? = unwrap(this).getName()

      override fun protocol(): String? = unwrap(this).getProtocol()

      override fun senderControlPort(): Number? = unwrap(this).getSenderControlPort()

      override fun senderIpAddress(): String? = unwrap(this).getSenderIpAddress()

      override fun sourceArn(): String? = unwrap(this).getSourceArn()

      override fun sourceIngestPort(): String? = unwrap(this).getSourceIngestPort()

      override fun sourceListenerAddress(): String? = unwrap(this).getSourceListenerAddress()

      override fun sourceListenerPort(): Number? = unwrap(this).getSourceListenerPort()

      override fun streamId(): String? = unwrap(this).getStreamId()

      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()

      override fun whitelistCidr(): String? = unwrap(this).getWhitelistCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.SourceProperty
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
      @JvmName("e668c114dc639e8388a9195b1759d7621f6ce9cfc3d911d80839d3a718ad09a1")
      public
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty.Builder =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty.builder()

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
      @JvmName("e668c114dc639e8388a9195b1759d7621f6ce9cfc3d911d80839d3a718ad09a1")
      override
          fun vpcInterfaceAttachment(vpcInterfaceAttachment: VpcInterfaceAttachmentProperty.Builder.() -> Unit):
          Unit = vpcInterfaceAttachment(VpcInterfaceAttachmentProperty(vpcInterfaceAttachment))

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty):
          GatewayBridgeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GatewayBridgeSourceProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.GatewayBridgeSourceProperty
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
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty.builder()

      override fun vpcInterfaceName(vpcInterfaceName: String) {
        cdkBuilder.vpcInterfaceName(vpcInterfaceName)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty,
    ) : CdkObject(cdkObject), VpcInterfaceAttachmentProperty {
      override fun vpcInterfaceName(): String? = unwrap(this).getVpcInterfaceName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInterfaceAttachmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty):
          VpcInterfaceAttachmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInterfaceAttachmentProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconnect.CfnFlow.VpcInterfaceAttachmentProperty
    }
  }
}
