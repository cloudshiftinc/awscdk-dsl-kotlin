@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field label type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FieldLabelTypeProperty fieldLabelTypeProperty = FieldLabelTypeProperty.builder()
 * .fieldId("fieldId")
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-fieldlabeltype.html)
 */
@CdkDslMarker
public class CfnDashboardFieldLabelTypePropertyDsl {
  private val cdkBuilder: CfnDashboard.FieldLabelTypeProperty.Builder =
      CfnDashboard.FieldLabelTypeProperty.builder()

  /**
   * @param fieldId Indicates the field that is targeted by the field label.
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param visibility The visibility of the field label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.FieldLabelTypeProperty = cdkBuilder.build()
}
