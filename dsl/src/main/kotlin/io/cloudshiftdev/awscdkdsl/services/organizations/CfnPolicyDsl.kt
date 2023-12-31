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

package io.cloudshiftdev.awscdkdsl.services.organizations

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnPolicy
import software.constructs.Construct

/**
 * Creates a policy of a specified type that you can attach to a root, an organizational unit (OU),
 * or an individual AWS account .
 *
 * For more information about policies and their use, see
 * [Managing AWS Organizations policies](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html)
 * .
 *
 * If the request includes tags, then the requester must have the `organizations:TagResource`
 * permission.
 *
 * This operation can be called only from the organization's management account.
 *
 * Before you can create a policy of a given type, you must first
 * [enable that policy type](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_enable-disable.html)
 * in your organization.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.organizations.*;
 * Object content;
 * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
 * .content(content)
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetIds(List.of("targetIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html)
 */
@CdkDslMarker
public class CfnPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPolicy.Builder = CfnPolicy.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _targetIds: MutableList<String> = mutableListOf()

    /**
     * The policy text content. You can specify the policy content as a JSON object or a JSON
     * string.
     *
     * When you specify the policy content as a JSON string, you can't perform drift detection on
     * the CloudFormation stack. For this reason, we recommend specifying the policy content as a
     * JSON object instead.
     *
     * The text that you supply must adhere to the rules of the policy type you specify in the
     * `Type` parameter. The following AWS Organizations quotas are enforced for the maximum size of
     * a policy document:
     * * Service control policies: 5,120 bytes *(not characters)*
     * * AI services opt-out policies: 2,500 characters
     * * Backup policies: 10,000 characters
     * * Tag policies: 10,000 characters
     *
     * For more information about Organizations service quotas, see
     * [Quotas for AWS Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     * in the *AWS Organizations User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-content)
     *
     * @param content The policy text content. You can specify the policy content as a JSON object
     *   or a JSON string.
     */
    public fun content(content: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(content)
        cdkBuilder.content(builder.map)
    }

    /**
     * The policy text content. You can specify the policy content as a JSON object or a JSON
     * string.
     *
     * When you specify the policy content as a JSON string, you can't perform drift detection on
     * the CloudFormation stack. For this reason, we recommend specifying the policy content as a
     * JSON object instead.
     *
     * The text that you supply must adhere to the rules of the policy type you specify in the
     * `Type` parameter. The following AWS Organizations quotas are enforced for the maximum size of
     * a policy document:
     * * Service control policies: 5,120 bytes *(not characters)*
     * * AI services opt-out policies: 2,500 characters
     * * Backup policies: 10,000 characters
     * * Tag policies: 10,000 characters
     *
     * For more information about Organizations service quotas, see
     * [Quotas for AWS Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_reference_limits.html)
     * in the *AWS Organizations User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-content)
     *
     * @param content The policy text content. You can specify the policy content as a JSON object
     *   or a JSON string.
     */
    public fun content(content: Any) {
        cdkBuilder.content(content)
    }

    /**
     * Human readable description of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-description)
     *
     * @param description Human readable description of the policy.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Name of the policy.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     * to validate this parameter is a string of any of the characters in the ASCII character range.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-name)
     *
     * @param name Name of the policy.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A list of tags that you want to attach to the newly created policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html)
     * in the AWS Organizations User Guide.
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
     * then the entire request fails and the policy is not created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-tags)
     *
     * @param tags A list of tags that you want to attach to the newly created policy.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags that you want to attach to the newly created policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html)
     * in the AWS Organizations User Guide.
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for a policy,
     * then the entire request fails and the policy is not created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-tags)
     *
     * @param tags A list of tags that you want to attach to the newly created policy.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * List of unique identifiers (IDs) of the root, OU, or account that you want to attach the
     * policy to.
     *
     * You can get the ID by calling the
     * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html)
     * ,
     * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
     * , or
     * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
     * operations. If you don't specify this parameter, the policy is created but not attached to
     * any organization resource.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
     * ID string requires one of the following:
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     *   digits.
     * * *Account* - A string that consists of exactly 12 digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     *   lowercase letters or digits (the ID of the root that the OU is in). This string is followed
     *   by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-targetids)
     *
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     *   to attach the policy to.
     */
    public fun targetIds(vararg targetIds: String) {
        _targetIds.addAll(listOf(*targetIds))
    }

    /**
     * List of unique identifiers (IDs) of the root, OU, or account that you want to attach the
     * policy to.
     *
     * You can get the ID by calling the
     * [ListRoots](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html)
     * ,
     * [ListOrganizationalUnitsForParent](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListOrganizationalUnitsForParent.html)
     * , or
     * [ListAccounts](https://docs.aws.amazon.com/organizations/latest/APIReference/API_ListAccounts.html)
     * operations. If you don't specify this parameter, the policy is created but not attached to
     * any organization resource.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a target
     * ID string requires one of the following:
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     *   digits.
     * * *Account* - A string that consists of exactly 12 digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     *   lowercase letters or digits (the ID of the root that the OU is in). This string is followed
     *   by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-targetids)
     *
     * @param targetIds List of unique identifiers (IDs) of the root, OU, or account that you want
     *   to attach the policy to.
     */
    public fun targetIds(targetIds: Collection<String>) {
        _targetIds.addAll(targetIds)
    }

    /**
     * The type of policy to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-policy.html#cfn-organizations-policy-type)
     *
     * @param type The type of policy to create.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPolicy {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targetIds.isNotEmpty()) cdkBuilder.targetIds(_targetIds)
        return cdkBuilder.build()
    }
}
