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

package io.cloudshiftdev.awscdkdsl.services.cloudfront.origins

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy
import software.amazon.awscdk.services.cloudfront.OriginSslPolicy
import software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps

/**
 * Properties for an Origin backed by an S3 website-configured bucket, load balancer, or custom HTTP
 * server.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudfront.*;
 * import software.amazon.awscdk.services.cloudfront.origins.*;
 * HttpOriginProps httpOriginProps = HttpOriginProps.builder()
 * .connectionAttempts(123)
 * .connectionTimeout(Duration.minutes(30))
 * .customHeaders(Map.of(
 * "customHeadersKey", "customHeaders"))
 * .httpPort(123)
 * .httpsPort(123)
 * .keepaliveTimeout(Duration.minutes(30))
 * .originId("originId")
 * .originPath("originPath")
 * .originShieldEnabled(false)
 * .originShieldRegion("originShieldRegion")
 * .originSslProtocols(List.of(OriginSslPolicy.SSL_V3))
 * .protocolPolicy(OriginProtocolPolicy.HTTP_ONLY)
 * .readTimeout(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpOriginPropsDsl {
    private val cdkBuilder: HttpOriginProps.Builder = HttpOriginProps.builder()

    private val _originSslProtocols: MutableList<OriginSslPolicy> = mutableListOf()

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     *   origin;. valid values are 1, 2, or 3 attempts.
     */
    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     *   a connection to the origin. Valid values are 1-10 seconds, inclusive.
     */
    public fun connectionTimeout(connectionTimeout: Duration) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    /**
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     *   it sends to the origin.
     */
    public fun customHeaders(customHeaders: Map<String, String>) {
        cdkBuilder.customHeaders(customHeaders)
    }

    /** @param httpPort The HTTP port that CloudFront uses to connect to the origin. */
    public fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
    }

    /** @param httpsPort The HTTPS port that CloudFront uses to connect to the origin. */
    public fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
    }

    /**
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     *   the origin. The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota has been approved in the target account; otherwise, values over
     * 60 seconds will produce an error at deploy time.
     */
    public fun keepaliveTimeout(keepaliveTimeout: Duration) {
        cdkBuilder.keepaliveTimeout(keepaliveTimeout)
    }

    /**
     * @param originId A unique identifier for the origin. This value must be unique within the
     *   distribution.
     */
    public fun originId(originId: String) {
        cdkBuilder.originId(originId)
    }

    /**
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     *   CloudFront requests content from the origin. Must begin, but not end, with '/' (e.g.,
     *   '/production/images').
     */
    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    /**
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     *   region, after this to disable Origin Shield again you must set this flag to false.
     */
    public fun originShieldEnabled(originShieldEnabled: Boolean) {
        cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     *   latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /** @param originSslProtocols The SSL versions to use when interacting with the origin. */
    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy) {
        _originSslProtocols.addAll(listOf(*originSslProtocols))
    }

    /** @param originSslProtocols The SSL versions to use when interacting with the origin. */
    public fun originSslProtocols(originSslProtocols: Collection<OriginSslPolicy>) {
        _originSslProtocols.addAll(originSslProtocols)
    }

    /**
     * @param protocolPolicy Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect
     *   to the origin.
     */
    public fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
        cdkBuilder.protocolPolicy(protocolPolicy)
    }

    /**
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     *   origin, also known as the origin response timeout. The valid range is from 1 to 180
     *   seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota has been approved in the target account; otherwise, values over
     * 60 seconds will produce an error at deploy time.
     */
    public fun readTimeout(readTimeout: Duration) {
        cdkBuilder.readTimeout(readTimeout)
    }

    public fun build(): HttpOriginProps {
        if (_originSslProtocols.isNotEmpty()) cdkBuilder.originSslProtocols(_originSslProtocols)
        return cdkBuilder.build()
    }
}
