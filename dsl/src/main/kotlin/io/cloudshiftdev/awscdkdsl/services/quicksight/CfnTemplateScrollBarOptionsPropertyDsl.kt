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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The visual display options for a data zoom scroll bar.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ScrollBarOptionsProperty scrollBarOptionsProperty = ScrollBarOptionsProperty.builder()
 * .visibility("visibility")
 * .visibleRange(VisibleRangeOptionsProperty.builder()
 * .percentRange(PercentVisibleRangeProperty.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-scrollbaroptions.html)
 */
@CdkDslMarker
public class CfnTemplateScrollBarOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ScrollBarOptionsProperty.Builder =
        CfnTemplate.ScrollBarOptionsProperty.builder()

    /** @param visibility The visibility of the data zoom scroll bar. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    /** @param visibleRange The visibility range for the data zoom scroll bar. */
    public fun visibleRange(visibleRange: IResolvable) {
        cdkBuilder.visibleRange(visibleRange)
    }

    /** @param visibleRange The visibility range for the data zoom scroll bar. */
    public fun visibleRange(visibleRange: CfnTemplate.VisibleRangeOptionsProperty) {
        cdkBuilder.visibleRange(visibleRange)
    }

    public fun build(): CfnTemplate.ScrollBarOptionsProperty = cdkBuilder.build()
}
