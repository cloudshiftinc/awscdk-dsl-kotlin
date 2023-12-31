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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig

/**
 * The encryption configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EncryptionConfigProperty encryptionConfigProperty = EncryptionConfigProperty.builder()
 * .encryptionType("encryptionType")
 * .keyId("keyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instancestorageconfig-encryptionconfig.html)
 */
@CdkDslMarker
public class CfnInstanceStorageConfigEncryptionConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceStorageConfig.EncryptionConfigProperty.Builder =
        CfnInstanceStorageConfig.EncryptionConfigProperty.builder()

    /** @param encryptionType The type of encryption. */
    public fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
    }

    /**
     * @param keyId The full ARN of the encryption key.
     *
     * Be sure to provide the full ARN of the encryption key, not just the ID.
     *
     * Amazon Connect supports only KMS keys with the default key spec of
     * [`SYMMETRIC_DEFAULT`](https://docs.aws.amazon.com/kms/latest/developerguide/asymmetric-key-specs.html#key-spec-symmetric-default)
     * .
     */
    public fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
    }

    public fun build(): CfnInstanceStorageConfig.EncryptionConfigProperty = cdkBuilder.build()
}
