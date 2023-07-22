@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `CustomizedLoadMetricSpecification` is a subproperty of
 * [ScalingInstruction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-scalinginstruction.html)
 * that specifies a customized load metric for predictive scaling to use with AWS Auto Scaling ( Auto
 * Scaling Plans ).
 *
 * For predictive scaling to work with a customized load metric specification, AWS Auto Scaling
 * needs access to the `Sum` and `Average` statistics that CloudWatch computes from metric data.
 *
 * When you choose a load metric, make sure that the required `Sum` and `Average` statistics for
 * your metric are available in CloudWatch and that they provide relevant data for predictive scaling.
 * The `Sum` statistic must represent the total load on the resource, and the `Average` statistic must
 * represent the average load per capacity unit of the resource. For example, there is a metric that
 * counts the number of requests processed by your Auto Scaling group. If the `Sum` statistic
 * represents the total request count processed by the group, then the `Average` statistic for the
 * specified metric must represent the average request count processed by each instance of the group.
 *
 * If you publish your own metrics, you can aggregate the data points at a given interval and then
 * publish the aggregated data points to CloudWatch. Before AWS Auto Scaling generates the forecast, it
 * sums up all the metric data points that occurred within each hour to match the granularity period
 * that is used in the forecast (60 minutes).
 *
 * For information about terminology, available metrics, or how to publish new metrics, see [Amazon
 * CloudWatch
 * Concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
 * in the *Amazon CloudWatch User Guide* .
 *
 * After creating your scaling plan, you can use the AWS Auto Scaling console to visualize forecasts
 * for the specified metric. For more information, see [View Scaling Information for a
 * Resource](https://docs.aws.amazon.com/autoscaling/plans/userguide/gs-create-scaling-plan.html#gs-view-resource)
 * in the *AWS Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * CustomizedLoadMetricSpecificationProperty customizedLoadMetricSpecificationProperty =
 * CustomizedLoadMetricSpecificationProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .statistic("statistic")
 * // the properties below are optional
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedloadmetricspecification.html)
 */
@CdkDslMarker
public class CfnScalingPlanCustomizedLoadMetricSpecificationPropertyDsl {
  private val cdkBuilder: CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.Builder =
      CfnScalingPlan.CustomizedLoadMetricSpecificationProperty.builder()

  private val _dimensions: MutableList<Any> = mutableListOf()

  /**
   * @param dimensions The dimensions of the metric.
   * Conditional: If you published your metric with dimensions, you must specify the same dimensions
   * in your customized load metric specification.
   */
  public fun dimensions(vararg dimensions: Any) {
    _dimensions.addAll(listOf(*dimensions))
  }

  /**
   * @param dimensions The dimensions of the metric.
   * Conditional: If you published your metric with dimensions, you must specify the same dimensions
   * in your customized load metric specification.
   */
  public fun dimensions(dimensions: Collection<Any>) {
    _dimensions.addAll(dimensions)
  }

  /**
   * @param dimensions The dimensions of the metric.
   * Conditional: If you published your metric with dimensions, you must specify the same dimensions
   * in your customized load metric specification.
   */
  public fun dimensions(dimensions: IResolvable) {
    cdkBuilder.dimensions(dimensions)
  }

  /**
   * @param metricName The name of the metric. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * @param namespace The namespace of the metric. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param statistic The statistic of the metric. 
   * *Allowed Values* : `Sum`
   */
  public fun statistic(statistic: String) {
    cdkBuilder.statistic(statistic)
  }

  /**
   * @param unit The unit of the metric.
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnScalingPlan.CustomizedLoadMetricSpecificationProperty {
    if(_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
    return cdkBuilder.build()
  }
}
