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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.SignalsOptions

/**
 * Customization options for Signal handling.
 *
 * Example:
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // ...
 * .init(CloudFormationInit.fromElements(InitFile.fromString("/etc/my_instance", "This got written
 * during instance startup")))
 * .signals(Signals.waitForAll(SignalsOptions.builder()
 * .timeout(Duration.minutes(10))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class SignalsOptionsDsl {
    private val cdkBuilder: SignalsOptions.Builder = SignalsOptions.builder()

    /**
     * @param minSuccessPercentage The percentage of signals that need to be successful. If this
     *   number is less than 100, a percentage of signals may be failure signals while still
     *   succeeding the creation or update in CloudFormation.
     */
    public fun minSuccessPercentage(minSuccessPercentage: Number) {
        cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    /**
     * @param timeout How long to wait for the signals to be sent. This should reflect how long it
     *   takes your instances to start up (including instance start time and instance initialization
     *   time).
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun build(): SignalsOptions = cdkBuilder.build()
}
