package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAppBlockBuilder internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The access endpoints of the app block builder.
   */
  public open fun accessEndpoints(): Any? = unwrap(this).getAccessEndpoints()

  /**
   * The access endpoints of the app block builder.
   */
  public open fun accessEndpoints(`value`: IResolvable) {
    unwrap(this).setAccessEndpoints(`value`.let(IResolvable::unwrap))
  }

  /**
   * The access endpoints of the app block builder.
   */
  public open fun accessEndpoints(__idx_ac66f0: List<Any>) {
    unwrap(this).setAccessEndpoints(__idx_ac66f0)
  }

  /**
   * The access endpoints of the app block builder.
   */
  public open fun accessEndpoints(vararg __idx_ac66f0: Any): Unit =
      accessEndpoints(__idx_ac66f0.toList())

  /**
   * The ARN of the app block.
   */
  public open fun appBlockArns(): List<String> = unwrap(this).getAppBlockArns() ?: emptyList()

  /**
   * The ARN of the app block.
   */
  public open fun appBlockArns(`value`: List<String>) {
    unwrap(this).setAppBlockArns(`value`)
  }

  /**
   * The ARN of the app block.
   */
  public open fun appBlockArns(vararg `value`: String): Unit = appBlockArns(`value`.toList())

  /**
   * The ARN of the app block builder.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time when the app block builder was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the app block builder.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the app block builder.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the app block builder.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the app block builder.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Indicates whether default internet access is enabled for the app block builder.
   */
  public open fun enableDefaultInternetAccess(): Any? =
      unwrap(this).getEnableDefaultInternetAccess()

  /**
   * Indicates whether default internet access is enabled for the app block builder.
   */
  public open fun enableDefaultInternetAccess(`value`: Boolean) {
    unwrap(this).setEnableDefaultInternetAccess(`value`)
  }

  /**
   * Indicates whether default internet access is enabled for the app block builder.
   */
  public open fun enableDefaultInternetAccess(`value`: IResolvable) {
    unwrap(this).setEnableDefaultInternetAccess(`value`.let(IResolvable::unwrap))
  }

  /**
   * The ARN of the IAM role that is applied to the app block builder.
   */
  public open fun iamRoleArn(): String? = unwrap(this).getIamRoleArn()

  /**
   * The ARN of the IAM role that is applied to the app block builder.
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
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
   * The instance type of the app block builder.
   */
  public open fun instanceType(): String = unwrap(this).getInstanceType()

  /**
   * The instance type of the app block builder.
   */
  public open fun instanceType(`value`: String) {
    unwrap(this).setInstanceType(`value`)
  }

  /**
   * The name of the app block builder.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the app block builder.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The platform of the app block builder.
   */
  public open fun platform(): String = unwrap(this).getPlatform()

  /**
   * The platform of the app block builder.
   */
  public open fun platform(`value`: String) {
    unwrap(this).setPlatform(`value`)
  }

  /**
   * The tags of the app block builder.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags of the app block builder.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags of the app block builder.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The VPC configuration for the app block builder.
   */
  public open fun vpcConfig(): Any = unwrap(this).getVpcConfig()

  /**
   * The VPC configuration for the app block builder.
   */
  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The VPC configuration for the app block builder.
   */
  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  /**
   * The VPC configuration for the app block builder.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a3edff5b63846cfdd4bbb131d81bc92960619d49a19823a471887dc498760655")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appstream.CfnAppBlockBuilder].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The access endpoints of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
     * @param accessEndpoints The access endpoints of the app block builder. 
     */
    public fun accessEndpoints(accessEndpoints: IResolvable)

    /**
     * The access endpoints of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
     * @param accessEndpoints The access endpoints of the app block builder. 
     */
    public fun accessEndpoints(accessEndpoints: List<Any>)

    /**
     * The access endpoints of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
     * @param accessEndpoints The access endpoints of the app block builder. 
     */
    public fun accessEndpoints(vararg accessEndpoints: Any)

    /**
     * The ARN of the app block.
     *
     * *Maximum* : `1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
     * @param appBlockArns The ARN of the app block. 
     */
    public fun appBlockArns(appBlockArns: List<String>)

    /**
     * The ARN of the app block.
     *
     * *Maximum* : `1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
     * @param appBlockArns The ARN of the app block. 
     */
    public fun appBlockArns(vararg appBlockArns: String)

    /**
     * The description of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-description)
     * @param description The description of the app block builder. 
     */
    public fun description(description: String)

    /**
     * The display name of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-displayname)
     * @param displayName The display name of the app block builder. 
     */
    public fun displayName(displayName: String)

    /**
     * Indicates whether default internet access is enabled for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder. 
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean)

    /**
     * Indicates whether default internet access is enabled for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder. 
     */
    public fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable)

    /**
     * The ARN of the IAM role that is applied to the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-iamrolearn)
     * @param iamRoleArn The ARN of the IAM role that is applied to the app block builder. 
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * The instance type of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-instancetype)
     * @param instanceType The instance type of the app block builder. 
     */
    public fun instanceType(instanceType: String)

    /**
     * The name of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-name)
     * @param name The name of the app block builder. 
     */
    public fun name(name: String)

    /**
     * The platform of the app block builder.
     *
     * *Allowed values* : `WINDOWS_SERVER_2019`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-platform)
     * @param platform The platform of the app block builder. 
     */
    public fun platform(platform: String)

    /**
     * The tags of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
     * @param tags The tags of the app block builder. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
     * @param tags The tags of the app block builder. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The VPC configuration for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * The VPC configuration for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    /**
     * The VPC configuration for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cfc0a6de75123b3c9c88168a415957bc3f8003b7dee385825c191b78bff81ef")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.Builder =
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.Builder.create(scope, id)

    /**
     * The access endpoints of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
     * @param accessEndpoints The access endpoints of the app block builder. 
     */
    override fun accessEndpoints(accessEndpoints: IResolvable) {
      cdkBuilder.accessEndpoints(accessEndpoints.let(IResolvable::unwrap))
    }

    /**
     * The access endpoints of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
     * @param accessEndpoints The access endpoints of the app block builder. 
     */
    override fun accessEndpoints(accessEndpoints: List<Any>) {
      cdkBuilder.accessEndpoints(accessEndpoints)
    }

    /**
     * The access endpoints of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-accessendpoints)
     * @param accessEndpoints The access endpoints of the app block builder. 
     */
    override fun accessEndpoints(vararg accessEndpoints: Any): Unit =
        accessEndpoints(accessEndpoints.toList())

    /**
     * The ARN of the app block.
     *
     * *Maximum* : `1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
     * @param appBlockArns The ARN of the app block. 
     */
    override fun appBlockArns(appBlockArns: List<String>) {
      cdkBuilder.appBlockArns(appBlockArns)
    }

    /**
     * The ARN of the app block.
     *
     * *Maximum* : `1`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-appblockarns)
     * @param appBlockArns The ARN of the app block. 
     */
    override fun appBlockArns(vararg appBlockArns: String): Unit =
        appBlockArns(appBlockArns.toList())

    /**
     * The description of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-description)
     * @param description The description of the app block builder. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-displayname)
     * @param displayName The display name of the app block builder. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Indicates whether default internet access is enabled for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder. 
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: Boolean) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess)
    }

    /**
     * Indicates whether default internet access is enabled for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-enabledefaultinternetaccess)
     * @param enableDefaultInternetAccess Indicates whether default internet access is enabled for
     * the app block builder. 
     */
    override fun enableDefaultInternetAccess(enableDefaultInternetAccess: IResolvable) {
      cdkBuilder.enableDefaultInternetAccess(enableDefaultInternetAccess.let(IResolvable::unwrap))
    }

    /**
     * The ARN of the IAM role that is applied to the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-iamrolearn)
     * @param iamRoleArn The ARN of the IAM role that is applied to the app block builder. 
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * The instance type of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-instancetype)
     * @param instanceType The instance type of the app block builder. 
     */
    override fun instanceType(instanceType: String) {
      cdkBuilder.instanceType(instanceType)
    }

    /**
     * The name of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-name)
     * @param name The name of the app block builder. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The platform of the app block builder.
     *
     * *Allowed values* : `WINDOWS_SERVER_2019`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-platform)
     * @param platform The platform of the app block builder. 
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * The tags of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
     * @param tags The tags of the app block builder. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags of the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-tags)
     * @param tags The tags of the app block builder. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The VPC configuration for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    /**
     * The VPC configuration for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    /**
     * The VPC configuration for the app block builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-appblockbuilder.html#cfn-appstream-appblockbuilder-vpcconfig)
     * @param vpcConfig The VPC configuration for the app block builder. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cfc0a6de75123b3c9c88168a415957bc3f8003b7dee385825c191b78bff81ef")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.appstream.CfnAppBlockBuilder =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAppBlockBuilder {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAppBlockBuilder(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder):
        CfnAppBlockBuilder = CfnAppBlockBuilder(cdkObject)

    internal fun unwrap(wrapped: CfnAppBlockBuilder):
        software.amazon.awscdk.services.appstream.CfnAppBlockBuilder = wrapped.cdkObject
  }

  public interface AccessEndpointProperty {
    /**
     * The type of interface endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-accessendpoint.html#cfn-appstream-appblockbuilder-accessendpoint-endpointtype)
     */
    public fun endpointType(): String

    /**
     * The identifier (ID) of the VPC in which the interface endpoint is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-accessendpoint.html#cfn-appstream-appblockbuilder-accessendpoint-vpceid)
     */
    public fun vpceId(): String

    /**
     * A builder for [AccessEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointType The type of interface endpoint. 
       */
      public fun endpointType(endpointType: String)

      /**
       * @param vpceId The identifier (ID) of the VPC in which the interface endpoint is used. 
       */
      public fun vpceId(vpceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty.Builder
          =
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty.builder()

      /**
       * @param endpointType The type of interface endpoint. 
       */
      override fun endpointType(endpointType: String) {
        cdkBuilder.endpointType(endpointType)
      }

      /**
       * @param vpceId The identifier (ID) of the VPC in which the interface endpoint is used. 
       */
      override fun vpceId(vpceId: String) {
        cdkBuilder.vpceId(vpceId)
      }

      public fun build():
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty,
    ) : CdkObject(cdkObject), AccessEndpointProperty {
      /**
       * The type of interface endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-accessendpoint.html#cfn-appstream-appblockbuilder-accessendpoint-endpointtype)
       */
      override fun endpointType(): String = unwrap(this).getEndpointType()

      /**
       * The identifier (ID) of the VPC in which the interface endpoint is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-accessendpoint.html#cfn-appstream-appblockbuilder-accessendpoint-vpceid)
       */
      override fun vpceId(): String = unwrap(this).getVpceId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty):
          AccessEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessEndpointProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.AccessEndpointProperty
    }
  }

  public interface VpcConfigProperty {
    /**
     * The identifiers of the security groups for the fleet or image builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-vpcconfig.html#cfn-appstream-appblockbuilder-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The identifiers of the subnets to which a network interface is attached from the fleet
     * instance or image builder instance.
     *
     * Fleet instances use one or more subnets. Image builder instances use one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-vpcconfig.html#cfn-appstream-appblockbuilder-vpcconfig-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet or image
       * builder.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet or image
       * builder.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance or image builder instance.
       * Fleet instances use one or more subnets. Image builder instances use one subnet.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance or image builder instance.
       * Fleet instances use one or more subnets. Image builder instances use one subnet.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet or image
       * builder.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The identifiers of the security groups for the fleet or image
       * builder.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance or image builder instance.
       * Fleet instances use one or more subnets. Image builder instances use one subnet.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The identifiers of the subnets to which a network interface is attached
       * from the fleet instance or image builder instance.
       * Fleet instances use one or more subnets. Image builder instances use one subnet.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * The identifiers of the security groups for the fleet or image builder.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-vpcconfig.html#cfn-appstream-appblockbuilder-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The identifiers of the subnets to which a network interface is attached from the fleet
       * instance or image builder instance.
       *
       * Fleet instances use one or more subnets. Image builder instances use one subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-appblockbuilder-vpcconfig.html#cfn-appstream-appblockbuilder-vpcconfig-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.appstream.CfnAppBlockBuilder.VpcConfigProperty
    }
  }
}
