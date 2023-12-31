@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The options that determine the arc thickness of a `GaugeChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ArcOptionsProperty arcOptionsProperty = ArcOptionsProperty.builder()
 * .arcThickness("arcThickness")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-arcoptions.html)
 */
@CdkDslMarker
public class CfnDashboardArcOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.ArcOptionsProperty.Builder =
        CfnDashboard.ArcOptionsProperty.builder()

    /** @param arcThickness The arc thickness of a `GaugeChartVisual` . */
    public fun arcThickness(arcThickness: String) {
        cdkBuilder.arcThickness(arcThickness)
    }

    public fun build(): CfnDashboard.ArcOptionsProperty = cdkBuilder.build()
}
