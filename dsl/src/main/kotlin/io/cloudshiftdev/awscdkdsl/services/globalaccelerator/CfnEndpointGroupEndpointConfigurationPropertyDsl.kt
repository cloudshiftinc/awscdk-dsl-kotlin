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

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroup

/**
 * A complex type for endpoints.
 *
 * A resource must be valid and active when you add it as an endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * EndpointConfigurationProperty endpointConfigurationProperty =
 * EndpointConfigurationProperty.builder()
 * .endpointId("endpointId")
 * // the properties below are optional
 * .clientIpPreservationEnabled(false)
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-endpointgroup-endpointconfiguration.html)
 */
@CdkDslMarker
public class CfnEndpointGroupEndpointConfigurationPropertyDsl {
    private val cdkBuilder: CfnEndpointGroup.EndpointConfigurationProperty.Builder =
        CfnEndpointGroup.EndpointConfigurationProperty.builder()

    /**
     * @param clientIpPreservationEnabled Indicates whether client IP address preservation is
     *   enabled for an Application Load Balancer endpoint. The value is true or false. The default
     *   value is true for new accelerators.
     *
     * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
     * request header as traffic travels to applications on the Application Load Balancer endpoint
     * fronted by the accelerator.
     *
     * For more information, see
     * [Preserve Client IP Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    public fun clientIpPreservationEnabled(clientIpPreservationEnabled: Boolean) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled)
    }

    /**
     * @param clientIpPreservationEnabled Indicates whether client IP address preservation is
     *   enabled for an Application Load Balancer endpoint. The value is true or false. The default
     *   value is true for new accelerators.
     *
     * If the value is set to true, the client's IP address is preserved in the `X-Forwarded-For`
     * request header as traffic travels to applications on the Application Load Balancer endpoint
     * fronted by the accelerator.
     *
     * For more information, see
     * [Preserve Client IP Addresses](https://docs.aws.amazon.com/global-accelerator/latest/dg/preserve-client-ip-address.html)
     * in the *AWS Global Accelerator Developer Guide* .
     */
    public fun clientIpPreservationEnabled(clientIpPreservationEnabled: IResolvable) {
        cdkBuilder.clientIpPreservationEnabled(clientIpPreservationEnabled)
    }

    /**
     * @param endpointId An ID for the endpoint. If the endpoint is a Network Load Balancer or
     *   Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the
     *   endpoint is an Elastic IP address, this is the Elastic IP address allocation ID. For Amazon
     *   EC2 instances, this is the EC2 instance ID. A resource must be valid and active when you
     *   add it as an endpoint.
     *
     * An Application Load Balancer can be either internal or internet-facing.
     */
    public fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
    }

    /**
     * @param weight The weight associated with the endpoint. When you add weights to endpoints, you
     *   configure Global Accelerator to route traffic based on proportions that you specify. For
     *   example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that
     *   4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to
     *   the second and third endpoints, and 6/20 is routed to the last endpoint. For more
     *   information, see
     *   [Endpoint Weights](https://docs.aws.amazon.com/global-accelerator/latest/dg/about-endpoints-endpoint-weights.html)
     *   in the *AWS Global Accelerator Developer Guide* .
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnEndpointGroup.EndpointConfigurationProperty = cdkBuilder.build()
}
