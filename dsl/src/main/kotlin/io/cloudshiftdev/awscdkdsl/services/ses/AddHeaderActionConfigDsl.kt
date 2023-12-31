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
import software.amazon.awscdk.services.ses.AddHeaderActionConfig

/**
 * AddHeaderAction configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * AddHeaderActionConfig addHeaderActionConfig = AddHeaderActionConfig.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build();
 * ```
 */
@CdkDslMarker
public class AddHeaderActionConfigDsl {
    private val cdkBuilder: AddHeaderActionConfig.Builder = AddHeaderActionConfig.builder()

    /** @param headerName The name of the header that you want to add to the incoming message. */
    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    /** @param headerValue The content that you want to include in the header. */
    public fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
    }

    public fun build(): AddHeaderActionConfig = cdkBuilder.build()
}
