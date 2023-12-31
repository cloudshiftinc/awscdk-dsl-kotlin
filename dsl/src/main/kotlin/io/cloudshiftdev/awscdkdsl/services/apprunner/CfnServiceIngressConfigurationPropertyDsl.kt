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

package io.cloudshiftdev.awscdkdsl.services.apprunner

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService

/**
 * Network configuration settings for inbound network traffic.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apprunner.*;
 * IngressConfigurationProperty ingressConfigurationProperty =
 * IngressConfigurationProperty.builder()
 * .isPubliclyAccessible(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apprunner-service-ingressconfiguration.html)
 */
@CdkDslMarker
public class CfnServiceIngressConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.IngressConfigurationProperty.Builder =
        CfnService.IngressConfigurationProperty.builder()

    /**
     * @param isPubliclyAccessible Specifies whether your App Runner service is publicly accessible.
     *   To make the service publicly accessible set it to `True` . To make the service privately
     *   accessible, from only within an Amazon VPC set it to `False` .
     */
    public fun isPubliclyAccessible(isPubliclyAccessible: Boolean) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
    }

    /**
     * @param isPubliclyAccessible Specifies whether your App Runner service is publicly accessible.
     *   To make the service publicly accessible set it to `True` . To make the service privately
     *   accessible, from only within an Amazon VPC set it to `False` .
     */
    public fun isPubliclyAccessible(isPubliclyAccessible: IResolvable) {
        cdkBuilder.isPubliclyAccessible(isPubliclyAccessible)
    }

    public fun build(): CfnService.IngressConfigurationProperty = cdkBuilder.build()
}
