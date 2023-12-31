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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * DomainConfigurationProperty domainConfigurationProperty = DomainConfigurationProperty.builder()
 * .certificateArn("certificateArn")
 * .domainName("domainName")
 * // the properties below are optional
 * .basePath(List.of("basePath"))
 * .endpointConfiguration("endpointConfiguration")
 * .mutualTlsAuthentication(MutualTlsAuthenticationProperty.builder()
 * .truststoreUri("truststoreUri")
 * .truststoreVersion("truststoreVersion")
 * .build())
 * .ownershipVerificationCertificateArn("ownershipVerificationCertificateArn")
 * .route53(Route53ConfigurationProperty.builder()
 * .distributedDomainName("distributedDomainName")
 * .evaluateTargetHealth(false)
 * .hostedZoneId("hostedZoneId")
 * .hostedZoneName("hostedZoneName")
 * .ipV6(false)
 * .build())
 * .securityPolicy("securityPolicy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-domainconfiguration.html)
 */
@CdkDslMarker
public class CfnApiDomainConfigurationPropertyDsl {
    private val cdkBuilder: CfnApi.DomainConfigurationProperty.Builder =
        CfnApi.DomainConfigurationProperty.builder()

    private val _basePath: MutableList<String> = mutableListOf()

    /** @param basePath the value to be set. */
    public fun basePath(vararg basePath: String) {
        _basePath.addAll(listOf(*basePath))
    }

    /** @param basePath the value to be set. */
    public fun basePath(basePath: Collection<String>) {
        _basePath.addAll(basePath)
    }

    /** @param certificateArn the value to be set. */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /** @param domainName the value to be set. */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /** @param endpointConfiguration the value to be set. */
    public fun endpointConfiguration(endpointConfiguration: String) {
        cdkBuilder.endpointConfiguration(endpointConfiguration)
    }

    /** @param mutualTlsAuthentication the value to be set. */
    public fun mutualTlsAuthentication(mutualTlsAuthentication: IResolvable) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
    }

    /** @param mutualTlsAuthentication the value to be set. */
    public fun mutualTlsAuthentication(
        mutualTlsAuthentication: CfnApi.MutualTlsAuthenticationProperty
    ) {
        cdkBuilder.mutualTlsAuthentication(mutualTlsAuthentication)
    }

    /** @param ownershipVerificationCertificateArn the value to be set. */
    public fun ownershipVerificationCertificateArn(ownershipVerificationCertificateArn: String) {
        cdkBuilder.ownershipVerificationCertificateArn(ownershipVerificationCertificateArn)
    }

    /** @param route53 the value to be set. */
    public fun route53(route53: IResolvable) {
        cdkBuilder.route53(route53)
    }

    /** @param route53 the value to be set. */
    public fun route53(route53: CfnApi.Route53ConfigurationProperty) {
        cdkBuilder.route53(route53)
    }

    /** @param securityPolicy the value to be set. */
    public fun securityPolicy(securityPolicy: String) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    public fun build(): CfnApi.DomainConfigurationProperty {
        if (_basePath.isNotEmpty()) cdkBuilder.basePath(_basePath)
        return cdkBuilder.build()
    }
}
