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
import kotlin.Number

@CdkDslMarker
public class CfnDashboardSmallMultiplesOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.SmallMultiplesOptionsProperty.Builder =
        CfnDashboard.SmallMultiplesOptionsProperty.builder()

    public fun maxVisibleColumns(maxVisibleColumns: Number) {
        cdkBuilder.maxVisibleColumns(maxVisibleColumns)
    }

    public fun maxVisibleRows(maxVisibleRows: Number) {
        cdkBuilder.maxVisibleRows(maxVisibleRows)
    }

    public fun panelConfiguration(panelConfiguration: IResolvable) {
        cdkBuilder.panelConfiguration(panelConfiguration)
    }

    public fun panelConfiguration(panelConfiguration: CfnDashboard.PanelConfigurationProperty) {
        cdkBuilder.panelConfiguration(panelConfiguration)
    }

    public fun build(): CfnDashboard.SmallMultiplesOptionsProperty = cdkBuilder.build()
}
