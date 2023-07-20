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
public class CfnAnalysisFontWeightPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FontWeightProperty.Builder =
        CfnAnalysis.FontWeightProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAnalysis.FontWeightProperty = cdkBuilder.build()
}
