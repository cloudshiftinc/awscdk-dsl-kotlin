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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.ElbHealthCheckOptions

/**
 * ELB Heath check options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.autoscaling.*;
 * ElbHealthCheckOptions elbHealthCheckOptions = ElbHealthCheckOptions.builder()
 * .grace(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class ElbHealthCheckOptionsDsl {
    private val cdkBuilder: ElbHealthCheckOptions.Builder = ElbHealthCheckOptions.builder()

    /**
     * @param grace Specified the time Auto Scaling waits before checking the health status of an
     *   EC2 instance that has come into service. This option is required for ELB health checks.
     */
    public fun grace(grace: Duration) {
        cdkBuilder.grace(grace)
    }

    public fun build(): ElbHealthCheckOptions = cdkBuilder.build()
}
