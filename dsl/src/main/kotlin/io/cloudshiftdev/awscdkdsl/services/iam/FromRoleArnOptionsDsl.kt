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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.iam.FromRoleArnOptions

/**
 * Options allowing customizing the behavior of `Role.fromRoleArn`.
 *
 * Example:
 * ```
 * IRole role = Role.fromRoleArn(this, "Role", "arn:aws:iam::123456789012:role/MyExistingRole",
 * FromRoleArnOptions.builder()
 * // Set 'mutable' to 'false' to use the role as-is and prevent adding new
 * // policies to it. The default is 'true', which means the role may be
 * // modified as part of the deployment.
 * .mutable(false)
 * .build());
 * ```
 */
@CdkDslMarker
public class FromRoleArnOptionsDsl {
    private val cdkBuilder: FromRoleArnOptions.Builder = FromRoleArnOptions.builder()

    /**
     * @param addGrantsToResources For immutable roles: add grants to resources instead of dropping
     *   them. If this is `false` or not specified, grant permissions added to this role are
     *   ignored. It is your own responsibility to make sure the role has the required permissions.
     *
     * If this is `true`, any grant permissions will be added to the resource instead.
     */
    public fun addGrantsToResources(addGrantsToResources: Boolean) {
        cdkBuilder.addGrantsToResources(addGrantsToResources)
    }

    /**
     * @param defaultPolicyName Any policies created by this role will use this value as their ID,
     *   if specified. Specify this if importing the same role in multiple stacks, and granting it
     *   different permissions in at least two stacks. If this is not specified (or if the same name
     *   is specified in more than one stack), a CloudFormation issue will result in the policy
     *   created in whichever stack is deployed last overwriting the policies created by the others.
     */
    public fun defaultPolicyName(defaultPolicyName: String) {
        cdkBuilder.defaultPolicyName(defaultPolicyName)
    }

    /**
     * @param mutable Whether the imported role can be modified by attaching policy resources to it.
     */
    public fun mutable(mutable: Boolean) {
        cdkBuilder.mutable(mutable)
    }

    public fun build(): FromRoleArnOptions = cdkBuilder.build()
}
