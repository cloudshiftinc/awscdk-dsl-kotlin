@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The sort configuration for a field in a field well.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FieldSortProperty fieldSortProperty = FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-fieldsort.html)
 */
@CdkDslMarker
public class CfnTemplateFieldSortPropertyDsl {
  private val cdkBuilder: CfnTemplate.FieldSortProperty.Builder =
      CfnTemplate.FieldSortProperty.builder()

  /**
   * @param direction The sort direction. Choose one of the following options:. 
   * * `ASC` : Ascending
   * * `DESC` : Descending
   */
  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param fieldId The sort configuration target field. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnTemplate.FieldSortProperty = cdkBuilder.build()
}
