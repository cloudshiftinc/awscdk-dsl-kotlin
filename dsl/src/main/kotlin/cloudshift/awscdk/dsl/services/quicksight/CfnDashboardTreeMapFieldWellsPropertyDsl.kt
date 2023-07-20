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

@CdkDslMarker
public class CfnDashboardTreeMapFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TreeMapFieldWellsProperty.Builder =
        CfnDashboard.TreeMapFieldWellsProperty.builder()

    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: IResolvable) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun treeMapAggregatedFieldWells(treeMapAggregatedFieldWells: CfnDashboard.TreeMapAggregatedFieldWellsProperty) {
        cdkBuilder.treeMapAggregatedFieldWells(treeMapAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.TreeMapFieldWellsProperty = cdkBuilder.build()
}
