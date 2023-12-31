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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Marker styles options for a line series in `LineChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LineChartMarkerStyleSettingsProperty lineChartMarkerStyleSettingsProperty =
 * LineChartMarkerStyleSettingsProperty.builder()
 * .markerColor("markerColor")
 * .markerShape("markerShape")
 * .markerSize("markerSize")
 * .markerVisibility("markerVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-linechartmarkerstylesettings.html)
 */
@CdkDslMarker
public class CfnAnalysisLineChartMarkerStyleSettingsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LineChartMarkerStyleSettingsProperty.Builder =
        CfnAnalysis.LineChartMarkerStyleSettingsProperty.builder()

    /** @param markerColor Color of marker in the series. */
    public fun markerColor(markerColor: String) {
        cdkBuilder.markerColor(markerColor)
    }

    /**
     * @param markerShape Shape option for markers in the series.
     * * `CIRCLE` : Show marker as a circle.
     * * `TRIANGLE` : Show marker as a triangle.
     * * `SQUARE` : Show marker as a square.
     * * `DIAMOND` : Show marker as a diamond.
     * * `ROUNDED_SQUARE` : Show marker as a rounded square.
     */
    public fun markerShape(markerShape: String) {
        cdkBuilder.markerShape(markerShape)
    }

    /** @param markerSize Size of marker in the series. */
    public fun markerSize(markerSize: String) {
        cdkBuilder.markerSize(markerSize)
    }

    /**
     * @param markerVisibility Configuration option that determines whether to show the markers in
     *   the series.
     */
    public fun markerVisibility(markerVisibility: String) {
        cdkBuilder.markerVisibility(markerVisibility)
    }

    public fun build(): CfnAnalysis.LineChartMarkerStyleSettingsProperty = cdkBuilder.build()
}
