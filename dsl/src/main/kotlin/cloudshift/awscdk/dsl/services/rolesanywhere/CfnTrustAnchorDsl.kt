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

package cloudshift.awscdk.dsl.services.rolesanywhere

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rolesanywhere.CfnTrustAnchor
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTrustAnchorDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTrustAnchor.Builder = CfnTrustAnchor.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    public fun source(source: CfnTrustAnchor.SourceProperty) {
        cdkBuilder.source(source)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTrustAnchor {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
