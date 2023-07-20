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

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLoadBalancerPoliciesPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.PoliciesProperty.Builder =
        CfnLoadBalancer.PoliciesProperty.builder()

    private val _attributes: MutableList<Any> = mutableListOf()

    private val _instancePorts: MutableList<String> = mutableListOf()

    private val _loadBalancerPorts: MutableList<String> = mutableListOf()

    public fun attributes(vararg attributes: Any) {
        _attributes.addAll(listOf(*attributes))
    }

    public fun attributes(attributes: Collection<Any>) {
        _attributes.addAll(attributes)
    }

    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    public fun instancePorts(vararg instancePorts: String) {
        _instancePorts.addAll(listOf(*instancePorts))
    }

    public fun instancePorts(instancePorts: Collection<String>) {
        _instancePorts.addAll(instancePorts)
    }

    public fun loadBalancerPorts(vararg loadBalancerPorts: String) {
        _loadBalancerPorts.addAll(listOf(*loadBalancerPorts))
    }

    public fun loadBalancerPorts(loadBalancerPorts: Collection<String>) {
        _loadBalancerPorts.addAll(loadBalancerPorts)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    public fun build(): CfnLoadBalancer.PoliciesProperty {
        if (_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
        if (_instancePorts.isNotEmpty()) cdkBuilder.instancePorts(_instancePorts)
        if (_loadBalancerPorts.isNotEmpty()) cdkBuilder.loadBalancerPorts(_loadBalancerPorts)
        return cdkBuilder.build()
    }
}
