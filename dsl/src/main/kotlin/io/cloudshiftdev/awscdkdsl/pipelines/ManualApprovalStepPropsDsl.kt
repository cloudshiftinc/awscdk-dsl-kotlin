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

package io.cloudshiftdev.awscdkdsl.pipelines

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.ManualApprovalStepProps

/**
 * Construction properties for a `ManualApprovalStep`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.pipelines.*;
 * ManualApprovalStepProps manualApprovalStepProps = ManualApprovalStepProps.builder()
 * .comment("comment")
 * .build();
 * ```
 */
@CdkDslMarker
public class ManualApprovalStepPropsDsl {
    private val cdkBuilder: ManualApprovalStepProps.Builder = ManualApprovalStepProps.builder()

    /** @param comment The comment to display with this manual approval. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): ManualApprovalStepProps = cdkBuilder.build()
}
