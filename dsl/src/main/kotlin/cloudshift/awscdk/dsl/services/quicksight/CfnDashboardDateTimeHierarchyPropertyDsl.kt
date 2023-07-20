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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardDateTimeHierarchyPropertyDsl {
    private val cdkBuilder: CfnDashboard.DateTimeHierarchyProperty.Builder =
        CfnDashboard.DateTimeHierarchyProperty.builder()

    private val _drillDownFilters: MutableList<Any> = mutableListOf()

    public fun drillDownFilters(vararg drillDownFilters: Any) {
        _drillDownFilters.addAll(listOf(*drillDownFilters))
    }

    public fun drillDownFilters(drillDownFilters: Collection<Any>) {
        _drillDownFilters.addAll(drillDownFilters)
    }

    public fun drillDownFilters(drillDownFilters: IResolvable) {
        cdkBuilder.drillDownFilters(drillDownFilters)
    }

    public fun hierarchyId(hierarchyId: String) {
        cdkBuilder.hierarchyId(hierarchyId)
    }

    public fun build(): CfnDashboard.DateTimeHierarchyProperty {
        if (_drillDownFilters.isNotEmpty()) cdkBuilder.drillDownFilters(_drillDownFilters)
        return cdkBuilder.build()
    }
}
