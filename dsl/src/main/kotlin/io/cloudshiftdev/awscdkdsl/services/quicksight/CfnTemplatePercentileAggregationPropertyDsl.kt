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
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-percentileaggregation.html)
 */
@CdkDslMarker
public class CfnTemplatePercentileAggregationPropertyDsl {
    private val cdkBuilder: CfnTemplate.PercentileAggregationProperty.Builder =
        CfnTemplate.PercentileAggregationProperty.builder()

    /**
     * @param percentileValue The percentile value. This value can be any numeric constant 0–100. A
     *   percentile value of 50 computes the median value of the measure.
     */
    public fun percentileValue(percentileValue: Number) {
        cdkBuilder.percentileValue(percentileValue)
    }

    public fun build(): CfnTemplate.PercentileAggregationProperty = cdkBuilder.build()
}
