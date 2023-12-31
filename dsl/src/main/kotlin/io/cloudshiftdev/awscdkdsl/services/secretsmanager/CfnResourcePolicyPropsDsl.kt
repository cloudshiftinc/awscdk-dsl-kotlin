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

package io.cloudshiftdev.awscdkdsl.services.secretsmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.secretsmanager.CfnResourcePolicyProps

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Object resourcePolicy;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .resourcePolicy(resourcePolicy)
 * .secretId("secretId")
 * // the properties below are optional
 * .blockPublicPolicy(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-secretsmanager-resourcepolicy.html)
 */
@CdkDslMarker
public class CfnResourcePolicyPropsDsl {
    private val cdkBuilder: CfnResourcePolicyProps.Builder = CfnResourcePolicyProps.builder()

    /**
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     *   access to the secret. By default, Secrets Manager blocks policies that allow broad access,
     *   for example those that use a wildcard for the principal.
     */
    public fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * @param blockPublicPolicy Specifies whether to block resource-based policies that allow broad
     *   access to the secret. By default, Secrets Manager blocks policies that allow broad access,
     *   for example those that use a wildcard for the principal.
     */
    public fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
    }

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. For example
     *   policies, see
     *   [Permissions policy examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     *   .
     */
    public fun resourcePolicy(resourcePolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(resourcePolicy)
        cdkBuilder.resourcePolicy(builder.map)
    }

    /**
     * @param resourcePolicy A JSON-formatted string for an AWS resource-based policy. For example
     *   policies, see
     *   [Permissions policy examples](https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html)
     *   .
     */
    public fun resourcePolicy(resourcePolicy: Any) {
        cdkBuilder.resourcePolicy(resourcePolicy)
    }

    /**
     * @param secretId The ARN or name of the secret to attach the resource-based policy. For an
     *   ARN, we recommend that you specify a complete ARN rather than a partial ARN.
     */
    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun build(): CfnResourcePolicyProps = cdkBuilder.build()
}
