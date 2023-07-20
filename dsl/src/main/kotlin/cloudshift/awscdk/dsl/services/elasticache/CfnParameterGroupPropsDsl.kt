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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnParameterGroupProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnParameterGroupPropsDsl {
    private val cdkBuilder: CfnParameterGroupProps.Builder = CfnParameterGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun cacheParameterGroupFamily(cacheParameterGroupFamily: String) {
        cdkBuilder.cacheParameterGroupFamily(cacheParameterGroupFamily)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun properties(properties: Map<String, String>) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnParameterGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
