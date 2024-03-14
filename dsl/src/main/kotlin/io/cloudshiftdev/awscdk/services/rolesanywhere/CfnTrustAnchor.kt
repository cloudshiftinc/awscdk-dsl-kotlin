package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrustAnchor internal constructor(
  private val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrTrustAnchorArn(): String = unwrap(this).getAttrTrustAnchorArn()

  public open fun attrTrustAnchorId(): String = unwrap(this).getAttrTrustAnchorId()

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun notificationSettings(): Any? = unwrap(this).getNotificationSettings()

  public open fun notificationSettings(`value`: IResolvable) {
    unwrap(this).setNotificationSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun notificationSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setNotificationSettings(__idx_ac66f0)
  }

  public open fun source(): Any = unwrap(this).getSource()

  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable::unwrap))
  }

  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e516ff46f9e2a15313b50a1d701f49e5feaa84eb47f6df45ffb20734355a5e5")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun enabled(enabled: Boolean) {
    }

    public fun enabled(enabled: IResolvable) {
    }

    public fun name(name: String) {
    }

    public fun notificationSettings(notificationSettings: IResolvable) {
    }

    public fun notificationSettings(notificationSettings: List<Any>) {
    }

    public fun source(source: IResolvable) {
    }

    public fun source(source: SourceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73cdafd30f11ea0f3f26b5a9a7461217ecb4f5a1582cd00a959b41f8cba00c28")
    public fun source(source: SourceProperty.Builder.() -> Unit) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.Builder.create(scope, id)

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun notificationSettings(notificationSettings: IResolvable) {
      cdkBuilder.notificationSettings(notificationSettings.let(IResolvable::unwrap))
    }

    public override fun notificationSettings(notificationSettings: List<Any>) {
      cdkBuilder.notificationSettings(notificationSettings)
    }

    public override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable::unwrap))
    }

    public override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73cdafd30f11ea0f3f26b5a9a7461217ecb4f5a1582cd00a959b41f8cba00c28")
    public override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrustAnchor {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrustAnchor(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor):
        CfnTrustAnchor = CfnTrustAnchor(cdkObject)

    internal fun unwrap(wrapped: CfnTrustAnchor):
        software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor = wrapped.cdkObject
  }

  public interface SourceDataProperty {
    public fun acmPcaArn(): String? = unwrap(this).getAcmPcaArn()

    public fun x509CertificateData(): String? = unwrap(this).getX509CertificateData()

    public interface Builder {
      public fun acmPcaArn(acmPcaArn: String) {
      }

      public fun x509CertificateData(x509CertificateData: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty.Builder =
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty.builder()

      public override fun acmPcaArn(acmPcaArn: String) {
        cdkBuilder.acmPcaArn(acmPcaArn)
      }

      public override fun x509CertificateData(x509CertificateData: String) {
        cdkBuilder.x509CertificateData(x509CertificateData)
      }

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty,
    ) : SourceDataProperty {
      public override fun acmPcaArn(): String? = unwrap(this).getAcmPcaArn()

      public override fun x509CertificateData(): String? = unwrap(this).getX509CertificateData()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty):
          SourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceDataProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceDataProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NotificationSettingProperty {
    public fun channel(): String? = unwrap(this).getChannel()

    public fun enabled(): Any

    public fun event(): String

    public fun threshold(): Number? = unwrap(this).getThreshold()

    public interface Builder {
      public fun channel(channel: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun event(event: String) {
      }

      public fun threshold(threshold: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty.Builder
          =
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty.builder()

      public override fun channel(channel: String) {
        cdkBuilder.channel(channel)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun event(event: String) {
        cdkBuilder.event(event)
      }

      public override fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
      }

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty,
    ) : NotificationSettingProperty {
      public override fun channel(): String? = unwrap(this).getChannel()

      public override fun enabled(): Any = unwrap(this).getEnabled()

      public override fun event(): String = unwrap(this).getEvent()

      public override fun threshold(): Number? = unwrap(this).getThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty):
          NotificationSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationSettingProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.NotificationSettingProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SourceProperty {
    public fun sourceData(): Any? = unwrap(this).getSourceData()

    public fun sourceType(): String? = unwrap(this).getSourceType()

    public interface Builder {
      public fun sourceData(sourceData: IResolvable) {
      }

      public fun sourceData(sourceData: SourceDataProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcf808ea62ad5bd45b3233e85ec02737844c3fe2796855e264f638ead6bc52")
      public fun sourceData(sourceData: SourceDataProperty.Builder.() -> Unit) {
      }

      public fun sourceType(sourceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty.Builder =
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty.builder()

      public override fun sourceData(sourceData: IResolvable) {
        cdkBuilder.sourceData(sourceData.let(IResolvable::unwrap))
      }

      public override fun sourceData(sourceData: SourceDataProperty) {
        cdkBuilder.sourceData(sourceData.let(SourceDataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67dcf808ea62ad5bd45b3233e85ec02737844c3fe2796855e264f638ead6bc52")
      public override fun sourceData(sourceData: SourceDataProperty.Builder.() -> Unit): Unit =
          sourceData(SourceDataProperty(sourceData))

      public override fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
      }

      public fun build():
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty,
    ) : SourceProperty {
      public override fun sourceData(): Any? = unwrap(this).getSourceData()

      public override fun sourceType(): String? = unwrap(this).getSourceType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor.SourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
