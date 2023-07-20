@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnInput
import kotlin.String

@CdkDslMarker
public class CfnInputInputDestinationRequestPropertyDsl {
    private val cdkBuilder: CfnInput.InputDestinationRequestProperty.Builder =
        CfnInput.InputDestinationRequestProperty.builder()

    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): CfnInput.InputDestinationRequestProperty = cdkBuilder.build()
}
