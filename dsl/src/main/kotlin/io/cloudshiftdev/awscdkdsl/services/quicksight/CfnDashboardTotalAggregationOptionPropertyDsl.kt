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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The total aggregation settings map of a field id.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TotalAggregationOptionProperty totalAggregationOptionProperty =
 * TotalAggregationOptionProperty.builder()
 * .fieldId("fieldId")
 * .totalAggregationFunction(TotalAggregationFunctionProperty.builder()
 * .simpleTotalAggregationFunction("simpleTotalAggregationFunction")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-totalaggregationoption.html)
 */
@CdkDslMarker
public class CfnDashboardTotalAggregationOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.TotalAggregationOptionProperty.Builder =
        CfnDashboard.TotalAggregationOptionProperty.builder()

    /** @param fieldId The field id that's associated with the total aggregation option. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /**
     * @param totalAggregationFunction The total aggregation function that you want to set for a
     *   specified field id.
     */
    public fun totalAggregationFunction(totalAggregationFunction: IResolvable) {
        cdkBuilder.totalAggregationFunction(totalAggregationFunction)
    }

    /**
     * @param totalAggregationFunction The total aggregation function that you want to set for a
     *   specified field id.
     */
    public fun totalAggregationFunction(
        totalAggregationFunction: CfnDashboard.TotalAggregationFunctionProperty
    ) {
        cdkBuilder.totalAggregationFunction(totalAggregationFunction)
    }

    public fun build(): CfnDashboard.TotalAggregationOptionProperty = cdkBuilder.build()
}
