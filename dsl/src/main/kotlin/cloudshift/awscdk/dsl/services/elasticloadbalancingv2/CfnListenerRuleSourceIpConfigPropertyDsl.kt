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
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnListenerRuleSourceIpConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.SourceIpConfigProperty.Builder =
        CfnListenerRule.SourceIpConfigProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnListenerRule.SourceIpConfigProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
