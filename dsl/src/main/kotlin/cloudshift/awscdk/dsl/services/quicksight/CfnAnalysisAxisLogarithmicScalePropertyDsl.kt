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
import kotlin.Number

@CdkDslMarker
public class CfnAnalysisAxisLogarithmicScalePropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisLogarithmicScaleProperty.Builder =
        CfnAnalysis.AxisLogarithmicScaleProperty.builder()

    public fun base(base: Number) {
        cdkBuilder.base(base)
    }

    public fun build(): CfnAnalysis.AxisLogarithmicScaleProperty = cdkBuilder.build()
}
