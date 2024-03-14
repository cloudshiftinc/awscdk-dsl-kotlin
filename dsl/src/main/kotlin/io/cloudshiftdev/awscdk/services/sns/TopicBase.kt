package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class TopicBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.TopicBase,
) : Resource(cdkObject), ITopic {
  /**
   * Subscribe some endpoint to this topic.
   *
   * @param topicSubscription 
   */
  public override fun addSubscription(topicSubscription: ITopicSubscription): Subscription =
      unwrap(this).addSubscription(topicSubscription.let(ITopicSubscription::unwrap)).let(Subscription::wrap)

  /**
   * Adds a statement to the IAM resource policy associated with this topic.
   *
   * If this topic was created in this stack (`new Topic`), a topic policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the topic is imported (`Topic.import`), then this is a no-op.
   *
   * @param statement 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  /**
   * Adds a statement to the IAM resource policy associated with this topic.
   *
   * If this topic was created in this stack (`new Topic`), a topic policy
   * will be automatically created upon the first call to `addToResourcePolicy`. If
   * the topic is imported (`Topic.import`), then this is a no-op.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * Represents a notification target That allows SNS topic to associate with this rule target.
   *
   * @param _scope 
   */
  public override fun bindAsNotificationRuleTarget(_scope: Construct): NotificationRuleTargetConfig
      =
      unwrap(this).bindAsNotificationRuleTarget(_scope.let(Construct::unwrap)).let(NotificationRuleTargetConfig::wrap)

  /**
   * Enables content-based deduplication for FIFO topics.
   */
  public override fun contentBasedDeduplication(): Boolean =
      unwrap(this).getContentBasedDeduplication()

  /**
   * Whether this topic is an Amazon SNS FIFO queue.
   *
   * If false, this is a standard topic.
   */
  public override fun fifo(): Boolean = unwrap(this).getFifo()

  /**
   * Grant topic publishing permissions to the given identity.
   *
   * @param grantee 
   */
  public override fun grantPublish(grantee: IGrantable): Grant =
      unwrap(this).grantPublish(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this Topic.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Topic.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Topic.
   *
   * @param metricName 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * The number of messages published to your Amazon SNS topics.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesPublished(): Metric =
      unwrap(this).metricNumberOfMessagesPublished().let(Metric::wrap)

  /**
   * The number of messages published to your Amazon SNS topics.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesPublished(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesPublished(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of messages published to your Amazon SNS topics.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0debfcf68c56186b6266a690fc01d2ba469d215e82968a201c09ce0d090a76e3")
  public override fun metricNumberOfMessagesPublished(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfMessagesPublished(MetricOptions(props))

  /**
   * The number of messages successfully delivered from your Amazon SNS topics to subscribing
   * endpoints.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsDelivered(): Metric =
      unwrap(this).metricNumberOfNotificationsDelivered().let(Metric::wrap)

  /**
   * The number of messages successfully delivered from your Amazon SNS topics to subscribing
   * endpoints.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsDelivered(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsDelivered(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of messages successfully delivered from your Amazon SNS topics to subscribing
   * endpoints.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fca8e127970064d20533907387181b36ec7f4b132b5beff585ad498f1ef8ad75")
  public override fun metricNumberOfNotificationsDelivered(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsDelivered(MetricOptions(props))

  /**
   * The number of messages that Amazon SNS failed to deliver.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsFailed(): Metric =
      unwrap(this).metricNumberOfNotificationsFailed().let(Metric::wrap)

  /**
   * The number of messages that Amazon SNS failed to deliver.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsFailed(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsFailed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of messages that Amazon SNS failed to deliver.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7ed1623b02cee0cbde24236106b0c18d58a20040a199e944a7ab04cbe1bbd6b")
  public override fun metricNumberOfNotificationsFailed(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsFailed(MetricOptions(props))

  /**
   * The number of messages that were rejected by subscription filter policies.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsFilteredOut(): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOut().let(Metric::wrap)

  /**
   * The number of messages that were rejected by subscription filter policies.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsFilteredOut(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of messages that were rejected by subscription filter policies.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35bf7baed1f2513c6d518c8e354540bd10d44f78c65887bd91dc386c7f40f118")
  public override
      fun metricNumberOfNotificationsFilteredOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNumberOfNotificationsFilteredOut(MetricOptions(props))

  /**
   * The number of messages that were rejected by subscription filter policies because the messages'
   * attributes are invalid.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsFilteredOutInvalidAttributes(): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutInvalidAttributes().let(Metric::wrap)

  /**
   * The number of messages that were rejected by subscription filter policies because the messages'
   * attributes are invalid.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsFilteredOutInvalidAttributes(props: MetricOptions):
      Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutInvalidAttributes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of messages that were rejected by subscription filter policies because the messages'
   * attributes are invalid.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6cdc48475cf159c4f09f26890c23c3be742d9b8a23ee337cbc982f1eb0925661")
  public override
      fun metricNumberOfNotificationsFilteredOutInvalidAttributes(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsFilteredOutInvalidAttributes(MetricOptions(props))

  /**
   * The number of messages that were rejected by subscription filter policies because the messages
   * have no attributes.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutNoMessageAttributes().let(Metric::wrap)

  /**
   * The number of messages that were rejected by subscription filter policies because the messages
   * have no attributes.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override
      fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutNoMessageAttributes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of messages that were rejected by subscription filter policies because the messages
   * have no attributes.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("408205240c218c91b27bb4cc760b4d5578900fab2917dbd7f4298dcd3819bede")
  public override
      fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsFilteredOutNoMessageAttributes(MetricOptions(props))

  /**
   * Metric for the size of messages published through this topic.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricPublishSize(): Metric =
      unwrap(this).metricPublishSize().let(Metric::wrap)

  /**
   * Metric for the size of messages published through this topic.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricPublishSize(props: MetricOptions): Metric =
      unwrap(this).metricPublishSize(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the size of messages published through this topic.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8d6140038736d11b4192a6bdec41905dbc513ee58f0615aae521c826fa6ea59")
  public override fun metricPublishSize(props: MetricOptions.Builder.() -> Unit): Metric =
      metricPublishSize(MetricOptions(props))

  /**
   * The charges you have accrued since the start of the current calendar month for sending SMS
   * messages.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricSmsMonthToDateSpentUsd(): Metric =
      unwrap(this).metricSMSMonthToDateSpentUSD().let(Metric::wrap)

  /**
   * The charges you have accrued since the start of the current calendar month for sending SMS
   * messages.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricSmsMonthToDateSpentUsd(props: MetricOptions): Metric =
      unwrap(this).metricSMSMonthToDateSpentUSD(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The charges you have accrued since the start of the current calendar month for sending SMS
   * messages.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f5bf7d95644305938cdde06436a98bf86c5b1c175ce1e9a467fda47d6a49663")
  public override fun metricSmsMonthToDateSpentUsd(props: MetricOptions.Builder.() -> Unit): Metric
      = metricSmsMonthToDateSpentUsd(MetricOptions(props))

  /**
   * The rate of successful SMS message deliveries.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSmsSuccessRate(): Metric =
      unwrap(this).metricSMSSuccessRate().let(Metric::wrap)

  /**
   * The rate of successful SMS message deliveries.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricSmsSuccessRate(props: MetricOptions): Metric =
      unwrap(this).metricSMSSuccessRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The rate of successful SMS message deliveries.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3a70fccfc4dc7a51391a3c0d2a1a31549ef7b7227b052d7ecbc0e728be4217e")
  public override fun metricSmsSuccessRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSmsSuccessRate(MetricOptions(props))

  /**
   * The ARN of the topic.
   */
  public override fun topicArn(): String = unwrap(this).getTopicArn()

  /**
   * The name of the topic.
   */
  public override fun topicName(): String = unwrap(this).getTopicName()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.TopicBase,
  ) : TopicBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicBase): TopicBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicBase): software.amazon.awscdk.services.sns.TopicBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.TopicBase
  }
}
