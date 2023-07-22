@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The layout configuration of a section.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionLayoutConfigurationProperty sectionLayoutConfigurationProperty =
 * SectionLayoutConfigurationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sectionlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardSectionLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.SectionLayoutConfigurationProperty.Builder =
      CfnDashboard.SectionLayoutConfigurationProperty.builder()

  /**
   * @param freeFormLayout The free-form layout configuration of a section. 
   */
  public fun freeFormLayout(freeFormLayout: IResolvable) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  /**
   * @param freeFormLayout The free-form layout configuration of a section. 
   */
  public
      fun freeFormLayout(freeFormLayout: CfnDashboard.FreeFormSectionLayoutConfigurationProperty) {
    cdkBuilder.freeFormLayout(freeFormLayout)
  }

  public fun build(): CfnDashboard.SectionLayoutConfigurationProperty = cdkBuilder.build()
}
