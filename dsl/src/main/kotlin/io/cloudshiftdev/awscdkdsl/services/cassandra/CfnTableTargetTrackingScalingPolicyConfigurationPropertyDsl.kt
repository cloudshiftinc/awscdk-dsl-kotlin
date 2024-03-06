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

package io.cloudshiftdev.awscdkdsl.services.cassandra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * Amazon Keyspaces supports the `target tracking` auto scaling policy for a provisioned table.
 *
 * This policy scales a table based on the ratio of consumed to provisioned capacity. The auto
 * scaling target is a percentage of the provisioned capacity of the table.
 * * `targetTrackingScalingPolicyConfiguration` : To define the target tracking policy, you must
 *   define the target value.
 * * `targetValue` : The target utilization rate of the table. Amazon Keyspaces auto scaling ensures
 *   that the ratio of consumed capacity to provisioned capacity stays at or near this value. You
 *   define `targetValue` as a percentage. A `double` between 20 and 90. (Required)
 * * `disableScaleIn` : A `boolean` that specifies if `scale-in` is disabled or enabled for the
 *   table. This parameter is disabled by default. To turn on `scale-in` , set the `boolean` value
 *   to `FALSE` . This means that capacity for a table can be automatically scaled down on your
 *   behalf. (Optional)
 * * `scaleInCooldown` : A cooldown period in seconds between scaling activities that lets the table
 *   stabilize before another scale in activity starts. If no value is provided, the default is 0.
 *   (Optional)
 * * `scaleOutCooldown` : A cooldown period in seconds between scaling activities that lets the
 *   table stabilize before another scale out activity starts. If no value is provided, the default
 *   is 0. (Optional)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * TargetTrackingScalingPolicyConfigurationProperty targetTrackingScalingPolicyConfigurationProperty
 * = TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html)
 */
@CdkDslMarker
public class CfnTableTargetTrackingScalingPolicyConfigurationPropertyDsl {
    private val cdkBuilder: CfnTable.TargetTrackingScalingPolicyConfigurationProperty.Builder =
        CfnTable.TargetTrackingScalingPolicyConfigurationProperty.builder()

    /**
     * @param disableScaleIn Specifies if `scale-in` is enabled. When auto scaling automatically
     *   decreases capacity for a table, the table *scales in* . When scaling policies are set, they
     *   can't scale in the table lower than its minimum capacity.
     */
    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param disableScaleIn Specifies if `scale-in` is enabled. When auto scaling automatically
     *   decreases capacity for a table, the table *scales in* . When scaling policies are set, they
     *   can't scale in the table lower than its minimum capacity.
     */
    public fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    /**
     * @param scaleInCooldown Specifies a `scale-in` cool down period. A cooldown period in seconds
     *   between scaling activities that lets the table stabilize before another scaling activity
     *   starts.
     */
    public fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    /**
     * @param scaleOutCooldown Specifies a scale out cool down period. A cooldown period in seconds
     *   between scaling activities that lets the table stabilize before another scaling activity
     *   starts.
     */
    public fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    /**
     * @param targetValue Specifies the target value for the target tracking auto scaling policy.
     *   Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this
     *   target utilization rate, and then back down when it falls below the target. This ensures
     *   that the ratio of consumed capacity to provisioned capacity stays at or near this value.
     *   You define `targetValue` as a percentage. An `integer` between 20 and 90.
     */
    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): CfnTable.TargetTrackingScalingPolicyConfigurationProperty =
        cdkBuilder.build()
}
