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
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnKeyGroupKeyGroupConfigPropertyDsl {
    private val cdkBuilder: CfnKeyGroup.KeyGroupConfigProperty.Builder =
        CfnKeyGroup.KeyGroupConfigProperty.builder()

    private val _items: MutableList<String> = mutableListOf()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun items(vararg items: String) {
        _items.addAll(listOf(*items))
    }

    public fun items(items: Collection<String>) {
        _items.addAll(items)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnKeyGroup.KeyGroupConfigProperty {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
