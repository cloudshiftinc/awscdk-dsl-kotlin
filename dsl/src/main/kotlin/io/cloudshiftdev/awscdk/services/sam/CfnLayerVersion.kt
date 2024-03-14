package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnLayerVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  public open fun compatibleRuntimes(`value`: List<String>) {
    unwrap(this).setCompatibleRuntimes(`value`)
  }

  public open fun contentUri(): Any? = unwrap(this).getContentUri()

  public open fun contentUri(`value`: String) {
    unwrap(this).setContentUri(`value`)
  }

  public open fun contentUri(`value`: IResolvable) {
    unwrap(this).setContentUri(`value`.let(IResolvable::unwrap))
  }

  public open fun contentUri(`value`: S3LocationProperty) {
    unwrap(this).setContentUri(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64c6c0278a22197e3ef06f16d82290aa89b5a4af0413dfd9222080261a0044d1")
  public open fun contentUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      contentUri(S3LocationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun layerName(): String? = unwrap(this).getLayerName()

  public open fun layerName(`value`: String) {
    unwrap(this).setLayerName(`value`)
  }

  public open fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  public open fun licenseInfo(`value`: String) {
    unwrap(this).setLicenseInfo(`value`)
  }

  public open fun retentionPolicy(): String? = unwrap(this).getRetentionPolicy()

  public open fun retentionPolicy(`value`: String) {
    unwrap(this).setRetentionPolicy(`value`)
  }

  public interface Builder {
    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    public fun contentUri(contentUri: String)

    public fun contentUri(contentUri: IResolvable)

    public fun contentUri(contentUri: S3LocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fff5b9dd1b6c0c48d29201034a530a992a3fc058d59ebc3b9811473f077de")
    public fun contentUri(contentUri: S3LocationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun layerName(layerName: String)

    public fun licenseInfo(licenseInfo: String)

    public fun retentionPolicy(retentionPolicy: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnLayerVersion.Builder =
        software.amazon.awscdk.services.sam.CfnLayerVersion.Builder.create(scope, id)

    override fun compatibleRuntimes(compatibleRuntimes: List<String>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes)
    }

    override fun contentUri(contentUri: String) {
      cdkBuilder.contentUri(contentUri)
    }

    override fun contentUri(contentUri: IResolvable) {
      cdkBuilder.contentUri(contentUri.let(IResolvable::unwrap))
    }

    override fun contentUri(contentUri: S3LocationProperty) {
      cdkBuilder.contentUri(contentUri.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fff5b9dd1b6c0c48d29201034a530a992a3fc058d59ebc3b9811473f077de")
    override fun contentUri(contentUri: S3LocationProperty.Builder.() -> Unit): Unit =
        contentUri(S3LocationProperty(contentUri))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    override fun retentionPolicy(retentionPolicy: String) {
      cdkBuilder.retentionPolicy(retentionPolicy)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnLayerVersion = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLayerVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLayerVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersion):
        CfnLayerVersion = CfnLayerVersion(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersion):
        software.amazon.awscdk.services.sam.CfnLayerVersion = wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String

    public fun version(): Number? = unwrap(this).getVersion()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)

      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty,
    ) : S3LocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()

      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnLayerVersion.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}