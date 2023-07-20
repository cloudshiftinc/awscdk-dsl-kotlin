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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBucketMetricsConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.MetricsConfigurationProperty.Builder =
        CfnBucket.MetricsConfigurationProperty.builder()

    private val _tagFilters: MutableList<Any> = mutableListOf()

    public fun accessPointArn(accessPointArn: String) {
        cdkBuilder.accessPointArn(accessPointArn)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun tagFilters(vararg tagFilters: Any) {
        _tagFilters.addAll(listOf(*tagFilters))
    }

    public fun tagFilters(tagFilters: Collection<Any>) {
        _tagFilters.addAll(tagFilters)
    }

    public fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters)
    }

    public fun build(): CfnBucket.MetricsConfigurationProperty {
        if (_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
        return cdkBuilder.build()
    }
}
