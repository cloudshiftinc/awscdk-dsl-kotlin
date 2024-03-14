package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CustomResource internal constructor(
  private val cdkObject: software.amazon.awscdk.CustomResource,
) : Resource(cdkObject) {
  /**
   * Returns the value of an attribute of the custom resource of an arbitrary type.
   *
   * Attributes are returned from the custom resource provider through the
   * `Data` map where the key is the attribute name.
   *
   * @return a token for `Fn::GetAtt`. Use `Token.asXxx` to encode the returned `Reference` as a
   * specific type or
   * use the convenience `getAttString` for string attributes.
   * @param attributeName the name of the attribute. 
   */
  public open fun att(attributeName: String): Reference =
      unwrap(this).getAtt(attributeName).let(Reference::wrap)

  /**
   * Returns the value of an attribute of the custom resource of type string.
   *
   * Attributes are returned from the custom resource provider through the
   * `Data` map where the key is the attribute name.
   *
   * @return a token for `Fn::GetAtt` encoded as a string.
   * @param attributeName the name of the attribute. 
   */
  public open fun attString(attributeName: String): String =
      unwrap(this).getAttString(attributeName)

  /**
   * The physical name of this custom resource.
   */
  public open fun ref(): String = unwrap(this).getRef()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CustomResource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Convert all property keys to pascal case.
     *
     * Default: false
     *
     * @param pascalCaseProperties Convert all property keys to pascal case. 
     */
    public fun pascalCaseProperties(pascalCaseProperties: Boolean)

    /**
     * Properties to pass to the Lambda.
     *
     * Default: - No properties.
     *
     * @param properties Properties to pass to the Lambda. 
     */
    public fun properties(properties: Map<String, Any>)

    /**
     * The policy to apply when this resource is removed from the application.
     *
     * Default: cdk.RemovalPolicy.Destroy
     *
     * @param removalPolicy The policy to apply when this resource is removed from the application. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * For custom resources, you can specify AWS::CloudFormation::CustomResource (the default) as
     * the resource type, or you can specify your own resource type name.
     *
     * For example, you can use "Custom::MyCustomResourceTypeName".
     *
     * Custom resource type names must begin with "Custom::" and can include
     * alphanumeric characters and the following characters: _&#64;-. You can specify
     * a custom resource type name up to a maximum length of 60 characters. You
     * cannot change the type during an update.
     *
     * Using your own resource type names helps you quickly differentiate the
     * types of custom resources in your stack. For example, if you had two custom
     * resources that conduct two different ping tests, you could name their type
     * as Custom::PingTester to make them easily identifiable as ping testers
     * (instead of using AWS::CloudFormation::CustomResource).
     *
     * Default: - AWS::CloudFormation::CustomResource
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#aws-cfn-resource-type-name)
     * @param resourceType For custom resources, you can specify AWS::CloudFormation::CustomResource
     * (the default) as the resource type, or you can specify your own resource type name. 
     */
    public fun resourceType(resourceType: String)

    /**
     * The ARN of the provider which implements this custom resource type.
     *
     * You can implement a provider by listening to raw AWS CloudFormation events
     * and specify the ARN of an SNS topic (`topic.topicArn`) or the ARN of an AWS
     * Lambda function (`lambda.functionArn`) or use the CDK's custom <a
     * href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
     * provider framework</a> which makes it easier to implement robust providers.
     *
     * Provider framework:
     *
     * ```
     * // use the provider framework from aws-cdk/custom-resources:
     * Provider provider = Provider.Builder.create(this, "ResourceProvider")
     * .onEventHandler(onEventHandler)
     * .isCompleteHandler(isCompleteHandler)
     * .build();
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(provider.getServiceToken())
     * .build();
     * ```
     *
     * AWS Lambda function (not recommended to use AWS Lambda Functions directly,
     * see the module README):
     *
     * ```
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myFunction.getFunctionArn())
     * .build();
     * ```
     *
     * SNS topic (not recommended to use AWS Lambda Functions directly, see the
     * module README):
     *
     * ```
     * // publish lifecycle events to an SNS topic:
     * // publish lifecycle events to an SNS topic:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myTopic.getTopicArn())
     * .build();
     * ```
     *
     * @param serviceToken The ARN of the provider which implements this custom resource type. 
     */
    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResource.Builder =
        software.amazon.awscdk.CustomResource.Builder.create(scope, id)

    /**
     * Convert all property keys to pascal case.
     *
     * Default: false
     *
     * @param pascalCaseProperties Convert all property keys to pascal case. 
     */
    override fun pascalCaseProperties(pascalCaseProperties: Boolean) {
      cdkBuilder.pascalCaseProperties(pascalCaseProperties)
    }

    /**
     * Properties to pass to the Lambda.
     *
     * Default: - No properties.
     *
     * @param properties Properties to pass to the Lambda. 
     */
    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    /**
     * The policy to apply when this resource is removed from the application.
     *
     * Default: cdk.RemovalPolicy.Destroy
     *
     * @param removalPolicy The policy to apply when this resource is removed from the application. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * For custom resources, you can specify AWS::CloudFormation::CustomResource (the default) as
     * the resource type, or you can specify your own resource type name.
     *
     * For example, you can use "Custom::MyCustomResourceTypeName".
     *
     * Custom resource type names must begin with "Custom::" and can include
     * alphanumeric characters and the following characters: _&#64;-. You can specify
     * a custom resource type name up to a maximum length of 60 characters. You
     * cannot change the type during an update.
     *
     * Using your own resource type names helps you quickly differentiate the
     * types of custom resources in your stack. For example, if you had two custom
     * resources that conduct two different ping tests, you could name their type
     * as Custom::PingTester to make them easily identifiable as ping testers
     * (instead of using AWS::CloudFormation::CustomResource).
     *
     * Default: - AWS::CloudFormation::CustomResource
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#aws-cfn-resource-type-name)
     * @param resourceType For custom resources, you can specify AWS::CloudFormation::CustomResource
     * (the default) as the resource type, or you can specify your own resource type name. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * The ARN of the provider which implements this custom resource type.
     *
     * You can implement a provider by listening to raw AWS CloudFormation events
     * and specify the ARN of an SNS topic (`topic.topicArn`) or the ARN of an AWS
     * Lambda function (`lambda.functionArn`) or use the CDK's custom <a
     * href="https://docs.aws.amazon.com/cdk/api/latest/docs/custom-resources-readme.html">resource
     * provider framework</a> which makes it easier to implement robust providers.
     *
     * Provider framework:
     *
     * ```
     * // use the provider framework from aws-cdk/custom-resources:
     * Provider provider = Provider.Builder.create(this, "ResourceProvider")
     * .onEventHandler(onEventHandler)
     * .isCompleteHandler(isCompleteHandler)
     * .build();
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(provider.getServiceToken())
     * .build();
     * ```
     *
     * AWS Lambda function (not recommended to use AWS Lambda Functions directly,
     * see the module README):
     *
     * ```
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * // invoke an AWS Lambda function when a lifecycle event occurs:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myFunction.getFunctionArn())
     * .build();
     * ```
     *
     * SNS topic (not recommended to use AWS Lambda Functions directly, see the
     * module README):
     *
     * ```
     * // publish lifecycle events to an SNS topic:
     * // publish lifecycle events to an SNS topic:
     * CustomResource.Builder.create(this, "MyResource")
     * .serviceToken(myTopic.getTopicArn())
     * .build();
     * ```
     *
     * @param serviceToken The ARN of the provider which implements this custom resource type. 
     */
    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CustomResource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CustomResource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CustomResource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResource): CustomResource =
        CustomResource(cdkObject)

    internal fun unwrap(wrapped: CustomResource): software.amazon.awscdk.CustomResource =
        wrapped.cdkObject
  }
}
