@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.events.targets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.targets.TargetBaseProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * The generic properties for an RuleTarget.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * import software.amazon.awscdk.services.sqs.*;
 * Queue queue;
 * TargetBaseProps targetBaseProps = TargetBaseProps.builder()
 * .deadLetterQueue(queue)
 * .maxEventAge(Duration.minutes(30))
 * .retryAttempts(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class TargetBasePropsDsl {
    private val cdkBuilder: TargetBaseProps.Builder = TargetBaseProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *   The events not successfully delivered are automatically retried for a specified period of
     *   time, depending on the retry policy of the target. If an event is not delivered before all
     *   retry attempts are exhausted, it will be sent to the dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum value of 60. Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum value of 0. Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): TargetBaseProps = cdkBuilder.build()
}
