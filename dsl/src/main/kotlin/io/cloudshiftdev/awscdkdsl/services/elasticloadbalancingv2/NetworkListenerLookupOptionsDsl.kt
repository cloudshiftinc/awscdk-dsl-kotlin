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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol

/**
 * Options for looking up a network listener.
 *
 * Example:
 * ```
 * INetworkListener listener = NetworkListener.fromLookup(this, "ALBListener",
 * NetworkListenerLookupOptions.builder()
 * .loadBalancerTags(Map.of(
 * "Cluster", "MyClusterName"))
 * .listenerProtocol(Protocol.TCP)
 * .listenerPort(12345)
 * .build());
 * ```
 */
@CdkDslMarker
public class NetworkListenerLookupOptionsDsl {
    private val cdkBuilder: NetworkListenerLookupOptions.Builder =
        NetworkListenerLookupOptions.builder()

    /** @param listenerPort Filter listeners by listener port. */
    public fun listenerPort(listenerPort: Number) {
        cdkBuilder.listenerPort(listenerPort)
    }

    /** @param listenerProtocol Protocol of the listener port. */
    public fun listenerProtocol(listenerProtocol: Protocol) {
        cdkBuilder.listenerProtocol(listenerProtocol)
    }

    /** @param loadBalancerArn Filter listeners by associated load balancer arn. */
    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    /** @param loadBalancerTags Filter listeners by associated load balancer tags. */
    public fun loadBalancerTags(loadBalancerTags: Map<String, String>) {
        cdkBuilder.loadBalancerTags(loadBalancerTags)
    }

    public fun build(): NetworkListenerLookupOptions = cdkBuilder.build()
}
