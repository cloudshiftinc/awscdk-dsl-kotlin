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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * A structure of additional Inference Specification.
 *
 * Additional Inference Specification specifies details about inference jobs that can be run with
 * models based on this model package
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object modelInput;
 * AdditionalInferenceSpecificationDefinitionProperty
 * additionalInferenceSpecificationDefinitionProperty =
 * AdditionalInferenceSpecificationDefinitionProperty.builder()
 * .containers(List.of(ModelPackageContainerDefinitionProperty.builder()
 * .image("image")
 * // the properties below are optional
 * .containerHostname("containerHostname")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .framework("framework")
 * .frameworkVersion("frameworkVersion")
 * .imageDigest("imageDigest")
 * .modelDataUrl("modelDataUrl")
 * .modelInput(modelInput)
 * .nearestModelName("nearestModelName")
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .supportedContentTypes(List.of("supportedContentTypes"))
 * .supportedRealtimeInferenceInstanceTypes(List.of("supportedRealtimeInferenceInstanceTypes"))
 * .supportedResponseMimeTypes(List.of("supportedResponseMimeTypes"))
 * .supportedTransformInstanceTypes(List.of("supportedTransformInstanceTypes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-additionalinferencespecificationdefinition.html)
 */
@CdkDslMarker
public class CfnModelPackageAdditionalInferenceSpecificationDefinitionPropertyDsl {
    private val cdkBuilder:
        CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.Builder =
        CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty.builder()

    private val _containers: MutableList<Any> = mutableListOf()

    private val _supportedContentTypes: MutableList<String> = mutableListOf()

    private val _supportedRealtimeInferenceInstanceTypes: MutableList<String> = mutableListOf()

    private val _supportedResponseMimeTypes: MutableList<String> = mutableListOf()

    private val _supportedTransformInstanceTypes: MutableList<String> = mutableListOf()

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(vararg containers: Any) {
        _containers.addAll(listOf(*containers))
    }

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(containers: Collection<Any>) {
        _containers.addAll(containers)
    }

    /**
     * @param containers The Amazon ECR registry path of the Docker image that contains the
     *   inference code.
     */
    public fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers)
    }

    /** @param description A description of the additional Inference specification. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param name A unique name to identify the additional inference specification. The name must
     *   be unique within the list of your additional inference specifications for a particular
     *   model package.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param supportedContentTypes The supported MIME types for the input data. */
    public fun supportedContentTypes(vararg supportedContentTypes: String) {
        _supportedContentTypes.addAll(listOf(*supportedContentTypes))
    }

    /** @param supportedContentTypes The supported MIME types for the input data. */
    public fun supportedContentTypes(supportedContentTypes: Collection<String>) {
        _supportedContentTypes.addAll(supportedContentTypes)
    }

    /**
     * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used to
     *   generate inferences in real-time.
     */
    public fun supportedRealtimeInferenceInstanceTypes(
        vararg supportedRealtimeInferenceInstanceTypes: String
    ) {
        _supportedRealtimeInferenceInstanceTypes.addAll(
            listOf(*supportedRealtimeInferenceInstanceTypes)
        )
    }

    /**
     * @param supportedRealtimeInferenceInstanceTypes A list of the instance types that are used to
     *   generate inferences in real-time.
     */
    public fun supportedRealtimeInferenceInstanceTypes(
        supportedRealtimeInferenceInstanceTypes: Collection<String>
    ) {
        _supportedRealtimeInferenceInstanceTypes.addAll(supportedRealtimeInferenceInstanceTypes)
    }

    /** @param supportedResponseMimeTypes The supported MIME types for the output data. */
    public fun supportedResponseMimeTypes(vararg supportedResponseMimeTypes: String) {
        _supportedResponseMimeTypes.addAll(listOf(*supportedResponseMimeTypes))
    }

    /** @param supportedResponseMimeTypes The supported MIME types for the output data. */
    public fun supportedResponseMimeTypes(supportedResponseMimeTypes: Collection<String>) {
        _supportedResponseMimeTypes.addAll(supportedResponseMimeTypes)
    }

    /**
     * @param supportedTransformInstanceTypes A list of the instance types on which a transformation
     *   job can be run or on which an endpoint can be deployed.
     */
    public fun supportedTransformInstanceTypes(vararg supportedTransformInstanceTypes: String) {
        _supportedTransformInstanceTypes.addAll(listOf(*supportedTransformInstanceTypes))
    }

    /**
     * @param supportedTransformInstanceTypes A list of the instance types on which a transformation
     *   job can be run or on which an endpoint can be deployed.
     */
    public fun supportedTransformInstanceTypes(
        supportedTransformInstanceTypes: Collection<String>
    ) {
        _supportedTransformInstanceTypes.addAll(supportedTransformInstanceTypes)
    }

    public fun build(): CfnModelPackage.AdditionalInferenceSpecificationDefinitionProperty {
        if (_containers.isNotEmpty()) cdkBuilder.containers(_containers)
        if (_supportedContentTypes.isNotEmpty())
            cdkBuilder.supportedContentTypes(_supportedContentTypes)
        if (_supportedRealtimeInferenceInstanceTypes.isNotEmpty())
            cdkBuilder.supportedRealtimeInferenceInstanceTypes(
                _supportedRealtimeInferenceInstanceTypes
            )
        if (_supportedResponseMimeTypes.isNotEmpty())
            cdkBuilder.supportedResponseMimeTypes(_supportedResponseMimeTypes)
        if (_supportedTransformInstanceTypes.isNotEmpty())
            cdkBuilder.supportedTransformInstanceTypes(_supportedTransformInstanceTypes)
        return cdkBuilder.build()
    }
}
