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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options for an axis with a numeric field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * Object dataDriven;
 * NumericAxisOptionsProperty numericAxisOptionsProperty = NumericAxisOptionsProperty.builder()
 * .range(AxisDisplayRangeProperty.builder()
 * .dataDriven(dataDriven)
 * .minMax(AxisDisplayMinMaxRangeProperty.builder()
 * .maximum(123)
 * .minimum(123)
 * .build())
 * .build())
 * .scale(AxisScaleProperty.builder()
 * .linear(AxisLinearScaleProperty.builder()
 * .stepCount(123)
 * .stepSize(123)
 * .build())
 * .logarithmic(AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-numericaxisoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisNumericAxisOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.NumericAxisOptionsProperty.Builder =
        CfnAnalysis.NumericAxisOptionsProperty.builder()

    /** @param range The range setup of a numeric axis. */
    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    /** @param range The range setup of a numeric axis. */
    public fun range(range: CfnAnalysis.AxisDisplayRangeProperty) {
        cdkBuilder.range(range)
    }

    /** @param scale The scale setup of a numeric axis. */
    public fun scale(scale: IResolvable) {
        cdkBuilder.scale(scale)
    }

    /** @param scale The scale setup of a numeric axis. */
    public fun scale(scale: CfnAnalysis.AxisScaleProperty) {
        cdkBuilder.scale(scale)
    }

    public fun build(): CfnAnalysis.NumericAxisOptionsProperty = cdkBuilder.build()
}
