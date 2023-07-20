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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateDataPathSortPropertyDsl {
    private val cdkBuilder: CfnTemplate.DataPathSortProperty.Builder =
        CfnTemplate.DataPathSortProperty.builder()

    private val _sortPaths: MutableList<Any> = mutableListOf()

    public fun direction(direction: String) {
        cdkBuilder.direction(direction)
    }

    public fun sortPaths(vararg sortPaths: Any) {
        _sortPaths.addAll(listOf(*sortPaths))
    }

    public fun sortPaths(sortPaths: Collection<Any>) {
        _sortPaths.addAll(sortPaths)
    }

    public fun sortPaths(sortPaths: IResolvable) {
        cdkBuilder.sortPaths(sortPaths)
    }

    public fun build(): CfnTemplate.DataPathSortProperty {
        if (_sortPaths.isNotEmpty()) cdkBuilder.sortPaths(_sortPaths)
        return cdkBuilder.build()
    }
}
