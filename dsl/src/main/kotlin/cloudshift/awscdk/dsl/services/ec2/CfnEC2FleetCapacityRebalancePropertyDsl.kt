@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

/**
 * The Spot Instance replacement strategy to use when Amazon EC2 emits a rebalance notification
 * signal that your Spot Instance is at an elevated risk of being interrupted.
 *
 * For more information, see [Capacity
 * rebalancing](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-capacity-rebalance.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CapacityRebalanceProperty capacityRebalanceProperty = CapacityRebalanceProperty.builder()
 * .replacementStrategy("replacementStrategy")
 * .terminationDelay(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityrebalance.html)
 */
@CdkDslMarker
public class CfnEC2FleetCapacityRebalancePropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.CapacityRebalanceProperty.Builder =
      CfnEC2Fleet.CapacityRebalanceProperty.builder()

  /**
   * @param replacementStrategy The replacement strategy to use. Only available for fleets of type
   * `maintain` .
   * `launch` - EC2 Fleet launches a replacement Spot Instance when a rebalance notification is
   * emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances
   * that receive a rebalance notification. You can terminate the old instances, or you can leave them
   * running. You are charged for all instances while they are running.
   *
   * `launch-before-terminate` - EC2 Fleet launches a replacement Spot Instance when a rebalance
   * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that
   * you specify (in `TerminationDelay` ), terminates the instances that received a rebalance
   * notification.
   */
  public fun replacementStrategy(replacementStrategy: String) {
    cdkBuilder.replacementStrategy(replacementStrategy)
  }

  /**
   * @param terminationDelay The amount of time (in seconds) that Amazon EC2 waits before
   * terminating the old Spot Instance after launching a new replacement Spot Instance.
   * Required when `ReplacementStrategy` is set to `launch-before-terminate` .
   *
   * Not valid when `ReplacementStrategy` is set to `launch` .
   *
   * Valid values: Minimum value of `120` seconds. Maximum value of `7200` seconds.
   */
  public fun terminationDelay(terminationDelay: Number) {
    cdkBuilder.terminationDelay(terminationDelay)
  }

  public fun build(): CfnEC2Fleet.CapacityRebalanceProperty = cdkBuilder.build()
}
