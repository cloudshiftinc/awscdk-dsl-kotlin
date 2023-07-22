@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnAccount
import software.constructs.Construct

/**
 * Creates an AWS account that is automatically a member of the organization whose credentials made
 * the request.
 *
 * AWS CloudFormation uses the
 * [`CreateAccount`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CreateAccount.html)
 * operation to create accounts. This is an asynchronous request that AWS performs in the background.
 * Because `CreateAccount` operates asynchronously, it can return a successful completion message even
 * though account initialization might still be in progress. You might need to wait a few minutes
 * before you can successfully access the account. To check the status of the request, do one of the
 * following:
 *
 * * Use the `Id` value of the `CreateAccountStatus` response element from the `CreateAccount`
 * operation to provide as a parameter to the
 * [`DescribeCreateAccountStatus`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_DescribeCreateAccountStatus.html)
 * operation.
 * * Check the CloudTrail log for the `CreateAccountResult` event. For information on using
 * CloudTrail with AWS Organizations , see [Logging and monitoring in AWS
 * Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_security_incident-response.html#orgs_cloudtrail-integration)
 * in the *AWS Organizations User Guide.*
 *
 * The user who calls the API to create an account must have the `organizations:CreateAccount`
 * permission. If you enabled all features in the organization, AWS Organizations creates the required
 * service-linked role named `AWSServiceRoleForOrganizations` . For more information, see [AWS
 * Organizations and Service-Linked
 * Roles](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html#orgs_integrate_services-using_slrs)
 * in the *AWS Organizations User Guide* .
 *
 * If the request includes tags, then the requester must have the `organizations:TagResource`
 * permission.
 *
 * AWS Organizations preconfigures the new member account with a role (named
 * `OrganizationAccountAccessRole` by default) that grants users in the management account
 * administrator permissions in the new member account. Principals in the management account can assume
 * the role. AWS Organizations clones the company name and address information for the new account from
 * the organization's management account.
 *
 * For more information about creating accounts, see [Creating an AWS account in Your
 * Organization](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_create.html)
 * in the *AWS Organizations User Guide.*
 *
 * This operation can be called only from the organization's management account.
 *
 * *Deleting Account resources*
 *
 * The default `DeletionPolicy` for resource `AWS::Organizations::Account` is `Retain` . For more
 * information about how AWS CloudFormation deletes resources, see [DeletionPolicy
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
 * .
 *
 *
 * * If you include multiple accounts in a single template, you must use the `DependsOn` attribute
 * on each account resource type so that the accounts are created sequentially. If you create multiple
 * accounts at the same time, Organizations returns an error and the stack operation fails.
 * * You can't modify the following list of `Account` resource parameters using AWS CloudFormation
 * updates.
 * * AccountName
 * * Email
 * * RoleName
 *
 * If you attempt to update the listed parameters, CloudFormation will attempt the update, but you
 * will receive an error message as those updates are not supported from an Organizations management
 * account or a [registered delegated
 * administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
 * account. Both the update and the update roll-back will fail, so you must skip the account resource
 * update. To update parameters `AccountName` and `Email` , you must sign in to the AWS Management
 * Console as the AWS account root user. For more information, see [Modifying the account name, email
 * address, or password for the AWS account root
 * user](https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-update-root-user.html) in
 * the *AWS Account Management Reference Guide* .
 *
 * * When you create an account in an organization using the AWS Organizations console, API, or AWS
 * CLI commands, we don't automatically collect the information required for the account to operate as
 * a standalone account. That includes collecting the payment method and signing the end user license
 * agreement (EULA). If you must remove an account from your organization later, you can do so only
 * after you provide the missing information. Follow the steps at [To leave an organization as a member
 * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_remove.html#leave-without-all-info)
 * in the *AWS Organizations User Guide* .
 * * When you create an account in an organization using AWS CloudFormation , you can't specify a
 * value for the `CreateAccount` operation parameter `IamUserAccessToBilling` . The default value for
 * parameter `IamUserAccessToBilling` is `ALLOW` , and IAM users and roles with the required
 * permissions can access billing information for the new account.
 * * If you get an exception that indicates `DescribeCreateAccountStatus returns IN_PROGRESS state
 * before time out` . You must check the account creation status using the
 * [`DescribeCreateAccountStatus`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_DescribeCreateAccountStatus.html)
 * operation. If the account state returns as `SUCCEEDED` , you can import the account into AWS
 * CloudFormation management using [`resource
 * import`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/resource-import.html) .
 * * If you get an exception that indicates you have exceeded your account quota for the
 * organization, you can request an increase by using the [Service Quotas
 * console](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html) .
 * * If you get an exception that indicates the operation failed because your organization is still
 * initializing, wait one hour and then try again. If the error persists, contact [AWS
 * Support](https://docs.aws.amazon.com/support/home#/) .
 * * We don't recommend that you use the `CreateAccount` operation to create multiple temporary
 * accounts. You can close accounts using the
 * [`CloseAccount`](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CloseAccount.html)
 * operation or from the AWS Organizations console in the organization's management account. For
 * information on the requirements and process for closing an account, see [Closing an AWS
 * account](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_close.html)
 * in the *AWS Organizations User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.organizations.*;
 * CfnAccount cfnAccount = CfnAccount.Builder.create(this, "MyCfnAccount")
 * .accountName("accountName")
 * .email("email")
 * // the properties below are optional
 * .parentIds(List.of("parentIds"))
 * .roleName("roleName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html)
 */
@CdkDslMarker
public class CfnAccountDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccount.Builder = CfnAccount.Builder.create(scope, id)

  private val _parentIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The account name given to the account when it was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-accountname)
   * @param accountName The account name given to the account when it was created. 
   */
  public fun accountName(accountName: String) {
    cdkBuilder.accountName(accountName)
  }

  /**
   * The email address associated with the AWS account.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for this
   * parameter is a string of characters that represents a standard internet email address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-email)
   * @param email The email address associated with the AWS account. 
   */
  public fun email(email: String) {
    cdkBuilder.email(email)
  }

  /**
   * The unique identifier (ID) of the root or organizational unit (OU) that you want to create the
   * new account in.
   *
   * If you don't specify this parameter, the `ParentId` defaults to the root ID.
   *
   * This parameter only accepts a string array with one string value.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
   * ID string requires one of the following:
   *
   * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
   * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
   * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
   * second "-" dash and from 8 to 32 additional lowercase letters or digits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-parentids)
   * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
   * want to create the new account in. 
   */
  public fun parentIds(vararg parentIds: String) {
    _parentIds.addAll(listOf(*parentIds))
  }

  /**
   * The unique identifier (ID) of the root or organizational unit (OU) that you want to create the
   * new account in.
   *
   * If you don't specify this parameter, the `ParentId` defaults to the root ID.
   *
   * This parameter only accepts a string array with one string value.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
   * ID string requires one of the following:
   *
   * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
   * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
   * lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a
   * second "-" dash and from 8 to 32 additional lowercase letters or digits.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-parentids)
   * @param parentIds The unique identifier (ID) of the root or organizational unit (OU) that you
   * want to create the new account in. 
   */
  public fun parentIds(parentIds: Collection<String>) {
    _parentIds.addAll(parentIds)
  }

  /**
   * The name of an IAM role that AWS Organizations automatically preconfigures in the new member
   * account.
   *
   * This role trusts the management account, allowing users in the management account to assume the
   * role, as permitted by the management account administrator. The role has administrator permissions
   * in the new member account.
   *
   * If you don't specify this parameter, the role name defaults to `OrganizationAccountAccessRole`
   * .
   *
   * For more information about how to use this role to access the member account, see the following
   * links:
   *
   * * [Accessing and Administering the Member Accounts in Your
   * Organization](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts_access.html#orgs_manage_accounts_create-cross-account-role)
   * in the *AWS Organizations User Guide*
   * * Steps 2 and 3 in [Tutorial: Delegate Access Across AWS accounts Using IAM
   * Roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/tutorial_cross-account-with-roles.html) in
   * the *IAM User Guide*
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
   * to validate this parameter. The pattern can include uppercase letters, lowercase letters, digits
   * with no spaces, and any of the following characters: =,.&#64;-
   *
   * Default: - "OrganizationAccountAccessRole"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-rolename)
   * @param roleName The name of an IAM role that AWS Organizations automatically preconfigures in
   * the new member account. 
   */
  public fun roleName(roleName: String) {
    cdkBuilder.roleName(roleName)
  }

  /**
   * A list of tags that you want to attach to the newly created account.
   *
   * For each tag in the list, you must specify both a tag key and a value. You can set the value to
   * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
   * AWS Organizations User Guide.
   *
   *
   * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for an
   * account, then the entire request fails and the account is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-tags)
   * @param tags A list of tags that you want to attach to the newly created account. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of tags that you want to attach to the newly created account.
   *
   * For each tag in the list, you must specify both a tag key and a value. You can set the value to
   * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
   * AWS Organizations User Guide.
   *
   *
   * If any one of the tags is not valid or if you exceed the maximum allowed number of tags for an
   * account, then the entire request fails and the account is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-account.html#cfn-organizations-account-tags)
   * @param tags A list of tags that you want to attach to the newly created account. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnAccount {
    if(_parentIds.isNotEmpty()) cdkBuilder.parentIds(_parentIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
