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
public class CfnAnalysisSheetControlLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetControlLayoutConfigurationProperty.Builder =
        CfnAnalysis.SheetControlLayoutConfigurationProperty.builder()

    public fun gridLayout(gridLayout: IResolvable) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun gridLayout(gridLayout: CfnAnalysis.GridLayoutConfigurationProperty) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun build(): CfnAnalysis.SheetControlLayoutConfigurationProperty = cdkBuilder.build()
}
