@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns.subscriptions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.subscriptions.LambdaSubscription
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Use a Lambda function as a subscription target.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function fn;
 * Topic myTopic = new Topic(this, "MyTopic");
 * // Lambda should receive only message matching the following conditions on message body:
 * // color: 'red' or 'orange'
 * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
 * .filterPolicyWithMessageBody(Map.of(
 * "background", FilterOrPolicy.policy(Map.of(
 * "color", FilterOrPolicy.filter(SubscriptionFilter.stringFilter(StringConditions.builder()
 * .allowlist(List.of("red", "orange"))
 * .build()))))))
 * .build());
 * ```
 */
@CdkDslMarker
public class LambdaSubscriptionDsl(
  fn: IFunction,
) {
  private val cdkBuilder: LambdaSubscription.Builder = LambdaSubscription.Builder.create(fn)

  /**
   * Queue to be used as dead letter queue.
   *
   * If not passed no dead letter queue is enabled.
   *
   * Default: - No dead letter queue enabled.
   *
   * @param deadLetterQueue Queue to be used as dead letter queue. 
   */
  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  /**
   * The filter policy.
   *
   * Default: - all messages are delivered
   *
   * @param filterPolicy The filter policy. 
   */
  public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
    cdkBuilder.filterPolicy(filterPolicy)
  }

  /**
   * The filter policy that is applied on the message body.
   *
   * To apply a filter policy to the message attributes, use `filterPolicy`. A maximum of one of
   * `filterPolicyWithMessageBody` and `filterPolicy` may be used.
   *
   * Default: - all messages are delivered
   *
   * @param filterPolicyWithMessageBody The filter policy that is applied on the message body. 
   */
  public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
    cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
  }

  public fun build(): LambdaSubscription = cdkBuilder.build()
}
