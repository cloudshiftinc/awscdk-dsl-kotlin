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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPublicRepositoryPropsDsl {
    private val cdkBuilder: CfnPublicRepositoryProps.Builder = CfnPublicRepositoryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun repositoryCatalogData(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.repositoryCatalogData(builder.map)
    }

    public fun repositoryCatalogData(repositoryCatalogData: Any) {
        cdkBuilder.repositoryCatalogData(repositoryCatalogData)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun repositoryPolicyText(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.repositoryPolicyText(builder.map)
    }

    public fun repositoryPolicyText(repositoryPolicyText: Any) {
        cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPublicRepositoryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
