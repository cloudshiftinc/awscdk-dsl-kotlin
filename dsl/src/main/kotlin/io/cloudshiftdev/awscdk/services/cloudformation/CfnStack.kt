package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStack internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudformation.CfnStack,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the unique ID of the change set.
   */
  public open fun attrChangeSetId(): String = unwrap(this).getAttrChangeSetId()

  /**
   * Returns The time at which the stack was created.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * Returns the time the stack was last updated.
   *
   * This will only be returned if the stack has been updated at least once.
   */
  public open fun attrLastUpdateTime(): String = unwrap(this).getAttrLastUpdateTime()

  /**
   * Returns a list of output structures.
   */
  public open fun attrOutputs(): IResolvable = unwrap(this).getAttrOutputs().let(IResolvable::wrap)

  /**
   * For nested stacks--stacks created as resources for another stack--returns the stack ID of the
   * direct parent of this stack.
   *
   * For the first level of nested stacks, the root stack is also the parent stack.
   *
   * For more information, see [Working with Nested
   * Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html)
   * in the *AWS CloudFormation User Guide* .
   */
  public open fun attrParentId(): String = unwrap(this).getAttrParentId()

  /**
   * For nested stacks--stacks created as resources for another stack--returns the stack ID of the
   * top-level stack to which the nested stack ultimately belongs.
   *
   * For more information, see [Working with Nested
   * Stacks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html)
   * in the *AWS CloudFormation User Guide* .
   */
  public open fun attrRootId(): String = unwrap(this).getAttrRootId()

  /**
   * Returns the unique identifier of the stack.
   */
  public open fun attrStackId(): String = unwrap(this).getAttrStackId()

  /**
   * Returns a success or failure message associated with the stack status.
   */
  public open fun attrStackStatus(): String = unwrap(this).getAttrStackStatus()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events.
   */
  public open fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
      emptyList()

  /**
   * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events.
   */
  public open fun notificationArns(`value`: List<String>) {
    unwrap(this).setNotificationArns(`value`)
  }

  /**
   * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related events.
   */
  public open fun notificationArns(vararg `value`: String): Unit =
      notificationArns(`value`.toList())

  /**
   * The set value pairs that represent the parameters passed to CloudFormation when this nested
   * stack is created.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The set value pairs that represent the parameters passed to CloudFormation when this nested
   * stack is created.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The set value pairs that represent the parameters passed to CloudFormation when this nested
   * stack is created.
   */
  public open fun parameters(`value`: Map<String, String>) {
    unwrap(this).setParameters(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs to associate with this stack.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs to associate with this stack.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs to associate with this stack.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Location of file containing the template body.
   */
  public open fun templateUrl(): String? = unwrap(this).getTemplateUrl()

  /**
   * Location of file containing the template body.
   */
  public open fun templateUrl(`value`: String) {
    unwrap(this).setTemplateUrl(`value`)
  }

  /**
   * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
   * `CREATE_COMPLETE` state.
   */
  public open fun timeoutInMinutes(): Number? = unwrap(this).getTimeoutInMinutes()

  /**
   * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
   * `CREATE_COMPLETE` state.
   */
  public open fun timeoutInMinutes(`value`: Number) {
    unwrap(this).setTimeoutInMinutes(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudformation.CfnStack].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related
     * events.
     *
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
     * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
     * publish stack related events. 
     */
    public fun notificationArns(notificationArns: List<String>)

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related
     * events.
     *
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
     * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
     * publish stack related events. 
     */
    public fun notificationArns(vararg notificationArns: String)

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created. 
     */
    public fun parameters(parameters: Map<String, String>)

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to the resources created in the stack. A
     * maximum number of 50 tags can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to the resources created in the stack. A
     * maximum number of 50 tags can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Location of file containing the template body.
     *
     * The URL must point to a template (max size: 460,800 bytes) that's located in an Amazon S3
     * bucket. For more information, see [Template
     * anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html) .
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-templateurl)
     * @param templateUrl Location of file containing the template body. 
     */
    public fun templateUrl(templateUrl: String)

    /**
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * `CREATE_COMPLETE` state.
     *
     * The default is no timeout. When CloudFormation detects that the nested stack has reached the
     * `CREATE_COMPLETE` state, it marks the nested stack resource as `CREATE_COMPLETE` in the parent
     * stack and resumes creating the parent stack. If the timeout period expires before the nested
     * stack reaches `CREATE_COMPLETE` , CloudFormation marks the nested stack as failed and rolls back
     * both the nested stack and parent stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-timeoutinminutes)
     * @param timeoutInMinutes The length of time, in minutes, that CloudFormation waits for the
     * nested stack to reach the `CREATE_COMPLETE` state. 
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnStack.Builder =
        software.amazon.awscdk.services.cloudformation.CfnStack.Builder.create(scope, id)

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related
     * events.
     *
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
     * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
     * publish stack related events. 
     */
    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    /**
     * The Amazon Simple Notification Service (Amazon SNS) topic ARNs to publish stack related
     * events.
     *
     * You can find your Amazon SNS topic ARNs using the Amazon SNS console or your Command Line
     * Interface (CLI).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-notificationarns)
     * @param notificationArns The Amazon Simple Notification Service (Amazon SNS) topic ARNs to
     * publish stack related events. 
     */
    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * The set value pairs that represent the parameters passed to CloudFormation when this nested
     * stack is created.
     *
     * Each parameter has a name corresponding to a parameter defined in the embedded template and a
     * value representing the value that you want to set for the parameter.
     *
     *
     * If you use the `Ref` function to pass a parameter value to a nested stack, comma-delimited
     * list parameters must be of type `String` . In other words, you can't pass values that are of
     * type `CommaDelimitedList` to nested stacks.
     *
     *
     * Conditional. Required if the nested stack requires input parameters.
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-parameters)
     * @param parameters The set value pairs that represent the parameters passed to CloudFormation
     * when this nested stack is created. 
     */
    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to the resources created in the stack. A
     * maximum number of 50 tags can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs to associate with this stack.
     *
     * AWS CloudFormation also propagates these tags to the resources created in the stack. A
     * maximum number of 50 tags can be specified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-tags)
     * @param tags Key-value pairs to associate with this stack. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Location of file containing the template body.
     *
     * The URL must point to a template (max size: 460,800 bytes) that's located in an Amazon S3
     * bucket. For more information, see [Template
     * anatomy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html) .
     *
     * Whether an update causes interruptions depends on the resources that are being updated. An
     * update never causes a nested stack to be replaced.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-templateurl)
     * @param templateUrl Location of file containing the template body. 
     */
    override fun templateUrl(templateUrl: String) {
      cdkBuilder.templateUrl(templateUrl)
    }

    /**
     * The length of time, in minutes, that CloudFormation waits for the nested stack to reach the
     * `CREATE_COMPLETE` state.
     *
     * The default is no timeout. When CloudFormation detects that the nested stack has reached the
     * `CREATE_COMPLETE` state, it marks the nested stack resource as `CREATE_COMPLETE` in the parent
     * stack and resumes creating the parent stack. If the timeout period expires before the nested
     * stack reaches `CREATE_COMPLETE` , CloudFormation marks the nested stack as failed and rolls back
     * both the nested stack and parent stack.
     *
     * Updates aren't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-stack.html#cfn-cloudformation-stack-timeoutinminutes)
     * @param timeoutInMinutes The length of time, in minutes, that CloudFormation waits for the
     * nested stack to reach the `CREATE_COMPLETE` state. 
     */
    override fun timeoutInMinutes(timeoutInMinutes: Number) {
      cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnStack = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnStack.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStack): CfnStack
        = CfnStack(cdkObject)

    internal fun unwrap(wrapped: CfnStack): software.amazon.awscdk.services.cloudformation.CfnStack
        = wrapped.cdkObject
  }

  public interface OutputProperty {
    /**
     * User defined description associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the export associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-exportname)
     */
    public fun exportName(): String? = unwrap(this).getExportName()

    /**
     * The key associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-outputkey)
     */
    public fun outputKey(): String? = unwrap(this).getOutputKey()

    /**
     * The value associated with the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-outputvalue)
     */
    public fun outputValue(): String? = unwrap(this).getOutputValue()

    /**
     * A builder for [OutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description User defined description associated with the output.
       */
      public fun description(description: String)

      /**
       * @param exportName The name of the export associated with the output.
       */
      public fun exportName(exportName: String)

      /**
       * @param outputKey The key associated with the output.
       */
      public fun outputKey(outputKey: String)

      /**
       * @param outputValue The value associated with the output.
       */
      public fun outputValue(outputValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudformation.CfnStack.OutputProperty.Builder =
          software.amazon.awscdk.services.cloudformation.CfnStack.OutputProperty.builder()

      /**
       * @param description User defined description associated with the output.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param exportName The name of the export associated with the output.
       */
      override fun exportName(exportName: String) {
        cdkBuilder.exportName(exportName)
      }

      /**
       * @param outputKey The key associated with the output.
       */
      override fun outputKey(outputKey: String) {
        cdkBuilder.outputKey(outputKey)
      }

      /**
       * @param outputValue The value associated with the output.
       */
      override fun outputValue(outputValue: String) {
        cdkBuilder.outputValue(outputValue)
      }

      public fun build(): software.amazon.awscdk.services.cloudformation.CfnStack.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.cloudformation.CfnStack.OutputProperty,
    ) : CdkObject(cdkObject), OutputProperty {
      /**
       * User defined description associated with the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name of the export associated with the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-exportname)
       */
      override fun exportName(): String? = unwrap(this).getExportName()

      /**
       * The key associated with the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-outputkey)
       */
      override fun outputKey(): String? = unwrap(this).getOutputKey()

      /**
       * The value associated with the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html#cfn-cloudformation-stack-output-outputvalue)
       */
      override fun outputValue(): String? = unwrap(this).getOutputValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnStack.OutputProperty):
          OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.cloudformation.CfnStack.OutputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudformation.CfnStack.OutputProperty
    }
  }
}
