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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy

/**
 * An object that determines whether any URL query strings in viewer requests (and if so, which
 * query strings) are included in the cache key and in requests that CloudFront sends to the origin.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * QueryStringsConfigProperty queryStringsConfigProperty = QueryStringsConfigProperty.builder()
 * .queryStringBehavior("queryStringBehavior")
 * // the properties below are optional
 * .queryStrings(List.of("queryStrings"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-querystringsconfig.html)
 */
@CdkDslMarker
public class CfnCachePolicyQueryStringsConfigPropertyDsl {
    private val cdkBuilder: CfnCachePolicy.QueryStringsConfigProperty.Builder =
        CfnCachePolicy.QueryStringsConfigProperty.builder()

    private val _queryStrings: MutableList<String> = mutableListOf()

    /**
     * @param queryStringBehavior Determines whether any URL query strings in viewer requests are
     *   included in the cache key and in requests that CloudFront sends to the origin. Valid values
     *   are:
     * * `none` – No query strings in viewer requests are included in the cache key or in requests
     *   that CloudFront sends to the origin. Even when this field is set to `none` , any query
     *   strings that are listed in an `OriginRequestPolicy` *are* included in origin requests.
     * * `whitelist` – Only the query strings in viewer requests that are listed in the
     *   `QueryStringNames` type are included in the cache key and in requests that CloudFront sends
     *   to the origin.
     * * `allExcept` – All query strings in viewer requests are included in the cache key and in
     *   requests that CloudFront sends to the origin, **except** those that are listed in the
     *   `QueryStringNames` type, which are not included.
     * * `all` – All query strings in viewer requests are included in the cache key and in requests
     *   that CloudFront sends to the origin.
     */
    public fun queryStringBehavior(queryStringBehavior: String) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
    }

    /** @param queryStrings Contains a list of query string names. */
    public fun queryStrings(vararg queryStrings: String) {
        _queryStrings.addAll(listOf(*queryStrings))
    }

    /** @param queryStrings Contains a list of query string names. */
    public fun queryStrings(queryStrings: Collection<String>) {
        _queryStrings.addAll(queryStrings)
    }

    public fun build(): CfnCachePolicy.QueryStringsConfigProperty {
        if (_queryStrings.isNotEmpty()) cdkBuilder.queryStrings(_queryStrings)
        return cdkBuilder.build()
    }
}
