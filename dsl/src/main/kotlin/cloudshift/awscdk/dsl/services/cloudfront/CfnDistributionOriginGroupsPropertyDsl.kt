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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionOriginGroupsPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginGroupsProperty.Builder =
        CfnDistribution.OriginGroupsProperty.builder()

    private val _items: MutableList<Any> = mutableListOf()

    public fun items(vararg items: Any) {
        _items.addAll(listOf(*items))
    }

    public fun items(items: Collection<Any>) {
        _items.addAll(items)
    }

    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    public fun quantity(quantity: Number) {
        cdkBuilder.quantity(quantity)
    }

    public fun build(): CfnDistribution.OriginGroupsProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
