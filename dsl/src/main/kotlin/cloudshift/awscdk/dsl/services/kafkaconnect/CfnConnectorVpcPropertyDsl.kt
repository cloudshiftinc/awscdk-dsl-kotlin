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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConnectorVpcPropertyDsl {
    private val cdkBuilder: CfnConnector.VpcProperty.Builder = CfnConnector.VpcProperty.builder()

    private val _securityGroups: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    public fun securityGroups(vararg securityGroups: String) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<String>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    public fun build(): CfnConnector.VpcProperty {
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
