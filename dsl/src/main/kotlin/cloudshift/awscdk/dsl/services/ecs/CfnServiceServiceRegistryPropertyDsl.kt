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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CfnService
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnServiceServiceRegistryPropertyDsl {
    private val cdkBuilder: CfnService.ServiceRegistryProperty.Builder =
        CfnService.ServiceRegistryProperty.builder()

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun registryArn(registryArn: String) {
        cdkBuilder.registryArn(registryArn)
    }

    public fun build(): CfnService.ServiceRegistryProperty = cdkBuilder.build()
}
