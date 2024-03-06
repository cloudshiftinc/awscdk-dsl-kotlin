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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * An aggregation function that aggregates the total values of a measure.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TotalAggregationFunctionProperty totalAggregationFunctionProperty =
 * TotalAggregationFunctionProperty.builder()
 * .simpleTotalAggregationFunction("simpleTotalAggregationFunction")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-totalaggregationfunction.html)
 */
@CdkDslMarker
public class CfnTemplateTotalAggregationFunctionPropertyDsl {
    private val cdkBuilder: CfnTemplate.TotalAggregationFunctionProperty.Builder =
        CfnTemplate.TotalAggregationFunctionProperty.builder()

    /** @param simpleTotalAggregationFunction A built in aggregation function for total values. */
    public fun simpleTotalAggregationFunction(simpleTotalAggregationFunction: String) {
        cdkBuilder.simpleTotalAggregationFunction(simpleTotalAggregationFunction)
    }

    public fun build(): CfnTemplate.TotalAggregationFunctionProperty = cdkBuilder.build()
}
