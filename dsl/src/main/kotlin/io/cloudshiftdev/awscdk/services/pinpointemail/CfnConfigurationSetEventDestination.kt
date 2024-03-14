package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfigurationSetEventDestination internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

  public open fun configurationSetName(`value`: String) {
    unwrap(this).setConfigurationSetName(`value`)
  }

  public open fun eventDestination(): Any? = unwrap(this).getEventDestination()

  public open fun eventDestination(`value`: IResolvable) {
    unwrap(this).setEventDestination(`value`.let(IResolvable::unwrap))
  }

  public open fun eventDestination(`value`: EventDestinationProperty) {
    unwrap(this).setEventDestination(`value`.let(EventDestinationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4cdf24b4abed1fae2c37d8faccc9d158910bc3ba0adac1b8090f4913c3b00cca")
  public open fun eventDestination(`value`: EventDestinationProperty.Builder.() -> Unit): Unit =
      eventDestination(EventDestinationProperty(`value`))

  public open fun eventDestinationName(): String = unwrap(this).getEventDestinationName()

  public open fun eventDestinationName(`value`: String) {
    unwrap(this).setEventDestinationName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun configurationSetName(configurationSetName: String)

    public fun eventDestination(eventDestination: IResolvable)

    public fun eventDestination(eventDestination: EventDestinationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b9bd9bdcdedc7ddffaa2a46d5a0f738c4129004755fec0f000269d00741256")
    public fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit)

    public fun eventDestinationName(eventDestinationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.Builder.create(scope,
        id)

    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    override fun eventDestination(eventDestination: IResolvable) {
      cdkBuilder.eventDestination(eventDestination.let(IResolvable::unwrap))
    }

    override fun eventDestination(eventDestination: EventDestinationProperty) {
      cdkBuilder.eventDestination(eventDestination.let(EventDestinationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b9bd9bdcdedc7ddffaa2a46d5a0f738c4129004755fec0f000269d00741256")
    override fun eventDestination(eventDestination: EventDestinationProperty.Builder.() -> Unit):
        Unit = eventDestination(EventDestinationProperty(eventDestination))

    override fun eventDestinationName(eventDestinationName: String) {
      cdkBuilder.eventDestinationName(eventDestinationName)
    }

    public fun build():
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfigurationSetEventDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfigurationSetEventDestination(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination):
        CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetEventDestination):
        software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination =
        wrapped.cdkObject
  }

  public interface KinesisFirehoseDestinationProperty {
    public fun deliveryStreamArn(): String

    public fun iamRoleArn(): String

    public interface Builder {
      public fun deliveryStreamArn(deliveryStreamArn: String)

      public fun iamRoleArn(iamRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty.builder()

      override fun deliveryStreamArn(deliveryStreamArn: String) {
        cdkBuilder.deliveryStreamArn(deliveryStreamArn)
      }

      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty,
    ) : KinesisFirehoseDestinationProperty {
      override fun deliveryStreamArn(): String = unwrap(this).getDeliveryStreamArn()

      override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisFirehoseDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty):
          KinesisFirehoseDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DimensionConfigurationProperty {
    public fun defaultDimensionValue(): String

    public fun dimensionName(): String

    public fun dimensionValueSource(): String

    public interface Builder {
      public fun defaultDimensionValue(defaultDimensionValue: String)

      public fun dimensionName(dimensionName: String)

      public fun dimensionValueSource(dimensionValueSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty.builder()

      override fun defaultDimensionValue(defaultDimensionValue: String) {
        cdkBuilder.defaultDimensionValue(defaultDimensionValue)
      }

      override fun dimensionName(dimensionName: String) {
        cdkBuilder.dimensionName(dimensionName)
      }

      override fun dimensionValueSource(dimensionValueSource: String) {
        cdkBuilder.dimensionValueSource(dimensionValueSource)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty,
    ) : DimensionConfigurationProperty {
      override fun defaultDimensionValue(): String = unwrap(this).getDefaultDimensionValue()

      override fun dimensionName(): String = unwrap(this).getDimensionName()

      override fun dimensionValueSource(): String = unwrap(this).getDimensionValueSource()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty):
          DimensionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionConfigurationProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.DimensionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventDestinationProperty {
    public fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

    public fun matchingEventTypes(): List<String>

    public fun pinpointDestination(): Any? = unwrap(this).getPinpointDestination()

    public fun snsDestination(): Any? = unwrap(this).getSnsDestination()

    public interface Builder {
      public fun cloudWatchDestination(cloudWatchDestination: IResolvable)

      public fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e9fc2a34e118e7b4387173c6059c80dd9fb77059a5287b9f9174bd77a7a6e72")
      public
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable)

      public
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31ea93ea3e5b1474b2865d44f5c8a2b0672a0899216443643af185207ddb80ef")
      public
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit)

      public fun matchingEventTypes(matchingEventTypes: List<String>)

      public fun pinpointDestination(pinpointDestination: IResolvable)

      public fun pinpointDestination(pinpointDestination: PinpointDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0e72b2083e48efdc99a6df8973025d6ff6e04afe354e4fa32a0d061f585d422")
      public
          fun pinpointDestination(pinpointDestination: PinpointDestinationProperty.Builder.() -> Unit)

      public fun snsDestination(snsDestination: IResolvable)

      public fun snsDestination(snsDestination: SnsDestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("591097f644de94cf4d32d59ec2837b23622eeaafd8f0508a639a95b27fc6effd")
      public fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty.builder()

      override fun cloudWatchDestination(cloudWatchDestination: IResolvable) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(IResolvable::unwrap))
      }

      override fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty) {
        cdkBuilder.cloudWatchDestination(cloudWatchDestination.let(CloudWatchDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e9fc2a34e118e7b4387173c6059c80dd9fb77059a5287b9f9174bd77a7a6e72")
      override
          fun cloudWatchDestination(cloudWatchDestination: CloudWatchDestinationProperty.Builder.() -> Unit):
          Unit = cloudWatchDestination(CloudWatchDestinationProperty(cloudWatchDestination))

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun kinesisFirehoseDestination(kinesisFirehoseDestination: IResolvable) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(IResolvable::unwrap))
      }

      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty) {
        cdkBuilder.kinesisFirehoseDestination(kinesisFirehoseDestination.let(KinesisFirehoseDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("31ea93ea3e5b1474b2865d44f5c8a2b0672a0899216443643af185207ddb80ef")
      override
          fun kinesisFirehoseDestination(kinesisFirehoseDestination: KinesisFirehoseDestinationProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDestination(KinesisFirehoseDestinationProperty(kinesisFirehoseDestination))

      override fun matchingEventTypes(matchingEventTypes: List<String>) {
        cdkBuilder.matchingEventTypes(matchingEventTypes)
      }

      override fun pinpointDestination(pinpointDestination: IResolvable) {
        cdkBuilder.pinpointDestination(pinpointDestination.let(IResolvable::unwrap))
      }

      override fun pinpointDestination(pinpointDestination: PinpointDestinationProperty) {
        cdkBuilder.pinpointDestination(pinpointDestination.let(PinpointDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0e72b2083e48efdc99a6df8973025d6ff6e04afe354e4fa32a0d061f585d422")
      override
          fun pinpointDestination(pinpointDestination: PinpointDestinationProperty.Builder.() -> Unit):
          Unit = pinpointDestination(PinpointDestinationProperty(pinpointDestination))

      override fun snsDestination(snsDestination: IResolvable) {
        cdkBuilder.snsDestination(snsDestination.let(IResolvable::unwrap))
      }

      override fun snsDestination(snsDestination: SnsDestinationProperty) {
        cdkBuilder.snsDestination(snsDestination.let(SnsDestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("591097f644de94cf4d32d59ec2837b23622eeaafd8f0508a639a95b27fc6effd")
      override fun snsDestination(snsDestination: SnsDestinationProperty.Builder.() -> Unit): Unit =
          snsDestination(SnsDestinationProperty(snsDestination))

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty,
    ) : EventDestinationProperty {
      override fun cloudWatchDestination(): Any? = unwrap(this).getCloudWatchDestination()

      override fun enabled(): Any? = unwrap(this).getEnabled()

      override fun kinesisFirehoseDestination(): Any? = unwrap(this).getKinesisFirehoseDestination()

      override fun matchingEventTypes(): List<String> = unwrap(this).getMatchingEventTypes() ?:
          emptyList()

      override fun pinpointDestination(): Any? = unwrap(this).getPinpointDestination()

      override fun snsDestination(): Any? = unwrap(this).getSnsDestination()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty):
          EventDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventDestinationProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnsDestinationProperty {
    public fun topicArn(): String

    public interface Builder {
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty.builder()

      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty,
    ) : SnsDestinationProperty {
      override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnsDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty):
          SnsDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsDestinationProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PinpointDestinationProperty {
    public fun applicationArn(): String? = unwrap(this).getApplicationArn()

    public interface Builder {
      public fun applicationArn(applicationArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty.builder()

      override fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty,
    ) : PinpointDestinationProperty {
      override fun applicationArn(): String? = unwrap(this).getApplicationArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PinpointDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty):
          PinpointDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PinpointDestinationProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchDestinationProperty {
    public fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()

    public interface Builder {
      public fun dimensionConfigurations(dimensionConfigurations: IResolvable)

      public fun dimensionConfigurations(dimensionConfigurations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder
          =
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.builder()

      override fun dimensionConfigurations(dimensionConfigurations: IResolvable) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations.let(IResolvable::unwrap))
      }

      override fun dimensionConfigurations(dimensionConfigurations: List<Any>) {
        cdkBuilder.dimensionConfigurations(dimensionConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty,
    ) : CloudWatchDestinationProperty {
      override fun dimensionConfigurations(): Any? = unwrap(this).getDimensionConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchDestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty):
          CloudWatchDestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchDestinationProperty):
          software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}