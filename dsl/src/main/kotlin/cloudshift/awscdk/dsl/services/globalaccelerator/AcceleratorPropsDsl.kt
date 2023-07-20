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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class AcceleratorPropsDsl {
    private val cdkBuilder: AcceleratorProps.Builder = AcceleratorProps.builder()

    public fun acceleratorName(acceleratorName: String) {
        cdkBuilder.acceleratorName(acceleratorName)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): AcceleratorProps = cdkBuilder.build()
}
