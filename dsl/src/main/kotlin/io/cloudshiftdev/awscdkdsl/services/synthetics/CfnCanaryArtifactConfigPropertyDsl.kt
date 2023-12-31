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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.synthetics.CfnCanary

/**
 * A structure that contains the configuration for canary artifacts, including the
 * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3 .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
 * ArtifactConfigProperty artifactConfigProperty = ArtifactConfigProperty.builder()
 * .s3Encryption(S3EncryptionProperty.builder()
 * .encryptionMode("encryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-artifactconfig.html)
 */
@CdkDslMarker
public class CfnCanaryArtifactConfigPropertyDsl {
    private val cdkBuilder: CfnCanary.ArtifactConfigProperty.Builder =
        CfnCanary.ArtifactConfigProperty.builder()

    /**
     * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
     *   settings for artifacts that the canary uploads to Amazon S3 . Artifact encryption
     *   functionality is available only for canaries that use Synthetics runtime version
     *   syn-nodejs-puppeteer-3.3 or later. For more information, see
     *   [Encrypting canary artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
     *   .
     */
    public fun s3Encryption(s3Encryption: IResolvable) {
        cdkBuilder.s3Encryption(s3Encryption)
    }

    /**
     * @param s3Encryption A structure that contains the configuration of the encryption-at-rest
     *   settings for artifacts that the canary uploads to Amazon S3 . Artifact encryption
     *   functionality is available only for canaries that use Synthetics runtime version
     *   syn-nodejs-puppeteer-3.3 or later. For more information, see
     *   [Encrypting canary artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
     *   .
     */
    public fun s3Encryption(s3Encryption: CfnCanary.S3EncryptionProperty) {
        cdkBuilder.s3Encryption(s3Encryption)
    }

    public fun build(): CfnCanary.ArtifactConfigProperty = cdkBuilder.build()
}
