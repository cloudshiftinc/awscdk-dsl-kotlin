@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplicationVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sourceBundle(): Any = unwrap(this).getSourceBundle()

  public open fun sourceBundle(`value`: IResolvable) {
    unwrap(this).setSourceBundle(`value`.let(IResolvable::unwrap))
  }

  public open fun sourceBundle(`value`: SourceBundleProperty) {
    unwrap(this).setSourceBundle(`value`.let(SourceBundleProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eae3db08aef7d90cdb8308388f10fe050b8ae668e69290b96a8a630737e1483f")
  public open fun sourceBundle(`value`: SourceBundleProperty.Builder.() -> Unit): Unit =
      sourceBundle(SourceBundleProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun description(description: String)

    public fun sourceBundle(sourceBundle: IResolvable)

    public fun sourceBundle(sourceBundle: SourceBundleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f795ae77678e6d15ed6b87c69dba1d60f35d044bf88ac97674c8556ff79d25a8")
    public fun sourceBundle(sourceBundle: SourceBundleProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.Builder.create(scope,
        id)

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun sourceBundle(sourceBundle: IResolvable) {
      cdkBuilder.sourceBundle(sourceBundle.let(IResolvable::unwrap))
    }

    override fun sourceBundle(sourceBundle: SourceBundleProperty) {
      cdkBuilder.sourceBundle(sourceBundle.let(SourceBundleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f795ae77678e6d15ed6b87c69dba1d60f35d044bf88ac97674c8556ff79d25a8")
    override fun sourceBundle(sourceBundle: SourceBundleProperty.Builder.() -> Unit): Unit =
        sourceBundle(SourceBundleProperty(sourceBundle))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion):
        CfnApplicationVersion = CfnApplicationVersion(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationVersion):
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion = wrapped.cdkObject
  }

  public interface SourceBundleProperty {
    public fun s3Bucket(): String

    public fun s3Key(): String

    @CdkDslMarker
    public interface Builder {
      public fun s3Bucket(s3Bucket: String)

      public fun s3Key(s3Key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder
          =
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.builder()

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      public fun build():
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty,
    ) : CdkObject(cdkObject), SourceBundleProperty {
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      override fun s3Key(): String = unwrap(this).getS3Key()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceBundleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty):
          SourceBundleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceBundleProperty):
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty
    }
  }
}