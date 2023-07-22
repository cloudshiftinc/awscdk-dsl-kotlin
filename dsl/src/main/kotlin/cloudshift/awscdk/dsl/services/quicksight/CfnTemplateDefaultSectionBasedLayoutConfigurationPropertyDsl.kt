@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the default settings for a section-based layout configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DefaultSectionBasedLayoutConfigurationProperty defaultSectionBasedLayoutConfigurationProperty =
 * DefaultSectionBasedLayoutConfigurationProperty.builder()
 * .canvasSizeOptions(SectionBasedLayoutCanvasSizeOptionsProperty.builder()
 * .paperCanvasSizeOptions(SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()
 * .paperMargin(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .paperOrientation("paperOrientation")
 * .paperSize("paperSize")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-defaultsectionbasedlayoutconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateDefaultSectionBasedLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty.Builder =
      CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty.builder()

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a section-based layout. 
   */
  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a section-based layout. 
   */
  public
      fun canvasSizeOptions(canvasSizeOptions: CfnTemplate.SectionBasedLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun build(): CfnTemplate.DefaultSectionBasedLayoutConfigurationProperty =
      cdkBuilder.build()
}
