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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions

/**
 * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service (KMS)
 * key to use.
 *
 * Can only be used to create a new domain, not update an existing one. Requires Elasticsearch
 * version 5.1 or later or OpenSearch version 1.0 or later.
 *
 * Example:
 * ```
 * Domain domain = Domain.Builder.create(this, "Domain")
 * .version(EngineVersion.OPENSEARCH_1_0)
 * .enforceHttps(true)
 * .nodeToNodeEncryption(true)
 * .encryptionAtRest(EncryptionAtRestOptions.builder()
 * .enabled(true)
 * .build())
 * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
 * .masterUserName("master-user")
 * .samlAuthenticationEnabled(true)
 * .samlAuthenticationOptions(SAMLOptionsProperty.builder()
 * .idpEntityId("entity-id")
 * .idpMetadataContent("metadata-content-with-quotes-escaped")
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class EncryptionAtRestOptionsDsl {
    private val cdkBuilder: EncryptionAtRestOptions.Builder = EncryptionAtRestOptions.builder()

    /** @param enabled Specify true to enable encryption at rest. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param kmsKey Supply if using KMS key for encryption at rest. */
    public fun kmsKey(kmsKey: IKey) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun build(): EncryptionAtRestOptions = cdkBuilder.build()
}
