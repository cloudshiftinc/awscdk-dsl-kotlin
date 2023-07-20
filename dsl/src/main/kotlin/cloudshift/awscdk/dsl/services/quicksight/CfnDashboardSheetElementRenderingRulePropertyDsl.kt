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
import kotlin.String

@CdkDslMarker
public class CfnDashboardSheetElementRenderingRulePropertyDsl {
    private val cdkBuilder: CfnDashboard.SheetElementRenderingRuleProperty.Builder =
        CfnDashboard.SheetElementRenderingRuleProperty.builder()

    public fun configurationOverrides(configurationOverrides: IResolvable) {
        cdkBuilder.configurationOverrides(configurationOverrides)
    }

    public fun configurationOverrides(configurationOverrides: CfnDashboard.SheetElementConfigurationOverridesProperty) {
        cdkBuilder.configurationOverrides(configurationOverrides)
    }

    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnDashboard.SheetElementRenderingRuleProperty = cdkBuilder.build()
}
