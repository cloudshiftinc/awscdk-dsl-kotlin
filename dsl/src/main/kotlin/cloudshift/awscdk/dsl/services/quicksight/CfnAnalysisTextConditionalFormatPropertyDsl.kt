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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTextConditionalFormatPropertyDsl {
    private val cdkBuilder: CfnAnalysis.TextConditionalFormatProperty.Builder =
        CfnAnalysis.TextConditionalFormatProperty.builder()

    public fun backgroundColor(backgroundColor: IResolvable) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun backgroundColor(backgroundColor: CfnAnalysis.ConditionalFormattingColorProperty) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun icon(icon: IResolvable) {
        cdkBuilder.icon(icon)
    }

    public fun icon(icon: CfnAnalysis.ConditionalFormattingIconProperty) {
        cdkBuilder.icon(icon)
    }

    public fun textColor(textColor: IResolvable) {
        cdkBuilder.textColor(textColor)
    }

    public fun textColor(textColor: CfnAnalysis.ConditionalFormattingColorProperty) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnAnalysis.TextConditionalFormatProperty = cdkBuilder.build()
}
