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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a free-form layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FreeFormLayoutConfigurationProperty freeFormLayoutConfigurationProperty =
 * FreeFormLayoutConfigurationProperty.builder()
 * .elements(List.of(FreeFormLayoutElementProperty.builder()
 * .elementId("elementId")
 * .elementType("elementType")
 * .height("height")
 * .width("width")
 * .xAxisLocation("xAxisLocation")
 * .yAxisLocation("yAxisLocation")
 * // the properties below are optional
 * .backgroundStyle(FreeFormLayoutElementBackgroundStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build())
 * .borderStyle(FreeFormLayoutElementBorderStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build())
 * .loadingAnimation(LoadingAnimationProperty.builder()
 * .visibility("visibility")
 * .build())
 * .renderingRules(List.of(SheetElementRenderingRuleProperty.builder()
 * .configurationOverrides(SheetElementConfigurationOverridesProperty.builder()
 * .visibility("visibility")
 * .build())
 * .expression("expression")
 * .build()))
 * .selectedBorderStyle(FreeFormLayoutElementBorderStyleProperty.builder()
 * .color("color")
 * .visibility("visibility")
 * .build())
 * .visibility("visibility")
 * .build()))
 * // the properties below are optional
 * .canvasSizeOptions(FreeFormLayoutCanvasSizeOptionsProperty.builder()
 * .screenCanvasSizeOptions(FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()
 * .optimizedViewPortWidth("optimizedViewPortWidth")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-freeformlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardFreeFormLayoutConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.FreeFormLayoutConfigurationProperty.Builder =
        CfnDashboard.FreeFormLayoutConfigurationProperty.builder()

    private val _elements: MutableList<Any> = mutableListOf()

    /** @param canvasSizeOptions the value to be set. */
    public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /** @param canvasSizeOptions the value to be set. */
    public fun canvasSizeOptions(
        canvasSizeOptions: CfnDashboard.FreeFormLayoutCanvasSizeOptionsProperty
    ) {
        cdkBuilder.canvasSizeOptions(canvasSizeOptions)
    }

    /** @param elements The elements that are included in a free-form layout. */
    public fun elements(vararg elements: Any) {
        _elements.addAll(listOf(*elements))
    }

    /** @param elements The elements that are included in a free-form layout. */
    public fun elements(elements: Collection<Any>) {
        _elements.addAll(elements)
    }

    /** @param elements The elements that are included in a free-form layout. */
    public fun elements(elements: IResolvable) {
        cdkBuilder.elements(elements)
    }

    public fun build(): CfnDashboard.FreeFormLayoutConfigurationProperty {
        if (_elements.isNotEmpty()) cdkBuilder.elements(_elements)
        return cdkBuilder.build()
    }
}
