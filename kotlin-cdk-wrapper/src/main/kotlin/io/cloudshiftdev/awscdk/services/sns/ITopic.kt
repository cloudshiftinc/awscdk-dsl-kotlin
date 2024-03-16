@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an SNS topic.
 */
public interface ITopic : IResource, INotificationRuleTarget {
  /**
   * Subscribe some endpoint to this topic.
   *
   * @param subscription 
   */
  public fun addSubscription(subscription: ITopicSubscription): Subscription

  /**
   * Adds a statement to the IAM resource policy associated with this topic.
   *
   * If this topic was created in this stack (`new Topic`), a topic policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the topic is imported (`Topic.import`), then this is a no-op.
   *
   * @param statement 
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Adds a statement to the IAM resource policy associated with this topic.
   *
   * If this topic was created in this stack (`new Topic`), a topic policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the topic is imported (`Topic.import`), then this is a no-op.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  /**
   * Enables content-based deduplication for FIFO topics.
   */
  public fun contentBasedDeduplication(): Boolean

  /**
   * Whether this topic is an Amazon SNS FIFO queue.
   *
   * If false, this is a standard topic.
   */
  public fun fifo(): Boolean

  /**
   * Grant topic publishing permissions to the given identity.
   *
   * @param identity 
   */
  public fun grantPublish(identity: IGrantable): Grant

  /**
   * Return the given named metric for this Topic.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this Topic.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Topic.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages published to your Amazon SNS topics.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesPublished(): Metric

  /**
   * The number of messages published to your Amazon SNS topics.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesPublished(props: MetricOptions): Metric

  /**
   * The number of messages published to your Amazon SNS topics.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0debfcf68c56186b6266a690fc01d2ba469d215e82968a201c09ce0d090a76e3")
  public fun metricNumberOfMessagesPublished(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages successfully delivered from your Amazon SNS topics to subscribing
   * endpoints.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsDelivered(): Metric

  /**
   * The number of messages successfully delivered from your Amazon SNS topics to subscribing
   * endpoints.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsDelivered(props: MetricOptions): Metric

  /**
   * The number of messages successfully delivered from your Amazon SNS topics to subscribing
   * endpoints.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fca8e127970064d20533907387181b36ec7f4b132b5beff585ad498f1ef8ad75")
  public fun metricNumberOfNotificationsDelivered(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages that Amazon SNS failed to deliver.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFailed(): Metric

  /**
   * The number of messages that Amazon SNS failed to deliver.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFailed(props: MetricOptions): Metric

  /**
   * The number of messages that Amazon SNS failed to deliver.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7ed1623b02cee0cbde24236106b0c18d58a20040a199e944a7ab04cbe1bbd6b")
  public fun metricNumberOfNotificationsFailed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages that were rejected by subscription filter policies.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFilteredOut(): Metric

  /**
   * The number of messages that were rejected by subscription filter policies.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFilteredOut(props: MetricOptions): Metric

  /**
   * The number of messages that were rejected by subscription filter policies.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35bf7baed1f2513c6d518c8e354540bd10d44f78c65887bd91dc386c7f40f118")
  public fun metricNumberOfNotificationsFilteredOut(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages that were rejected by subscription filter policies because the messages'
   * attributes are invalid.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFilteredOutInvalidAttributes(): Metric

  /**
   * The number of messages that were rejected by subscription filter policies because the messages'
   * attributes are invalid.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFilteredOutInvalidAttributes(props: MetricOptions): Metric

  /**
   * The number of messages that were rejected by subscription filter policies because the messages'
   * attributes are invalid.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6cdc48475cf159c4f09f26890c23c3be742d9b8a23ee337cbc982f1eb0925661")
  public
      fun metricNumberOfNotificationsFilteredOutInvalidAttributes(props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * The number of messages that were rejected by subscription filter policies because the messages
   * have no attributes.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(): Metric

  /**
   * The number of messages that were rejected by subscription filter policies because the messages
   * have no attributes.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(props: MetricOptions): Metric

  /**
   * The number of messages that were rejected by subscription filter policies because the messages
   * have no attributes.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("408205240c218c91b27bb4cc760b4d5578900fab2917dbd7f4298dcd3819bede")
  public
      fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * Metric for the size of messages published through this topic.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricPublishSize(): Metric

  /**
   * Metric for the size of messages published through this topic.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricPublishSize(props: MetricOptions): Metric

  /**
   * Metric for the size of messages published through this topic.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8d6140038736d11b4192a6bdec41905dbc513ee58f0615aae521c826fa6ea59")
  public fun metricPublishSize(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The charges you have accrued since the start of the current calendar month for sending SMS
   * messages.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricSmsMonthToDateSpentUsd(): Metric

  /**
   * The charges you have accrued since the start of the current calendar month for sending SMS
   * messages.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricSmsMonthToDateSpentUsd(props: MetricOptions): Metric

  /**
   * The charges you have accrued since the start of the current calendar month for sending SMS
   * messages.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f5bf7d95644305938cdde06436a98bf86c5b1c175ce1e9a467fda47d6a49663")
  public fun metricSmsMonthToDateSpentUsd(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The rate of successful SMS message deliveries.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricSmsSuccessRate(): Metric

  /**
   * The rate of successful SMS message deliveries.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricSmsSuccessRate(props: MetricOptions): Metric

  /**
   * The rate of successful SMS message deliveries.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3a70fccfc4dc7a51391a3c0d2a1a31549ef7b7227b052d7ecbc0e728be4217e")
  public fun metricSmsSuccessRate(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The ARN of the topic.
   */
  public fun topicArn(): String

  /**
   * The name of the topic.
   */
  public fun topicName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.ITopic): ITopic =
        CdkObjectWrappers.wrap(cdkObject) as ITopic

    internal fun unwrap(wrapped: ITopic): software.amazon.awscdk.services.sns.ITopic = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sns.ITopic
  }
}
