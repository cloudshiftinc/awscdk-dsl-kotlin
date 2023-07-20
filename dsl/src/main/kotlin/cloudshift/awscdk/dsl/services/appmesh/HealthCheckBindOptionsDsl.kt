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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.HealthCheckBindOptions
import kotlin.Number

@CdkDslMarker
public class HealthCheckBindOptionsDsl {
    private val cdkBuilder: HealthCheckBindOptions.Builder = HealthCheckBindOptions.builder()

    public fun defaultPort(defaultPort: Number) {
        cdkBuilder.defaultPort(defaultPort)
    }

    public fun build(): HealthCheckBindOptions = cdkBuilder.build()
}
