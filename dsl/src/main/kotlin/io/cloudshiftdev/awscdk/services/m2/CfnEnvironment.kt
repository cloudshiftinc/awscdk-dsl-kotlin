package io.cloudshiftdev.awscdk.services.m2

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

public open class CfnEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrEnvironmentArn(): String = unwrap(this).getAttrEnvironmentArn()

  public open fun attrEnvironmentId(): String = unwrap(this).getAttrEnvironmentId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun engineType(): String = unwrap(this).getEngineType()

  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public open fun highAvailabilityConfig(): Any? = unwrap(this).getHighAvailabilityConfig()

  public open fun highAvailabilityConfig(`value`: IResolvable) {
    unwrap(this).setHighAvailabilityConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun highAvailabilityConfig(`value`: HighAvailabilityConfigProperty) {
    unwrap(this).setHighAvailabilityConfig(`value`.let(HighAvailabilityConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d085a9507d655bfdb1d242e2757f51c3a4bf6c7b9c18622417b4ca0bba03a40a")
  public open
      fun highAvailabilityConfig(`value`: HighAvailabilityConfigProperty.Builder.() -> Unit): Unit =
      highAvailabilityConfig(HighAvailabilityConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceType(): String = unwrap(this).getInstanceType()

  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun storageConfigurations(): Any? = unwrap(this).getStorageConfigurations()

  public open fun storageConfigurations(`value`: IResolvable) {
    unwrap(this).setStorageConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun storageConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setStorageConfigurations(__idx_ac66f0)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun engineType(engineType: String) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
    }

    public fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13c8004696035f79c161d3284044479a55962b5eea499af16c24cab14b58fc3")
    public
        fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty.Builder.() -> Unit) {
    }

    public fun instanceType(instanceType: String) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun name(name: String) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    }

    public fun securityGroupIds(securityGroupIds: List<String>) {
    }

    public fun storageConfigurations(storageConfigurations: IResolvable) {
    }

    public fun storageConfigurations(storageConfigurations: List<Any>) {
    }

    public fun subnetIds(subnetIds: List<String>) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnEnvironment.Builder =
        software.amazon.awscdk.services.m2.CfnEnvironment.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun highAvailabilityConfig(highAvailabilityConfig: IResolvable) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(IResolvable::unwrap))
    }

    public override
        fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty) {
      cdkBuilder.highAvailabilityConfig(highAvailabilityConfig.let(HighAvailabilityConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13c8004696035f79c161d3284044479a55962b5eea499af16c24cab14b58fc3")
    public override
        fun highAvailabilityConfig(highAvailabilityConfig: HighAvailabilityConfigProperty.Builder.() -> Unit):
        Unit = highAvailabilityConfig(HighAvailabilityConfigProperty(highAvailabilityConfig))

    public override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    public override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    public override fun storageConfigurations(storageConfigurations: IResolvable) {
      cdkBuilder.storageConfigurations(storageConfigurations.let(IResolvable::unwrap))
    }

    public override fun storageConfigurations(storageConfigurations: List<Any>) {
      cdkBuilder.storageConfigurations(storageConfigurations)
    }

    public override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment): CfnEnvironment
        = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment): software.amazon.awscdk.services.m2.CfnEnvironment
        = wrapped.cdkObject
  }

  public interface HighAvailabilityConfigProperty {
    public fun desiredCapacity(): Number

    public interface Builder {
      public fun desiredCapacity(desiredCapacity: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty.Builder =
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty.builder()

      public override fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty,
    ) : HighAvailabilityConfigProperty {
      public override fun desiredCapacity(): Number = unwrap(this).getDesiredCapacity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HighAvailabilityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty):
          HighAvailabilityConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HighAvailabilityConfigProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.HighAvailabilityConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FsxStorageConfigurationProperty {
    public fun fileSystemId(): String

    public fun mountPoint(): String

    public interface Builder {
      public fun fileSystemId(fileSystemId: String) {
      }

      public fun mountPoint(mountPoint: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty.builder()

      public override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      public override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty,
    ) : FsxStorageConfigurationProperty {
      public override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      public override fun mountPoint(): String = unwrap(this).getMountPoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FsxStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty):
          FsxStorageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FsxStorageConfigurationProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.FsxStorageConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StorageConfigurationProperty {
    public fun efs(): Any? = unwrap(this).getEfs()

    public fun fsx(): Any? = unwrap(this).getFsx()

    public interface Builder {
      public fun efs(efs: IResolvable) {
      }

      public fun efs(efs: EfsStorageConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982d2400e5a435958f70a095a68506a24c3648d545f05972d6a19ddea904890d")
      public fun efs(efs: EfsStorageConfigurationProperty.Builder.() -> Unit) {
      }

      public fun fsx(fsx: IResolvable) {
      }

      public fun fsx(fsx: FsxStorageConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0448502b2b34b463b25365a9992a1755098f720f79da3f879db4023f8ca786b4")
      public fun fsx(fsx: FsxStorageConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty.Builder =
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty.builder()

      public override fun efs(efs: IResolvable) {
        cdkBuilder.efs(efs.let(IResolvable::unwrap))
      }

      public override fun efs(efs: EfsStorageConfigurationProperty) {
        cdkBuilder.efs(efs.let(EfsStorageConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("982d2400e5a435958f70a095a68506a24c3648d545f05972d6a19ddea904890d")
      public override fun efs(efs: EfsStorageConfigurationProperty.Builder.() -> Unit): Unit =
          efs(EfsStorageConfigurationProperty(efs))

      public override fun fsx(fsx: IResolvable) {
        cdkBuilder.fsx(fsx.let(IResolvable::unwrap))
      }

      public override fun fsx(fsx: FsxStorageConfigurationProperty) {
        cdkBuilder.fsx(fsx.let(FsxStorageConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0448502b2b34b463b25365a9992a1755098f720f79da3f879db4023f8ca786b4")
      public override fun fsx(fsx: FsxStorageConfigurationProperty.Builder.() -> Unit): Unit =
          fsx(FsxStorageConfigurationProperty(fsx))

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty,
    ) : StorageConfigurationProperty {
      public override fun efs(): Any? = unwrap(this).getEfs()

      public override fun fsx(): Any? = unwrap(this).getFsx()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty):
          StorageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageConfigurationProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.StorageConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface EfsStorageConfigurationProperty {
    public fun fileSystemId(): String

    public fun mountPoint(): String

    public interface Builder {
      public fun fileSystemId(fileSystemId: String) {
      }

      public fun mountPoint(mountPoint: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty.builder()

      public override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      public override fun mountPoint(mountPoint: String) {
        cdkBuilder.mountPoint(mountPoint)
      }

      public fun build():
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty,
    ) : EfsStorageConfigurationProperty {
      public override fun fileSystemId(): String = unwrap(this).getFileSystemId()

      public override fun mountPoint(): String = unwrap(this).getMountPoint()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EfsStorageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty):
          EfsStorageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EfsStorageConfigurationProperty):
          software.amazon.awscdk.services.m2.CfnEnvironment.EfsStorageConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
