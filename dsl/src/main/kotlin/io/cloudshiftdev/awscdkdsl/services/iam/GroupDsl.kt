@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.Group
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.constructs.Construct

/**
 * An IAM Group (collection of IAM users) lets you specify permissions for multiple users, which can
 * make it easier to manage permissions for those users.
 *
 * Example:
 * ```
 * User user = new User(this, "MyUser"); // or User.fromUserName(this, 'User', 'johnsmith');
 * Group group = new Group(this, "MyGroup"); // or Group.fromGroupArn(this, 'Group',
 * 'arn:aws:iam::account-id:group/group-name');
 * user.addToGroup(group);
 * // or
 * group.addUser(user);
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_groups.html)
 */
@CdkDslMarker
public class GroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Group.Builder = Group.Builder.create(scope, id)

    private val _managedPolicies: MutableList<IManagedPolicy> = mutableListOf()

    /**
     * A name for the IAM group.
     *
     * For valid values, see the GroupName parameter for the CreateGroup action in the IAM API
     * Reference. If you don't specify a name, AWS CloudFormation generates a unique physical ID and
     * uses that ID for the group name.
     *
     * If you specify a name, you must specify the CAPABILITY_NAMED_IAM value to acknowledge your
     * template's capabilities. For more information, see Acknowledging IAM Resources in AWS
     * CloudFormation Templates.
     *
     * Default: Generated by CloudFormation (recommended)
     *
     * @param groupName A name for the IAM group.
     */
    public fun groupName(groupName: String) {
        cdkBuilder.groupName(groupName)
    }

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role.
     */
    public fun managedPolicies(vararg managedPolicies: IManagedPolicy) {
        _managedPolicies.addAll(listOf(*managedPolicies))
    }

    /**
     * A list of managed policies associated with this role.
     *
     * You can add managed policies later using
     * `addManagedPolicy(ManagedPolicy.fromAwsManagedPolicyName(policyName))`.
     *
     * Default: - No managed policies.
     *
     * @param managedPolicies A list of managed policies associated with this role.
     */
    public fun managedPolicies(managedPolicies: Collection<IManagedPolicy>) {
        _managedPolicies.addAll(managedPolicies)
    }

    /**
     * The path to the group.
     *
     * For more information about paths, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html">IAM
     * Identifiers</a> in the IAM User Guide.
     *
     * Default: /
     *
     * @param path The path to the group.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): Group {
        if (_managedPolicies.isNotEmpty()) cdkBuilder.managedPolicies(_managedPolicies)
        return cdkBuilder.build()
    }
}