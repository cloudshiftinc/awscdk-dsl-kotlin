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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnSpotFleet

/**
 * The minimum and maximum amount of total local storage, in GB.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * TotalLocalStorageGBRequestProperty totalLocalStorageGBRequestProperty =
 * TotalLocalStorageGBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-totallocalstoragegbrequest.html)
 */
@CdkDslMarker
public class CfnSpotFleetTotalLocalStorageGBRequestPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.TotalLocalStorageGBRequestProperty.Builder =
        CfnSpotFleet.TotalLocalStorageGBRequestProperty.builder()

    /**
     * @param max The maximum amount of total local storage, in GB. To specify no maximum limit,
     *   omit this parameter.
     */
    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    /**
     * @param min The minimum amount of total local storage, in GB. To specify no minimum limit,
     *   omit this parameter.
     */
    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnSpotFleet.TotalLocalStorageGBRequestProperty = cdkBuilder.build()
}
