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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.AllowedMethods
import software.amazon.awscdk.services.cloudfront.BehaviorOptions
import software.amazon.awscdk.services.cloudfront.CachedMethods
import software.amazon.awscdk.services.cloudfront.EdgeLambda
import software.amazon.awscdk.services.cloudfront.FunctionAssociation
import software.amazon.awscdk.services.cloudfront.ICachePolicy
import software.amazon.awscdk.services.cloudfront.IKeyGroup
import software.amazon.awscdk.services.cloudfront.IOrigin
import software.amazon.awscdk.services.cloudfront.IOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.IResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy

/**
 * Options for creating a new behavior.
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
public class BehaviorOptionsDsl {
    private val cdkBuilder: BehaviorOptions.Builder = BehaviorOptions.builder()

    private val _edgeLambdas: MutableList<EdgeLambda> = mutableListOf()

    private val _functionAssociations: MutableList<FunctionAssociation> = mutableListOf()

    private val _trustedKeyGroups: MutableList<IKeyGroup> = mutableListOf()

    /** @param allowedMethods HTTP methods to allow for this behavior. */
    public fun allowedMethods(allowedMethods: AllowedMethods) {
        cdkBuilder.allowedMethods(allowedMethods)
    }

    /**
     * @param cachePolicy The cache policy for this behavior. The cache policy determines what
     *   values are included in the cache key, and the time-to-live (TTL) values for the cache.
     */
    public fun cachePolicy(cachePolicy: ICachePolicy) {
        cdkBuilder.cachePolicy(cachePolicy)
    }

    /** @param cachedMethods HTTP methods to cache for this behavior. */
    public fun cachedMethods(cachedMethods: CachedMethods) {
        cdkBuilder.cachedMethods(cachedMethods)
    }

    /**
     * @param compress Whether you want CloudFront to automatically compress certain files for this
     *   cache behavior. See
     *   https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html#compressed-content-cloudfront-file-types
     *   for file types CloudFront will compress.
     */
    public fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
    }

    /** @param edgeLambdas The Lambda&#64;Edge functions to invoke before serving the contents. */
    public fun edgeLambdas(edgeLambdas: EdgeLambdaDsl.() -> Unit) {
        _edgeLambdas.add(EdgeLambdaDsl().apply(edgeLambdas).build())
    }

    /** @param edgeLambdas The Lambda&#64;Edge functions to invoke before serving the contents. */
    public fun edgeLambdas(edgeLambdas: Collection<EdgeLambda>) {
        _edgeLambdas.addAll(edgeLambdas)
    }

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(functionAssociations: FunctionAssociationDsl.() -> Unit) {
        _functionAssociations.add(FunctionAssociationDsl().apply(functionAssociations).build())
    }

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(functionAssociations: Collection<FunctionAssociation>) {
        _functionAssociations.addAll(functionAssociations)
    }

    /**
     * @param origin The origin that you want CloudFront to route requests to when they match this
     *   behavior.
     */
    public fun origin(origin: IOrigin) {
        cdkBuilder.origin(origin)
    }

    /**
     * @param originRequestPolicy The origin request policy for this behavior. The origin request
     *   policy determines which values (e.g., headers, cookies) are included in requests that
     *   CloudFront sends to the origin.
     */
    public fun originRequestPolicy(originRequestPolicy: IOriginRequestPolicy) {
        cdkBuilder.originRequestPolicy(originRequestPolicy)
    }

    /**
     * @param responseHeadersPolicy The response headers policy for this behavior. The response
     *   headers policy determines which headers are included in responses
     */
    public fun responseHeadersPolicy(responseHeadersPolicy: IResponseHeadersPolicy) {
        cdkBuilder.responseHeadersPolicy(responseHeadersPolicy)
    }

    /**
     * @param smoothStreaming Set this to true to indicate you want to distribute media files in the
     *   Microsoft Smooth Streaming format using this behavior.
     */
    public fun smoothStreaming(smoothStreaming: Boolean) {
        cdkBuilder.smoothStreaming(smoothStreaming)
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     *   or signed cookies.
     */
    public fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup) {
        _trustedKeyGroups.addAll(listOf(*trustedKeyGroups))
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     *   or signed cookies.
     */
    public fun trustedKeyGroups(trustedKeyGroups: Collection<IKeyGroup>) {
        _trustedKeyGroups.addAll(trustedKeyGroups)
    }

    /**
     * @param viewerProtocolPolicy The protocol that viewers can use to access the files controlled
     *   by this behavior.
     */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
    }

    public fun build(): BehaviorOptions {
        if (_edgeLambdas.isNotEmpty()) cdkBuilder.edgeLambdas(_edgeLambdas)
        if (_functionAssociations.isNotEmpty())
            cdkBuilder.functionAssociations(_functionAssociations)
        if (_trustedKeyGroups.isNotEmpty()) cdkBuilder.trustedKeyGroups(_trustedKeyGroups)
        return cdkBuilder.build()
    }
}
