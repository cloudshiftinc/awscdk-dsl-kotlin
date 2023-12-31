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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import software.constructs.Construct

/**
 * The `AWS::AutoScaling::WarmPool` resource creates a pool of pre-initialized EC2 instances that
 * sits alongside the Auto Scaling group.
 *
 * Whenever your application needs to scale out, the Auto Scaling group can draw on the warm pool to
 * meet its new desired capacity.
 *
 * When you create a warm pool, you can define a minimum size. When your Auto Scaling group scales
 * out and the size of the warm pool shrinks, Amazon EC2 Auto Scaling launches new instances into
 * the warm pool to maintain its minimum size.
 *
 * For more information, see
 * [Warm pools for Amazon EC2 Auto Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * CloudFormation supports the `UpdatePolicy` attribute for Auto Scaling groups. During an update,
 * if `UpdatePolicy` is set to `AutoScalingRollingUpdate` , CloudFormation replaces `InService`
 * instances only. Instances in the warm pool are not replaced. The difference in which instances
 * are replaced can potentially result in different instance configurations after the stack update
 * completes. If `UpdatePolicy` is set to `AutoScalingReplacingUpdate` , you do not encounter this
 * issue because CloudFormation replaces both the Auto Scaling group and the warm pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * CfnWarmPool cfnWarmPool = CfnWarmPool.Builder.create(this, "MyCfnWarmPool")
 * .autoScalingGroupName("autoScalingGroupName")
 * // the properties below are optional
 * .instanceReusePolicy(InstanceReusePolicyProperty.builder()
 * .reuseOnScaleIn(false)
 * .build())
 * .maxGroupPreparedCapacity(123)
 * .minSize(123)
 * .poolState("poolState")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html)
 */
@CdkDslMarker
public class CfnWarmPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWarmPool.Builder = CfnWarmPool.Builder.create(scope, id)

    /**
     * The name of the Auto Scaling group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-autoscalinggroupname)
     *
     * @param autoScalingGroupName The name of the Auto Scaling group.
     */
    public fun autoScalingGroupName(autoScalingGroupName: String) {
        cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     *
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     *   returned to the warm pool on scale in.
     */
    public fun instanceReusePolicy(instanceReusePolicy: IResolvable) {
        cdkBuilder.instanceReusePolicy(instanceReusePolicy)
    }

    /**
     * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on
     * scale in.
     *
     * The default is to terminate instances in the Auto Scaling group when the group scales in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-instancereusepolicy)
     *
     * @param instanceReusePolicy Indicates whether instances in the Auto Scaling group can be
     *   returned to the warm pool on scale in.
     */
    public fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty) {
        cdkBuilder.instanceReusePolicy(instanceReusePolicy)
    }

    /**
     * Specifies the maximum number of instances that are allowed to be in the warm pool or in any
     * state except `Terminated` for the Auto Scaling group.
     *
     * This is an optional property. Specify it only if you do not want the warm pool size to be
     * determined by the difference between the group's maximum capacity and its desired capacity.
     *
     * If a value for `MaxGroupPreparedCapacity` is not specified, Amazon EC2 Auto Scaling launches
     * and maintains the difference between the group's maximum capacity and its desired capacity.
     * If you specify a value for `MaxGroupPreparedCapacity` , Amazon EC2 Auto Scaling uses the
     * difference between the `MaxGroupPreparedCapacity` and the desired capacity instead.
     *
     * The size of the warm pool is dynamic. Only when `MaxGroupPreparedCapacity` and `MinSize` are
     * set to the same value does the warm pool have an absolute size.
     *
     * If the desired capacity of the Auto Scaling group is higher than the
     * `MaxGroupPreparedCapacity` , the capacity of the warm pool is 0, unless you specify a value
     * for `MinSize` . To remove a value that you previously set, include the property but specify
     * -1 for the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-maxgrouppreparedcapacity)
     *
     * @param maxGroupPreparedCapacity Specifies the maximum number of instances that are allowed to
     *   be in the warm pool or in any state except `Terminated` for the Auto Scaling group.
     */
    public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
        cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
    }

    /**
     * Specifies the minimum number of instances to maintain in the warm pool.
     *
     * This helps you to ensure that there is always a certain number of warmed instances available
     * to handle traffic spikes. Defaults to 0 if not specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-minsize)
     *
     * @param minSize Specifies the minimum number of instances to maintain in the warm pool.
     */
    public fun minSize(minSize: Number) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * Sets the instance state to transition to after the lifecycle actions are complete.
     *
     * Default is `Stopped` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-warmpool.html#cfn-autoscaling-warmpool-poolstate)
     *
     * @param poolState Sets the instance state to transition to after the lifecycle actions are
     *   complete.
     */
    public fun poolState(poolState: String) {
        cdkBuilder.poolState(poolState)
    }

    public fun build(): CfnWarmPool = cdkBuilder.build()
}
