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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The forecast scenario of a forecast in the line chart.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ForecastScenarioProperty forecastScenarioProperty = ForecastScenarioProperty.builder()
 * .whatIfPointScenario(WhatIfPointScenarioProperty.builder()
 * .date("date")
 * .value(123)
 * .build())
 * .whatIfRangeScenario(WhatIfRangeScenarioProperty.builder()
 * .endDate("endDate")
 * .startDate("startDate")
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-forecastscenario.html)
 */
@CdkDslMarker
public class CfnDashboardForecastScenarioPropertyDsl {
    private val cdkBuilder: CfnDashboard.ForecastScenarioProperty.Builder =
        CfnDashboard.ForecastScenarioProperty.builder()

    /** @param whatIfPointScenario The what-if analysis forecast setup with the target date. */
    public fun whatIfPointScenario(whatIfPointScenario: IResolvable) {
        cdkBuilder.whatIfPointScenario(whatIfPointScenario)
    }

    /** @param whatIfPointScenario The what-if analysis forecast setup with the target date. */
    public fun whatIfPointScenario(whatIfPointScenario: CfnDashboard.WhatIfPointScenarioProperty) {
        cdkBuilder.whatIfPointScenario(whatIfPointScenario)
    }

    /** @param whatIfRangeScenario The what-if analysis forecast setup with the date range. */
    public fun whatIfRangeScenario(whatIfRangeScenario: IResolvable) {
        cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
    }

    /** @param whatIfRangeScenario The what-if analysis forecast setup with the date range. */
    public fun whatIfRangeScenario(whatIfRangeScenario: CfnDashboard.WhatIfRangeScenarioProperty) {
        cdkBuilder.whatIfRangeScenario(whatIfRangeScenario)
    }

    public fun build(): CfnDashboard.ForecastScenarioProperty = cdkBuilder.build()
}
