@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstanceFleetConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun clusterId(): String = unwrap(this).getClusterId()

  public open fun clusterId(`value`: String) {
    unwrap(this).setClusterId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceFleetType(): String = unwrap(this).getInstanceFleetType()

  public open fun instanceFleetType(`value`: String) {
    unwrap(this).setInstanceFleetType(`value`)
  }

  public open fun instanceTypeConfigs(): Any? = unwrap(this).getInstanceTypeConfigs()

  public open fun instanceTypeConfigs(`value`: IResolvable) {
    unwrap(this).setInstanceTypeConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceTypeConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setInstanceTypeConfigs(__idx_ac66f0)
  }

  public open fun instanceTypeConfigs(vararg __idx_ac66f0: Any): Unit =
      instanceTypeConfigs(__idx_ac66f0.toList())

  public open fun launchSpecifications(): Any? = unwrap(this).getLaunchSpecifications()

  public open fun launchSpecifications(`value`: IResolvable) {
    unwrap(this).setLaunchSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun launchSpecifications(`value`: InstanceFleetProvisioningSpecificationsProperty) {
    unwrap(this).setLaunchSpecifications(`value`.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("59463fc90141d3db0594e562d25534fc10970df80ba58a791c6e74504ce572c3")
  public open
      fun launchSpecifications(`value`: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
      Unit = launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun targetOnDemandCapacity(): Number? = unwrap(this).getTargetOnDemandCapacity()

  public open fun targetOnDemandCapacity(`value`: Number) {
    unwrap(this).setTargetOnDemandCapacity(`value`)
  }

  public open fun targetSpotCapacity(): Number? = unwrap(this).getTargetSpotCapacity()

  public open fun targetSpotCapacity(`value`: Number) {
    unwrap(this).setTargetSpotCapacity(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun clusterId(clusterId: String)

    public fun instanceFleetType(instanceFleetType: String)

    public fun instanceTypeConfigs(instanceTypeConfigs: IResolvable)

    public fun instanceTypeConfigs(instanceTypeConfigs: List<Any>)

    public fun instanceTypeConfigs(vararg instanceTypeConfigs: Any)

    public fun launchSpecifications(launchSpecifications: IResolvable)

    public
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3f74ea9b1d554ae601b9ffdba85400e95b5dba44cb815f9838f8e9d46262fd9")
    public
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun targetOnDemandCapacity(targetOnDemandCapacity: Number)

    public fun targetSpotCapacity(targetSpotCapacity: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.Builder =
        software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.Builder.create(scope, id)

    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    override fun instanceFleetType(instanceFleetType: String) {
      cdkBuilder.instanceFleetType(instanceFleetType)
    }

    override fun instanceTypeConfigs(instanceTypeConfigs: IResolvable) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs.let(IResolvable::unwrap))
    }

    override fun instanceTypeConfigs(instanceTypeConfigs: List<Any>) {
      cdkBuilder.instanceTypeConfigs(instanceTypeConfigs)
    }

    override fun instanceTypeConfigs(vararg instanceTypeConfigs: Any): Unit =
        instanceTypeConfigs(instanceTypeConfigs.toList())

    override fun launchSpecifications(launchSpecifications: IResolvable) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(IResolvable::unwrap))
    }

    override
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty) {
      cdkBuilder.launchSpecifications(launchSpecifications.let(InstanceFleetProvisioningSpecificationsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3f74ea9b1d554ae601b9ffdba85400e95b5dba44cb815f9838f8e9d46262fd9")
    override
        fun launchSpecifications(launchSpecifications: InstanceFleetProvisioningSpecificationsProperty.Builder.() -> Unit):
        Unit =
        launchSpecifications(InstanceFleetProvisioningSpecificationsProperty(launchSpecifications))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun targetOnDemandCapacity(targetOnDemandCapacity: Number) {
      cdkBuilder.targetOnDemandCapacity(targetOnDemandCapacity)
    }

    override fun targetSpotCapacity(targetSpotCapacity: Number) {
      cdkBuilder.targetSpotCapacity(targetSpotCapacity)
    }

    public fun build(): software.amazon.awscdk.services.emr.CfnInstanceFleetConfig =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstanceFleetConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstanceFleetConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig):
        CfnInstanceFleetConfig = CfnInstanceFleetConfig(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceFleetConfig):
        software.amazon.awscdk.services.emr.CfnInstanceFleetConfig = wrapped.cdkObject
  }

  public interface EbsConfigurationProperty {
    public fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

    public fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()

    @CdkDslMarker
    public interface Builder {
      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable)

      public fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>)

      public fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any)

      public fun ebsOptimized(ebsOptimized: Boolean)

      public fun ebsOptimized(ebsOptimized: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty.builder()

      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: IResolvable) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.let(IResolvable::unwrap))
      }

      override fun ebsBlockDeviceConfigs(ebsBlockDeviceConfigs: List<Any>) {
        cdkBuilder.ebsBlockDeviceConfigs(ebsBlockDeviceConfigs)
      }

      override fun ebsBlockDeviceConfigs(vararg ebsBlockDeviceConfigs: Any): Unit =
          ebsBlockDeviceConfigs(ebsBlockDeviceConfigs.toList())

      override fun ebsOptimized(ebsOptimized: Boolean) {
        cdkBuilder.ebsOptimized(ebsOptimized)
      }

      override fun ebsOptimized(ebsOptimized: IResolvable) {
        cdkBuilder.ebsOptimized(ebsOptimized.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty,
    ) : CdkObject(cdkObject), EbsConfigurationProperty {
      override fun ebsBlockDeviceConfigs(): Any? = unwrap(this).getEbsBlockDeviceConfigs()

      override fun ebsOptimized(): Any? = unwrap(this).getEbsOptimized()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty):
          EbsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsConfigurationProperty
    }
  }

  public interface OnDemandProvisioningSpecificationProperty {
    public fun allocationStrategy(): String

    @CdkDslMarker
    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty.builder()

      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), OnDemandProvisioningSpecificationProperty {
      override fun allocationStrategy(): String = unwrap(this).getAllocationStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          OnDemandProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty):
          OnDemandProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnDemandProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.OnDemandProvisioningSpecificationProperty
    }
  }

  public interface ConfigurationProperty {
    public fun classification(): String? = unwrap(this).getClassification()

    public fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    @CdkDslMarker
    public interface Builder {
      public fun classification(classification: String)

      public fun configurationProperties(configurationProperties: IResolvable)

      public fun configurationProperties(configurationProperties: Map<String, String>)

      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: List<Any>)

      public fun configurations(vararg configurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.Builder =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty.builder()

      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      override fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties.let(IResolvable::unwrap))
      }

      override fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
      }

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty,
    ) : CdkObject(cdkObject), ConfigurationProperty {
      override fun classification(): String? = unwrap(this).getClassification()

      override fun configurationProperties(): Any? = unwrap(this).getConfigurationProperties()

      override fun configurations(): Any? = unwrap(this).getConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty):
          ConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.ConfigurationProperty
    }
  }

  public interface EbsBlockDeviceConfigProperty {
    public fun volumeSpecification(): Any

    public fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()

    @CdkDslMarker
    public interface Builder {
      public fun volumeSpecification(volumeSpecification: IResolvable)

      public fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f563601bc0cff8fe8978211b8b5efe67eccc0935bce406e80f312dbf2d6bc9")
      public
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit)

      public fun volumesPerInstance(volumesPerInstance: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty.builder()

      override fun volumeSpecification(volumeSpecification: IResolvable) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(IResolvable::unwrap))
      }

      override fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty) {
        cdkBuilder.volumeSpecification(volumeSpecification.let(VolumeSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("90f563601bc0cff8fe8978211b8b5efe67eccc0935bce406e80f312dbf2d6bc9")
      override
          fun volumeSpecification(volumeSpecification: VolumeSpecificationProperty.Builder.() -> Unit):
          Unit = volumeSpecification(VolumeSpecificationProperty(volumeSpecification))

      override fun volumesPerInstance(volumesPerInstance: Number) {
        cdkBuilder.volumesPerInstance(volumesPerInstance)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty,
    ) : CdkObject(cdkObject), EbsBlockDeviceConfigProperty {
      override fun volumeSpecification(): Any = unwrap(this).getVolumeSpecification()

      override fun volumesPerInstance(): Number? = unwrap(this).getVolumesPerInstance()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EbsBlockDeviceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty):
          EbsBlockDeviceConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsBlockDeviceConfigProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.EbsBlockDeviceConfigProperty
    }
  }

  public interface SpotProvisioningSpecificationProperty {
    public fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

    public fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

    public fun timeoutAction(): String

    public fun timeoutDurationMinutes(): Number

    @CdkDslMarker
    public interface Builder {
      public fun allocationStrategy(allocationStrategy: String)

      public fun blockDurationMinutes(blockDurationMinutes: Number)

      public fun timeoutAction(timeoutAction: String)

      public fun timeoutDurationMinutes(timeoutDurationMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty.builder()

      override fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
      }

      override fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
      }

      override fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
      }

      override fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty,
    ) : CdkObject(cdkObject), SpotProvisioningSpecificationProperty {
      override fun allocationStrategy(): String? = unwrap(this).getAllocationStrategy()

      override fun blockDurationMinutes(): Number? = unwrap(this).getBlockDurationMinutes()

      override fun timeoutAction(): String = unwrap(this).getTimeoutAction()

      override fun timeoutDurationMinutes(): Number = unwrap(this).getTimeoutDurationMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SpotProvisioningSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty):
          SpotProvisioningSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpotProvisioningSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.SpotProvisioningSpecificationProperty
    }
  }

  public interface InstanceTypeConfigProperty {
    public fun bidPrice(): String? = unwrap(this).getBidPrice()

    public fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
        unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

    public fun configurations(): Any? = unwrap(this).getConfigurations()

    public fun customAmiId(): String? = unwrap(this).getCustomAmiId()

    public fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

    public fun instanceType(): String

    public fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()

    @CdkDslMarker
    public interface Builder {
      public fun bidPrice(bidPrice: String)

      public fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number)

      public fun configurations(configurations: IResolvable)

      public fun configurations(configurations: List<Any>)

      public fun configurations(vararg configurations: Any)

      public fun customAmiId(customAmiId: String)

      public fun ebsConfiguration(ebsConfiguration: IResolvable)

      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("999d0f487e09e440d0c0b84be779862db4ba6ef5f90ffde2250d398c6529e2bf")
      public fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit)

      public fun instanceType(instanceType: String)

      public fun weightedCapacity(weightedCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty.builder()

      override fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
      }

      override
          fun bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice: Number) {
        cdkBuilder.bidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice)
      }

      override fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations.let(IResolvable::unwrap))
      }

      override fun configurations(configurations: List<Any>) {
        cdkBuilder.configurations(configurations)
      }

      override fun configurations(vararg configurations: Any): Unit =
          configurations(configurations.toList())

      override fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
      }

      override fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(IResolvable::unwrap))
      }

      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration.let(EbsConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("999d0f487e09e440d0c0b84be779862db4ba6ef5f90ffde2250d398c6529e2bf")
      override fun ebsConfiguration(ebsConfiguration: EbsConfigurationProperty.Builder.() -> Unit):
          Unit = ebsConfiguration(EbsConfigurationProperty(ebsConfiguration))

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      override fun weightedCapacity(weightedCapacity: Number) {
        cdkBuilder.weightedCapacity(weightedCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty,
    ) : CdkObject(cdkObject), InstanceTypeConfigProperty {
      override fun bidPrice(): String? = unwrap(this).getBidPrice()

      override fun bidPriceAsPercentageOfOnDemandPrice(): Number? =
          unwrap(this).getBidPriceAsPercentageOfOnDemandPrice()

      override fun configurations(): Any? = unwrap(this).getConfigurations()

      override fun customAmiId(): String? = unwrap(this).getCustomAmiId()

      override fun ebsConfiguration(): Any? = unwrap(this).getEbsConfiguration()

      override fun instanceType(): String = unwrap(this).getInstanceType()

      override fun weightedCapacity(): Number? = unwrap(this).getWeightedCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceTypeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty):
          InstanceTypeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceTypeConfigProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceTypeConfigProperty
    }
  }

  public interface VolumeSpecificationProperty {
    public fun iops(): Number? = unwrap(this).getIops()

    public fun sizeInGb(): Number

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeType(): String

    @CdkDslMarker
    public interface Builder {
      public fun iops(iops: Number)

      public fun sizeInGb(sizeInGb: Number)

      public fun throughput(throughput: Number)

      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty.builder()

      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      override fun sizeInGb(sizeInGb: Number) {
        cdkBuilder.sizeInGb(sizeInGb)
      }

      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty,
    ) : CdkObject(cdkObject), VolumeSpecificationProperty {
      override fun iops(): Number? = unwrap(this).getIops()

      override fun sizeInGb(): Number = unwrap(this).getSizeInGb()

      override fun throughput(): Number? = unwrap(this).getThroughput()

      override fun volumeType(): String = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VolumeSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty):
          VolumeSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VolumeSpecificationProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.VolumeSpecificationProperty
    }
  }

  public interface InstanceFleetProvisioningSpecificationsProperty {
    public fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

    public fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()

    @CdkDslMarker
    public interface Builder {
      public fun onDemandSpecification(onDemandSpecification: IResolvable)

      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6e3f21606b4de7054e8b9b81faf0552c480fe77fd8cf07532502405e65bf1c")
      public
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit)

      public fun spotSpecification(spotSpecification: IResolvable)

      public fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adf4fa6f990e98f7c46c7bfa05dc84b8118c0023a37aef58de9fc82d05931529")
      public
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.Builder
          =
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty.builder()

      override fun onDemandSpecification(onDemandSpecification: IResolvable) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(IResolvable::unwrap))
      }

      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty) {
        cdkBuilder.onDemandSpecification(onDemandSpecification.let(OnDemandProvisioningSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab6e3f21606b4de7054e8b9b81faf0552c480fe77fd8cf07532502405e65bf1c")
      override
          fun onDemandSpecification(onDemandSpecification: OnDemandProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit =
          onDemandSpecification(OnDemandProvisioningSpecificationProperty(onDemandSpecification))

      override fun spotSpecification(spotSpecification: IResolvable) {
        cdkBuilder.spotSpecification(spotSpecification.let(IResolvable::unwrap))
      }

      override fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty) {
        cdkBuilder.spotSpecification(spotSpecification.let(SpotProvisioningSpecificationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("adf4fa6f990e98f7c46c7bfa05dc84b8118c0023a37aef58de9fc82d05931529")
      override
          fun spotSpecification(spotSpecification: SpotProvisioningSpecificationProperty.Builder.() -> Unit):
          Unit = spotSpecification(SpotProvisioningSpecificationProperty(spotSpecification))

      public fun build():
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty,
    ) : CdkObject(cdkObject), InstanceFleetProvisioningSpecificationsProperty {
      override fun onDemandSpecification(): Any? = unwrap(this).getOnDemandSpecification()

      override fun spotSpecification(): Any? = unwrap(this).getSpotSpecification()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceFleetProvisioningSpecificationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty):
          InstanceFleetProvisioningSpecificationsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceFleetProvisioningSpecificationsProperty):
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.emr.CfnInstanceFleetConfig.InstanceFleetProvisioningSpecificationsProperty
    }
  }
}