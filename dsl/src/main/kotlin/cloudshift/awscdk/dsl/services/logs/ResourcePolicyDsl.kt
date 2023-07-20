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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.logs.ResourcePolicy
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ResourcePolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ResourcePolicy.Builder = ResourcePolicy.Builder.create(scope, id)

    private val _policyStatements: MutableList<PolicyStatement> = mutableListOf()

    public fun policyStatements(policyStatements: PolicyStatementDsl.() -> Unit) {
        _policyStatements.add(PolicyStatementDsl().apply(policyStatements).build())
    }

    public fun policyStatements(policyStatements: Collection<PolicyStatement>) {
        _policyStatements.addAll(policyStatements)
    }

    public fun resourcePolicyName(resourcePolicyName: String) {
        cdkBuilder.resourcePolicyName(resourcePolicyName)
    }

    public fun build(): ResourcePolicy {
        if (_policyStatements.isNotEmpty()) cdkBuilder.policyStatements(_policyStatements)
        return cdkBuilder.build()
    }
}
