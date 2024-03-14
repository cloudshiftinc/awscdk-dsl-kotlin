package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.CfnRule,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the rule, such as `arn:aws:events:us-east-2:123456789012:rule/example` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The description of the rule.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the rule.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name or ARN of the event bus associated with the rule.
   */
  public open fun eventBusName(): String? = unwrap(this).getEventBusName()

  /**
   * The name or ARN of the event bus associated with the rule.
   */
  public open fun eventBusName(`value`: String) {
    unwrap(this).setEventBusName(`value`)
  }

  /**
   * The event pattern of the rule.
   */
  public open fun eventPattern(): Any? = unwrap(this).getEventPattern()

  /**
   * The event pattern of the rule.
   */
  public open fun eventPattern(`value`: Any) {
    unwrap(this).setEventPattern(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the rule.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the rule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the role that is used for target invocation.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the role that is used for target invocation.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The scheduling expression.
   */
  public open fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

  /**
   * The scheduling expression.
   */
  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  /**
   * The state of the rule.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The state of the rule.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * Adds the specified targets to the specified rule, or updates the targets if they are already
   * associated with the rule.
   */
  public open fun targets(): Any? = unwrap(this).getTargets()

  /**
   * Adds the specified targets to the specified rule, or updates the targets if they are already
   * associated with the rule.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * Adds the specified targets to the specified rule, or updates the targets if they are already
   * associated with the rule.
   */
  public open fun targets(__idx_ac66f0: List<Any>) {
    unwrap(this).setTargets(__idx_ac66f0)
  }

  /**
   * Adds the specified targets to the specified rule, or updates the targets if they are already
   * associated with the rule.
   */
  public open fun targets(vararg __idx_ac66f0: Any): Unit = targets(__idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description)
     * @param description The description of the rule. 
     */
    public fun description(description: String)

    /**
     * The name or ARN of the event bus associated with the rule.
     *
     * If you omit this, the default event bus is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventbusname)
     * @param eventBusName The name or ARN of the event bus associated with the rule. 
     */
    public fun eventBusName(eventBusName: String)

    /**
     * The event pattern of the rule.
     *
     * For more information, see [Events and Event
     * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern)
     * @param eventPattern The event pattern of the rule. 
     */
    public fun eventPattern(eventPattern: Any)

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name)
     * @param name The name of the rule. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the role that is used for target invocation.
     *
     * If you're setting an event bus in another account as the target and that account granted
     * permission to your account through an organization instead of directly by the account ID, you
     * must specify a `RoleArn` with proper permissions in the `Target` structure, instead of here in
     * this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role that is used for target invocation.
     * 
     */
    public fun roleArn(roleArn: String)

    /**
     * The scheduling expression.
     *
     * For example, "cron(0 20 * * ? *)", "rate(5 minutes)". For more information, see [Creating an
     * Amazon EventBridge rule that runs on a
     * schedule](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-rule-schedule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression)
     * @param scheduleExpression The scheduling expression. 
     */
    public fun scheduleExpression(scheduleExpression: String)

    /**
     * The state of the rule.
     *
     * Valid values include:
     *
     * * `DISABLED` : The rule is disabled. EventBridge does not match any events against the rule.
     * * `ENABLED` : The rule is enabled. EventBridge matches events against the rule, *except* for
     * AWS management events delivered through CloudTrail.
     * * `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS` : The rule is enabled for all events,
     * including AWS management events delivered through CloudTrail.
     *
     * Management events provide visibility into management operations that are performed on
     * resources in your AWS account. These are also known as control plane operations. For more
     * information, see [Logging management
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html#logging-management-events)
     * in the *CloudTrail User Guide* , and [Filtering management events from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-cloudtrail)
     * in the *Amazon EventBridge User Guide* .
     *
     * This value is only valid for rules on the
     * [default](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-what-is-how-it-works-concepts.html#eb-bus-concepts-buses)
     * event bus or [custom event
     * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-event-bus.html) . It
     * does not apply to [partner event
     * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-saas.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state)
     * @param state The state of the rule. 
     */
    public fun state(state: String)

    /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already
     * associated with the rule.
     *
     * Targets are the resources that are invoked when a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     *
     * For a list of services you can configure as targets for events, see [EventBridge
     * targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html) in the
     * *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     *
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule, you
     * can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     *
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     * APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in `PutTargets`
     * .
     *
     * For more information, see [Authentication and Access
     * Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a target
     * of the rules in your account. To send the matched events to the other account, specify that
     * account's event bus as the `Arn` value when you run `PutTargets` . If your account sends events
     * to another account, your account is charged for each sent event. Each event sent to another
     * account is charged as a custom event. The account receiving the event is not charged. For more
     * information, see [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/)
     * .
     *
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID, then
     * you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see [Sending and Receiving Events Between AWS
     * Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     *
     * * If none of the following arguments are specified for a target, then the entire event is
     * passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS
     * task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     * with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     * the part of the event specified in the path is passed to the target (for example, only the
     * detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     * the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     * they are already associated with the rule. 
     */
    public fun targets(targets: IResolvable)

    /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already
     * associated with the rule.
     *
     * Targets are the resources that are invoked when a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     *
     * For a list of services you can configure as targets for events, see [EventBridge
     * targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html) in the
     * *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     *
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule, you
     * can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     *
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     * APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in `PutTargets`
     * .
     *
     * For more information, see [Authentication and Access
     * Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a target
     * of the rules in your account. To send the matched events to the other account, specify that
     * account's event bus as the `Arn` value when you run `PutTargets` . If your account sends events
     * to another account, your account is charged for each sent event. Each event sent to another
     * account is charged as a custom event. The account receiving the event is not charged. For more
     * information, see [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/)
     * .
     *
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID, then
     * you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see [Sending and Receiving Events Between AWS
     * Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     *
     * * If none of the following arguments are specified for a target, then the entire event is
     * passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS
     * task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     * with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     * the part of the event specified in the path is passed to the target (for example, only the
     * detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     * the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     * they are already associated with the rule. 
     */
    public fun targets(targets: List<Any>)

    /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already
     * associated with the rule.
     *
     * Targets are the resources that are invoked when a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     *
     * For a list of services you can configure as targets for events, see [EventBridge
     * targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html) in the
     * *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     *
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule, you
     * can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     *
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     * APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in `PutTargets`
     * .
     *
     * For more information, see [Authentication and Access
     * Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a target
     * of the rules in your account. To send the matched events to the other account, specify that
     * account's event bus as the `Arn` value when you run `PutTargets` . If your account sends events
     * to another account, your account is charged for each sent event. Each event sent to another
     * account is charged as a custom event. The account receiving the event is not charged. For more
     * information, see [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/)
     * .
     *
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID, then
     * you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see [Sending and Receiving Events Between AWS
     * Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     *
     * * If none of the following arguments are specified for a target, then the entire event is
     * passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS
     * task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     * with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     * the part of the event specified in the path is passed to the target (for example, only the
     * detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     * the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     * they are already associated with the rule. 
     */
    public fun targets(vararg targets: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnRule.Builder =
        software.amazon.awscdk.services.events.CfnRule.Builder.create(scope, id)

    /**
     * The description of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-description)
     * @param description The description of the rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name or ARN of the event bus associated with the rule.
     *
     * If you omit this, the default event bus is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventbusname)
     * @param eventBusName The name or ARN of the event bus associated with the rule. 
     */
    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * The event pattern of the rule.
     *
     * For more information, see [Events and Event
     * Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-eventpattern)
     * @param eventPattern The event pattern of the rule. 
     */
    override fun eventPattern(eventPattern: Any) {
      cdkBuilder.eventPattern(eventPattern)
    }

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-name)
     * @param name The name of the rule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the role that is used for target invocation.
     *
     * If you're setting an event bus in another account as the target and that account granted
     * permission to your account through an organization instead of directly by the account ID, you
     * must specify a `RoleArn` with proper permissions in the `Target` structure, instead of here in
     * this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role that is used for target invocation.
     * 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The scheduling expression.
     *
     * For example, "cron(0 20 * * ? *)", "rate(5 minutes)". For more information, see [Creating an
     * Amazon EventBridge rule that runs on a
     * schedule](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-rule-schedule.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-scheduleexpression)
     * @param scheduleExpression The scheduling expression. 
     */
    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * The state of the rule.
     *
     * Valid values include:
     *
     * * `DISABLED` : The rule is disabled. EventBridge does not match any events against the rule.
     * * `ENABLED` : The rule is enabled. EventBridge matches events against the rule, *except* for
     * AWS management events delivered through CloudTrail.
     * * `ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS` : The rule is enabled for all events,
     * including AWS management events delivered through CloudTrail.
     *
     * Management events provide visibility into management operations that are performed on
     * resources in your AWS account. These are also known as control plane operations. For more
     * information, see [Logging management
     * events](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-events-with-cloudtrail.html#logging-management-events)
     * in the *CloudTrail User Guide* , and [Filtering management events from AWS
     * services](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-service-event.html#eb-service-event-cloudtrail)
     * in the *Amazon EventBridge User Guide* .
     *
     * This value is only valid for rules on the
     * [default](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-what-is-how-it-works-concepts.html#eb-bus-concepts-buses)
     * event bus or [custom event
     * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-create-event-bus.html) . It
     * does not apply to [partner event
     * buses](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-saas.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-state)
     * @param state The state of the rule. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already
     * associated with the rule.
     *
     * Targets are the resources that are invoked when a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     *
     * For a list of services you can configure as targets for events, see [EventBridge
     * targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html) in the
     * *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     *
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule, you
     * can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     *
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     * APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in `PutTargets`
     * .
     *
     * For more information, see [Authentication and Access
     * Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a target
     * of the rules in your account. To send the matched events to the other account, specify that
     * account's event bus as the `Arn` value when you run `PutTargets` . If your account sends events
     * to another account, your account is charged for each sent event. Each event sent to another
     * account is charged as a custom event. The account receiving the event is not charged. For more
     * information, see [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/)
     * .
     *
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID, then
     * you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see [Sending and Receiving Events Between AWS
     * Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     *
     * * If none of the following arguments are specified for a target, then the entire event is
     * passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS
     * task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     * with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     * the part of the event specified in the path is passed to the target (for example, only the
     * detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     * the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     * they are already associated with the rule. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already
     * associated with the rule.
     *
     * Targets are the resources that are invoked when a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     *
     * For a list of services you can configure as targets for events, see [EventBridge
     * targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html) in the
     * *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     *
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule, you
     * can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     *
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     * APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in `PutTargets`
     * .
     *
     * For more information, see [Authentication and Access
     * Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a target
     * of the rules in your account. To send the matched events to the other account, specify that
     * account's event bus as the `Arn` value when you run `PutTargets` . If your account sends events
     * to another account, your account is charged for each sent event. Each event sent to another
     * account is charged as a custom event. The account receiving the event is not charged. For more
     * information, see [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/)
     * .
     *
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID, then
     * you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see [Sending and Receiving Events Between AWS
     * Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     *
     * * If none of the following arguments are specified for a target, then the entire event is
     * passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS
     * task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     * with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     * the part of the event specified in the path is passed to the target (for example, only the
     * detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     * the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     * they are already associated with the rule. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * Adds the specified targets to the specified rule, or updates the targets if they are already
     * associated with the rule.
     *
     * Targets are the resources that are invoked when a rule is triggered.
     *
     * The maximum number of entries per request is 10.
     *
     *
     * Each rule can have up to five (5) targets associated with it at one time.
     *
     *
     * For a list of services you can configure as targets for events, see [EventBridge
     * targets](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-targets.html) in the
     * *Amazon EventBridge User Guide* .
     *
     * Creating rules with built-in targets is supported only in the AWS Management Console . The
     * built-in targets are:
     *
     * * `Amazon EBS CreateSnapshot API call`
     * * `Amazon EC2 RebootInstances API call`
     * * `Amazon EC2 StopInstances API call`
     * * `Amazon EC2 TerminateInstances API call`
     *
     * For some target types, `PutTargets` provides target-specific parameters. If the target is a
     * Kinesis data stream, you can optionally specify which shard the event goes to by using the
     * `KinesisParameters` argument. To invoke a command on multiple EC2 instances with one rule, you
     * can use the `RunCommandParameters` field.
     *
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the
     * appropriate permissions:
     *
     * * For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies.
     * * For EC2 instances, Kinesis Data Streams, AWS Step Functions state machines and API Gateway
     * APIs, EventBridge relies on IAM roles that you specify in the `RoleARN` argument in `PutTargets`
     * .
     *
     * For more information, see [Authentication and Access
     * Control](https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html)
     * in the *Amazon EventBridge User Guide* .
     *
     * If another AWS account is in the same region and has granted you permission (using
     * `PutPermission` ), you can send events to that account. Set that account's event bus as a target
     * of the rules in your account. To send the matched events to the other account, specify that
     * account's event bus as the `Arn` value when you run `PutTargets` . If your account sends events
     * to another account, your account is charged for each sent event. Each event sent to another
     * account is charged as a custom event. The account receiving the event is not charged. For more
     * information, see [Amazon EventBridge Pricing](https://docs.aws.amazon.com/eventbridge/pricing/)
     * .
     *
     *
     * `Input` , `InputPath` , and `InputTransformer` are not available with `PutTarget` if the
     * target is an event bus of a different AWS account.
     *
     *
     * If you are setting the event bus of another account as the target, and that account granted
     * permission to your account through an organization instead of directly by the account ID, then
     * you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
     * information, see [Sending and Receiving Events Between AWS
     * Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
     * in the *Amazon EventBridge User Guide* .
     *
     *
     * If you have an IAM role on a cross-account event bus target, a `PutTargets` call without a
     * role on the same target (same `Id` and `Arn` ) will not remove the role.
     *
     *
     * For more information about enabling cross-account events, see
     * [PutPermission](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutPermission.html)
     * .
     *
     * *Input* , *InputPath* , and *InputTransformer* are mutually exclusive and optional parameters
     * of a target. When a rule is triggered due to a matched event:
     *
     * * If none of the following arguments are specified for a target, then the entire event is
     * passed to the target in JSON format (unless the target is Amazon EC2 Run Command or Amazon ECS
     * task, in which case nothing from the event is passed to the target).
     * * If *Input* is specified in the form of valid JSON, then the matched event is overridden
     * with this constant.
     * * If *InputPath* is specified in the form of JSONPath (for example, `$.detail` ), then only
     * the part of the event specified in the path is passed to the target (for example, only the
     * detail part of the event is passed).
     * * If *InputTransformer* is specified, then one or more specified JSONPaths are extracted from
     * the event and used as values in a template that you specify as the input to the target.
     *
     * When you specify `InputPath` or `InputTransformer` , you must use JSON dot notation, not
     * bracket notation.
     *
     * When you add targets to a rule and the associated rule triggers soon after, new or updated
     * targets might not be immediately invoked. Allow a short period of time for changes to take
     * effect.
     *
     * This action can partially fail if too many requests are made at the same time. If that
     * happens, `FailedEntryCount` is non-zero in the response and each entry in `FailedEntries`
     * provides the ID of the failed target and the error code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-rule.html#cfn-events-rule-targets)
     * @param targets Adds the specified targets to the specified rule, or updates the targets if
     * they are already associated with the rule. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.events.CfnRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule): CfnRule =
        CfnRule(cdkObject)

    internal fun unwrap(wrapped: CfnRule): software.amazon.awscdk.services.events.CfnRule =
        wrapped.cdkObject
  }

  public interface PlacementStrategyProperty {
    /**
     * The field to apply the placement strategy against.
     *
     * For the spread placement strategy, valid values are instanceId (or host, which has the same
     * effect), or any platform or custom attribute that is applied to a container instance, such as
     * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
     * memory. For the random placement strategy, this field is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementstrategy.html#cfn-events-rule-placementstrategy-field)
     */
    public fun `field`(): String? = unwrap(this).getField()

    /**
     * The type of placement strategy.
     *
     * The random placement strategy randomly places tasks on available candidates. The spread
     * placement strategy spreads placement across available candidates evenly based on the field
     * parameter. The binpack strategy places tasks on available candidates that have the least
     * available amount of the resource that is specified with the field parameter. For example, if you
     * binpack on memory, a task is placed on the instance with the least amount of remaining memory
     * (but still enough to run the task).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementstrategy.html#cfn-events-rule-placementstrategy-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PlacementStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param field The field to apply the placement strategy against.
       * For the spread placement strategy, valid values are instanceId (or host, which has the same
       * effect), or any platform or custom attribute that is applied to a container instance, such as
       * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
       * memory. For the random placement strategy, this field is not used.
       */
      public fun `field`(`field`: String)

      /**
       * @param type The type of placement strategy.
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty.builder()

      /**
       * @param field The field to apply the placement strategy against.
       * For the spread placement strategy, valid values are instanceId (or host, which has the same
       * effect), or any platform or custom attribute that is applied to a container instance, such as
       * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
       * memory. For the random placement strategy, this field is not used.
       */
      override fun `field`(`field`: String) {
        cdkBuilder.`field`(`field`)
      }

      /**
       * @param type The type of placement strategy.
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty,
    ) : CdkObject(cdkObject), PlacementStrategyProperty {
      /**
       * The field to apply the placement strategy against.
       *
       * For the spread placement strategy, valid values are instanceId (or host, which has the same
       * effect), or any platform or custom attribute that is applied to a container instance, such as
       * attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and
       * memory. For the random placement strategy, this field is not used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementstrategy.html#cfn-events-rule-placementstrategy-field)
       */
      override fun `field`(): String? = unwrap(this).getField()

      /**
       * The type of placement strategy.
       *
       * The random placement strategy randomly places tasks on available candidates. The spread
       * placement strategy spreads placement across available candidates evenly based on the field
       * parameter. The binpack strategy places tasks on available candidates that have the least
       * available amount of the resource that is specified with the field parameter. For example, if
       * you binpack on memory, a task is placed on the instance with the least amount of remaining
       * memory (but still enough to run the task).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementstrategy.html#cfn-events-rule-placementstrategy-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty):
          PlacementStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementStrategyProperty):
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.PlacementStrategyProperty
    }
  }

  public interface TagProperty {
    /**
     * A string you can use to assign a value.
     *
     * The combination of tag keys and values can help you organize and categorize your resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-tag.html#cfn-events-rule-tag-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * The value for the specified tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-tag.html#cfn-events-rule-tag-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key A string you can use to assign a value.
       * The combination of tag keys and values can help you organize and categorize your resources.
       */
      public fun key(key: String)

      /**
       * @param value The value for the specified tag key.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.events.CfnRule.TagProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.TagProperty.builder()

      /**
       * @param key A string you can use to assign a value.
       * The combination of tag keys and values can help you organize and categorize your resources.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for the specified tag key.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.TagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.events.CfnRule.TagProperty,
    ) : CdkObject(cdkObject), TagProperty {
      /**
       * A string you can use to assign a value.
       *
       * The combination of tag keys and values can help you organize and categorize your resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-tag.html#cfn-events-rule-tag-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * The value for the specified tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-tag.html#cfn-events-rule-tag-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.TagProperty):
          TagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagProperty):
          software.amazon.awscdk.services.events.CfnRule.TagProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnRule.TagProperty
    }
  }

  public interface RedshiftDataParametersProperty {
    /**
     * The name of the database.
     *
     * Required when authenticating using temporary credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-database)
     */
    public fun database(): String

    /**
     * The database user name.
     *
     * Required when authenticating using temporary credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-dbuser)
     */
    public fun dbUser(): String? = unwrap(this).getDbUser()

    /**
     * The name or ARN of the secret that enables access to the database.
     *
     * Required when authenticating using AWS Secrets Manager.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-secretmanagerarn)
     */
    public fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

    /**
     * The SQL statement text to run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-sql)
     */
    public fun sql(): String? = unwrap(this).getSql()

    /**
     * One or more SQL statements to run.
     *
     * The SQL statements are run as a single transaction. They run serially in the order of the
     * array. Subsequent SQL statements don't start until the previous statement in the array
     * completes. If any SQL statement fails, then because they are run as one transaction, all work is
     * rolled back.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-sqls)
     */
    public fun sqls(): List<String> = unwrap(this).getSqls() ?: emptyList()

    /**
     * The name of the SQL statement.
     *
     * You can name the SQL statement when you create it to identify the query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-statementname)
     */
    public fun statementName(): String? = unwrap(this).getStatementName()

    /**
     * Indicates whether to send an event back to EventBridge after the SQL statement runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-withevent)
     */
    public fun withEvent(): Any? = unwrap(this).getWithEvent()

    /**
     * A builder for [RedshiftDataParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param database The name of the database. 
       * Required when authenticating using temporary credentials.
       */
      public fun database(database: String)

      /**
       * @param dbUser The database user name.
       * Required when authenticating using temporary credentials.
       */
      public fun dbUser(dbUser: String)

      /**
       * @param secretManagerArn The name or ARN of the secret that enables access to the database.
       * Required when authenticating using AWS Secrets Manager.
       */
      public fun secretManagerArn(secretManagerArn: String)

      /**
       * @param sql The SQL statement text to run.
       */
      public fun sql(sql: String)

      /**
       * @param sqls One or more SQL statements to run.
       * The SQL statements are run as a single transaction. They run serially in the order of the
       * array. Subsequent SQL statements don't start until the previous statement in the array
       * completes. If any SQL statement fails, then because they are run as one transaction, all work
       * is rolled back.
       */
      public fun sqls(sqls: List<String>)

      /**
       * @param sqls One or more SQL statements to run.
       * The SQL statements are run as a single transaction. They run serially in the order of the
       * array. Subsequent SQL statements don't start until the previous statement in the array
       * completes. If any SQL statement fails, then because they are run as one transaction, all work
       * is rolled back.
       */
      public fun sqls(vararg sqls: String)

      /**
       * @param statementName The name of the SQL statement.
       * You can name the SQL statement when you create it to identify the query.
       */
      public fun statementName(statementName: String)

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      public fun withEvent(withEvent: Boolean)

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      public fun withEvent(withEvent: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty.builder()

      /**
       * @param database The name of the database. 
       * Required when authenticating using temporary credentials.
       */
      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      /**
       * @param dbUser The database user name.
       * Required when authenticating using temporary credentials.
       */
      override fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
      }

      /**
       * @param secretManagerArn The name or ARN of the secret that enables access to the database.
       * Required when authenticating using AWS Secrets Manager.
       */
      override fun secretManagerArn(secretManagerArn: String) {
        cdkBuilder.secretManagerArn(secretManagerArn)
      }

      /**
       * @param sql The SQL statement text to run.
       */
      override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      /**
       * @param sqls One or more SQL statements to run.
       * The SQL statements are run as a single transaction. They run serially in the order of the
       * array. Subsequent SQL statements don't start until the previous statement in the array
       * completes. If any SQL statement fails, then because they are run as one transaction, all work
       * is rolled back.
       */
      override fun sqls(sqls: List<String>) {
        cdkBuilder.sqls(sqls)
      }

      /**
       * @param sqls One or more SQL statements to run.
       * The SQL statements are run as a single transaction. They run serially in the order of the
       * array. Subsequent SQL statements don't start until the previous statement in the array
       * completes. If any SQL statement fails, then because they are run as one transaction, all work
       * is rolled back.
       */
      override fun sqls(vararg sqls: String): Unit = sqls(sqls.toList())

      /**
       * @param statementName The name of the SQL statement.
       * You can name the SQL statement when you create it to identify the query.
       */
      override fun statementName(statementName: String) {
        cdkBuilder.statementName(statementName)
      }

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      override fun withEvent(withEvent: Boolean) {
        cdkBuilder.withEvent(withEvent)
      }

      /**
       * @param withEvent Indicates whether to send an event back to EventBridge after the SQL
       * statement runs.
       */
      override fun withEvent(withEvent: IResolvable) {
        cdkBuilder.withEvent(withEvent.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty,
    ) : CdkObject(cdkObject), RedshiftDataParametersProperty {
      /**
       * The name of the database.
       *
       * Required when authenticating using temporary credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-database)
       */
      override fun database(): String = unwrap(this).getDatabase()

      /**
       * The database user name.
       *
       * Required when authenticating using temporary credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-dbuser)
       */
      override fun dbUser(): String? = unwrap(this).getDbUser()

      /**
       * The name or ARN of the secret that enables access to the database.
       *
       * Required when authenticating using AWS Secrets Manager.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-secretmanagerarn)
       */
      override fun secretManagerArn(): String? = unwrap(this).getSecretManagerArn()

      /**
       * The SQL statement text to run.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-sql)
       */
      override fun sql(): String? = unwrap(this).getSql()

      /**
       * One or more SQL statements to run.
       *
       * The SQL statements are run as a single transaction. They run serially in the order of the
       * array. Subsequent SQL statements don't start until the previous statement in the array
       * completes. If any SQL statement fails, then because they are run as one transaction, all work
       * is rolled back.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-sqls)
       */
      override fun sqls(): List<String> = unwrap(this).getSqls() ?: emptyList()

      /**
       * The name of the SQL statement.
       *
       * You can name the SQL statement when you create it to identify the query.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-statementname)
       */
      override fun statementName(): String? = unwrap(this).getStatementName()

      /**
       * Indicates whether to send an event back to EventBridge after the SQL statement runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-redshiftdataparameters.html#cfn-events-rule-redshiftdataparameters-withevent)
       */
      override fun withEvent(): Any? = unwrap(this).getWithEvent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftDataParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty):
          RedshiftDataParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftDataParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.RedshiftDataParametersProperty
    }
  }

  public interface RetryPolicyProperty {
    /**
     * The maximum amount of time, in seconds, to continue to make retry attempts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-retrypolicy.html#cfn-events-rule-retrypolicy-maximumeventageinseconds)
     */
    public fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

    /**
     * The maximum number of retry attempts to make before the request fails.
     *
     * Retry attempts continue until either the maximum number of attempts is made or until the
     * duration of the `MaximumEventAgeInSeconds` is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-retrypolicy.html#cfn-events-rule-retrypolicy-maximumretryattempts)
     */
    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * A builder for [RetryPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumEventAgeInSeconds The maximum amount of time, in seconds, to continue to make
       * retry attempts.
       */
      public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number)

      /**
       * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
       * fails.
       * Retry attempts continue until either the maximum number of attempts is made or until the
       * duration of the `MaximumEventAgeInSeconds` is met.
       */
      public fun maximumRetryAttempts(maximumRetryAttempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty.builder()

      /**
       * @param maximumEventAgeInSeconds The maximum amount of time, in seconds, to continue to make
       * retry attempts.
       */
      override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
      }

      /**
       * @param maximumRetryAttempts The maximum number of retry attempts to make before the request
       * fails.
       * Retry attempts continue until either the maximum number of attempts is made or until the
       * duration of the `MaximumEventAgeInSeconds` is met.
       */
      override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty,
    ) : CdkObject(cdkObject), RetryPolicyProperty {
      /**
       * The maximum amount of time, in seconds, to continue to make retry attempts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-retrypolicy.html#cfn-events-rule-retrypolicy-maximumeventageinseconds)
       */
      override fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

      /**
       * The maximum number of retry attempts to make before the request fails.
       *
       * Retry attempts continue until either the maximum number of attempts is made or until the
       * duration of the `MaximumEventAgeInSeconds` is met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-retrypolicy.html#cfn-events-rule-retrypolicy-maximumretryattempts)
       */
      override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetryPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty):
          RetryPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetryPolicyProperty):
          software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty
    }
  }

  public interface SqsParametersProperty {
    /**
     * The FIFO message group ID to use as the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid)
     */
    public fun messageGroupId(): String

    /**
     * A builder for [SqsParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param messageGroupId The FIFO message group ID to use as the target. 
       */
      public fun messageGroupId(messageGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty.builder()

      /**
       * @param messageGroupId The FIFO message group ID to use as the target. 
       */
      override fun messageGroupId(messageGroupId: String) {
        cdkBuilder.messageGroupId(messageGroupId)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty,
    ) : CdkObject(cdkObject), SqsParametersProperty {
      /**
       * The FIFO message group ID to use as the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sqsparameters.html#cfn-events-rule-sqsparameters-messagegroupid)
       */
      override fun messageGroupId(): String = unwrap(this).getMessageGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SqsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty):
          SqsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqsParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.SqsParametersProperty
    }
  }

  public interface InputTransformerProperty {
    /**
     * Map of JSON paths to be extracted from the event.
     *
     * You can then insert these in the template in `InputTemplate` to produce the output you want
     * to be sent to the target.
     *
     * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
     * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
     *
     * The keys cannot start with " AWS ."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap)
     */
    public fun inputPathsMap(): Any? = unwrap(this).getInputPathsMap()

    /**
     * Input template where you specify placeholders that will be filled with the values of the keys
     * from `InputPathsMap` to customize the data sent to the target.
     *
     * Enclose each `InputPathsMaps` value in brackets: &lt; *value* &gt;
     *
     * If `InputTemplate` is a JSON object (surrounded by curly braces), the following restrictions
     * apply:
     *
     * * The placeholder cannot be used as an object key.
     *
     * The following example shows the syntax for using `InputPathsMap` and `InputTemplate` .
     *
     * `"InputTransformer":`
     *
     * `{`
     *
     * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
     *
     * `"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"`
     *
     * `}`
     *
     * To have the `InputTemplate` include quote marks within a JSON string, escape each quote marks
     * with a slash, as in the following example:
     *
     * `"InputTransformer":`
     *
     * `{`
     *
     * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
     *
     * `"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""`
     *
     * `}`
     *
     * The `InputTemplate` can also be valid JSON with varibles in quotes or out, as in the
     * following example:
     *
     * `"InputTransformer":`
     *
     * `{`
     *
     * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
     *
     * `"InputTemplate": '{"myInstance": &lt;instance&gt;,"myStatus": "&lt;instance&gt; is in state
     * \"&lt;status&gt;\""}'`
     *
     * `}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate)
     */
    public fun inputTemplate(): String

    /**
     * A builder for [InputTransformerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputPathsMap Map of JSON paths to be extracted from the event.
       * You can then insert these in the template in `InputTemplate` to produce the output you want
       * to be sent to the target.
       *
       * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
       * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
       *
       * The keys cannot start with " AWS ."
       */
      public fun inputPathsMap(inputPathsMap: IResolvable)

      /**
       * @param inputPathsMap Map of JSON paths to be extracted from the event.
       * You can then insert these in the template in `InputTemplate` to produce the output you want
       * to be sent to the target.
       *
       * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
       * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
       *
       * The keys cannot start with " AWS ."
       */
      public fun inputPathsMap(inputPathsMap: Map<String, String>)

      /**
       * @param inputTemplate Input template where you specify placeholders that will be filled with
       * the values of the keys from `InputPathsMap` to customize the data sent to the target. 
       * Enclose each `InputPathsMaps` value in brackets: &lt; *value* &gt;
       *
       * If `InputTemplate` is a JSON object (surrounded by curly braces), the following
       * restrictions apply:
       *
       * * The placeholder cannot be used as an object key.
       *
       * The following example shows the syntax for using `InputPathsMap` and `InputTemplate` .
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"`
       *
       * `}`
       *
       * To have the `InputTemplate` include quote marks within a JSON string, escape each quote
       * marks with a slash, as in the following example:
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""`
       *
       * `}`
       *
       * The `InputTemplate` can also be valid JSON with varibles in quotes or out, as in the
       * following example:
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": '{"myInstance": &lt;instance&gt;,"myStatus": "&lt;instance&gt; is in
       * state \"&lt;status&gt;\""}'`
       *
       * `}`
       */
      public fun inputTemplate(inputTemplate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty.builder()

      /**
       * @param inputPathsMap Map of JSON paths to be extracted from the event.
       * You can then insert these in the template in `InputTemplate` to produce the output you want
       * to be sent to the target.
       *
       * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
       * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
       *
       * The keys cannot start with " AWS ."
       */
      override fun inputPathsMap(inputPathsMap: IResolvable) {
        cdkBuilder.inputPathsMap(inputPathsMap.let(IResolvable::unwrap))
      }

      /**
       * @param inputPathsMap Map of JSON paths to be extracted from the event.
       * You can then insert these in the template in `InputTemplate` to produce the output you want
       * to be sent to the target.
       *
       * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
       * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
       *
       * The keys cannot start with " AWS ."
       */
      override fun inputPathsMap(inputPathsMap: Map<String, String>) {
        cdkBuilder.inputPathsMap(inputPathsMap)
      }

      /**
       * @param inputTemplate Input template where you specify placeholders that will be filled with
       * the values of the keys from `InputPathsMap` to customize the data sent to the target. 
       * Enclose each `InputPathsMaps` value in brackets: &lt; *value* &gt;
       *
       * If `InputTemplate` is a JSON object (surrounded by curly braces), the following
       * restrictions apply:
       *
       * * The placeholder cannot be used as an object key.
       *
       * The following example shows the syntax for using `InputPathsMap` and `InputTemplate` .
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"`
       *
       * `}`
       *
       * To have the `InputTemplate` include quote marks within a JSON string, escape each quote
       * marks with a slash, as in the following example:
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""`
       *
       * `}`
       *
       * The `InputTemplate` can also be valid JSON with varibles in quotes or out, as in the
       * following example:
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": '{"myInstance": &lt;instance&gt;,"myStatus": "&lt;instance&gt; is in
       * state \"&lt;status&gt;\""}'`
       *
       * `}`
       */
      override fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty,
    ) : CdkObject(cdkObject), InputTransformerProperty {
      /**
       * Map of JSON paths to be extracted from the event.
       *
       * You can then insert these in the template in `InputTemplate` to produce the output you want
       * to be sent to the target.
       *
       * `InputPathsMap` is an array key-value pairs, where each value is a valid JSON path. You can
       * have as many as 100 key-value pairs. You must use JSON dot notation, not bracket notation.
       *
       * The keys cannot start with " AWS ."
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputpathsmap)
       */
      override fun inputPathsMap(): Any? = unwrap(this).getInputPathsMap()

      /**
       * Input template where you specify placeholders that will be filled with the values of the
       * keys from `InputPathsMap` to customize the data sent to the target.
       *
       * Enclose each `InputPathsMaps` value in brackets: &lt; *value* &gt;
       *
       * If `InputTemplate` is a JSON object (surrounded by curly braces), the following
       * restrictions apply:
       *
       * * The placeholder cannot be used as an object key.
       *
       * The following example shows the syntax for using `InputPathsMap` and `InputTemplate` .
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": "&lt;instance&gt; is in state &lt;status&gt;"`
       *
       * `}`
       *
       * To have the `InputTemplate` include quote marks within a JSON string, escape each quote
       * marks with a slash, as in the following example:
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": "&lt;instance&gt; is in state \"&lt;status&gt;\""`
       *
       * `}`
       *
       * The `InputTemplate` can also be valid JSON with varibles in quotes or out, as in the
       * following example:
       *
       * `"InputTransformer":`
       *
       * `{`
       *
       * `"InputPathsMap": {"instance": "$.detail.instance","status": "$.detail.status"},`
       *
       * `"InputTemplate": '{"myInstance": &lt;instance&gt;,"myStatus": "&lt;instance&gt; is in
       * state \"&lt;status&gt;\""}'`
       *
       * `}`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-inputtransformer.html#cfn-events-rule-inputtransformer-inputtemplate)
       */
      override fun inputTemplate(): String = unwrap(this).getInputTemplate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputTransformerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty):
          InputTransformerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputTransformerProperty):
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.InputTransformerProperty
    }
  }

  public interface PlacementConstraintProperty {
    /**
     * A cluster query language expression to apply to the constraint.
     *
     * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
     * more, see [Cluster Query
     * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
     * in the Amazon Elastic Container Service Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementconstraint.html#cfn-events-rule-placementconstraint-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * The type of constraint.
     *
     * Use distinctInstance to ensure that each task in a particular group is running on a different
     * container instance. Use memberOf to restrict the selection to a group of valid candidates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementconstraint.html#cfn-events-rule-placementconstraint-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [PlacementConstraintProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
       * more, see [Cluster Query
       * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the Amazon Elastic Container Service Developer Guide.
       */
      public fun expression(expression: String)

      /**
       * @param type The type of constraint.
       * Use distinctInstance to ensure that each task in a particular group is running on a
       * different container instance. Use memberOf to restrict the selection to a group of valid
       * candidates.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty.builder()

      /**
       * @param expression A cluster query language expression to apply to the constraint.
       * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
       * more, see [Cluster Query
       * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the Amazon Elastic Container Service Developer Guide.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param type The type of constraint.
       * Use distinctInstance to ensure that each task in a particular group is running on a
       * different container instance. Use memberOf to restrict the selection to a group of valid
       * candidates.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty,
    ) : CdkObject(cdkObject), PlacementConstraintProperty {
      /**
       * A cluster query language expression to apply to the constraint.
       *
       * You cannot specify an expression if the constraint type is `distinctInstance` . To learn
       * more, see [Cluster Query
       * Language](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/cluster-query-language.html)
       * in the Amazon Elastic Container Service Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementconstraint.html#cfn-events-rule-placementconstraint-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * The type of constraint.
       *
       * Use distinctInstance to ensure that each task in a particular group is running on a
       * different container instance. Use memberOf to restrict the selection to a group of valid
       * candidates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-placementconstraint.html#cfn-events-rule-placementconstraint-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PlacementConstraintProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty):
          PlacementConstraintProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PlacementConstraintProperty):
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.PlacementConstraintProperty
    }
  }

  public interface RunCommandTargetProperty {
    /**
     * Can be either `tag:` *tag-key* or `InstanceIds` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key)
     */
    public fun key(): String

    /**
     * If `Key` is `tag:` *tag-key* , `Values` is a list of tag values.
     *
     * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [RunCommandTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key Can be either `tag:` *tag-key* or `InstanceIds` . 
       */
      public fun key(key: String)

      /**
       * @param values If `Key` is `tag:` *tag-key* , `Values` is a list of tag values. 
       * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
       */
      public fun values(values: List<String>)

      /**
       * @param values If `Key` is `tag:` *tag-key* , `Values` is a list of tag values. 
       * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty.builder()

      /**
       * @param key Can be either `tag:` *tag-key* or `InstanceIds` . 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param values If `Key` is `tag:` *tag-key* , `Values` is a list of tag values. 
       * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values If `Key` is `tag:` *tag-key* , `Values` is a list of tag values. 
       * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty,
    ) : CdkObject(cdkObject), RunCommandTargetProperty {
      /**
       * Can be either `tag:` *tag-key* or `InstanceIds` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * If `Key` is `tag:` *tag-key* , `Values` is a list of tag values.
       *
       * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html#cfn-events-rule-runcommandtarget-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunCommandTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty):
          RunCommandTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunCommandTargetProperty):
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.RunCommandTargetProperty
    }
  }

  public interface KinesisParametersProperty {
    /**
     * The JSON path to be extracted from the event and used as the partition key.
     *
     * For more information, see [Amazon Kinesis Streams Key
     * Concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key) in the
     * *Amazon Kinesis Streams Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath)
     */
    public fun partitionKeyPath(): String

    /**
     * A builder for [KinesisParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partitionKeyPath The JSON path to be extracted from the event and used as the
       * partition key. 
       * For more information, see [Amazon Kinesis Streams Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key) in
       * the *Amazon Kinesis Streams Developer Guide* .
       */
      public fun partitionKeyPath(partitionKeyPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty.builder()

      /**
       * @param partitionKeyPath The JSON path to be extracted from the event and used as the
       * partition key. 
       * For more information, see [Amazon Kinesis Streams Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key) in
       * the *Amazon Kinesis Streams Developer Guide* .
       */
      override fun partitionKeyPath(partitionKeyPath: String) {
        cdkBuilder.partitionKeyPath(partitionKeyPath)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty,
    ) : CdkObject(cdkObject), KinesisParametersProperty {
      /**
       * The JSON path to be extracted from the event and used as the partition key.
       *
       * For more information, see [Amazon Kinesis Streams Key
       * Concepts](https://docs.aws.amazon.com/streams/latest/dev/key-concepts.html#partition-key) in
       * the *Amazon Kinesis Streams Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-kinesisparameters.html#cfn-events-rule-kinesisparameters-partitionkeypath)
       */
      override fun partitionKeyPath(): String = unwrap(this).getPartitionKeyPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty):
          KinesisParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.KinesisParametersProperty
    }
  }

  public interface AwsVpcConfigurationProperty {
    /**
     * Specifies whether the task's elastic network interface receives a public IP address.
     *
     * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html#cfn-events-rule-awsvpcconfiguration-assignpublicip)
     */
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    /**
     * Specifies the security groups associated with the task.
     *
     * These security groups must all be in the same VPC. You can specify as many as five security
     * groups. If you do not specify a security group, the default security group for the VPC is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html#cfn-events-rule-awsvpcconfiguration-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * Specifies the subnets associated with the task.
     *
     * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html#cfn-events-rule-awsvpcconfiguration-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [AwsVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assignPublicIp Specifies whether the task's elastic network interface receives a
       * public IP address.
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       */
      public fun assignPublicIp(assignPublicIp: String)

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty.builder()

      /**
       * @param assignPublicIp Specifies whether the task's elastic network interface receives a
       * public IP address.
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       */
      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups Specifies the security groups associated with the task.
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets Specifies the subnets associated with the task. 
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject), AwsVpcConfigurationProperty {
      /**
       * Specifies whether the task's elastic network interface receives a public IP address.
       *
       * You can specify `ENABLED` only when `LaunchType` in `EcsParameters` is set to `FARGATE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html#cfn-events-rule-awsvpcconfiguration-assignpublicip)
       */
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      /**
       * Specifies the security groups associated with the task.
       *
       * These security groups must all be in the same VPC. You can specify as many as five security
       * groups. If you do not specify a security group, the default security group for the VPC is
       * used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html#cfn-events-rule-awsvpcconfiguration-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * Specifies the subnets associated with the task.
       *
       * These subnets must all be in the same VPC. You can specify as many as 16 subnets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-awsvpcconfiguration.html#cfn-events-rule-awsvpcconfiguration-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty
    }
  }

  public interface EcsParametersProperty {
    /**
     * The capacity provider strategy to use for the task.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or launchType is specified, the `defaultCapacityProviderStrategy`
     * for the cluster is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-capacityproviderstrategy)
     */
    public fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

    /**
     * Specifies whether to enable Amazon ECS managed tags for the task.
     *
     * For more information, see [Tagging Your Amazon ECS
     * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
     * the Amazon Elastic Container Service Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-enableecsmanagedtags)
     */
    public fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

    /**
     * Whether or not to enable the execute command functionality for the containers in this task.
     *
     * If true, this enables execute command functionality on all containers in the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-enableexecutecommand)
     */
    public fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

    /**
     * Specifies an ECS task group for the task.
     *
     * The maximum length is 255 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-group)
     */
    public fun group(): String? = unwrap(this).getGroup()

    /**
     * Specifies the launch type on which your task is running.
     *
     * The launch type that you specify here must match one of the launch type (compatibilities) of
     * the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate with
     * Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
     * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-launchtype)
     */
    public fun launchType(): String? = unwrap(this).getLaunchType()

    /**
     * Use this structure if the Amazon ECS task uses the `awsvpc` network mode.
     *
     * This structure specifies the VPC subnets and security groups associated with the task, and
     * whether a public IP address is to be used. This structure is required if `LaunchType` is
     * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
     *
     * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
     * network mode, the task fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-networkconfiguration)
     */
    public fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

    /**
     * An array of placement constraint objects to use for the task.
     *
     * You can specify up to 10 constraints per task (including constraints in the task definition
     * and those specified at runtime).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-placementconstraints)
     */
    public fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

    /**
     * The placement strategy objects to use for the task.
     *
     * You can specify a maximum of five strategy rules per task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-placementstrategies)
     */
    public fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

    /**
     * Specifies the platform version for the task.
     *
     * Specify only the numeric portion of the platform version, such as `1.1.0` .
     *
     * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
     * platform versions, see [AWS Fargate Platform
     * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-platformversion)
     */
    public fun platformVersion(): String? = unwrap(this).getPlatformVersion()

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags are not propagated. Tags can only be propagated to the
     * task during task creation. To add tags to a task after task creation, use the TagResource API
     * action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-propagatetags)
     */
    public fun propagateTags(): String? = unwrap(this).getPropagateTags()

    /**
     * The reference ID to use for the task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-referenceid)
     */
    public fun referenceId(): String? = unwrap(this).getReferenceId()

    /**
     * The metadata that you apply to the task to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. To learn more,
     * see
     * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
     * in the Amazon ECS API Reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taglist)
     */
    public fun tagList(): Any? = unwrap(this).getTagList()

    /**
     * The number of tasks to create based on `TaskDefinition` .
     *
     * The default is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount)
     */
    public fun taskCount(): Number? = unwrap(this).getTaskCount()

    /**
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn)
     */
    public fun taskDefinitionArn(): String

    /**
     * A builder for [EcsParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable)

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      public fun capacityProviderStrategy(capacityProviderStrategy: List<Any>)

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any)

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      public fun enableEcsManagedTags(enableEcsManagedTags: Boolean)

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable)

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      public fun enableExecuteCommand(enableExecuteCommand: Boolean)

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      public fun enableExecuteCommand(enableExecuteCommand: IResolvable)

      /**
       * @param group Specifies an ECS task group for the task.
       * The maximum length is 255 characters.
       */
      public fun group(group: String)

      /**
       * @param launchType Specifies the launch type on which your task is running.
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate
       * with Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      public fun launchType(launchType: String)

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      public fun networkConfiguration(networkConfiguration: IResolvable)

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b82fdf91945393c7d598da2a252104b7ede1400d8968abcd0818a2331d5a206")
      public
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(placementConstraints: IResolvable)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(placementConstraints: List<Any>)

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      public fun placementConstraints(vararg placementConstraints: Any)

      /**
       * @param placementStrategies The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      public fun placementStrategies(placementStrategies: IResolvable)

      /**
       * @param placementStrategies The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      public fun placementStrategies(placementStrategies: List<Any>)

      /**
       * @param placementStrategies The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      public fun placementStrategies(vararg placementStrategies: Any)

      /**
       * @param platformVersion Specifies the platform version for the task.
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       *
       * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
       * platform versions, see [AWS Fargate Platform
       * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      public fun platformVersion(platformVersion: String)

      /**
       * @param propagateTags Specifies whether to propagate the tags from the task definition to
       * the task.
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the TagResource API
       * action.
       */
      public fun propagateTags(propagateTags: String)

      /**
       * @param referenceId The reference ID to use for the task.
       */
      public fun referenceId(referenceId: String)

      /**
       * @param tagList The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      public fun tagList(tagList: IResolvable)

      /**
       * @param tagList The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      public fun tagList(tagList: List<Any>)

      /**
       * @param tagList The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      public fun tagList(vararg tagList: Any)

      /**
       * @param taskCount The number of tasks to create based on `TaskDefinition` .
       * The default is 1.
       */
      public fun taskCount(taskCount: Number)

      /**
       * @param taskDefinitionArn The ARN of the task definition to use if the event target is an
       * Amazon ECS task. 
       */
      public fun taskDefinitionArn(taskDefinitionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty.builder()

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      override fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy.let(IResolvable::unwrap))
      }

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      override fun capacityProviderStrategy(capacityProviderStrategy: List<Any>) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
      }

      /**
       * @param capacityProviderStrategy The capacity provider strategy to use for the task.
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       */
      override fun capacityProviderStrategy(vararg capacityProviderStrategy: Any): Unit =
          capacityProviderStrategy(capacityProviderStrategy.toList())

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
      }

      /**
       * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the
       * task.
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       */
      override fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags.let(IResolvable::unwrap))
      }

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
      }

      /**
       * @param enableExecuteCommand Whether or not to enable the execute command functionality for
       * the containers in this task.
       * If true, this enables execute command functionality on all containers in the task.
       */
      override fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand.let(IResolvable::unwrap))
      }

      /**
       * @param group Specifies an ECS task group for the task.
       * The maximum length is 255 characters.
       */
      override fun group(group: String) {
        cdkBuilder.group(group)
      }

      /**
       * @param launchType Specifies the launch type on which your task is running.
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate
       * with Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       */
      override fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
      }

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      override fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
      }

      /**
       * @param networkConfiguration Use this structure if the Amazon ECS task uses the `awsvpc`
       * network mode.
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b82fdf91945393c7d598da2a252104b7ede1400d8968abcd0818a2331d5a206")
      override
          fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
          Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints.let(IResolvable::unwrap))
      }

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(placementConstraints: List<Any>) {
        cdkBuilder.placementConstraints(placementConstraints)
      }

      /**
       * @param placementConstraints An array of placement constraint objects to use for the task.
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       */
      override fun placementConstraints(vararg placementConstraints: Any): Unit =
          placementConstraints(placementConstraints.toList())

      /**
       * @param placementStrategies The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      override fun placementStrategies(placementStrategies: IResolvable) {
        cdkBuilder.placementStrategies(placementStrategies.let(IResolvable::unwrap))
      }

      /**
       * @param placementStrategies The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      override fun placementStrategies(placementStrategies: List<Any>) {
        cdkBuilder.placementStrategies(placementStrategies)
      }

      /**
       * @param placementStrategies The placement strategy objects to use for the task.
       * You can specify a maximum of five strategy rules per task.
       */
      override fun placementStrategies(vararg placementStrategies: Any): Unit =
          placementStrategies(placementStrategies.toList())

      /**
       * @param platformVersion Specifies the platform version for the task.
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       *
       * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
       * platform versions, see [AWS Fargate Platform
       * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       */
      override fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
      }

      /**
       * @param propagateTags Specifies whether to propagate the tags from the task definition to
       * the task.
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the TagResource API
       * action.
       */
      override fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
      }

      /**
       * @param referenceId The reference ID to use for the task.
       */
      override fun referenceId(referenceId: String) {
        cdkBuilder.referenceId(referenceId)
      }

      /**
       * @param tagList The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      override fun tagList(tagList: IResolvable) {
        cdkBuilder.tagList(tagList.let(IResolvable::unwrap))
      }

      /**
       * @param tagList The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      override fun tagList(tagList: List<Any>) {
        cdkBuilder.tagList(tagList)
      }

      /**
       * @param tagList The metadata that you apply to the task to help you categorize and organize
       * them.
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       */
      override fun tagList(vararg tagList: Any): Unit = tagList(tagList.toList())

      /**
       * @param taskCount The number of tasks to create based on `TaskDefinition` .
       * The default is 1.
       */
      override fun taskCount(taskCount: Number) {
        cdkBuilder.taskCount(taskCount)
      }

      /**
       * @param taskDefinitionArn The ARN of the task definition to use if the event target is an
       * Amazon ECS task. 
       */
      override fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty,
    ) : CdkObject(cdkObject), EcsParametersProperty {
      /**
       * The capacity provider strategy to use for the task.
       *
       * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted.
       * If no `capacityProviderStrategy` or launchType is specified, the
       * `defaultCapacityProviderStrategy` for the cluster is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-capacityproviderstrategy)
       */
      override fun capacityProviderStrategy(): Any? = unwrap(this).getCapacityProviderStrategy()

      /**
       * Specifies whether to enable Amazon ECS managed tags for the task.
       *
       * For more information, see [Tagging Your Amazon ECS
       * Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html) in
       * the Amazon Elastic Container Service Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-enableecsmanagedtags)
       */
      override fun enableEcsManagedTags(): Any? = unwrap(this).getEnableEcsManagedTags()

      /**
       * Whether or not to enable the execute command functionality for the containers in this task.
       *
       * If true, this enables execute command functionality on all containers in the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-enableexecutecommand)
       */
      override fun enableExecuteCommand(): Any? = unwrap(this).getEnableExecuteCommand()

      /**
       * Specifies an ECS task group for the task.
       *
       * The maximum length is 255 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-group)
       */
      override fun group(): String? = unwrap(this).getGroup()

      /**
       * Specifies the launch type on which your task is running.
       *
       * The launch type that you specify here must match one of the launch type (compatibilities)
       * of the target task. The `FARGATE` value is supported only in the Regions where AWS Fargate
       * with Amazon ECS is supported. For more information, see [AWS Fargate on Amazon
       * ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html) in the
       * *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-launchtype)
       */
      override fun launchType(): String? = unwrap(this).getLaunchType()

      /**
       * Use this structure if the Amazon ECS task uses the `awsvpc` network mode.
       *
       * This structure specifies the VPC subnets and security groups associated with the task, and
       * whether a public IP address is to be used. This structure is required if `LaunchType` is
       * `FARGATE` because the `awsvpc` mode is required for Fargate tasks.
       *
       * If you specify `NetworkConfiguration` when the target ECS task does not use the `awsvpc`
       * network mode, the task fails.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-networkconfiguration)
       */
      override fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

      /**
       * An array of placement constraint objects to use for the task.
       *
       * You can specify up to 10 constraints per task (including constraints in the task definition
       * and those specified at runtime).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-placementconstraints)
       */
      override fun placementConstraints(): Any? = unwrap(this).getPlacementConstraints()

      /**
       * The placement strategy objects to use for the task.
       *
       * You can specify a maximum of five strategy rules per task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-placementstrategies)
       */
      override fun placementStrategies(): Any? = unwrap(this).getPlacementStrategies()

      /**
       * Specifies the platform version for the task.
       *
       * Specify only the numeric portion of the platform version, such as `1.1.0` .
       *
       * This structure is used only if `LaunchType` is `FARGATE` . For more information about valid
       * platform versions, see [AWS Fargate Platform
       * Versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-platformversion)
       */
      override fun platformVersion(): String? = unwrap(this).getPlatformVersion()

      /**
       * Specifies whether to propagate the tags from the task definition to the task.
       *
       * If no value is specified, the tags are not propagated. Tags can only be propagated to the
       * task during task creation. To add tags to a task after task creation, use the TagResource API
       * action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-propagatetags)
       */
      override fun propagateTags(): String? = unwrap(this).getPropagateTags()

      /**
       * The reference ID to use for the task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-referenceid)
       */
      override fun referenceId(): String? = unwrap(this).getReferenceId()

      /**
       * The metadata that you apply to the task to help you categorize and organize them.
       *
       * Each tag consists of a key and an optional value, both of which you define. To learn more,
       * see
       * [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags)
       * in the Amazon ECS API Reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taglist)
       */
      override fun tagList(): Any? = unwrap(this).getTagList()

      /**
       * The number of tasks to create based on `TaskDefinition` .
       *
       * The default is 1.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount)
       */
      override fun taskCount(): Number? = unwrap(this).getTaskCount()

      /**
       * The ARN of the task definition to use if the event target is an Amazon ECS task.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn)
       */
      override fun taskDefinitionArn(): String = unwrap(this).getTaskDefinitionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EcsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty):
          EcsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EcsParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.EcsParametersProperty
    }
  }

  public interface BatchParametersProperty {
    /**
     * The array properties for the submitted job, such as the size of the array.
     *
     * The array size can be between 2 and 10,000. If you specify array properties for a job, it
     * becomes an array job. This parameter is used only if the target is an AWS Batch job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-arrayproperties)
     */
    public fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

    /**
     * The ARN or name of the job definition to use if the event target is an AWS Batch job.
     *
     * This job definition must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobdefinition)
     */
    public fun jobDefinition(): String

    /**
     * The name to use for this execution of the job, if the target is an AWS Batch job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobname)
     */
    public fun jobName(): String

    /**
     * The retry strategy to use for failed jobs, if the target is an AWS Batch job.
     *
     * The retry strategy is the number of times to retry the failed job execution. Valid values are
     * 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in the job
     * definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-retrystrategy)
     */
    public fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()

    /**
     * A builder for [BatchParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      public fun arrayProperties(arrayProperties: IResolvable)

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty)

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e429329971427039d0e843a7a4df3f41683a0f5c699fba7b4c40cbf5a7a6ceaf")
      public fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit)

      /**
       * @param jobDefinition The ARN or name of the job definition to use if the event target is an
       * AWS Batch job. 
       * This job definition must already exist.
       */
      public fun jobDefinition(jobDefinition: String)

      /**
       * @param jobName The name to use for this execution of the job, if the target is an AWS Batch
       * job. 
       */
      public fun jobName(jobName: String)

      /**
       * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS
       * Batch job.
       * The retry strategy is the number of times to retry the failed job execution. Valid values
       * are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in
       * the job definition.
       */
      public fun retryStrategy(retryStrategy: IResolvable)

      /**
       * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS
       * Batch job.
       * The retry strategy is the number of times to retry the failed job execution. Valid values
       * are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in
       * the job definition.
       */
      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty)

      /**
       * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS
       * Batch job.
       * The retry strategy is the number of times to retry the failed job execution. Valid values
       * are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in
       * the job definition.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3d0ec99b93e657097bc00083ade70aa50728d7305df6d44525abd733e293a08")
      public fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty.builder()

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      override fun arrayProperties(arrayProperties: IResolvable) {
        cdkBuilder.arrayProperties(arrayProperties.let(IResolvable::unwrap))
      }

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      override fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty) {
        cdkBuilder.arrayProperties(arrayProperties.let(BatchArrayPropertiesProperty::unwrap))
      }

      /**
       * @param arrayProperties The array properties for the submitted job, such as the size of the
       * array.
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e429329971427039d0e843a7a4df3f41683a0f5c699fba7b4c40cbf5a7a6ceaf")
      override
          fun arrayProperties(arrayProperties: BatchArrayPropertiesProperty.Builder.() -> Unit):
          Unit = arrayProperties(BatchArrayPropertiesProperty(arrayProperties))

      /**
       * @param jobDefinition The ARN or name of the job definition to use if the event target is an
       * AWS Batch job. 
       * This job definition must already exist.
       */
      override fun jobDefinition(jobDefinition: String) {
        cdkBuilder.jobDefinition(jobDefinition)
      }

      /**
       * @param jobName The name to use for this execution of the job, if the target is an AWS Batch
       * job. 
       */
      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      /**
       * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS
       * Batch job.
       * The retry strategy is the number of times to retry the failed job execution. Valid values
       * are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in
       * the job definition.
       */
      override fun retryStrategy(retryStrategy: IResolvable) {
        cdkBuilder.retryStrategy(retryStrategy.let(IResolvable::unwrap))
      }

      /**
       * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS
       * Batch job.
       * The retry strategy is the number of times to retry the failed job execution. Valid values
       * are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in
       * the job definition.
       */
      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty) {
        cdkBuilder.retryStrategy(retryStrategy.let(BatchRetryStrategyProperty::unwrap))
      }

      /**
       * @param retryStrategy The retry strategy to use for failed jobs, if the target is an AWS
       * Batch job.
       * The retry strategy is the number of times to retry the failed job execution. Valid values
       * are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in
       * the job definition.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3d0ec99b93e657097bc00083ade70aa50728d7305df6d44525abd733e293a08")
      override fun retryStrategy(retryStrategy: BatchRetryStrategyProperty.Builder.() -> Unit): Unit
          = retryStrategy(BatchRetryStrategyProperty(retryStrategy))

      public fun build(): software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty,
    ) : CdkObject(cdkObject), BatchParametersProperty {
      /**
       * The array properties for the submitted job, such as the size of the array.
       *
       * The array size can be between 2 and 10,000. If you specify array properties for a job, it
       * becomes an array job. This parameter is used only if the target is an AWS Batch job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-arrayproperties)
       */
      override fun arrayProperties(): Any? = unwrap(this).getArrayProperties()

      /**
       * The ARN or name of the job definition to use if the event target is an AWS Batch job.
       *
       * This job definition must already exist.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobdefinition)
       */
      override fun jobDefinition(): String = unwrap(this).getJobDefinition()

      /**
       * The name to use for this execution of the job, if the target is an AWS Batch job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobname)
       */
      override fun jobName(): String = unwrap(this).getJobName()

      /**
       * The retry strategy to use for failed jobs, if the target is an AWS Batch job.
       *
       * The retry strategy is the number of times to retry the failed job execution. Valid values
       * are 1–10. When you specify a retry strategy here, it overrides the retry strategy defined in
       * the job definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-retrystrategy)
       */
      override fun retryStrategy(): Any? = unwrap(this).getRetryStrategy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty):
          BatchParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty
    }
  }

  public interface BatchRetryStrategyProperty {
    /**
     * The number of times to attempt to retry, if the job fails.
     *
     * Valid values are 1–10.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html#cfn-events-rule-batchretrystrategy-attempts)
     */
    public fun attempts(): Number? = unwrap(this).getAttempts()

    /**
     * A builder for [BatchRetryStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attempts The number of times to attempt to retry, if the job fails.
       * Valid values are 1–10.
       */
      public fun attempts(attempts: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty.builder()

      /**
       * @param attempts The number of times to attempt to retry, if the job fails.
       * Valid values are 1–10.
       */
      override fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty,
    ) : CdkObject(cdkObject), BatchRetryStrategyProperty {
      /**
       * The number of times to attempt to retry, if the job fails.
       *
       * Valid values are 1–10.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html#cfn-events-rule-batchretrystrategy-attempts)
       */
      override fun attempts(): Number? = unwrap(this).getAttempts()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchRetryStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty):
          BatchRetryStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchRetryStrategyProperty):
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty
    }
  }

  public interface DeadLetterConfigProperty {
    /**
     * The ARN of the SQS queue specified as the target for the dead-letter queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-deadletterconfig.html#cfn-events-rule-deadletterconfig-arn)
     */
    public fun arn(): String? = unwrap(this).getArn()

    /**
     * A builder for [DeadLetterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arn The ARN of the SQS queue specified as the target for the dead-letter queue.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty.builder()

      /**
       * @param arn The ARN of the SQS queue specified as the target for the dead-letter queue.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty,
    ) : CdkObject(cdkObject), DeadLetterConfigProperty {
      /**
       * The ARN of the SQS queue specified as the target for the dead-letter queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-deadletterconfig.html#cfn-events-rule-deadletterconfig-arn)
       */
      override fun arn(): String? = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty):
          DeadLetterConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterConfigProperty):
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.DeadLetterConfigProperty
    }
  }

  public interface SageMakerPipelineParametersProperty {
    /**
     * List of Parameter names and values for SageMaker Model Building Pipeline execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameters.html#cfn-events-rule-sagemakerpipelineparameters-pipelineparameterlist)
     */
    public fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()

    /**
     * A builder for [SageMakerPipelineParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      public fun pipelineParameterList(pipelineParameterList: IResolvable)

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      public fun pipelineParameterList(pipelineParameterList: List<Any>)

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      public fun pipelineParameterList(vararg pipelineParameterList: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty.builder()

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      override fun pipelineParameterList(pipelineParameterList: IResolvable) {
        cdkBuilder.pipelineParameterList(pipelineParameterList.let(IResolvable::unwrap))
      }

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      override fun pipelineParameterList(pipelineParameterList: List<Any>) {
        cdkBuilder.pipelineParameterList(pipelineParameterList)
      }

      /**
       * @param pipelineParameterList List of Parameter names and values for SageMaker Model
       * Building Pipeline execution.
       */
      override fun pipelineParameterList(vararg pipelineParameterList: Any): Unit =
          pipelineParameterList(pipelineParameterList.toList())

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty,
    ) : CdkObject(cdkObject), SageMakerPipelineParametersProperty {
      /**
       * List of Parameter names and values for SageMaker Model Building Pipeline execution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameters.html#cfn-events-rule-sagemakerpipelineparameters-pipelineparameterlist)
       */
      override fun pipelineParameterList(): Any? = unwrap(this).getPipelineParameterList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty):
          SageMakerPipelineParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParametersProperty
    }
  }

  public interface AppSyncParametersProperty {
    /**
     * The GraphQL operation; that is, the query, mutation, or subscription to be parsed and
     * executed by the GraphQL service.
     *
     * For more information, see
     * [Operations](https://docs.aws.amazon.com/appsync/latest/devguide/graphql-architecture.html#graphql-operations)
     * in the *AWS AppSync User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-appsyncparameters.html#cfn-events-rule-appsyncparameters-graphqloperation)
     */
    public fun graphQlOperation(): String

    /**
     * A builder for [AppSyncParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param graphQlOperation The GraphQL operation; that is, the query, mutation, or
       * subscription to be parsed and executed by the GraphQL service. 
       * For more information, see
       * [Operations](https://docs.aws.amazon.com/appsync/latest/devguide/graphql-architecture.html#graphql-operations)
       * in the *AWS AppSync User Guide* .
       */
      public fun graphQlOperation(graphQlOperation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty.builder()

      /**
       * @param graphQlOperation The GraphQL operation; that is, the query, mutation, or
       * subscription to be parsed and executed by the GraphQL service. 
       * For more information, see
       * [Operations](https://docs.aws.amazon.com/appsync/latest/devguide/graphql-architecture.html#graphql-operations)
       * in the *AWS AppSync User Guide* .
       */
      override fun graphQlOperation(graphQlOperation: String) {
        cdkBuilder.graphQlOperation(graphQlOperation)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty,
    ) : CdkObject(cdkObject), AppSyncParametersProperty {
      /**
       * The GraphQL operation; that is, the query, mutation, or subscription to be parsed and
       * executed by the GraphQL service.
       *
       * For more information, see
       * [Operations](https://docs.aws.amazon.com/appsync/latest/devguide/graphql-architecture.html#graphql-operations)
       * in the *AWS AppSync User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-appsyncparameters.html#cfn-events-rule-appsyncparameters-graphqloperation)
       */
      override fun graphQlOperation(): String = unwrap(this).getGraphQlOperation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty):
          AppSyncParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppSyncParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.AppSyncParametersProperty
    }
  }

  public interface TargetProperty {
    /**
     * Contains the GraphQL operation to be parsed and executed, if the event target is an AWS
     * AppSync API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-appsyncparameters)
     */
    public fun appSyncParameters(): Any? = unwrap(this).getAppSyncParameters()

    /**
     * The Amazon Resource Name (ARN) of the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn)
     */
    public fun arn(): String

    /**
     * If the event target is an AWS Batch job, this contains the job definition, job name, and
     * other parameters.
     *
     * For more information, see
     * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-batchparameters)
     */
    public fun batchParameters(): Any? = unwrap(this).getBatchParameters()

    /**
     * The `DeadLetterConfig` that defines the target queue to send dead-letter queue events to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-deadletterconfig)
     */
    public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    /**
     * Contains the Amazon ECS task definition and task count to be used, if the event target is an
     * Amazon ECS task.
     *
     * For more information about Amazon ECS tasks, see [Task
     * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     * in the *Amazon EC2 Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-ecsparameters)
     */
    public fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

    /**
     * Contains the HTTP parameters to use when the target is a API Gateway endpoint or EventBridge
     * ApiDestination.
     *
     * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use this
     * parameter to specify headers, path parameters, and query string keys/values as part of your
     * target invoking request. If you're using ApiDestinations, the corresponding Connection can also
     * have these values configured. In case of any conflicting keys, values from the Connection take
     * precedence.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-httpparameters)
     */
    public fun httpParameters(): Any? = unwrap(this).getHttpParameters()

    /**
     * The ID of the target within the specified rule.
     *
     * Use this ID to reference the target when updating the rule. We recommend using a memorable
     * and unique string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id)
     */
    public fun id(): String

    /**
     * Valid JSON text passed to the target.
     *
     * In this case, nothing from the event itself is passed to the target. For more information,
     * see [The JavaScript Object Notation (JSON) Data Interchange
     * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input)
     */
    public fun input(): String? = unwrap(this).getInput()

    /**
     * The value of the JSONPath that is used for extracting part of the matched event when passing
     * it to the target.
     *
     * You may use JSON dot notation or bracket notation. For more information about JSON paths, see
     * [JSONPath](https://docs.aws.amazon.com/http://goessner.net/articles/JsonPath/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath)
     */
    public fun inputPath(): String? = unwrap(this).getInputPath()

    /**
     * Settings to enable you to provide custom input to a target based on certain event data.
     *
     * You can extract one or more key-value pairs from the event and then use that data to send
     * customized input to the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputtransformer)
     */
    public fun inputTransformer(): Any? = unwrap(this).getInputTransformer()

    /**
     * The custom parameter you can use to control the shard assignment, when the target is a
     * Kinesis data stream.
     *
     * If you do not include this parameter, the default is to use the `eventId` as the partition
     * key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-kinesisparameters)
     */
    public fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

    /**
     * Contains the Amazon Redshift Data API parameters to use when the target is a Amazon Redshift
     * cluster.
     *
     * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify parameters
     * to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-redshiftdataparameters)
     */
    public fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

    /**
     * The `RetryPolicy` object that contains the retry policy configuration to use for the
     * dead-letter queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-retrypolicy)
     */
    public fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is
     * triggered.
     *
     * If one rule triggers multiple targets, you can use a different IAM role for each target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-runcommandparameters)
     */
    public fun runCommandParameters(): Any? = unwrap(this).getRunCommandParameters()

    /**
     * Contains the SageMaker Model Building Pipeline parameters to start execution of a SageMaker
     * Model Building Pipeline.
     *
     * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
     * parameters to start a pipeline execution based on EventBridge events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-sagemakerpipelineparameters)
     */
    public fun sageMakerPipelineParameters(): Any? = unwrap(this).getSageMakerPipelineParameters()

    /**
     * Contains the message group ID to use when the target is a FIFO queue.
     *
     * If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication
     * enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-sqsparameters)
     */
    public fun sqsParameters(): Any? = unwrap(this).getSqsParameters()

    /**
     * A builder for [TargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
       * event target is an AWS AppSync API.
       */
      public fun appSyncParameters(appSyncParameters: IResolvable)

      /**
       * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
       * event target is an AWS AppSync API.
       */
      public fun appSyncParameters(appSyncParameters: AppSyncParametersProperty)

      /**
       * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
       * event target is an AWS AppSync API.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43551882193e3fe9df2b4bab16721122ca5a46b2fcc0c003a871cf84ec343db")
      public fun appSyncParameters(appSyncParameters: AppSyncParametersProperty.Builder.() -> Unit)

      /**
       * @param arn The Amazon Resource Name (ARN) of the target. 
       */
      public fun arn(arn: String)

      /**
       * @param batchParameters If the event target is an AWS Batch job, this contains the job
       * definition, job name, and other parameters.
       * For more information, see
       * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
       * Guide* .
       */
      public fun batchParameters(batchParameters: IResolvable)

      /**
       * @param batchParameters If the event target is an AWS Batch job, this contains the job
       * definition, job name, and other parameters.
       * For more information, see
       * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
       * Guide* .
       */
      public fun batchParameters(batchParameters: BatchParametersProperty)

      /**
       * @param batchParameters If the event target is an AWS Batch job, this contains the job
       * definition, job name, and other parameters.
       * For more information, see
       * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
       * Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3982e4b35d00e3d63457bc59d29e4364e0ab5494c552421864ae6649cf21d70f")
      public fun batchParameters(batchParameters: BatchParametersProperty.Builder.() -> Unit)

      /**
       * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
       * dead-letter queue events to.
       */
      public fun deadLetterConfig(deadLetterConfig: IResolvable)

      /**
       * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
       * dead-letter queue events to.
       */
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty)

      /**
       * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
       * dead-letter queue events to.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711efd0854464536e7118fe500415fc3ab9cbbb07630849db5a7925c32e8e8dc")
      public fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit)

      /**
       * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
       * the event target is an Amazon ECS task.
       * For more information about Amazon ECS tasks, see [Task
       * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
       * in the *Amazon EC2 Container Service Developer Guide* .
       */
      public fun ecsParameters(ecsParameters: IResolvable)

      /**
       * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
       * the event target is an Amazon ECS task.
       * For more information about Amazon ECS tasks, see [Task
       * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
       * in the *Amazon EC2 Container Service Developer Guide* .
       */
      public fun ecsParameters(ecsParameters: EcsParametersProperty)

      /**
       * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
       * the event target is an Amazon ECS task.
       * For more information about Amazon ECS tasks, see [Task
       * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
       * in the *Amazon EC2 Container Service Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4525cc9e72f77b18206f45d184df4bdf052c78b1042f8102ad34b2daed70656e")
      public fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit)

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use
       * this parameter to specify headers, path parameters, and query string keys/values as part of
       * your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      public fun httpParameters(httpParameters: IResolvable)

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use
       * this parameter to specify headers, path parameters, and query string keys/values as part of
       * your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      public fun httpParameters(httpParameters: HttpParametersProperty)

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use
       * this parameter to specify headers, path parameters, and query string keys/values as part of
       * your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e07d0b44263bd9d013ec8e2ae8cbf69f639c468e83999b1c5ae07e2797e0ebb")
      public fun httpParameters(httpParameters: HttpParametersProperty.Builder.() -> Unit)

      /**
       * @param id The ID of the target within the specified rule. 
       * Use this ID to reference the target when updating the rule. We recommend using a memorable
       * and unique string.
       */
      public fun id(id: String)

      /**
       * @param input Valid JSON text passed to the target.
       * In this case, nothing from the event itself is passed to the target. For more information,
       * see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       */
      public fun input(input: String)

      /**
       * @param inputPath The value of the JSONPath that is used for extracting part of the matched
       * event when passing it to the target.
       * You may use JSON dot notation or bracket notation. For more information about JSON paths,
       * see [JSONPath](https://docs.aws.amazon.com/http://goessner.net/articles/JsonPath/) .
       */
      public fun inputPath(inputPath: String)

      /**
       * @param inputTransformer Settings to enable you to provide custom input to a target based on
       * certain event data.
       * You can extract one or more key-value pairs from the event and then use that data to send
       * customized input to the target.
       */
      public fun inputTransformer(inputTransformer: IResolvable)

      /**
       * @param inputTransformer Settings to enable you to provide custom input to a target based on
       * certain event data.
       * You can extract one or more key-value pairs from the event and then use that data to send
       * customized input to the target.
       */
      public fun inputTransformer(inputTransformer: InputTransformerProperty)

      /**
       * @param inputTransformer Settings to enable you to provide custom input to a target based on
       * certain event data.
       * You can extract one or more key-value pairs from the event and then use that data to send
       * customized input to the target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eed2a6ebb2309a5a6aa88a354335abed39dad9fc30881c01f50e88c5943d649")
      public fun inputTransformer(inputTransformer: InputTransformerProperty.Builder.() -> Unit)

      /**
       * @param kinesisParameters The custom parameter you can use to control the shard assignment,
       * when the target is a Kinesis data stream.
       * If you do not include this parameter, the default is to use the `eventId` as the partition
       * key.
       */
      public fun kinesisParameters(kinesisParameters: IResolvable)

      /**
       * @param kinesisParameters The custom parameter you can use to control the shard assignment,
       * when the target is a Kinesis data stream.
       * If you do not include this parameter, the default is to use the `eventId` as the partition
       * key.
       */
      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty)

      /**
       * @param kinesisParameters The custom parameter you can use to control the shard assignment,
       * when the target is a Kinesis data stream.
       * If you do not include this parameter, the default is to use the `eventId` as the partition
       * key.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d864eb83fe1b255a63e132ec63a47751ecc2fc95eaf9e68687868e0ef7fd4c36")
      public fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit)

      /**
       * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
       * the target is a Amazon Redshift cluster.
       * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify
       * parameters to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge
       * events.
       */
      public fun redshiftDataParameters(redshiftDataParameters: IResolvable)

      /**
       * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
       * the target is a Amazon Redshift cluster.
       * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify
       * parameters to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge
       * events.
       */
      public fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty)

      /**
       * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
       * the target is a Amazon Redshift cluster.
       * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify
       * parameters to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge
       * events.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("160f736e012bfbd7124ceaff7dae98a94216aed8f6b29dacc68be19292ed6943")
      public
          fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty.Builder.() -> Unit)

      /**
       * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
       * use for the dead-letter queue.
       */
      public fun retryPolicy(retryPolicy: IResolvable)

      /**
       * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
       * use for the dead-letter queue.
       */
      public fun retryPolicy(retryPolicy: RetryPolicyProperty)

      /**
       * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
       * use for the dead-letter queue.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4bca2780f3ad84539d066a093ecc5f07fbe50a541c0d9b592a7224ecf22ece1b")
      public fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be used for this target
       * when the rule is triggered.
       * If one rule triggers multiple targets, you can use a different IAM role for each target.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon
       * EC2 Run Command.
       */
      public fun runCommandParameters(runCommandParameters: IResolvable)

      /**
       * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon
       * EC2 Run Command.
       */
      public fun runCommandParameters(runCommandParameters: RunCommandParametersProperty)

      /**
       * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon
       * EC2 Run Command.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2bc3e927b3e1471cb8fbcbd3d0847bd2c344a95b0dc91715c3640cbc672ffdb")
      public
          fun runCommandParameters(runCommandParameters: RunCommandParametersProperty.Builder.() -> Unit)

      /**
       * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline
       * parameters to start execution of a SageMaker Model Building Pipeline.
       * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
       * parameters to start a pipeline execution based on EventBridge events.
       */
      public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable)

      /**
       * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline
       * parameters to start execution of a SageMaker Model Building Pipeline.
       * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
       * parameters to start a pipeline execution based on EventBridge events.
       */
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty)

      /**
       * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline
       * parameters to start execution of a SageMaker Model Building Pipeline.
       * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
       * parameters to start a pipeline execution based on EventBridge events.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e773de01415c981b518d93ff1e6f4f97e74194e27b2fd49706d15475ea83362e")
      public
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty.Builder.() -> Unit)

      /**
       * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue.
       * If you specify an SQS FIFO queue as a target, the queue must have content-based
       * deduplication enabled.
       */
      public fun sqsParameters(sqsParameters: IResolvable)

      /**
       * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue.
       * If you specify an SQS FIFO queue as a target, the queue must have content-based
       * deduplication enabled.
       */
      public fun sqsParameters(sqsParameters: SqsParametersProperty)

      /**
       * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue.
       * If you specify an SQS FIFO queue as a target, the queue must have content-based
       * deduplication enabled.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f10ce2650743bd28f69946a61fa34c1016da897addf1454ed0ab2b78ded9b8c6")
      public fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.events.CfnRule.TargetProperty.Builder
          = software.amazon.awscdk.services.events.CfnRule.TargetProperty.builder()

      /**
       * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
       * event target is an AWS AppSync API.
       */
      override fun appSyncParameters(appSyncParameters: IResolvable) {
        cdkBuilder.appSyncParameters(appSyncParameters.let(IResolvable::unwrap))
      }

      /**
       * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
       * event target is an AWS AppSync API.
       */
      override fun appSyncParameters(appSyncParameters: AppSyncParametersProperty) {
        cdkBuilder.appSyncParameters(appSyncParameters.let(AppSyncParametersProperty::unwrap))
      }

      /**
       * @param appSyncParameters Contains the GraphQL operation to be parsed and executed, if the
       * event target is an AWS AppSync API.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a43551882193e3fe9df2b4bab16721122ca5a46b2fcc0c003a871cf84ec343db")
      override
          fun appSyncParameters(appSyncParameters: AppSyncParametersProperty.Builder.() -> Unit):
          Unit = appSyncParameters(AppSyncParametersProperty(appSyncParameters))

      /**
       * @param arn The Amazon Resource Name (ARN) of the target. 
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      /**
       * @param batchParameters If the event target is an AWS Batch job, this contains the job
       * definition, job name, and other parameters.
       * For more information, see
       * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
       * Guide* .
       */
      override fun batchParameters(batchParameters: IResolvable) {
        cdkBuilder.batchParameters(batchParameters.let(IResolvable::unwrap))
      }

      /**
       * @param batchParameters If the event target is an AWS Batch job, this contains the job
       * definition, job name, and other parameters.
       * For more information, see
       * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
       * Guide* .
       */
      override fun batchParameters(batchParameters: BatchParametersProperty) {
        cdkBuilder.batchParameters(batchParameters.let(BatchParametersProperty::unwrap))
      }

      /**
       * @param batchParameters If the event target is an AWS Batch job, this contains the job
       * definition, job name, and other parameters.
       * For more information, see
       * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
       * Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3982e4b35d00e3d63457bc59d29e4364e0ab5494c552421864ae6649cf21d70f")
      override fun batchParameters(batchParameters: BatchParametersProperty.Builder.() -> Unit):
          Unit = batchParameters(BatchParametersProperty(batchParameters))

      /**
       * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
       * dead-letter queue events to.
       */
      override fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
      }

      /**
       * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
       * dead-letter queue events to.
       */
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig.let(DeadLetterConfigProperty::unwrap))
      }

      /**
       * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
       * dead-letter queue events to.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711efd0854464536e7118fe500415fc3ab9cbbb07630849db5a7925c32e8e8dc")
      override fun deadLetterConfig(deadLetterConfig: DeadLetterConfigProperty.Builder.() -> Unit):
          Unit = deadLetterConfig(DeadLetterConfigProperty(deadLetterConfig))

      /**
       * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
       * the event target is an Amazon ECS task.
       * For more information about Amazon ECS tasks, see [Task
       * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
       * in the *Amazon EC2 Container Service Developer Guide* .
       */
      override fun ecsParameters(ecsParameters: IResolvable) {
        cdkBuilder.ecsParameters(ecsParameters.let(IResolvable::unwrap))
      }

      /**
       * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
       * the event target is an Amazon ECS task.
       * For more information about Amazon ECS tasks, see [Task
       * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
       * in the *Amazon EC2 Container Service Developer Guide* .
       */
      override fun ecsParameters(ecsParameters: EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters.let(EcsParametersProperty::unwrap))
      }

      /**
       * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
       * the event target is an Amazon ECS task.
       * For more information about Amazon ECS tasks, see [Task
       * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
       * in the *Amazon EC2 Container Service Developer Guide* .
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4525cc9e72f77b18206f45d184df4bdf052c78b1042f8102ad34b2daed70656e")
      override fun ecsParameters(ecsParameters: EcsParametersProperty.Builder.() -> Unit): Unit =
          ecsParameters(EcsParametersProperty(ecsParameters))

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use
       * this parameter to specify headers, path parameters, and query string keys/values as part of
       * your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      override fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters.let(IResolvable::unwrap))
      }

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use
       * this parameter to specify headers, path parameters, and query string keys/values as part of
       * your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      override fun httpParameters(httpParameters: HttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters.let(HttpParametersProperty::unwrap))
      }

      /**
       * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
       * endpoint or EventBridge ApiDestination.
       * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use
       * this parameter to specify headers, path parameters, and query string keys/values as part of
       * your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e07d0b44263bd9d013ec8e2ae8cbf69f639c468e83999b1c5ae07e2797e0ebb")
      override fun httpParameters(httpParameters: HttpParametersProperty.Builder.() -> Unit): Unit =
          httpParameters(HttpParametersProperty(httpParameters))

      /**
       * @param id The ID of the target within the specified rule. 
       * Use this ID to reference the target when updating the rule. We recommend using a memorable
       * and unique string.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param input Valid JSON text passed to the target.
       * In this case, nothing from the event itself is passed to the target. For more information,
       * see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       */
      override fun input(input: String) {
        cdkBuilder.input(input)
      }

      /**
       * @param inputPath The value of the JSONPath that is used for extracting part of the matched
       * event when passing it to the target.
       * You may use JSON dot notation or bracket notation. For more information about JSON paths,
       * see [JSONPath](https://docs.aws.amazon.com/http://goessner.net/articles/JsonPath/) .
       */
      override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      /**
       * @param inputTransformer Settings to enable you to provide custom input to a target based on
       * certain event data.
       * You can extract one or more key-value pairs from the event and then use that data to send
       * customized input to the target.
       */
      override fun inputTransformer(inputTransformer: IResolvable) {
        cdkBuilder.inputTransformer(inputTransformer.let(IResolvable::unwrap))
      }

      /**
       * @param inputTransformer Settings to enable you to provide custom input to a target based on
       * certain event data.
       * You can extract one or more key-value pairs from the event and then use that data to send
       * customized input to the target.
       */
      override fun inputTransformer(inputTransformer: InputTransformerProperty) {
        cdkBuilder.inputTransformer(inputTransformer.let(InputTransformerProperty::unwrap))
      }

      /**
       * @param inputTransformer Settings to enable you to provide custom input to a target based on
       * certain event data.
       * You can extract one or more key-value pairs from the event and then use that data to send
       * customized input to the target.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3eed2a6ebb2309a5a6aa88a354335abed39dad9fc30881c01f50e88c5943d649")
      override fun inputTransformer(inputTransformer: InputTransformerProperty.Builder.() -> Unit):
          Unit = inputTransformer(InputTransformerProperty(inputTransformer))

      /**
       * @param kinesisParameters The custom parameter you can use to control the shard assignment,
       * when the target is a Kinesis data stream.
       * If you do not include this parameter, the default is to use the `eventId` as the partition
       * key.
       */
      override fun kinesisParameters(kinesisParameters: IResolvable) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(IResolvable::unwrap))
      }

      /**
       * @param kinesisParameters The custom parameter you can use to control the shard assignment,
       * when the target is a Kinesis data stream.
       * If you do not include this parameter, the default is to use the `eventId` as the partition
       * key.
       */
      override fun kinesisParameters(kinesisParameters: KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters.let(KinesisParametersProperty::unwrap))
      }

      /**
       * @param kinesisParameters The custom parameter you can use to control the shard assignment,
       * when the target is a Kinesis data stream.
       * If you do not include this parameter, the default is to use the `eventId` as the partition
       * key.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d864eb83fe1b255a63e132ec63a47751ecc2fc95eaf9e68687868e0ef7fd4c36")
      override
          fun kinesisParameters(kinesisParameters: KinesisParametersProperty.Builder.() -> Unit):
          Unit = kinesisParameters(KinesisParametersProperty(kinesisParameters))

      /**
       * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
       * the target is a Amazon Redshift cluster.
       * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify
       * parameters to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge
       * events.
       */
      override fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(IResolvable::unwrap))
      }

      /**
       * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
       * the target is a Amazon Redshift cluster.
       * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify
       * parameters to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge
       * events.
       */
      override fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters.let(RedshiftDataParametersProperty::unwrap))
      }

      /**
       * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
       * the target is a Amazon Redshift cluster.
       * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify
       * parameters to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge
       * events.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("160f736e012bfbd7124ceaff7dae98a94216aed8f6b29dacc68be19292ed6943")
      override
          fun redshiftDataParameters(redshiftDataParameters: RedshiftDataParametersProperty.Builder.() -> Unit):
          Unit = redshiftDataParameters(RedshiftDataParametersProperty(redshiftDataParameters))

      /**
       * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
       * use for the dead-letter queue.
       */
      override fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
       * use for the dead-letter queue.
       */
      override fun retryPolicy(retryPolicy: RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy.let(RetryPolicyProperty::unwrap))
      }

      /**
       * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
       * use for the dead-letter queue.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4bca2780f3ad84539d066a093ecc5f07fbe50a541c0d9b592a7224ecf22ece1b")
      override fun retryPolicy(retryPolicy: RetryPolicyProperty.Builder.() -> Unit): Unit =
          retryPolicy(RetryPolicyProperty(retryPolicy))

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be used for this target
       * when the rule is triggered.
       * If one rule triggers multiple targets, you can use a different IAM role for each target.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon
       * EC2 Run Command.
       */
      override fun runCommandParameters(runCommandParameters: IResolvable) {
        cdkBuilder.runCommandParameters(runCommandParameters.let(IResolvable::unwrap))
      }

      /**
       * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon
       * EC2 Run Command.
       */
      override fun runCommandParameters(runCommandParameters: RunCommandParametersProperty) {
        cdkBuilder.runCommandParameters(runCommandParameters.let(RunCommandParametersProperty::unwrap))
      }

      /**
       * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon
       * EC2 Run Command.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2bc3e927b3e1471cb8fbcbd3d0847bd2c344a95b0dc91715c3640cbc672ffdb")
      override
          fun runCommandParameters(runCommandParameters: RunCommandParametersProperty.Builder.() -> Unit):
          Unit = runCommandParameters(RunCommandParametersProperty(runCommandParameters))

      /**
       * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline
       * parameters to start execution of a SageMaker Model Building Pipeline.
       * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
       * parameters to start a pipeline execution based on EventBridge events.
       */
      override fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(IResolvable::unwrap))
      }

      /**
       * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline
       * parameters to start execution of a SageMaker Model Building Pipeline.
       * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
       * parameters to start a pipeline execution based on EventBridge events.
       */
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(SageMakerPipelineParametersProperty::unwrap))
      }

      /**
       * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline
       * parameters to start execution of a SageMaker Model Building Pipeline.
       * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
       * parameters to start a pipeline execution based on EventBridge events.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e773de01415c981b518d93ff1e6f4f97e74194e27b2fd49706d15475ea83362e")
      override
          fun sageMakerPipelineParameters(sageMakerPipelineParameters: SageMakerPipelineParametersProperty.Builder.() -> Unit):
          Unit =
          sageMakerPipelineParameters(SageMakerPipelineParametersProperty(sageMakerPipelineParameters))

      /**
       * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue.
       * If you specify an SQS FIFO queue as a target, the queue must have content-based
       * deduplication enabled.
       */
      override fun sqsParameters(sqsParameters: IResolvable) {
        cdkBuilder.sqsParameters(sqsParameters.let(IResolvable::unwrap))
      }

      /**
       * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue.
       * If you specify an SQS FIFO queue as a target, the queue must have content-based
       * deduplication enabled.
       */
      override fun sqsParameters(sqsParameters: SqsParametersProperty) {
        cdkBuilder.sqsParameters(sqsParameters.let(SqsParametersProperty::unwrap))
      }

      /**
       * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue.
       * If you specify an SQS FIFO queue as a target, the queue must have content-based
       * deduplication enabled.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f10ce2650743bd28f69946a61fa34c1016da897addf1454ed0ab2b78ded9b8c6")
      override fun sqsParameters(sqsParameters: SqsParametersProperty.Builder.() -> Unit): Unit =
          sqsParameters(SqsParametersProperty(sqsParameters))

      public fun build(): software.amazon.awscdk.services.events.CfnRule.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.events.CfnRule.TargetProperty,
    ) : CdkObject(cdkObject), TargetProperty {
      /**
       * Contains the GraphQL operation to be parsed and executed, if the event target is an AWS
       * AppSync API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-appsyncparameters)
       */
      override fun appSyncParameters(): Any? = unwrap(this).getAppSyncParameters()

      /**
       * The Amazon Resource Name (ARN) of the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-arn)
       */
      override fun arn(): String = unwrap(this).getArn()

      /**
       * If the event target is an AWS Batch job, this contains the job definition, job name, and
       * other parameters.
       *
       * For more information, see
       * [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
       * Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-batchparameters)
       */
      override fun batchParameters(): Any? = unwrap(this).getBatchParameters()

      /**
       * The `DeadLetterConfig` that defines the target queue to send dead-letter queue events to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-deadletterconfig)
       */
      override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

      /**
       * Contains the Amazon ECS task definition and task count to be used, if the event target is
       * an Amazon ECS task.
       *
       * For more information about Amazon ECS tasks, see [Task
       * Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
       * in the *Amazon EC2 Container Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-ecsparameters)
       */
      override fun ecsParameters(): Any? = unwrap(this).getEcsParameters()

      /**
       * Contains the HTTP parameters to use when the target is a API Gateway endpoint or
       * EventBridge ApiDestination.
       *
       * If you specify an API Gateway API or EventBridge ApiDestination as a target, you can use
       * this parameter to specify headers, path parameters, and query string keys/values as part of
       * your target invoking request. If you're using ApiDestinations, the corresponding Connection
       * can also have these values configured. In case of any conflicting keys, values from the
       * Connection take precedence.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-httpparameters)
       */
      override fun httpParameters(): Any? = unwrap(this).getHttpParameters()

      /**
       * The ID of the target within the specified rule.
       *
       * Use this ID to reference the target when updating the rule. We recommend using a memorable
       * and unique string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * Valid JSON text passed to the target.
       *
       * In this case, nothing from the event itself is passed to the target. For more information,
       * see [The JavaScript Object Notation (JSON) Data Interchange
       * Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-input)
       */
      override fun input(): String? = unwrap(this).getInput()

      /**
       * The value of the JSONPath that is used for extracting part of the matched event when
       * passing it to the target.
       *
       * You may use JSON dot notation or bracket notation. For more information about JSON paths,
       * see [JSONPath](https://docs.aws.amazon.com/http://goessner.net/articles/JsonPath/) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputpath)
       */
      override fun inputPath(): String? = unwrap(this).getInputPath()

      /**
       * Settings to enable you to provide custom input to a target based on certain event data.
       *
       * You can extract one or more key-value pairs from the event and then use that data to send
       * customized input to the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-inputtransformer)
       */
      override fun inputTransformer(): Any? = unwrap(this).getInputTransformer()

      /**
       * The custom parameter you can use to control the shard assignment, when the target is a
       * Kinesis data stream.
       *
       * If you do not include this parameter, the default is to use the `eventId` as the partition
       * key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-kinesisparameters)
       */
      override fun kinesisParameters(): Any? = unwrap(this).getKinesisParameters()

      /**
       * Contains the Amazon Redshift Data API parameters to use when the target is a Amazon
       * Redshift cluster.
       *
       * If you specify a Amazon Redshift Cluster as a Target, you can use this to specify
       * parameters to invoke the Amazon Redshift Data API ExecuteStatement based on EventBridge
       * events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-redshiftdataparameters)
       */
      override fun redshiftDataParameters(): Any? = unwrap(this).getRedshiftDataParameters()

      /**
       * The `RetryPolicy` object that contains the retry policy configuration to use for the
       * dead-letter queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-retrypolicy)
       */
      override fun retryPolicy(): Any? = unwrap(this).getRetryPolicy()

      /**
       * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is
       * triggered.
       *
       * If one rule triggers multiple targets, you can use a different IAM role for each target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-runcommandparameters)
       */
      override fun runCommandParameters(): Any? = unwrap(this).getRunCommandParameters()

      /**
       * Contains the SageMaker Model Building Pipeline parameters to start execution of a SageMaker
       * Model Building Pipeline.
       *
       * If you specify a SageMaker Model Building Pipeline as a target, you can use this to specify
       * parameters to start a pipeline execution based on EventBridge events.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-sagemakerpipelineparameters)
       */
      override fun sageMakerPipelineParameters(): Any? =
          unwrap(this).getSageMakerPipelineParameters()

      /**
       * Contains the message group ID to use when the target is a FIFO queue.
       *
       * If you specify an SQS FIFO queue as a target, the queue must have content-based
       * deduplication enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html#cfn-events-rule-target-sqsparameters)
       */
      override fun sqsParameters(): Any? = unwrap(this).getSqsParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.TargetProperty):
          TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.events.CfnRule.TargetProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnRule.TargetProperty
    }
  }

  public interface BatchArrayPropertiesProperty {
    /**
     * The size of the array, if this is an array batch job.
     *
     * Valid values are integers between 2 and 10,000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html#cfn-events-rule-batcharrayproperties-size)
     */
    public fun size(): Number? = unwrap(this).getSize()

    /**
     * A builder for [BatchArrayPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param size The size of the array, if this is an array batch job.
       * Valid values are integers between 2 and 10,000.
       */
      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty.builder()

      /**
       * @param size The size of the array, if this is an array batch job.
       * Valid values are integers between 2 and 10,000.
       */
      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty,
    ) : CdkObject(cdkObject), BatchArrayPropertiesProperty {
      /**
       * The size of the array, if this is an array batch job.
       *
       * Valid values are integers between 2 and 10,000.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html#cfn-events-rule-batcharrayproperties-size)
       */
      override fun size(): Number? = unwrap(this).getSize()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchArrayPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty):
          BatchArrayPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchArrayPropertiesProperty):
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty
    }
  }

  public interface RunCommandParametersProperty {
    /**
     * Currently, we support including only one RunCommandTarget block, which specifies either an
     * array of InstanceIds or a tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets)
     */
    public fun runCommandTargets(): Any

    /**
     * A builder for [RunCommandParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param runCommandTargets Currently, we support including only one RunCommandTarget block,
       * which specifies either an array of InstanceIds or a tag. 
       */
      public fun runCommandTargets(runCommandTargets: IResolvable)

      /**
       * @param runCommandTargets Currently, we support including only one RunCommandTarget block,
       * which specifies either an array of InstanceIds or a tag. 
       */
      public fun runCommandTargets(runCommandTargets: List<Any>)

      /**
       * @param runCommandTargets Currently, we support including only one RunCommandTarget block,
       * which specifies either an array of InstanceIds or a tag. 
       */
      public fun runCommandTargets(vararg runCommandTargets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty.builder()

      /**
       * @param runCommandTargets Currently, we support including only one RunCommandTarget block,
       * which specifies either an array of InstanceIds or a tag. 
       */
      override fun runCommandTargets(runCommandTargets: IResolvable) {
        cdkBuilder.runCommandTargets(runCommandTargets.let(IResolvable::unwrap))
      }

      /**
       * @param runCommandTargets Currently, we support including only one RunCommandTarget block,
       * which specifies either an array of InstanceIds or a tag. 
       */
      override fun runCommandTargets(runCommandTargets: List<Any>) {
        cdkBuilder.runCommandTargets(runCommandTargets)
      }

      /**
       * @param runCommandTargets Currently, we support including only one RunCommandTarget block,
       * which specifies either an array of InstanceIds or a tag. 
       */
      override fun runCommandTargets(vararg runCommandTargets: Any): Unit =
          runCommandTargets(runCommandTargets.toList())

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty,
    ) : CdkObject(cdkObject), RunCommandParametersProperty {
      /**
       * Currently, we support including only one RunCommandTarget block, which specifies either an
       * array of InstanceIds or a tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandparameters.html#cfn-events-rule-runcommandparameters-runcommandtargets)
       */
      override fun runCommandTargets(): Any = unwrap(this).getRunCommandTargets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RunCommandParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty):
          RunCommandParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RunCommandParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.RunCommandParametersProperty
    }
  }

  public interface HttpParametersProperty {
    /**
     * The headers that need to be sent as part of request invoking the API Gateway API or
     * EventBridge ApiDestination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-headerparameters)
     */
    public fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

    /**
     * The path parameter values to be used to populate API Gateway API or EventBridge
     * ApiDestination path wildcards ("*").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-pathparametervalues)
     */
    public fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
        emptyList()

    /**
     * The query string keys/values that need to be sent as part of request invoking the API Gateway
     * API or EventBridge ApiDestination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-querystringparameters)
     */
    public fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()

    /**
     * A builder for [HttpParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway API or EventBridge ApiDestination.
       */
      public fun headerParameters(headerParameters: IResolvable)

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway API or EventBridge ApiDestination.
       */
      public fun headerParameters(headerParameters: Map<String, String>)

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway API
       * or EventBridge ApiDestination path wildcards ("*").
       */
      public fun pathParameterValues(pathParameterValues: List<String>)

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway API
       * or EventBridge ApiDestination path wildcards ("*").
       */
      public fun pathParameterValues(vararg pathParameterValues: String)

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway API or EventBridge ApiDestination.
       */
      public fun queryStringParameters(queryStringParameters: IResolvable)

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway API or EventBridge ApiDestination.
       */
      public fun queryStringParameters(queryStringParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty.builder()

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway API or EventBridge ApiDestination.
       */
      override fun headerParameters(headerParameters: IResolvable) {
        cdkBuilder.headerParameters(headerParameters.let(IResolvable::unwrap))
      }

      /**
       * @param headerParameters The headers that need to be sent as part of request invoking the
       * API Gateway API or EventBridge ApiDestination.
       */
      override fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
      }

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway API
       * or EventBridge ApiDestination path wildcards ("*").
       */
      override fun pathParameterValues(pathParameterValues: List<String>) {
        cdkBuilder.pathParameterValues(pathParameterValues)
      }

      /**
       * @param pathParameterValues The path parameter values to be used to populate API Gateway API
       * or EventBridge ApiDestination path wildcards ("*").
       */
      override fun pathParameterValues(vararg pathParameterValues: String): Unit =
          pathParameterValues(pathParameterValues.toList())

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway API or EventBridge ApiDestination.
       */
      override fun queryStringParameters(queryStringParameters: IResolvable) {
        cdkBuilder.queryStringParameters(queryStringParameters.let(IResolvable::unwrap))
      }

      /**
       * @param queryStringParameters The query string keys/values that need to be sent as part of
       * request invoking the API Gateway API or EventBridge ApiDestination.
       */
      override fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
      }

      public fun build(): software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty,
    ) : CdkObject(cdkObject), HttpParametersProperty {
      /**
       * The headers that need to be sent as part of request invoking the API Gateway API or
       * EventBridge ApiDestination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-headerparameters)
       */
      override fun headerParameters(): Any? = unwrap(this).getHeaderParameters()

      /**
       * The path parameter values to be used to populate API Gateway API or EventBridge
       * ApiDestination path wildcards ("*").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-pathparametervalues)
       */
      override fun pathParameterValues(): List<String> = unwrap(this).getPathParameterValues() ?:
          emptyList()

      /**
       * The query string keys/values that need to be sent as part of request invoking the API
       * Gateway API or EventBridge ApiDestination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-httpparameters.html#cfn-events-rule-httpparameters-querystringparameters)
       */
      override fun queryStringParameters(): Any? = unwrap(this).getQueryStringParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty):
          HttpParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpParametersProperty):
          software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.HttpParametersProperty
    }
  }

  public interface SageMakerPipelineParameterProperty {
    /**
     * Name of parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameter.html#cfn-events-rule-sagemakerpipelineparameter-name)
     */
    public fun name(): String

    /**
     * Value of parameter to start execution of a SageMaker Model Building Pipeline.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameter.html#cfn-events-rule-sagemakerpipelineparameter-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SageMakerPipelineParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      public fun name(name: String)

      /**
       * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty.builder()

      /**
       * @param name Name of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value Value of parameter to start execution of a SageMaker Model Building Pipeline. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty,
    ) : CdkObject(cdkObject), SageMakerPipelineParameterProperty {
      /**
       * Name of parameter to start execution of a SageMaker Model Building Pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameter.html#cfn-events-rule-sagemakerpipelineparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Value of parameter to start execution of a SageMaker Model Building Pipeline.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-sagemakerpipelineparameter.html#cfn-events-rule-sagemakerpipelineparameter-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerPipelineParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty):
          SageMakerPipelineParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerPipelineParameterProperty):
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.SageMakerPipelineParameterProperty
    }
  }

  public interface CapacityProviderStrategyItemProperty {
    /**
     * The base value designates how many tasks, at a minimum, to run on the specified capacity
     * provider.
     *
     * Only one capacity provider in a capacity provider strategy can have a base defined. If no
     * value is specified, the default value of 0 is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-capacityproviderstrategyitem.html#cfn-events-rule-capacityproviderstrategyitem-base)
     */
    public fun base(): Number? = unwrap(this).getBase()

    /**
     * The short name of the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-capacityproviderstrategyitem.html#cfn-events-rule-capacityproviderstrategyitem-capacityprovider)
     */
    public fun capacityProvider(): String

    /**
     * The weight value designates the relative percentage of the total number of tasks launched
     * that should use the specified capacity provider.
     *
     * The weight value is taken into consideration after the base value, if defined, is satisfied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-capacityproviderstrategyitem.html#cfn-events-rule-capacityproviderstrategyitem-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [CapacityProviderStrategyItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param base The base value designates how many tasks, at a minimum, to run on the specified
       * capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of 0 is used.
       */
      public fun base(base: Number)

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      public fun capacityProvider(capacityProvider: String)

      /**
       * @param weight The weight value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty.builder()

      /**
       * @param base The base value designates how many tasks, at a minimum, to run on the specified
       * capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of 0 is used.
       */
      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      /**
       * @param capacityProvider The short name of the capacity provider. 
       */
      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      /**
       * @param weight The weight value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject), CapacityProviderStrategyItemProperty {
      /**
       * The base value designates how many tasks, at a minimum, to run on the specified capacity
       * provider.
       *
       * Only one capacity provider in a capacity provider strategy can have a base defined. If no
       * value is specified, the default value of 0 is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-capacityproviderstrategyitem.html#cfn-events-rule-capacityproviderstrategyitem-base)
       */
      override fun base(): Number? = unwrap(this).getBase()

      /**
       * The short name of the capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-capacityproviderstrategyitem.html#cfn-events-rule-capacityproviderstrategyitem-capacityprovider)
       */
      override fun capacityProvider(): String = unwrap(this).getCapacityProvider()

      /**
       * The weight value designates the relative percentage of the total number of tasks launched
       * that should use the specified capacity provider.
       *
       * The weight value is taken into consideration after the base value, if defined, is
       * satisfied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-capacityproviderstrategyitem.html#cfn-events-rule-capacityproviderstrategyitem-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.CapacityProviderStrategyItemProperty
    }
  }

  public interface NetworkConfigurationProperty {
    /**
     * Use this structure to specify the VPC subnets and security groups for the task, and whether a
     * public IP address is to be used.
     *
     * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html#cfn-events-rule-networkconfiguration-awsvpcconfiguration)
     */
    public fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable)

      /**
       * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      public fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty)

      /**
       * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6ea4a14f17bc1f53e0aaaea09129ec4ebd9943a3b87f85d40a3b0797c144160")
      public
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty.builder()

      /**
       * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      override fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      override fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      /**
       * @param awsVpcConfiguration Use this structure to specify the VPC subnets and security
       * groups for the task, and whether a public IP address is to be used.
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6ea4a14f17bc1f53e0aaaea09129ec4ebd9943a3b87f85d40a3b0797c144160")
      override
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsVpcConfiguration(AwsVpcConfigurationProperty(awsVpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * Use this structure to specify the VPC subnets and security groups for the task, and whether
       * a public IP address is to be used.
       *
       * This structure is relevant only for ECS tasks that use the `awsvpc` network mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html#cfn-events-rule-networkconfiguration-awsvpcconfiguration)
       */
      override fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.events.CfnRule.NetworkConfigurationProperty
    }
  }
}
