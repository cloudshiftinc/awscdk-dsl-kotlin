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
import software.amazon.awscdk.services.elasticloadbalancingv2.AlpnPolicy
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import software.amazon.awscdk.services.elasticloadbalancingv2.SslPolicy
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class BaseNetworkListenerPropsDsl {
    private val cdkBuilder: BaseNetworkListenerProps.Builder = BaseNetworkListenerProps.builder()

    private val _certificates: MutableList<IListenerCertificate> = mutableListOf()

    private val _defaultTargetGroups: MutableList<INetworkTargetGroup> = mutableListOf()

    public fun alpnPolicy(alpnPolicy: AlpnPolicy) {
        cdkBuilder.alpnPolicy(alpnPolicy)
    }

    public fun certificates(vararg certificates: IListenerCertificate) {
        _certificates.addAll(listOf(*certificates))
    }

    public fun certificates(certificates: Collection<IListenerCertificate>) {
        _certificates.addAll(certificates)
    }

    public fun defaultAction(defaultAction: NetworkListenerAction) {
        cdkBuilder.defaultAction(defaultAction)
    }

    public fun defaultTargetGroups(vararg defaultTargetGroups: INetworkTargetGroup) {
        _defaultTargetGroups.addAll(listOf(*defaultTargetGroups))
    }

    public fun defaultTargetGroups(defaultTargetGroups: Collection<INetworkTargetGroup>) {
        _defaultTargetGroups.addAll(defaultTargetGroups)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun sslPolicy(sslPolicy: SslPolicy) {
        cdkBuilder.sslPolicy(sslPolicy)
    }

    public fun build(): BaseNetworkListenerProps {
        if (_certificates.isNotEmpty()) cdkBuilder.certificates(_certificates)
        if (_defaultTargetGroups.isNotEmpty()) cdkBuilder.defaultTargetGroups(_defaultTargetGroups)
        return cdkBuilder.build()
    }
}
