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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnStack
import software.constructs.Construct

/**
 * The `AWS::CloudFormation::Stack` resource nests a stack as a resource in a top-level template.
 *
 * You can add output values from a nested stack within the containing template. You use the
 * [GetAtt](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/intrinsic-function-reference-getatt.html)
 * function with the nested stack's logical name and the name of the output value in the nested
 * stack in the format `Outputs. *NestedStackOutputName*` .
 *
 * We strongly recommend that updates to nested stacks are run from the parent stack.
 *
 * When you apply template changes to update a top-level stack, CloudFormation updates the top-level
 * stack and initiates an update to its nested stacks. CloudFormation updates the resources of
 * modified nested stacks, but doesn't update the resources of unmodified nested stacks. For more
 * information, see
 * [CloudFormation stack updates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html)
 * .
 *
 * You must acknowledge IAM capabilities for nested stacks that contain IAM resources. Also, verify
 * that you have cancel update stack permissions, which is required if an update rolls back. For
 * more information about IAM and CloudFormation , see
 * [Controlling access with AWS Identity and Access Management](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html)
 * . &gt; A subset of `AWS::CloudFormation::Stack` resource type properties listed below are
 * available to customers using AWS CloudFormation , AWS CDK , and AWS Cloud Control API to
 * configure.
 * * `NotificationARNs`
 * * `Parameters`
 * * `Tags`
 * * `TemplateURL`
 * * `TimeoutInMinutes`
 *
 * These properties can be configured only when using AWS Cloud Control API . This is because the
 * below properties are set by the parent stack, and thus cannot be configured using AWS
 * CloudFormation or AWS CDK but only AWS Cloud Control API .
 * * `Capabilities`
 * * `Description`
 * * `DisableRollback`
 * * `EnableTerminationProtection`
 * * `RoleARN`
 * * `StackName`
 * * `StackPolicyBody`
 * * `StackPolicyURL`
 * * `StackStatusReason`
 * * `TemplateBody`
 *
 * Customers that configure `AWS::CloudFormation::Stack` using AWS CloudFormation and AWS CDK can do
 * so for nesting a CloudFormation stack as a resource in their top-level template.
 *
 * These read-only properties can be accessed only when using AWS Cloud Control API .
 * * `ChangeSetId`
 * * `CreationTime`
 * * `LastUpdateTime`
 * * `Outputs`
 * * `ParentId`
 * * `RootId`
 * * `StackId`
 * * `StackStatus`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnStack cfnStack = CfnStack.Builder.create(this, "MyCfnStack")
 * .notificationArns(List.of("notificationArns"))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .templateUrl("templateUrl")
 * .timeoutInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html)
 */
@CdkDslMarker
public class CfnStackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStack.Builder = CfnStack.Builder.create(scope, id)

    private val _notificationArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related
     * events.
     *
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
     *
     * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
     *   publish stack related events.
     */
    public fun notificationArns(vararg notificationArns: String) {
        _notificationArns.addAll(listOf(*notificationArns))
    }

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related
     * events.
     *
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
     *
     * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
     *   publish stack related events.
     */
    public fun notificationArns(notificationArns: Collection<String>) {
        _notificationArns.addAll(notificationArns)
    }

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
     *
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     *   when this nested stack is created.
     */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
     *
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     *   when this nested stack is created.
     */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to the resources created in the stack. A
     * maximum number of 50 tags can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
     *
     * @param tags Key-value pairs to associate with this stack.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to the resources created in the stack. A
     * maximum number of 50 tags can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
     *
     * @param tags Key-value pairs to associate with this stack.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Location of file containing the template body.
     *
     * The URL must point to a template (max size: 460,800 bytes) that's located in an Amazon S3
     * bucket. For more information, see
     * [Template anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)
     * .
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-templateurl)
     *
     * @param templateUrl Location of file containing the template body.
     */
    public fun templateUrl(templateUrl: String) {
        cdkBuilder.templateUrl(templateUrl)
    }

    /**
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * `CREATE_COMPLETE` state.
     *
     * The default is no timeout. When CloudFormation detects that the nested stack has reached the
     * `CREATE_COMPLETE` state, it marks the nested stack resource as `CREATE_COMPLETE` in the
     * parent stack and resumes creating the parent stack. If the timeout period expires before the
     * nested stack reaches `CREATE_COMPLETE` , CloudFormation marks the nested stack as failed and
     * rolls back both the nested stack and parent stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-timeoutinminutes)
     *
     * @param timeoutInMinutes The length of time, in minutes, that CloudFormation waits for the
     *   nested stack to reach the `CREATE_COMPLETE` state.
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): CfnStack {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
