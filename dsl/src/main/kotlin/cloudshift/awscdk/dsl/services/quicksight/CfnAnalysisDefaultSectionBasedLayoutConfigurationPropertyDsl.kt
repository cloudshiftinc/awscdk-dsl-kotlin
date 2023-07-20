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
public class CfnAnalysisDefaultSectionBasedLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DefaultSectionBasedLayoutConfigurationProperty.Builder =
        CfnAnalysis.DefaultSectionBasedLayoutConfigurationProperty.builder()

    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun canvasSizeOptions(canvasSizeOptions: CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    public fun build(): CfnAnalysis.DefaultSectionBasedLayoutConfigurationProperty =
        cdkBuilder.build()
}
