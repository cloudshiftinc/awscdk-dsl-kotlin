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
public class CfnAnalysisFilterScopeConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterScopeConfigurationProperty.Builder =
        CfnAnalysis.FilterScopeConfigurationProperty.builder()

    public fun selectedSheets(selectedSheets: IResolvable) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    public fun selectedSheets(selectedSheets: CfnAnalysis.SelectedSheetsFilterScopeConfigurationProperty) {
        cdkBuilder.selectedSheets(selectedSheets)
    }

    public fun build(): CfnAnalysis.FilterScopeConfigurationProperty = cdkBuilder.build()
}
