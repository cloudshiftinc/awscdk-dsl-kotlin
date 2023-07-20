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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.iam.CfnManagedPolicy
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnManagedPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnManagedPolicy.Builder = CfnManagedPolicy.Builder.create(scope, id)

    private val _groups: MutableList<String> = mutableListOf()

    private val _roles: MutableList<String> = mutableListOf()

    private val _users: MutableList<String> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    public fun managedPolicyName(managedPolicyName: String) {
        cdkBuilder.managedPolicyName(managedPolicyName)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.map)
    }

    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun roles(vararg roles: String) {
        _roles.addAll(listOf(*roles))
    }

    public fun roles(roles: Collection<String>) {
        _roles.addAll(roles)
    }

    public fun users(vararg users: String) {
        _users.addAll(listOf(*users))
    }

    public fun users(users: Collection<String>) {
        _users.addAll(users)
    }

    public fun build(): CfnManagedPolicy {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
