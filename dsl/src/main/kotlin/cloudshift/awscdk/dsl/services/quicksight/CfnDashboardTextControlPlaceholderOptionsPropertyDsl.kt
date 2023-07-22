@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of the placeholder options in a text control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TextControlPlaceholderOptionsProperty textControlPlaceholderOptionsProperty =
 * TextControlPlaceholderOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-textcontrolplaceholderoptions.html)
 */
@CdkDslMarker
public class CfnDashboardTextControlPlaceholderOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.TextControlPlaceholderOptionsProperty.Builder =
      CfnDashboard.TextControlPlaceholderOptionsProperty.builder()

  /**
   * @param visibility The visibility configuration of the placeholder options in a text control.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.TextControlPlaceholderOptionsProperty = cdkBuilder.build()
}
