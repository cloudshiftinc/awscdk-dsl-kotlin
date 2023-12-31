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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes

/**
 * Properties to reference an existing listener.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * SecurityGroup securityGroup;
 * ApplicationListenerAttributes applicationListenerAttributes =
 * ApplicationListenerAttributes.builder()
 * .listenerArn("listenerArn")
 * .securityGroup(securityGroup)
 * // the properties below are optional
 * .defaultPort(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ApplicationListenerAttributesDsl {
    private val cdkBuilder: ApplicationListenerAttributes.Builder =
        ApplicationListenerAttributes.builder()

    /** @param defaultPort The default port on which this listener is listening. */
    public fun defaultPort(defaultPort: Number) {
        cdkBuilder.defaultPort(defaultPort)
    }

    /** @param listenerArn ARN of the listener. */
    public fun listenerArn(listenerArn: String) {
        cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * @param securityGroup Security group of the load balancer this listener is associated with.
     */
    public fun securityGroup(securityGroup: ISecurityGroup) {
        cdkBuilder.securityGroup(securityGroup)
    }

    public fun build(): ApplicationListenerAttributes = cdkBuilder.build()
}
