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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps

/**
 * Properties for defining a `CfnDedicatedIpPool`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnDedicatedIpPoolProps cfnDedicatedIpPoolProps = CfnDedicatedIpPoolProps.builder()
 * .poolName("poolName")
 * .scalingMode("scalingMode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-dedicatedippool.html)
 */
@CdkDslMarker
public class CfnDedicatedIpPoolPropsDsl {
    private val cdkBuilder: CfnDedicatedIpPoolProps.Builder = CfnDedicatedIpPoolProps.builder()

    /** @param poolName The name of the dedicated IP pool that the IP address is associated with. */
    public fun poolName(poolName: String) {
        cdkBuilder.poolName(poolName)
    }

    /**
     * @param scalingMode The type of scaling mode. The following options are available:
     * * `STANDARD` - The customer controls which IPs are part of the dedicated IP pool.
     * * `MANAGED` - The reputation and number of IPs are automatically managed by Amazon SES .
     *
     * The `STANDARD` option is selected by default if no value is specified.
     *
     * Updating *ScalingMode* doesn't require a replacement if you're updating its value from
     * `STANDARD` to `MANAGED` . However, updating *ScalingMode* from `MANAGED` to `STANDARD` is not
     * supported.
     */
    public fun scalingMode(scalingMode: String) {
        cdkBuilder.scalingMode(scalingMode)
    }

    public fun build(): CfnDedicatedIpPoolProps = cdkBuilder.build()
}
