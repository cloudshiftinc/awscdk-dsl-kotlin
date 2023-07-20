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

package cloudshift.awscdk.dsl.services.budgets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.budgets.CfnBudget
import kotlin.Number

@CdkDslMarker
public class CfnBudgetHistoricalOptionsPropertyDsl {
    private val cdkBuilder: CfnBudget.HistoricalOptionsProperty.Builder =
        CfnBudget.HistoricalOptionsProperty.builder()

    public fun budgetAdjustmentPeriod(budgetAdjustmentPeriod: Number) {
        cdkBuilder.budgetAdjustmentPeriod(budgetAdjustmentPeriod)
    }

    public fun build(): CfnBudget.HistoricalOptionsProperty = cdkBuilder.build()
}
