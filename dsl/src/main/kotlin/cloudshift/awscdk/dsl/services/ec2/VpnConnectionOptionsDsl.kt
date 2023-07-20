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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.VpnConnectionOptions
import software.amazon.awscdk.services.ec2.VpnTunnelOption
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class VpnConnectionOptionsDsl {
    private val cdkBuilder: VpnConnectionOptions.Builder = VpnConnectionOptions.builder()

    private val _staticRoutes: MutableList<String> = mutableListOf()

    private val _tunnelOptions: MutableList<VpnTunnelOption> = mutableListOf()

    public fun asn(asn: Number) {
        cdkBuilder.asn(asn)
    }

    public fun ip(ip: String) {
        cdkBuilder.ip(ip)
    }

    public fun staticRoutes(vararg staticRoutes: String) {
        _staticRoutes.addAll(listOf(*staticRoutes))
    }

    public fun staticRoutes(staticRoutes: Collection<String>) {
        _staticRoutes.addAll(staticRoutes)
    }

    public fun tunnelOptions(tunnelOptions: VpnTunnelOptionDsl.() -> Unit) {
        _tunnelOptions.add(VpnTunnelOptionDsl().apply(tunnelOptions).build())
    }

    public fun tunnelOptions(tunnelOptions: Collection<VpnTunnelOption>) {
        _tunnelOptions.addAll(tunnelOptions)
    }

    public fun build(): VpnConnectionOptions {
        if (_staticRoutes.isNotEmpty()) cdkBuilder.staticRoutes(_staticRoutes)
        if (_tunnelOptions.isNotEmpty()) cdkBuilder.tunnelOptions(_tunnelOptions)
        return cdkBuilder.build()
    }
}
