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

package io.cloudshiftdev.awscdkdsl.services.appmesh

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents a duration of time.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * DurationProperty durationProperty = DurationProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-duration.html)
 */
@CdkDslMarker
public class CfnVirtualNodeDurationPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.DurationProperty.Builder =
        CfnVirtualNode.DurationProperty.builder()

    /** @param unit A unit of time. */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    /** @param value A number of time units. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnVirtualNode.DurationProperty = cdkBuilder.build()
}
