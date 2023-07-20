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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNetworkInsightsAccessScopeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNetworkInsightsAccessScope.Builder =
        CfnNetworkInsightsAccessScope.Builder.create(scope, id)

    private val _excludePaths: MutableList<Any> = mutableListOf()

    private val _matchPaths: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun excludePaths(vararg excludePaths: Any) {
        _excludePaths.addAll(listOf(*excludePaths))
    }

    public fun excludePaths(excludePaths: Collection<Any>) {
        _excludePaths.addAll(excludePaths)
    }

    public fun excludePaths(excludePaths: IResolvable) {
        cdkBuilder.excludePaths(excludePaths)
    }

    public fun matchPaths(vararg matchPaths: Any) {
        _matchPaths.addAll(listOf(*matchPaths))
    }

    public fun matchPaths(matchPaths: Collection<Any>) {
        _matchPaths.addAll(matchPaths)
    }

    public fun matchPaths(matchPaths: IResolvable) {
        cdkBuilder.matchPaths(matchPaths)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNetworkInsightsAccessScope {
        if (_excludePaths.isNotEmpty()) cdkBuilder.excludePaths(_excludePaths)
        if (_matchPaths.isNotEmpty()) cdkBuilder.matchPaths(_matchPaths)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
