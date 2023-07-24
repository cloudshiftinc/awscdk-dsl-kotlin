@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * The data field series item configuration of a line chart.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataFieldSeriesItemProperty dataFieldSeriesItemProperty = DataFieldSeriesItemProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datafieldseriesitem.html)
 */
@CdkDslMarker
public class CfnDashboardDataFieldSeriesItemPropertyDsl {
    private val cdkBuilder: CfnDashboard.DataFieldSeriesItemProperty.Builder =
        CfnDashboard.DataFieldSeriesItemProperty.builder()

    /**
     * @param axisBinding The axis that you are binding the field to.
     */
    public fun axisBinding(axisBinding: String) {
        cdkBuilder.axisBinding(axisBinding)
    }

    /**
     * @param fieldId The field ID of the field that you are setting the axis binding to.
     */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /**
     * @param fieldValue The field value of the field that you are setting the axis binding to.
     */
    public fun fieldValue(fieldValue: String) {
        cdkBuilder.fieldValue(fieldValue)
    }

    /**
     * @param settings The options that determine the presentation of line series associated to the
     * field.
     */
    public fun settings(settings: IResolvable) {
        cdkBuilder.settings(settings)
    }

    /**
     * @param settings The options that determine the presentation of line series associated to the
     * field.
     */
    public fun settings(settings: CfnDashboard.LineChartSeriesSettingsProperty) {
        cdkBuilder.settings(settings)
    }

    public fun build(): CfnDashboard.DataFieldSeriesItemProperty = cdkBuilder.build()
}
