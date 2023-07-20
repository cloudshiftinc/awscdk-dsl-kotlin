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
import kotlin.Number

@CdkDslMarker
public class CfnDashboardBinWidthOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.BinWidthOptionsProperty.Builder =
        CfnDashboard.BinWidthOptionsProperty.builder()

    public fun binCountLimit(binCountLimit: Number) {
        cdkBuilder.binCountLimit(binCountLimit)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDashboard.BinWidthOptionsProperty = cdkBuilder.build()
}
