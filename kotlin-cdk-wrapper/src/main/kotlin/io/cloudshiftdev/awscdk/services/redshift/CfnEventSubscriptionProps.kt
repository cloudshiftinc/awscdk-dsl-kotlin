@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEventSubscription`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshift.*;
 * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
 * .subscriptionName("subscriptionName")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .severity("severity")
 * .snsTopicArn("snsTopicArn")
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html)
 */
public interface CfnEventSubscriptionProps {
  /**
   * A boolean value;
   *
   * set to `true` to activate the subscription, and set to `false` to create the subscription but
   * not activate it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies the Amazon Redshift event categories to be published by the event notification
   * subscription.
   *
   * Values: configuration, management, monitoring, security, pending
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
   */
  public fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * Specifies the Amazon Redshift event severity to be published by the event notification
   * subscription.
   *
   * Values: ERROR, INFO
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-severity)
   */
  public fun severity(): String? = unwrap(this).getSeverity()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event
   * notifications.
   *
   * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-snstopicarn)
   */
  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * A list of one or more identifiers of Amazon Redshift source objects.
   *
   * All of the objects must be of the same type as was specified in the source type parameter. The
   * event subscription will return only events generated by the specified objects. If not specified,
   * then events are returned for all objects within the source type specified.
   *
   * Example: my-cluster-1, my-cluster-2
   *
   * Example: my-snapshot-20131010
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
   */
  public fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   * The type of source that will be generating the events.
   *
   * For example, if you want to be notified of events generated by a cluster, you would set this
   * parameter to cluster. If this value is not specified, events are returned for all Amazon Redshift
   * objects in your AWS account . You must specify a source type in order to specify source IDs.
   *
   * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
   * scheduled-action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourcetype)
   */
  public fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * The name of the event subscription to be created.
   *
   * Constraints:
   *
   * * Cannot be null, empty, or blank.
   * * Must contain from 1 to 255 alphanumeric characters or hyphens.
   * * First character must be a letter.
   * * Cannot end with a hyphen or contain two consecutive hyphens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-subscriptionname)
   */
  public fun subscriptionName(): String

  /**
   * A list of tag instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEventSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled A boolean value;.
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled A boolean value;.
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription.
     * Values: configuration, management, monitoring, security, pending
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription.
     * Values: configuration, management, monitoring, security, pending
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * @param severity Specifies the Amazon Redshift event severity to be published by the event
     * notification subscription.
     * Values: ERROR, INFO
     */
    public fun severity(severity: String)

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit
     * the event notifications.
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * @param sourceType The type of source that will be generating the events.
     * For example, if you want to be notified of events generated by a cluster, you would set this
     * parameter to cluster. If this value is not specified, events are returned for all Amazon
     * Redshift objects in your AWS account . You must specify a source type in order to specify source
     * IDs.
     *
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     * scheduled-action.
     */
    public fun sourceType(sourceType: String)

    /**
     * @param subscriptionName The name of the event subscription to be created. 
     * Constraints:
     *
     * * Cannot be null, empty, or blank.
     * * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    public fun subscriptionName(subscriptionName: String)

    /**
     * @param tags A list of tag instances.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tag instances.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps.Builder =
        software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps.builder()

    /**
     * @param enabled A boolean value;.
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A boolean value;.
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription.
     * Values: configuration, management, monitoring, security, pending
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * @param eventCategories Specifies the Amazon Redshift event categories to be published by the
     * event notification subscription.
     * Values: configuration, management, monitoring, security, pending
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * @param severity Specifies the Amazon Redshift event severity to be published by the event
     * notification subscription.
     * Values: ERROR, INFO
     */
    override fun severity(severity: String) {
      cdkBuilder.severity(severity)
    }

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit
     * the event notifications.
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * @param sourceIds A list of one or more identifiers of Amazon Redshift source objects.
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * @param sourceType The type of source that will be generating the events.
     * For example, if you want to be notified of events generated by a cluster, you would set this
     * parameter to cluster. If this value is not specified, events are returned for all Amazon
     * Redshift objects in your AWS account . You must specify a source type in order to specify source
     * IDs.
     *
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     * scheduled-action.
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    /**
     * @param subscriptionName The name of the event subscription to be created. 
     * Constraints:
     *
     * * Cannot be null, empty, or blank.
     * * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * @param tags A list of tag instances.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tag instances.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps,
  ) : CdkObject(cdkObject), CfnEventSubscriptionProps {
    /**
     * A boolean value;
     *
     * set to `true` to activate the subscription, and set to `false` to create the subscription but
     * not activate it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Specifies the Amazon Redshift event categories to be published by the event notification
     * subscription.
     *
     * Values: configuration, management, monitoring, security, pending
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-eventcategories)
     */
    override fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

    /**
     * Specifies the Amazon Redshift event severity to be published by the event notification
     * subscription.
     *
     * Values: ERROR, INFO
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-severity)
     */
    override fun severity(): String? = unwrap(this).getSeverity()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used to transmit the event
     * notifications.
     *
     * The ARN is created by Amazon SNS when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-snstopicarn)
     */
    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * A list of one or more identifiers of Amazon Redshift source objects.
     *
     * All of the objects must be of the same type as was specified in the source type parameter.
     * The event subscription will return only events generated by the specified objects. If not
     * specified, then events are returned for all objects within the source type specified.
     *
     * Example: my-cluster-1, my-cluster-2
     *
     * Example: my-snapshot-20131010
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourceids)
     */
    override fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

    /**
     * The type of source that will be generating the events.
     *
     * For example, if you want to be notified of events generated by a cluster, you would set this
     * parameter to cluster. If this value is not specified, events are returned for all Amazon
     * Redshift objects in your AWS account . You must specify a source type in order to specify source
     * IDs.
     *
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     * scheduled-action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-sourcetype)
     */
    override fun sourceType(): String? = unwrap(this).getSourceType()

    /**
     * The name of the event subscription to be created.
     *
     * Constraints:
     *
     * * Cannot be null, empty, or blank.
     * * Must contain from 1 to 255 alphanumeric characters or hyphens.
     * * First character must be a letter.
     * * Cannot end with a hyphen or contain two consecutive hyphens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-subscriptionname)
     */
    override fun subscriptionName(): String = unwrap(this).getSubscriptionName()

    /**
     * A list of tag instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-eventsubscription.html#cfn-redshift-eventsubscription-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps):
        CfnEventSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventSubscriptionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscriptionProps):
        software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnEventSubscriptionProps
  }
}
