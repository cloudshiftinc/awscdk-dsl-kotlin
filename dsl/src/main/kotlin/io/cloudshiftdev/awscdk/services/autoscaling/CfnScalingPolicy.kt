package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScalingPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a
   * percentage).
   */
  public open fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

  /**
   * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a
   * percentage).
   */
  public open fun adjustmentType(`value`: String) {
    unwrap(this).setAdjustmentType(`value`)
  }

  /**
   * Returns the ARN of a scaling policy.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the name of a scaling policy.
   */
  public open fun attrPolicyName(): String = unwrap(this).getAttrPolicyName()

  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  /**
   * The name of the Auto Scaling group.
   */
  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  /**
   * A cooldown period, in seconds, that applies to a specific simple scaling policy.
   */
  public open fun cooldown(): String? = unwrap(this).getCooldown()

  /**
   * A cooldown period, in seconds, that applies to a specific simple scaling policy.
   */
  public open fun cooldown(`value`: String) {
    unwrap(this).setCooldown(`value`)
  }

  /**
   * *Not needed if the default instance warmup is defined for the group.*.
   */
  public open fun estimatedInstanceWarmup(): Number? = unwrap(this).getEstimatedInstanceWarmup()

  /**
   * *Not needed if the default instance warmup is defined for the group.*.
   */
  public open fun estimatedInstanceWarmup(`value`: Number) {
    unwrap(this).setEstimatedInstanceWarmup(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The aggregation type for the CloudWatch metrics.
   */
  public open fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

  /**
   * The aggregation type for the CloudWatch metrics.
   */
  public open fun metricAggregationType(`value`: String) {
    unwrap(this).setMetricAggregationType(`value`)
  }

  /**
   * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
   */
  public open fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

  /**
   * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
   */
  public open fun minAdjustmentMagnitude(`value`: Number) {
    unwrap(this).setMinAdjustmentMagnitude(`value`)
  }

  /**
   * One of the following policy types:.
   */
  public open fun policyType(): String? = unwrap(this).getPolicyType()

  /**
   * One of the following policy types:.
   */
  public open fun policyType(`value`: String) {
    unwrap(this).setPolicyType(`value`)
  }

  /**
   * A predictive scaling policy.
   *
   * Provides support for predefined and custom metrics.
   */
  public open fun predictiveScalingConfiguration(): Any? =
      unwrap(this).getPredictiveScalingConfiguration()

  /**
   * A predictive scaling policy.
   *
   * Provides support for predefined and custom metrics.
   */
  public open fun predictiveScalingConfiguration(`value`: IResolvable) {
    unwrap(this).setPredictiveScalingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A predictive scaling policy.
   *
   * Provides support for predefined and custom metrics.
   */
  public open fun predictiveScalingConfiguration(`value`: PredictiveScalingConfigurationProperty) {
    unwrap(this).setPredictiveScalingConfiguration(`value`.let(PredictiveScalingConfigurationProperty::unwrap))
  }

  /**
   * A predictive scaling policy.
   *
   * Provides support for predefined and custom metrics.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97901d400c2c8ce5d49a4d2ab41c91526242b02cb2aca0abb7e0fefea2ce16a6")
  public open
      fun predictiveScalingConfiguration(`value`: PredictiveScalingConfigurationProperty.Builder.() -> Unit):
      Unit = predictiveScalingConfiguration(PredictiveScalingConfigurationProperty(`value`))

  /**
   * The amount by which to scale, based on the specified adjustment type.
   */
  public open fun scalingAdjustment(): Number? = unwrap(this).getScalingAdjustment()

  /**
   * The amount by which to scale, based on the specified adjustment type.
   */
  public open fun scalingAdjustment(`value`: Number) {
    unwrap(this).setScalingAdjustment(`value`)
  }

  /**
   * A set of adjustments that enable you to scale based on the size of the alarm breach.
   */
  public open fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

  /**
   * A set of adjustments that enable you to scale based on the size of the alarm breach.
   */
  public open fun stepAdjustments(`value`: IResolvable) {
    unwrap(this).setStepAdjustments(`value`.let(IResolvable::unwrap))
  }

  /**
   * A set of adjustments that enable you to scale based on the size of the alarm breach.
   */
  public open fun stepAdjustments(__idx_ac66f0: List<Any>) {
    unwrap(this).setStepAdjustments(__idx_ac66f0)
  }

  /**
   * A set of adjustments that enable you to scale based on the size of the alarm breach.
   */
  public open fun stepAdjustments(vararg __idx_ac66f0: Any): Unit =
      stepAdjustments(__idx_ac66f0.toList())

  /**
   * A target tracking scaling policy.
   *
   * Provides support for predefined or custom metrics.
   */
  public open fun targetTrackingConfiguration(): Any? =
      unwrap(this).getTargetTrackingConfiguration()

  /**
   * A target tracking scaling policy.
   *
   * Provides support for predefined or custom metrics.
   */
  public open fun targetTrackingConfiguration(`value`: IResolvable) {
    unwrap(this).setTargetTrackingConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * A target tracking scaling policy.
   *
   * Provides support for predefined or custom metrics.
   */
  public open fun targetTrackingConfiguration(`value`: TargetTrackingConfigurationProperty) {
    unwrap(this).setTargetTrackingConfiguration(`value`.let(TargetTrackingConfigurationProperty::unwrap))
  }

  /**
   * A target tracking scaling policy.
   *
   * Provides support for predefined or custom metrics.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ab4aa1cee9d8f70aacc692ff6ab507a78ba771cf450147958c30b83f58f180a")
  public open
      fun targetTrackingConfiguration(`value`: TargetTrackingConfigurationProperty.Builder.() -> Unit):
      Unit = targetTrackingConfiguration(TargetTrackingConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.autoscaling.CfnScalingPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a
     * percentage).
     *
     * The valid values are `ChangeInCapacity` , `ExactCapacity` , and `PercentChangeInCapacity` .
     *
     * Required if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-adjustmenttype)
     * @param adjustmentType Specifies how the scaling adjustment is interpreted (for example, an
     * absolute number or a percentage). 
     */
    public fun adjustmentType(adjustmentType: String)

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    public fun autoScalingGroupName(autoScalingGroupName: String)

    /**
     * A cooldown period, in seconds, that applies to a specific simple scaling policy.
     *
     * When a cooldown period is specified here, it overrides the default cooldown.
     *
     * Valid only if the policy type is `SimpleScaling` . For more information, see [Scaling
     * cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * Default: None
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-cooldown)
     * @param cooldown A cooldown period, in seconds, that applies to a specific simple scaling
     * policy. 
     */
    public fun cooldown(cooldown: String)

    /**
     * *Not needed if the default instance warmup is defined for the group.*.
     *
     * The estimated time, in seconds, until a newly launched instance can contribute to the
     * CloudWatch metrics. This warm-up period applies to instances launched due to a specific target
     * tracking or step scaling policy. When a warm-up period is specified here, it overrides the
     * default instance warmup.
     *
     * Valid only if the policy type is `TargetTrackingScaling` or `StepScaling` .
     *
     *
     * The default is to use the value for the default instance warmup defined for the group. If
     * default instance warmup is null, then `EstimatedInstanceWarmup` falls back to the value of
     * default cooldown.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-estimatedinstancewarmup)
     * @param estimatedInstanceWarmup *Not needed if the default instance warmup is defined for the
     * group.*. 
     */
    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number)

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * The valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
     * the value is treated as `Average` .
     *
     * Valid only if the policy type is `StepScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-metricaggregationtype)
     * @param metricAggregationType The aggregation type for the CloudWatch metrics. 
     */
    public fun metricAggregationType(metricAggregationType: String)

    /**
     * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
     *
     * For example, suppose that you create a step scaling policy to scale out an Auto Scaling group
     * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the group has 4 instances and
     * the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
     * `MinAdjustmentMagnitude` of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.
     *
     * Valid only if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * Some Auto Scaling groups use instance weights. In this case, set the `MinAdjustmentMagnitude`
     * to a value that is at least as large as your largest instance weight.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-minadjustmentmagnitude)
     * @param minAdjustmentMagnitude The minimum value to scale by when the adjustment type is
     * `PercentChangeInCapacity` . 
     */
    public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

    /**
     * One of the following policy types:.
     *
     * * `TargetTrackingScaling`
     * * `StepScaling`
     * * `SimpleScaling` (default)
     * * `PredictiveScaling`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-policytype)
     * @param policyType One of the following policy types:. 
     */
    public fun policyType(policyType: String)

    /**
     * A predictive scaling policy. Provides support for predefined and custom metrics.
     *
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics. 
     */
    public fun predictiveScalingConfiguration(predictiveScalingConfiguration: IResolvable)

    /**
     * A predictive scaling policy. Provides support for predefined and custom metrics.
     *
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics. 
     */
    public
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty)

    /**
     * A predictive scaling policy. Provides support for predefined and custom metrics.
     *
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df515687985a1b0d75a0c7b985ee0b0e126b753fb4edc1ae20d56f9ece23d6da")
    public
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty.Builder.() -> Unit)

    /**
     * The amount by which to scale, based on the specified adjustment type.
     *
     * A positive value adds to the current capacity while a negative number removes from the
     * current capacity. For exact capacity, you must specify a non-negative value.
     *
     * Required if the policy type is `SimpleScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-scalingadjustment)
     * @param scalingAdjustment The amount by which to scale, based on the specified adjustment
     * type. 
     */
    public fun scalingAdjustment(scalingAdjustment: Number)

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach. 
     */
    public fun stepAdjustments(stepAdjustments: IResolvable)

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach. 
     */
    public fun stepAdjustments(stepAdjustments: List<Any>)

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach. 
     */
    public fun stepAdjustments(vararg stepAdjustments: Any)

    /**
     * A target tracking scaling policy. Provides support for predefined or custom metrics.
     *
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics. 
     */
    public fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable)

    /**
     * A target tracking scaling policy. Provides support for predefined or custom metrics.
     *
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics. 
     */
    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty)

    /**
     * A target tracking scaling policy. Provides support for predefined or custom metrics.
     *
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("724ced6e567fa25d80fb5b723a9a990a7e73ab2b762cb275319b42df5c51f868")
    public
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.Builder.create(scope, id)

    /**
     * Specifies how the scaling adjustment is interpreted (for example, an absolute number or a
     * percentage).
     *
     * The valid values are `ChangeInCapacity` , `ExactCapacity` , and `PercentChangeInCapacity` .
     *
     * Required if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-adjustmenttype)
     * @param adjustmentType Specifies how the scaling adjustment is interpreted (for example, an
     * absolute number or a percentage). 
     */
    override fun adjustmentType(adjustmentType: String) {
      cdkBuilder.adjustmentType(adjustmentType)
    }

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-autoscalinggroupname)
     * @param autoScalingGroupName The name of the Auto Scaling group. 
     */
    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * A cooldown period, in seconds, that applies to a specific simple scaling policy.
     *
     * When a cooldown period is specified here, it overrides the default cooldown.
     *
     * Valid only if the policy type is `SimpleScaling` . For more information, see [Scaling
     * cooldowns for Amazon EC2 Auto
     * Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html) in the *Amazon EC2
     * Auto Scaling User Guide* .
     *
     * Default: None
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-cooldown)
     * @param cooldown A cooldown period, in seconds, that applies to a specific simple scaling
     * policy. 
     */
    override fun cooldown(cooldown: String) {
      cdkBuilder.cooldown(cooldown)
    }

    /**
     * *Not needed if the default instance warmup is defined for the group.*.
     *
     * The estimated time, in seconds, until a newly launched instance can contribute to the
     * CloudWatch metrics. This warm-up period applies to instances launched due to a specific target
     * tracking or step scaling policy. When a warm-up period is specified here, it overrides the
     * default instance warmup.
     *
     * Valid only if the policy type is `TargetTrackingScaling` or `StepScaling` .
     *
     *
     * The default is to use the value for the default instance warmup defined for the group. If
     * default instance warmup is null, then `EstimatedInstanceWarmup` falls back to the value of
     * default cooldown.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-estimatedinstancewarmup)
     * @param estimatedInstanceWarmup *Not needed if the default instance warmup is defined for the
     * group.*. 
     */
    override fun estimatedInstanceWarmup(estimatedInstanceWarmup: Number) {
      cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * The valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
     * the value is treated as `Average` .
     *
     * Valid only if the policy type is `StepScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-metricaggregationtype)
     * @param metricAggregationType The aggregation type for the CloudWatch metrics. 
     */
    override fun metricAggregationType(metricAggregationType: String) {
      cdkBuilder.metricAggregationType(metricAggregationType)
    }

    /**
     * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
     *
     * For example, suppose that you create a step scaling policy to scale out an Auto Scaling group
     * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the group has 4 instances and
     * the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
     * `MinAdjustmentMagnitude` of 2, Amazon EC2 Auto Scaling scales out the group by 2 instances.
     *
     * Valid only if the policy type is `StepScaling` or `SimpleScaling` . For more information, see
     * [Scaling adjustment
     * types](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     *
     * Some Auto Scaling groups use instance weights. In this case, set the `MinAdjustmentMagnitude`
     * to a value that is at least as large as your largest instance weight.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-minadjustmentmagnitude)
     * @param minAdjustmentMagnitude The minimum value to scale by when the adjustment type is
     * `PercentChangeInCapacity` . 
     */
    override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
      cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
    }

    /**
     * One of the following policy types:.
     *
     * * `TargetTrackingScaling`
     * * `StepScaling`
     * * `SimpleScaling` (default)
     * * `PredictiveScaling`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-policytype)
     * @param policyType One of the following policy types:. 
     */
    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    /**
     * A predictive scaling policy. Provides support for predefined and custom metrics.
     *
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics. 
     */
    override fun predictiveScalingConfiguration(predictiveScalingConfiguration: IResolvable) {
      cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A predictive scaling policy. Provides support for predefined and custom metrics.
     *
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics. 
     */
    override
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty) {
      cdkBuilder.predictiveScalingConfiguration(predictiveScalingConfiguration.let(PredictiveScalingConfigurationProperty::unwrap))
    }

    /**
     * A predictive scaling policy. Provides support for predefined and custom metrics.
     *
     * Predefined metrics include CPU utilization, network in/out, and the Application Load Balancer
     * request count.
     *
     * Required if the policy type is `PredictiveScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration)
     * @param predictiveScalingConfiguration A predictive scaling policy. Provides support for
     * predefined and custom metrics. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df515687985a1b0d75a0c7b985ee0b0e126b753fb4edc1ae20d56f9ece23d6da")
    override
        fun predictiveScalingConfiguration(predictiveScalingConfiguration: PredictiveScalingConfigurationProperty.Builder.() -> Unit):
        Unit =
        predictiveScalingConfiguration(PredictiveScalingConfigurationProperty(predictiveScalingConfiguration))

    /**
     * The amount by which to scale, based on the specified adjustment type.
     *
     * A positive value adds to the current capacity while a negative number removes from the
     * current capacity. For exact capacity, you must specify a non-negative value.
     *
     * Required if the policy type is `SimpleScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-scalingadjustment)
     * @param scalingAdjustment The amount by which to scale, based on the specified adjustment
     * type. 
     */
    override fun scalingAdjustment(scalingAdjustment: Number) {
      cdkBuilder.scalingAdjustment(scalingAdjustment)
    }

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach. 
     */
    override fun stepAdjustments(stepAdjustments: IResolvable) {
      cdkBuilder.stepAdjustments(stepAdjustments.let(IResolvable::unwrap))
    }

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach. 
     */
    override fun stepAdjustments(stepAdjustments: List<Any>) {
      cdkBuilder.stepAdjustments(stepAdjustments)
    }

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * Required if the policy type is `StepScaling` . (Not used with any other policy type.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-stepadjustments)
     * @param stepAdjustments A set of adjustments that enable you to scale based on the size of the
     * alarm breach. 
     */
    override fun stepAdjustments(vararg stepAdjustments: Any): Unit =
        stepAdjustments(stepAdjustments.toList())

    /**
     * A target tracking scaling policy. Provides support for predefined or custom metrics.
     *
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics. 
     */
    override fun targetTrackingConfiguration(targetTrackingConfiguration: IResolvable) {
      cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(IResolvable::unwrap))
    }

    /**
     * A target tracking scaling policy. Provides support for predefined or custom metrics.
     *
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics. 
     */
    override
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty) {
      cdkBuilder.targetTrackingConfiguration(targetTrackingConfiguration.let(TargetTrackingConfigurationProperty::unwrap))
    }

    /**
     * A target tracking scaling policy. Provides support for predefined or custom metrics.
     *
     * The following predefined metrics are available:
     *
     * * `ASGAverageCPUUtilization`
     * * `ASGAverageNetworkIn`
     * * `ASGAverageNetworkOut`
     * * `ALBRequestCountPerTarget`
     *
     * If you specify `ALBRequestCountPerTarget` for the metric, you must specify the
     * `ResourceLabel` property with the `PredefinedMetricSpecification` .
     *
     * Required if the policy type is `TargetTrackingScaling` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-scalingpolicy.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration)
     * @param targetTrackingConfiguration A target tracking scaling policy. Provides support for
     * predefined or custom metrics. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("724ced6e567fa25d80fb5b723a9a990a7e73ab2b762cb275319b42df5c51f868")
    override
        fun targetTrackingConfiguration(targetTrackingConfiguration: TargetTrackingConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingConfiguration(TargetTrackingConfigurationProperty(targetTrackingConfiguration))

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScalingPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy):
        CfnScalingPolicy = CfnScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPolicy):
        software.amazon.awscdk.services.autoscaling.CfnScalingPolicy = wrapped.cdkObject
  }

  public interface PredefinedMetricSpecificationProperty {
    /**
     * The metric type. The following predefined metrics are available:.
     *
     * * `ASGAverageCPUUtilization` - Average CPU utilization of the Auto Scaling group.
     * * `ASGAverageNetworkIn` - Average number of bytes received on all network interfaces by the
     * Auto Scaling group.
     * * `ASGAverageNetworkOut` - Average number of bytes sent out on all network interfaces by the
     * Auto Scaling group.
     * * `ALBRequestCountPerTarget` - Average Application Load Balancer request count per target for
     * your Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
     */
    public fun predefinedMetricType(): String

    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which
     * to determine the average request count served by your Auto Scaling group.
     *
     * You can't specify a resource label unless the target group is attached to the Auto Scaling
     * group.
     *
     * You create the resource label by appending the final portion of the load balancer ARN and the
     * final portion of the target group ARN into a single value, separated by a forward slash (/). The
     * format of the resource label is:
     *
     * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
     *
     * Where:
     *
     * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
     * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
     * ARN.
     *
     * To find the ARN for an Application Load Balancer, use the
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
     * API operation. To find the ARN for the target group, use the
     * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
     */
    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    /**
     * A builder for [PredefinedMetricSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param predefinedMetricType The metric type. The following predefined metrics are
       * available:. 
       * * `ASGAverageCPUUtilization` - Average CPU utilization of the Auto Scaling group.
       * * `ASGAverageNetworkIn` - Average number of bytes received on all network interfaces by the
       * Auto Scaling group.
       * * `ASGAverageNetworkOut` - Average number of bytes sent out on all network interfaces by
       * the Auto Scaling group.
       * * `ALBRequestCountPerTarget` - Average Application Load Balancer request count per target
       * for your Auto Scaling group.
       */
      public fun predefinedMetricType(predefinedMetricType: String)

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the average request count served by your Auto Scaling
       * group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.builder()

      /**
       * @param predefinedMetricType The metric type. The following predefined metrics are
       * available:. 
       * * `ASGAverageCPUUtilization` - Average CPU utilization of the Auto Scaling group.
       * * `ASGAverageNetworkIn` - Average number of bytes received on all network interfaces by the
       * Auto Scaling group.
       * * `ASGAverageNetworkOut` - Average number of bytes sent out on all network interfaces by
       * the Auto Scaling group.
       * * `ALBRequestCountPerTarget` - Average Application Load Balancer request count per target
       * for your Auto Scaling group.
       */
      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the average request count served by your Auto Scaling
       * group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty,
    ) : CdkObject(cdkObject), PredefinedMetricSpecificationProperty {
      /**
       * The metric type. The following predefined metrics are available:.
       *
       * * `ASGAverageCPUUtilization` - Average CPU utilization of the Auto Scaling group.
       * * `ASGAverageNetworkIn` - Average number of bytes received on all network interfaces by the
       * Auto Scaling group.
       * * `ASGAverageNetworkOut` - Average number of bytes sent out on all network interfaces by
       * the Auto Scaling group.
       * * `ALBRequestCountPerTarget` - Average Application Load Balancer request count per target
       * for your Auto Scaling group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
       */
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      /**
       * A label that uniquely identifies a specific Application Load Balancer target group from
       * which to determine the average request count served by your Auto Scaling group.
       *
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-autoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
       */
      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredefinedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty):
          PredefinedMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredefinedMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
    }
  }

  public interface PredictiveScalingConfigurationProperty {
    /**
     * Defines the behavior that should be applied if the forecast capacity approaches or exceeds
     * the maximum capacity of the Auto Scaling group.
     *
     * Defaults to `HonorMaxCapacity` if not specified.
     *
     * The following are possible values:
     *
     * * `HonorMaxCapacity` - Amazon EC2 Auto Scaling cannot scale out capacity higher than the
     * maximum capacity. The maximum capacity is enforced as a hard limit.
     * * `IncreaseMaxCapacity` - Amazon EC2 Auto Scaling can scale out capacity higher than the
     * maximum capacity when the forecast capacity is close to or exceeds the maximum capacity. The
     * upper limit is determined by the forecasted capacity and the value for `MaxCapacityBuffer` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-maxcapacitybreachbehavior)
     */
    public fun maxCapacityBreachBehavior(): String? = unwrap(this).getMaxCapacityBreachBehavior()

    /**
     * The size of the capacity buffer to use when the forecast capacity is close to or exceeds the
     * maximum capacity.
     *
     * The value is specified as a percentage relative to the forecast capacity. For example, if the
     * buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50, and the
     * maximum capacity is 40, then the effective maximum capacity is 55.
     *
     * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to
     * equal but not exceed forecast capacity.
     *
     * Required if the `MaxCapacityBreachBehavior` property is set to `IncreaseMaxCapacity` , and
     * cannot be used otherwise.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-maxcapacitybuffer)
     */
    public fun maxCapacityBuffer(): Number? = unwrap(this).getMaxCapacityBuffer()

    /**
     * This structure includes the metrics and target utilization to use for predictive scaling.
     *
     * This is an array, but we currently only support a single metric specification. That is, you
     * can specify a target value and a single metric pair, or a target value and one scaling metric
     * and one load metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-metricspecifications)
     */
    public fun metricSpecifications(): Any

    /**
     * The predictive scaling mode.
     *
     * Defaults to `ForecastOnly` if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-mode)
     */
    public fun mode(): String? = unwrap(this).getMode()

    /**
     * The amount of time, in seconds, by which the instance launch time can be advanced.
     *
     * For example, the forecast says to add capacity at 10:00 AM, and you choose to pre-launch
     * instances by 5 minutes. In that case, the instances will be launched at 9:55 AM. The intention
     * is to give resources time to be provisioned. It can take a few minutes to launch an EC2
     * instance. The actual amount of time required depends on several factors, such as the size of the
     * instance and whether there are startup scripts to complete.
     *
     * The value must be less than the forecast interval duration of 3600 seconds (60 minutes).
     * Defaults to 300 seconds if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-schedulingbuffertime)
     */
    public fun schedulingBufferTime(): Number? = unwrap(this).getSchedulingBufferTime()

    /**
     * A builder for [PredictiveScalingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacityBreachBehavior Defines the behavior that should be applied if the
       * forecast capacity approaches or exceeds the maximum capacity of the Auto Scaling group.
       * Defaults to `HonorMaxCapacity` if not specified.
       *
       * The following are possible values:
       *
       * * `HonorMaxCapacity` - Amazon EC2 Auto Scaling cannot scale out capacity higher than the
       * maximum capacity. The maximum capacity is enforced as a hard limit.
       * * `IncreaseMaxCapacity` - Amazon EC2 Auto Scaling can scale out capacity higher than the
       * maximum capacity when the forecast capacity is close to or exceeds the maximum capacity. The
       * upper limit is determined by the forecasted capacity and the value for `MaxCapacityBuffer` .
       */
      public fun maxCapacityBreachBehavior(maxCapacityBreachBehavior: String)

      /**
       * @param maxCapacityBuffer The size of the capacity buffer to use when the forecast capacity
       * is close to or exceeds the maximum capacity.
       * The value is specified as a percentage relative to the forecast capacity. For example, if
       * the buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50,
       * and the maximum capacity is 40, then the effective maximum capacity is 55.
       *
       * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to
       * equal but not exceed forecast capacity.
       *
       * Required if the `MaxCapacityBreachBehavior` property is set to `IncreaseMaxCapacity` , and
       * cannot be used otherwise.
       */
      public fun maxCapacityBuffer(maxCapacityBuffer: Number)

      /**
       * @param metricSpecifications This structure includes the metrics and target utilization to
       * use for predictive scaling. 
       * This is an array, but we currently only support a single metric specification. That is, you
       * can specify a target value and a single metric pair, or a target value and one scaling metric
       * and one load metric.
       */
      public fun metricSpecifications(metricSpecifications: IResolvable)

      /**
       * @param metricSpecifications This structure includes the metrics and target utilization to
       * use for predictive scaling. 
       * This is an array, but we currently only support a single metric specification. That is, you
       * can specify a target value and a single metric pair, or a target value and one scaling metric
       * and one load metric.
       */
      public fun metricSpecifications(metricSpecifications: List<Any>)

      /**
       * @param metricSpecifications This structure includes the metrics and target utilization to
       * use for predictive scaling. 
       * This is an array, but we currently only support a single metric specification. That is, you
       * can specify a target value and a single metric pair, or a target value and one scaling metric
       * and one load metric.
       */
      public fun metricSpecifications(vararg metricSpecifications: Any)

      /**
       * @param mode The predictive scaling mode.
       * Defaults to `ForecastOnly` if not specified.
       */
      public fun mode(mode: String)

      /**
       * @param schedulingBufferTime The amount of time, in seconds, by which the instance launch
       * time can be advanced.
       * For example, the forecast says to add capacity at 10:00 AM, and you choose to pre-launch
       * instances by 5 minutes. In that case, the instances will be launched at 9:55 AM. The intention
       * is to give resources time to be provisioned. It can take a few minutes to launch an EC2
       * instance. The actual amount of time required depends on several factors, such as the size of
       * the instance and whether there are startup scripts to complete.
       *
       * The value must be less than the forecast interval duration of 3600 seconds (60 minutes).
       * Defaults to 300 seconds if not specified.
       */
      public fun schedulingBufferTime(schedulingBufferTime: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty.builder()

      /**
       * @param maxCapacityBreachBehavior Defines the behavior that should be applied if the
       * forecast capacity approaches or exceeds the maximum capacity of the Auto Scaling group.
       * Defaults to `HonorMaxCapacity` if not specified.
       *
       * The following are possible values:
       *
       * * `HonorMaxCapacity` - Amazon EC2 Auto Scaling cannot scale out capacity higher than the
       * maximum capacity. The maximum capacity is enforced as a hard limit.
       * * `IncreaseMaxCapacity` - Amazon EC2 Auto Scaling can scale out capacity higher than the
       * maximum capacity when the forecast capacity is close to or exceeds the maximum capacity. The
       * upper limit is determined by the forecasted capacity and the value for `MaxCapacityBuffer` .
       */
      override fun maxCapacityBreachBehavior(maxCapacityBreachBehavior: String) {
        cdkBuilder.maxCapacityBreachBehavior(maxCapacityBreachBehavior)
      }

      /**
       * @param maxCapacityBuffer The size of the capacity buffer to use when the forecast capacity
       * is close to or exceeds the maximum capacity.
       * The value is specified as a percentage relative to the forecast capacity. For example, if
       * the buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50,
       * and the maximum capacity is 40, then the effective maximum capacity is 55.
       *
       * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to
       * equal but not exceed forecast capacity.
       *
       * Required if the `MaxCapacityBreachBehavior` property is set to `IncreaseMaxCapacity` , and
       * cannot be used otherwise.
       */
      override fun maxCapacityBuffer(maxCapacityBuffer: Number) {
        cdkBuilder.maxCapacityBuffer(maxCapacityBuffer)
      }

      /**
       * @param metricSpecifications This structure includes the metrics and target utilization to
       * use for predictive scaling. 
       * This is an array, but we currently only support a single metric specification. That is, you
       * can specify a target value and a single metric pair, or a target value and one scaling metric
       * and one load metric.
       */
      override fun metricSpecifications(metricSpecifications: IResolvable) {
        cdkBuilder.metricSpecifications(metricSpecifications.let(IResolvable::unwrap))
      }

      /**
       * @param metricSpecifications This structure includes the metrics and target utilization to
       * use for predictive scaling. 
       * This is an array, but we currently only support a single metric specification. That is, you
       * can specify a target value and a single metric pair, or a target value and one scaling metric
       * and one load metric.
       */
      override fun metricSpecifications(metricSpecifications: List<Any>) {
        cdkBuilder.metricSpecifications(metricSpecifications)
      }

      /**
       * @param metricSpecifications This structure includes the metrics and target utilization to
       * use for predictive scaling. 
       * This is an array, but we currently only support a single metric specification. That is, you
       * can specify a target value and a single metric pair, or a target value and one scaling metric
       * and one load metric.
       */
      override fun metricSpecifications(vararg metricSpecifications: Any): Unit =
          metricSpecifications(metricSpecifications.toList())

      /**
       * @param mode The predictive scaling mode.
       * Defaults to `ForecastOnly` if not specified.
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param schedulingBufferTime The amount of time, in seconds, by which the instance launch
       * time can be advanced.
       * For example, the forecast says to add capacity at 10:00 AM, and you choose to pre-launch
       * instances by 5 minutes. In that case, the instances will be launched at 9:55 AM. The intention
       * is to give resources time to be provisioned. It can take a few minutes to launch an EC2
       * instance. The actual amount of time required depends on several factors, such as the size of
       * the instance and whether there are startup scripts to complete.
       *
       * The value must be less than the forecast interval duration of 3600 seconds (60 minutes).
       * Defaults to 300 seconds if not specified.
       */
      override fun schedulingBufferTime(schedulingBufferTime: Number) {
        cdkBuilder.schedulingBufferTime(schedulingBufferTime)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty,
    ) : CdkObject(cdkObject), PredictiveScalingConfigurationProperty {
      /**
       * Defines the behavior that should be applied if the forecast capacity approaches or exceeds
       * the maximum capacity of the Auto Scaling group.
       *
       * Defaults to `HonorMaxCapacity` if not specified.
       *
       * The following are possible values:
       *
       * * `HonorMaxCapacity` - Amazon EC2 Auto Scaling cannot scale out capacity higher than the
       * maximum capacity. The maximum capacity is enforced as a hard limit.
       * * `IncreaseMaxCapacity` - Amazon EC2 Auto Scaling can scale out capacity higher than the
       * maximum capacity when the forecast capacity is close to or exceeds the maximum capacity. The
       * upper limit is determined by the forecasted capacity and the value for `MaxCapacityBuffer` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-maxcapacitybreachbehavior)
       */
      override fun maxCapacityBreachBehavior(): String? =
          unwrap(this).getMaxCapacityBreachBehavior()

      /**
       * The size of the capacity buffer to use when the forecast capacity is close to or exceeds
       * the maximum capacity.
       *
       * The value is specified as a percentage relative to the forecast capacity. For example, if
       * the buffer is 10, this means a 10 percent buffer, such that if the forecast capacity is 50,
       * and the maximum capacity is 40, then the effective maximum capacity is 55.
       *
       * If set to 0, Amazon EC2 Auto Scaling may scale capacity higher than the maximum capacity to
       * equal but not exceed forecast capacity.
       *
       * Required if the `MaxCapacityBreachBehavior` property is set to `IncreaseMaxCapacity` , and
       * cannot be used otherwise.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-maxcapacitybuffer)
       */
      override fun maxCapacityBuffer(): Number? = unwrap(this).getMaxCapacityBuffer()

      /**
       * This structure includes the metrics and target utilization to use for predictive scaling.
       *
       * This is an array, but we currently only support a single metric specification. That is, you
       * can specify a target value and a single metric pair, or a target value and one scaling metric
       * and one load metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-metricspecifications)
       */
      override fun metricSpecifications(): Any = unwrap(this).getMetricSpecifications()

      /**
       * The predictive scaling mode.
       *
       * Defaults to `ForecastOnly` if not specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-mode)
       */
      override fun mode(): String? = unwrap(this).getMode()

      /**
       * The amount of time, in seconds, by which the instance launch time can be advanced.
       *
       * For example, the forecast says to add capacity at 10:00 AM, and you choose to pre-launch
       * instances by 5 minutes. In that case, the instances will be launched at 9:55 AM. The intention
       * is to give resources time to be provisioned. It can take a few minutes to launch an EC2
       * instance. The actual amount of time required depends on several factors, such as the size of
       * the instance and whether there are startup scripts to complete.
       *
       * The value must be less than the forecast interval duration of 3600 seconds (60 minutes).
       * Defaults to 300 seconds if not specified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingconfiguration.html#cfn-autoscaling-scalingpolicy-predictivescalingconfiguration-schedulingbuffertime)
       */
      override fun schedulingBufferTime(): Number? = unwrap(this).getSchedulingBufferTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty):
          PredictiveScalingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingConfigurationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingConfigurationProperty
    }
  }

  public interface MetricProperty {
    /**
     * The dimensions for the metric.
     *
     * For the list of available dimensions, see the AWS documentation available from the table in
     * [AWS services that publish CloudWatch
     * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Conditional: If you published your metric with dimensions, you must specify the same
     * dimensions in your scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html#cfn-autoscaling-scalingpolicy-metric-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html#cfn-autoscaling-scalingpolicy-metric-metricname)
     */
    public fun metricName(): String

    /**
     * The namespace of the metric.
     *
     * For more information, see the table in [AWS services that publish CloudWatch
     * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html#cfn-autoscaling-scalingpolicy-metric-namespace)
     */
    public fun namespace(): String

    /**
     * A builder for [MetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param metricName The name of the metric. 
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace of the metric. 
       * For more information, see the table in [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty.Builder =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty.builder()

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param metricName The name of the metric. 
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace of the metric. 
       * For more information, see the table in [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty,
    ) : CdkObject(cdkObject), MetricProperty {
      /**
       * The dimensions for the metric.
       *
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html#cfn-autoscaling-scalingpolicy-metric-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The name of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html#cfn-autoscaling-scalingpolicy-metric-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The namespace of the metric.
       *
       * For more information, see the table in [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metric.html#cfn-autoscaling-scalingpolicy-metric-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty):
          MetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricProperty
    }
  }

  public interface PredictiveScalingPredefinedLoadMetricProperty {
    /**
     * The metric type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric-predefinedmetrictype)
     */
    public fun predefinedMetricType(): String

    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which
     * to determine the request count served by your Auto Scaling group.
     *
     * You can't specify a resource label unless the target group is attached to the Auto Scaling
     * group.
     *
     * You create the resource label by appending the final portion of the load balancer ARN and the
     * final portion of the target group ARN into a single value, separated by a forward slash (/). The
     * format of the resource label is:
     *
     * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
     *
     * Where:
     *
     * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
     * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
     * ARN.
     *
     * To find the ARN for an Application Load Balancer, use the
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
     * API operation. To find the ARN for the target group, use the
     * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric-resourcelabel)
     */
    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    /**
     * A builder for [PredictiveScalingPredefinedLoadMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param predefinedMetricType The metric type. 
       */
      public fun predefinedMetricType(predefinedMetricType: String)

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the request count served by your Auto Scaling group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.builder()

      /**
       * @param predefinedMetricType The metric type. 
       */
      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the request count served by your Auto Scaling group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingPredefinedLoadMetricProperty {
      /**
       * The metric type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric-predefinedmetrictype)
       */
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      /**
       * A label that uniquely identifies a specific Application Load Balancer target group from
       * which to determine the request count served by your Auto Scaling group.
       *
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedloadmetric-resourcelabel)
       */
      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingPredefinedLoadMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty):
          PredictiveScalingPredefinedLoadMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingPredefinedLoadMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty
    }
  }

  public interface TargetTrackingConfigurationProperty {
    /**
     * A customized metric.
     *
     * You must specify either a predefined metric or a customized metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-customizedmetricspecification)
     */
    public fun customizedMetricSpecification(): Any? =
        unwrap(this).getCustomizedMetricSpecification()

    /**
     * Indicates whether scaling in by the target tracking scaling policy is disabled.
     *
     * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from
     * the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances from
     * the Auto Scaling group. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein)
     */
    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    /**
     * A predefined metric.
     *
     * You must specify either a predefined metric or a customized metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-predefinedmetricspecification)
     */
    public fun predefinedMetricSpecification(): Any? =
        unwrap(this).getPredefinedMetricSpecification()

    /**
     * The target value for the metric.
     *
     *
     * Some metrics are based on a count instead of a percentage, such as the request count for an
     * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
     * specifies one of these metrics, specify the target utilization as the optimal average request or
     * message count per instance during any one-minute interval.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue)
     */
    public fun targetValue(): Number

    /**
     * A builder for [TargetTrackingConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customizedMetricSpecification A customized metric.
       * You must specify either a predefined metric or a customized metric.
       */
      public fun customizedMetricSpecification(customizedMetricSpecification: IResolvable)

      /**
       * @param customizedMetricSpecification A customized metric.
       * You must specify either a predefined metric or a customized metric.
       */
      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty)

      /**
       * @param customizedMetricSpecification A customized metric.
       * You must specify either a predefined metric or a customized metric.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83dd031259827e7824397d7cebd1c1b86c5ebb6853125782ef749e24dc2a8873")
      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty.Builder.() -> Unit)

      /**
       * @param disableScaleIn Indicates whether scaling in by the target tracking scaling policy is
       * disabled.
       * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from
       * the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances
       * from the Auto Scaling group. The default is `false` .
       */
      public fun disableScaleIn(disableScaleIn: Boolean)

      /**
       * @param disableScaleIn Indicates whether scaling in by the target tracking scaling policy is
       * disabled.
       * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from
       * the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances
       * from the Auto Scaling group. The default is `false` .
       */
      public fun disableScaleIn(disableScaleIn: IResolvable)

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You must specify either a predefined metric or a customized metric.
       */
      public fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable)

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You must specify either a predefined metric or a customized metric.
       */
      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty)

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You must specify either a predefined metric or a customized metric.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e88284f33083fc80bec682feb058834859f43bacfa566a36af4b217680ddb7")
      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit)

      /**
       * @param targetValue The target value for the metric. 
       *
       * Some metrics are based on a count instead of a percentage, such as the request count for an
       * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
       * specifies one of these metrics, specify the target utilization as the optimal average request
       * or message count per instance during any one-minute interval.
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty.builder()

      /**
       * @param customizedMetricSpecification A customized metric.
       * You must specify either a predefined metric or a customized metric.
       */
      override fun customizedMetricSpecification(customizedMetricSpecification: IResolvable) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param customizedMetricSpecification A customized metric.
       * You must specify either a predefined metric or a customized metric.
       */
      override
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(CustomizedMetricSpecificationProperty::unwrap))
      }

      /**
       * @param customizedMetricSpecification A customized metric.
       * You must specify either a predefined metric or a customized metric.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83dd031259827e7824397d7cebd1c1b86c5ebb6853125782ef749e24dc2a8873")
      override
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          customizedMetricSpecification(CustomizedMetricSpecificationProperty(customizedMetricSpecification))

      /**
       * @param disableScaleIn Indicates whether scaling in by the target tracking scaling policy is
       * disabled.
       * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from
       * the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances
       * from the Auto Scaling group. The default is `false` .
       */
      override fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
      }

      /**
       * @param disableScaleIn Indicates whether scaling in by the target tracking scaling policy is
       * disabled.
       * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from
       * the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances
       * from the Auto Scaling group. The default is `false` .
       */
      override fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable::unwrap))
      }

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You must specify either a predefined metric or a customized metric.
       */
      override fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You must specify either a predefined metric or a customized metric.
       */
      override
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification.let(PredefinedMetricSpecificationProperty::unwrap))
      }

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You must specify either a predefined metric or a customized metric.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e88284f33083fc80bec682feb058834859f43bacfa566a36af4b217680ddb7")
      override
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          predefinedMetricSpecification(PredefinedMetricSpecificationProperty(predefinedMetricSpecification))

      /**
       * @param targetValue The target value for the metric. 
       *
       * Some metrics are based on a count instead of a percentage, such as the request count for an
       * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
       * specifies one of these metrics, specify the target utilization as the optimal average request
       * or message count per instance during any one-minute interval.
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty,
    ) : CdkObject(cdkObject), TargetTrackingConfigurationProperty {
      /**
       * A customized metric.
       *
       * You must specify either a predefined metric or a customized metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-customizedmetricspecification)
       */
      override fun customizedMetricSpecification(): Any? =
          unwrap(this).getCustomizedMetricSpecification()

      /**
       * Indicates whether scaling in by the target tracking scaling policy is disabled.
       *
       * If scaling in is disabled, the target tracking scaling policy doesn't remove instances from
       * the Auto Scaling group. Otherwise, the target tracking scaling policy can remove instances
       * from the Auto Scaling group. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-disablescalein)
       */
      override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      /**
       * A predefined metric.
       *
       * You must specify either a predefined metric or a customized metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-predefinedmetricspecification)
       */
      override fun predefinedMetricSpecification(): Any? =
          unwrap(this).getPredefinedMetricSpecification()

      /**
       * The target value for the metric.
       *
       *
       * Some metrics are based on a count instead of a percentage, such as the request count for an
       * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
       * specifies one of these metrics, specify the target utilization as the optimal average request
       * or message count per instance during any one-minute interval.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-targettrackingconfiguration.html#cfn-autoscaling-scalingpolicy-targettrackingconfiguration-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty):
          TargetTrackingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingConfigurationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.TargetTrackingConfigurationProperty
    }
  }

  public interface MetricStatProperty {
    /**
     * The CloudWatch metric to return, including the metric name, namespace, and dimensions.
     *
     * To get the exact metric name, namespace, and dimensions, inspect the
     * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
     * object that is returned by a call to
     * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html#cfn-autoscaling-scalingpolicy-metricstat-metric)
     */
    public fun metric(): Any

    /**
     * The statistic to return.
     *
     * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
     * see the table in
     * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
     * in the *Amazon CloudWatch User Guide* .
     *
     * The most commonly used metrics for predictive scaling are `Average` and `Sum` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html#cfn-autoscaling-scalingpolicy-metricstat-stat)
     */
    public fun stat(): String

    /**
     * The unit to use for the returned data points.
     *
     * For a complete list of the units that CloudWatch supports, see the
     * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
     * data type in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html#cfn-autoscaling-scalingpolicy-metricstat-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [MetricStatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      public fun metric(metric: IResolvable)

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      public fun metric(metric: MetricProperty)

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02e2e53201330f186b1c6d129c240294222496d09fb3c522376d60fa73d64964")
      public fun metric(metric: MetricProperty.Builder.() -> Unit)

      /**
       * @param stat The statistic to return. 
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       *
       * The most commonly used metrics for predictive scaling are `Average` and `Sum` .
       */
      public fun stat(stat: String)

      /**
       * @param unit The unit to use for the returned data points.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty.Builder =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty.builder()

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      override fun metric(metric: MetricProperty) {
        cdkBuilder.metric(metric.let(MetricProperty::unwrap))
      }

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02e2e53201330f186b1c6d129c240294222496d09fb3c522376d60fa73d64964")
      override fun metric(metric: MetricProperty.Builder.() -> Unit): Unit =
          metric(MetricProperty(metric))

      /**
       * @param stat The statistic to return. 
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       *
       * The most commonly used metrics for predictive scaling are `Average` and `Sum` .
       */
      override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      /**
       * @param unit The unit to use for the returned data points.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty,
    ) : CdkObject(cdkObject), MetricStatProperty {
      /**
       * The CloudWatch metric to return, including the metric name, namespace, and dimensions.
       *
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html#cfn-autoscaling-scalingpolicy-metricstat-metric)
       */
      override fun metric(): Any = unwrap(this).getMetric()

      /**
       * The statistic to return.
       *
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       *
       * The most commonly used metrics for predictive scaling are `Average` and `Sum` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html#cfn-autoscaling-scalingpolicy-metricstat-stat)
       */
      override fun stat(): String = unwrap(this).getStat()

      /**
       * The unit to use for the returned data points.
       *
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricstat.html#cfn-autoscaling-scalingpolicy-metricstat-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty):
          MetricStatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStatProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricStatProperty
    }
  }

  public interface StepAdjustmentProperty {
    /**
     * The lower bound for the difference between the alarm threshold and the CloudWatch metric.
     *
     * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
     * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive
     * (the metric must be greater than the threshold plus the lower bound). A null value indicates
     * negative infinity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
     */
    public fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

    /**
     * The upper bound for the difference between the alarm threshold and the CloudWatch metric.
     *
     * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
     * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
     * must be less than or equal to the threshold plus the upper bound). A null value indicates
     * positive infinity.
     *
     * The upper bound must be greater than the lower bound.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
     */
    public fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

    /**
     * The amount by which to scale, based on the specified adjustment type.
     *
     * A positive value adds to the current capacity while a negative number removes from the
     * current capacity. For exact capacity, you must specify a non-negative value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment)
     */
    public fun scalingAdjustment(): Number

    /**
     * A builder for [StepAdjustmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricIntervalLowerBound The lower bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
       * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is
       * exclusive (the metric must be greater than the threshold plus the lower bound). A null value
       * indicates negative infinity.
       */
      public fun metricIntervalLowerBound(metricIntervalLowerBound: Number)

      /**
       * @param metricIntervalUpperBound The upper bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
       * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
       * must be less than or equal to the threshold plus the upper bound). A null value indicates
       * positive infinity.
       *
       * The upper bound must be greater than the lower bound.
       */
      public fun metricIntervalUpperBound(metricIntervalUpperBound: Number)

      /**
       * @param scalingAdjustment The amount by which to scale, based on the specified adjustment
       * type. 
       * A positive value adds to the current capacity while a negative number removes from the
       * current capacity. For exact capacity, you must specify a non-negative value.
       */
      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty.builder()

      /**
       * @param metricIntervalLowerBound The lower bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
       * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is
       * exclusive (the metric must be greater than the threshold plus the lower bound). A null value
       * indicates negative infinity.
       */
      override fun metricIntervalLowerBound(metricIntervalLowerBound: Number) {
        cdkBuilder.metricIntervalLowerBound(metricIntervalLowerBound)
      }

      /**
       * @param metricIntervalUpperBound The upper bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
       * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
       * must be less than or equal to the threshold plus the upper bound). A null value indicates
       * positive infinity.
       *
       * The upper bound must be greater than the lower bound.
       */
      override fun metricIntervalUpperBound(metricIntervalUpperBound: Number) {
        cdkBuilder.metricIntervalUpperBound(metricIntervalUpperBound)
      }

      /**
       * @param scalingAdjustment The amount by which to scale, based on the specified adjustment
       * type. 
       * A positive value adds to the current capacity while a negative number removes from the
       * current capacity. For exact capacity, you must specify a non-negative value.
       */
      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty,
    ) : CdkObject(cdkObject), StepAdjustmentProperty {
      /**
       * The lower bound for the difference between the alarm threshold and the CloudWatch metric.
       *
       * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
       * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is
       * exclusive (the metric must be greater than the threshold plus the lower bound). A null value
       * indicates negative infinity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
       */
      override fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

      /**
       * The upper bound for the difference between the alarm threshold and the CloudWatch metric.
       *
       * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
       * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
       * must be less than or equal to the threshold plus the upper bound). A null value indicates
       * positive infinity.
       *
       * The upper bound must be greater than the lower bound.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html#cfn-autoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
       */
      override fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

      /**
       * The amount by which to scale, based on the specified adjustment type.
       *
       * A positive value adds to the current capacity while a negative number removes from the
       * current capacity. For exact capacity, you must specify a non-negative value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-stepadjustment.html#cfn-autoscaling-scalingpolicy-stepadjustment-scalingadjustment)
       */
      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepAdjustmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty):
          StepAdjustmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepAdjustmentProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.StepAdjustmentProperty
    }
  }

  public interface PredictiveScalingPredefinedScalingMetricProperty {
    /**
     * The metric type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric-predefinedmetrictype)
     */
    public fun predefinedMetricType(): String

    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which
     * to determine the average request count served by your Auto Scaling group.
     *
     * You can't specify a resource label unless the target group is attached to the Auto Scaling
     * group.
     *
     * You create the resource label by appending the final portion of the load balancer ARN and the
     * final portion of the target group ARN into a single value, separated by a forward slash (/). The
     * format of the resource label is:
     *
     * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
     *
     * Where:
     *
     * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
     * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
     * ARN.
     *
     * To find the ARN for an Application Load Balancer, use the
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
     * API operation. To find the ARN for the target group, use the
     * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric-resourcelabel)
     */
    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    /**
     * A builder for [PredictiveScalingPredefinedScalingMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param predefinedMetricType The metric type. 
       */
      public fun predefinedMetricType(predefinedMetricType: String)

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the average request count served by your Auto Scaling
       * group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty.builder()

      /**
       * @param predefinedMetricType The metric type. 
       */
      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the average request count served by your Auto Scaling
       * group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingPredefinedScalingMetricProperty {
      /**
       * The metric type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric-predefinedmetrictype)
       */
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      /**
       * A label that uniquely identifies a specific Application Load Balancer target group from
       * which to determine the average request count served by your Auto Scaling group.
       *
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedscalingmetric-resourcelabel)
       */
      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingPredefinedScalingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty):
          PredictiveScalingPredefinedScalingMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingPredefinedScalingMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty
    }
  }

  public interface PredictiveScalingCustomizedCapacityMetricProperty {
    /**
     * One or more metric data queries to provide the data points for a capacity metric.
     *
     * Use multiple metric data queries only if you are performing a math expression on returned
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedcapacitymetric.html#cfn-autoscaling-scalingpolicy-predictivescalingcustomizedcapacitymetric-metricdataqueries)
     */
    public fun metricDataQueries(): Any

    /**
     * A builder for [PredictiveScalingCustomizedCapacityMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * capacity metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(metricDataQueries: IResolvable)

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * capacity metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(metricDataQueries: List<Any>)

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * capacity metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(vararg metricDataQueries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.builder()

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * capacity metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
      }

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * capacity metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries)
      }

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * capacity metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
          metricDataQueries(metricDataQueries.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingCustomizedCapacityMetricProperty {
      /**
       * One or more metric data queries to provide the data points for a capacity metric.
       *
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedcapacitymetric.html#cfn-autoscaling-scalingpolicy-predictivescalingcustomizedcapacitymetric-metricdataqueries)
       */
      override fun metricDataQueries(): Any = unwrap(this).getMetricDataQueries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingCustomizedCapacityMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty):
          PredictiveScalingCustomizedCapacityMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingCustomizedCapacityMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty
    }
  }

  public interface PredictiveScalingMetricSpecificationProperty {
    /**
     * The customized capacity metric specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-customizedcapacitymetricspecification)
     */
    public fun customizedCapacityMetricSpecification(): Any? =
        unwrap(this).getCustomizedCapacityMetricSpecification()

    /**
     * The customized load metric specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-customizedloadmetricspecification)
     */
    public fun customizedLoadMetricSpecification(): Any? =
        unwrap(this).getCustomizedLoadMetricSpecification()

    /**
     * The customized scaling metric specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-customizedscalingmetricspecification)
     */
    public fun customizedScalingMetricSpecification(): Any? =
        unwrap(this).getCustomizedScalingMetricSpecification()

    /**
     * The predefined load metric specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-predefinedloadmetricspecification)
     */
    public fun predefinedLoadMetricSpecification(): Any? =
        unwrap(this).getPredefinedLoadMetricSpecification()

    /**
     * The predefined metric pair specification from which Amazon EC2 Auto Scaling determines the
     * appropriate scaling metric and load metric to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-predefinedmetricpairspecification)
     */
    public fun predefinedMetricPairSpecification(): Any? =
        unwrap(this).getPredefinedMetricPairSpecification()

    /**
     * The predefined scaling metric specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-predefinedscalingmetricspecification)
     */
    public fun predefinedScalingMetricSpecification(): Any? =
        unwrap(this).getPredefinedScalingMetricSpecification()

    /**
     * Specifies the target utilization.
     *
     *
     * Some metrics are based on a count instead of a percentage, such as the request count for an
     * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
     * specifies one of these metrics, specify the target utilization as the optimal average request or
     * message count per instance during any one-minute interval.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-targetvalue)
     */
    public fun targetValue(): Number

    /**
     * A builder for [PredictiveScalingMetricSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customizedCapacityMetricSpecification The customized capacity metric specification.
       */
      public
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: IResolvable)

      /**
       * @param customizedCapacityMetricSpecification The customized capacity metric specification.
       */
      public
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty)

      /**
       * @param customizedCapacityMetricSpecification The customized capacity metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576825e68ad5c44bf88fbc5865ff958e76c17dfcb07ffe704e92d3e00535a5da")
      public
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty.Builder.() -> Unit)

      /**
       * @param customizedLoadMetricSpecification The customized load metric specification.
       */
      public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable)

      /**
       * @param customizedLoadMetricSpecification The customized load metric specification.
       */
      public
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty)

      /**
       * @param customizedLoadMetricSpecification The customized load metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c43aaf6eba755c957c78045e5a3615cdbaab0b207ed862c19dfdc2db186a0680")
      public
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty.Builder.() -> Unit)

      /**
       * @param customizedScalingMetricSpecification The customized scaling metric specification.
       */
      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable)

      /**
       * @param customizedScalingMetricSpecification The customized scaling metric specification.
       */
      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty)

      /**
       * @param customizedScalingMetricSpecification The customized scaling metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc0decdd0c5a06475fdec6a82987d218c1ab1dcbfdb4d137a053f6414f359af")
      public
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty.Builder.() -> Unit)

      /**
       * @param predefinedLoadMetricSpecification The predefined load metric specification.
       */
      public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable)

      /**
       * @param predefinedLoadMetricSpecification The predefined load metric specification.
       */
      public
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty)

      /**
       * @param predefinedLoadMetricSpecification The predefined load metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1a4be592dea838fd0cf6431d144f8e90aeec0ebce2f64591cd563ff1b8f1c6f")
      public
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty.Builder.() -> Unit)

      /**
       * @param predefinedMetricPairSpecification The predefined metric pair specification from
       * which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to
       * use.
       */
      public fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: IResolvable)

      /**
       * @param predefinedMetricPairSpecification The predefined metric pair specification from
       * which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to
       * use.
       */
      public
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty)

      /**
       * @param predefinedMetricPairSpecification The predefined metric pair specification from
       * which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to
       * use.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd9691cb9834b6e49475da172e8452248c66494e725217bddac0c76b041f89af")
      public
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty.Builder.() -> Unit)

      /**
       * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
       */
      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable)

      /**
       * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
       */
      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty)

      /**
       * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6af039d4f8ed0dd8a79430c288494b7aea540bf320cd40247f8ba956c924827")
      public
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty.Builder.() -> Unit)

      /**
       * @param targetValue Specifies the target utilization. 
       *
       * Some metrics are based on a count instead of a percentage, such as the request count for an
       * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
       * specifies one of these metrics, specify the target utilization as the optimal average request
       * or message count per instance during any one-minute interval.
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.builder()

      /**
       * @param customizedCapacityMetricSpecification The customized capacity metric specification.
       */
      override
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: IResolvable) {
        cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param customizedCapacityMetricSpecification The customized capacity metric specification.
       */
      override
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty) {
        cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification.let(PredictiveScalingCustomizedCapacityMetricProperty::unwrap))
      }

      /**
       * @param customizedCapacityMetricSpecification The customized capacity metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576825e68ad5c44bf88fbc5865ff958e76c17dfcb07ffe704e92d3e00535a5da")
      override
          fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: PredictiveScalingCustomizedCapacityMetricProperty.Builder.() -> Unit):
          Unit =
          customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty(customizedCapacityMetricSpecification))

      /**
       * @param customizedLoadMetricSpecification The customized load metric specification.
       */
      override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param customizedLoadMetricSpecification The customized load metric specification.
       */
      override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification.let(PredictiveScalingCustomizedLoadMetricProperty::unwrap))
      }

      /**
       * @param customizedLoadMetricSpecification The customized load metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c43aaf6eba755c957c78045e5a3615cdbaab0b207ed862c19dfdc2db186a0680")
      override
          fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: PredictiveScalingCustomizedLoadMetricProperty.Builder.() -> Unit):
          Unit =
          customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty(customizedLoadMetricSpecification))

      /**
       * @param customizedScalingMetricSpecification The customized scaling metric specification.
       */
      override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param customizedScalingMetricSpecification The customized scaling metric specification.
       */
      override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification.let(PredictiveScalingCustomizedScalingMetricProperty::unwrap))
      }

      /**
       * @param customizedScalingMetricSpecification The customized scaling metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5bc0decdd0c5a06475fdec6a82987d218c1ab1dcbfdb4d137a053f6414f359af")
      override
          fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: PredictiveScalingCustomizedScalingMetricProperty.Builder.() -> Unit):
          Unit =
          customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty(customizedScalingMetricSpecification))

      /**
       * @param predefinedLoadMetricSpecification The predefined load metric specification.
       */
      override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param predefinedLoadMetricSpecification The predefined load metric specification.
       */
      override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification.let(PredictiveScalingPredefinedLoadMetricProperty::unwrap))
      }

      /**
       * @param predefinedLoadMetricSpecification The predefined load metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1a4be592dea838fd0cf6431d144f8e90aeec0ebce2f64591cd563ff1b8f1c6f")
      override
          fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: PredictiveScalingPredefinedLoadMetricProperty.Builder.() -> Unit):
          Unit =
          predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty(predefinedLoadMetricSpecification))

      /**
       * @param predefinedMetricPairSpecification The predefined metric pair specification from
       * which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to
       * use.
       */
      override
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: IResolvable) {
        cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param predefinedMetricPairSpecification The predefined metric pair specification from
       * which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to
       * use.
       */
      override
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty) {
        cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification.let(PredictiveScalingPredefinedMetricPairProperty::unwrap))
      }

      /**
       * @param predefinedMetricPairSpecification The predefined metric pair specification from
       * which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to
       * use.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bd9691cb9834b6e49475da172e8452248c66494e725217bddac0c76b041f89af")
      override
          fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: PredictiveScalingPredefinedMetricPairProperty.Builder.() -> Unit):
          Unit =
          predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty(predefinedMetricPairSpecification))

      /**
       * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
       */
      override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.let(IResolvable::unwrap))
      }

      /**
       * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
       */
      override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification.let(PredictiveScalingPredefinedScalingMetricProperty::unwrap))
      }

      /**
       * @param predefinedScalingMetricSpecification The predefined scaling metric specification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6af039d4f8ed0dd8a79430c288494b7aea540bf320cd40247f8ba956c924827")
      override
          fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: PredictiveScalingPredefinedScalingMetricProperty.Builder.() -> Unit):
          Unit =
          predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty(predefinedScalingMetricSpecification))

      /**
       * @param targetValue Specifies the target utilization. 
       *
       * Some metrics are based on a count instead of a percentage, such as the request count for an
       * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
       * specifies one of these metrics, specify the target utilization as the optimal average request
       * or message count per instance during any one-minute interval.
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty,
    ) : CdkObject(cdkObject), PredictiveScalingMetricSpecificationProperty {
      /**
       * The customized capacity metric specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-customizedcapacitymetricspecification)
       */
      override fun customizedCapacityMetricSpecification(): Any? =
          unwrap(this).getCustomizedCapacityMetricSpecification()

      /**
       * The customized load metric specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-customizedloadmetricspecification)
       */
      override fun customizedLoadMetricSpecification(): Any? =
          unwrap(this).getCustomizedLoadMetricSpecification()

      /**
       * The customized scaling metric specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-customizedscalingmetricspecification)
       */
      override fun customizedScalingMetricSpecification(): Any? =
          unwrap(this).getCustomizedScalingMetricSpecification()

      /**
       * The predefined load metric specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-predefinedloadmetricspecification)
       */
      override fun predefinedLoadMetricSpecification(): Any? =
          unwrap(this).getPredefinedLoadMetricSpecification()

      /**
       * The predefined metric pair specification from which Amazon EC2 Auto Scaling determines the
       * appropriate scaling metric and load metric to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-predefinedmetricpairspecification)
       */
      override fun predefinedMetricPairSpecification(): Any? =
          unwrap(this).getPredefinedMetricPairSpecification()

      /**
       * The predefined scaling metric specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-predefinedscalingmetricspecification)
       */
      override fun predefinedScalingMetricSpecification(): Any? =
          unwrap(this).getPredefinedScalingMetricSpecification()

      /**
       * Specifies the target utilization.
       *
       *
       * Some metrics are based on a count instead of a percentage, such as the request count for an
       * Application Load Balancer or the number of messages in an SQS queue. If the scaling policy
       * specifies one of these metrics, specify the target utilization as the optimal average request
       * or message count per instance during any one-minute interval.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingmetricspecification.html#cfn-autoscaling-scalingpolicy-predictivescalingmetricspecification-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty):
          PredictiveScalingMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty
    }
  }

  public interface PredictiveScalingCustomizedLoadMetricProperty {
    /**
     * One or more metric data queries to provide the data points for a load metric.
     *
     * Use multiple metric data queries only if you are performing a math expression on returned
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric-metricdataqueries)
     */
    public fun metricDataQueries(): Any

    /**
     * A builder for [PredictiveScalingCustomizedLoadMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * load metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(metricDataQueries: IResolvable)

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * load metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(metricDataQueries: List<Any>)

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * load metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(vararg metricDataQueries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty.builder()

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * load metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
      }

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * load metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries)
      }

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * load metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
          metricDataQueries(metricDataQueries.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingCustomizedLoadMetricProperty {
      /**
       * One or more metric data queries to provide the data points for a load metric.
       *
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingcustomizedloadmetric-metricdataqueries)
       */
      override fun metricDataQueries(): Any = unwrap(this).getMetricDataQueries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingCustomizedLoadMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty):
          PredictiveScalingCustomizedLoadMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingCustomizedLoadMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty
    }
  }

  public interface PredictiveScalingPredefinedMetricPairProperty {
    /**
     * Indicates which metrics to use.
     *
     * There are two different types of metrics for each metric type: one is a load metric and one
     * is a scaling metric. For example, if the metric type is `ASGCPUUtilization` , the Auto Scaling
     * group's total CPU metric is used as the load metric, and the average CPU metric is used for the
     * scaling metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair-predefinedmetrictype)
     */
    public fun predefinedMetricType(): String

    /**
     * A label that uniquely identifies a specific Application Load Balancer target group from which
     * to determine the total and average request count served by your Auto Scaling group.
     *
     * You can't specify a resource label unless the target group is attached to the Auto Scaling
     * group.
     *
     * You create the resource label by appending the final portion of the load balancer ARN and the
     * final portion of the target group ARN into a single value, separated by a forward slash (/). The
     * format of the resource label is:
     *
     * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
     *
     * Where:
     *
     * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
     * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
     * ARN.
     *
     * To find the ARN for an Application Load Balancer, use the
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
     * API operation. To find the ARN for the target group, use the
     * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair-resourcelabel)
     */
    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    /**
     * A builder for [PredictiveScalingPredefinedMetricPairProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param predefinedMetricType Indicates which metrics to use. 
       * There are two different types of metrics for each metric type: one is a load metric and one
       * is a scaling metric. For example, if the metric type is `ASGCPUUtilization` , the Auto Scaling
       * group's total CPU metric is used as the load metric, and the average CPU metric is used for
       * the scaling metric.
       */
      public fun predefinedMetricType(predefinedMetricType: String)

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the total and average request count served by your Auto
       * Scaling group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty.builder()

      /**
       * @param predefinedMetricType Indicates which metrics to use. 
       * There are two different types of metrics for each metric type: one is a load metric and one
       * is a scaling metric. For example, if the metric type is `ASGCPUUtilization` , the Auto Scaling
       * group's total CPU metric is used as the load metric, and the average CPU metric is used for
       * the scaling metric.
       */
      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      /**
       * @param resourceLabel A label that uniquely identifies a specific Application Load Balancer
       * target group from which to determine the total and average request count served by your Auto
       * Scaling group.
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty,
    ) : CdkObject(cdkObject), PredictiveScalingPredefinedMetricPairProperty {
      /**
       * Indicates which metrics to use.
       *
       * There are two different types of metrics for each metric type: one is a load metric and one
       * is a scaling metric. For example, if the metric type is `ASGCPUUtilization` , the Auto Scaling
       * group's total CPU metric is used as the load metric, and the average CPU metric is used for
       * the scaling metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair-predefinedmetrictype)
       */
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      /**
       * A label that uniquely identifies a specific Application Load Balancer target group from
       * which to determine the total and average request count served by your Auto Scaling group.
       *
       * You can't specify a resource label unless the target group is attached to the Auto Scaling
       * group.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair.html#cfn-autoscaling-scalingpolicy-predictivescalingpredefinedmetricpair-resourcelabel)
       */
      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingPredefinedMetricPairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty):
          PredictiveScalingPredefinedMetricPairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingPredefinedMetricPairProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty
    }
  }

  public interface MetricDataQueryProperty {
    /**
     * The math expression to perform on the returned data, if this object is performing a math
     * expression.
     *
     * This expression can use the `Id` of the other metrics to refer to those metrics, and can also
     * use the `Id` of other expressions to use the result of those expressions.
     *
     * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
     * `MetricStat` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * A short name that identifies the object's results in the response.
     *
     * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
     * policy. If you are performing math expressions on this set of data, this name represents that
     * data and can serve as a variable in the mathematical expression. The valid characters are
     * letters, numbers, and underscores. The first character must be a lowercase letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-id)
     */
    public fun id(): String

    /**
     * A human-readable label for this metric or expression.
     *
     * This is especially useful if this is a math expression, so that you know what the value
     * represents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-label)
     */
    public fun label(): String? = unwrap(this).getLabel()

    /**
     * Information about the metric data to return.
     *
     * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
     * `MetricStat` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-metricstat)
     */
    public fun metricStat(): Any? = unwrap(this).getMetricStat()

    /**
     * Indicates whether to return the timestamps and raw data values of this metric.
     *
     * If you use any math expressions, specify `true` for this value for only the final math
     * expression that the metric specification is based on. You must specify `false` for `ReturnData`
     * for all the other metrics and expressions used in the metric specification.
     *
     * If you are only retrieving metrics and not performing any math expressions, do not specify
     * anything for `ReturnData` . This sets it to its default ( `true` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-returndata)
     */
    public fun returnData(): Any? = unwrap(this).getReturnData()

    /**
     * A builder for [MetricDataQueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression The math expression to perform on the returned data, if this object is
       * performing a math expression.
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions.
       *
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      public fun expression(expression: String)

      /**
       * @param id A short name that identifies the object's results in the response. 
       * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
       * policy. If you are performing math expressions on this set of data, this name represents that
       * data and can serve as a variable in the mathematical expression. The valid characters are
       * letters, numbers, and underscores. The first character must be a lowercase letter.
       */
      public fun id(id: String)

      /**
       * @param label A human-readable label for this metric or expression.
       * This is especially useful if this is a math expression, so that you know what the value
       * represents.
       */
      public fun label(label: String)

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      public fun metricStat(metricStat: IResolvable)

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      public fun metricStat(metricStat: MetricStatProperty)

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad7379b19e59aad13eae5a77bc24a5686a03816ddbcf207d55a39aac5ecbc5e")
      public fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit)

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      public fun returnData(returnData: Boolean)

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      public fun returnData(returnData: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty.builder()

      /**
       * @param expression The math expression to perform on the returned data, if this object is
       * performing a math expression.
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions.
       *
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param id A short name that identifies the object's results in the response. 
       * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
       * policy. If you are performing math expressions on this set of data, this name represents that
       * data and can serve as a variable in the mathematical expression. The valid characters are
       * letters, numbers, and underscores. The first character must be a lowercase letter.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param label A human-readable label for this metric or expression.
       * This is especially useful if this is a math expression, so that you know what the value
       * represents.
       */
      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      override fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat.let(IResolvable::unwrap))
      }

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      override fun metricStat(metricStat: MetricStatProperty) {
        cdkBuilder.metricStat(metricStat.let(MetricStatProperty::unwrap))
      }

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad7379b19e59aad13eae5a77bc24a5686a03816ddbcf207d55a39aac5ecbc5e")
      override fun metricStat(metricStat: MetricStatProperty.Builder.() -> Unit): Unit =
          metricStat(MetricStatProperty(metricStat))

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty,
    ) : CdkObject(cdkObject), MetricDataQueryProperty {
      /**
       * The math expression to perform on the returned data, if this object is performing a math
       * expression.
       *
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions.
       *
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * A short name that identifies the object's results in the response.
       *
       * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
       * policy. If you are performing math expressions on this set of data, this name represents that
       * data and can serve as a variable in the mathematical expression. The valid characters are
       * letters, numbers, and underscores. The first character must be a lowercase letter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * A human-readable label for this metric or expression.
       *
       * This is especially useful if this is a math expression, so that you know what the value
       * represents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-label)
       */
      override fun label(): String? = unwrap(this).getLabel()

      /**
       * Information about the metric data to return.
       *
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-metricstat)
       */
      override fun metricStat(): Any? = unwrap(this).getMetricStat()

      /**
       * Indicates whether to return the timestamps and raw data values of this metric.
       *
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdataquery.html#cfn-autoscaling-scalingpolicy-metricdataquery-returndata)
       */
      override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty):
          MetricDataQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDataQueryProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDataQueryProperty
    }
  }

  public interface CustomizedMetricSpecificationProperty {
    /**
     * The dimensions of the metric.
     *
     * Conditional: If you published your metric with dimensions, you must specify the same
     * dimensions in your scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the metric.
     *
     * To get the exact metric name, namespace, and dimensions, inspect the
     * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
     * object that is returned by a call to
     * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-metricname)
     */
    public fun metricName(): String

    /**
     * The namespace of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-namespace)
     */
    public fun namespace(): String

    /**
     * The statistic of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-statistic)
     */
    public fun statistic(): String

    /**
     * The unit of the metric.
     *
     * For a complete list of the units that CloudWatch supports, see the
     * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
     * data type in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [CustomizedMetricSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param metricName The name of the metric. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace of the metric. 
       */
      public fun namespace(namespace: String)

      /**
       * @param statistic The statistic of the metric. 
       */
      public fun statistic(statistic: String)

      /**
       * @param unit The unit of the metric.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder()

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param metricName The name of the metric. 
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace of the metric. 
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param statistic The statistic of the metric. 
       */
      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      /**
       * @param unit The unit of the metric.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty,
    ) : CdkObject(cdkObject), CustomizedMetricSpecificationProperty {
      /**
       * The dimensions of the metric.
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The name of the metric.
       *
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-metricname)
       */
      override fun metricName(): String = unwrap(this).getMetricName()

      /**
       * The namespace of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-namespace)
       */
      override fun namespace(): String = unwrap(this).getNamespace()

      /**
       * The statistic of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-statistic)
       */
      override fun statistic(): String = unwrap(this).getStatistic()

      /**
       * The unit of the metric.
       *
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html#cfn-autoscaling-scalingpolicy-customizedmetricspecification-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomizedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty):
          CustomizedMetricSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizedMetricSpecificationProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
    }
  }

  public interface PredictiveScalingCustomizedScalingMetricProperty {
    /**
     * One or more metric data queries to provide the data points for a scaling metric.
     *
     * Use multiple metric data queries only if you are performing a math expression on returned
     * data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedscalingmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingcustomizedscalingmetric-metricdataqueries)
     */
    public fun metricDataQueries(): Any

    /**
     * A builder for [PredictiveScalingCustomizedScalingMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * scaling metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(metricDataQueries: IResolvable)

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * scaling metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(metricDataQueries: List<Any>)

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * scaling metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      public fun metricDataQueries(vararg metricDataQueries: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty.builder()

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * scaling metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries.let(IResolvable::unwrap))
      }

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * scaling metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(metricDataQueries: List<Any>) {
        cdkBuilder.metricDataQueries(metricDataQueries)
      }

      /**
       * @param metricDataQueries One or more metric data queries to provide the data points for a
       * scaling metric. 
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       */
      override fun metricDataQueries(vararg metricDataQueries: Any): Unit =
          metricDataQueries(metricDataQueries.toList())

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty,
    ) : CdkObject(cdkObject), PredictiveScalingCustomizedScalingMetricProperty {
      /**
       * One or more metric data queries to provide the data points for a scaling metric.
       *
       * Use multiple metric data queries only if you are performing a math expression on returned
       * data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-predictivescalingcustomizedscalingmetric.html#cfn-autoscaling-scalingpolicy-predictivescalingcustomizedscalingmetric-metricdataqueries)
       */
      override fun metricDataQueries(): Any = unwrap(this).getMetricDataQueries()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredictiveScalingCustomizedScalingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty):
          PredictiveScalingCustomizedScalingMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredictiveScalingCustomizedScalingMetricProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty
    }
  }

  public interface MetricDimensionProperty {
    /**
     * The name of the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-name)
     */
    public fun name(): String

    /**
     * The value of the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the dimension. 
       */
      public fun name(name: String)

      /**
       * @param value The value of the dimension. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty.builder()

      /**
       * @param name The name of the dimension. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the dimension. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      /**
       * The name of the dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value of the dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html#cfn-autoscaling-scalingpolicy-metricdimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty):
          MetricDimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.autoscaling.CfnScalingPolicy.MetricDimensionProperty
    }
  }
}
