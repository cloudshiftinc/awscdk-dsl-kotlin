@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The field wells for a pivot table visual.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottablefieldwells.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableFieldWellsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableFieldWellsProperty.Builder =
        CfnDashboard.PivotTableFieldWellsProperty.builder()

    /** @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table. */
    public fun pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells: IResolvable) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    /** @param pivotTableAggregatedFieldWells The aggregated field well for the pivot table. */
    public fun pivotTableAggregatedFieldWells(
        pivotTableAggregatedFieldWells: CfnDashboard.PivotTableAggregatedFieldWellsProperty
    ) {
        cdkBuilder.pivotTableAggregatedFieldWells(pivotTableAggregatedFieldWells)
    }

    public fun build(): CfnDashboard.PivotTableFieldWellsProperty = cdkBuilder.build()
}
