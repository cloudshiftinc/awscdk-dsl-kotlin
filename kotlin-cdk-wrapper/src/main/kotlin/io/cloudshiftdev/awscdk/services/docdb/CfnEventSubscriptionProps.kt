@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

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
 * import io.cloudshiftdev.awscdk.services.docdb.*;
 * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
 * .snsTopicArn("snsTopicArn")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .subscriptionName("subscriptionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html)
 */
public interface CfnEventSubscriptionProps {
  /**
   * A Boolean value;
   *
   * set to `true` to activate the subscription, set to `false` to create the subscription but not
   * active it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A list of event categories for a `SourceType` that you want to subscribe to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
   */
  public fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
   *
   * Amazon SNS creates the ARN when you create a topic and subscribe to it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-snstopicarn)
   */
  public fun snsTopicArn(): String

  /**
   * The list of identifiers of the event sources for which events are returned.
   *
   * If not specified, then all sources are included in the response. An identifier must begin with
   * a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or
   * contain two consecutive hyphens.
   *
   * Constraints:
   *
   * * If `SourceIds` are provided, `SourceType` must also be provided.
   * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
   * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
   * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
   * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
   */
  public fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   * The type of source that is generating the events.
   *
   * For example, if you want to be notified of events generated by an instance, you would set this
   * parameter to `db-instance` . If this value is not specified, all events are returned.
   *
   * Valid values: `db-instance` , `db-cluster` , `db-parameter-group` , `db-security-group` ,
   * `db-cluster-snapshot`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourcetype)
   */
  public fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * The name of the subscription.
   *
   * Constraints: The name must be fewer than 255 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-subscriptionname)
   */
  public fun subscriptionName(): String? = unwrap(this).getSubscriptionName()

  /**
   * A builder for [CfnEventSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled A Boolean value;.
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled A Boolean value;.
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to.
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to.
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. 
     * Amazon SNS creates the ARN when you create a topic and subscribe to it.
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * @param sourceType The type of source that is generating the events.
     * For example, if you want to be notified of events generated by an instance, you would set
     * this parameter to `db-instance` . If this value is not specified, all events are returned.
     *
     * Valid values: `db-instance` , `db-cluster` , `db-parameter-group` , `db-security-group` ,
     * `db-cluster-snapshot`
     */
    public fun sourceType(sourceType: String)

    /**
     * @param subscriptionName The name of the subscription.
     * Constraints: The name must be fewer than 255 characters.
     */
    public fun subscriptionName(subscriptionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps.Builder
        = software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps.builder()

    /**
     * @param enabled A Boolean value;.
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A Boolean value;.
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to.
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * @param eventCategories A list of event categories for a `SourceType` that you want to
     * subscribe to.
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. 
     * Amazon SNS creates the ARN when you create a topic and subscribe to it.
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * @param sourceType The type of source that is generating the events.
     * For example, if you want to be notified of events generated by an instance, you would set
     * this parameter to `db-instance` . If this value is not specified, all events are returned.
     *
     * Valid values: `db-instance` , `db-cluster` , `db-parameter-group` , `db-security-group` ,
     * `db-cluster-snapshot`
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    /**
     * @param subscriptionName The name of the subscription.
     * Constraints: The name must be fewer than 255 characters.
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    public fun build(): software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps,
  ) : CdkObject(cdkObject), CfnEventSubscriptionProps {
    /**
     * A Boolean value;
     *
     * set to `true` to activate the subscription, set to `false` to create the subscription but not
     * active it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A list of event categories for a `SourceType` that you want to subscribe to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-eventcategories)
     */
    override fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
     *
     * Amazon SNS creates the ARN when you create a topic and subscribe to it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-snstopicarn)
     */
    override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If `SourceIds` are provided, `SourceType` must also be provided.
     * * If the source type is an instance, a `DBInstanceIdentifier` must be provided.
     * * If the source type is a security group, a `DBSecurityGroupName` must be provided.
     * * If the source type is a parameter group, a `DBParameterGroupName` must be provided.
     * * If the source type is a snapshot, a `DBSnapshotIdentifier` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourceids)
     */
    override fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

    /**
     * The type of source that is generating the events.
     *
     * For example, if you want to be notified of events generated by an instance, you would set
     * this parameter to `db-instance` . If this value is not specified, all events are returned.
     *
     * Valid values: `db-instance` , `db-cluster` , `db-parameter-group` , `db-security-group` ,
     * `db-cluster-snapshot`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-sourcetype)
     */
    override fun sourceType(): String? = unwrap(this).getSourceType()

    /**
     * The name of the subscription.
     *
     * Constraints: The name must be fewer than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-docdb-eventsubscription.html#cfn-docdb-eventsubscription-subscriptionname)
     */
    override fun subscriptionName(): String? = unwrap(this).getSubscriptionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps):
        CfnEventSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEventSubscriptionProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventSubscriptionProps):
        software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.CfnEventSubscriptionProps
  }
}
