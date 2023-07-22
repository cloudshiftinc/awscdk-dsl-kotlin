@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The conditional formatting of a table row.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableRowConditionalFormattingProperty tableRowConditionalFormattingProperty =
 * TableRowConditionalFormattingProperty.builder()
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
 * .textColor(ConditionalFormattingColorProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tablerowconditionalformatting.html)
 */
@CdkDslMarker
public class CfnTemplateTableRowConditionalFormattingPropertyDsl {
  private val cdkBuilder: CfnTemplate.TableRowConditionalFormattingProperty.Builder =
      CfnTemplate.TableRowConditionalFormattingProperty.builder()

  /**
   * @param backgroundColor The conditional formatting color (solid, gradient) of the background for
   * a table row.
   */
  public fun backgroundColor(backgroundColor: IResolvable) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param backgroundColor The conditional formatting color (solid, gradient) of the background for
   * a table row.
   */
  public fun backgroundColor(backgroundColor: CfnTemplate.ConditionalFormattingColorProperty) {
    cdkBuilder.backgroundColor(backgroundColor)
  }

  /**
   * @param textColor The conditional formatting color (solid, gradient) of the text for a table
   * row.
   */
  public fun textColor(textColor: IResolvable) {
    cdkBuilder.textColor(textColor)
  }

  /**
   * @param textColor The conditional formatting color (solid, gradient) of the text for a table
   * row.
   */
  public fun textColor(textColor: CfnTemplate.ConditionalFormattingColorProperty) {
    cdkBuilder.textColor(textColor)
  }

  public fun build(): CfnTemplate.TableRowConditionalFormattingProperty = cdkBuilder.build()
}
