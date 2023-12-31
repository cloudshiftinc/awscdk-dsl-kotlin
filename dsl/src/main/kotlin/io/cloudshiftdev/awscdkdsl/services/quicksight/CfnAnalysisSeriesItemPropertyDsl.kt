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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The series item configuration of a line chart.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SeriesItemProperty seriesItemProperty = SeriesItemProperty.builder()
 * .dataFieldSeriesItem(DataFieldSeriesItemProperty.builder()
 * .axisBinding("axisBinding")
 * .fieldId("fieldId")
 * // the properties below are optional
 * .fieldValue("fieldValue")
 * .settings(LineChartSeriesSettingsProperty.builder()
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
 * .build())
 * .build())
 * .fieldSeriesItem(FieldSeriesItemProperty.builder()
 * .axisBinding("axisBinding")
 * .fieldId("fieldId")
 * // the properties below are optional
 * .settings(LineChartSeriesSettingsProperty.builder()
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
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-seriesitem.html)
 */
@CdkDslMarker
public class CfnAnalysisSeriesItemPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SeriesItemProperty.Builder =
        CfnAnalysis.SeriesItemProperty.builder()

    /** @param dataFieldSeriesItem The data field series item configuration of a line chart. */
    public fun dataFieldSeriesItem(dataFieldSeriesItem: IResolvable) {
        cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
    }

    /** @param dataFieldSeriesItem The data field series item configuration of a line chart. */
    public fun dataFieldSeriesItem(dataFieldSeriesItem: CfnAnalysis.DataFieldSeriesItemProperty) {
        cdkBuilder.dataFieldSeriesItem(dataFieldSeriesItem)
    }

    /** @param fieldSeriesItem The field series item configuration of a line chart. */
    public fun fieldSeriesItem(fieldSeriesItem: IResolvable) {
        cdkBuilder.fieldSeriesItem(fieldSeriesItem)
    }

    /** @param fieldSeriesItem The field series item configuration of a line chart. */
    public fun fieldSeriesItem(fieldSeriesItem: CfnAnalysis.FieldSeriesItemProperty) {
        cdkBuilder.fieldSeriesItem(fieldSeriesItem)
    }

    public fun build(): CfnAnalysis.SeriesItemProperty = cdkBuilder.build()
}
