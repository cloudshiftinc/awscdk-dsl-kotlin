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
import kotlin.String
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisStreamProps

/**
 * Customize the Kinesis Stream Event Target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.events.targets.*;
 * RuleTargetInput ruleTargetInput;
 * KinesisStreamProps kinesisStreamProps = KinesisStreamProps.builder()
 * .message(ruleTargetInput)
 * .partitionKeyPath("partitionKeyPath")
 * .build();
 * ```
 */
@CdkDslMarker
public class KinesisStreamPropsDsl {
    private val cdkBuilder: KinesisStreamProps.Builder = KinesisStreamProps.builder()

    /**
     * @param message The message to send to the stream. Must be a valid JSON text passed to the
     *   target stream.
     */
    public fun message(message: RuleTargetInput) {
        cdkBuilder.message(message)
    }

    /** @param partitionKeyPath Partition Key Path for records sent to this stream. */
    public fun partitionKeyPath(partitionKeyPath: String) {
        cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    public fun build(): KinesisStreamProps = cdkBuilder.build()
}
