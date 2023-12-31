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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Conditional formatting options of a `FilledMapVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilledMapConditionalFormattingOptionProperty filledMapConditionalFormattingOptionProperty =
 * FilledMapConditionalFormattingOptionProperty.builder()
 * .shape(FilledMapShapeConditionalFormattingProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .format(ShapeConditionalFormatProperty.builder()
 * .backgroundColor(ConditionalFormattingColorProperty.builder()
 * .gradient(ConditionalFormattingGradientColorProperty.builder()
 * .color(GradientColorProperty.builder()
 * .stops(List.of(GradientStopProperty.builder()
 * .gradientOffset(123)
 * // the properties below are optional
 * .color("color")
 * .dataValue(123)
 * .build()))
 * .build())
 * .expression("expression")
 * .build())
 * .solid(ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build())
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-filledmapconditionalformattingoption.html)
 */
@CdkDslMarker
public class CfnTemplateFilledMapConditionalFormattingOptionPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilledMapConditionalFormattingOptionProperty.Builder =
        CfnTemplate.FilledMapConditionalFormattingOptionProperty.builder()

    /** @param shape The conditional formatting that determines the shape of the filled map. */
    public fun shape(shape: IResolvable) {
        cdkBuilder.shape(shape)
    }

    /** @param shape The conditional formatting that determines the shape of the filled map. */
    public fun shape(shape: CfnTemplate.FilledMapShapeConditionalFormattingProperty) {
        cdkBuilder.shape(shape)
    }

    public fun build(): CfnTemplate.FilledMapConditionalFormattingOptionProperty =
        cdkBuilder.build()
}
