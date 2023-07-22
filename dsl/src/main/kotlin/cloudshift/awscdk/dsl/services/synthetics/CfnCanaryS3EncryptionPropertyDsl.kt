@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.synthetics.CfnCanary

/**
 * A structure that contains the configuration of the encryption-at-rest settings for artifacts that
 * the canary uploads to Amazon S3 .
 *
 * Artifact encryption functionality is available only for canaries that use Synthetics runtime
 * version syn-nodejs-puppeteer-3.3 or later. For more information, see [Encrypting canary
 * artifacts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.synthetics.*;
 * S3EncryptionProperty s3EncryptionProperty = S3EncryptionProperty.builder()
 * .encryptionMode("encryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-s3encryption.html)
 */
@CdkDslMarker
public class CfnCanaryS3EncryptionPropertyDsl {
  private val cdkBuilder: CfnCanary.S3EncryptionProperty.Builder =
      CfnCanary.S3EncryptionProperty.builder()

  /**
   * @param encryptionMode The encryption method to use for artifacts created by this canary.
   * Specify `SSE_S3` to use server-side encryption (SSE) with an Amazon S3-managed key. Specify
   * `SSE-KMS` to use server-side encryption with a customer-managed AWS KMS key.
   *
   * If you omit this parameter, an AWS -managed AWS KMS key is used.
   */
  public fun encryptionMode(encryptionMode: String) {
    cdkBuilder.encryptionMode(encryptionMode)
  }

  /**
   * @param kmsKeyArn The ARN of the customer-managed AWS KMS key to use, if you specify `SSE-KMS`
   * for `EncryptionMode`.
   */
  public fun kmsKeyArn(kmsKeyArn: String) {
    cdkBuilder.kmsKeyArn(kmsKeyArn)
  }

  public fun build(): CfnCanary.S3EncryptionProperty = cdkBuilder.build()
}
