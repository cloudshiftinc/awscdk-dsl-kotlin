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
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardWordCloudAggregatedFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.WordCloudAggregatedFieldWellsProperty.Builder =
        CfnDashboard.WordCloudAggregatedFieldWellsProperty.builder()

    private val _groupBy: MutableList<Any> = mutableListOf()

    private val _size: MutableList<Any> = mutableListOf()

    public fun groupBy(vararg groupBy: Any) {
        _groupBy.addAll(listOf(*groupBy))
    }

    public fun groupBy(groupBy: Collection<Any>) {
        _groupBy.addAll(groupBy)
    }

    public fun groupBy(groupBy: IResolvable) {
        cdkBuilder.groupBy(groupBy)
    }

    public fun size(vararg size: Any) {
        _size.addAll(listOf(*size))
    }

    public fun size(size: Collection<Any>) {
        _size.addAll(size)
    }

    public fun size(size: IResolvable) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnDashboard.WordCloudAggregatedFieldWellsProperty {
        if (_groupBy.isNotEmpty()) cdkBuilder.groupBy(_groupBy)
        if (_size.isNotEmpty()) cdkBuilder.size(_size)
        return cdkBuilder.build()
    }
}
