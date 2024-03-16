@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

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
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnEventSubscriptionProps cfnEventSubscriptionProps = CfnEventSubscriptionProps.builder()
 * .snsTopicArn("snsTopicArn")
 * // the properties below are optional
 * .enabled(false)
 * .eventCategories(List.of("eventCategories"))
 * .sourceIds(List.of("sourceIds"))
 * .sourceType("sourceType")
 * .subscriptionName("subscriptionName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html)
 */
public interface CfnEventSubscriptionProps {
  /**
   * Specifies whether to activate the subscription.
   *
   * If the event notification subscription isn't activated, the subscription is created but not
   * active.
   *
   * Default: - true
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * A list of event categories for a particular source type ( `SourceType` ) that you want to
   * subscribe to.
   *
   * You can see a list of the categories for a given source type in the "Amazon RDS event
   * categories and event messages" section of the [*Amazon RDS User
   * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
   * [*Amazon Aurora User
   * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html) .
   * You can also see this list by using the `DescribeEventCategories` operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
   */
  public fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
   *
   * SNS automatically creates the ARN when you create a topic and subscribe to it.
   *
   *
   * RDS doesn't support FIFO (first in, first out) topics. For more information, see [Message
   * ordering and deduplication (FIFO
   * topics)](https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html) in the *Amazon Simple
   * Notification Service Developer Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
   */
  public fun snsTopicArn(): String

  /**
   * The list of identifiers of the event sources for which events are returned.
   *
   * If not specified, then all sources are included in the response. An identifier must begin with
   * a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a hyphen or
   * contain two consecutive hyphens.
   *
   * Constraints:
   *
   * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
   * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
   * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
   * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be supplied.
   * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
   * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
   * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
   * supplied.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
   */
  public fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

  /**
   * The type of source that is generating the events.
   *
   * For example, if you want to be notified of events generated by a DB instance, set this
   * parameter to `db-instance` . If this value isn't specified, all events are returned.
   *
   * Valid values: `db-instance` | `db-cluster` | `db-parameter-group` | `db-security-group` |
   * `db-snapshot` | `db-cluster-snapshot`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype)
   */
  public fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * The name of the subscription.
   *
   * Constraints: The name must be less than 255 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-subscriptionname)
   */
  public fun subscriptionName(): String? = unwrap(this).getSubscriptionName()

  /**
   * An optional array of key-value pairs to apply to this subscription.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEventSubscriptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Specifies whether to activate the subscription.
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to activate the subscription.
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to.
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     */
    public fun eventCategories(eventCategories: List<String>)

    /**
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to.
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     */
    public fun eventCategories(vararg eventCategories: String)

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. 
     * SNS automatically creates the ARN when you create a topic and subscribe to it.
     *
     *
     * RDS doesn't support FIFO (first in, first out) topics. For more information, see [Message
     * ordering and deduplication (FIFO
     * topics)](https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html) in the *Amazon Simple
     * Notification Service Developer Guide* .
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     */
    public fun sourceIds(sourceIds: List<String>)

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     */
    public fun sourceIds(vararg sourceIds: String)

    /**
     * @param sourceType The type of source that is generating the events.
     * For example, if you want to be notified of events generated by a DB instance, set this
     * parameter to `db-instance` . If this value isn't specified, all events are returned.
     *
     * Valid values: `db-instance` | `db-cluster` | `db-parameter-group` | `db-security-group` |
     * `db-snapshot` | `db-cluster-snapshot`
     */
    public fun sourceType(sourceType: String)

    /**
     * @param subscriptionName The name of the subscription.
     * Constraints: The name must be less than 255 characters.
     */
    public fun subscriptionName(subscriptionName: String)

    /**
     * @param tags An optional array of key-value pairs to apply to this subscription.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An optional array of key-value pairs to apply to this subscription.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnEventSubscriptionProps.Builder =
        software.amazon.awscdk.services.rds.CfnEventSubscriptionProps.builder()

    /**
     * @param enabled Specifies whether to activate the subscription.
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to activate the subscription.
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to.
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     */
    override fun eventCategories(eventCategories: List<String>) {
      cdkBuilder.eventCategories(eventCategories)
    }

    /**
     * @param eventCategories A list of event categories for a particular source type ( `SourceType`
     * ) that you want to subscribe to.
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     */
    override fun eventCategories(vararg eventCategories: String): Unit =
        eventCategories(eventCategories.toList())

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. 
     * SNS automatically creates the ARN when you create a topic and subscribe to it.
     *
     *
     * RDS doesn't support FIFO (first in, first out) topics. For more information, see [Message
     * ordering and deduplication (FIFO
     * topics)](https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html) in the *Amazon Simple
     * Notification Service Developer Guide* .
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     */
    override fun sourceIds(sourceIds: List<String>) {
      cdkBuilder.sourceIds(sourceIds)
    }

    /**
     * @param sourceIds The list of identifiers of the event sources for which events are returned.
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     */
    override fun sourceIds(vararg sourceIds: String): Unit = sourceIds(sourceIds.toList())

    /**
     * @param sourceType The type of source that is generating the events.
     * For example, if you want to be notified of events generated by a DB instance, set this
     * parameter to `db-instance` . If this value isn't specified, all events are returned.
     *
     * Valid values: `db-instance` | `db-cluster` | `db-parameter-group` | `db-security-group` |
     * `db-snapshot` | `db-cluster-snapshot`
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

    /**
     * @param subscriptionName The name of the subscription.
     * Constraints: The name must be less than 255 characters.
     */
    override fun subscriptionName(subscriptionName: String) {
      cdkBuilder.subscriptionName(subscriptionName)
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this subscription.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An optional array of key-value pairs to apply to this subscription.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnEventSubscriptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnEventSubscriptionProps,
  ) : CdkObject(cdkObject), CfnEventSubscriptionProps {
    /**
     * Specifies whether to activate the subscription.
     *
     * If the event notification subscription isn't activated, the subscription is created but not
     * active.
     *
     * Default: - true
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A list of event categories for a particular source type ( `SourceType` ) that you want to
     * subscribe to.
     *
     * You can see a list of the categories for a given source type in the "Amazon RDS event
     * categories and event messages" section of the [*Amazon RDS User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.Messages.html) or the
     * [*Amazon Aurora User
     * Guide*](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_Events.Messages.html)
     * . You can also see this list by using the `DescribeEventCategories` operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories)
     */
    override fun eventCategories(): List<String> = unwrap(this).getEventCategories() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event notification.
     *
     * SNS automatically creates the ARN when you create a topic and subscribe to it.
     *
     *
     * RDS doesn't support FIFO (first in, first out) topics. For more information, see [Message
     * ordering and deduplication (FIFO
     * topics)](https://docs.aws.amazon.com/sns/latest/dg/sns-fifo-topics.html) in the *Amazon Simple
     * Notification Service Developer Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn)
     */
    override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()

    /**
     * The list of identifiers of the event sources for which events are returned.
     *
     * If not specified, then all sources are included in the response. An identifier must begin
     * with a letter and must contain only ASCII letters, digits, and hyphens. It can't end with a
     * hyphen or contain two consecutive hyphens.
     *
     * Constraints:
     *
     * * If a `SourceIds` value is supplied, `SourceType` must also be provided.
     * * If the source type is a DB instance, a `DBInstanceIdentifier` value must be supplied.
     * * If the source type is a DB cluster, a `DBClusterIdentifier` value must be supplied.
     * * If the source type is a DB parameter group, a `DBParameterGroupName` value must be
     * supplied.
     * * If the source type is a DB security group, a `DBSecurityGroupName` value must be supplied.
     * * If the source type is a DB snapshot, a `DBSnapshotIdentifier` value must be supplied.
     * * If the source type is a DB cluster snapshot, a `DBClusterSnapshotIdentifier` value must be
     * supplied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids)
     */
    override fun sourceIds(): List<String> = unwrap(this).getSourceIds() ?: emptyList()

    /**
     * The type of source that is generating the events.
     *
     * For example, if you want to be notified of events generated by a DB instance, set this
     * parameter to `db-instance` . If this value isn't specified, all events are returned.
     *
     * Valid values: `db-instance` | `db-cluster` | `db-parameter-group` | `db-security-group` |
     * `db-snapshot` | `db-cluster-snapshot`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype)
     */
    override fun sourceType(): String? = unwrap(this).getSourceType()

    /**
     * The name of the subscription.
     *
     * Constraints: The name must be less than 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-subscriptionname)
     */
    override fun subscriptionName(): String? = unwrap(this).getSubscriptionName()

    /**
     * An optional array of key-value pairs to apply to this subscription.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventSubscriptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnEventSubscriptionProps):
        CfnEventSubscriptionProps = CdkObjectWrappers.wrap(cdkObject) as CfnEventSubscriptionProps

    internal fun unwrap(wrapped: CfnEventSubscriptionProps):
        software.amazon.awscdk.services.rds.CfnEventSubscriptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnEventSubscriptionProps
  }
}
