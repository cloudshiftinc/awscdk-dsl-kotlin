@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModel
import software.constructs.Construct

/**
 * The `AWS::SageMaker::Model` resource to create a model to host at an Amazon SageMaker endpoint.
 *
 * For more information, see [Deploying a Model on Amazon SageMaker Hosting
 * Services](https://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works-hosting.html) in the *Amazon
 * SageMaker Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object environment;
 * CfnModel cfnModel = CfnModel.Builder.create(this, "MyCfnModel")
 * .executionRoleArn("executionRoleArn")
 * // the properties below are optional
 * .containers(List.of(ContainerDefinitionProperty.builder()
 * .containerHostname("containerHostname")
 * .environment(environment)
 * .image("image")
 * .imageConfig(ImageConfigProperty.builder()
 * .repositoryAccessMode("repositoryAccessMode")
 * // the properties below are optional
 * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
 * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
 * .build())
 * .build())
 * .inferenceSpecificationName("inferenceSpecificationName")
 * .mode("mode")
 * .modelDataUrl("modelDataUrl")
 * .modelPackageName("modelPackageName")
 * .multiModelConfig(MultiModelConfigProperty.builder()
 * .modelCacheSetting("modelCacheSetting")
 * .build())
 * .build()))
 * .enableNetworkIsolation(false)
 * .inferenceExecutionConfig(InferenceExecutionConfigProperty.builder()
 * .mode("mode")
 * .build())
 * .modelName("modelName")
 * .primaryContainer(ContainerDefinitionProperty.builder()
 * .containerHostname("containerHostname")
 * .environment(environment)
 * .image("image")
 * .imageConfig(ImageConfigProperty.builder()
 * .repositoryAccessMode("repositoryAccessMode")
 * // the properties below are optional
 * .repositoryAuthConfig(RepositoryAuthConfigProperty.builder()
 * .repositoryCredentialsProviderArn("repositoryCredentialsProviderArn")
 * .build())
 * .build())
 * .inferenceSpecificationName("inferenceSpecificationName")
 * .mode("mode")
 * .modelDataUrl("modelDataUrl")
 * .modelPackageName("modelPackageName")
 * .multiModelConfig(MultiModelConfigProperty.builder()
 * .modelCacheSetting("modelCacheSetting")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html)
 */
@CdkDslMarker
public class CfnModelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnModel.Builder = CfnModel.Builder.create(scope, id)

  private val _containers: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies the containers in the inference pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
   * @param containers Specifies the containers in the inference pipeline. 
   */
  public fun containers(vararg containers: Any) {
    _containers.addAll(listOf(*containers))
  }

  /**
   * Specifies the containers in the inference pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
   * @param containers Specifies the containers in the inference pipeline. 
   */
  public fun containers(containers: Collection<Any>) {
    _containers.addAll(containers)
  }

  /**
   * Specifies the containers in the inference pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-containers)
   * @param containers Specifies the containers in the inference pipeline. 
   */
  public fun containers(containers: IResolvable) {
    cdkBuilder.containers(containers)
  }

  /**
   * Isolates the model container.
   *
   * No inbound or outbound network calls can be made to or from the model container.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
   * @param enableNetworkIsolation Isolates the model container. 
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * Isolates the model container.
   *
   * No inbound or outbound network calls can be made to or from the model container.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-enablenetworkisolation)
   * @param enableNetworkIsolation Isolates the model container. 
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role that SageMaker can assume to access model
   * artifacts and docker image for deployment on ML compute instances or for batch transform jobs.
   *
   * Deploying on ML compute instances is part of model hosting. For more information, see
   * [SageMaker Roles](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-roles.html) .
   *
   *
   * To be able to pass this role to SageMaker, the caller of this API must have the `iam:PassRole`
   * permission.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-executionrolearn)
   * @param executionRoleArn The Amazon Resource Name (ARN) of the IAM role that SageMaker can
   * assume to access model artifacts and docker image for deployment on ML compute instances or for
   * batch transform jobs. 
   */
  public fun executionRoleArn(executionRoleArn: String) {
    cdkBuilder.executionRoleArn(executionRoleArn)
  }

  /**
   * Specifies details of how containers in a multi-container endpoint are called.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
   * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
   * endpoint are called. 
   */
  public fun inferenceExecutionConfig(inferenceExecutionConfig: IResolvable) {
    cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig)
  }

  /**
   * Specifies details of how containers in a multi-container endpoint are called.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-inferenceexecutionconfig)
   * @param inferenceExecutionConfig Specifies details of how containers in a multi-container
   * endpoint are called. 
   */
  public
      fun inferenceExecutionConfig(inferenceExecutionConfig: CfnModel.InferenceExecutionConfigProperty) {
    cdkBuilder.inferenceExecutionConfig(inferenceExecutionConfig)
  }

  /**
   * The name of the new model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-modelname)
   * @param modelName The name of the new model. 
   */
  public fun modelName(modelName: String) {
    cdkBuilder.modelName(modelName)
  }

  /**
   * The location of the primary docker image containing inference code, associated artifacts, and
   * custom environment map that the inference code uses when the model is deployed for predictions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
   * @param primaryContainer The location of the primary docker image containing inference code,
   * associated artifacts, and custom environment map that the inference code uses when the model is
   * deployed for predictions. 
   */
  public fun primaryContainer(primaryContainer: IResolvable) {
    cdkBuilder.primaryContainer(primaryContainer)
  }

  /**
   * The location of the primary docker image containing inference code, associated artifacts, and
   * custom environment map that the inference code uses when the model is deployed for predictions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-primarycontainer)
   * @param primaryContainer The location of the primary docker image containing inference code,
   * associated artifacts, and custom environment map that the inference code uses when the model is
   * deployed for predictions. 
   */
  public fun primaryContainer(primaryContainer: CfnModel.ContainerDefinitionProperty) {
    cdkBuilder.primaryContainer(primaryContainer)
  }

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags)
   * @param tags A list of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A list of key-value pairs to apply to this resource.
   *
   * For more information, see [Resource
   * Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * and [Using Cost Allocation
   * Tags](https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what)
   * in the *AWS Billing and Cost Management User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-tags)
   * @param tags A list of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
   * @param vpcConfig A
   * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) . 
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * A [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-model.html#cfn-sagemaker-model-vpcconfig)
   * @param vpcConfig A
   * [VpcConfig](https://docs.aws.amazon.com/sagemaker/latest/dg/API_VpcConfig.html) object that
   * specifies the VPC that you want your model to connect to. Control access to and from your model
   * container by configuring the VPC. `VpcConfig` is used in hosting services and in batch transform.
   * For more information, see [Protect Endpoints by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/host-vpc.html) and [Protect Data in Batch
   * Transform Jobs by Using an Amazon Virtual Private
   * Cloud](https://docs.aws.amazon.com/sagemaker/latest/dg/batch-vpc.html) . 
   */
  public fun vpcConfig(vpcConfig: CfnModel.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnModel {
    if(_containers.isNotEmpty()) cdkBuilder.containers(_containers)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
