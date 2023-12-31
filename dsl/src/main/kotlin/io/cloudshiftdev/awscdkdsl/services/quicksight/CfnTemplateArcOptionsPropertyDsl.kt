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
 * The options that determine the arc thickness of a `GaugeChartVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ArcOptionsProperty arcOptionsProperty = ArcOptionsProperty.builder()
 * .arcThickness("arcThickness")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-arcoptions.html)
 */
@CdkDslMarker
public class CfnTemplateArcOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.ArcOptionsProperty.Builder =
        CfnTemplate.ArcOptionsProperty.builder()

    /** @param arcThickness The arc thickness of a `GaugeChartVisual` . */
    public fun arcThickness(arcThickness: String) {
        cdkBuilder.arcThickness(arcThickness)
    }

    public fun build(): CfnTemplate.ArcOptionsProperty = cdkBuilder.build()
}
