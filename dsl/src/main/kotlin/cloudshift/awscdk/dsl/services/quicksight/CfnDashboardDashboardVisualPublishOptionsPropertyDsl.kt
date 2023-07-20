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
public class CfnDashboardDashboardVisualPublishOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.DashboardVisualPublishOptionsProperty.Builder =
        CfnDashboard.DashboardVisualPublishOptionsProperty.builder()

    public fun exportHiddenFieldsOption(exportHiddenFieldsOption: IResolvable) {
        cdkBuilder.exportHiddenFieldsOption(exportHiddenFieldsOption)
    }

    public fun exportHiddenFieldsOption(exportHiddenFieldsOption: CfnDashboard.ExportHiddenFieldsOptionProperty) {
        cdkBuilder.exportHiddenFieldsOption(exportHiddenFieldsOption)
    }

    public fun build(): CfnDashboard.DashboardVisualPublishOptionsProperty = cdkBuilder.build()
}
