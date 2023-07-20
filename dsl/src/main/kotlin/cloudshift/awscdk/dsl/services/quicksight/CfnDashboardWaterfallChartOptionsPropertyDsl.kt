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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

@CdkDslMarker
public class CfnDashboardWaterfallChartOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.WaterfallChartOptionsProperty.Builder =
        CfnDashboard.WaterfallChartOptionsProperty.builder()

    public fun totalBarLabel(totalBarLabel: String) {
        cdkBuilder.totalBarLabel(totalBarLabel)
    }

    public fun build(): CfnDashboard.WaterfallChartOptionsProperty = cdkBuilder.build()
}
