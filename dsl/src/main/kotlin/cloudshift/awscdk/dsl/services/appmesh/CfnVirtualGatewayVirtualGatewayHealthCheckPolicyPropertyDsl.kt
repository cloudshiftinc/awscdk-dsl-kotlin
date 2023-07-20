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
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl {
    private val cdkBuilder: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.Builder =
        CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty.builder()

    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    public fun intervalMillis(intervalMillis: Number) {
        cdkBuilder.intervalMillis(intervalMillis)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun timeoutMillis(timeoutMillis: Number) {
        cdkBuilder.timeoutMillis(timeoutMillis)
    }

    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty = cdkBuilder.build()
}
