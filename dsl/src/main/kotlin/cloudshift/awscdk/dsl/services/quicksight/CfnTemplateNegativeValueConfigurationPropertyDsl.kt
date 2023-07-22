@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the negative value configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NegativeValueConfigurationProperty negativeValueConfigurationProperty =
 * NegativeValueConfigurationProperty.builder()
 * .displayMode("displayMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-negativevalueconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateNegativeValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.NegativeValueConfigurationProperty.Builder =
      CfnTemplate.NegativeValueConfigurationProperty.builder()

  /**
   * @param displayMode Determines the display mode of the negative value configuration. 
   */
  public fun displayMode(displayMode: String) {
    cdkBuilder.displayMode(displayMode)
  }

  public fun build(): CfnTemplate.NegativeValueConfigurationProperty = cdkBuilder.build()
}
