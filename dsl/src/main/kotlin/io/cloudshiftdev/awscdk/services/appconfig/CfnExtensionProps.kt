package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnExtensionProps {
  /**
   * The actions defined in the extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-actions)
   */
  public fun actions(): Any

  /**
   * Information about the extension.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * You can omit this field when you create an extension.
   *
   * When you create a new version, specify the most recent current version number. For example, you
   * create version 3, enter 2 for this field.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-latestversionnumber)
   */
  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * A name for the extension.
   *
   * Each extension name in your account must be unique. Extension versions use the same name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-name)
   */
  public fun name(): String

  /**
   * The parameters accepted by the extension.
   *
   * You specify parameter values when you associate the extension to an AWS AppConfig resource by
   * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
   * parameters are included in the Lambda request object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * Adds one or more tags for the specified extension.
   *
   * Tags are metadata that help you categorize resources in different ways, for example, by
   * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
   * you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnExtensionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions defined in the extension. 
     */
    public fun actions(actions: Any)

    /**
     * @param description Information about the extension.
     */
    public fun description(description: String)

    /**
     * @param latestVersionNumber You can omit this field when you create an extension.
     * When you create a new version, specify the most recent current version number. For example,
     * you create version 3, enter 2 for this field.
     */
    public fun latestVersionNumber(latestVersionNumber: Number)

    /**
     * @param name A name for the extension. 
     * Each extension name in your account must be unique. Extension versions use the same name.
     */
    public fun name(name: String)

    /**
     * @param parameters The parameters accepted by the extension.
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters The parameters accepted by the extension.
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param tags Adds one or more tags for the specified extension.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Adds one or more tags for the specified extension.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnExtensionProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnExtensionProps.builder()

    /**
     * @param actions The actions defined in the extension. 
     */
    override fun actions(actions: Any) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param description Information about the extension.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param latestVersionNumber You can omit this field when you create an extension.
     * When you create a new version, specify the most recent current version number. For example,
     * you create version 3, enter 2 for this field.
     */
    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * @param name A name for the extension. 
     * Each extension name in your account must be unique. Extension versions use the same name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameters accepted by the extension.
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * @param parameters The parameters accepted by the extension.
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags Adds one or more tags for the specified extension.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Adds one or more tags for the specified extension.
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnExtensionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionProps,
  ) : CdkObject(cdkObject), CfnExtensionProps {
    /**
     * The actions defined in the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-actions)
     */
    override fun actions(): Any = unwrap(this).getActions()

    /**
     * Information about the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * You can omit this field when you create an extension.
     *
     * When you create a new version, specify the most recent current version number. For example,
     * you create version 3, enter 2 for this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-latestversionnumber)
     */
    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    /**
     * A name for the extension.
     *
     * Each extension name in your account must be unique. Extension versions use the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Adds one or more tags for the specified extension.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnExtensionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtensionProps):
        CfnExtensionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnExtensionProps):
        software.amazon.awscdk.services.appconfig.CfnExtensionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.CfnExtensionProps
  }
}
