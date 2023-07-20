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
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTemplateWhatIfRangeScenarioPropertyDsl {
    private val cdkBuilder: CfnTemplate.WhatIfRangeScenarioProperty.Builder =
        CfnTemplate.WhatIfRangeScenarioProperty.builder()

    public fun endDate(endDate: String) {
        cdkBuilder.endDate(endDate)
    }

    public fun startDate(startDate: String) {
        cdkBuilder.startDate(startDate)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.WhatIfRangeScenarioProperty = cdkBuilder.build()
}
