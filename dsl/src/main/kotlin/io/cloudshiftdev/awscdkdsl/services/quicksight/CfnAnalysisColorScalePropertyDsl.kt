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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * Determines the color scale that is applied to the visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColorScaleProperty colorScaleProperty = ColorScaleProperty.builder()
 * .colorFillType("colorFillType")
 * .colors(List.of(DataColorProperty.builder()
 * .color("color")
 * .dataValue(123)
 * .build()))
 * // the properties below are optional
 * .nullValueColor(DataColorProperty.builder()
 * .color("color")
 * .dataValue(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-colorscale.html)
 */
@CdkDslMarker
public class CfnAnalysisColorScalePropertyDsl {
    private val cdkBuilder: CfnAnalysis.ColorScaleProperty.Builder =
        CfnAnalysis.ColorScaleProperty.builder()

    private val _colors: MutableList<Any> = mutableListOf()

    /** @param colorFillType Determines the color fill type. */
    public fun colorFillType(colorFillType: String) {
        cdkBuilder.colorFillType(colorFillType)
    }

    /** @param colors Determines the list of colors that are applied to the visual. */
    public fun colors(vararg colors: Any) {
        _colors.addAll(listOf(*colors))
    }

    /** @param colors Determines the list of colors that are applied to the visual. */
    public fun colors(colors: Collection<Any>) {
        _colors.addAll(colors)
    }

    /** @param colors Determines the list of colors that are applied to the visual. */
    public fun colors(colors: IResolvable) {
        cdkBuilder.colors(colors)
    }

    /** @param nullValueColor Determines the color that is applied to null values. */
    public fun nullValueColor(nullValueColor: IResolvable) {
        cdkBuilder.nullValueColor(nullValueColor)
    }

    /** @param nullValueColor Determines the color that is applied to null values. */
    public fun nullValueColor(nullValueColor: CfnAnalysis.DataColorProperty) {
        cdkBuilder.nullValueColor(nullValueColor)
    }

    public fun build(): CfnAnalysis.ColorScaleProperty {
        if (_colors.isNotEmpty()) cdkBuilder.colors(_colors)
        return cdkBuilder.build()
    }
}
