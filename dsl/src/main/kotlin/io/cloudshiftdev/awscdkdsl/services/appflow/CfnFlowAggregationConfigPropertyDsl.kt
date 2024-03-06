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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The aggregation settings that you can use to customize the output format of your flow data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * AggregationConfigProperty aggregationConfigProperty = AggregationConfigProperty.builder()
 * .aggregationType("aggregationType")
 * .targetFileSize(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-aggregationconfig.html)
 */
@CdkDslMarker
public class CfnFlowAggregationConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.AggregationConfigProperty.Builder =
        CfnFlow.AggregationConfigProperty.builder()

    /**
     * @param aggregationType Specifies whether Amazon AppFlow aggregates the flow records into a
     *   single file, or leave them unaggregated.
     */
    public fun aggregationType(aggregationType: String) {
        cdkBuilder.aggregationType(aggregationType)
    }

    /**
     * @param targetFileSize The desired file size, in MB, for each output file that Amazon AppFlow
     *   writes to the flow destination. For each file, Amazon AppFlow attempts to achieve the size
     *   that you specify. The actual file sizes might differ from this target based on the number
     *   and size of the records that each file contains.
     */
    public fun targetFileSize(targetFileSize: Number) {
        cdkBuilder.targetFileSize(targetFileSize)
    }

    public fun build(): CfnFlow.AggregationConfigProperty = cdkBuilder.build()
}
