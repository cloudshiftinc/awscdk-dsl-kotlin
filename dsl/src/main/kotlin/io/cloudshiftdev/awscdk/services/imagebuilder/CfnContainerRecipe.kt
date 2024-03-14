package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnContainerRecipe internal constructor(
  private val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun components(): Any = unwrap(this).getComponents()

  public open fun components(`value`: IResolvable) {
    unwrap(this).setComponents(`value`.let(IResolvable::unwrap))
  }

  public open fun components(__idx_ac66f0: List<Any>) {
    unwrap(this).setComponents(__idx_ac66f0)
  }

  public open fun containerType(): String = unwrap(this).getContainerType()

  public open fun containerType(`value`: String) {
    unwrap(this).setContainerType(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun dockerfileTemplateData(): String? = unwrap(this).getDockerfileTemplateData()

  public open fun dockerfileTemplateData(`value`: String) {
    unwrap(this).setDockerfileTemplateData(`value`)
  }

  public open fun dockerfileTemplateUri(): String? = unwrap(this).getDockerfileTemplateUri()

  public open fun dockerfileTemplateUri(`value`: String) {
    unwrap(this).setDockerfileTemplateUri(`value`)
  }

  public open fun imageOsVersionOverride(): String? = unwrap(this).getImageOsVersionOverride()

  public open fun imageOsVersionOverride(`value`: String) {
    unwrap(this).setImageOsVersionOverride(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceConfiguration(): Any? = unwrap(this).getInstanceConfiguration()

  public open fun instanceConfiguration(`value`: IResolvable) {
    unwrap(this).setInstanceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty) {
    unwrap(this).setInstanceConfiguration(`value`.let(InstanceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec0928d99e8483af1b55a56acd0433fb7078d6ed031b5cb1f61f9f5f8aa09bec")
  public open fun instanceConfiguration(`value`: InstanceConfigurationProperty.Builder.() -> Unit):
      Unit = instanceConfiguration(InstanceConfigurationProperty(`value`))

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun parentImage(): String = unwrap(this).getParentImage()

  public open fun parentImage(`value`: String) {
    unwrap(this).setParentImage(`value`)
  }

  public open fun platformOverride(): String? = unwrap(this).getPlatformOverride()

  public open fun platformOverride(`value`: String) {
    unwrap(this).setPlatformOverride(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun targetRepository(): Any = unwrap(this).getTargetRepository()

  public open fun targetRepository(`value`: IResolvable) {
    unwrap(this).setTargetRepository(`value`.let(IResolvable::unwrap))
  }

  public open fun targetRepository(`value`: TargetContainerRepositoryProperty) {
    unwrap(this).setTargetRepository(`value`.let(TargetContainerRepositoryProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad6a49bfdd1913b405ff2399336a97538d670e1fbba894655ad550d2f1118d11")
  public open fun targetRepository(`value`: TargetContainerRepositoryProperty.Builder.() -> Unit):
      Unit = targetRepository(TargetContainerRepositoryProperty(`value`))

  public open fun version(): String = unwrap(this).getVersion()

  public open fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  public open fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  public open fun workingDirectory(`value`: String) {
    unwrap(this).setWorkingDirectory(`value`)
  }

  public interface Builder {
    public fun components(components: IResolvable) {
    }

    public fun components(components: List<Any>) {
    }

    public fun containerType(containerType: String) {
    }

    public fun description(description: String) {
    }

    public fun dockerfileTemplateData(dockerfileTemplateData: String) {
    }

    public fun dockerfileTemplateUri(dockerfileTemplateUri: String) {
    }

    public fun imageOsVersionOverride(imageOsVersionOverride: String) {
    }

    public fun instanceConfiguration(instanceConfiguration: IResolvable) {
    }

    public fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e62bcc17da358c8cd2d05f7835b4ebe7211154b004e920f5cfc1cd52cb988a")
    public
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun name(name: String) {
    }

    public fun parentImage(parentImage: String) {
    }

    public fun platformOverride(platformOverride: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun targetRepository(targetRepository: IResolvable) {
    }

    public fun targetRepository(targetRepository: TargetContainerRepositoryProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d659bd845247566ecc8c19a97fcb38f2cc4de18b9b4117e2a1abb2c46a37fe8e")
    public
        fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit) {
    }

    public fun version(version: String) {
    }

    public fun workingDirectory(workingDirectory: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.Builder
        = software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.Builder.create(scope, id)

    public override fun components(components: IResolvable) {
      cdkBuilder.components(components.let(IResolvable::unwrap))
    }

    public override fun components(components: List<Any>) {
      cdkBuilder.components(components)
    }

    public override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun dockerfileTemplateData(dockerfileTemplateData: String) {
      cdkBuilder.dockerfileTemplateData(dockerfileTemplateData)
    }

    public override fun dockerfileTemplateUri(dockerfileTemplateUri: String) {
      cdkBuilder.dockerfileTemplateUri(dockerfileTemplateUri)
    }

    public override fun imageOsVersionOverride(imageOsVersionOverride: String) {
      cdkBuilder.imageOsVersionOverride(imageOsVersionOverride)
    }

    public override fun instanceConfiguration(instanceConfiguration: IResolvable) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty) {
      cdkBuilder.instanceConfiguration(instanceConfiguration.let(InstanceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09e62bcc17da358c8cd2d05f7835b4ebe7211154b004e920f5cfc1cd52cb988a")
    public override
        fun instanceConfiguration(instanceConfiguration: InstanceConfigurationProperty.Builder.() -> Unit):
        Unit = instanceConfiguration(InstanceConfigurationProperty(instanceConfiguration))

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun parentImage(parentImage: String) {
      cdkBuilder.parentImage(parentImage)
    }

    public override fun platformOverride(platformOverride: String) {
      cdkBuilder.platformOverride(platformOverride)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun targetRepository(targetRepository: IResolvable) {
      cdkBuilder.targetRepository(targetRepository.let(IResolvable::unwrap))
    }

    public override fun targetRepository(targetRepository: TargetContainerRepositoryProperty) {
      cdkBuilder.targetRepository(targetRepository.let(TargetContainerRepositoryProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d659bd845247566ecc8c19a97fcb38f2cc4de18b9b4117e2a1abb2c46a37fe8e")
    public override
        fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit):
        Unit = targetRepository(TargetContainerRepositoryProperty(targetRepository))

    public override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContainerRecipe {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContainerRecipe(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe):
        CfnContainerRecipe = CfnContainerRecipe(cdkObject)

    internal fun unwrap(wrapped: CfnContainerRecipe):
        software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe = wrapped.cdkObject
  }

  public interface ComponentParameterProperty {
    public fun name(): String

    public fun `value`(): List<String>

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: List<String>) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty,
    ) : ComponentParameterProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): List<String> = unwrap(this).getValue() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty):
          ComponentParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentParameterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EbsInstanceBlockDeviceSpecificationProperty {
    public fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

    public fun encrypted(): Any? = unwrap(this).getEncrypted()

    public fun iops(): Number? = unwrap(this).getIops()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun snapshotId(): String? = unwrap(this).getSnapshotId()

    public fun throughput(): Number? = unwrap(this).getThroughput()

    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    public fun volumeType(): String? = unwrap(this).getVolumeType()

    public interface Builder {
      public fun deleteOnTermination(deleteOnTermination: Boolean) {
      }

      public fun deleteOnTermination(deleteOnTermination: IResolvable) {
      }

      public fun encrypted(encrypted: Boolean) {
      }

      public fun encrypted(encrypted: IResolvable) {
      }

      public fun iops(iops: Number) {
      }

      public fun kmsKeyId(kmsKeyId: String) {
      }

      public fun snapshotId(snapshotId: String) {
      }

      public fun throughput(throughput: Number) {
      }

      public fun volumeSize(volumeSize: Number) {
      }

      public fun volumeType(volumeType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty.builder()

      public override fun deleteOnTermination(deleteOnTermination: Boolean) {
        cdkBuilder.deleteOnTermination(deleteOnTermination)
      }

      public override fun deleteOnTermination(deleteOnTermination: IResolvable) {
        cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
      }

      public override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      public override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      public override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      public override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public override fun snapshotId(snapshotId: String) {
        cdkBuilder.snapshotId(snapshotId)
      }

      public override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      public override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      public override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty,
    ) : EbsInstanceBlockDeviceSpecificationProperty {
      public override fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

      public override fun encrypted(): Any? = unwrap(this).getEncrypted()

      public override fun iops(): Number? = unwrap(this).getIops()

      public override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      public override fun snapshotId(): String? = unwrap(this).getSnapshotId()

      public override fun throughput(): Number? = unwrap(this).getThroughput()

      public override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      public override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EbsInstanceBlockDeviceSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty):
          EbsInstanceBlockDeviceSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EbsInstanceBlockDeviceSpecificationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.EbsInstanceBlockDeviceSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ComponentConfigurationProperty {
    public fun componentArn(): String? = unwrap(this).getComponentArn()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public interface Builder {
      public fun componentArn(componentArn: String) {
      }

      public fun parameters(parameters: IResolvable) {
      }

      public fun parameters(parameters: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty.builder()

      public override fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
      }

      public override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      public override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty,
    ) : ComponentConfigurationProperty {
      public override fun componentArn(): String? = unwrap(this).getComponentArn()

      public override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty):
          ComponentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.ComponentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TargetContainerRepositoryProperty {
    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    public fun service(): String? = unwrap(this).getService()

    public interface Builder {
      public fun repositoryName(repositoryName: String) {
      }

      public fun service(service: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty.builder()

      public override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      public override fun service(service: String) {
        cdkBuilder.service(service)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty,
    ) : TargetContainerRepositoryProperty {
      public override fun repositoryName(): String? = unwrap(this).getRepositoryName()

      public override fun service(): String? = unwrap(this).getService()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetContainerRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty):
          TargetContainerRepositoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetContainerRepositoryProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.TargetContainerRepositoryProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceBlockDeviceMappingProperty {
    public fun deviceName(): String? = unwrap(this).getDeviceName()

    public fun ebs(): Any? = unwrap(this).getEbs()

    public fun noDevice(): String? = unwrap(this).getNoDevice()

    public fun virtualName(): String? = unwrap(this).getVirtualName()

    public interface Builder {
      public fun deviceName(deviceName: String) {
      }

      public fun ebs(ebs: IResolvable) {
      }

      public fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d805bca8ddeaeb2aace425ac7d011fce15357f0cc16a2c00a08c218985ec5a3a")
      public fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit) {
      }

      public fun noDevice(noDevice: String) {
      }

      public fun virtualName(virtualName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty.builder()

      public override fun deviceName(deviceName: String) {
        cdkBuilder.deviceName(deviceName)
      }

      public override fun ebs(ebs: IResolvable) {
        cdkBuilder.ebs(ebs.let(IResolvable::unwrap))
      }

      public override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty) {
        cdkBuilder.ebs(ebs.let(EbsInstanceBlockDeviceSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d805bca8ddeaeb2aace425ac7d011fce15357f0cc16a2c00a08c218985ec5a3a")
      public override fun ebs(ebs: EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit):
          Unit = ebs(EbsInstanceBlockDeviceSpecificationProperty(ebs))

      public override fun noDevice(noDevice: String) {
        cdkBuilder.noDevice(noDevice)
      }

      public override fun virtualName(virtualName: String) {
        cdkBuilder.virtualName(virtualName)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty,
    ) : InstanceBlockDeviceMappingProperty {
      public override fun deviceName(): String? = unwrap(this).getDeviceName()

      public override fun ebs(): Any? = unwrap(this).getEbs()

      public override fun noDevice(): String? = unwrap(this).getNoDevice()

      public override fun virtualName(): String? = unwrap(this).getVirtualName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceBlockDeviceMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty):
          InstanceBlockDeviceMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceBlockDeviceMappingProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceBlockDeviceMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceConfigurationProperty {
    public fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

    public fun image(): String? = unwrap(this).getImage()

    public interface Builder {
      public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
      }

      public fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
      }

      public fun image(image: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty.builder()

      public override fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings.let(IResolvable::unwrap))
      }

      public override fun blockDeviceMappings(blockDeviceMappings: List<Any>) {
        cdkBuilder.blockDeviceMappings(blockDeviceMappings)
      }

      public override fun image(image: String) {
        cdkBuilder.image(image)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty,
    ) : InstanceConfigurationProperty {
      public override fun blockDeviceMappings(): Any? = unwrap(this).getBlockDeviceMappings()

      public override fun image(): String? = unwrap(this).getImage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty):
          InstanceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe.InstanceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
