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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.cloudfront.BehaviorOptions
import software.amazon.awscdk.services.cloudfront.Distribution
import software.amazon.awscdk.services.cloudfront.ErrorResponse
import software.amazon.awscdk.services.cloudfront.GeoRestriction
import software.amazon.awscdk.services.cloudfront.HttpVersion
import software.amazon.awscdk.services.cloudfront.PriceClass
import software.amazon.awscdk.services.cloudfront.SSLMethod
import software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

/**
 * A CloudFront distribution with associated origin(s) and caching behavior(s).
 *
 * Example:
 * ```
 * Bucket s3Bucket;
 * // Add a cloudfront Function to a Distribution
 * Function cfFunction = Function.Builder.create(this, "Function")
 * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
 * .build();
 * Distribution.Builder.create(this, "distro")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(s3Bucket))
 * .functionAssociations(List.of(FunctionAssociation.builder()
 * .function(cfFunction)
 * .eventType(FunctionEventType.VIEWER_REQUEST)
 * .build()))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DistributionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Distribution.Builder = Distribution.Builder.create(scope, id)

    private val _domainNames: MutableList<String> = mutableListOf()

    private val _errorResponses: MutableList<ErrorResponse> = mutableListOf()

    /**
     * Additional behaviors for the distribution, mapped by the pathPattern that specifies which
     * requests to apply the behavior to.
     *
     * Default: - no additional behaviors are added.
     *
     * @param additionalBehaviors Additional behaviors for the distribution, mapped by the
     *   pathPattern that specifies which requests to apply the behavior to.
     */
    public fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>) {
        cdkBuilder.additionalBehaviors(additionalBehaviors)
    }

    /**
     * A certificate to associate with the distribution.
     *
     * The certificate must be located in N. Virginia (us-east-1).
     *
     * Default: - the CloudFront wildcard certificate (*.cloudfront.net) will be used.
     *
     * @param certificate A certificate to associate with the distribution.
     */
    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * Any comments you want to include about the distribution.
     *
     * Default: - no comment
     *
     * @param comment Any comments you want to include about the distribution.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * The default behavior for the distribution.
     *
     * @param defaultBehavior The default behavior for the distribution.
     */
    public fun defaultBehavior(defaultBehavior: BehaviorOptionsDsl.() -> Unit = {}) {
        val builder = BehaviorOptionsDsl()
        builder.apply(defaultBehavior)
        cdkBuilder.defaultBehavior(builder.build())
    }

    /**
     * The default behavior for the distribution.
     *
     * @param defaultBehavior The default behavior for the distribution.
     */
    public fun defaultBehavior(defaultBehavior: BehaviorOptions) {
        cdkBuilder.defaultBehavior(defaultBehavior)
    }

    /**
     * The object that you want CloudFront to request from your origin (for example, index.html)
     * when a viewer requests the root URL for your distribution. If no default object is set, the
     * request goes to the origin's root (e.g., example.com/).
     *
     * Default: - no default root object
     *
     * @param defaultRootObject The object that you want CloudFront to request from your origin (for
     *   example, index.html) when a viewer requests the root URL for your distribution. If no
     *   default object is set, the request goes to the origin's root (e.g., example.com/).
     */
    public fun defaultRootObject(defaultRootObject: String) {
        cdkBuilder.defaultRootObject(defaultRootObject)
    }

    /**
     * Alternative domain names for this distribution.
     *
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name, you can add an alternate domain name to your distribution. If you
     * attach a certificate to the distribution, you must add (at least one of) the domain names of
     * the certificate to this list.
     *
     * Default: - The distribution will only support the default generated name (e.g.,
     * d111111abcdef8.cloudfront.net)
     *
     * @param domainNames Alternative domain names for this distribution.
     */
    public fun domainNames(vararg domainNames: String) {
        _domainNames.addAll(listOf(*domainNames))
    }

    /**
     * Alternative domain names for this distribution.
     *
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name, you can add an alternate domain name to your distribution. If you
     * attach a certificate to the distribution, you must add (at least one of) the domain names of
     * the certificate to this list.
     *
     * Default: - The distribution will only support the default generated name (e.g.,
     * d111111abcdef8.cloudfront.net)
     *
     * @param domainNames Alternative domain names for this distribution.
     */
    public fun domainNames(domainNames: Collection<String>) {
        _domainNames.addAll(domainNames)
    }

    /**
     * Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
     *
     * If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code
     * NOERROR and with no IP addresses. This allows viewers to submit a second request, for an IPv4
     * address for your distribution.
     *
     * Default: true
     *
     * @param enableIpv6 Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
     */
    public fun enableIpv6(enableIpv6: Boolean) {
        cdkBuilder.enableIpv6(enableIpv6)
    }

    /**
     * Enable access logging for the distribution.
     *
     * Default: - false, unless `logBucket` is specified.
     *
     * @param enableLogging Enable access logging for the distribution.
     */
    public fun enableLogging(enableLogging: Boolean) {
        cdkBuilder.enableLogging(enableLogging)
    }

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     *
     * @param enabled Enable or disable the distribution.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
     *
     * Default: - No custom error responses.
     *
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     *   PageNotFound).
     */
    public fun errorResponses(errorResponses: ErrorResponseDsl.() -> Unit) {
        _errorResponses.add(ErrorResponseDsl().apply(errorResponses).build())
    }

    /**
     * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
     *
     * Default: - No custom error responses.
     *
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     *   PageNotFound).
     */
    public fun errorResponses(errorResponses: Collection<ErrorResponse>) {
        _errorResponses.addAll(errorResponses)
    }

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: - No geographic restrictions
     *
     * @param geoRestriction Controls the countries in which your content is distributed.
     */
    public fun geoRestriction(geoRestriction: GeoRestriction) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    /**
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront.
     *
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must
     * support server name identification (SNI).
     *
     * Default: HttpVersion.HTTP2
     *
     * @param httpVersion Specify the maximum HTTP version that you want viewers to use to
     *   communicate with CloudFront.
     */
    public fun httpVersion(httpVersion: HttpVersion) {
        cdkBuilder.httpVersion(httpVersion)
    }

    /**
     * The Amazon S3 bucket to store the access logs in.
     *
     * Make sure to set `objectOwnership` to `s3.ObjectOwnership.OBJECT_WRITER` in your custom
     * bucket.
     *
     * Default: - A bucket is created if `enableLogging` is true
     *
     * @param logBucket The Amazon S3 bucket to store the access logs in.
     */
    public fun logBucket(logBucket: IBucket) {
        cdkBuilder.logBucket(logBucket)
    }

    /**
     * An optional string that you want CloudFront to prefix to the access log filenames for this
     * distribution.
     *
     * Default: - no prefix
     *
     * @param logFilePrefix An optional string that you want CloudFront to prefix to the access log
     *   filenames for this distribution.
     */
    public fun logFilePrefix(logFilePrefix: String) {
        cdkBuilder.logFilePrefix(logFilePrefix)
    }

    /**
     * Specifies whether you want CloudFront to include cookies in access logs.
     *
     * Default: false
     *
     * @param logIncludesCookies Specifies whether you want CloudFront to include cookies in access
     *   logs.
     */
    public fun logIncludesCookies(logIncludesCookies: Boolean) {
        cdkBuilder.logIncludesCookies(logIncludesCookies)
    }

    /**
     * The minimum version of the SSL protocol that you want CloudFront to use for HTTPS
     * connections.
     *
     * CloudFront serves your objects only to browsers or devices that support at least the SSL
     * version that you specify.
     *
     * Default: - SecurityPolicyProtocol.TLS_V1_2_2021 if the
     * '@aws-cdk/aws-cloudfront:defaultSecurityPolicyTLSv1.2_2021' feature flag is set; otherwise,
     * SecurityPolicyProtocol.TLS_V1_2_2019.
     *
     * @param minimumProtocolVersion The minimum version of the SSL protocol that you want
     *   CloudFront to use for HTTPS connections.
     */
    public fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol) {
        cdkBuilder.minimumProtocolVersion(minimumProtocolVersion)
    }

    /**
     * The price class that corresponds with the maximum price that you want to pay for CloudFront
     * service.
     *
     * If you specify PriceClass_All, CloudFront responds to requests for your objects from all
     * CloudFront edge locations. If you specify a price class other than PriceClass_All, CloudFront
     * serves your objects from the CloudFront edge location that has the lowest latency among the
     * edge locations in your price class.
     *
     * Default: PriceClass.PRICE_CLASS_ALL
     *
     * @param priceClass The price class that corresponds with the maximum price that you want to
     *   pay for CloudFront service.
     */
    public fun priceClass(priceClass: PriceClass) {
        cdkBuilder.priceClass(priceClass)
    }

    /**
     * The SSL method CloudFront will use for your distribution.
     *
     * Server Name Indication (SNI) - is an extension to the TLS computer networking protocol by
     * which a client indicates which hostname it is attempting to connect to at the start of the
     * handshaking process. This allows a server to present multiple certificates on the same IP
     * address and TCP port number and hence allows multiple secure (HTTPS) websites (or any other
     * service over TLS) to be served by the same IP address without requiring all those sites to
     * use the same certificate.
     *
     * CloudFront can use SNI to host multiple distributions on the same IP - which a large majority
     * of clients will support.
     *
     * If your clients cannot support SNI however - CloudFront can use dedicated IPs for your
     * distribution - but there is a prorated monthly charge for using this feature. By default, we
     * use SNI - but you can optionally enable dedicated IPs (VIP).
     *
     * See the CloudFront SSL for more details about pricing :
     * https://aws.amazon.com/cloudfront/custom-ssl-domains/
     *
     * Default: SSLMethod.SNI
     *
     * @param sslSupportMethod The SSL method CloudFront will use for your distribution.
     */
    public fun sslSupportMethod(sslSupportMethod: SSLMethod) {
        cdkBuilder.sslSupportMethod(sslSupportMethod)
    }

    /**
     * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * Default: - No AWS Web Application Firewall web access control list (web ACL).
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
     *
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     *   CloudFront distribution.
     */
    public fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
    }

    public fun build(): Distribution {
        if (_domainNames.isNotEmpty()) cdkBuilder.domainNames(_domainNames)
        if (_errorResponses.isNotEmpty()) cdkBuilder.errorResponses(_errorResponses)
        return cdkBuilder.build()
    }
}
