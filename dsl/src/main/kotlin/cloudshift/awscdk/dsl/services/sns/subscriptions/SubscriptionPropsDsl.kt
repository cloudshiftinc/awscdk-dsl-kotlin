@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sns.subscriptions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.SubscriptionFilter
import software.amazon.awscdk.services.sns.subscriptions.SubscriptionProps
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class SubscriptionPropsDsl {
    private val cdkBuilder: SubscriptionProps.Builder = SubscriptionProps.builder()

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun filterPolicy(filterPolicy: Map<String, SubscriptionFilter>) {
        cdkBuilder.filterPolicy(filterPolicy)
    }

    public fun filterPolicyWithMessageBody(filterPolicyWithMessageBody: Map<String, FilterOrPolicy>) {
        cdkBuilder.filterPolicyWithMessageBody(filterPolicyWithMessageBody)
    }

    public fun build(): SubscriptionProps = cdkBuilder.build()
}
