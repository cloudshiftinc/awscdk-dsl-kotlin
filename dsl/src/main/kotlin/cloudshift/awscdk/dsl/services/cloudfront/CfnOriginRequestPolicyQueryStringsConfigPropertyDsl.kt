@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnOriginRequestPolicyQueryStringsConfigPropertyDsl {
    private val cdkBuilder: CfnOriginRequestPolicy.QueryStringsConfigProperty.Builder =
        CfnOriginRequestPolicy.QueryStringsConfigProperty.builder()

    private val _queryStrings: MutableList<String> = mutableListOf()

    public fun queryStringBehavior(queryStringBehavior: String) {
        cdkBuilder.queryStringBehavior(queryStringBehavior)
    }

    public fun queryStrings(vararg queryStrings: String) {
        _queryStrings.addAll(listOf(*queryStrings))
    }

    public fun queryStrings(queryStrings: Collection<String>) {
        _queryStrings.addAll(queryStrings)
    }

    public fun build(): CfnOriginRequestPolicy.QueryStringsConfigProperty {
        if (_queryStrings.isNotEmpty()) cdkBuilder.queryStrings(_queryStrings)
        return cdkBuilder.build()
    }
}
