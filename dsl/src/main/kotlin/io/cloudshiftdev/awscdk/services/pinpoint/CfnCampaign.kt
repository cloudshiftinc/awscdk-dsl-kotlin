package io.cloudshiftdev.awscdk.services.pinpoint

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCampaign internal constructor(
  private val cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun additionalTreatments(): Any? = unwrap(this).getAdditionalTreatments()

  public open fun additionalTreatments(`value`: IResolvable) {
    unwrap(this).setAdditionalTreatments(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalTreatments(__idx_ac66f0: List<Any>) {
    unwrap(this).setAdditionalTreatments(__idx_ac66f0)
  }

  public open fun applicationId(): String = unwrap(this).getApplicationId()

  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCampaignId(): String = unwrap(this).getAttrCampaignId()

  public open fun campaignHook(): Any? = unwrap(this).getCampaignHook()

  public open fun campaignHook(`value`: IResolvable) {
    unwrap(this).setCampaignHook(`value`.let(IResolvable::unwrap))
  }

  public open fun campaignHook(`value`: CampaignHookProperty) {
    unwrap(this).setCampaignHook(`value`.let(CampaignHookProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("87a9909a6c0c680f8ecf4d56ce53ffa564fb06697f7b344ab2a978e12388a27b")
  public open fun campaignHook(`value`: CampaignHookProperty.Builder.() -> Unit): Unit =
      campaignHook(CampaignHookProperty(`value`))

  public open fun customDeliveryConfiguration(): Any? =
      unwrap(this).getCustomDeliveryConfiguration()

  public open fun customDeliveryConfiguration(`value`: IResolvable) {
    unwrap(this).setCustomDeliveryConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun customDeliveryConfiguration(`value`: CustomDeliveryConfigurationProperty) {
    unwrap(this).setCustomDeliveryConfiguration(`value`.let(CustomDeliveryConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a81ed56b3c5591a570961cb61e4418166457324109eeaf12cb3ce0c8431296f7")
  public open
      fun customDeliveryConfiguration(`value`: CustomDeliveryConfigurationProperty.Builder.() -> Unit):
      Unit = customDeliveryConfiguration(CustomDeliveryConfigurationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun holdoutPercent(): Number? = unwrap(this).getHoldoutPercent()

  public open fun holdoutPercent(`value`: Number) {
    unwrap(this).setHoldoutPercent(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun isPaused(): Any? = unwrap(this).getIsPaused()

  public open fun isPaused(`value`: Boolean) {
    unwrap(this).setIsPaused(`value`)
  }

  public open fun isPaused(`value`: IResolvable) {
    unwrap(this).setIsPaused(`value`.let(IResolvable::unwrap))
  }

  public open fun limits(): Any? = unwrap(this).getLimits()

  public open fun limits(`value`: IResolvable) {
    unwrap(this).setLimits(`value`.let(IResolvable::unwrap))
  }

  public open fun limits(`value`: LimitsProperty) {
    unwrap(this).setLimits(`value`.let(LimitsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("197d293c5309d2634829ea70c3acc1496458b16fc7b1fd0e975124ec57ef1dec")
  public open fun limits(`value`: LimitsProperty.Builder.() -> Unit): Unit =
      limits(LimitsProperty(`value`))

  public open fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

  public open fun messageConfiguration(`value`: IResolvable) {
    unwrap(this).setMessageConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun messageConfiguration(`value`: MessageConfigurationProperty) {
    unwrap(this).setMessageConfiguration(`value`.let(MessageConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5827d0a95e6486b3d26076451747e1ba1b35c085f0989e95b460dce2868824f4")
  public open fun messageConfiguration(`value`: MessageConfigurationProperty.Builder.() -> Unit):
      Unit = messageConfiguration(MessageConfigurationProperty(`value`))

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun priority(): Number? = unwrap(this).getPriority()

  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  public open fun schedule(): Any = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15116b54daa805390361610a72ab7bdeff9053cc158d622fd99d9a0373d97c9d")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  public open fun segmentId(): String = unwrap(this).getSegmentId()

  public open fun segmentId(`value`: String) {
    unwrap(this).setSegmentId(`value`)
  }

  public open fun segmentVersion(): Number? = unwrap(this).getSegmentVersion()

  public open fun segmentVersion(`value`: Number) {
    unwrap(this).setSegmentVersion(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

  public open fun templateConfiguration(`value`: IResolvable) {
    unwrap(this).setTemplateConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun templateConfiguration(`value`: TemplateConfigurationProperty) {
    unwrap(this).setTemplateConfiguration(`value`.let(TemplateConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("eac3745128caf0d33396538104b1fe4b29936cbcdffd62b047032e2aca2df105")
  public open fun templateConfiguration(`value`: TemplateConfigurationProperty.Builder.() -> Unit):
      Unit = templateConfiguration(TemplateConfigurationProperty(`value`))

  public open fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

  public open fun treatmentDescription(`value`: String) {
    unwrap(this).setTreatmentDescription(`value`)
  }

  public open fun treatmentName(): String? = unwrap(this).getTreatmentName()

  public open fun treatmentName(`value`: String) {
    unwrap(this).setTreatmentName(`value`)
  }

  public interface Builder {
    public fun additionalTreatments(additionalTreatments: IResolvable)

    public fun additionalTreatments(additionalTreatments: List<Any>)

    public fun applicationId(applicationId: String)

    public fun campaignHook(campaignHook: IResolvable)

    public fun campaignHook(campaignHook: CampaignHookProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbbbe608fc3502d49b644c4f90718e34ac20ea0682479a90a171f68f386f8598")
    public fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit)

    public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable)

    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd22292571df67edacf7c81e8814cdd99f4249fdef60d3f2a5edf4284eee208a")
    public
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun holdoutPercent(holdoutPercent: Number)

    public fun isPaused(isPaused: Boolean)

    public fun isPaused(isPaused: IResolvable)

    public fun limits(limits: IResolvable)

    public fun limits(limits: LimitsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b7f5268d7c8b58af19edbefde2d7e05d07f39606ffd5f2786b1ff4d842dab4")
    public fun limits(limits: LimitsProperty.Builder.() -> Unit)

    public fun messageConfiguration(messageConfiguration: IResolvable)

    public fun messageConfiguration(messageConfiguration: MessageConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b877da97cbc73f1c6c332b5657e333e68eab953af3dc318e9d0d67cb2fd1e017")
    public
        fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun priority(priority: Number)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: ScheduleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("303e465d67ed43b1550705a7d6164b543bc5f8f7eea08f0379aa56aa4856d430")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    public fun segmentId(segmentId: String)

    public fun segmentVersion(segmentVersion: Number)

    public fun tags(tags: Any)

    public fun templateConfiguration(templateConfiguration: IResolvable)

    public fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3478803e1fdaebd988a9fa38231b2f66a2112e01d792bd76ba31339567343814")
    public
        fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit)

    public fun treatmentDescription(treatmentDescription: String)

    public fun treatmentName(treatmentName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnCampaign.Builder =
        software.amazon.awscdk.services.pinpoint.CfnCampaign.Builder.create(scope, id)

    override fun additionalTreatments(additionalTreatments: IResolvable) {
      cdkBuilder.additionalTreatments(additionalTreatments.let(IResolvable::unwrap))
    }

    override fun additionalTreatments(additionalTreatments: List<Any>) {
      cdkBuilder.additionalTreatments(additionalTreatments)
    }

    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    override fun campaignHook(campaignHook: IResolvable) {
      cdkBuilder.campaignHook(campaignHook.let(IResolvable::unwrap))
    }

    override fun campaignHook(campaignHook: CampaignHookProperty) {
      cdkBuilder.campaignHook(campaignHook.let(CampaignHookProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbbbe608fc3502d49b644c4f90718e34ac20ea0682479a90a171f68f386f8598")
    override fun campaignHook(campaignHook: CampaignHookProperty.Builder.() -> Unit): Unit =
        campaignHook(CampaignHookProperty(campaignHook))

    override fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(IResolvable::unwrap))
    }

    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty) {
      cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(CustomDeliveryConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd22292571df67edacf7c81e8814cdd99f4249fdef60d3f2a5edf4284eee208a")
    override
        fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDeliveryConfiguration(CustomDeliveryConfigurationProperty(customDeliveryConfiguration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun holdoutPercent(holdoutPercent: Number) {
      cdkBuilder.holdoutPercent(holdoutPercent)
    }

    override fun isPaused(isPaused: Boolean) {
      cdkBuilder.isPaused(isPaused)
    }

    override fun isPaused(isPaused: IResolvable) {
      cdkBuilder.isPaused(isPaused.let(IResolvable::unwrap))
    }

    override fun limits(limits: IResolvable) {
      cdkBuilder.limits(limits.let(IResolvable::unwrap))
    }

    override fun limits(limits: LimitsProperty) {
      cdkBuilder.limits(limits.let(LimitsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b7f5268d7c8b58af19edbefde2d7e05d07f39606ffd5f2786b1ff4d842dab4")
    override fun limits(limits: LimitsProperty.Builder.() -> Unit): Unit =
        limits(LimitsProperty(limits))

    override fun messageConfiguration(messageConfiguration: IResolvable) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(IResolvable::unwrap))
    }

    override fun messageConfiguration(messageConfiguration: MessageConfigurationProperty) {
      cdkBuilder.messageConfiguration(messageConfiguration.let(MessageConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b877da97cbc73f1c6c332b5657e333e68eab953af3dc318e9d0d67cb2fd1e017")
    override
        fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit):
        Unit = messageConfiguration(MessageConfigurationProperty(messageConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("303e465d67ed43b1550705a7d6164b543bc5f8f7eea08f0379aa56aa4856d430")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    override fun segmentId(segmentId: String) {
      cdkBuilder.segmentId(segmentId)
    }

    override fun segmentVersion(segmentVersion: Number) {
      cdkBuilder.segmentVersion(segmentVersion)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun templateConfiguration(templateConfiguration: IResolvable) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable::unwrap))
    }

    override fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty) {
      cdkBuilder.templateConfiguration(templateConfiguration.let(TemplateConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3478803e1fdaebd988a9fa38231b2f66a2112e01d792bd76ba31339567343814")
    override
        fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit):
        Unit = templateConfiguration(TemplateConfigurationProperty(templateConfiguration))

    override fun treatmentDescription(treatmentDescription: String) {
      cdkBuilder.treatmentDescription(treatmentDescription)
    }

    override fun treatmentName(treatmentName: String) {
      cdkBuilder.treatmentName(treatmentName)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCampaign {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCampaign(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign): CfnCampaign
        = CfnCampaign(cdkObject)

    internal fun unwrap(wrapped: CfnCampaign): software.amazon.awscdk.services.pinpoint.CfnCampaign
        = wrapped.cdkObject
  }

  public interface CampaignCustomMessageProperty {
    public fun `data`(): String? = unwrap(this).getData()

    public interface Builder {
      public fun `data`(`data`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty.builder()

      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty,
    ) : CampaignCustomMessageProperty {
      override fun `data`(): String? = unwrap(this).getData()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignCustomMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty):
          CampaignCustomMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignCustomMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignCustomMessageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CampaignHookProperty {
    public fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

    public fun mode(): String? = unwrap(this).getMode()

    public fun webUrl(): String? = unwrap(this).getWebUrl()

    public interface Builder {
      public fun lambdaFunctionName(lambdaFunctionName: String)

      public fun mode(mode: String)

      public fun webUrl(webUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty.builder()

      override fun lambdaFunctionName(lambdaFunctionName: String) {
        cdkBuilder.lambdaFunctionName(lambdaFunctionName)
      }

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun webUrl(webUrl: String) {
        cdkBuilder.webUrl(webUrl)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty,
    ) : CampaignHookProperty {
      override fun lambdaFunctionName(): String? = unwrap(this).getLambdaFunctionName()

      override fun mode(): String? = unwrap(this).getMode()

      override fun webUrl(): String? = unwrap(this).getWebUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty):
          CampaignHookProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignHookProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignHookProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InAppMessageBodyConfigProperty {
    public fun alignment(): String? = unwrap(this).getAlignment()

    public fun body(): String? = unwrap(this).getBody()

    public fun textColor(): String? = unwrap(this).getTextColor()

    public interface Builder {
      public fun alignment(alignment: String)

      public fun body(body: String)

      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty.builder()

      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty,
    ) : InAppMessageBodyConfigProperty {
      override fun alignment(): String? = unwrap(this).getAlignment()

      override fun body(): String? = unwrap(this).getBody()

      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageBodyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty):
          InAppMessageBodyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageBodyConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageBodyConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TemplateProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty,
    ) : TemplateProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty):
          TemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InAppMessageHeaderConfigProperty {
    public fun alignment(): String? = unwrap(this).getAlignment()

    public fun `header`(): String? = unwrap(this).getHeader()

    public fun textColor(): String? = unwrap(this).getTextColor()

    public interface Builder {
      public fun alignment(alignment: String)

      public fun `header`(`header`: String)

      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty.builder()

      override fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
      }

      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty,
    ) : InAppMessageHeaderConfigProperty {
      override fun alignment(): String? = unwrap(this).getAlignment()

      override fun `header`(): String? = unwrap(this).getHeader()

      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty):
          InAppMessageHeaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageHeaderConfigProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageHeaderConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CampaignEmailMessageProperty {
    public fun body(): String? = unwrap(this).getBody()

    public fun fromAddress(): String? = unwrap(this).getFromAddress()

    public fun htmlBody(): String? = unwrap(this).getHtmlBody()

    public fun title(): String? = unwrap(this).getTitle()

    public interface Builder {
      public fun body(body: String)

      public fun fromAddress(fromAddress: String)

      public fun htmlBody(htmlBody: String)

      public fun title(title: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty.builder()

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun fromAddress(fromAddress: String) {
        cdkBuilder.fromAddress(fromAddress)
      }

      override fun htmlBody(htmlBody: String) {
        cdkBuilder.htmlBody(htmlBody)
      }

      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty,
    ) : CampaignEmailMessageProperty {
      override fun body(): String? = unwrap(this).getBody()

      override fun fromAddress(): String? = unwrap(this).getFromAddress()

      override fun htmlBody(): String? = unwrap(this).getHtmlBody()

      override fun title(): String? = unwrap(this).getTitle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignEmailMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty):
          CampaignEmailMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignEmailMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEmailMessageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CampaignInAppMessageProperty {
    public fun content(): Any? = unwrap(this).getContent()

    public fun customConfig(): Any? = unwrap(this).getCustomConfig()

    public fun layout(): String? = unwrap(this).getLayout()

    public interface Builder {
      public fun content(content: IResolvable)

      public fun content(content: List<Any>)

      public fun customConfig(customConfig: Any)

      public fun layout(layout: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty.builder()

      override fun content(content: IResolvable) {
        cdkBuilder.content(content.let(IResolvable::unwrap))
      }

      override fun content(content: List<Any>) {
        cdkBuilder.content(content)
      }

      override fun customConfig(customConfig: Any) {
        cdkBuilder.customConfig(customConfig)
      }

      override fun layout(layout: String) {
        cdkBuilder.layout(layout)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty,
    ) : CampaignInAppMessageProperty {
      override fun content(): Any? = unwrap(this).getContent()

      override fun customConfig(): Any? = unwrap(this).getCustomConfig()

      override fun layout(): String? = unwrap(this).getLayout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignInAppMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty):
          CampaignInAppMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignInAppMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignInAppMessageProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LimitsProperty {
    public fun daily(): Number? = unwrap(this).getDaily()

    public fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

    public fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

    public fun session(): Number? = unwrap(this).getSession()

    public fun total(): Number? = unwrap(this).getTotal()

    public interface Builder {
      public fun daily(daily: Number)

      public fun maximumDuration(maximumDuration: Number)

      public fun messagesPerSecond(messagesPerSecond: Number)

      public fun session(session: Number)

      public fun total(total: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty.builder()

      override fun daily(daily: Number) {
        cdkBuilder.daily(daily)
      }

      override fun maximumDuration(maximumDuration: Number) {
        cdkBuilder.maximumDuration(maximumDuration)
      }

      override fun messagesPerSecond(messagesPerSecond: Number) {
        cdkBuilder.messagesPerSecond(messagesPerSecond)
      }

      override fun session(session: Number) {
        cdkBuilder.session(session)
      }

      override fun total(total: Number) {
        cdkBuilder.total(total)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty,
    ) : LimitsProperty {
      override fun daily(): Number? = unwrap(this).getDaily()

      override fun maximumDuration(): Number? = unwrap(this).getMaximumDuration()

      override fun messagesPerSecond(): Number? = unwrap(this).getMessagesPerSecond()

      override fun session(): Number? = unwrap(this).getSession()

      override fun total(): Number? = unwrap(this).getTotal()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LimitsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty):
          LimitsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LimitsProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.LimitsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CampaignSmsMessageProperty {
    public fun body(): String? = unwrap(this).getBody()

    public fun entityId(): String? = unwrap(this).getEntityId()

    public fun messageType(): String? = unwrap(this).getMessageType()

    public fun originationNumber(): String? = unwrap(this).getOriginationNumber()

    public fun senderId(): String? = unwrap(this).getSenderId()

    public fun templateId(): String? = unwrap(this).getTemplateId()

    public interface Builder {
      public fun body(body: String)

      public fun entityId(entityId: String)

      public fun messageType(messageType: String)

      public fun originationNumber(originationNumber: String)

      public fun senderId(senderId: String)

      public fun templateId(templateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty.builder()

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
      }

      override fun messageType(messageType: String) {
        cdkBuilder.messageType(messageType)
      }

      override fun originationNumber(originationNumber: String) {
        cdkBuilder.originationNumber(originationNumber)
      }

      override fun senderId(senderId: String) {
        cdkBuilder.senderId(senderId)
      }

      override fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty,
    ) : CampaignSmsMessageProperty {
      override fun body(): String? = unwrap(this).getBody()

      override fun entityId(): String? = unwrap(this).getEntityId()

      override fun messageType(): String? = unwrap(this).getMessageType()

      override fun originationNumber(): String? = unwrap(this).getOriginationNumber()

      override fun senderId(): String? = unwrap(this).getSenderId()

      override fun templateId(): String? = unwrap(this).getTemplateId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignSmsMessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty):
          CampaignSmsMessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignSmsMessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignSmsMessageProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface QuietTimeProperty {
    public fun end(): String

    public fun start(): String

    public interface Builder {
      public fun end(end: String)

      public fun start(start: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty.builder()

      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty,
    ) : QuietTimeProperty {
      override fun end(): String = unwrap(this).getEnd()

      override fun start(): String = unwrap(this).getStart()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QuietTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty):
          QuietTimeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuietTimeProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.QuietTimeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OverrideButtonConfigurationProperty {
    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    public fun link(): String? = unwrap(this).getLink()

    public interface Builder {
      public fun buttonAction(buttonAction: String)

      public fun link(link: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty.builder()

      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty,
    ) : OverrideButtonConfigurationProperty {
      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      override fun link(): String? = unwrap(this).getLink()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          OverrideButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty):
          OverrideButtonConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OverrideButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.OverrideButtonConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomDeliveryConfigurationProperty {
    public fun deliveryUri(): String? = unwrap(this).getDeliveryUri()

    public fun endpointTypes(): List<String> = unwrap(this).getEndpointTypes() ?: emptyList()

    public interface Builder {
      public fun deliveryUri(deliveryUri: String)

      public fun endpointTypes(endpointTypes: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty.builder()

      override fun deliveryUri(deliveryUri: String) {
        cdkBuilder.deliveryUri(deliveryUri)
      }

      override fun endpointTypes(endpointTypes: List<String>) {
        cdkBuilder.endpointTypes(endpointTypes)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty,
    ) : CustomDeliveryConfigurationProperty {
      override fun deliveryUri(): String? = unwrap(this).getDeliveryUri()

      override fun endpointTypes(): List<String> = unwrap(this).getEndpointTypes() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomDeliveryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty):
          CustomDeliveryConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomDeliveryConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CustomDeliveryConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface InAppMessageContentProperty {
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    public fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

    public fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    public fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

    public fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()

    public interface Builder {
      public fun backgroundColor(backgroundColor: String)

      public fun bodyConfig(bodyConfig: IResolvable)

      public fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f7d0fa693ee3275316ac1f5742467ad649de278deb0008b82d55aae65484b96")
      public fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty.Builder.() -> Unit)

      public fun headerConfig(headerConfig: IResolvable)

      public fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46a4000f9043a12a1ab6c75389e6d40804bde07d331a3ae6f199c1d3954fc4c8")
      public fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty.Builder.() -> Unit)

      public fun imageUrl(imageUrl: String)

      public fun primaryBtn(primaryBtn: IResolvable)

      public fun primaryBtn(primaryBtn: InAppMessageButtonProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad10bfaac4de9f5eb98dee4b0cf892b1dbf9d85a6b5a80aa0b8148235bc4f899")
      public fun primaryBtn(primaryBtn: InAppMessageButtonProperty.Builder.() -> Unit)

      public fun secondaryBtn(secondaryBtn: IResolvable)

      public fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77ad5198e39a114458e5f25eafb01c089a4ad072dd46d572ffcf39f2b7269fb3")
      public fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty.builder()

      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      override fun bodyConfig(bodyConfig: IResolvable) {
        cdkBuilder.bodyConfig(bodyConfig.let(IResolvable::unwrap))
      }

      override fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty) {
        cdkBuilder.bodyConfig(bodyConfig.let(InAppMessageBodyConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4f7d0fa693ee3275316ac1f5742467ad649de278deb0008b82d55aae65484b96")
      override fun bodyConfig(bodyConfig: InAppMessageBodyConfigProperty.Builder.() -> Unit): Unit =
          bodyConfig(InAppMessageBodyConfigProperty(bodyConfig))

      override fun headerConfig(headerConfig: IResolvable) {
        cdkBuilder.headerConfig(headerConfig.let(IResolvable::unwrap))
      }

      override fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty) {
        cdkBuilder.headerConfig(headerConfig.let(InAppMessageHeaderConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46a4000f9043a12a1ab6c75389e6d40804bde07d331a3ae6f199c1d3954fc4c8")
      override fun headerConfig(headerConfig: InAppMessageHeaderConfigProperty.Builder.() -> Unit):
          Unit = headerConfig(InAppMessageHeaderConfigProperty(headerConfig))

      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      override fun primaryBtn(primaryBtn: IResolvable) {
        cdkBuilder.primaryBtn(primaryBtn.let(IResolvable::unwrap))
      }

      override fun primaryBtn(primaryBtn: InAppMessageButtonProperty) {
        cdkBuilder.primaryBtn(primaryBtn.let(InAppMessageButtonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad10bfaac4de9f5eb98dee4b0cf892b1dbf9d85a6b5a80aa0b8148235bc4f899")
      override fun primaryBtn(primaryBtn: InAppMessageButtonProperty.Builder.() -> Unit): Unit =
          primaryBtn(InAppMessageButtonProperty(primaryBtn))

      override fun secondaryBtn(secondaryBtn: IResolvable) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(IResolvable::unwrap))
      }

      override fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty) {
        cdkBuilder.secondaryBtn(secondaryBtn.let(InAppMessageButtonProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77ad5198e39a114458e5f25eafb01c089a4ad072dd46d572ffcf39f2b7269fb3")
      override fun secondaryBtn(secondaryBtn: InAppMessageButtonProperty.Builder.() -> Unit): Unit =
          secondaryBtn(InAppMessageButtonProperty(secondaryBtn))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty,
    ) : InAppMessageContentProperty {
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      override fun bodyConfig(): Any? = unwrap(this).getBodyConfig()

      override fun headerConfig(): Any? = unwrap(this).getHeaderConfig()

      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      override fun primaryBtn(): Any? = unwrap(this).getPrimaryBtn()

      override fun secondaryBtn(): Any? = unwrap(this).getSecondaryBtn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty):
          InAppMessageContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageContentProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageContentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ScheduleProperty {
    public fun endTime(): String? = unwrap(this).getEndTime()

    public fun eventFilter(): Any? = unwrap(this).getEventFilter()

    public fun frequency(): String? = unwrap(this).getFrequency()

    public fun isLocalTime(): Any? = unwrap(this).getIsLocalTime()

    public fun quietTime(): Any? = unwrap(this).getQuietTime()

    public fun startTime(): String? = unwrap(this).getStartTime()

    public fun timeZone(): String? = unwrap(this).getTimeZone()

    public interface Builder {
      public fun endTime(endTime: String)

      public fun eventFilter(eventFilter: IResolvable)

      public fun eventFilter(eventFilter: CampaignEventFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3dd06595209b007103242bf8e198785fdacfc7f080bcd9bcc9133d99b014137")
      public fun eventFilter(eventFilter: CampaignEventFilterProperty.Builder.() -> Unit)

      public fun frequency(frequency: String)

      public fun isLocalTime(isLocalTime: Boolean)

      public fun isLocalTime(isLocalTime: IResolvable)

      public fun quietTime(quietTime: IResolvable)

      public fun quietTime(quietTime: QuietTimeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed81d35fd706191dfa298b7a8c2139b5e0327d8a6782d2b5b3d8bdba3b83b51d")
      public fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit)

      public fun startTime(startTime: String)

      public fun timeZone(timeZone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty.builder()

      override fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
      }

      override fun eventFilter(eventFilter: IResolvable) {
        cdkBuilder.eventFilter(eventFilter.let(IResolvable::unwrap))
      }

      override fun eventFilter(eventFilter: CampaignEventFilterProperty) {
        cdkBuilder.eventFilter(eventFilter.let(CampaignEventFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c3dd06595209b007103242bf8e198785fdacfc7f080bcd9bcc9133d99b014137")
      override fun eventFilter(eventFilter: CampaignEventFilterProperty.Builder.() -> Unit): Unit =
          eventFilter(CampaignEventFilterProperty(eventFilter))

      override fun frequency(frequency: String) {
        cdkBuilder.frequency(frequency)
      }

      override fun isLocalTime(isLocalTime: Boolean) {
        cdkBuilder.isLocalTime(isLocalTime)
      }

      override fun isLocalTime(isLocalTime: IResolvable) {
        cdkBuilder.isLocalTime(isLocalTime.let(IResolvable::unwrap))
      }

      override fun quietTime(quietTime: IResolvable) {
        cdkBuilder.quietTime(quietTime.let(IResolvable::unwrap))
      }

      override fun quietTime(quietTime: QuietTimeProperty) {
        cdkBuilder.quietTime(quietTime.let(QuietTimeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ed81d35fd706191dfa298b7a8c2139b5e0327d8a6782d2b5b3d8bdba3b83b51d")
      override fun quietTime(quietTime: QuietTimeProperty.Builder.() -> Unit): Unit =
          quietTime(QuietTimeProperty(quietTime))

      override fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
      }

      override fun timeZone(timeZone: String) {
        cdkBuilder.timeZone(timeZone)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty,
    ) : ScheduleProperty {
      override fun endTime(): String? = unwrap(this).getEndTime()

      override fun eventFilter(): Any? = unwrap(this).getEventFilter()

      override fun frequency(): String? = unwrap(this).getFrequency()

      override fun isLocalTime(): Any? = unwrap(this).getIsLocalTime()

      override fun quietTime(): Any? = unwrap(this).getQuietTime()

      override fun startTime(): String? = unwrap(this).getStartTime()

      override fun timeZone(): String? = unwrap(this).getTimeZone()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.ScheduleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WriteTreatmentResourceProperty {
    public fun customDeliveryConfiguration(): Any? = unwrap(this).getCustomDeliveryConfiguration()

    public fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

    public fun schedule(): Any? = unwrap(this).getSchedule()

    public fun sizePercent(): Number? = unwrap(this).getSizePercent()

    public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    public fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

    public fun treatmentName(): String? = unwrap(this).getTreatmentName()

    public interface Builder {
      public fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable)

      public
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44ba8164fd0c47cc6686cea43cfdeec281f6cb2b341733d79c9173d2de53f94f")
      public
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit)

      public fun messageConfiguration(messageConfiguration: IResolvable)

      public fun messageConfiguration(messageConfiguration: MessageConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d1b1cde2528cc290d0880568ecd116a092a6e4b0621cbf1e6e21071423adcce")
      public
          fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit)

      public fun schedule(schedule: IResolvable)

      public fun schedule(schedule: ScheduleProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177b9b9a3d674ff696e32c1995acca5da423036cbb0d0a05e43ed835928a21c7")
      public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

      public fun sizePercent(sizePercent: Number)

      public fun templateConfiguration(templateConfiguration: IResolvable)

      public fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("247644848b7c974023ecedc4fa133c31bc6fabb30dbd8a7c579e4513592ce44f")
      public
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit)

      public fun treatmentDescription(treatmentDescription: String)

      public fun treatmentName(treatmentName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty.builder()

      override fun customDeliveryConfiguration(customDeliveryConfiguration: IResolvable) {
        cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(IResolvable::unwrap))
      }

      override
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty) {
        cdkBuilder.customDeliveryConfiguration(customDeliveryConfiguration.let(CustomDeliveryConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44ba8164fd0c47cc6686cea43cfdeec281f6cb2b341733d79c9173d2de53f94f")
      override
          fun customDeliveryConfiguration(customDeliveryConfiguration: CustomDeliveryConfigurationProperty.Builder.() -> Unit):
          Unit =
          customDeliveryConfiguration(CustomDeliveryConfigurationProperty(customDeliveryConfiguration))

      override fun messageConfiguration(messageConfiguration: IResolvable) {
        cdkBuilder.messageConfiguration(messageConfiguration.let(IResolvable::unwrap))
      }

      override fun messageConfiguration(messageConfiguration: MessageConfigurationProperty) {
        cdkBuilder.messageConfiguration(messageConfiguration.let(MessageConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4d1b1cde2528cc290d0880568ecd116a092a6e4b0621cbf1e6e21071423adcce")
      override
          fun messageConfiguration(messageConfiguration: MessageConfigurationProperty.Builder.() -> Unit):
          Unit = messageConfiguration(MessageConfigurationProperty(messageConfiguration))

      override fun schedule(schedule: IResolvable) {
        cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
      }

      override fun schedule(schedule: ScheduleProperty) {
        cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("177b9b9a3d674ff696e32c1995acca5da423036cbb0d0a05e43ed835928a21c7")
      override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
          schedule(ScheduleProperty(schedule))

      override fun sizePercent(sizePercent: Number) {
        cdkBuilder.sizePercent(sizePercent)
      }

      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable::unwrap))
      }

      override fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(TemplateConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("247644848b7c974023ecedc4fa133c31bc6fabb30dbd8a7c579e4513592ce44f")
      override
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(TemplateConfigurationProperty(templateConfiguration))

      override fun treatmentDescription(treatmentDescription: String) {
        cdkBuilder.treatmentDescription(treatmentDescription)
      }

      override fun treatmentName(treatmentName: String) {
        cdkBuilder.treatmentName(treatmentName)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty,
    ) : WriteTreatmentResourceProperty {
      override fun customDeliveryConfiguration(): Any? =
          unwrap(this).getCustomDeliveryConfiguration()

      override fun messageConfiguration(): Any? = unwrap(this).getMessageConfiguration()

      override fun schedule(): Any? = unwrap(this).getSchedule()

      override fun sizePercent(): Number? = unwrap(this).getSizePercent()

      override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

      override fun treatmentDescription(): String? = unwrap(this).getTreatmentDescription()

      override fun treatmentName(): String? = unwrap(this).getTreatmentName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WriteTreatmentResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty):
          WriteTreatmentResourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WriteTreatmentResourceProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.WriteTreatmentResourceProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MessageConfigurationProperty {
    public fun admMessage(): Any? = unwrap(this).getAdmMessage()

    public fun apnsMessage(): Any? = unwrap(this).getApnsMessage()

    public fun baiduMessage(): Any? = unwrap(this).getBaiduMessage()

    public fun customMessage(): Any? = unwrap(this).getCustomMessage()

    public fun defaultMessage(): Any? = unwrap(this).getDefaultMessage()

    public fun emailMessage(): Any? = unwrap(this).getEmailMessage()

    public fun gcmMessage(): Any? = unwrap(this).getGcmMessage()

    public fun inAppMessage(): Any? = unwrap(this).getInAppMessage()

    public fun smsMessage(): Any? = unwrap(this).getSmsMessage()

    public interface Builder {
      public fun admMessage(admMessage: IResolvable)

      public fun admMessage(admMessage: MessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("874b3737aeca360fa6c69d0ce215d7414d3c669d1e502dbed9b0bc6183b71b30")
      public fun admMessage(admMessage: MessageProperty.Builder.() -> Unit)

      public fun apnsMessage(apnsMessage: IResolvable)

      public fun apnsMessage(apnsMessage: MessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f9298d8c1d6015e10cf48920b98f86bdd486c9f1111f59c00625c991307b45")
      public fun apnsMessage(apnsMessage: MessageProperty.Builder.() -> Unit)

      public fun baiduMessage(baiduMessage: IResolvable)

      public fun baiduMessage(baiduMessage: MessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2804abc44f02e2e43121aa52b652d5a01dd125f8acfc456398bd7fd129d9328f")
      public fun baiduMessage(baiduMessage: MessageProperty.Builder.() -> Unit)

      public fun customMessage(customMessage: IResolvable)

      public fun customMessage(customMessage: CampaignCustomMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8a6c617eeed6b7763b696c8d0f3891c08ac5795cc74515b76350dc47e0558ca")
      public fun customMessage(customMessage: CampaignCustomMessageProperty.Builder.() -> Unit)

      public fun defaultMessage(defaultMessage: IResolvable)

      public fun defaultMessage(defaultMessage: MessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def3520f002eadc626d7232b2bf7080a8f10e77e74926434c22eab2cb2bf2855")
      public fun defaultMessage(defaultMessage: MessageProperty.Builder.() -> Unit)

      public fun emailMessage(emailMessage: IResolvable)

      public fun emailMessage(emailMessage: CampaignEmailMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27371de087267f4f96761f1118ec73d5c86b4e657bf26ce2ba84ab880dae2c0d")
      public fun emailMessage(emailMessage: CampaignEmailMessageProperty.Builder.() -> Unit)

      public fun gcmMessage(gcmMessage: IResolvable)

      public fun gcmMessage(gcmMessage: MessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f749003fa0809878110304c4b217724caca5c1dac7187a9c07900d65180e7a13")
      public fun gcmMessage(gcmMessage: MessageProperty.Builder.() -> Unit)

      public fun inAppMessage(inAppMessage: IResolvable)

      public fun inAppMessage(inAppMessage: CampaignInAppMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("652150ef74c21e886bfa67ab181e340c2d7973c9f2eb751c67c4ec0f355ab6f2")
      public fun inAppMessage(inAppMessage: CampaignInAppMessageProperty.Builder.() -> Unit)

      public fun smsMessage(smsMessage: IResolvable)

      public fun smsMessage(smsMessage: CampaignSmsMessageProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc6a7f353bd1385ecb81f84b39646b4b5ba44a5b89ab5f6aee654507cb210e0f")
      public fun smsMessage(smsMessage: CampaignSmsMessageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty.builder()

      override fun admMessage(admMessage: IResolvable) {
        cdkBuilder.admMessage(admMessage.let(IResolvable::unwrap))
      }

      override fun admMessage(admMessage: MessageProperty) {
        cdkBuilder.admMessage(admMessage.let(MessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("874b3737aeca360fa6c69d0ce215d7414d3c669d1e502dbed9b0bc6183b71b30")
      override fun admMessage(admMessage: MessageProperty.Builder.() -> Unit): Unit =
          admMessage(MessageProperty(admMessage))

      override fun apnsMessage(apnsMessage: IResolvable) {
        cdkBuilder.apnsMessage(apnsMessage.let(IResolvable::unwrap))
      }

      override fun apnsMessage(apnsMessage: MessageProperty) {
        cdkBuilder.apnsMessage(apnsMessage.let(MessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2f9298d8c1d6015e10cf48920b98f86bdd486c9f1111f59c00625c991307b45")
      override fun apnsMessage(apnsMessage: MessageProperty.Builder.() -> Unit): Unit =
          apnsMessage(MessageProperty(apnsMessage))

      override fun baiduMessage(baiduMessage: IResolvable) {
        cdkBuilder.baiduMessage(baiduMessage.let(IResolvable::unwrap))
      }

      override fun baiduMessage(baiduMessage: MessageProperty) {
        cdkBuilder.baiduMessage(baiduMessage.let(MessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2804abc44f02e2e43121aa52b652d5a01dd125f8acfc456398bd7fd129d9328f")
      override fun baiduMessage(baiduMessage: MessageProperty.Builder.() -> Unit): Unit =
          baiduMessage(MessageProperty(baiduMessage))

      override fun customMessage(customMessage: IResolvable) {
        cdkBuilder.customMessage(customMessage.let(IResolvable::unwrap))
      }

      override fun customMessage(customMessage: CampaignCustomMessageProperty) {
        cdkBuilder.customMessage(customMessage.let(CampaignCustomMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8a6c617eeed6b7763b696c8d0f3891c08ac5795cc74515b76350dc47e0558ca")
      override fun customMessage(customMessage: CampaignCustomMessageProperty.Builder.() -> Unit):
          Unit = customMessage(CampaignCustomMessageProperty(customMessage))

      override fun defaultMessage(defaultMessage: IResolvable) {
        cdkBuilder.defaultMessage(defaultMessage.let(IResolvable::unwrap))
      }

      override fun defaultMessage(defaultMessage: MessageProperty) {
        cdkBuilder.defaultMessage(defaultMessage.let(MessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def3520f002eadc626d7232b2bf7080a8f10e77e74926434c22eab2cb2bf2855")
      override fun defaultMessage(defaultMessage: MessageProperty.Builder.() -> Unit): Unit =
          defaultMessage(MessageProperty(defaultMessage))

      override fun emailMessage(emailMessage: IResolvable) {
        cdkBuilder.emailMessage(emailMessage.let(IResolvable::unwrap))
      }

      override fun emailMessage(emailMessage: CampaignEmailMessageProperty) {
        cdkBuilder.emailMessage(emailMessage.let(CampaignEmailMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27371de087267f4f96761f1118ec73d5c86b4e657bf26ce2ba84ab880dae2c0d")
      override fun emailMessage(emailMessage: CampaignEmailMessageProperty.Builder.() -> Unit): Unit
          = emailMessage(CampaignEmailMessageProperty(emailMessage))

      override fun gcmMessage(gcmMessage: IResolvable) {
        cdkBuilder.gcmMessage(gcmMessage.let(IResolvable::unwrap))
      }

      override fun gcmMessage(gcmMessage: MessageProperty) {
        cdkBuilder.gcmMessage(gcmMessage.let(MessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f749003fa0809878110304c4b217724caca5c1dac7187a9c07900d65180e7a13")
      override fun gcmMessage(gcmMessage: MessageProperty.Builder.() -> Unit): Unit =
          gcmMessage(MessageProperty(gcmMessage))

      override fun inAppMessage(inAppMessage: IResolvable) {
        cdkBuilder.inAppMessage(inAppMessage.let(IResolvable::unwrap))
      }

      override fun inAppMessage(inAppMessage: CampaignInAppMessageProperty) {
        cdkBuilder.inAppMessage(inAppMessage.let(CampaignInAppMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("652150ef74c21e886bfa67ab181e340c2d7973c9f2eb751c67c4ec0f355ab6f2")
      override fun inAppMessage(inAppMessage: CampaignInAppMessageProperty.Builder.() -> Unit): Unit
          = inAppMessage(CampaignInAppMessageProperty(inAppMessage))

      override fun smsMessage(smsMessage: IResolvable) {
        cdkBuilder.smsMessage(smsMessage.let(IResolvable::unwrap))
      }

      override fun smsMessage(smsMessage: CampaignSmsMessageProperty) {
        cdkBuilder.smsMessage(smsMessage.let(CampaignSmsMessageProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bc6a7f353bd1385ecb81f84b39646b4b5ba44a5b89ab5f6aee654507cb210e0f")
      override fun smsMessage(smsMessage: CampaignSmsMessageProperty.Builder.() -> Unit): Unit =
          smsMessage(CampaignSmsMessageProperty(smsMessage))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty,
    ) : MessageConfigurationProperty {
      override fun admMessage(): Any? = unwrap(this).getAdmMessage()

      override fun apnsMessage(): Any? = unwrap(this).getApnsMessage()

      override fun baiduMessage(): Any? = unwrap(this).getBaiduMessage()

      override fun customMessage(): Any? = unwrap(this).getCustomMessage()

      override fun defaultMessage(): Any? = unwrap(this).getDefaultMessage()

      override fun emailMessage(): Any? = unwrap(this).getEmailMessage()

      override fun gcmMessage(): Any? = unwrap(this).getGcmMessage()

      override fun inAppMessage(): Any? = unwrap(this).getInAppMessage()

      override fun smsMessage(): Any? = unwrap(this).getSmsMessage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MessageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty):
          MessageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventDimensionsProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public fun eventType(): Any? = unwrap(this).getEventType()

    public fun metrics(): Any? = unwrap(this).getMetrics()

    public interface Builder {
      public fun attributes(attributes: Any)

      public fun eventType(eventType: IResolvable)

      public fun eventType(eventType: SetDimensionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ad61458427c18700e49dfcab48c055c5a8f5777142f0c45e28da4d72b94e7b2")
      public fun eventType(eventType: SetDimensionProperty.Builder.() -> Unit)

      public fun metrics(metrics: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty.builder()

      override fun attributes(attributes: Any) {
        cdkBuilder.attributes(attributes)
      }

      override fun eventType(eventType: IResolvable) {
        cdkBuilder.eventType(eventType.let(IResolvable::unwrap))
      }

      override fun eventType(eventType: SetDimensionProperty) {
        cdkBuilder.eventType(eventType.let(SetDimensionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5ad61458427c18700e49dfcab48c055c5a8f5777142f0c45e28da4d72b94e7b2")
      override fun eventType(eventType: SetDimensionProperty.Builder.() -> Unit): Unit =
          eventType(SetDimensionProperty(eventType))

      override fun metrics(metrics: Any) {
        cdkBuilder.metrics(metrics)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty,
    ) : EventDimensionsProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()

      override fun eventType(): Any? = unwrap(this).getEventType()

      override fun metrics(): Any? = unwrap(this).getMetrics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventDimensionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty):
          EventDimensionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventDimensionsProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.EventDimensionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SetDimensionProperty {
    public fun dimensionType(): String? = unwrap(this).getDimensionType()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun dimensionType(dimensionType: String)

      public fun values(values: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty.builder()

      override fun dimensionType(dimensionType: String) {
        cdkBuilder.dimensionType(dimensionType)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty,
    ) : SetDimensionProperty {
      override fun dimensionType(): String? = unwrap(this).getDimensionType()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SetDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty):
          SetDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SetDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.SetDimensionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TemplateConfigurationProperty {
    public fun emailTemplate(): Any? = unwrap(this).getEmailTemplate()

    public fun pushTemplate(): Any? = unwrap(this).getPushTemplate()

    public fun smsTemplate(): Any? = unwrap(this).getSmsTemplate()

    public fun voiceTemplate(): Any? = unwrap(this).getVoiceTemplate()

    public interface Builder {
      public fun emailTemplate(emailTemplate: IResolvable)

      public fun emailTemplate(emailTemplate: TemplateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("842fa1af0f31eea2a4e19f627af3f2e53f87fec05ec016f69cbf49d68e8aa2ea")
      public fun emailTemplate(emailTemplate: TemplateProperty.Builder.() -> Unit)

      public fun pushTemplate(pushTemplate: IResolvable)

      public fun pushTemplate(pushTemplate: TemplateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("656da5de3c8e03c8eb5892b28fab018dd4d74ff09d50a56f5edcff565992c0ae")
      public fun pushTemplate(pushTemplate: TemplateProperty.Builder.() -> Unit)

      public fun smsTemplate(smsTemplate: IResolvable)

      public fun smsTemplate(smsTemplate: TemplateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df53a266a2d1d0eb0501aec4f0b01cbea6c65d43dab0f9d25440837e1a028453")
      public fun smsTemplate(smsTemplate: TemplateProperty.Builder.() -> Unit)

      public fun voiceTemplate(voiceTemplate: IResolvable)

      public fun voiceTemplate(voiceTemplate: TemplateProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773aebfddece0f54dab162d31414f65d973191a5c268ca0e84d9fcd984c7f133")
      public fun voiceTemplate(voiceTemplate: TemplateProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty.builder()

      override fun emailTemplate(emailTemplate: IResolvable) {
        cdkBuilder.emailTemplate(emailTemplate.let(IResolvable::unwrap))
      }

      override fun emailTemplate(emailTemplate: TemplateProperty) {
        cdkBuilder.emailTemplate(emailTemplate.let(TemplateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("842fa1af0f31eea2a4e19f627af3f2e53f87fec05ec016f69cbf49d68e8aa2ea")
      override fun emailTemplate(emailTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          emailTemplate(TemplateProperty(emailTemplate))

      override fun pushTemplate(pushTemplate: IResolvable) {
        cdkBuilder.pushTemplate(pushTemplate.let(IResolvable::unwrap))
      }

      override fun pushTemplate(pushTemplate: TemplateProperty) {
        cdkBuilder.pushTemplate(pushTemplate.let(TemplateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("656da5de3c8e03c8eb5892b28fab018dd4d74ff09d50a56f5edcff565992c0ae")
      override fun pushTemplate(pushTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          pushTemplate(TemplateProperty(pushTemplate))

      override fun smsTemplate(smsTemplate: IResolvable) {
        cdkBuilder.smsTemplate(smsTemplate.let(IResolvable::unwrap))
      }

      override fun smsTemplate(smsTemplate: TemplateProperty) {
        cdkBuilder.smsTemplate(smsTemplate.let(TemplateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df53a266a2d1d0eb0501aec4f0b01cbea6c65d43dab0f9d25440837e1a028453")
      override fun smsTemplate(smsTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          smsTemplate(TemplateProperty(smsTemplate))

      override fun voiceTemplate(voiceTemplate: IResolvable) {
        cdkBuilder.voiceTemplate(voiceTemplate.let(IResolvable::unwrap))
      }

      override fun voiceTemplate(voiceTemplate: TemplateProperty) {
        cdkBuilder.voiceTemplate(voiceTemplate.let(TemplateProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("773aebfddece0f54dab162d31414f65d973191a5c268ca0e84d9fcd984c7f133")
      override fun voiceTemplate(voiceTemplate: TemplateProperty.Builder.() -> Unit): Unit =
          voiceTemplate(TemplateProperty(voiceTemplate))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty,
    ) : TemplateConfigurationProperty {
      override fun emailTemplate(): Any? = unwrap(this).getEmailTemplate()

      override fun pushTemplate(): Any? = unwrap(this).getPushTemplate()

      override fun smsTemplate(): Any? = unwrap(this).getSmsTemplate()

      override fun voiceTemplate(): Any? = unwrap(this).getVoiceTemplate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty):
          TemplateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.TemplateConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CampaignEventFilterProperty {
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    public fun filterType(): String? = unwrap(this).getFilterType()

    public interface Builder {
      public fun dimensions(dimensions: IResolvable)

      public fun dimensions(dimensions: EventDimensionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f3a6f301fe266dc628fdb1708f34abc9d1ea5d13b72d4ef29cea10dbf50010")
      public fun dimensions(dimensions: EventDimensionsProperty.Builder.() -> Unit)

      public fun filterType(filterType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty.builder()

      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      override fun dimensions(dimensions: EventDimensionsProperty) {
        cdkBuilder.dimensions(dimensions.let(EventDimensionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a0f3a6f301fe266dc628fdb1708f34abc9d1ea5d13b72d4ef29cea10dbf50010")
      override fun dimensions(dimensions: EventDimensionsProperty.Builder.() -> Unit): Unit =
          dimensions(EventDimensionsProperty(dimensions))

      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty,
    ) : CampaignEventFilterProperty {
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      override fun filterType(): String? = unwrap(this).getFilterType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CampaignEventFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty):
          CampaignEventFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CampaignEventFilterProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.CampaignEventFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DefaultButtonConfigurationProperty {
    public fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

    public fun borderRadius(): Number? = unwrap(this).getBorderRadius()

    public fun buttonAction(): String? = unwrap(this).getButtonAction()

    public fun link(): String? = unwrap(this).getLink()

    public fun text(): String? = unwrap(this).getText()

    public fun textColor(): String? = unwrap(this).getTextColor()

    public interface Builder {
      public fun backgroundColor(backgroundColor: String)

      public fun borderRadius(borderRadius: Number)

      public fun buttonAction(buttonAction: String)

      public fun link(link: String)

      public fun text(text: String)

      public fun textColor(textColor: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty.builder()

      override fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
      }

      override fun borderRadius(borderRadius: Number) {
        cdkBuilder.borderRadius(borderRadius)
      }

      override fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
      }

      override fun link(link: String) {
        cdkBuilder.link(link)
      }

      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      override fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty,
    ) : DefaultButtonConfigurationProperty {
      override fun backgroundColor(): String? = unwrap(this).getBackgroundColor()

      override fun borderRadius(): Number? = unwrap(this).getBorderRadius()

      override fun buttonAction(): String? = unwrap(this).getButtonAction()

      override fun link(): String? = unwrap(this).getLink()

      override fun text(): String? = unwrap(this).getText()

      override fun textColor(): String? = unwrap(this).getTextColor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultButtonConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty):
          DefaultButtonConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultButtonConfigurationProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.DefaultButtonConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricDimensionProperty {
    public fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

    public fun `value`(): Number? = unwrap(this).getValue()

    public interface Builder {
      public fun comparisonOperator(comparisonOperator: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty.builder()

      override fun comparisonOperator(comparisonOperator: String) {
        cdkBuilder.comparisonOperator(comparisonOperator)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty,
    ) : MetricDimensionProperty {
      override fun comparisonOperator(): String? = unwrap(this).getComparisonOperator()

      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MetricDimensionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MessageProperty {
    public fun action(): String? = unwrap(this).getAction()

    public fun body(): String? = unwrap(this).getBody()

    public fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

    public fun imageSmallIconUrl(): String? = unwrap(this).getImageSmallIconUrl()

    public fun imageUrl(): String? = unwrap(this).getImageUrl()

    public fun jsonBody(): String? = unwrap(this).getJsonBody()

    public fun mediaUrl(): String? = unwrap(this).getMediaUrl()

    public fun rawContent(): String? = unwrap(this).getRawContent()

    public fun silentPush(): Any? = unwrap(this).getSilentPush()

    public fun timeToLive(): Number? = unwrap(this).getTimeToLive()

    public fun title(): String? = unwrap(this).getTitle()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun action(action: String)

      public fun body(body: String)

      public fun imageIconUrl(imageIconUrl: String)

      public fun imageSmallIconUrl(imageSmallIconUrl: String)

      public fun imageUrl(imageUrl: String)

      public fun jsonBody(jsonBody: String)

      public fun mediaUrl(mediaUrl: String)

      public fun rawContent(rawContent: String)

      public fun silentPush(silentPush: Boolean)

      public fun silentPush(silentPush: IResolvable)

      public fun timeToLive(timeToLive: Number)

      public fun title(title: String)

      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty.builder()

      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      override fun body(body: String) {
        cdkBuilder.body(body)
      }

      override fun imageIconUrl(imageIconUrl: String) {
        cdkBuilder.imageIconUrl(imageIconUrl)
      }

      override fun imageSmallIconUrl(imageSmallIconUrl: String) {
        cdkBuilder.imageSmallIconUrl(imageSmallIconUrl)
      }

      override fun imageUrl(imageUrl: String) {
        cdkBuilder.imageUrl(imageUrl)
      }

      override fun jsonBody(jsonBody: String) {
        cdkBuilder.jsonBody(jsonBody)
      }

      override fun mediaUrl(mediaUrl: String) {
        cdkBuilder.mediaUrl(mediaUrl)
      }

      override fun rawContent(rawContent: String) {
        cdkBuilder.rawContent(rawContent)
      }

      override fun silentPush(silentPush: Boolean) {
        cdkBuilder.silentPush(silentPush)
      }

      override fun silentPush(silentPush: IResolvable) {
        cdkBuilder.silentPush(silentPush.let(IResolvable::unwrap))
      }

      override fun timeToLive(timeToLive: Number) {
        cdkBuilder.timeToLive(timeToLive)
      }

      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build(): software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty,
    ) : MessageProperty {
      override fun action(): String? = unwrap(this).getAction()

      override fun body(): String? = unwrap(this).getBody()

      override fun imageIconUrl(): String? = unwrap(this).getImageIconUrl()

      override fun imageSmallIconUrl(): String? = unwrap(this).getImageSmallIconUrl()

      override fun imageUrl(): String? = unwrap(this).getImageUrl()

      override fun jsonBody(): String? = unwrap(this).getJsonBody()

      override fun mediaUrl(): String? = unwrap(this).getMediaUrl()

      override fun rawContent(): String? = unwrap(this).getRawContent()

      override fun silentPush(): Any? = unwrap(this).getSilentPush()

      override fun timeToLive(): Number? = unwrap(this).getTimeToLive()

      override fun title(): String? = unwrap(this).getTitle()

      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MessageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty):
          MessageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.MessageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AttributeDimensionProperty {
    public fun attributeType(): String? = unwrap(this).getAttributeType()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun attributeType(attributeType: String)

      public fun values(values: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty.builder()

      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty,
    ) : AttributeDimensionProperty {
      override fun attributeType(): String? = unwrap(this).getAttributeType()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty):
          AttributeDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDimensionProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.AttributeDimensionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InAppMessageButtonProperty {
    public fun android(): Any? = unwrap(this).getAndroid()

    public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    public fun ios(): Any? = unwrap(this).getIos()

    public fun web(): Any? = unwrap(this).getWeb()

    public interface Builder {
      public fun android(android: IResolvable)

      public fun android(android: OverrideButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("058ce32e75dc1667aceae9a99fdd7bfab75b4c75e058a4837f4b87ffcd1dc8ea")
      public fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      public fun defaultConfig(defaultConfig: IResolvable)

      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d830591080dc59c997606cbe8ea557e1bd23cb2175235dcd2f55dc172e6b13e9")
      public fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit)

      public fun ios(ios: IResolvable)

      public fun ios(ios: OverrideButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc04855492fdca7573fff426b65031ca8422486ee46f5c785fd481e7b8cd6057")
      public fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit)

      public fun web(web: IResolvable)

      public fun web(web: OverrideButtonConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4153d67a4dac1b6feee87a75636eab3e4b5e003927c798376742aa365262a5e7")
      public fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty.Builder =
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty.builder()

      override fun android(android: IResolvable) {
        cdkBuilder.android(android.let(IResolvable::unwrap))
      }

      override fun android(android: OverrideButtonConfigurationProperty) {
        cdkBuilder.android(android.let(OverrideButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("058ce32e75dc1667aceae9a99fdd7bfab75b4c75e058a4837f4b87ffcd1dc8ea")
      override fun android(android: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          android(OverrideButtonConfigurationProperty(android))

      override fun defaultConfig(defaultConfig: IResolvable) {
        cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
      }

      override fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty) {
        cdkBuilder.defaultConfig(defaultConfig.let(DefaultButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d830591080dc59c997606cbe8ea557e1bd23cb2175235dcd2f55dc172e6b13e9")
      override
          fun defaultConfig(defaultConfig: DefaultButtonConfigurationProperty.Builder.() -> Unit):
          Unit = defaultConfig(DefaultButtonConfigurationProperty(defaultConfig))

      override fun ios(ios: IResolvable) {
        cdkBuilder.ios(ios.let(IResolvable::unwrap))
      }

      override fun ios(ios: OverrideButtonConfigurationProperty) {
        cdkBuilder.ios(ios.let(OverrideButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc04855492fdca7573fff426b65031ca8422486ee46f5c785fd481e7b8cd6057")
      override fun ios(ios: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          ios(OverrideButtonConfigurationProperty(ios))

      override fun web(web: IResolvable) {
        cdkBuilder.web(web.let(IResolvable::unwrap))
      }

      override fun web(web: OverrideButtonConfigurationProperty) {
        cdkBuilder.web(web.let(OverrideButtonConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4153d67a4dac1b6feee87a75636eab3e4b5e003927c798376742aa365262a5e7")
      override fun web(web: OverrideButtonConfigurationProperty.Builder.() -> Unit): Unit =
          web(OverrideButtonConfigurationProperty(web))

      public fun build():
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty,
    ) : InAppMessageButtonProperty {
      override fun android(): Any? = unwrap(this).getAndroid()

      override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

      override fun ios(): Any? = unwrap(this).getIos()

      override fun web(): Any? = unwrap(this).getWeb()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InAppMessageButtonProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty):
          InAppMessageButtonProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InAppMessageButtonProperty):
          software.amazon.awscdk.services.pinpoint.CfnCampaign.InAppMessageButtonProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
