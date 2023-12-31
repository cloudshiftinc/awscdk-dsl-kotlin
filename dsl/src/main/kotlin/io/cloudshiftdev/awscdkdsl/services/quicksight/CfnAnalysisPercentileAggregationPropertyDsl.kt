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
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * An aggregation based on the percentile of values in a dimension or measure.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PercentileAggregationProperty percentileAggregationProperty =
 * PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-percentileaggregation.html)
 */
@CdkDslMarker
public class CfnAnalysisPercentileAggregationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PercentileAggregationProperty.Builder =
        CfnAnalysis.PercentileAggregationProperty.builder()

    /**
     * @param percentileValue The percentile value. This value can be any numeric constant 0–100. A
     *   percentile value of 50 computes the median value of the measure.
     */
    public fun percentileValue(percentileValue: Number) {
        cdkBuilder.percentileValue(percentileValue)
    }

    public fun build(): CfnAnalysis.PercentileAggregationProperty = cdkBuilder.build()
}
