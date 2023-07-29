@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * `StepAdjustment` specifies a step adjustment for the `StepAdjustments` property of the
 * [AWS::AutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html)
 * resource.
 *
 * For the following examples, suppose that you have an alarm with a breach threshold of 50:
 * * To trigger a step adjustment when the metric is greater than or equal to 50 and less than 60,
 *   specify a lower bound of 0 and an upper bound of 10.
 * * To trigger a step adjustment when the metric is greater than 40 and less than or equal to 50,
 *   specify a lower bound of -10 and an upper bound of 0.
 *
 * There are a few rules for the step adjustments for your step policy:
 * * The ranges of your step adjustments can't overlap or have a gap.
 * * At most one step adjustment can have a null lower bound. If one step adjustment has a negative
 *   lower bound, then there must be a step adjustment with a null lower bound.
 * * At most one step adjustment can have a null upper bound. If one step adjustment has a positive
 *   upper bound, then there must be a step adjustment with a null upper bound.
 * * The upper and lower bound can't be null in the same step adjustment.
 *
 * For more information, see
 * [Step adjustments](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-steps)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * You can find a sample template snippet in the
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-policy.html#aws-properties-as-policy--examples)
 * section of the `AWS::AutoScaling::ScalingPolicy` resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * StepAdjustmentProperty stepAdjustmentProperty = StepAdjustmentProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .metricIntervalLowerBound(123)
 * .metricIntervalUpperBound(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html)
 */
@CdkDslMarker
public class CfnScalingPolicyStepAdjustmentPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.StepAdjustmentProperty.Builder =
        CfnScalingPolicy.StepAdjustmentProperty.builder()

    /**
     * @param metricIntervalLowerBound The lower bound for the difference between the alarm
     *   threshold and the CloudWatch metric. If the metric value is above the breach threshold, the
     *   lower bound is inclusive (the metric must be greater than or equal to the threshold plus
     *   the lower bound). Otherwise, it is exclusive (the metric must be greater than the threshold
     *   plus the lower bound). A null value indicates negative infinity.
     */
    public fun metricIntervalLowerBound(metricIntervalLowerBound: Number) {
        cdkBuilder.metricIntervalLowerBound(metricIntervalLowerBound)
    }

    /**
     * @param metricIntervalUpperBound The upper bound for the difference between the alarm
     *   threshold and the CloudWatch metric. If the metric value is above the breach threshold, the
     *   upper bound is exclusive (the metric must be less than the threshold plus the upper bound).
     *   Otherwise, it is inclusive (the metric must be less than or equal to the threshold plus the
     *   upper bound). A null value indicates positive infinity.
     *
     * The upper bound must be greater than the lower bound.
     */
    public fun metricIntervalUpperBound(metricIntervalUpperBound: Number) {
        cdkBuilder.metricIntervalUpperBound(metricIntervalUpperBound)
    }

    /**
     * @param scalingAdjustment The amount by which to scale, based on the specified adjustment
     *   type. A positive value adds to the current capacity while a negative number removes from
     *   the current capacity. For exact capacity, you must specify a non-negative value.
     */
    public fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
    }

    public fun build(): CfnScalingPolicy.StepAdjustmentProperty = cdkBuilder.build()
}
