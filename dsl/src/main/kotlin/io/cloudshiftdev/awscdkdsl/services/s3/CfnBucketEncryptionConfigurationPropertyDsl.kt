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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies encryption-related information for an Amazon S3 bucket that is a destination for
 * replicated objects.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * EncryptionConfigurationProperty encryptionConfigurationProperty =
 * EncryptionConfigurationProperty.builder()
 * .replicaKmsKeyId("replicaKmsKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketEncryptionConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.EncryptionConfigurationProperty.Builder =
        CfnBucket.EncryptionConfigurationProperty.builder()

    /**
     * @param replicaKmsKeyId Specifies the ID (Key ARN or Alias ARN) of the customer managed AWS
     *   KMS key stored in AWS Key Management Service (KMS) for the destination bucket. Amazon S3
     *   uses this key to encrypt replica objects. Amazon S3 only supports symmetric encryption KMS
     *   keys. For more information, see
     *   [Asymmetric keys in AWS KMS](https://docs.aws.amazon.com//kms/latest/developerguide/symmetric-asymmetric.html)
     *   in the *AWS Key Management Service Developer Guide* .
     */
    public fun replicaKmsKeyId(replicaKmsKeyId: String) {
        cdkBuilder.replicaKmsKeyId(replicaKmsKeyId)
    }

    public fun build(): CfnBucket.EncryptionConfigurationProperty = cdkBuilder.build()
}
