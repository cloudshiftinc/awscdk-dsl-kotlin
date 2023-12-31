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

package io.cloudshiftdev.awscdkdsl.services.budgets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.budgets.CfnBudget

/**
 * Determine the budget amount for an auto-adjusting budget.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.budgets.*;
 * AutoAdjustDataProperty autoAdjustDataProperty = AutoAdjustDataProperty.builder()
 * .autoAdjustType("autoAdjustType")
 * // the properties below are optional
 * .historicalOptions(HistoricalOptionsProperty.builder()
 * .budgetAdjustmentPeriod(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-autoadjustdata.html)
 */
@CdkDslMarker
public class CfnBudgetAutoAdjustDataPropertyDsl {
    private val cdkBuilder: CfnBudget.AutoAdjustDataProperty.Builder =
        CfnBudget.AutoAdjustDataProperty.builder()

    /**
     * @param autoAdjustType The string that defines whether your budget auto-adjusts based on
     *   historical or forecasted data.
     */
    public fun autoAdjustType(autoAdjustType: String) {
        cdkBuilder.autoAdjustType(autoAdjustType)
    }

    /**
     * @param historicalOptions The parameters that define or describe the historical data that your
     *   auto-adjusting budget is based on.
     */
    public fun historicalOptions(historicalOptions: IResolvable) {
        cdkBuilder.historicalOptions(historicalOptions)
    }

    /**
     * @param historicalOptions The parameters that define or describe the historical data that your
     *   auto-adjusting budget is based on.
     */
    public fun historicalOptions(historicalOptions: CfnBudget.HistoricalOptionsProperty) {
        cdkBuilder.historicalOptions(historicalOptions)
    }

    public fun build(): CfnBudget.AutoAdjustDataProperty = cdkBuilder.build()
}
