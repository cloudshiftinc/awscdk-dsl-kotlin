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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.constructs.Construct

/**
 * The `AWS::CloudFormation::StackSet` enables you to provision stacks into AWS accounts and across
 * Regions by using a single CloudFormation template.
 *
 * In the stack set, you specify the template to use, in addition to any parameters and capabilities
 * that the template requires.
 *
 * Run deployments to nested StackSets from the parent stack, not directly through the StackSet API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object managedExecution;
 * CfnStackSet cfnStackSet = CfnStackSet.Builder.create(this, "MyCfnStackSet")
 * .permissionModel("permissionModel")
 * .stackSetName("stackSetName")
 * // the properties below are optional
 * .administrationRoleArn("administrationRoleArn")
 * .autoDeployment(AutoDeploymentProperty.builder()
 * .enabled(false)
 * .retainStacksOnAccountRemoval(false)
 * .build())
 * .callAs("callAs")
 * .capabilities(List.of("capabilities"))
 * .description("description")
 * .executionRoleName("executionRoleName")
 * .managedExecution(managedExecution)
 * .operationPreferences(OperationPreferencesProperty.builder()
 * .failureToleranceCount(123)
 * .failureTolerancePercentage(123)
 * .maxConcurrentCount(123)
 * .maxConcurrentPercentage(123)
 * .regionConcurrencyType("regionConcurrencyType")
 * .regionOrder(List.of("regionOrder"))
 * .build())
 * .parameters(List.of(ParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .stackInstancesGroup(List.of(StackInstancesProperty.builder()
 * .deploymentTargets(DeploymentTargetsProperty.builder()
 * .accountFilterType("accountFilterType")
 * .accounts(List.of("accounts"))
 * .accountsUrl("accountsUrl")
 * .organizationalUnitIds(List.of("organizationalUnitIds"))
 * .build())
 * .regions(List.of("regions"))
 * // the properties below are optional
 * .parameterOverrides(List.of(ParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateBody("templateBody")
 * .templateUrl("templateUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html)
 */
@CdkDslMarker
public class CfnStackSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStackSet.Builder = CfnStackSet.Builder.create(scope, id)

    private val _capabilities: MutableList<String> = mutableListOf()

    private val _parameters: MutableList<Any> = mutableListOf()

    private val _stackInstancesGroup: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Number (ARN) of the IAM role to use to create this stack set.
     *
     * Specify an IAM role only if you are using customized administrator roles to control which
     * users or groups can manage specific stack sets within the same administrator account.
     *
     * Use customized administrator roles to control which users or groups can manage specific stack
     * sets within the same administrator account. For more information, see
     * [Prerequisites: Granting Permissions for Stack Set Operations](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * *Minimum* : `20`
     *
     * *Maximum* : `2048`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-administrationrolearn)
     *
     * @param administrationRoleArn The Amazon Resource Number (ARN) of the IAM role to use to
     *   create this stack set.
     */
    public fun administrationRoleArn(administrationRoleArn: String) {
        cdkBuilder.administrationRoleArn(administrationRoleArn)
    }

    /**
     * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
     * Organizations accounts that are added to a target organization or organizational unit (OU).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     *
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     *   automatically deploys to AWS Organizations accounts that are added to a target organization
     *   or organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    /**
     * [ `Service-managed` permissions] Describes whether StackSets automatically deploys to AWS
     * Organizations accounts that are added to a target organization or organizational unit (OU).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-autodeployment)
     *
     * @param autoDeployment [ `Service-managed` permissions] Describes whether StackSets
     *   automatically deploys to AWS Organizations accounts that are added to a target organization
     *   or organizational unit (OU).
     */
    public fun autoDeployment(autoDeployment: IResolvable) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    /**
     * [Service-managed permissions] Specifies whether you are acting as an account administrator in
     * the organization's management account or as a delegated administrator in a member account.
     *
     * By default, `SELF` is specified. Use `SELF` for stack sets with self-managed permissions.
     * * To create a stack set with service-managed permissions while signed in to the management
     *   account, specify `SELF` .
     * * To create a stack set with service-managed permissions while signed in to a delegated
     *   administrator account, specify `DELEGATED_ADMIN` .
     *
     * Your AWS account must be registered as a delegated admin in the management account. For more
     * information, see
     * [Register a delegated administrator](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-orgs-delegated-admin.html)
     * in the *AWS CloudFormation User Guide* .
     *
     * Stack sets with service-managed permissions are created in the management account, including
     * stack sets that are created by delegated administrators.
     *
     * *Valid Values* : `SELF` | `DELEGATED_ADMIN`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-callas)
     *
     * @param callAs [Service-managed permissions] Specifies whether you are acting as an account
     *   administrator in the organization's management account or as a delegated administrator in a
     *   member account.
     */
    public fun callAs(callAs: String) {
        cdkBuilder.callAs(callAs)
    }

    /**
     * The capabilities that are allowed in the stack set.
     *
     * Some stack set templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For
     * more information, see
     * [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
     *
     * @param capabilities The capabilities that are allowed in the stack set.
     */
    public fun capabilities(vararg capabilities: String) {
        _capabilities.addAll(listOf(*capabilities))
    }

    /**
     * The capabilities that are allowed in the stack set.
     *
     * Some stack set templates might include resources that can affect permissions in your AWS
     * account —for example, by creating new AWS Identity and Access Management ( IAM ) users. For
     * more information, see
     * [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#capabilities)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-capabilities)
     *
     * @param capabilities The capabilities that are allowed in the stack set.
     */
    public fun capabilities(capabilities: Collection<String>) {
        _capabilities.addAll(capabilities)
    }

    /**
     * A description of the stack set.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `1024`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-description)
     *
     * @param description A description of the stack set.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the IAM execution role to use to create the stack set.
     *
     * If you don't specify an execution role, AWS CloudFormation uses the
     * `AWSCloudFormationStackSetExecutionRole` role for the stack set operation.
     *
     * *Minimum* : `1`
     *
     * *Maximum* : `64`
     *
     * *Pattern* : `[a-zA-Z_0-9+=,.&#64;-]+`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-executionrolename)
     *
     * @param executionRoleName The name of the IAM execution role to use to create the stack set.
     */
    public fun executionRoleName(executionRoleName: String) {
        cdkBuilder.executionRoleName(executionRoleName)
    }

    /**
     * Describes whether StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations.
     *
     * When active, StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations. After conflicting operations finish, StackSets starts queued
     * operations in request order.
     *
     * If there are already running or queued operations, StackSets queues all incoming operations
     * even if they are non-conflicting.
     *
     * You can't modify your stack set's execution configuration while there are running or queued
     * operations for that stack set.
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-managedexecution)
     *
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     *   concurrently and queues conflicting operations.
     */
    public fun managedExecution(managedExecution: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(managedExecution)
        cdkBuilder.managedExecution(builder.map)
    }

    /**
     * Describes whether StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations.
     *
     * When active, StackSets performs non-conflicting operations concurrently and queues
     * conflicting operations. After conflicting operations finish, StackSets starts queued
     * operations in request order.
     *
     * If there are already running or queued operations, StackSets queues all incoming operations
     * even if they are non-conflicting.
     *
     * You can't modify your stack set's execution configuration while there are running or queued
     * operations for that stack set.
     *
     * When inactive (default), StackSets performs one operation at a time in request order.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-managedexecution)
     *
     * @param managedExecution Describes whether StackSets performs non-conflicting operations
     *   concurrently and queues conflicting operations.
     */
    public fun managedExecution(managedExecution: Any) {
        cdkBuilder.managedExecution(managedExecution)
    }

    /**
     * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     *
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     *   performs a stack set operation.
     */
    public fun operationPreferences(
        operationPreferences: CfnStackSet.OperationPreferencesProperty
    ) {
        cdkBuilder.operationPreferences(operationPreferences)
    }

    /**
     * The user-specified preferences for how AWS CloudFormation performs a stack set operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-operationpreferences)
     *
     * @param operationPreferences The user-specified preferences for how AWS CloudFormation
     *   performs a stack set operation.
     */
    public fun operationPreferences(operationPreferences: IResolvable) {
        cdkBuilder.operationPreferences(operationPreferences)
    }

    /**
     * The input parameters for the stack set template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     *
     * @param parameters The input parameters for the stack set template.
     */
    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    /**
     * The input parameters for the stack set template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     *
     * @param parameters The input parameters for the stack set template.
     */
    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    /**
     * The input parameters for the stack set template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-parameters)
     *
     * @param parameters The input parameters for the stack set template.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * Describes how the IAM roles required for stack set operations are created.
     * * With `SELF_MANAGED` permissions, you must create the administrator and execution roles
     *   required to deploy to target accounts. For more information, see
     *   [Grant Self-Managed Stack Set Permissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs-self-managed.html)
     *   .
     * * With `SERVICE_MANAGED` permissions, StackSets automatically creates the IAM roles required
     *   to deploy to accounts managed by AWS Organizations .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-permissionmodel)
     *
     * @param permissionModel Describes how the IAM roles required for stack set operations are
     *   created.
     */
    public fun permissionModel(permissionModel: String) {
        cdkBuilder.permissionModel(permissionModel)
    }

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     *
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     *   accounts and Regions.
     */
    public fun stackInstancesGroup(vararg stackInstancesGroup: Any) {
        _stackInstancesGroup.addAll(listOf(*stackInstancesGroup))
    }

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     *
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     *   accounts and Regions.
     */
    public fun stackInstancesGroup(stackInstancesGroup: Collection<Any>) {
        _stackInstancesGroup.addAll(stackInstancesGroup)
    }

    /**
     * A group of stack instances with parameters in some specific accounts and Regions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stackinstancesgroup)
     *
     * @param stackInstancesGroup A group of stack instances with parameters in some specific
     *   accounts and Regions.
     */
    public fun stackInstancesGroup(stackInstancesGroup: IResolvable) {
        cdkBuilder.stackInstancesGroup(stackInstancesGroup)
    }

    /**
     * The name to associate with the stack set.
     *
     * The name must be unique in the Region where you create your stack set.
     *
     * The `StackSetName` property is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-stacksetname)
     *
     * @param stackSetName The name to associate with the stack set.
     */
    public fun stackSetName(stackSetName: String) {
        cdkBuilder.stackSetName(stackSetName)
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If
     * you specify an empty value, AWS CloudFormation removes all associated tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
     *
     * @param tags Key-value pairs to associate with this stack.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to supported resources in the stack. You can
     * specify a maximum number of 50 tags.
     *
     * If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If
     * you specify an empty value, AWS CloudFormation removes all associated tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-tags)
     *
     * @param tags Key-value pairs to associate with this stack.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The structure that contains the template body, with a minimum length of 1 byte and a maximum
     * length of 51,200 bytes.
     *
     * You must include either `TemplateURL` or `TemplateBody` in a StackSet, but you can't use
     * both. Dynamic references in the `TemplateBody` may not work correctly in all cases. It's
     * recommended to pass templates containing dynamic references through `TemplateUrl` instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templatebody)
     *
     * @param templateBody The structure that contains the template body, with a minimum length of 1
     *   byte and a maximum length of 51,200 bytes.
     */
    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    /**
     * Location of file containing the template body.
     *
     * The URL must point to a template that's located in an Amazon S3 bucket or a Systems Manager
     * document. For more information, go to
     * [Template Anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)
     * in the AWS CloudFormation User Guide.
     *
     * Conditional: You must specify only one of the following parameters: `TemplateBody` ,
     * `TemplateURL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stackset.html#cfn-cloudformation-stackset-templateurl)
     *
     * @param templateUrl Location of file containing the template body.
     */
    public fun templateUrl(templateUrl: String) {
        cdkBuilder.templateUrl(templateUrl)
    }

    public fun build(): CfnStackSet {
        if (_capabilities.isNotEmpty()) cdkBuilder.capabilities(_capabilities)
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        if (_stackInstancesGroup.isNotEmpty()) cdkBuilder.stackInstancesGroup(_stackInstancesGroup)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
