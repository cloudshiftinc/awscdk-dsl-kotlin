@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfigurationSetEventDestination`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnConfigurationSetEventDestinationProps cfnConfigurationSetEventDestinationProps =
 * CfnConfigurationSetEventDestinationProps.builder()
 * .configurationSetName("configurationSetName")
 * .eventDestination(EventDestinationProperty.builder()
 * .matchingEventTypes(List.of("matchingEventTypes"))
 * // the properties below are optional
 * .cloudWatchDestination(CloudWatchDestinationProperty.builder()
 * .dimensionConfigurations(List.of(DimensionConfigurationProperty.builder()
 * .defaultDimensionValue("defaultDimensionValue")
 * .dimensionName("dimensionName")
 * .dimensionValueSource("dimensionValueSource")
 * .build()))
 * .build())
 * .enabled(false)
 * .kinesisFirehoseDestination(KinesisFirehoseDestinationProperty.builder()
 * .deliveryStreamArn("deliveryStreamArn")
 * .iamRoleArn("iamRoleArn")
 * .build())
 * .name("name")
 * .snsDestination(SnsDestinationProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html)
 */
public interface CfnConfigurationSetEventDestinationProps {
  /**
   * The name of the configuration set that contains the event destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
   */
  public fun configurationSetName(): String

  /**
   * The event destination object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
   */
  public fun eventDestination(): Any

  /**
   * A builder for [CfnConfigurationSetEventDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSetName The name of the configuration set that contains the event
     * destination. 
     */
    public fun configurationSetName(configurationSetName: String)

    /**
     * @param eventDestination The event destination object. 
     */
    public fun eventDestination(eventDestination: IResolvable)

    /**
     * @param eventDestination The event destination object. 
     */
    public
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty)

    /**
     * @param eventDestination The event destination object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23aacf5cf24571485028814a8aa03c67b3b3c3144f61ce9dfdea5bc6c91855c6")
    public
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps.Builder =
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps.builder()

    /**
     * @param configurationSetName The name of the configuration set that contains the event
     * destination. 
     */
    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * @param eventDestination The event destination object. 
     */
    override fun eventDestination(eventDestination: IResolvable) {
      cdkBuilder.eventDestination(eventDestination.let(IResolvable::unwrap))
    }

    /**
     * @param eventDestination The event destination object. 
     */
    override
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
      cdkBuilder.eventDestination(eventDestination.let(CfnConfigurationSetEventDestination.EventDestinationProperty::unwrap))
    }

    /**
     * @param eventDestination The event destination object. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23aacf5cf24571485028814a8aa03c67b3b3c3144f61ce9dfdea5bc6c91855c6")
    override
        fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty.Builder.() -> Unit):
        Unit =
        eventDestination(CfnConfigurationSetEventDestination.EventDestinationProperty(eventDestination))

    public fun build(): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps,
  ) : CdkObject(cdkObject), CfnConfigurationSetEventDestinationProps {
    /**
     * The name of the configuration set that contains the event destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-configurationsetname)
     */
    override fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

    /**
     * The event destination object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-configurationseteventdestination.html#cfn-ses-configurationseteventdestination-eventdestination)
     */
    override fun eventDestination(): Any = unwrap(this).getEventDestination()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnConfigurationSetEventDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps):
        CfnConfigurationSetEventDestinationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnConfigurationSetEventDestinationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationSetEventDestinationProps):
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps
  }
}
