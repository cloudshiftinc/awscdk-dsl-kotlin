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

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.iam.PolicyDocument
import software.amazon.awscdk.services.iam.Role
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class RoleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Role.Builder = Role.Builder.create(scope, id)

    private val _externalIds: MutableList<String> = mutableListOf()

    private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

    public fun assumedBy(assumedBy: IPrincipal) {
        cdkBuilder.assumedBy(assumedBy)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun externalIds(vararg externalIds: String) {
        _externalIds.addAll(listOf(*externalIds))
    }

    public fun externalIds(externalIds: Collection<String>) {
        _externalIds.addAll(externalIds)
    }

    public fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
        cdkBuilder.inlinePolicies(inlinePolicies)
    }

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
        _managedPolicies.addAll(listOf(*managedPolicies))
    }

    public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
        _managedPolicies.addAll(managedPolicies)
    }

    public fun maxSessionDuration(maxSessionDuration: Duration) {
        cdkBuilder.maxSessionDuration(maxSessionDuration)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    public fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
    }

    public fun build(): Role {
        if (_externalIds.isNotEmpty()) cdkBuilder.externalIds(_externalIds)
        if (_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
        return cdkBuilder.build()
    }
}
