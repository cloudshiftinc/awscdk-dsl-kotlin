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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelExplainabilityJobDefinitionVpcConfigPropertyDsl {
    private val cdkBuilder: CfnModelExplainabilityJobDefinition.VpcConfigProperty.Builder =
        CfnModelExplainabilityJobDefinition.VpcConfigProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    public fun build(): CfnModelExplainabilityJobDefinition.VpcConfigProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
