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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The title label options for a visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * VisualTitleLabelOptionsProperty visualTitleLabelOptionsProperty =
 * VisualTitleLabelOptionsProperty.builder()
 * .formatText(ShortFormatTextProperty.builder()
 * .plainText("plainText")
 * .richText("richText")
 * .build())
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-visualtitlelabeloptions.html)
 */
@CdkDslMarker
public class CfnDashboardVisualTitleLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.VisualTitleLabelOptionsProperty.Builder =
        CfnDashboard.VisualTitleLabelOptionsProperty.builder()

    /**
     * @param formatText The short text format of the title label, such as plain text or rich text.
     */
    public fun formatText(formatText: IResolvable) {
        cdkBuilder.formatText(formatText)
    }

    /**
     * @param formatText The short text format of the title label, such as plain text or rich text.
     */
    public fun formatText(formatText: CfnDashboard.ShortFormatTextProperty) {
        cdkBuilder.formatText(formatText)
    }

    /** @param visibility The visibility of the title label. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnDashboard.VisualTitleLabelOptionsProperty = cdkBuilder.build()
}
