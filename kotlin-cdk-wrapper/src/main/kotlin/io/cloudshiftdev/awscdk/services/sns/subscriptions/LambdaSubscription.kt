@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns.subscriptions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.FilterOrPolicy
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.awscdk.services.sns.ITopicSubscription
import io.cloudshiftdev.awscdk.services.sns.SubscriptionFilter
import io.cloudshiftdev.awscdk.services.sns.TopicSubscriptionConfig
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

public open class LambdaSubscription internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription,
) : CdkObject(cdkObject), ITopicSubscription {
  public override fun bind(topic: ITopic): TopicSubscriptionConfig =
      unwrap(this).bind(topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>)

    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>)
  }

  private class BuilderImpl(
    fn: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription.Builder =
        software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription.Builder.create(fn)

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
      cdkBuilder.filterPolicy(filterPolicy.mapValues{SubscriptionFilter.unwrap(it.value)})
    }

    override
        fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
      cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody.mapValues{FilterOrPolicy.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(fn: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaSubscription {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(fn))
      return LambdaSubscription(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription):
        LambdaSubscription = LambdaSubscription(cdkObject)

    internal fun unwrap(wrapped: LambdaSubscription):
        software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription = wrapped.cdkObject
  }
}