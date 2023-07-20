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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCEndpointService
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPCEndpointServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCEndpointService.Builder =
        CfnVPCEndpointService.Builder.create(scope, id)

    private val _gatewayLoadBalancerArns: MutableList<String> = mutableListOf()

    private val _networkLoadBalancerArns: MutableList<String> = mutableListOf()

    public fun acceptanceRequired(acceptanceRequired: Boolean) {
        cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    public fun acceptanceRequired(acceptanceRequired: IResolvable) {
        cdkBuilder.acceptanceRequired(acceptanceRequired)
    }

    public fun contributorInsightsEnabled(contributorInsightsEnabled: Boolean) {
        cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    public fun contributorInsightsEnabled(contributorInsightsEnabled: IResolvable) {
        cdkBuilder.contributorInsightsEnabled(contributorInsightsEnabled)
    }

    public fun gatewayLoadBalancerArns(vararg gatewayLoadBalancerArns: String) {
        _gatewayLoadBalancerArns.addAll(listOf(*gatewayLoadBalancerArns))
    }

    public fun gatewayLoadBalancerArns(gatewayLoadBalancerArns: Collection<String>) {
        _gatewayLoadBalancerArns.addAll(gatewayLoadBalancerArns)
    }

    public fun networkLoadBalancerArns(vararg networkLoadBalancerArns: String) {
        _networkLoadBalancerArns.addAll(listOf(*networkLoadBalancerArns))
    }

    public fun networkLoadBalancerArns(networkLoadBalancerArns: Collection<String>) {
        _networkLoadBalancerArns.addAll(networkLoadBalancerArns)
    }

    public fun payerResponsibility(payerResponsibility: String) {
        cdkBuilder.payerResponsibility(payerResponsibility)
    }

    public fun build(): CfnVPCEndpointService {
        if (_gatewayLoadBalancerArns.isNotEmpty()) {
            cdkBuilder.gatewayLoadBalancerArns(_gatewayLoadBalancerArns)
        }
        if (_networkLoadBalancerArns.isNotEmpty()) {
            cdkBuilder.networkLoadBalancerArns(_networkLoadBalancerArns)
        }
        return cdkBuilder.build()
    }
}
