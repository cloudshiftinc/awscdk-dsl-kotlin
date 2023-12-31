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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Specifies the configuration of a Kubernetes `secret` volume.
 *
 * For more information, see
 * [secret](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/storage/volumes/#secret)
 * in the *Kubernetes documentation* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EksSecretProperty eksSecretProperty = EksSecretProperty.builder()
 * .secretName("secretName")
 * // the properties below are optional
 * .optional(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ekssecret.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEksSecretPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EksSecretProperty.Builder =
        CfnJobDefinition.EksSecretProperty.builder()

    /** @param optional Specifies whether the secret or the secret's keys must be defined. */
    public fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
    }

    /** @param optional Specifies whether the secret or the secret's keys must be defined. */
    public fun optional(optional: IResolvable) {
        cdkBuilder.optional(optional)
    }

    /**
     * @param secretName The name of the secret. The name must be allowed as a DNS subdomain name.
     *   For more information, see
     *   [DNS subdomain names](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     *   in the *Kubernetes documentation* .
     */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CfnJobDefinition.EksSecretProperty = cdkBuilder.build()
}
