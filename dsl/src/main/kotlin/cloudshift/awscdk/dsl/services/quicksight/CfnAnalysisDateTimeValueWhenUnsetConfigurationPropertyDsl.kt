@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The configuration that defines the default value of a `DateTime` parameter when a value has not
 * been set.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimeValueWhenUnsetConfigurationProperty dateTimeValueWhenUnsetConfigurationProperty =
 * DateTimeValueWhenUnsetConfigurationProperty.builder()
 * .customValue("customValue")
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-datetimevaluewhenunsetconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisDateTimeValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DateTimeValueWhenUnsetConfigurationProperty.Builder =
      CfnAnalysis.DateTimeValueWhenUnsetConfigurationProperty.builder()

  /**
   * @param customValue A custom value that's used when the value of a parameter isn't set.
   */
  public fun customValue(customValue: String) {
    cdkBuilder.customValue(customValue)
  }

  /**
   * @param valueWhenUnsetOption The built-in options for default values. The value can be one of
   * the following:.
   * * `RECOMMENDED` : The recommended value.
   * * `NULL` : The `NULL` value.
   */
  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnAnalysis.DateTimeValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
