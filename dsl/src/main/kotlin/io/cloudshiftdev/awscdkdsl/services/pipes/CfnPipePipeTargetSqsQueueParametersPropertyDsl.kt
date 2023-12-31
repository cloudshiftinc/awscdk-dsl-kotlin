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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using a Amazon SQS stream as a target.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetSqsQueueParametersProperty pipeTargetSqsQueueParametersProperty =
 * PipeTargetSqsQueueParametersProperty.builder()
 * .messageDeduplicationId("messageDeduplicationId")
 * .messageGroupId("messageGroupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetsqsqueueparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetSqsQueueParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetSqsQueueParametersProperty.Builder =
        CfnPipe.PipeTargetSqsQueueParametersProperty.builder()

    /**
     * @param messageDeduplicationId This parameter applies only to FIFO (first-in-first-out)
     *   queues. The token used for deduplication of sent messages.
     */
    public fun messageDeduplicationId(messageDeduplicationId: String) {
        cdkBuilder.messageDeduplicationId(messageDeduplicationId)
    }

    /** @param messageGroupId The FIFO message group ID to use as the target. */
    public fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
    }

    public fun build(): CfnPipe.PipeTargetSqsQueueParametersProperty = cdkBuilder.build()
}
