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

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDocumentClassifierVpcConfigPropertyDsl {
    private val cdkBuilder: CfnDocumentClassifier.VpcConfigProperty.Builder =
        CfnDocumentClassifier.VpcConfigProperty.builder()

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

    public fun build(): CfnDocumentClassifier.VpcConfigProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        return cdkBuilder.build()
    }
}
