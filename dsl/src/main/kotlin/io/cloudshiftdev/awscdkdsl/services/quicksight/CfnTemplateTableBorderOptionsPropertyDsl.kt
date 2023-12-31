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
 * The border options for a table border.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableBorderOptionsProperty tableBorderOptionsProperty = TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tableborderoptions.html)
 */
@CdkDslMarker
public class CfnTemplateTableBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableBorderOptionsProperty.Builder =
        CfnTemplate.TableBorderOptionsProperty.builder()

    /** @param color The color of a table border. */
    public fun color(color: String) {
        cdkBuilder.color(color)
    }

    /** @param style The style (none, solid) of a table border. */
    public fun style(style: String) {
        cdkBuilder.style(style)
    }

    /** @param thickness The thickness of a table border. */
    public fun thickness(thickness: Number) {
        cdkBuilder.thickness(thickness)
    }

    public fun build(): CfnTemplate.TableBorderOptionsProperty = cdkBuilder.build()
}
