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

package io.cloudshiftdev.awscdkdsl.services.ram

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ram.CfnPermission
import software.constructs.Construct

/**
 * Creates a customer managed permission for a specified resource type that you can attach to
 * resource shares.
 *
 * It is created in the AWS Region in which you call the operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ram.*;
 * Object policyTemplate;
 * CfnPermission cfnPermission = CfnPermission.Builder.create(this, "MyCfnPermission")
 * .name("name")
 * .policyTemplate(policyTemplate)
 * .resourceType("resourceType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html)
 */
@CdkDslMarker
public class CfnPermissionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPermission.Builder = CfnPermission.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Specifies the name of the customer managed permission.
     *
     * The name must be unique within the AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-name)
     *
     * @param name Specifies the name of the customer managed permission.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A string in JSON format string that contains the following elements of a resource-based
     * policy:.
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     *   list must contain only actions that are supported by the specified resource type. For a
     *   list of all actions supported by each resource type, see
     *   [Actions, resources, and condition keys for AWS services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     *   in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     *   user attempts an action for that action to be allowed. For more information about the
     *   Condition element, see
     *   [IAM policies: Condition element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     *   in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource
     * that you are sharing. The `Principal` comes from the list of identities added to the resource
     * share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-policytemplate)
     *
     * @param policyTemplate A string in JSON format string that contains the following elements of
     *   a resource-based policy:.
     */
    public fun policyTemplate(policyTemplate: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyTemplate)
        cdkBuilder.policyTemplate(builder.map)
    }

    /**
     * A string in JSON format string that contains the following elements of a resource-based
     * policy:.
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     *   list must contain only actions that are supported by the specified resource type. For a
     *   list of all actions supported by each resource type, see
     *   [Actions, resources, and condition keys for AWS services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     *   in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     *   user attempts an action for that action to be allowed. For more information about the
     *   Condition element, see
     *   [IAM policies: Condition element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     *   in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource
     * that you are sharing. The `Principal` comes from the list of identities added to the resource
     * share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-policytemplate)
     *
     * @param policyTemplate A string in JSON format string that contains the following elements of
     *   a resource-based policy:.
     */
    public fun policyTemplate(policyTemplate: Any) {
        cdkBuilder.policyTemplate(policyTemplate)
    }

    /**
     * Specifies the name of the resource type that this customer managed permission applies to.
     *
     * The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string `ec2:subnet` . To see
     * the list of valid values for this parameter, query the
     * [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-resourcetype)
     *
     * @param resourceType Specifies the name of the resource type that this customer managed
     *   permission applies to.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
     *
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     *   permission.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
     *
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     *   permission.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPermission {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
