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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnService

/**
 * An object representing the secret to expose to your container.
 *
 * Secrets can be exposed to a container in the following ways:
 * * To inject sensitive data into your containers as environment variables, use the `secrets`
 *   container definition parameter.
 * * To reference sensitive information in the log configuration of a container, use the
 *   `secretOptions` container definition parameter.
 *
 * For more information, see
 * [Specifying sensitive data](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * SecretProperty secretProperty = SecretProperty.builder()
 * .name("name")
 * .valueFrom("valueFrom")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-secret.html)
 */
@CdkDslMarker
public class CfnServiceSecretPropertyDsl {
    private val cdkBuilder: CfnService.SecretProperty.Builder = CfnService.SecretProperty.builder()

    /** @param name The name of the secret. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param valueFrom The secret to expose to the container. The supported values are either the
     *   full ARN of the AWS Secrets Manager secret or the full ARN of the parameter in the SSM
     *   Parameter Store.
     *
     * For information about the require AWS Identity and Access Management permissions, see
     * [Required IAM permissions for Amazon ECS secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-secrets.html#secrets-iam)
     * (for Secrets Manager) or
     * [Required IAM permissions for Amazon ECS secrets](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/specifying-sensitive-data-parameters.html)
     * (for Systems Manager Parameter store) in the *Amazon Elastic Container Service Developer
     * Guide* .
     *
     * If the SSM Parameter Store parameter exists in the same Region as the task you're launching,
     * then you can use either the full ARN or name of the parameter. If the parameter exists in a
     * different Region, then the full ARN must be specified.
     */
    public fun valueFrom(valueFrom: String) {
        cdkBuilder.valueFrom(valueFrom)
    }

    public fun build(): CfnService.SecretProperty = cdkBuilder.build()
}
