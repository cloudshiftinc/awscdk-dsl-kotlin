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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.networkmanager.CfnCoreNetworkProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCoreNetworkPropsDsl {
    private val cdkBuilder: CfnCoreNetworkProps.Builder = CfnCoreNetworkProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    public fun policyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.policyDocument(builder.map)
    }

    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCoreNetworkProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
