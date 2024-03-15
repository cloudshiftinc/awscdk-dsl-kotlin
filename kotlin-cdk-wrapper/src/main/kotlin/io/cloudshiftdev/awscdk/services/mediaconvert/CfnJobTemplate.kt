@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.CfnResource
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

public open class CfnJobTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accelerationSettings(): Any? = unwrap(this).getAccelerationSettings()

  public open fun accelerationSettings(`value`: IResolvable) {
    unwrap(this).setAccelerationSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun accelerationSettings(`value`: AccelerationSettingsProperty) {
    unwrap(this).setAccelerationSettings(`value`.let(AccelerationSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e6db2a81fb614b709689ba981dffe6c25712a605c945bdbd3e2e88e2f79c00fb")
  public open fun accelerationSettings(`value`: AccelerationSettingsProperty.Builder.() -> Unit):
      Unit = accelerationSettings(AccelerationSettingsProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun category(): String? = unwrap(this).getCategory()

  public open fun category(`value`: String) {
    unwrap(this).setCategory(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun hopDestinations(): Any? = unwrap(this).getHopDestinations()

  public open fun hopDestinations(`value`: IResolvable) {
    unwrap(this).setHopDestinations(`value`.let(IResolvable::unwrap))
  }

  public open fun hopDestinations(__idx_ac66f0: List<Any>) {
    unwrap(this).setHopDestinations(__idx_ac66f0)
  }

  public open fun hopDestinations(vararg __idx_ac66f0: Any): Unit =
      hopDestinations(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun priority(): Number? = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  public open fun queue(): String? = unwrap(this).getQueue()

  public open fun queue(`value`: String) {
    unwrap(this).setQueue(`value`)
  }

  public open fun settingsJson(): Any = unwrap(this).getSettingsJson()

  public open fun settingsJson(`value`: Any) {
    unwrap(this).setSettingsJson(`value`)
  }

  public open fun statusUpdateInterval(): String? = unwrap(this).getStatusUpdateInterval()

  public open fun statusUpdateInterval(`value`: String) {
    unwrap(this).setStatusUpdateInterval(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accelerationSettings(accelerationSettings: IResolvable)

    public fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71826123168d5fa0ad81f034744e0fd2541d75930c20fcfd4edf9b5fc23a313e")
    public
        fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty.Builder.() -> Unit)

    public fun category(category: String)

    public fun description(description: String)

    public fun hopDestinations(hopDestinations: IResolvable)

    public fun hopDestinations(hopDestinations: List<Any>)

    public fun hopDestinations(vararg hopDestinations: Any)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun queue(queue: String)

    public fun statusUpdateInterval(statusUpdateInterval: String)

    public fun tags(tags: Any)

    public fun tingsJson(settingsJson: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.Builder.create(scope, id)

    override fun accelerationSettings(accelerationSettings: IResolvable) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(IResolvable::unwrap))
    }

    override fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty) {
      cdkBuilder.accelerationSettings(accelerationSettings.let(AccelerationSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71826123168d5fa0ad81f034744e0fd2541d75930c20fcfd4edf9b5fc23a313e")
    override
        fun accelerationSettings(accelerationSettings: AccelerationSettingsProperty.Builder.() -> Unit):
        Unit = accelerationSettings(AccelerationSettingsProperty(accelerationSettings))

    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hopDestinations(hopDestinations: IResolvable) {
      cdkBuilder.hopDestinations(hopDestinations.let(IResolvable::unwrap))
    }

    override fun hopDestinations(hopDestinations: List<Any>) {
      cdkBuilder.hopDestinations(hopDestinations)
    }

    override fun hopDestinations(vararg hopDestinations: Any): Unit =
        hopDestinations(hopDestinations.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun queue(queue: String) {
      cdkBuilder.queue(queue)
    }

    override fun statusUpdateInterval(statusUpdateInterval: String) {
      cdkBuilder.statusUpdateInterval(statusUpdateInterval)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun tingsJson(settingsJson: Any) {
      cdkBuilder.settingsJson(settingsJson)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnJobTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate):
        CfnJobTemplate = CfnJobTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnJobTemplate):
        software.amazon.awscdk.services.mediaconvert.CfnJobTemplate = wrapped.cdkObject
  }

  public interface AccelerationSettingsProperty {
    public fun mode(): String

    @CdkDslMarker
    public interface Builder {
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty.Builder
          =
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty.builder()

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty,
    ) : CdkObject(cdkObject), AccelerationSettingsProperty {
      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccelerationSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty):
          AccelerationSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccelerationSettingsProperty):
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.AccelerationSettingsProperty
    }
  }

  public interface HopDestinationProperty {
    public fun priority(): Number? = unwrap(this).getPriority()

    public fun queue(): String? = unwrap(this).getQueue()

    public fun waitMinutes(): Number? = unwrap(this).getWaitMinutes()

    @CdkDslMarker
    public interface Builder {
      public fun priority(priority: Number)

      public fun queue(queue: String)

      public fun waitMinutes(waitMinutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty.Builder
          =
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty.builder()

      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      override fun queue(queue: String) {
        cdkBuilder.queue(queue)
      }

      override fun waitMinutes(waitMinutes: Number) {
        cdkBuilder.waitMinutes(waitMinutes)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty,
    ) : CdkObject(cdkObject), HopDestinationProperty {
      override fun priority(): Number? = unwrap(this).getPriority()

      override fun queue(): String? = unwrap(this).getQueue()

      override fun waitMinutes(): Number? = unwrap(this).getWaitMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HopDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty):
          HopDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HopDestinationProperty):
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediaconvert.CfnJobTemplate.HopDestinationProperty
    }
  }
}
