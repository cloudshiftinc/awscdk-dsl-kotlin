@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * List of default values defined for a given decimal dataset parameter type.
 *
 * Currently only static values are supported.</p>
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DecimalDatasetParameterDefaultValuesProperty decimalDatasetParameterDefaultValuesProperty =
 * DecimalDatasetParameterDefaultValuesProperty.builder()
 * .staticValues(List.of(123))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-decimaldatasetparameterdefaultvalues.html)
 */
@CdkDslMarker
public class CfnDataSetDecimalDatasetParameterDefaultValuesPropertyDsl {
  private val cdkBuilder: CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.Builder =
      CfnDataSet.DecimalDatasetParameterDefaultValuesProperty.builder()

  private val _staticValues: MutableList<Number> = mutableListOf()

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(vararg staticValues: Number) {
    _staticValues.addAll(listOf(*staticValues))
  }

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(staticValues: Collection<Number>) {
    _staticValues.addAll(staticValues)
  }

  /**
   * @param staticValues the value to be set.
   */
  public fun staticValues(staticValues: IResolvable) {
    cdkBuilder.staticValues(staticValues)
  }

  public fun build(): CfnDataSet.DecimalDatasetParameterDefaultValuesProperty {
    if(_staticValues.isNotEmpty()) cdkBuilder.staticValues(_staticValues)
    return cdkBuilder.build()
  }
}
