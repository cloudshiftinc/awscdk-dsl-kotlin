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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The paginated report options for a table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TablePaginatedReportOptionsProperty tablePaginatedReportOptionsProperty =
 * TablePaginatedReportOptionsProperty.builder()
 * .overflowColumnHeaderVisibility("overflowColumnHeaderVisibility")
 * .verticalOverflowVisibility("verticalOverflowVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tablepaginatedreportoptions.html)
 */
@CdkDslMarker
public class CfnTemplateTablePaginatedReportOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TablePaginatedReportOptionsProperty.Builder =
        CfnTemplate.TablePaginatedReportOptionsProperty.builder()

    /**
     * @param overflowColumnHeaderVisibility The visibility of repeating header rows on each page.
     */
    public fun overflowColumnHeaderVisibility(overflowColumnHeaderVisibility: String) {
        cdkBuilder.overflowColumnHeaderVisibility(overflowColumnHeaderVisibility)
    }

    /** @param verticalOverflowVisibility The visibility of printing table overflow across pages. */
    public fun verticalOverflowVisibility(verticalOverflowVisibility: String) {
        cdkBuilder.verticalOverflowVisibility(verticalOverflowVisibility)
    }

    public fun build(): CfnTemplate.TablePaginatedReportOptionsProperty = cdkBuilder.build()
}
