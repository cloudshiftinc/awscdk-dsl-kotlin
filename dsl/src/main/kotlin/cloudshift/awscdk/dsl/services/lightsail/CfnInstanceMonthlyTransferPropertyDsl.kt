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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lightsail.CfnInstance
import kotlin.String

@CdkDslMarker
public class CfnInstanceMonthlyTransferPropertyDsl {
    private val cdkBuilder: CfnInstance.MonthlyTransferProperty.Builder =
        CfnInstance.MonthlyTransferProperty.builder()

    public fun gbPerMonthAllocated(gbPerMonthAllocated: String) {
        cdkBuilder.gbPerMonthAllocated(gbPerMonthAllocated)
    }

    public fun build(): CfnInstance.MonthlyTransferProperty = cdkBuilder.build()
}
