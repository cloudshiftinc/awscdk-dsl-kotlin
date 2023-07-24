@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * Formatting configuration for solid color.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ConditionalFormattingSolidColorProperty conditionalFormattingSolidColorProperty =
 * ConditionalFormattingSolidColorProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .color("color")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-conditionalformattingsolidcolor.html)
 */
@CdkDslMarker
public class CfnAnalysisConditionalFormattingSolidColorPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ConditionalFormattingSolidColorProperty.Builder =
        CfnAnalysis.ConditionalFormattingSolidColorProperty.builder()

    /**
     * @param color Determines the color.
     */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /**
     * @param expression The expression that determines the formatting configuration for solid color.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    public fun build(): CfnAnalysis.ConditionalFormattingSolidColorProperty = cdkBuilder.build()
}
