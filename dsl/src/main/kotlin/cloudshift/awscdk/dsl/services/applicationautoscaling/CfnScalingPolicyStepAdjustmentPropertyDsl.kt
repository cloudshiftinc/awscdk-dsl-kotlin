@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

/**
 * `StepAdjustment` specifies a step adjustment for the `StepAdjustments` property of the
 * [AWS::ApplicationAutoScaling::ScalingPolicy
 * StepScalingPolicyConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html)
 * property type.
 *
 * For the following examples, suppose that you have an alarm with a breach threshold of 50:
 *
 * * To trigger a step adjustment when the metric is greater than or equal to 50 and less than 60,
 * specify a lower bound of 0 and an upper bound of 10.
 * * To trigger a step adjustment when the metric is greater than 40 and less than or equal to 50,
 * specify a lower bound of -10 and an upper bound of 0.
 *
 * For more information, see [Step
 * adjustments](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#as-scaling-steps)
 * in the *Application Auto Scaling User Guide* .
 *
 * You can find a sample template snippet in the
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#aws-resource-applicationautoscaling-scalingpolicy--examples)
 * section of the `AWS::ApplicationAutoScaling::ScalingPolicy` documentation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * StepAdjustmentProperty stepAdjustmentProperty = StepAdjustmentProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .metricIntervalLowerBound(123)
 * .metricIntervalUpperBound(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html)
 */
@CdkDslMarker
public class CfnScalingPolicyStepAdjustmentPropertyDsl {
  private val cdkBuilder: CfnScalingPolicy.StepAdjustmentProperty.Builder =
      CfnScalingPolicy.StepAdjustmentProperty.builder()

  /**
   * @param metricIntervalLowerBound The lower bound for the difference between the alarm threshold
   * and the CloudWatch metric.
   * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
   * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive
   * (the metric must be greater than the threshold plus the lower bound). A null value indicates
   * negative infinity.
   *
   * You must specify at least one upper or lower bound.
   */
  public fun metricIntervalLowerBound(metricIntervalLowerBound: Number) {
    cdkBuilder.metricIntervalLowerBound(metricIntervalLowerBound)
  }

  /**
   * @param metricIntervalUpperBound The upper bound for the difference between the alarm threshold
   * and the CloudWatch metric.
   * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
   * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric must
   * be less than or equal to the threshold plus the upper bound). A null value indicates positive
   * infinity.
   *
   * You must specify at least one upper or lower bound.
   */
  public fun metricIntervalUpperBound(metricIntervalUpperBound: Number) {
    cdkBuilder.metricIntervalUpperBound(metricIntervalUpperBound)
  }

  /**
   * @param scalingAdjustment The amount by which to scale. 
   * The adjustment is based on the value that you specified in the `AdjustmentType` property
   * (either an absolute number or a percentage). A positive value adds to the current capacity and a
   * negative number subtracts from the current capacity.
   */
  public fun scalingAdjustment(scalingAdjustment: Number) {
    cdkBuilder.scalingAdjustment(scalingAdjustment)
  }

  public fun build(): CfnScalingPolicy.StepAdjustmentProperty = cdkBuilder.build()
}
