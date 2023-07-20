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

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ce.CfnAnomalyMonitor
import kotlin.String

@CdkDslMarker
public class CfnAnomalyMonitorResourceTagPropertyDsl {
    private val cdkBuilder: CfnAnomalyMonitor.ResourceTagProperty.Builder =
        CfnAnomalyMonitor.ResourceTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnomalyMonitor.ResourceTagProperty = cdkBuilder.build()
}
