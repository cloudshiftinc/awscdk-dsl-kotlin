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

package cloudshift.awscdk.dsl.services.ssmincidents

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmincidents.CfnReplicationSetProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReplicationSetPropsDsl {
    private val cdkBuilder: CfnReplicationSetProps.Builder = CfnReplicationSetProps.builder()

    private val _regions: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun deletionProtected(deletionProtected: Boolean) {
        cdkBuilder.deletionProtected(deletionProtected)
    }

    public fun deletionProtected(deletionProtected: IResolvable) {
        cdkBuilder.deletionProtected(deletionProtected)
    }

    public fun regions(vararg regions: Any) {
        _regions.addAll(listOf(*regions))
    }

    public fun regions(regions: Collection<Any>) {
        _regions.addAll(regions)
    }

    public fun regions(regions: IResolvable) {
        cdkBuilder.regions(regions)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnReplicationSetProps {
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
