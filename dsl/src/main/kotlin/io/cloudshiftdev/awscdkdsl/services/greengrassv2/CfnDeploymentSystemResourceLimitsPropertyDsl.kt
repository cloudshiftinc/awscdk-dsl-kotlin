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

package io.cloudshiftdev.awscdkdsl.services.greengrassv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

/**
 * Contains information about system resource limits that the software applies to a component's
 * processes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrassv2.*;
 * SystemResourceLimitsProperty systemResourceLimitsProperty =
 * SystemResourceLimitsProperty.builder()
 * .cpus(123)
 * .memory(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrassv2-deployment-systemresourcelimits.html)
 */
@CdkDslMarker
public class CfnDeploymentSystemResourceLimitsPropertyDsl {
    private val cdkBuilder: CfnDeployment.SystemResourceLimitsProperty.Builder =
        CfnDeployment.SystemResourceLimitsProperty.builder()

    /**
     * @param cpus The maximum amount of CPU time that a component's processes can use on the core
     *   device. A core device's total CPU time is equivalent to the device's number of CPU cores.
     *   For example, on a core device with 4 CPU cores, you can set this value to 2 to limit the
     *   component's processes to 50 percent usage of each CPU core. On a device with 1 CPU core,
     *   you can set this value to 0.25 to limit the component's processes to 25 percent usage of
     *   the CPU. If you set this value to a number greater than the number of CPU cores, the AWS
     *   IoT Greengrass Core software doesn't limit the component's CPU usage.
     */
    public fun cpus(cpus: Number) {
        cdkBuilder.cpus(cpus)
    }

    /**
     * @param memory The maximum amount of RAM, expressed in kilobytes, that a component's processes
     *   can use on the core device. For more information, see
     *   [Configure system resource limits for components](https://docs.aws.amazon.com/greengrass/v2/developerguide/configure-greengrass-core-v2.html#configure-component-system-resource-limits)
     *   .
     */
    public fun memory(memory: Number) {
        cdkBuilder.memory(memory)
    }

    public fun build(): CfnDeployment.SystemResourceLimitsProperty = cdkBuilder.build()
}
