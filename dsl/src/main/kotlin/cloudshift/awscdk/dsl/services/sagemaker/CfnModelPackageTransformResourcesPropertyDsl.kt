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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Describes the resources, including ML instance types and ML instance count, to use for transform
 * job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * TransformResourcesProperty transformResourcesProperty = TransformResourcesProperty.builder()
 * .instanceCount(123)
 * .instanceType("instanceType")
 * // the properties below are optional
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-transformresources.html)
 */
@CdkDslMarker
public class CfnModelPackageTransformResourcesPropertyDsl {
    private val cdkBuilder: CfnModelPackage.TransformResourcesProperty.Builder =
        CfnModelPackage.TransformResourcesProperty.builder()

    /**
     * @param instanceCount The number of ML compute instances to use in the transform job. The
     *   default value is `1` , and the maximum is `100` . For distributed transform jobs, specify a
     *   value greater than `1` .
     */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param instanceType The ML compute instance type for the transform job. If you are using
     *   built-in algorithms to transform moderately sized datasets, we recommend using ml.m4.xlarge
     *   or `ml.m5.large` instance types.
     */
    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    /**
     * @param volumeKmsKeyId The AWS Key Management Service ( AWS KMS) key that Amazon SageMaker
     *   uses to encrypt model data on the storage volume attached to the ML compute instance(s)
     *   that run the batch transform job.
     *
     * Certain Nitro-based instances include local storage, dependent on the instance type. Local
     * storage volumes are encrypted using a hardware module on the instance. You can't request a
     * `VolumeKmsKeyId` when using an instance type with local storage.
     *
     * For a list of instance types that support local instance storage, see
     * [Instance Store Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#instance-store-volumes)
     * .
     *
     * For more information about local instance storage encryption, see
     * [SSD Instance Store Volumes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ssd-instance-store.html)
     * .
     *
     * The `VolumeKmsKeyId` can be any of the following formats:
     * * Key ID: `1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Key ARN: `arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab`
     * * Alias name: `alias/ExampleAlias`
     * * Alias name ARN: `arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias`
     */
    public fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    public fun build(): CfnModelPackage.TransformResourcesProperty = cdkBuilder.build()
}
