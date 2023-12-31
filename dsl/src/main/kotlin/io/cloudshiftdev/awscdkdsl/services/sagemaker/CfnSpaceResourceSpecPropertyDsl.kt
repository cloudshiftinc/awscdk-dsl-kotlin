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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * Specifies the ARN's of a SageMaker image and SageMaker image version, and the instance type that
 * the version runs on.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ResourceSpecProperty resourceSpecProperty = ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-resourcespec.html)
 */
@CdkDslMarker
public class CfnSpaceResourceSpecPropertyDsl {
    private val cdkBuilder: CfnSpace.ResourceSpecProperty.Builder =
        CfnSpace.ResourceSpecProperty.builder()

    /**
     * @param instanceType The instance type that the image version runs on.
     *
     * *JupyterServer apps* only support the `system` value.
     *
     * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` . KernelGateway
     * apps also support all other values for available instance types.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
     */
    public fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
    }

    /** @param sageMakerImageVersionArn The ARN of the image version created on the instance. */
    public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
    }

    public fun build(): CfnSpace.ResourceSpecProperty = cdkBuilder.build()
}
