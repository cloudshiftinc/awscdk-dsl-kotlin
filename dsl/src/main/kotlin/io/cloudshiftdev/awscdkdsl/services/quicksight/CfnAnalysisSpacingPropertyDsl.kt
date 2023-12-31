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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration of spacing (often a margin or padding).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SpacingProperty spacingProperty = SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-spacing.html)
 */
@CdkDslMarker
public class CfnAnalysisSpacingPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SpacingProperty.Builder =
        CfnAnalysis.SpacingProperty.builder()

    /** @param bottom Define the bottom spacing. */
    public fun bottom(bottom: String) {
        cdkBuilder.bottom(bottom)
    }

    /** @param left Define the left spacing. */
    public fun left(left: String) {
        cdkBuilder.left(left)
    }

    /** @param right Define the right spacing. */
    public fun right(right: String) {
        cdkBuilder.right(right)
    }

    /** @param top Define the top spacing. */
    public fun top(top: String) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnAnalysis.SpacingProperty = cdkBuilder.build()
}
