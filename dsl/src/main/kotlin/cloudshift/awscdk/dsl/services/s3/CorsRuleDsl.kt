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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CorsRule
import software.amazon.awscdk.services.s3.HttpMethods
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CorsRuleDsl {
    private val cdkBuilder: CorsRule.Builder = CorsRule.builder()

    private val _allowedHeaders: MutableList<String> = mutableListOf()

    private val _allowedMethods: MutableList<HttpMethods> = mutableListOf()

    private val _allowedOrigins: MutableList<String> = mutableListOf()

    private val _exposedHeaders: MutableList<String> = mutableListOf()

    public fun allowedHeaders(vararg allowedHeaders: String) {
        _allowedHeaders.addAll(listOf(*allowedHeaders))
    }

    public fun allowedHeaders(allowedHeaders: Collection<String>) {
        _allowedHeaders.addAll(allowedHeaders)
    }

    public fun allowedMethods(vararg allowedMethods: HttpMethods) {
        _allowedMethods.addAll(listOf(*allowedMethods))
    }

    public fun allowedMethods(allowedMethods: Collection<HttpMethods>) {
        _allowedMethods.addAll(allowedMethods)
    }

    public fun allowedOrigins(vararg allowedOrigins: String) {
        _allowedOrigins.addAll(listOf(*allowedOrigins))
    }

    public fun allowedOrigins(allowedOrigins: Collection<String>) {
        _allowedOrigins.addAll(allowedOrigins)
    }

    public fun exposedHeaders(vararg exposedHeaders: String) {
        _exposedHeaders.addAll(listOf(*exposedHeaders))
    }

    public fun exposedHeaders(exposedHeaders: Collection<String>) {
        _exposedHeaders.addAll(exposedHeaders)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun maxAge(maxAge: Number) {
        cdkBuilder.maxAge(maxAge)
    }

    public fun build(): CorsRule {
        if (_allowedHeaders.isNotEmpty()) cdkBuilder.allowedHeaders(_allowedHeaders)
        if (_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
        if (_allowedOrigins.isNotEmpty()) cdkBuilder.allowedOrigins(_allowedOrigins)
        if (_exposedHeaders.isNotEmpty()) cdkBuilder.exposedHeaders(_exposedHeaders)
        return cdkBuilder.build()
    }
}
