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

package io.cloudshiftdev.awscdkdsl.services.groundstation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnConfig

/**
 * Defines an equivalent isotropically radiated power (EIRP).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * EirpProperty eirpProperty = EirpProperty.builder()
 * .units("units")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-eirp.html)
 */
@CdkDslMarker
public class CfnConfigEirpPropertyDsl {
    private val cdkBuilder: CfnConfig.EirpProperty.Builder = CfnConfig.EirpProperty.builder()

    /** @param units The units of the EIRP. */
    public fun units(units: String) {
        cdkBuilder.units(units)
    }

    /** @param value The value of the EIRP. Valid values are between 20.0 to 50.0 dBW. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnConfig.EirpProperty = cdkBuilder.build()
}
