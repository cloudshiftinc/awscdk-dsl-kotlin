@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The metric comparison computation configuration.
 *
 * Example:
 *
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-metriccomparisoncomputation.html)
 */
@CdkDslMarker
public class CfnTemplateMetricComparisonComputationPropertyDsl {
  private val cdkBuilder: CfnTemplate.MetricComparisonComputationProperty.Builder =
      CfnTemplate.MetricComparisonComputationProperty.builder()

  /**
   * @param computationId The ID for a computation. 
   */
  public fun computationId(computationId: String) {
    cdkBuilder.computationId(computationId)
  }

  /**
   * @param fromValue The field that is used in a metric comparison from value setup. 
   */
  public fun fromValue(fromValue: IResolvable) {
    cdkBuilder.fromValue(fromValue)
  }

  /**
   * @param fromValue The field that is used in a metric comparison from value setup. 
   */
  public fun fromValue(fromValue: CfnTemplate.MeasureFieldProperty) {
    cdkBuilder.fromValue(fromValue)
  }

  /**
   * @param name The name of a computation.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param targetValue The field that is used in a metric comparison to value setup. 
   */
  public fun targetValue(targetValue: IResolvable) {
    cdkBuilder.targetValue(targetValue)
  }

  /**
   * @param targetValue The field that is used in a metric comparison to value setup. 
   */
  public fun targetValue(targetValue: CfnTemplate.MeasureFieldProperty) {
    cdkBuilder.targetValue(targetValue)
  }

  /**
   * @param time The time field that is used in a computation. 
   */
  public fun time(time: IResolvable) {
    cdkBuilder.time(time)
  }

  /**
   * @param time The time field that is used in a computation. 
   */
  public fun time(time: CfnTemplate.DimensionFieldProperty) {
    cdkBuilder.time(time)
  }

  public fun build(): CfnTemplate.MetricComparisonComputationProperty = cdkBuilder.build()
}
