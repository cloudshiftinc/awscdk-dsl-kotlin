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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModel

/**
 * Describes the container, as part of model definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object environment;
 * ContainerDefinitionProperty containerDefinitionProperty = ContainerDefinitionProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-containerdefinition.html)
 */
@CdkDslMarker
public class CfnModelContainerDefinitionPropertyDsl {
    private val cdkBuilder: CfnModel.ContainerDefinitionProperty.Builder =
        CfnModel.ContainerDefinitionProperty.builder()

    /**
     * @param containerHostname This parameter is ignored for models that contain only a
     *   `PrimaryContainer` . When a `ContainerDefinition` is part of an inference pipeline, the
     *   value of the parameter uniquely identifies the container for the purposes of logging and
     *   metrics. For information, see
     *   [Use Logs and Metrics to Monitor an Inference Pipeline](https://docs.aws.amazon.com/sagemaker/latest/dg/inference-pipeline-logs-metrics.html)
     *   . If you don't specify a value for this parameter for a `ContainerDefinition` that is part
     *   of an inference pipeline, a unique name is automatically assigned based on the position of
     *   the `ContainerDefinition` in the pipeline. If you specify a value for the
     *   `ContainerHostName` for any `ContainerDefinition` that is part of an inference pipeline,
     *   you must specify a value for the `ContainerHostName` parameter of every
     *   `ContainerDefinition` in that pipeline.
     */
    public fun containerHostname(containerHostname: String) {
        cdkBuilder.containerHostname(containerHostname)
    }

    /**
     * @param environment The environment variables to set in the Docker container. Each key and
     *   value in the `Environment` string to string map can have length of up to 1024. We support
     *   up to 16 entries in the map.
     */
    public fun environment(environment: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(environment)
        cdkBuilder.environment(builder.map)
    }

    /**
     * @param environment The environment variables to set in the Docker container. Each key and
     *   value in the `Environment` string to string map can have length of up to 1024. We support
     *   up to 16 entries in the map.
     */
    public fun environment(environment: Any) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param image The path where inference code is stored. This can be either in Amazon EC2
     *   Container Registry or in a Docker registry that is accessible from the same VPC that you
     *   configure for your endpoint. If you are using your own custom algorithm instead of an
     *   algorithm provided by SageMaker, the inference code must meet SageMaker requirements.
     *   SageMaker supports both `registry/repository[:tag]` and `registry/repository[&#64;digest]`
     *   image path formats. For more information, see
     *   [Using Your Own Algorithms with Amazon SageMaker](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html)
     *   .
     *
     * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
     * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
     * creating.
     */
    public fun image(image: String) {
        cdkBuilder.image(image)
    }

    /**
     * @param imageConfig Specifies whether the model container is in Amazon ECR or a private Docker
     *   registry accessible from your Amazon Virtual Private Cloud (VPC). For information about
     *   storing containers in a private Docker registry, see
     *   [Use a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
     *   .
     *
     * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
     * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
     * creating.
     */
    public fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /**
     * @param imageConfig Specifies whether the model container is in Amazon ECR or a private Docker
     *   registry accessible from your Amazon Virtual Private Cloud (VPC). For information about
     *   storing containers in a private Docker registry, see
     *   [Use a Private Docker Registry for Real-Time Inference Containers](https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms-containers-inference-private.html)
     *   .
     *
     * The model artifacts in an Amazon S3 bucket and the Docker image for inference container in
     * Amazon EC2 Container Registry must be in the same region as the model or endpoint you are
     * creating.
     */
    public fun imageConfig(imageConfig: CfnModel.ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig)
    }

    /**
     * @param inferenceSpecificationName The inference specification name in the model package
     *   version.
     */
    public fun inferenceSpecificationName(inferenceSpecificationName: String) {
        cdkBuilder.inferenceSpecificationName(inferenceSpecificationName)
    }

    /** @param mode Whether the container hosts a single model or multiple models. */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param modelDataUrl The S3 path where the model artifacts, which result from model training,
     *   are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
     *   The S3 path is required for SageMaker built-in algorithms, but not if you use your own
     *   algorithms. For more information on built-in algorithms, see
     *   [Common Parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-algo-docker-registry-paths.html)
     *   .
     *
     * The model artifacts must be in an S3 bucket that is in the same region as the model or
     * endpoint you are creating.
     *
     * If you provide a value for this parameter, SageMaker uses AWS Security Token Service to
     * download model artifacts from the S3 path you provide. AWS STS is activated in your AWS
     * account by default. If you previously deactivated AWS STS for a region, you need to
     * reactivate AWS STS for that region. For more information, see
     * [Activating and Deactivating AWS STS in an AWS Region](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * If you use a built-in algorithm to create a model, SageMaker requires that you provide a S3
     * path to the model artifacts in `ModelDataUrl` .
     */
    public fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
    }

    /**
     * @param modelPackageName The name or Amazon Resource Name (ARN) of the model package to use to
     *   create the model.
     */
    public fun modelPackageName(modelPackageName: String) {
        cdkBuilder.modelPackageName(modelPackageName)
    }

    /** @param multiModelConfig Specifies additional configuration for multi-model endpoints. */
    public fun multiModelConfig(multiModelConfig: IResolvable) {
        cdkBuilder.multiModelConfig(multiModelConfig)
    }

    /** @param multiModelConfig Specifies additional configuration for multi-model endpoints. */
    public fun multiModelConfig(multiModelConfig: CfnModel.MultiModelConfigProperty) {
        cdkBuilder.multiModelConfig(multiModelConfig)
    }

    public fun build(): CfnModel.ContainerDefinitionProperty = cdkBuilder.build()
}
