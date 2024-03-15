@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.internetmonitor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMonitor internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public open fun attrMonitorArn(): String = unwrap(this).getAttrMonitorArn()

  public open fun attrProcessingStatus(): String = unwrap(this).getAttrProcessingStatus()

  public open fun attrProcessingStatusInfo(): String = unwrap(this).getAttrProcessingStatusInfo()

  public open fun healthEventsConfig(): Any? = unwrap(this).getHealthEventsConfig()

  public open fun healthEventsConfig(`value`: IResolvable) {
    unwrap(this).setHealthEventsConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun healthEventsConfig(`value`: HealthEventsConfigProperty) {
    unwrap(this).setHealthEventsConfig(`value`.let(HealthEventsConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ac37fd3ad16b9a64a08b44b4f8bc327af787af9733c8ce04e49b4f569e603904")
  public open fun healthEventsConfig(`value`: HealthEventsConfigProperty.Builder.() -> Unit): Unit =
      healthEventsConfig(HealthEventsConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun internetMeasurementsLogDelivery(): Any? =
      unwrap(this).getInternetMeasurementsLogDelivery()

  public open fun internetMeasurementsLogDelivery(`value`: IResolvable) {
    unwrap(this).setInternetMeasurementsLogDelivery(`value`.let(IResolvable::unwrap))
  }

  public open
      fun internetMeasurementsLogDelivery(`value`: InternetMeasurementsLogDeliveryProperty) {
    unwrap(this).setInternetMeasurementsLogDelivery(`value`.let(InternetMeasurementsLogDeliveryProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3728d57b5a81cc142b977d9c1fabe327859a9d47dbb2864ae42e1f477331df9")
  public open
      fun internetMeasurementsLogDelivery(`value`: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
      Unit = internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty(`value`))

  public open fun maxCityNetworksToMonitor(): Number? = unwrap(this).getMaxCityNetworksToMonitor()

  public open fun maxCityNetworksToMonitor(`value`: Number) {
    unwrap(this).setMaxCityNetworksToMonitor(`value`)
  }

  public open fun monitorName(): String = unwrap(this).getMonitorName()

  public open fun monitorName(`value`: String) {
    unwrap(this).setMonitorName(`value`)
  }

  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public open fun resources(`value`: List<String>) {
    unwrap(this).setResources(`value`)
  }

  public open fun resources(vararg `value`: String): Unit = resources(`value`.toList())

  public open fun resourcesToAdd(): List<String> = unwrap(this).getResourcesToAdd() ?: emptyList()

  public open fun resourcesToAdd(`value`: List<String>) {
    unwrap(this).setResourcesToAdd(`value`)
  }

  public open fun resourcesToAdd(vararg `value`: String): Unit = resourcesToAdd(`value`.toList())

  public open fun resourcesToRemove(): List<String> = unwrap(this).getResourcesToRemove() ?:
      emptyList()

  public open fun resourcesToRemove(`value`: List<String>) {
    unwrap(this).setResourcesToRemove(`value`)
  }

  public open fun resourcesToRemove(vararg `value`: String): Unit =
      resourcesToRemove(`value`.toList())

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun trafficPercentageToMonitor(): Number? =
      unwrap(this).getTrafficPercentageToMonitor()

  public open fun trafficPercentageToMonitor(`value`: Number) {
    unwrap(this).setTrafficPercentageToMonitor(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun healthEventsConfig(healthEventsConfig: IResolvable)

    public fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05a560a3c40f38371339032cfd1a3ffdeb5ffb50a6de313facf159c12d1e230")
    public fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty.Builder.() -> Unit)

    public fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable)

    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89746903b7257412fcb57282231d673b152595e7bb530f29d5ff2306c6f9ec45")
    public
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit)

    public fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number)

    public fun monitorName(monitorName: String)

    public fun resources(resources: List<String>)

    public fun resources(vararg resources: String)

    public fun resourcesToAdd(resourcesToAdd: List<String>)

    public fun resourcesToAdd(vararg resourcesToAdd: String)

    public fun resourcesToRemove(resourcesToRemove: List<String>)

    public fun resourcesToRemove(vararg resourcesToRemove: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.internetmonitor.CfnMonitor.Builder =
        software.amazon.awscdk.services.internetmonitor.CfnMonitor.Builder.create(scope, id)

    override fun healthEventsConfig(healthEventsConfig: IResolvable) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(IResolvable::unwrap))
    }

    override fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty) {
      cdkBuilder.healthEventsConfig(healthEventsConfig.let(HealthEventsConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05a560a3c40f38371339032cfd1a3ffdeb5ffb50a6de313facf159c12d1e230")
    override
        fun healthEventsConfig(healthEventsConfig: HealthEventsConfigProperty.Builder.() -> Unit):
        Unit = healthEventsConfig(HealthEventsConfigProperty(healthEventsConfig))

    override fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: IResolvable) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(IResolvable::unwrap))
    }

    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty) {
      cdkBuilder.internetMeasurementsLogDelivery(internetMeasurementsLogDelivery.let(InternetMeasurementsLogDeliveryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89746903b7257412fcb57282231d673b152595e7bb530f29d5ff2306c6f9ec45")
    override
        fun internetMeasurementsLogDelivery(internetMeasurementsLogDelivery: InternetMeasurementsLogDeliveryProperty.Builder.() -> Unit):
        Unit =
        internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty(internetMeasurementsLogDelivery))

    override fun maxCityNetworksToMonitor(maxCityNetworksToMonitor: Number) {
      cdkBuilder.maxCityNetworksToMonitor(maxCityNetworksToMonitor)
    }

    override fun monitorName(monitorName: String) {
      cdkBuilder.monitorName(monitorName)
    }

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    override fun resourcesToAdd(resourcesToAdd: List<String>) {
      cdkBuilder.resourcesToAdd(resourcesToAdd)
    }

    override fun resourcesToAdd(vararg resourcesToAdd: String): Unit =
        resourcesToAdd(resourcesToAdd.toList())

    override fun resourcesToRemove(resourcesToRemove: List<String>) {
      cdkBuilder.resourcesToRemove(resourcesToRemove)
    }

    override fun resourcesToRemove(vararg resourcesToRemove: String): Unit =
        resourcesToRemove(resourcesToRemove.toList())

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trafficPercentageToMonitor(trafficPercentageToMonitor: Number) {
      cdkBuilder.trafficPercentageToMonitor(trafficPercentageToMonitor)
    }

    public fun build(): software.amazon.awscdk.services.internetmonitor.CfnMonitor =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.internetmonitor.CfnMonitor.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMonitor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMonitor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor):
        CfnMonitor = CfnMonitor(cdkObject)

    internal fun unwrap(wrapped: CfnMonitor):
        software.amazon.awscdk.services.internetmonitor.CfnMonitor = wrapped.cdkObject
  }

  public interface InternetMeasurementsLogDeliveryProperty {
    public fun s3Config(): Any? = unwrap(this).getS3Config()

    @CdkDslMarker
    public interface Builder {
      public fun s3Config(s3Config: IResolvable)

      public fun s3Config(s3Config: S3ConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("806473c078150cff44843a2e841fd644c6433b21ed4a82bf9c18f8bc71440ce7")
      public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty.builder()

      override fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
      }

      override fun s3Config(s3Config: S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("806473c078150cff44843a2e841fd644c6433b21ed4a82bf9c18f8bc71440ce7")
      override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
          s3Config(S3ConfigProperty(s3Config))

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty,
    ) : CdkObject(cdkObject), InternetMeasurementsLogDeliveryProperty {
      override fun s3Config(): Any? = unwrap(this).getS3Config()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InternetMeasurementsLogDeliveryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty):
          InternetMeasurementsLogDeliveryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InternetMeasurementsLogDeliveryProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.InternetMeasurementsLogDeliveryProperty
    }
  }

  public interface HealthEventsConfigProperty {
    public fun availabilityLocalHealthEventsConfig(): Any? =
        unwrap(this).getAvailabilityLocalHealthEventsConfig()

    public fun availabilityScoreThreshold(): Number? = unwrap(this).getAvailabilityScoreThreshold()

    public fun performanceLocalHealthEventsConfig(): Any? =
        unwrap(this).getPerformanceLocalHealthEventsConfig()

    public fun performanceScoreThreshold(): Number? = unwrap(this).getPerformanceScoreThreshold()

    @CdkDslMarker
    public interface Builder {
      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: IResolvable)

      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0c13a3e98e1125fdec76581c1a10eeedb8810d4776780bca07934c54057722a")
      public
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit)

      public fun availabilityScoreThreshold(availabilityScoreThreshold: Number)

      public fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: IResolvable)

      public
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b7de77bf4a936610dc8e6edc25a19431e452e7e7dc8d5e6f65e0501c938ead8")
      public
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit)

      public fun performanceScoreThreshold(performanceScoreThreshold: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty.builder()

      override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: IResolvable) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig.let(IResolvable::unwrap))
      }

      override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
        cdkBuilder.availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig.let(LocalHealthEventsConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0c13a3e98e1125fdec76581c1a10eeedb8810d4776780bca07934c54057722a")
      override
          fun availabilityLocalHealthEventsConfig(availabilityLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit):
          Unit =
          availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty(availabilityLocalHealthEventsConfig))

      override fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
        cdkBuilder.availabilityScoreThreshold(availabilityScoreThreshold)
      }

      override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: IResolvable) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig.let(IResolvable::unwrap))
      }

      override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty) {
        cdkBuilder.performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig.let(LocalHealthEventsConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5b7de77bf4a936610dc8e6edc25a19431e452e7e7dc8d5e6f65e0501c938ead8")
      override
          fun performanceLocalHealthEventsConfig(performanceLocalHealthEventsConfig: LocalHealthEventsConfigProperty.Builder.() -> Unit):
          Unit =
          performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty(performanceLocalHealthEventsConfig))

      override fun performanceScoreThreshold(performanceScoreThreshold: Number) {
        cdkBuilder.performanceScoreThreshold(performanceScoreThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty,
    ) : CdkObject(cdkObject), HealthEventsConfigProperty {
      override fun availabilityLocalHealthEventsConfig(): Any? =
          unwrap(this).getAvailabilityLocalHealthEventsConfig()

      override fun availabilityScoreThreshold(): Number? =
          unwrap(this).getAvailabilityScoreThreshold()

      override fun performanceLocalHealthEventsConfig(): Any? =
          unwrap(this).getPerformanceLocalHealthEventsConfig()

      override fun performanceScoreThreshold(): Number? =
          unwrap(this).getPerformanceScoreThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthEventsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty):
          HealthEventsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthEventsConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.HealthEventsConfigProperty
    }
  }

  public interface LocalHealthEventsConfigProperty {
    public fun healthScoreThreshold(): Number? = unwrap(this).getHealthScoreThreshold()

    public fun minTrafficImpact(): Number? = unwrap(this).getMinTrafficImpact()

    public fun status(): String? = unwrap(this).getStatus()

    @CdkDslMarker
    public interface Builder {
      public fun healthScoreThreshold(healthScoreThreshold: Number)

      public fun minTrafficImpact(minTrafficImpact: Number)

      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty.Builder
          =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty.builder()

      override fun healthScoreThreshold(healthScoreThreshold: Number) {
        cdkBuilder.healthScoreThreshold(healthScoreThreshold)
      }

      override fun minTrafficImpact(minTrafficImpact: Number) {
        cdkBuilder.minTrafficImpact(minTrafficImpact)
      }

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty,
    ) : CdkObject(cdkObject), LocalHealthEventsConfigProperty {
      override fun healthScoreThreshold(): Number? = unwrap(this).getHealthScoreThreshold()

      override fun minTrafficImpact(): Number? = unwrap(this).getMinTrafficImpact()

      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalHealthEventsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty):
          LocalHealthEventsConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalHealthEventsConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.LocalHealthEventsConfigProperty
    }
  }

  public interface S3ConfigProperty {
    public fun bucketName(): String? = unwrap(this).getBucketName()

    public fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

    public fun logDeliveryStatus(): String? = unwrap(this).getLogDeliveryStatus()

    @CdkDslMarker
    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun bucketPrefix(bucketPrefix: String)

      public fun logDeliveryStatus(logDeliveryStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty.Builder =
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
      }

      override fun logDeliveryStatus(logDeliveryStatus: String) {
        cdkBuilder.logDeliveryStatus(logDeliveryStatus)
      }

      public fun build():
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty,
    ) : CdkObject(cdkObject), S3ConfigProperty {
      override fun bucketName(): String? = unwrap(this).getBucketName()

      override fun bucketPrefix(): String? = unwrap(this).getBucketPrefix()

      override fun logDeliveryStatus(): String? = unwrap(this).getLogDeliveryStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty):
          S3ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.internetmonitor.CfnMonitor.S3ConfigProperty
    }
  }
}
