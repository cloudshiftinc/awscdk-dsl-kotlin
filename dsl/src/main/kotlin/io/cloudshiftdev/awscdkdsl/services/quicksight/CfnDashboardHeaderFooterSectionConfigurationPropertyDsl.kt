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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of a header or footer section.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * HeaderFooterSectionConfigurationProperty headerFooterSectionConfigurationProperty =
 * HeaderFooterSectionConfigurationProperty.builder()
 * .layout(SectionLayoutConfigurationProperty.builder()
 * .freeFormLayout(FreeFormSectionLayoutConfigurationProperty.builder()
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
 * .build())
 * .build())
 * .sectionId("sectionId")
 * // the properties below are optional
 * .style(SectionStyleProperty.builder()
 * .height("height")
 * .padding(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-headerfootersectionconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardHeaderFooterSectionConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.HeaderFooterSectionConfigurationProperty.Builder =
        CfnDashboard.HeaderFooterSectionConfigurationProperty.builder()

    /** @param layout The layout configuration of the header or footer section. */
    public fun layout(layout: IResolvable) {
        cdkBuilder.layout(layout)
    }

    /** @param layout The layout configuration of the header or footer section. */
    public fun layout(layout: CfnDashboard.SectionLayoutConfigurationProperty) {
        cdkBuilder.layout(layout)
    }

    /** @param sectionId The unique identifier of the header or footer section. */
    public fun sectionId(sectionId: String) {
        cdkBuilder.sectionId(sectionId)
    }

    /** @param style The style options of a header or footer section. */
    public fun style(style: IResolvable) {
        cdkBuilder.style(style)
    }

    /** @param style The style options of a header or footer section. */
    public fun style(style: CfnDashboard.SectionStyleProperty) {
        cdkBuilder.style(style)
    }

    public fun build(): CfnDashboard.HeaderFooterSectionConfigurationProperty = cdkBuilder.build()
}
