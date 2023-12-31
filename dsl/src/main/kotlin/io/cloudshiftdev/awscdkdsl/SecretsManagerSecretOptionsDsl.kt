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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.SecretsManagerSecretOptions

/**
 * Options for referencing a secret value from Secrets Manager.
 *
 * Example:
 * ```
 * BitBucketSourceCredentials.Builder.create(this, "CodeBuildBitBucketCreds")
 * .username(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("username").build()))
 * .password(SecretValue.secretsManager("my-bitbucket-creds",
 * SecretsManagerSecretOptions.builder().jsonField("password").build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretsManagerSecretOptionsDsl {
    private val cdkBuilder: SecretsManagerSecretOptions.Builder =
        SecretsManagerSecretOptions.builder()

    /**
     * @param jsonField The key of a JSON field to retrieve. This can only be used if the secret
     *   stores a JSON object.
     */
    public fun jsonField(jsonField: String) {
        cdkBuilder.jsonField(jsonField)
    }

    /**
     * @param versionId Specifies the unique identifier of the version of the secret you want to
     *   use. Can specify at most one of `versionId` and `versionStage`.
     */
    public fun versionId(versionId: String) {
        cdkBuilder.versionId(versionId)
    }

    /**
     * @param versionStage Specifies the secret version that you want to retrieve by the staging
     *   label attached to the version. Can specify at most one of `versionId` and `versionStage`.
     */
    public fun versionStage(versionStage: String) {
        cdkBuilder.versionStage(versionStage)
    }

    public fun build(): SecretsManagerSecretOptions = cdkBuilder.build()
}
