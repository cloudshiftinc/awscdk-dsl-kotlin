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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class NetworkListenerLookupOptionsDsl {
    private val cdkBuilder: NetworkListenerLookupOptions.Builder =
        NetworkListenerLookupOptions.builder()

    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    public fun listenerProtocol(listenerProtocol: Protocol) {
        cdkBuilder.listenerProtocol(listenerProtocol)
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
        cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build(): NetworkListenerLookupOptions = cdkBuilder.build()
}
