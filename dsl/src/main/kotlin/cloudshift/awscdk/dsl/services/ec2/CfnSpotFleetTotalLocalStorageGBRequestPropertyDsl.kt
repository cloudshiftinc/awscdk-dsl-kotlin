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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import kotlin.Number

@CdkDslMarker
public class CfnSpotFleetTotalLocalStorageGBRequestPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.TotalLocalStorageGBRequestProperty.Builder =
        CfnSpotFleet.TotalLocalStorageGBRequestProperty.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnSpotFleet.TotalLocalStorageGBRequestProperty = cdkBuilder.build()
}
