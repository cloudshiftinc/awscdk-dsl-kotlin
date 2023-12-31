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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity

/**
 * Determines whether CloudFront includes the Strict-Transport-Security HTTP response header and the
 * header’s value.
 *
 * Example:
 * ```
 * // Using an existing managed response headers policy
 * S3Origin bucketOrigin;
 * Distribution.Builder.create(this, "myDistManagedPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
 * .build())
 * .build();
 * // Creating a custom response headers policy -- all parameters optional
 * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
 * "ResponseHeadersPolicy")
 * .responseHeadersPolicyName("MyPolicy")
 * .comment("A default policy")
 * .corsBehavior(ResponseHeadersCorsBehavior.builder()
 * .accessControlAllowCredentials(false)
 * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlAllowMethods(List.of("GET", "POST"))
 * .accessControlAllowOrigins(List.of("*"))
 * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
 * .accessControlMaxAge(Duration.seconds(600))
 * .originOverride(true)
 * .build())
 * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
 * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
 * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
 * .build())
 * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
 * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
 * https:;").override(true).build())
 * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
 * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
 * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
 * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
 * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
 * .build())
 * .removeHeaders(List.of("Server"))
 * .serverTimingSamplingRate(50)
 * .build();
 * Distribution.Builder.create(this, "myDistCustomPolicy")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(bucketOrigin)
 * .responseHeadersPolicy(myResponseHeadersPolicy)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ResponseHeadersStrictTransportSecurityDsl {
    private val cdkBuilder: ResponseHeadersStrictTransportSecurity.Builder =
        ResponseHeadersStrictTransportSecurity.builder()

    /**
     * @param accessControlMaxAge A number that CloudFront uses as the value for the max-age
     *   directive in the Strict-Transport-Security HTTP response header.
     */
    public fun accessControlMaxAge(accessControlMaxAge: Duration) {
        cdkBuilder.accessControlMaxAge(accessControlMaxAge)
    }

    /**
     * @param includeSubdomains A Boolean that determines whether CloudFront includes the
     *   includeSubDomains directive in the Strict-Transport-Security HTTP response header.
     */
    public fun includeSubdomains(includeSubdomains: Boolean) {
        cdkBuilder.includeSubdomains(includeSubdomains)
    }

    /**
     * @param override A Boolean that determines whether CloudFront overrides the
     *   Strict-Transport-Security HTTP response header received from the origin with the one
     *   specified in this response headers policy.
     */
    public fun `override`(`override`: Boolean) {
        cdkBuilder.`override`(`override`)
    }

    /**
     * @param preload A Boolean that determines whether CloudFront includes the preload directive in
     *   the Strict-Transport-Security HTTP response header.
     */
    public fun preload(preload: Boolean) {
        cdkBuilder.preload(preload)
    }

    public fun build(): ResponseHeadersStrictTransportSecurity = cdkBuilder.build()
}
