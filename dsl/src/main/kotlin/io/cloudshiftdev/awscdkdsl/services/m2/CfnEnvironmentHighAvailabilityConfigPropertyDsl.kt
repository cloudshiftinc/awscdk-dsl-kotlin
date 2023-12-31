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

package io.cloudshiftdev.awscdkdsl.services.m2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.m2.CfnEnvironment

/**
 * Defines the details of a high availability configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.m2.*;
 * HighAvailabilityConfigProperty highAvailabilityConfigProperty =
 * HighAvailabilityConfigProperty.builder()
 * .desiredCapacity(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-environment-highavailabilityconfig.html)
 */
@CdkDslMarker
public class CfnEnvironmentHighAvailabilityConfigPropertyDsl {
    private val cdkBuilder: CfnEnvironment.HighAvailabilityConfigProperty.Builder =
        CfnEnvironment.HighAvailabilityConfigProperty.builder()

    /**
     * @param desiredCapacity The number of instances in a high availability configuration. The
     *   minimum possible value is 1 and the maximum is 100.
     */
    public fun desiredCapacity(desiredCapacity: Number) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    public fun build(): CfnEnvironment.HighAvailabilityConfigProperty = cdkBuilder.build()
}
