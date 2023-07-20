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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.config.CfnStoredQueryProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStoredQueryPropsDsl {
    private val cdkBuilder: CfnStoredQueryProps.Builder = CfnStoredQueryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun queryDescription(queryDescription: String) {
        cdkBuilder.queryDescription(queryDescription)
    }

    public fun queryExpression(queryExpression: String) {
        cdkBuilder.queryExpression(queryExpression)
    }

    public fun queryName(queryName: String) {
        cdkBuilder.queryName(queryName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStoredQueryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
