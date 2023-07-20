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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisCustomNarrativeOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CustomNarrativeOptionsProperty.Builder =
        CfnAnalysis.CustomNarrativeOptionsProperty.builder()

    public fun narrative(narrative: String) {
        cdkBuilder.narrative(narrative)
    }

    public fun build(): CfnAnalysis.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
