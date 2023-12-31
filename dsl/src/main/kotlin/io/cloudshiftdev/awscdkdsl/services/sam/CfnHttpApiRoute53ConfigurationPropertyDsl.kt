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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnHttpApi

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Route53ConfigurationProperty route53ConfigurationProperty =
 * Route53ConfigurationProperty.builder()
 * .distributedDomainName("distributedDomainName")
 * .evaluateTargetHealth(false)
 * .hostedZoneId("hostedZoneId")
 * .hostedZoneName("hostedZoneName")
 * .ipV6(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-httpapi-route53configuration.html)
 */
@CdkDslMarker
public class CfnHttpApiRoute53ConfigurationPropertyDsl {
    private val cdkBuilder: CfnHttpApi.Route53ConfigurationProperty.Builder =
        CfnHttpApi.Route53ConfigurationProperty.builder()

    /** @param distributedDomainName the value to be set. */
    public fun distributedDomainName(distributedDomainName: String) {
        cdkBuilder.distributedDomainName(distributedDomainName)
    }

    /** @param evaluateTargetHealth the value to be set. */
    public fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
    }

    /** @param evaluateTargetHealth the value to be set. */
    public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
    }

    /** @param hostedZoneId the value to be set. */
    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    /** @param hostedZoneName the value to be set. */
    public fun hostedZoneName(hostedZoneName: String) {
        cdkBuilder.hostedZoneName(hostedZoneName)
    }

    /** @param ipV6 the value to be set. */
    public fun ipV6(ipV6: Boolean) {
        cdkBuilder.ipV6(ipV6)
    }

    /** @param ipV6 the value to be set. */
    public fun ipV6(ipV6: IResolvable) {
        cdkBuilder.ipV6(ipV6)
    }

    public fun build(): CfnHttpApi.Route53ConfigurationProperty = cdkBuilder.build()
}
