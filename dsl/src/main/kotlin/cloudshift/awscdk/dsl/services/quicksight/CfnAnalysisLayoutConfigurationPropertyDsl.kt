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
public class CfnAnalysisLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LayoutConfigurationProperty.Builder =
        CfnAnalysis.LayoutConfigurationProperty.builder()

    public fun freeFormLayout(freeFormLayout: IResolvable) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun freeFormLayout(freeFormLayout: CfnAnalysis.FreeFormLayoutConfigurationProperty) {
        cdkBuilder.freeFormLayout(freeFormLayout)
    }

    public fun gridLayout(gridLayout: IResolvable) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun gridLayout(gridLayout: CfnAnalysis.GridLayoutConfigurationProperty) {
        cdkBuilder.gridLayout(gridLayout)
    }

    public fun sectionBasedLayout(sectionBasedLayout: IResolvable) {
        cdkBuilder.sectionBasedLayout(sectionBasedLayout)
    }

    public fun sectionBasedLayout(sectionBasedLayout: CfnAnalysis.SectionBasedLayoutConfigurationProperty) {
        cdkBuilder.sectionBasedLayout(sectionBasedLayout)
    }

    public fun build(): CfnAnalysis.LayoutConfigurationProperty = cdkBuilder.build()
}
