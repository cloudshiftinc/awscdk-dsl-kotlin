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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnUser
import software.constructs.Construct

/**
 * Creates a new IAM user for your AWS account .
 *
 * For information about quotas for the number of IAM users you can create, see
 * [IAM and AWS STS quotas](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html)
 * in the *IAM User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnUser cfnUser = CfnUser.Builder.create(this, "MyCfnUser")
 * .groups(List.of("groups"))
 * .loginProfile(LoginProfileProperty.builder()
 * .password("password")
 * // the properties below are optional
 * .passwordResetRequired(false)
 * .build())
 * .managedPolicyArns(List.of("managedPolicyArns"))
 * .path("path")
 * .permissionsBoundary("permissionsBoundary")
 * .policies(List.of(PolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .policyName("policyName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userName("userName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html)
 */
@CdkDslMarker
public class CfnUserDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

    private val _groups: MutableList<String> = mutableListOf()

    private val _managedPolicyArns: MutableList<String> = mutableListOf()

    private val _policies: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list of group names to which you want to add the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
     *
     * @param groups A list of group names to which you want to add the user.
     */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /**
     * A list of group names to which you want to add the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-groups)
     *
     * @param groups A list of group names to which you want to add the user.
     */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    /**
     * Creates a password for the specified IAM user.
     *
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html)
     * to update your own existing password in the *My Security Credentials* page in the AWS
     * Management Console .
     *
     * For more information about managing passwords, see
     * [Managing passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-loginprofile)
     *
     * @param loginProfile Creates a password for the specified IAM user.
     */
    public fun loginProfile(loginProfile: IResolvable) {
        cdkBuilder.loginProfile(loginProfile)
    }

    /**
     * Creates a password for the specified IAM user.
     *
     * A password allows an IAM user to access AWS services through the AWS Management Console .
     *
     * You can use the AWS CLI , the AWS API, or the *Users* page in the IAM console to create a
     * password for any IAM user. Use
     * [ChangePassword](https://docs.aws.amazon.com/IAM/latest/APIReference/API_ChangePassword.html)
     * to update your own existing password in the *My Security Credentials* page in the AWS
     * Management Console .
     *
     * For more information about managing passwords, see
     * [Managing passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-loginprofile)
     *
     * @param loginProfile Creates a password for the specified IAM user.
     */
    public fun loginProfile(loginProfile: CfnUser.LoginProfileProperty) {
        cdkBuilder.loginProfile(loginProfile)
    }

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the user.
     *
     * For more information about ARNs, see
     * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     * in the *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
     *
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     *   that you want to attach to the user.
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String) {
        _managedPolicyArns.addAll(listOf(*managedPolicyArns))
    }

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the user.
     *
     * For more information about ARNs, see
     * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     * in the *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-managedpolicyarns)
     *
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     *   that you want to attach to the user.
     */
    public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
        _managedPolicyArns.addAll(managedPolicyArns)
    }

    /**
     * The path for the user name.
     *
     * For more information about paths, see
     * [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in
     * the *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and
     * end with forward slashes. In addition, it can contain any ASCII character from the ! (
     * `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation characters,
     * digits, and upper and lowercased letters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-path)
     *
     * @param path The path for the user name.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * The ARN of the managed policy that is used to set the permissions boundary for the user.
     *
     * A permissions boundary policy defines the maximum permissions that identity-based policies
     * can grant to an entity, but does not grant permissions. Permissions boundaries do not define
     * the maximum permissions that a resource-based policy can grant to an entity. To learn more,
     * see
     * [Permissions boundaries for IAM entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
     * in the *IAM User Guide* .
     *
     * For more information about policy types, see
     * [Policy types](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policy-types)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-permissionsboundary)
     *
     * @param permissionsBoundary The ARN of the managed policy that is used to set the permissions
     *   boundary for the user.
     */
    public fun permissionsBoundary(permissionsBoundary: String) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user.
     *
     * To view AWS::IAM::User snippets, see
     * [Declaring an IAM User Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-policies)
     *
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM user.
     */
    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user.
     *
     * To view AWS::IAM::User snippets, see
     * [Declaring an IAM User Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-policies)
     *
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM user.
     */
    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM user.
     *
     * To view AWS::IAM::User snippets, see
     * [Declaring an IAM User Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-user)
     * .
     *
     * The name of each policy for a role, user, or group must be unique. If you don't choose unique
     * names, updates to the IAM identity will fail.
     *
     * For information about limits on the number of inline policies that you can embed in a user,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-policies)
     *
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM user.
     */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    /**
     * A list of tags that you want to attach to the new user.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-tags)
     *
     * @param tags A list of tags that you want to attach to the new user.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags that you want to attach to the new user.
     *
     * Each tag consists of a key name and an associated value. For more information about tagging,
     * see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     * the *IAM User Guide* .
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-tags)
     *
     * @param tags A list of tags that you want to attach to the new user.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the user to create. Do not include the path in this value.
     *
     * This parameter allows (per its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-. The user name must be unique
     * within the account. User names are not distinguished by case. For example, you cannot create
     * users named both "John" and "john".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the user name.
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see
     * [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create
     * a Region-specific name, as in the following example: `{"Fn::Join":
     * ["", [{"Ref": "AWS::Region"}, {"Ref": "MyResourceName"}]]}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-user.html#cfn-iam-user-username)
     *
     * @param userName The name of the user to create. Do not include the path in this value.
     */
    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnUser {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
