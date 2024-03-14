package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Subscription internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.Subscription,
) : Resource(cdkObject) {
  public open fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
    }

    public fun endpoint(endpoint: String) {
    }

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
    }

    public
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
    }

    public fun protocol(protocol: SubscriptionProtocol) {
    }

    public fun rawMessageDelivery(rawMessageDelivery: Boolean) {
    }

    public fun region(region: String) {
    }

    public fun subscriptionRoleArn(subscriptionRoleArn: String) {
    }

    public fun topic(topic: ITopic) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.Subscription.Builder =
        software.amazon.awscdk.services.sns.Subscription.Builder.create(scope, id)

    public override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    public override fun endpoint(endpoint: String) {
      cdkBuilder.endpoint(endpoint)
    }

    public override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues { SubscriptionFilter.unwrap(it.value)})
    }

    public override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues {
          FilterOrPolicy.unwrap(it.value)})
    }

    public override fun protocol(protocol: SubscriptionProtocol) {
      cdkBuilder.protocol(protocol.let(SubscriptionProtocol::unwrap))
    }

    public override fun rawMessageDelivery(rawMessageDelivery: Boolean) {
      cdkBuilder.rawMessageDelivery(rawMessageDelivery)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun subscriptionRoleArn(subscriptionRoleArn: String) {
      cdkBuilder.subscriptionRoleArn(subscriptionRoleArn)
    }

    public override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sns.Subscription = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Subscription {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Subscription(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Subscription): Subscription =
        Subscription(cdkObject)

    internal fun unwrap(wrapped: Subscription): software.amazon.awscdk.services.sns.Subscription =
        wrapped.cdkObject
  }
}
