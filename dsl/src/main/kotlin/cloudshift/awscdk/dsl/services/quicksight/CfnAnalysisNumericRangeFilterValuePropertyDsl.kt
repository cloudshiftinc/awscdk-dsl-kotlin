@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The value input pf the numeric range filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * NumericRangeFilterValueProperty numericRangeFilterValueProperty =
 * NumericRangeFilterValueProperty.builder()
 * .parameter("parameter")
 * .staticValue(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-numericrangefiltervalue.html)
 */
@CdkDslMarker
public class CfnAnalysisNumericRangeFilterValuePropertyDsl {
  private val cdkBuilder: CfnAnalysis.NumericRangeFilterValueProperty.Builder =
      CfnAnalysis.NumericRangeFilterValueProperty.builder()

  /**
   * @param parameter The parameter that is used in the numeric range.
   */
  public fun parameter(parameter: String) {
    cdkBuilder.parameter(parameter)
  }

  /**
   * @param staticValue The static value of the numeric range filter.
   */
  public fun staticValue(staticValue: Number) {
    cdkBuilder.staticValue(staticValue)
  }

  public fun build(): CfnAnalysis.NumericRangeFilterValueProperty = cdkBuilder.build()
}
