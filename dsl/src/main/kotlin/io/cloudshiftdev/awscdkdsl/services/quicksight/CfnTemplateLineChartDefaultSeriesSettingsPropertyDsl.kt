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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the default presentation of all line series in `LineChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LineChartDefaultSeriesSettingsProperty lineChartDefaultSeriesSettingsProperty =
 * LineChartDefaultSeriesSettingsProperty.builder()
 * .axisBinding("axisBinding")
 * .lineStyleSettings(LineChartLineStyleSettingsProperty.builder()
 * .lineInterpolation("lineInterpolation")
 * .lineStyle("lineStyle")
 * .lineVisibility("lineVisibility")
 * .lineWidth("lineWidth")
 * .build())
 * .markerStyleSettings(LineChartMarkerStyleSettingsProperty.builder()
 * .markerColor("markerColor")
 * .markerShape("markerShape")
 * .markerSize("markerSize")
 * .markerVisibility("markerVisibility")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-linechartdefaultseriessettings.html)
 */
@CdkDslMarker
public class CfnTemplateLineChartDefaultSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnTemplate.LineChartDefaultSeriesSettingsProperty.Builder =
        CfnTemplate.LineChartDefaultSeriesSettingsProperty.builder()

    /** @param axisBinding The axis to which you are binding all line series to. */
    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    /** @param lineStyleSettings Line styles options for all line series in the visual. */
    public fun lineStyleSettings(lineStyleSettings: IResolvable) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    /** @param lineStyleSettings Line styles options for all line series in the visual. */
    public fun lineStyleSettings(
        lineStyleSettings: CfnTemplate.LineChartLineStyleSettingsProperty
    ) {
        cdkBuilder.lineStyleSettings(lineStyleSettings)
    }

    /** @param markerStyleSettings Marker styles options for all line series in the visual. */
    public fun markerStyleSettings(markerStyleSettings: IResolvable) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    /** @param markerStyleSettings Marker styles options for all line series in the visual. */
    public fun markerStyleSettings(
        markerStyleSettings: CfnTemplate.LineChartMarkerStyleSettingsProperty
    ) {
        cdkBuilder.markerStyleSettings(markerStyleSettings)
    }

    public fun build(): CfnTemplate.LineChartDefaultSeriesSettingsProperty = cdkBuilder.build()
}
