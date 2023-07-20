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
public class CfnAnalysisFilledMapConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilledMapConditionalFormattingOptionProperty.Builder =
        CfnAnalysis.FilledMapConditionalFormattingOptionProperty.builder()

    public fun shape(shape: IResolvable) {
        cdkBuilder.shape(shape)
    }

    public fun shape(shape: CfnAnalysis.FilledMapShapeConditionalFormattingProperty) {
        cdkBuilder.shape(shape)
    }

    public fun build(): CfnAnalysis.FilledMapConditionalFormattingOptionProperty = cdkBuilder.build()
}
