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
 * A control to display info icons for filters and parameters.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetControlInfoIconLabelOptionsProperty sheetControlInfoIconLabelOptionsProperty =
 * SheetControlInfoIconLabelOptionsProperty.builder()
 * .infoIconText("infoIconText")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sheetcontrolinfoiconlabeloptions.html)
 */
@CdkDslMarker
public class CfnAnalysisSheetControlInfoIconLabelOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetControlInfoIconLabelOptionsProperty.Builder =
        CfnAnalysis.SheetControlInfoIconLabelOptionsProperty.builder()

    /** @param infoIconText The text content of info icon. */
    public fun infoIconText(infoIconText: String) {
        cdkBuilder.infoIconText(infoIconText)
    }

    /** @param visibility The visibility configuration of info icon label options. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun build(): CfnAnalysis.SheetControlInfoIconLabelOptionsProperty = cdkBuilder.build()
}