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
import software.amazon.awscdk.services.appmesh.AccessLog
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualGateway
import software.amazon.awscdk.services.appmesh.VirtualGatewayListener
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class VirtualGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: VirtualGateway.Builder = VirtualGateway.Builder.create(scope, id)

    private val _listeners: MutableList<VirtualGatewayListener> = mutableListOf()

    public fun accessLog(accessLog: AccessLog) {
        cdkBuilder.accessLog(accessLog)
    }

    public fun backendDefaults(block: BackendDefaultsDsl.() -> Unit = {}) {
        val builder = BackendDefaultsDsl()
        builder.apply(block)
        cdkBuilder.backendDefaults(builder.build())
    }

    public fun backendDefaults(backendDefaults: BackendDefaults) {
        cdkBuilder.backendDefaults(backendDefaults)
    }

    public fun listeners(vararg listeners: VirtualGatewayListener) {
        _listeners.addAll(listOf(*listeners))
    }

    public fun listeners(listeners: Collection<VirtualGatewayListener>) {
        _listeners.addAll(listeners)
    }

    public fun mesh(mesh: IMesh) {
        cdkBuilder.mesh(mesh)
    }

    public fun virtualGatewayName(virtualGatewayName: String) {
        cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): VirtualGateway {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        return cdkBuilder.build()
    }
}
