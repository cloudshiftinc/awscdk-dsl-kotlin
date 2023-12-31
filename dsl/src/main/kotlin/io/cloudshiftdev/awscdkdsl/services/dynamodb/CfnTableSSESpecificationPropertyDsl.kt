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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * Represents the settings used to enable server-side encryption.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * SSESpecificationProperty sSESpecificationProperty = SSESpecificationProperty.builder()
 * .sseEnabled(false)
 * // the properties below are optional
 * .kmsMasterKeyId("kmsMasterKeyId")
 * .sseType("sseType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-ssespecification.html)
 */
@CdkDslMarker
public class CfnTableSSESpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.SSESpecificationProperty.Builder =
        CfnTable.SSESpecificationProperty.builder()

    /**
     * @param kmsMasterKeyId The AWS KMS key that should be used for the AWS KMS encryption. To
     *   specify a key, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
     *   that you should only provide this parameter if the key is different from the default
     *   DynamoDB key `alias/aws/dynamodb` .
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    /**
     * @param sseEnabled Indicates whether server-side encryption is done using an AWS managed key
     *   or an AWS owned key. If enabled (true), server-side encryption type is set to `KMS` and an
     *   AWS managed key is used ( AWS KMS charges apply). If disabled (false) or not specified,
     *   server-side encryption is set to AWS owned key.
     */
    public fun sseEnabled(sseEnabled: Boolean) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    /**
     * @param sseEnabled Indicates whether server-side encryption is done using an AWS managed key
     *   or an AWS owned key. If enabled (true), server-side encryption type is set to `KMS` and an
     *   AWS managed key is used ( AWS KMS charges apply). If disabled (false) or not specified,
     *   server-side encryption is set to AWS owned key.
     */
    public fun sseEnabled(sseEnabled: IResolvable) {
        cdkBuilder.sseEnabled(sseEnabled)
    }

    /**
     * @param sseType Server-side encryption type. The only supported value is:.
     * * `KMS` - Server-side encryption that uses AWS Key Management Service . The key is stored in
     *   your account and is managed by AWS KMS ( AWS KMS charges apply).
     */
    public fun sseType(sseType: String) {
        cdkBuilder.sseType(sseType)
    }

    public fun build(): CfnTable.SSESpecificationProperty = cdkBuilder.build()
}
