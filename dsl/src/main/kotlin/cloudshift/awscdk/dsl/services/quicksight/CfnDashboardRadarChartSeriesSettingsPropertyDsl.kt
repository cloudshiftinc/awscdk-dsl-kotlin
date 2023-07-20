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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardRadarChartSeriesSettingsPropertyDsl {
    private val cdkBuilder: CfnDashboard.RadarChartSeriesSettingsProperty.Builder =
        CfnDashboard.RadarChartSeriesSettingsProperty.builder()

    public fun areaStyleSettings(areaStyleSettings: IResolvable) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    public fun areaStyleSettings(areaStyleSettings: CfnDashboard.RadarChartAreaStyleSettingsProperty) {
        cdkBuilder.areaStyleSettings(areaStyleSettings)
    }

    public fun build(): CfnDashboard.RadarChartSeriesSettingsProperty = cdkBuilder.build()
}
