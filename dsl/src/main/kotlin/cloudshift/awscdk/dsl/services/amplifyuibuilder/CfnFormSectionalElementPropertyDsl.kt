@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `SectionalElement` property specifies the configuration information for a visual helper
 * element for a form.
 *
 * A sectional element can be a header, a text block, or a divider. These elements are static and
 * not associated with any data.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * SectionalElementProperty sectionalElementProperty = SectionalElementProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .excluded(false)
 * .level(123)
 * .orientation("orientation")
 * .position(FieldPositionProperty.builder()
 * .below("below")
 * .fixed("fixed")
 * .rightOf("rightOf")
 * .build())
 * .text("text")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-sectionalelement.html)
 */
@CdkDslMarker
public class CfnFormSectionalElementPropertyDsl {
  private val cdkBuilder: CfnForm.SectionalElementProperty.Builder =
      CfnForm.SectionalElementProperty.builder()

  /**
   * @param excluded Excludes a sectional element that was generated by default for a specified data
   * model.
   */
  public fun excluded(excluded: Boolean) {
    cdkBuilder.excluded(excluded)
  }

  /**
   * @param excluded Excludes a sectional element that was generated by default for a specified data
   * model.
   */
  public fun excluded(excluded: IResolvable) {
    cdkBuilder.excluded(excluded)
  }

  /**
   * @param level Specifies the size of the font for a `Heading` sectional element.
   * Valid values are `1 | 2 | 3 | 4 | 5 | 6` .
   */
  public fun level(level: Number) {
    cdkBuilder.level(level)
  }

  /**
   * @param orientation Specifies the orientation for a `Divider` sectional element.
   * Valid values are `horizontal` or `vertical` .
   */
  public fun orientation(orientation: String) {
    cdkBuilder.orientation(orientation)
  }

  /**
   * @param position Specifies the position of the text in a field for a `Text` sectional element.
   */
  public fun position(position: IResolvable) {
    cdkBuilder.position(position)
  }

  /**
   * @param position Specifies the position of the text in a field for a `Text` sectional element.
   */
  public fun position(position: CfnForm.FieldPositionProperty) {
    cdkBuilder.position(position)
  }

  /**
   * @param text The text for a `Text` sectional element.
   */
  public fun text(text: String) {
    cdkBuilder.text(text)
  }

  /**
   * @param type The type of sectional element. 
   * Valid values are `Heading` , `Text` , and `Divider` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnForm.SectionalElementProperty = cdkBuilder.build()
}
