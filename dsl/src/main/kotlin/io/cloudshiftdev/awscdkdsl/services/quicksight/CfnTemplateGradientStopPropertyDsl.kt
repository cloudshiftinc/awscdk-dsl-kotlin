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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Determines the gradient stop configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * GradientStopProperty gradientStopProperty = GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-gradientstop.html)
 */
@CdkDslMarker
public class CfnTemplateGradientStopPropertyDsl {
    private val cdkBuilder: CfnTemplate.GradientStopProperty.Builder =
        CfnTemplate.GradientStopProperty.builder()

    /** @param color Determines the color. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /** @param dataValue Determines the data value. */
    public fun dataValue(dataValue: Number) {
        cdkBuilder.dataValue(dataValue)
    }

    /** @param gradientOffset Determines gradient offset value. */
    public fun gradientOffset(gradientOffset: Number) {
        cdkBuilder.gradientOffset(gradientOffset)
    }

    public fun build(): CfnTemplate.GradientStopProperty = cdkBuilder.build()
}
