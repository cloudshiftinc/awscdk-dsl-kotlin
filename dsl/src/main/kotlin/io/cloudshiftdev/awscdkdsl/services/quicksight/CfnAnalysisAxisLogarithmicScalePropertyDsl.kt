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
 * The logarithmic axis scale setup.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AxisLogarithmicScaleProperty axisLogarithmicScaleProperty =
 * AxisLogarithmicScaleProperty.builder()
 * .base(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-axislogarithmicscale.html)
 */
@CdkDslMarker
public class CfnAnalysisAxisLogarithmicScalePropertyDsl {
    private val cdkBuilder: CfnAnalysis.AxisLogarithmicScaleProperty.Builder =
        CfnAnalysis.AxisLogarithmicScaleProperty.builder()

    /** @param base The base setup of a logarithmic axis scale. */
    public fun base(base: Number) {
        cdkBuilder.base(base)
    }

    public fun build(): CfnAnalysis.AxisLogarithmicScaleProperty = cdkBuilder.build()
}
